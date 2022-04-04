package io.pulumi.resources;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.pulumi.Stack.StackInternal;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.Urn;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.internal.Constants;
import io.pulumi.core.internal.Internal.InternalField;
import io.pulumi.core.internal.Strings;
import io.pulumi.core.internal.annotations.InternalUse;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.internal.DeploymentInternal;
import io.pulumi.exceptions.ResourceException;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.*;
import java.util.concurrent.CompletableFuture;

import static io.pulumi.core.internal.Objects.exceptionSupplier;
import static io.pulumi.core.internal.Objects.require;
import static io.pulumi.resources.Resources.copyNullableList;
import static java.util.Objects.requireNonNull;

/**
 * Resource represents a class whose CRUD operations are implemented by a provider plugin.
 */
@ParametersAreNonnullByDefault
public abstract class Resource {

    private final CompletableFuture<Output<String>> urnFuture = new CompletableFuture<>();

    @Export(name = Constants.UrnPropertyName, type = String.class)
    private final Output<String> urn = Output.of(urnFuture).apply(urn -> urn);

    private final String type;
    private final String name;

    /**
     * When set to true, protect ensures this resource cannot be deleted.
     */
    private final boolean protect;

    private final List<ResourceTransformation> transformations;

    private final List<Output<String>> aliases;

    private final Map<String, ProviderResource> providers;

    protected final Set<Resource> childResources = Collections.synchronizedSet(new HashSet<>());

    protected final boolean remote;

    @Nullable
    private final ProviderResource provider;

    @Nullable
    private final String version;

    @SuppressWarnings({"unused", "FieldCanBeLocal"})
    @InternalField
    private final ResourceInternal internal = new ResourceInternal(this);

    /**
     * @see Resource#Resource(String, String, boolean, ResourceArgs, ResourceOptions, boolean, boolean)
     */
    protected Resource(String type, String name, boolean custom,
                       ResourceArgs args, ResourceOptions options) {
        this(type, name, custom, args, options, false, false);
    }

