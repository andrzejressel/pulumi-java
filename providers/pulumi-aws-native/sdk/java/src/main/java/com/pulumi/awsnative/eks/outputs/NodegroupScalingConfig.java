// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodegroupScalingConfig {
    private final @Nullable Integer desiredSize;
    private final @Nullable Integer maxSize;
    private final @Nullable Integer minSize;

    @CustomType.Constructor
    private NodegroupScalingConfig(
        @CustomType.Parameter("desiredSize") @Nullable Integer desiredSize,
        @CustomType.Parameter("maxSize") @Nullable Integer maxSize,
        @CustomType.Parameter("minSize") @Nullable Integer minSize) {
        this.desiredSize = desiredSize;
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    public Optional<Integer> desiredSize() {
        return Optional.ofNullable(this.desiredSize);
    }
    public Optional<Integer> maxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    public Optional<Integer> minSize() {
        return Optional.ofNullable(this.minSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodegroupScalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer desiredSize;
        private @Nullable Integer maxSize;
        private @Nullable Integer minSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NodegroupScalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredSize = defaults.desiredSize;
    	      this.maxSize = defaults.maxSize;
    	      this.minSize = defaults.minSize;
        }

        public Builder desiredSize(@Nullable Integer desiredSize) {
            this.desiredSize = desiredSize;
            return this;
        }
        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }        public NodegroupScalingConfig build() {
            return new NodegroupScalingConfig(desiredSize, maxSize, minSize);
        }
    }
}
