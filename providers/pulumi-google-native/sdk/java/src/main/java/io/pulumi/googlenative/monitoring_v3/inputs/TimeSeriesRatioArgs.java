// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A TimeSeriesRatio specifies two TimeSeries to use for computing the good_service / total_service ratio. The specified TimeSeries must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE. The TimeSeriesRatio must specify exactly two of good, bad, and total, and the relationship good_service + bad_service = total_service will be assumed.
 * 
 */
public final class TimeSeriesRatioArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSeriesRatioArgs Empty = new TimeSeriesRatioArgs();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="badServiceFilter")
    private final @Nullable Input<String> badServiceFilter;

    public Input<String> getBadServiceFilter() {
        return this.badServiceFilter == null ? Input.empty() : this.badServiceFilter;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="goodServiceFilter")
    private final @Nullable Input<String> goodServiceFilter;

    public Input<String> getGoodServiceFilter() {
        return this.goodServiceFilter == null ? Input.empty() : this.goodServiceFilter;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="totalServiceFilter")
    private final @Nullable Input<String> totalServiceFilter;

    public Input<String> getTotalServiceFilter() {
        return this.totalServiceFilter == null ? Input.empty() : this.totalServiceFilter;
    }

    public TimeSeriesRatioArgs(
        @Nullable Input<String> badServiceFilter,
        @Nullable Input<String> goodServiceFilter,
        @Nullable Input<String> totalServiceFilter) {
        this.badServiceFilter = badServiceFilter;
        this.goodServiceFilter = goodServiceFilter;
        this.totalServiceFilter = totalServiceFilter;
    }

    private TimeSeriesRatioArgs() {
        this.badServiceFilter = Input.empty();
        this.goodServiceFilter = Input.empty();
        this.totalServiceFilter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesRatioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> badServiceFilter;
        private @Nullable Input<String> goodServiceFilter;
        private @Nullable Input<String> totalServiceFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesRatioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.badServiceFilter = defaults.badServiceFilter;
    	      this.goodServiceFilter = defaults.goodServiceFilter;
    	      this.totalServiceFilter = defaults.totalServiceFilter;
        }

        public Builder setBadServiceFilter(@Nullable Input<String> badServiceFilter) {
            this.badServiceFilter = badServiceFilter;
            return this;
        }

        public Builder setBadServiceFilter(@Nullable String badServiceFilter) {
            this.badServiceFilter = Input.ofNullable(badServiceFilter);
            return this;
        }

        public Builder setGoodServiceFilter(@Nullable Input<String> goodServiceFilter) {
            this.goodServiceFilter = goodServiceFilter;
            return this;
        }

        public Builder setGoodServiceFilter(@Nullable String goodServiceFilter) {
            this.goodServiceFilter = Input.ofNullable(goodServiceFilter);
            return this;
        }

        public Builder setTotalServiceFilter(@Nullable Input<String> totalServiceFilter) {
            this.totalServiceFilter = totalServiceFilter;
            return this;
        }

        public Builder setTotalServiceFilter(@Nullable String totalServiceFilter) {
            this.totalServiceFilter = Input.ofNullable(totalServiceFilter);
            return this;
        }

        public TimeSeriesRatioArgs build() {
            return new TimeSeriesRatioArgs(badServiceFilter, goodServiceFilter, totalServiceFilter);
        }
    }
}
