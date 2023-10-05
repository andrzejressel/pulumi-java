// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor {
    private @Nullable String colors;
    private @Nullable String colorsVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor() {}
    public Optional<String> colors() {
        return Optional.ofNullable(this.colors);
    }
    public Optional<String> colorsVar() {
        return Optional.ofNullable(this.colorsVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String colors;
        private @Nullable String colorsVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.colorsVar = defaults.colorsVar;
        }

        @CustomType.Setter
        public Builder colors(@Nullable String colors) {
            this.colors = colors;
            return this;
        }
        @CustomType.Setter
        public Builder colorsVar(@Nullable String colorsVar) {
            this.colorsVar = colorsVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationMaxColor();
            _resultValue.colors = colors;
            _resultValue.colorsVar = colorsVar;
            return _resultValue;
        }
    }
}
