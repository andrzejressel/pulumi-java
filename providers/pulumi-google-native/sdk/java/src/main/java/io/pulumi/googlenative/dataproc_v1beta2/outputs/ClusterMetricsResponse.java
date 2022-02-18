// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ClusterMetricsResponse {
    /**
     * The HDFS metrics.
     * 
     */
    private final Map<String,String> hdfsMetrics;
    /**
     * The YARN metrics.
     * 
     */
    private final Map<String,String> yarnMetrics;

    @OutputCustomType.Constructor({"hdfsMetrics","yarnMetrics"})
    private ClusterMetricsResponse(
        Map<String,String> hdfsMetrics,
        Map<String,String> yarnMetrics) {
        this.hdfsMetrics = Objects.requireNonNull(hdfsMetrics);
        this.yarnMetrics = Objects.requireNonNull(yarnMetrics);
    }

    /**
     * The HDFS metrics.
     * 
     */
    public Map<String,String> getHdfsMetrics() {
        return this.hdfsMetrics;
    }
    /**
     * The YARN metrics.
     * 
     */
    public Map<String,String> getYarnMetrics() {
        return this.yarnMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> hdfsMetrics;
        private Map<String,String> yarnMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hdfsMetrics = defaults.hdfsMetrics;
    	      this.yarnMetrics = defaults.yarnMetrics;
        }

        public Builder setHdfsMetrics(Map<String,String> hdfsMetrics) {
            this.hdfsMetrics = Objects.requireNonNull(hdfsMetrics);
            return this;
        }

        public Builder setYarnMetrics(Map<String,String> yarnMetrics) {
            this.yarnMetrics = Objects.requireNonNull(yarnMetrics);
            return this;
        }

        public ClusterMetricsResponse build() {
            return new ClusterMetricsResponse(hdfsMetrics, yarnMetrics);
        }
    }
}
