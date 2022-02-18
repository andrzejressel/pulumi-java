// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse();

    /**
     * Must be specified if type is `DOUBLE`. Maximum value of the parameter.
     * 
     */
    @InputImport(name="maxValue", required=true)
    private final Double maxValue;

    public Double getMaxValue() {
        return this.maxValue;
    }

    /**
     * Must be specified if type is `DOUBLE`. Minimum value of the parameter.
     * 
     */
    @InputImport(name="minValue", required=true)
    private final Double minValue;

    public Double getMinValue() {
        return this.minValue;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse(
        Double maxValue,
        Double minValue) {
        this.maxValue = Objects.requireNonNull(maxValue, "expected parameter 'maxValue' to be non-null");
        this.minValue = Objects.requireNonNull(minValue, "expected parameter 'minValue' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse() {
        this.maxValue = null;
        this.minValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double maxValue;
        private Double minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(Double maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(Double minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecResponse(maxValue, minValue);
        }
    }
}
