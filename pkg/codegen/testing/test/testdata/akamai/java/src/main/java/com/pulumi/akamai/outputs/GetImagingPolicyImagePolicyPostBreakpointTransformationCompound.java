// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyPostBreakpointTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompound {
    private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformations;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompound() {}
    public List<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompound defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformations;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompound defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformations = defaults.transformations;
        }

        @CustomType.Setter
        public Builder transformations(@Nullable List<GetImagingPolicyImagePolicyPostBreakpointTransformation> transformations) {
            this.transformations = transformations;
            return this;
        }
        public Builder transformations(GetImagingPolicyImagePolicyPostBreakpointTransformation... transformations) {
            return transformations(List.of(transformations));
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompound build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompound();
            _resultValue.transformations = transformations;
            return _resultValue;
        }
    }
}
