// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.LogMetricTriggerResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TriggerConditionResponse {
    /**
     * Trigger condition for metric query rule
     * 
     */
    private final @Nullable LogMetricTriggerResponse metricTrigger;
    /**
     * Result or count threshold based on which rule should be triggered.
     * 
     */
    private final Double threshold;
    /**
     * Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     * 
     */
    private final String thresholdOperator;

    @OutputCustomType.Constructor
    private TriggerConditionResponse(
        @OutputCustomType.Parameter("metricTrigger") @Nullable LogMetricTriggerResponse metricTrigger,
        @OutputCustomType.Parameter("threshold") Double threshold,
        @OutputCustomType.Parameter("thresholdOperator") String thresholdOperator) {
        this.metricTrigger = metricTrigger;
        this.threshold = threshold;
        this.thresholdOperator = thresholdOperator;
    }

    /**
     * Trigger condition for metric query rule
     * 
    */
    public Optional<LogMetricTriggerResponse> getMetricTrigger() {
        return Optional.ofNullable(this.metricTrigger);
    }
    /**
     * Result or count threshold based on which rule should be triggered.
     * 
    */
    public Double getThreshold() {
        return this.threshold;
    }
    /**
     * Evaluation operation for rule - 'GreaterThan' or 'LessThan.
     * 
    */
    public String getThresholdOperator() {
        return this.thresholdOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LogMetricTriggerResponse metricTrigger;
        private Double threshold;
        private String thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricTrigger = defaults.metricTrigger;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder setMetricTrigger(@Nullable LogMetricTriggerResponse metricTrigger) {
            this.metricTrigger = metricTrigger;
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThresholdOperator(String thresholdOperator) {
            this.thresholdOperator = Objects.requireNonNull(thresholdOperator);
            return this;
        }
        public TriggerConditionResponse build() {
            return new TriggerConditionResponse(metricTrigger, threshold, thresholdOperator);
        }
    }
}
