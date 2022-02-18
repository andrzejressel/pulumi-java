// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vpcaccess.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorSubnet {
    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    private final @Nullable String name;
    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    private final @Nullable String projectId;

    @OutputCustomType.Constructor({"name","projectId"})
    private ConnectorSubnet(
        @Nullable String name,
        @Nullable String projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorSubnet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }

        public ConnectorSubnet build() {
            return new ConnectorSubnet(name, projectId);
        }
    }
}
