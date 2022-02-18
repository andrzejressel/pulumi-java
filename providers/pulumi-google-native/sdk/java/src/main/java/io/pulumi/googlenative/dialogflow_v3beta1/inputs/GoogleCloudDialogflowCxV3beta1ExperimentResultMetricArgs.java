// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType;
import io.pulumi.googlenative.dialogflow_v3beta1.enums.GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metric and corresponding confidence intervals.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs Empty = new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs();

    /**
     * The probability that the treatment is better than all other treatments in the experiment
     * 
     */
    @InputImport(name="confidenceInterval")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs> confidenceInterval;

    public Input<GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs> getConfidenceInterval() {
        return this.confidenceInterval == null ? Input.empty() : this.confidenceInterval;
    }

    /**
     * Count value of a metric.
     * 
     */
    @InputImport(name="count")
    private final @Nullable Input<Double> count;

    public Input<Double> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Count-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @InputImport(name="countType")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType> countType;

    public Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType> getCountType() {
        return this.countType == null ? Input.empty() : this.countType;
    }

    /**
     * Ratio value of a metric.
     * 
     */
    @InputImport(name="ratio")
    private final @Nullable Input<Double> ratio;

    public Input<Double> getRatio() {
        return this.ratio == null ? Input.empty() : this.ratio;
    }

    /**
     * Ratio-based metric type. Only one of type or count_type is specified in each Metric.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType> type;

    public Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs> confidenceInterval,
        @Nullable Input<Double> count,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType> countType,
        @Nullable Input<Double> ratio,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType> type) {
        this.confidenceInterval = confidenceInterval;
        this.count = count;
        this.countType = countType;
        this.ratio = ratio;
        this.type = type;
    }

    private GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs() {
        this.confidenceInterval = Input.empty();
        this.count = Input.empty();
        this.countType = Input.empty();
        this.ratio = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs> confidenceInterval;
        private @Nullable Input<Double> count;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType> countType;
        private @Nullable Input<Double> ratio;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceInterval = defaults.confidenceInterval;
    	      this.count = defaults.count;
    	      this.countType = defaults.countType;
    	      this.ratio = defaults.ratio;
    	      this.type = defaults.type;
        }

        public Builder setConfidenceInterval(@Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs> confidenceInterval) {
            this.confidenceInterval = confidenceInterval;
            return this;
        }

        public Builder setConfidenceInterval(@Nullable GoogleCloudDialogflowCxV3beta1ExperimentResultConfidenceIntervalArgs confidenceInterval) {
            this.confidenceInterval = Input.ofNullable(confidenceInterval);
            return this;
        }

        public Builder setCount(@Nullable Input<Double> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Double count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setCountType(@Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType> countType) {
            this.countType = countType;
            return this;
        }

        public Builder setCountType(@Nullable GoogleCloudDialogflowCxV3beta1ExperimentResultMetricCountType countType) {
            this.countType = Input.ofNullable(countType);
            return this;
        }

        public Builder setRatio(@Nullable Input<Double> ratio) {
            this.ratio = ratio;
            return this;
        }

        public Builder setRatio(@Nullable Double ratio) {
            this.ratio = Input.ofNullable(ratio);
            return this;
        }

        public Builder setType(@Nullable Input<GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable GoogleCloudDialogflowCxV3beta1ExperimentResultMetricType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentResultMetricArgs(confidenceInterval, count, countType, ratio, type);
        }
    }
}
