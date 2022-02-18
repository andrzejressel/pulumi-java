// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.ManualShardingResponse;
import io.pulumi.googlenative.testing_v1.inputs.UniformShardingResponse;
import java.util.Objects;


/**
 * Options for enabling sharding.
 * 
 */
public final class ShardingOptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShardingOptionResponse Empty = new ShardingOptionResponse();

    /**
     * Shards test cases into the specified groups of packages, classes, and/or methods.
     * 
     */
    @InputImport(name="manualSharding", required=true)
    private final ManualShardingResponse manualSharding;

    public ManualShardingResponse getManualSharding() {
        return this.manualSharding;
    }

    /**
     * Uniformly shards test cases given a total number of shards.
     * 
     */
    @InputImport(name="uniformSharding", required=true)
    private final UniformShardingResponse uniformSharding;

    public UniformShardingResponse getUniformSharding() {
        return this.uniformSharding;
    }

    public ShardingOptionResponse(
        ManualShardingResponse manualSharding,
        UniformShardingResponse uniformSharding) {
        this.manualSharding = Objects.requireNonNull(manualSharding, "expected parameter 'manualSharding' to be non-null");
        this.uniformSharding = Objects.requireNonNull(uniformSharding, "expected parameter 'uniformSharding' to be non-null");
    }

    private ShardingOptionResponse() {
        this.manualSharding = null;
        this.uniformSharding = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShardingOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManualShardingResponse manualSharding;
        private UniformShardingResponse uniformSharding;

        public Builder() {
    	      // Empty
        }

        public Builder(ShardingOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualSharding = defaults.manualSharding;
    	      this.uniformSharding = defaults.uniformSharding;
        }

        public Builder setManualSharding(ManualShardingResponse manualSharding) {
            this.manualSharding = Objects.requireNonNull(manualSharding);
            return this;
        }

        public Builder setUniformSharding(UniformShardingResponse uniformSharding) {
            this.uniformSharding = Objects.requireNonNull(uniformSharding);
            return this;
        }

        public ShardingOptionResponse build() {
            return new ShardingOptionResponse(manualSharding, uniformSharding);
        }
    }
}
