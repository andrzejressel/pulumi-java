// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyPostBreakpointTransformationContrast {
    private @Nullable String brightness;
    private @Nullable String brightnessVar;
    private @Nullable String contrast;
    private @Nullable String contrastVar;

    private GetImagingPolicyImagePolicyPostBreakpointTransformationContrast() {}
    public Optional<String> brightness() {
        return Optional.ofNullable(this.brightness);
    }
    public Optional<String> brightnessVar() {
        return Optional.ofNullable(this.brightnessVar);
    }
    public Optional<String> contrast() {
        return Optional.ofNullable(this.contrast);
    }
    public Optional<String> contrastVar() {
        return Optional.ofNullable(this.contrastVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationContrast defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String brightness;
        private @Nullable String brightnessVar;
        private @Nullable String contrast;
        private @Nullable String contrastVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationContrast defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brightness = defaults.brightness;
    	      this.brightnessVar = defaults.brightnessVar;
    	      this.contrast = defaults.contrast;
    	      this.contrastVar = defaults.contrastVar;
        }

        @CustomType.Setter
        public Builder brightness(@Nullable String brightness) {
            this.brightness = brightness;
            return this;
        }
        @CustomType.Setter
        public Builder brightnessVar(@Nullable String brightnessVar) {
            this.brightnessVar = brightnessVar;
            return this;
        }
        @CustomType.Setter
        public Builder contrast(@Nullable String contrast) {
            this.contrast = contrast;
            return this;
        }
        @CustomType.Setter
        public Builder contrastVar(@Nullable String contrastVar) {
            this.contrastVar = contrastVar;
            return this;
        }
        public GetImagingPolicyImagePolicyPostBreakpointTransformationContrast build() {
            final var _resultValue = new GetImagingPolicyImagePolicyPostBreakpointTransformationContrast();
            _resultValue.brightness = brightness;
            _resultValue.brightnessVar = brightnessVar;
            _resultValue.contrast = contrast;
            _resultValue.contrastVar = contrastVar;
            return _resultValue;
        }
    }
}
