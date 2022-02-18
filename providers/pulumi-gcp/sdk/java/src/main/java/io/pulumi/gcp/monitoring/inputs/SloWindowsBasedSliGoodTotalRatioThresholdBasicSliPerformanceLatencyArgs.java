// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs();

    /**
     * A duration string, e.g. 10s.
     * Good service is defined to be the count of requests made to
     * this service that return in no more than threshold.
     * 
     */
    @InputImport(name="threshold", required=true)
    private final Input<String> threshold;

    public Input<String> getThreshold() {
        return this.threshold;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs(Input<String> threshold) {
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs() {
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        public Builder setThreshold(Input<String> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThreshold(String threshold) {
            this.threshold = Input.of(Objects.requireNonNull(threshold));
            return this;
        }

        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceLatencyArgs(threshold);
        }
    }
}
