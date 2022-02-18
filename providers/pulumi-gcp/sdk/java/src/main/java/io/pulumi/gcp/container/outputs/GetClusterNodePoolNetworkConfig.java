// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolNetworkConfig {
    private final Boolean createPodRange;
    private final String podIpv4CidrBlock;
    private final String podRange;

    @OutputCustomType.Constructor({"createPodRange","podIpv4CidrBlock","podRange"})
    private GetClusterNodePoolNetworkConfig(
        Boolean createPodRange,
        String podIpv4CidrBlock,
        String podRange) {
        this.createPodRange = Objects.requireNonNull(createPodRange);
        this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock);
        this.podRange = Objects.requireNonNull(podRange);
    }

    public Boolean getCreatePodRange() {
        return this.createPodRange;
    }
    public String getPodIpv4CidrBlock() {
        return this.podIpv4CidrBlock;
    }
    public String getPodRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean createPodRange;
        private String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder setCreatePodRange(Boolean createPodRange) {
            this.createPodRange = Objects.requireNonNull(createPodRange);
            return this;
        }

        public Builder setPodIpv4CidrBlock(String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = Objects.requireNonNull(podIpv4CidrBlock);
            return this;
        }

        public Builder setPodRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }

        public GetClusterNodePoolNetworkConfig build() {
            return new GetClusterNodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
