// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.MetricThresholdComparison;
import io.pulumi.googlenative.monitoring_v3.inputs.AggregationArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TriggerArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A condition type that compares a collection of time series against a threshold.
 * 
 */
public final class MetricThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricThresholdArgs Empty = new MetricThresholdArgs();

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    @InputImport(name="aggregations")
    private final @Nullable Input<List<AggregationArgs>> aggregations;

    public Input<List<AggregationArgs>> getAggregations() {
        return this.aggregations == null ? Input.empty() : this.aggregations;
    }

    /**
     * The comparison to apply between the time series (indicated by filter and aggregation) and the threshold (indicated by threshold_value). The comparison is applied on each time series, with the time series on the left-hand side and the threshold on the right-hand side.Only COMPARISON_LT and COMPARISON_GT are supported currently.
     * 
     */
    @InputImport(name="comparison")
    private final @Nullable Input<MetricThresholdComparison> comparison;

    public Input<MetricThresholdComparison> getComparison() {
        return this.comparison == null ? Input.empty() : this.comparison;
    }

    /**
     * Specifies the alignment of data points in individual time series selected by denominatorFilter as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources).When computing ratios, the aggregations and denominator_aggregations fields must use the same alignment period and produce time series that have the same periodicity and labels.
     * 
     */
    @InputImport(name="denominatorAggregations")
    private final @Nullable Input<List<AggregationArgs>> denominatorAggregations;

    public Input<List<AggregationArgs>> getDenominatorAggregations() {
        return this.denominatorAggregations == null ? Input.empty() : this.denominatorAggregations;
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies a time series that should be used as the denominator of a ratio that will be compared with the threshold. If a denominator_filter is specified, the time series specified by the filter field will be used as the numerator.The filter must specify the metric type and optionally may contain restrictions on resource type, resource labels, and metric labels. This field may not exceed 2048 Unicode characters in length.
     * 
     */
    @InputImport(name="denominatorFilter")
    private final @Nullable Input<String> denominatorFilter;

    public Input<String> getDenominatorFilter() {
        return this.denominatorFilter == null ? Input.empty() : this.denominatorFilter;
    }

    /**
     * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300 seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts, but short enough that unhealthy states are detected and alerted on quickly.
     * 
     */
    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    @InputImport(name="filter", required=true)
    private final Input<String> filter;

    public Input<String> getFilter() {
        return this.filter;
    }

    /**
     * A value against which to compare the time series.
     * 
     */
    @InputImport(name="thresholdValue")
    private final @Nullable Input<Double> thresholdValue;

    public Input<Double> getThresholdValue() {
        return this.thresholdValue == null ? Input.empty() : this.thresholdValue;
    }

    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
     * 
     */
    @InputImport(name="trigger")
    private final @Nullable Input<TriggerArgs> trigger;

    public Input<TriggerArgs> getTrigger() {
        return this.trigger == null ? Input.empty() : this.trigger;
    }

    public MetricThresholdArgs(
        @Nullable Input<List<AggregationArgs>> aggregations,
        @Nullable Input<MetricThresholdComparison> comparison,
        @Nullable Input<List<AggregationArgs>> denominatorAggregations,
        @Nullable Input<String> denominatorFilter,
        @Nullable Input<String> duration,
        Input<String> filter,
        @Nullable Input<Double> thresholdValue,
        @Nullable Input<TriggerArgs> trigger) {
        this.aggregations = aggregations;
        this.comparison = comparison;
        this.denominatorAggregations = denominatorAggregations;
        this.denominatorFilter = denominatorFilter;
        this.duration = duration;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.thresholdValue = thresholdValue;
        this.trigger = trigger;
    }

    private MetricThresholdArgs() {
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

    public static Builder builder(MetricThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AggregationArgs>> aggregations;
        private @Nullable Input<MetricThresholdComparison> comparison;
        private @Nullable Input<List<AggregationArgs>> denominatorAggregations;
        private @Nullable Input<String> denominatorFilter;
        private @Nullable Input<String> duration;
        private Input<String> filter;
        private @Nullable Input<Double> thresholdValue;
        private @Nullable Input<TriggerArgs> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricThresholdArgs defaults) {
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

        public Builder setAggregations(@Nullable Input<List<AggregationArgs>> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder setAggregations(@Nullable List<AggregationArgs> aggregations) {
            this.aggregations = Input.ofNullable(aggregations);
            return this;
        }

        public Builder setComparison(@Nullable Input<MetricThresholdComparison> comparison) {
            this.comparison = comparison;
            return this;
        }

        public Builder setComparison(@Nullable MetricThresholdComparison comparison) {
            this.comparison = Input.ofNullable(comparison);
            return this;
        }

        public Builder setDenominatorAggregations(@Nullable Input<List<AggregationArgs>> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }

        public Builder setDenominatorAggregations(@Nullable List<AggregationArgs> denominatorAggregations) {
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

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setFilter(Input<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder setFilter(String filter) {
            this.filter = Input.of(Objects.requireNonNull(filter));
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

        public Builder setTrigger(@Nullable Input<TriggerArgs> trigger) {
            this.trigger = trigger;
            return this;
        }

        public Builder setTrigger(@Nullable TriggerArgs trigger) {
            this.trigger = Input.ofNullable(trigger);
            return this;
        }

        public MetricThresholdArgs build() {
            return new MetricThresholdArgs(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