    /**
     * Creates and registers a new resource object. The "type" is the fully qualified type token
     * and "name" is the "name" part to of a stable and globally unique URN for the object,
     * "dependsOn" is an optional list of other resources that this resource depends on,
     * controlling the order in which we perform resource operations.
     *
     * @param type       the type of the resource
     * @param name       the unique name of the resource
     * @param custom     true to indicate that this is a custom resource, managed by a plugin
     * @param args       the arguments to use to populate the new resource
     * @param options    a bag of options that control this resource's behavior
     * @param remote     true if this is a remote component resource
     * @param dependency true if this is a synthetic resource used internally for dependency tracking
     */
    protected Resource(
            String type, String name, boolean custom,
            ResourceArgs args, ResourceOptions options,
            boolean remote, boolean dependency
    ) {
        this.superInit(this);
        this.remote = remote;

        if (dependency) {
            // this.urn will be set using setter in the subtype constructor after this supertype constructor finishes
            this.type = "";
            this.name = "";
            this.protect = false;
            this.transformations = List.of();
            this.aliases = List.of();
            this.providers = Map.of();
            this.provider = null;
            this.version = null;
            return;
        }

        var exceptionSupplier = exceptionSupplier(
                () -> new ResourceException(this),
                (String msg) -> new ResourceException(msg, this)
        );
        this.type = require(Strings::isNonEmptyOrNull, type,
                () -> "expected a resource type, got empty or null",
                exceptionSupplier
        );
        this.name = require(Strings::isNonEmptyOrNull, name,
                () -> "expected a resource name, got empty or null",
                exceptionSupplier
        );

        // Before anything else - if there are transformations registered, invoke them in order
        // to transform the properties and options assigned to this resource.
        var parent = Objects.equals(type, StackInternal.RootPulumiStackTypeName)
                ? null
                : (options.parent == null ? DeploymentInternal.getInstance().getStack() : options.parent);

        var transformations = new ArrayList<>(options.getResourceTransformations());
        if (parent != null) {
            transformations.addAll(parent.transformations);
        }
        this.transformations = List.copyOf(transformations);

        for (var transformation : transformations) {
            var tres = transformation.apply(
                    new ResourceTransformation.Args(this, args, options)
            );
            if (tres.isPresent()) {
                if (tres.get().getOptions().parent != options.parent) {
                    // This is currently not allowed because the parent tree is needed to
                    // establish what transformation to apply in the first place, and to compute
                    // inheritance of other resource options in the Resource constructor before
                    // transformations are run (so modifying it here would only even partially
                    // take effect).
                    // It's theoretically possible this restriction could be
                    // lifted in the future, but for now just disallow re-parenting resources in
                    // transformations to be safe.
                    throw new IllegalArgumentException("Transformations cannot currently be used to change the 'parent' of a resource.");
                }

                args = tres.get().getArgs();
                options = tres.get().getOptions();
            }
        }

        // Make a shallow clone of options to ensure we don't modify the value passed in.

        @Nullable
        var componentOpts = options instanceof ComponentResourceOptions
                ? ((ComponentResourceOptions) options).copy()
                : null;
        @Nullable
        var customOpts = options instanceof CustomResourceOptions
                ? ((CustomResourceOptions) options).copy()
                : null;

        if (options.provider != null
                && componentOpts != null
                && componentOpts.getProviders().size() > 0) {
            throw new ResourceException("Do not supply both 'provider' and 'providers' options to a ComponentResource.", options.parent);
        }

        // Check the parent type if one exists and fill in any default options.
        var thisProviders = new HashMap<String, ProviderResource>();

        if (options.parent != null) {
            var parentResource = options.parent;
            // the 'childResources' is a Synchronized Collection, so this is safe operation
            parentResource.childResources.add(this);

            options.protect = options.protect || options.parent.protect; // TODO: is this logic good?

            // Make a copy of the aliases array, and add to it any implicit aliases inherited from its parent
            options.aliases = options.aliases == null ? new ArrayList<>() : copyNullableList(options.aliases);
            for (var parentAlias : options.parent.aliases) {
                options.aliases.add(
                        urnInheritedChildAlias(this.name, options.parent.getResourceName(), parentAlias, this.type)
                );
            }

            thisProviders.putAll(options.parent.providers);
        }

        // TODO: most of this logic is avoidable by just removing the 'provider' and using 'providers' instead
        if (custom) {
            var provider = customOpts == null ? null : customOpts.provider;
            if (provider == null) {
                if (options.parent != null) {
                    // If no provider was given, but we have a parent, then inherit the provider from our parent.
                    options.provider = ResourceInternal.getProvider(options.parent, this.type);
                }
            } else {
                // If a provider was specified, add it to the providers map under this type's package so that
                // any children of this resource inherit its provider.
                var typeComponents = this.type.split(":");
                if (typeComponents.length == 3) {
                    var pkg = typeComponents[0];
                    thisProviders.put(pkg, provider);
                }
                // TODO: why do we silently ignore invalid type?
            }
        } else {
            // Note: we've checked above that at most one of options.provider or options.providers is set.

            // If options.provider is set, treat that as if we were given a array of provider
            // with that single value in it. Otherwise, take the array of providers, convert it
            // to a map and combine with any providers we've already set from our parent.
            var providerList = options.provider != null
                    ? List.of(options.provider)
                    : componentOpts == null ? null : componentOpts.getProviders();

            thisProviders.putAll(convertToProvidersMap(providerList));
        }

        this.protect = options.protect;
        this.provider = custom ? options.provider : null;
        this.version = options.version;

        this.providers = Map.copyOf(thisProviders);

        // Collapse any Aliases down to URNs. We have to wait until this point to do so
        // because we do not know the default 'name' and 'type' to apply until we are inside the
        // resource constructor.
        var aliases = ImmutableList.<Output<String>>builder();
        for (var alias : options.getAliases()) {
            aliases.add(collapseAliasToUrn(alias, name, type, options.parent));
        }
        this.aliases = aliases.build();

        // Finish initialisation with reflection asynchronously
        DeploymentInternal.getInstance().readOrRegisterResource(this, remote, DependencyResource::new, args, options);
    }

