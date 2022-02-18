// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesFilterRatioResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesFilterResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimeSeriesQueryResponse {
    /**
     * Filter parameters to fetch time series.
     * 
     */
    private final TimeSeriesFilterResponse timeSeriesFilter;
    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    private final TimeSeriesFilterRatioResponse timeSeriesFilterRatio;
    /**
     * A query used to fetch time series.
     * 
     */
    private final String timeSeriesQueryLanguage;
    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    private final String unitOverride;

    @OutputCustomType.Constructor({"timeSeriesFilter","timeSeriesFilterRatio","timeSeriesQueryLanguage","unitOverride"})
    private TimeSeriesQueryResponse(
        TimeSeriesFilterResponse timeSeriesFilter,
        TimeSeriesFilterRatioResponse timeSeriesFilterRatio,
        String timeSeriesQueryLanguage,
        String unitOverride) {
        this.timeSeriesFilter = Objects.requireNonNull(timeSeriesFilter);
        this.timeSeriesFilterRatio = Objects.requireNonNull(timeSeriesFilterRatio);
        this.timeSeriesQueryLanguage = Objects.requireNonNull(timeSeriesQueryLanguage);
        this.unitOverride = Objects.requireNonNull(unitOverride);
    }

    /**
     * Filter parameters to fetch time series.
     * 
     */
    public TimeSeriesFilterResponse getTimeSeriesFilter() {
        return this.timeSeriesFilter;
    }
    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    public TimeSeriesFilterRatioResponse getTimeSeriesFilterRatio() {
        return this.timeSeriesFilterRatio;
    }
    /**
     * A query used to fetch time series.
     * 
     */
    public String getTimeSeriesQueryLanguage() {
        return this.timeSeriesQueryLanguage;
    }
    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    public String getUnitOverride() {
        return this.unitOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeSeriesFilterResponse timeSeriesFilter;
        private TimeSeriesFilterRatioResponse timeSeriesFilterRatio;
        private String timeSeriesQueryLanguage;
        private String unitOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesQueryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeSeriesFilter = defaults.timeSeriesFilter;
    	      this.timeSeriesFilterRatio = defaults.timeSeriesFilterRatio;
    	      this.timeSeriesQueryLanguage = defaults.timeSeriesQueryLanguage;
    	      this.unitOverride = defaults.unitOverride;
        }

        public Builder setTimeSeriesFilter(TimeSeriesFilterResponse timeSeriesFilter) {
            this.timeSeriesFilter = Objects.requireNonNull(timeSeriesFilter);
            return this;
        }

        public Builder setTimeSeriesFilterRatio(TimeSeriesFilterRatioResponse timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = Objects.requireNonNull(timeSeriesFilterRatio);
            return this;
        }

        public Builder setTimeSeriesQueryLanguage(String timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = Objects.requireNonNull(timeSeriesQueryLanguage);
            return this;
        }

        public Builder setUnitOverride(String unitOverride) {
            this.unitOverride = Objects.requireNonNull(unitOverride);
            return this;
        }

        public TimeSeriesQueryResponse build() {
            return new TimeSeriesQueryResponse(timeSeriesFilter, timeSeriesFilterRatio, timeSeriesQueryLanguage, unitOverride);
        }
    }
}
