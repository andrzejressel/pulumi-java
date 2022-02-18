// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AggregationResponse {
    /**
     * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
     * 
     */
    private final String alignmentPeriod;
    /**
     * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
     * 
     */
    private final String crossSeriesReducer;
    /**
     * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
     * 
     */
    private final List<String> groupByFields;
    /**
     * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
     * 
     */
    private final String perSeriesAligner;

    @OutputCustomType.Constructor({"alignmentPeriod","crossSeriesReducer","groupByFields","perSeriesAligner"})
    private AggregationResponse(
        String alignmentPeriod,
        String crossSeriesReducer,
        List<String> groupByFields,
        String perSeriesAligner) {
        this.alignmentPeriod = Objects.requireNonNull(alignmentPeriod);
        this.crossSeriesReducer = Objects.requireNonNull(crossSeriesReducer);
        this.groupByFields = Objects.requireNonNull(groupByFields);
        this.perSeriesAligner = Objects.requireNonNull(perSeriesAligner);
    }

    /**
     * The alignment_period specifies a time interval, in seconds, that is used to divide the data in all the time series into consistent blocks of time. This will be done before the per-series aligner can be applied to the data.The value must be at least 60 seconds. If a per-series aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000 seconds (25 hours) for alerting policies.
     * 
     */
    public String getAlignmentPeriod() {
        return this.alignmentPeriod;
    }
    /**
     * The reduction operation to be used to combine time series into a single time series, where the value of each data point in the resulting series is a function of all the already aligned values in the input time series.Not all reducer operations can be applied to all time series. The valid choices depend on the metric_kind and the value_type of the original time series. Reduction can yield a time series with a different metric_kind or value_type than the input time series.Time series data must first be aligned (see per_series_aligner) in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified, and must not be ALIGN_NONE. An alignment_period must also be specified; otherwise, an error is returned.
     * 
     */
    public String getCrossSeriesReducer() {
        return this.crossSeriesReducer;
    }
    /**
     * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields determine how the time series are partitioned into subsets prior to applying the aggregation operation. Each subset contains time series that have the same value for each of the grouping fields. Each individual time series is a member of exactly one subset. The cross_series_reducer is applied to each subset of time series. It is not possible to reduce across different resource types, so this field implicitly contains resource.type. Fields not specified in group_by_fields are aggregated away. If group_by_fields is not specified and all the time series have the same resource type, then the time series are aggregated into a single output time series. If cross_series_reducer is not defined, this field is ignored.
     * 
     */
    public List<String> getGroupByFields() {
        return this.groupByFields;
    }
    /**
     * An Aligner describes how to bring the data points in a single time series into temporal alignment. Except for ALIGN_NONE, all alignments cause all the data points in an alignment_period to be mathematically grouped together, resulting in a single data point for each alignment_period with end timestamp at the end of the period.Not all alignment operations may be applied to all time series. The valid choices depend on the metric_kind and value_type of the original time series. Alignment can change the metric_kind or the value_type of the time series.Time series data must be aligned in order to perform cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must be specified and not equal to ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
     * 
     */
    public String getPerSeriesAligner() {
        return this.perSeriesAligner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alignmentPeriod;
        private String crossSeriesReducer;
        private List<String> groupByFields;
        private String perSeriesAligner;

        public Builder() {
    	      // Empty
        }

        public Builder(AggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alignmentPeriod = defaults.alignmentPeriod;
    	      this.crossSeriesReducer = defaults.crossSeriesReducer;
    	      this.groupByFields = defaults.groupByFields;
    	      this.perSeriesAligner = defaults.perSeriesAligner;
        }

        public Builder setAlignmentPeriod(String alignmentPeriod) {
            this.alignmentPeriod = Objects.requireNonNull(alignmentPeriod);
            return this;
        }

        public Builder setCrossSeriesReducer(String crossSeriesReducer) {
            this.crossSeriesReducer = Objects.requireNonNull(crossSeriesReducer);
            return this;
        }

        public Builder setGroupByFields(List<String> groupByFields) {
            this.groupByFields = Objects.requireNonNull(groupByFields);
            return this;
        }

        public Builder setPerSeriesAligner(String perSeriesAligner) {
            this.perSeriesAligner = Objects.requireNonNull(perSeriesAligner);
            return this;
        }

        public AggregationResponse build() {
            return new AggregationResponse(alignmentPeriod, crossSeriesReducer, groupByFields, perSeriesAligner);
        }
    }
}
