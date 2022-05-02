// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetricStreamStatisticsMetric {
    /**
     * @return The name of the metric.
     * 
     */
    private final String metricName;
    /**
     * @return The namespace of the metric.
     * 
     */
    private final String namespace;

    @CustomType.Constructor
    private MetricStreamStatisticsMetric(
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("namespace") String namespace) {
        this.metricName = metricName;
        this.namespace = namespace;
    }

    /**
     * @return The name of the metric.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The namespace of the metric.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamStatisticsMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamStatisticsMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }        public MetricStreamStatisticsMetric build() {
            return new MetricStreamStatisticsMetric(metricName, namespace);
        }
    }
}
