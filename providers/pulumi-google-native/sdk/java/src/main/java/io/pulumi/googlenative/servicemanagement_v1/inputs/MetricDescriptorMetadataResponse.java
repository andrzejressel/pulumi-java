// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Additional annotations that can be used to guide the usage of a metric.
 * 
 */
public final class MetricDescriptorMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricDescriptorMetadataResponse Empty = new MetricDescriptorMetadataResponse();

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
     */
    @InputImport(name="ingestDelay", required=true)
    private final String ingestDelay;

    public String getIngestDelay() {
        return this.ingestDelay;
    }

    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
     */
    @InputImport(name="samplePeriod", required=true)
    private final String samplePeriod;

    public String getSamplePeriod() {
        return this.samplePeriod;
    }

    public MetricDescriptorMetadataResponse(
        String ingestDelay,
        String samplePeriod) {
        this.ingestDelay = Objects.requireNonNull(ingestDelay, "expected parameter 'ingestDelay' to be non-null");
        this.samplePeriod = Objects.requireNonNull(samplePeriod, "expected parameter 'samplePeriod' to be non-null");
    }

    private MetricDescriptorMetadataResponse() {
        this.ingestDelay = null;
        this.samplePeriod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ingestDelay;
        private String samplePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestDelay = defaults.ingestDelay;
    	      this.samplePeriod = defaults.samplePeriod;
        }

        public Builder setIngestDelay(String ingestDelay) {
            this.ingestDelay = Objects.requireNonNull(ingestDelay);
            return this;
        }

        public Builder setSamplePeriod(String samplePeriod) {
            this.samplePeriod = Objects.requireNonNull(samplePeriod);
            return this;
        }

        public MetricDescriptorMetadataResponse build() {
            return new MetricDescriptorMetadataResponse(ingestDelay, samplePeriod);
        }
    }
}
