// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdAggregationArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdDenominatorAggregationArgs;
import io.pulumi.gcp.monitoring.inputs.AlertPolicyConditionConditionThresholdTriggerArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionThresholdArgs Empty = new AlertPolicyConditionConditionThresholdArgs();

    /**
     * Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    @InputImport(name="aggregations")
    private final @Nullable Input<List<AlertPolicyConditionConditionThresholdAggregationArgs>> aggregations;

    public Input<List<AlertPolicyConditionConditionThresholdAggregationArgs>> getAggregations() {
        return this.aggregations == null ? Input.empty() : this.aggregations;
    }

    /**
     * The comparison to apply between the time
     * series (indicated by filter and aggregation)
     * and the threshold (indicated by
     * threshold_value). The comparison is applied
     * on each time series, with the time series on
     * the left-hand side and the threshold on the
     * right-hand side. Only COMPARISON_LT and
     * COMPARISON_GT are supported currently.
     * Possible values are `COMPARISON_GT`, `COMPARISON_GE`, `COMPARISON_LT`, `COMPARISON_LE`, `COMPARISON_EQ`, and `COMPARISON_NE`.
     * 
     */
    @InputImport(name="comparison", required=true)
    private final Input<String> comparison;

    public Input<String> getComparison() {
        return this.comparison;
    }

    /**
     * Specifies the alignment of data points in
     * individual time series selected by
     * denominatorFilter as well as how to combine
     * the retrieved time series together (such as
     * when aggregating multiple streams on each
     * resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).When
     * computing ratios, the aggregations and
     * denominator_aggregations fields must use the
     * same alignment period and produce time
     * series that have the same periodicity and
     * labels.This field is similar to the one in
     * the MetricService.ListTimeSeries request. It
     * is advisable to use the ListTimeSeries
     * method when debugging this field.
     * Structure is documented below.
     * 
     */
    @InputImport(name="denominatorAggregations")
    private final @Nullable Input<List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs>> denominatorAggregations;

    public Input<List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs>> getDenominatorAggregations() {
        return this.denominatorAggregations == null ? Input.empty() : this.denominatorAggregations;
    }

    /**
     * A filter that identifies a time series that
     * should be used as the denominator of a ratio
     * that will be compared with the threshold. If
     * a denominator_filter is specified, the time
     * series specified by the filter field will be
     * used as the numerator.The filter is similar
     * to the one that is specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    @InputImport(name="denominatorFilter")
    private final @Nullable Input<String> denominatorFilter;

    public Input<String> getDenominatorFilter() {
        return this.denominatorFilter == null ? Input.empty() : this.denominatorFilter;
    }

    /**
     * The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    @InputImport(name="duration", required=true)
    private final Input<String> duration;

    public Input<String> getDuration() {
        return this.duration;
    }

    /**
     * A logs-based filter.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * A value against which to compare the time
     * series.
     * 
     */
    @InputImport(name="thresholdValue")
    private final @Nullable Input<Double> thresholdValue;

    public Input<Double> getThresholdValue() {
        return this.thresholdValue == null ? Input.empty() : this.thresholdValue;
    }

    /**
     * The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="trigger")
    private final @Nullable Input<AlertPolicyConditionConditionThresholdTriggerArgs> trigger;

    public Input<AlertPolicyConditionConditionThresholdTriggerArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public AlertPolicyConditionConditionThresholdArgs(
        @Nullable Input<List<AlertPolicyConditionConditionThresholdAggregationArgs>> aggregations,
        Input<String> comparison,
        @Nullable Input<List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs>> denominatorAggregations,
        @Nullable Input<String> denominatorFilter,
        Input<String> duration,
        @Nullable Input<String> filter,
        @Nullable Input<Double> thresholdValue,
        @Nullable Input<AlertPolicyConditionConditionThresholdTriggerArgs> trigger) {
        this.aggregations = aggregations;
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.denominatorAggregations = denominatorAggregations;
        this.denominatorFilter = denominatorFilter;
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.filter = filter;
        this.thresholdValue = thresholdValue;
        this.trigger = trigger;
    }

    private AlertPolicyConditionConditionThresholdArgs() {
        this.aggregations = Input.empty();
        this.comparison = Input.empty();
        this.denominatorAggregations = Input.empty();
        this.denominatorFilter = Input.empty();
        this.duration = Input.empty();
        this.filter = Input.empty();
        this.thresholdValue = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AlertPolicyConditionConditionThresholdAggregationArgs>> aggregations;
        private Input<String> comparison;
        private @Nullable Input<List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs>> denominatorAggregations;
        private @Nullable Input<String> denominatorFilter;
        private Input<String> duration;
        private @Nullable Input<String> filter;
        private @Nullable Input<Double> thresholdValue;
        private @Nullable Input<AlertPolicyConditionConditionThresholdTriggerArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.comparison = defaults.comparison;
    	      this.denominatorAggregations = defaults.denominatorAggregations;
    	      this.denominatorFilter = defaults.denominatorFilter;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.thresholdValue = defaults.thresholdValue;
    	      this.trigger = defaults.trigger;
        }

        public Builder setAggregations(@Nullable Input<List<AlertPolicyConditionConditionThresholdAggregationArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder setAggregations(@Nullable List<AlertPolicyConditionConditionThresholdAggregationArgs> aggregations) {
            this.aggregations = Input.ofNullable(aggregations);
            return this;
        }

        public Builder setComparison(Input<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Input.of(Objects.requireNonNull(comparison));
            return this;
        }

        public Builder setDenominatorAggregations(@Nullable Input<List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs>> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }

        public Builder setDenominatorAggregations(@Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregationArgs> denominatorAggregations) {
            this.denominatorAggregations = Input.ofNullable(denominatorAggregations);
            return this;
        }

        public Builder setDenominatorFilter(@Nullable Input<String> denominatorFilter) {
            this.denominatorFilter = denominatorFilter;
            return this;
        }

        public Builder setDenominatorFilter(@Nullable String denominatorFilter) {
            this.denominatorFilter = Input.ofNullable(denominatorFilter);
            return this;
        }

        public Builder setDuration(Input<String> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setThresholdValue(@Nullable Input<Double> thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }

        public Builder setThresholdValue(@Nullable Double thresholdValue) {
            this.thresholdValue = Input.ofNullable(thresholdValue);
            return this;
        }

        public Builder setTrigger(@Nullable Input<AlertPolicyConditionConditionThresholdTriggerArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setTrigger(@Nullable AlertPolicyConditionConditionThresholdTriggerArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }

        public AlertPolicyConditionConditionThresholdArgs build() {
            return new AlertPolicyConditionConditionThresholdArgs(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
