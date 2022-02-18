// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse();

    /**
     * Must be specified if type is `DISCRETE`. A list of feasible points. The list should be in strictly increasing order. For instance, this parameter might have possible settings of 1.5, 2.5, and 4.0. This list should not contain more than 1,000 values.
     * 
     */
    @InputImport(name="values", required=true)
    private final List<Double> values;

    public List<Double> getValues() {
        return this.values;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse(List<Double> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Double> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecResponse(values);
        }
    }
}
