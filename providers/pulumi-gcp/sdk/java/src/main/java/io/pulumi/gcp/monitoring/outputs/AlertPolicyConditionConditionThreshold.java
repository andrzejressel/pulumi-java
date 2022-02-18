// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdAggregation;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdDenominatorAggregation;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdTrigger;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyConditionConditionThreshold {
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
    private final @Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations;
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
    private final String comparison;
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
    private final @Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations;
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
    private final @Nullable String denominatorFilter;
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
    private final String duration;
    /**
     * A logs-based filter.
     * 
     */
    private final @Nullable String filter;
    /**
     * A value against which to compare the time
     * series.
     * 
     */
    private final @Nullable Double thresholdValue;
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
    private final @Nullable AlertPolicyConditionConditionThresholdTrigger trigger;

    @OutputCustomType.Constructor({"aggregations","comparison","denominatorAggregations","denominatorFilter","duration","filter","thresholdValue","trigger"})
    private AlertPolicyConditionConditionThreshold(
        @Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations,
        String comparison,
        @Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations,
        @Nullable String denominatorFilter,
        String duration,
        @Nullable String filter,
        @Nullable Double thresholdValue,
        @Nullable AlertPolicyConditionConditionThresholdTrigger trigger) {
        this.aggregations = aggregations;
        this.comparison = Objects.requireNonNull(comparison);
        this.denominatorAggregations = denominatorAggregations;
        this.denominatorFilter = denominatorFilter;
        this.duration = Objects.requireNonNull(duration);
        this.filter = filter;
        this.thresholdValue = thresholdValue;
        this.trigger = trigger;
    }

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
    public List<AlertPolicyConditionConditionThresholdAggregation> getAggregations() {
        return this.aggregations == null ? List.of() : this.aggregations;
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
    public String getComparison() {
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
    public List<AlertPolicyConditionConditionThresholdDenominatorAggregation> getDenominatorAggregations() {
        return this.denominatorAggregations == null ? List.of() : this.denominatorAggregations;
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
    public Optional<String> getDenominatorFilter() {
        return Optional.ofNullable(this.denominatorFilter);
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
    public String getDuration() {
        return this.duration;
    }
    /**
     * A logs-based filter.
     * 
     */
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * A value against which to compare the time
     * series.
     * 
     */
    public Optional<Double> getThresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
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
    public Optional<AlertPolicyConditionConditionThresholdTrigger> getTrigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations;
        private String comparison;
        private @Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations;
        private @Nullable String denominatorFilter;
        private String duration;
        private @Nullable String filter;
        private @Nullable Double thresholdValue;
        private @Nullable AlertPolicyConditionConditionThresholdTrigger trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionThreshold defaults) {
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

        public Builder setAggregations(@Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setDenominatorAggregations(@Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }

        public Builder setDenominatorFilter(@Nullable String denominatorFilter) {
            this.denominatorFilter = denominatorFilter;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setThresholdValue(@Nullable Double thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }

        public Builder setTrigger(@Nullable AlertPolicyConditionConditionThresholdTrigger trigger) {
            this.trigger = trigger;
            return this;
        }

        public AlertPolicyConditionConditionThreshold build() {
            return new AlertPolicyConditionConditionThreshold(aggregations, comparison, denominatorAggregations, denominatorFilter, duration, filter, thresholdValue, trigger);
        }
    }
}
