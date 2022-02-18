// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SparkChartViewResponse {
    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    private final String minAlignmentPeriod;
    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    private final String sparkChartType;

    @OutputCustomType.Constructor({"minAlignmentPeriod","sparkChartType"})
    private SparkChartViewResponse(
        String minAlignmentPeriod,
        String sparkChartType) {
        this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
        this.sparkChartType = Objects.requireNonNull(sparkChartType);
    }

    /**
     * The lower bound on data point frequency in the chart implemented by specifying the minimum alignment period to use in a time series query. For example, if the data is published once every 10 minutes it would not make sense to fetch and align data at one minute intervals. This field is optional and exists only as a hint.
     * 
     */
    public String getMinAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }
    /**
     * The type of sparkchart to show in this chartView.
     * 
     */
    public String getSparkChartType() {
        return this.sparkChartType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkChartViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minAlignmentPeriod;
        private String sparkChartType;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkChartViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.sparkChartType = defaults.sparkChartType;
        }

        public Builder setMinAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }

        public Builder setSparkChartType(String sparkChartType) {
            this.sparkChartType = Objects.requireNonNull(sparkChartType);
            return this;
        }

        public SparkChartViewResponse build() {
            return new SparkChartViewResponse(minAlignmentPeriod, sparkChartType);
        }
    }
}
