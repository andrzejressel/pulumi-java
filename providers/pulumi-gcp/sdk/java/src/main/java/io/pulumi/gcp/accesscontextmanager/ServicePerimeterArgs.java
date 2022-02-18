// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @InputImport(name="parent", required=true)
    private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    @InputImport(name="perimeterType")
    private final @Nullable Input<String> perimeterType;

    public Input<String> getPerimeterType() {
        return this.perimeterType == null ? Input.empty() : this.perimeterType;
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="spec")
    private final @Nullable Input<ServicePerimeterSpecArgs> spec;

    public Input<ServicePerimeterSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<ServicePerimeterStatusArgs> status;

    public Input<ServicePerimeterStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration ("spec") to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config ("status") without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @InputImport(name="useExplicitDryRunSpec")
    private final @Nullable Input<Boolean> useExplicitDryRunSpec;

    public Input<Boolean> getUseExplicitDryRunSpec() {
        return this.useExplicitDryRunSpec == null ? Input.empty() : this.useExplicitDryRunSpec;
    }

    public ServicePerimeterArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> parent,
        @Nullable Input<String> perimeterType,
        @Nullable Input<ServicePerimeterSpecArgs> spec,
        @Nullable Input<ServicePerimeterStatusArgs> status,
        Input<String> title,
        @Nullable Input<Boolean> useExplicitDryRunSpec) {
        this.description = description;
        this.name = name;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.perimeterType = perimeterType;
        this.spec = spec;
        this.status = status;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.useExplicitDryRunSpec = useExplicitDryRunSpec;
    }

    private ServicePerimeterArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.perimeterType = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
        this.title = Input.empty();
        this.useExplicitDryRunSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> parent;
        private @Nullable Input<String> perimeterType;
        private @Nullable Input<ServicePerimeterSpecArgs> spec;
        private @Nullable Input<ServicePerimeterStatusArgs> status;
        private Input<String> title;
        private @Nullable Input<Boolean> useExplicitDryRunSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.perimeterType = defaults.perimeterType;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.useExplicitDryRunSpec = defaults.useExplicitDryRunSpec;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder setPerimeterType(@Nullable Input<String> perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }

        public Builder setPerimeterType(@Nullable String perimeterType) {
            this.perimeterType = Input.ofNullable(perimeterType);
            return this;
        }

        public Builder setSpec(@Nullable Input<ServicePerimeterSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable ServicePerimeterSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStatus(@Nullable Input<ServicePerimeterStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable ServicePerimeterStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }

        public Builder setUseExplicitDryRunSpec(@Nullable Input<Boolean> useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }

        public Builder setUseExplicitDryRunSpec(@Nullable Boolean useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = Input.ofNullable(useExplicitDryRunSpec);
            return this;
        }

        public ServicePerimeterArgs build() {
            return new ServicePerimeterArgs(description, name, parent, perimeterType, spec, status, title, useExplicitDryRunSpec);
        }
    }
}
