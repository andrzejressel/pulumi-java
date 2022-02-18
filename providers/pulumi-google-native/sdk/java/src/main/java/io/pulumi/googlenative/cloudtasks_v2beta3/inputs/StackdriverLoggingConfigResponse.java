// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/).
 * 
 */
public final class StackdriverLoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final StackdriverLoggingConfigResponse Empty = new StackdriverLoggingConfigResponse();

    /**
     * Specifies the fraction of operations to write to [Stackdriver Logging](https://cloud.google.com/logging/docs/). This field may contain any value between 0.0 and 1.0, inclusive. 0.0 is the default and means that no operations are logged.
     * 
     */
    @InputImport(name="samplingRatio", required=true)
    private final Double samplingRatio;

    public Double getSamplingRatio() {
        return this.samplingRatio;
    }

    public StackdriverLoggingConfigResponse(Double samplingRatio) {
        this.samplingRatio = Objects.requireNonNull(samplingRatio, "expected parameter 'samplingRatio' to be non-null");
    }

    private StackdriverLoggingConfigResponse() {
        this.samplingRatio = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackdriverLoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double samplingRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(StackdriverLoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samplingRatio = defaults.samplingRatio;
        }

        public Builder setSamplingRatio(Double samplingRatio) {
            this.samplingRatio = Objects.requireNonNull(samplingRatio);
            return this;
        }

        public StackdriverLoggingConfigResponse build() {
            return new StackdriverLoggingConfigResponse(samplingRatio);
        }
    }
}
