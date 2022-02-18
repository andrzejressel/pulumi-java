// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents the spec to match integer values from parent parameter.
 * 
 */
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse();

    /**
     * Matches values of the parent parameter with type 'INTEGER'. All values must lie in `integer_value_spec` of parent parameter.
     * 
     */
    @InputImport(name="values", required=true)
    private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse(List<String> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecResponse(values);
        }
    }
}
