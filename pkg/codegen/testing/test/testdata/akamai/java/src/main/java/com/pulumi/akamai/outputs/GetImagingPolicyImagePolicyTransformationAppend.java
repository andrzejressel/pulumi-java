// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationAppendImage;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationAppend {
    private @Nullable String gravity;
    private @Nullable String gravityPriority;
    private @Nullable String gravityPriorityVar;
    private @Nullable String gravityVar;
    private GetImagingPolicyImagePolicyTransformationAppendImage image;
    private @Nullable String preserveMinorDimension;
    private @Nullable String preserveMinorDimensionVar;

    private GetImagingPolicyImagePolicyTransformationAppend() {}
    public Optional<String> gravity() {
        return Optional.ofNullable(this.gravity);
    }
    public Optional<String> gravityPriority() {
        return Optional.ofNullable(this.gravityPriority);
    }
    public Optional<String> gravityPriorityVar() {
        return Optional.ofNullable(this.gravityPriorityVar);
    }
    public Optional<String> gravityVar() {
        return Optional.ofNullable(this.gravityVar);
    }
    public GetImagingPolicyImagePolicyTransformationAppendImage image() {
        return this.image;
    }
    public Optional<String> preserveMinorDimension() {
        return Optional.ofNullable(this.preserveMinorDimension);
    }
    public Optional<String> preserveMinorDimensionVar() {
        return Optional.ofNullable(this.preserveMinorDimensionVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppend defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gravity;
        private @Nullable String gravityPriority;
        private @Nullable String gravityPriorityVar;
        private @Nullable String gravityVar;
        private GetImagingPolicyImagePolicyTransformationAppendImage image;
        private @Nullable String preserveMinorDimension;
        private @Nullable String preserveMinorDimensionVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationAppend defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gravity = defaults.gravity;
    	      this.gravityPriority = defaults.gravityPriority;
    	      this.gravityPriorityVar = defaults.gravityPriorityVar;
    	      this.gravityVar = defaults.gravityVar;
    	      this.image = defaults.image;
    	      this.preserveMinorDimension = defaults.preserveMinorDimension;
    	      this.preserveMinorDimensionVar = defaults.preserveMinorDimensionVar;
        }

        @CustomType.Setter
        public Builder gravity(@Nullable String gravity) {
            this.gravity = gravity;
            return this;
        }
        @CustomType.Setter
        public Builder gravityPriority(@Nullable String gravityPriority) {
            this.gravityPriority = gravityPriority;
            return this;
        }
        @CustomType.Setter
        public Builder gravityPriorityVar(@Nullable String gravityPriorityVar) {
            this.gravityPriorityVar = gravityPriorityVar;
            return this;
        }
        @CustomType.Setter
        public Builder gravityVar(@Nullable String gravityVar) {
            this.gravityVar = gravityVar;
            return this;
        }
        @CustomType.Setter
        public Builder image(GetImagingPolicyImagePolicyTransformationAppendImage image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder preserveMinorDimension(@Nullable String preserveMinorDimension) {
            this.preserveMinorDimension = preserveMinorDimension;
            return this;
        }
        @CustomType.Setter
        public Builder preserveMinorDimensionVar(@Nullable String preserveMinorDimensionVar) {
            this.preserveMinorDimensionVar = preserveMinorDimensionVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationAppend build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationAppend();
            _resultValue.gravity = gravity;
            _resultValue.gravityPriority = gravityPriority;
            _resultValue.gravityPriorityVar = gravityPriorityVar;
            _resultValue.gravityVar = gravityVar;
            _resultValue.image = image;
            _resultValue.preserveMinorDimension = preserveMinorDimension;
            _resultValue.preserveMinorDimensionVar = preserveMinorDimensionVar;
            return _resultValue;
        }
    }
}
