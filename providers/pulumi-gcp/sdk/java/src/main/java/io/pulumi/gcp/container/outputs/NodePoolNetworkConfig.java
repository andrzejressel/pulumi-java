// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodePoolNetworkConfig {
    private final @Nullable Boolean createPodRange;
    private final @Nullable String podIpv4CidrBlock;
    private final String podRange;

    @OutputCustomType.Constructor({"createPodRange","podIpv4CidrBlock","podRange"})
    private NodePoolNetworkConfig(
        @Nullable Boolean createPodRange,
        @Nullable String podIpv4CidrBlock,
        String podRange) {
        this.createPodRange = createPodRange;
        this.podIpv4CidrBlock = podIpv4CidrBlock;
        this.podRange = Objects.requireNonNull(podRange);
    }

    public Optional<Boolean> getCreatePodRange() {
        return Optional.ofNullable(this.createPodRange);
    }
    public Optional<String> getPodIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }
    public String getPodRange() {
        return this.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean createPodRange;
        private @Nullable String podIpv4CidrBlock;
        private String podRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createPodRange = defaults.createPodRange;
    	      this.podIpv4CidrBlock = defaults.podIpv4CidrBlock;
    	      this.podRange = defaults.podRange;
        }

        public Builder setCreatePodRange(@Nullable Boolean createPodRange) {
            this.createPodRange = createPodRange;
            return this;
        }

        public Builder setPodIpv4CidrBlock(@Nullable String podIpv4CidrBlock) {
            this.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }

        public Builder setPodRange(String podRange) {
            this.podRange = Objects.requireNonNull(podRange);
            return this;
        }

        public NodePoolNetworkConfig build() {
            return new NodePoolNetworkConfig(createPodRange, podIpv4CidrBlock, podRange);
        }
    }
}