    /**
     * Initialization method called at the beginning of the constructor
     */
    protected void superInit(Resource resource) {
        // Empty
    }

    /**
     * The type assigned to the resource at construction.
     */
    public String getResourceType() {
        return type;
    }

    /**
     * The name assigned to the resource at construction.
     */
    public String getResourceName() {
        return name;
    }

    /**
     * The child resources of this resource. We use these (only from a @see {@link ComponentResource}) to
     * allow code to "dependOn" a @see {@link ComponentResource} and have that effectively mean that it is
     * depending on all the @see {@link ComponentResource} children of that component.
     * <p>
     * Important! We only walk through @see {@link ComponentResource}s. They're the only resources that
     * serve as an aggregation of other primitive (i.e.custom) resources.
     * While a custom resource can be a parent of other resources, we don't want to ever depend
     * on those child resource.
     * If we do, it's simple to end up in a situation where we end up depending on a
     * child resource that has a data cycle dependency due to the data passed into it.
     * This would be pretty nonsensical as there is zero need for a custom resource to
     * ever need to reference the urn of a component resource.
     * So it's acceptable if that sort of pattern failed in practice.
     */
    public Set<Resource> getChildResources() {
        return childResources;
    }

    /**
     * Urn is the stable logical URN used to distinctly address a resource, both before and after deployments.
     */
    public Output<String> getUrn() {
        return this.urn;
    }

    @InternalUse
    public void setUrn(@Nullable Output<String> urn) {
        if (!this.urnFuture.complete(urn)) {
            throw new IllegalStateException("urn cannot be set twice, must be null for setUrn to work");
        }
    }

    private static ImmutableMap<String, ProviderResource> convertToProvidersMap(@Nullable List<ProviderResource> providers) {
        var result = ImmutableMap.<String, ProviderResource>builder();
        if (providers != null) {
            for (var provider : providers) {
                var pkg = io.pulumi.core.internal.Internal.from(provider, ProviderResource.ProviderResourceInternal.class).getPackage();
                result.put(pkg, provider);
            }
        }

        return result.build();
    }

    private static Output<String> collapseAliasToUrn(
            Output<Alias> alias,
            String defaultName,
            String defaultType,
            @Nullable Resource defaultParent
    ) {
        return alias.apply(a -> {
            if (a.getUrn().isPresent()) {
                return Output.of(a.getUrn().get());
            }

            var name = a.getName().orElse(Output.of(defaultName));
            var type = a.getType().orElse(Output.of(defaultType));
            var project = a.getProject().orElse(Output.of(Deployment.getInstance().getProjectName()));
            var stack = a.getStack().orElse(Output.of(Deployment.getInstance().getStackName()));


            var parentCount =
                    (a.getParent().isPresent() ? 1 : 0) +
                            (a.getParentUrn().isPresent() ? 1 : 0) +
                            (a.hasNoParent() ? 1 : 0);
            // TODO: we could probably move this to regression tests of Alias
            if (parentCount >= 2) {
                throw new IllegalArgumentException(
                        "Only specify one of 'Alias#parent', 'Alias#parentUrn' or 'Alias#noParent' in an 'Alias'");
            }

            var parentInfo = getParentInfo(defaultParent, a);

            return Urn.create(name, type, parentInfo.parent, parentInfo.parentUrn, project, stack);
        });
    }

    private static class ParentInfo {
        @Nullable
        public final Resource parent;
        @Nullable
        public final Output<String> parentUrn;

        private ParentInfo(@Nullable Resource parent, @Nullable Output<String> parentUrn) {
            this.parent = parent;
            this.parentUrn = parentUrn;
        }
    }

