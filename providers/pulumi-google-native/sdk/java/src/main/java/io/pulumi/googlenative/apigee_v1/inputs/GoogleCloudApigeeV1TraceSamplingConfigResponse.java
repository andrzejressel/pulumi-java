// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * TraceSamplingConfig represents the detail settings of distributed tracing. Only the fields that are defined in the distributed trace configuration can be overridden using the distribute trace configuration override APIs.
 * 
 */
public final class GoogleCloudApigeeV1TraceSamplingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1TraceSamplingConfigResponse Empty = new GoogleCloudApigeeV1TraceSamplingConfigResponse();

    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
     */
    @InputImport(name="sampler", required=true)
    private final String sampler;

    public String getSampler() {
        return this.sampler;
    }

    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are > 0 and <= 0.5.
     * 
     */
    @InputImport(name="samplingRate", required=true)
    private final Double samplingRate;

    public Double getSamplingRate() {
        return this.samplingRate;
    }

    public GoogleCloudApigeeV1TraceSamplingConfigResponse(
        String sampler,
        Double samplingRate) {
        this.sampler = Objects.requireNonNull(sampler, "expected parameter 'sampler' to be non-null");
        this.samplingRate = Objects.requireNonNull(samplingRate, "expected parameter 'samplingRate' to be non-null");
    }

    private GoogleCloudApigeeV1TraceSamplingConfigResponse() {
        this.sampler = null;
        this.samplingRate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sampler;
        private Double samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampler = defaults.sampler;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder setSampler(String sampler) {
            this.sampler = Objects.requireNonNull(sampler);
            return this;
        }

        public Builder setSamplingRate(Double samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }

        public GoogleCloudApigeeV1TraceSamplingConfigResponse build() {
            return new GoogleCloudApigeeV1TraceSamplingConfigResponse(sampler, samplingRate);
        }
    }
}
