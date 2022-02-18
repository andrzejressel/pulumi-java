// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.LatencyPercentileResponse;
import java.util.List;
import java.util.Objects;


/**
 * Describes measured latency distribution.
 * 
 */
public final class LatencyDistributionResponse extends io.pulumi.resources.InvokeArgs {

    public static final LatencyDistributionResponse Empty = new LatencyDistributionResponse();

    /**
     * Representative latency percentiles.
     * 
     */
    @InputImport(name="latencyPercentiles", required=true)
    private final List<LatencyPercentileResponse> latencyPercentiles;

    public List<LatencyPercentileResponse> getLatencyPercentiles() {
        return this.latencyPercentiles;
    }

    public LatencyDistributionResponse(List<LatencyPercentileResponse> latencyPercentiles) {
        this.latencyPercentiles = Objects.requireNonNull(latencyPercentiles, "expected parameter 'latencyPercentiles' to be non-null");
    }

    private LatencyDistributionResponse() {
        this.latencyPercentiles = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatencyDistributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LatencyPercentileResponse> latencyPercentiles;

        public Builder() {
    	      // Empty
        }

        public Builder(LatencyDistributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latencyPercentiles = defaults.latencyPercentiles;
        }

        public Builder setLatencyPercentiles(List<LatencyPercentileResponse> latencyPercentiles) {
            this.latencyPercentiles = Objects.requireNonNull(latencyPercentiles);
            return this;
        }

        public LatencyDistributionResponse build() {
            return new LatencyDistributionResponse(latencyPercentiles);
        }
    }
}