    private static ParentInfo getParentInfo(@Nullable Resource defaultParent, Alias alias) {
        requireNonNull(alias);
        if (alias.getParent().isPresent())
            return new ParentInfo(alias.getParent().get(), null);

        if (alias.getParentUrn().isPresent())
            return new ParentInfo(null, alias.getParentUrn().get());

        if (alias.hasNoParent())
            return new ParentInfo(null, null);

        return new ParentInfo(defaultParent, null);
    }

    /**
     * Computes the alias that should be applied to a child
     * based on an alias applied to it's parent. This may involve changing the name of the
     * resource in cases where the resource has a named derived from the name of the parent,
     * and the parent name changed.
     */
    private static Output<Alias> urnInheritedChildAlias(
            String childName, String parentName, Output<String> parentAlias, String childType
    ) {
        Objects.requireNonNull(childName);
        Objects.requireNonNull(parentName);
        Objects.requireNonNull(parentAlias);
        Objects.requireNonNull(childType);

        // If the child name has the parent name as a prefix, then we make the assumption that
        // it was constructed from the convention of using '{name}-details' as the name of the
        // child resource.  To ensure this is aliased correctly, we must then also replace the
        // parent aliases name in the prefix of the child resource name.
        //
        // For example:
        // * name: "newapp-function"
        // * options.parent.__name: "newapp"
        // * parentAlias: "urn:pulumi:stackname::projectname::awsx:ec2:Vpc::app"
        // * parentAliasName: "app"
        // * aliasName: "app-function"
        // * childAlias: "urn:pulumi:stackname::projectname::aws:s3/bucket:Bucket::app-function"
        var aliasName = Output.of(childName);
        if (childName.startsWith(parentName)) {
            aliasName = parentAlias.applyValue(
                    (String parentAliasUrn) -> parentAliasUrn.substring(
                            parentAliasUrn.lastIndexOf("::") + 2) + childName.substring(parentName.length()));
        }

        var urn = Urn.create(
                aliasName, Output.of(childType), null, parentAlias, null, null);

        return urn.applyValue(Alias::withUrn);
    }

    @InternalUse
    @ParametersAreNonnullByDefault
    public static class ResourceInternal {

        protected final Resource resource;

        protected ResourceInternal(Resource resource) {
            this.resource = requireNonNull(resource);
        }

        /**
         * A list of aliases applied to this resource.
         */
        @InternalUse
        public List<Output<String>> getAliases() {
            return resource.aliases;
        }

        @InternalUse
        public boolean getRemote() {
            return resource.remote;
        }

        /**
         * The specified provider or provider determined from the parent for custom resources.
         */
        @InternalUse
        public Optional<ProviderResource> getProvider() {
            return Optional.ofNullable(resource.provider);
        }

        /**
         * Fetches the provider for the given module member, if any.
         */
        @InternalUse
        public Optional<ProviderResource> getProvider(String moduleMember) {
            return Optional.ofNullable(getProvider(resource, moduleMember));
        }

        /**
         * The specified provider version.
         */
        @InternalUse
        public Optional<String> getVersion() {
            return Optional.ofNullable(resource.version);
        }

        /**
         * Fetches the provider for the given module member, if any.
         *
         * @param moduleMember the module member to look for
         * @return the @see {@link ProviderResource} or empty if not found
         */
        @Nullable
        @InternalUse
        static public ProviderResource getProvider(Resource resource, String moduleMember) {
            var memComponents = moduleMember.split(":");
            if (memComponents.length != 3) {
                // TODO: why do we silently ignore invalid type?
                return null;
            }

            return resource.providers.getOrDefault(memComponents[0], null);
        }
    }

    protected interface LazyInitialization {
        void lazy(Resource resource);

        default void runLazy(Resource resource) {
            if (this.getClass().isAssignableFrom(resource.getClass())) {
                lazy(resource);
            } else {
                throw new IllegalStateException(String.format(
                        "Expected 'this' to have type '%s', got: '%s'",
                        resource.getClass().getTypeName(),
                        this.getClass().getTypeName()
                ));
            }
        }
    }
}
