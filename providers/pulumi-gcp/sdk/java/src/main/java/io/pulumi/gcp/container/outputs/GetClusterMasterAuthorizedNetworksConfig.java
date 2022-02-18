// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.GetClusterMasterAuthorizedNetworksConfigCidrBlock;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetClusterMasterAuthorizedNetworksConfig {
    private final List<GetClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;

    @OutputCustomType.Constructor({"cidrBlocks"})
    private GetClusterMasterAuthorizedNetworksConfig(List<GetClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
        this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
    }

    public List<GetClusterMasterAuthorizedNetworksConfigCidrBlock> getCidrBlocks() {
        return this.cidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMasterAuthorizedNetworksConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMasterAuthorizedNetworksConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
        }

        public Builder setCidrBlocks(List<GetClusterMasterAuthorizedNetworksConfigCidrBlock> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public GetClusterMasterAuthorizedNetworksConfig build() {
            return new GetClusterMasterAuthorizedNetworksConfig(cidrBlocks);
        }
    }
}
