// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.AppArgs;
import io.pulumi.azurenative.appplatform.outputs.AppResourcePropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.ManagedIdentityPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * App resource payload
 * API Version: 2020-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appplatform:App myapp /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/apps/myapp 
 * ```
 * 
 */
@ResourceType(type="azure-native:appplatform:App")
public class App extends io.pulumi.resources.CustomResource {
    /**
     * The Managed Identity type of the app resource
     * 
     */
    @Export(name="identity", type=ManagedIdentityPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ManagedIdentityPropertiesResponse> identity;

    /**
     * @return The Managed Identity type of the app resource
     * 
     */
    public Output</* @Nullable */ ManagedIdentityPropertiesResponse> getIdentity() {
        return this.identity;
    }
    /**
     * The GEO location of the application, always the same with its parent resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The GEO location of the application, always the same with its parent resource
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the App resource
     * 
     */
    @Export(name="properties", type=AppResourcePropertiesResponse.class, parameters={})
    private Output<AppResourcePropertiesResponse> properties;

    /**
     * @return Properties of the App resource
     * 
     */
    public Output<AppResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(AppArgs.Builder a);
    }
    private static io.pulumi.azurenative.appplatform.AppArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.appplatform.AppArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public App(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private App(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appplatform:App", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:appplatform/v20190501preview:App").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20200701:App").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20201101preview:App").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20210601preview:App").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20210901preview:App").build()),
                Output.of(Alias.builder().type("azure-native:appplatform/v20220101preview:App").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static App get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}
