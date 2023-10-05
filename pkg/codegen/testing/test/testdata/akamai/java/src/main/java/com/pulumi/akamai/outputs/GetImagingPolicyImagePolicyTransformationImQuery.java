// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationImQuery {
    private List<String> allowedTransformations;
    private String queryVar;

    private GetImagingPolicyImagePolicyTransformationImQuery() {}
    public List<String> allowedTransformations() {
        return this.allowedTransformations;
    }
    public String queryVar() {
        return this.queryVar;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationImQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedTransformations;
        private String queryVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationImQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedTransformations = defaults.allowedTransformations;
    	      this.queryVar = defaults.queryVar;
        }

        @CustomType.Setter
        public Builder allowedTransformations(List<String> allowedTransformations) {
            this.allowedTransformations = Objects.requireNonNull(allowedTransformations);
            return this;
        }
        public Builder allowedTransformations(String... allowedTransformations) {
            return allowedTransformations(List.of(allowedTransformations));
        }
        @CustomType.Setter
        public Builder queryVar(String queryVar) {
            this.queryVar = Objects.requireNonNull(queryVar);
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationImQuery build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationImQuery();
            _resultValue.allowedTransformations = allowedTransformations;
            _resultValue.queryVar = queryVar;
            return _resultValue;
        }
    }
}
