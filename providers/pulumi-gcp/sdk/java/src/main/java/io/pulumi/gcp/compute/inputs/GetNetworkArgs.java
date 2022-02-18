// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    /**
     * The name of the network.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNetworkArgs(
        String name,
        @Nullable String project) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
    }

    private GetNetworkArgs() {
        this.name = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetNetworkArgs build() {
            return new GetNetworkArgs(name, project);
        }
    }
}
