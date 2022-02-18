// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse();

    /**
     * Must be specified if type is `INTEGER`. Maximum value of the parameter.
     * 
     */
    @InputImport(name="maxValue", required=true)
    private final String maxValue;

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * Must be specified if type is `INTEGER`. Minimum value of the parameter.
     * 
     */
    @InputImport(name="minValue", required=true)
    private final String minValue;

    public String getMinValue() {
        return this.minValue;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse(
        String maxValue,
        String minValue) {
        this.maxValue = Objects.requireNonNull(maxValue, "expected parameter 'maxValue' to be non-null");
        this.minValue = Objects.requireNonNull(minValue, "expected parameter 'minValue' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse() {
        this.maxValue = null;
        this.minValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxValue;
        private String minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(String maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(String minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse(maxValue, minValue);
        }
    }
}
