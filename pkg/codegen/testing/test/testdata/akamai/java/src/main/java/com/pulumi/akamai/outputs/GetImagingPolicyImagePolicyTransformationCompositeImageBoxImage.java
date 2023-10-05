// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage {
    private @Nullable String color;
    private @Nullable String colorVar;
    private @Nullable String height;
    private @Nullable String heightVar;
    private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
    private @Nullable String width;
    private @Nullable String widthVar;

    private GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage() {}
    public Optional<String> color() {
        return Optional.ofNullable(this.color);
    }
    public Optional<String> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }
    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }
    public Optional<GetImagingPolicyImagePolicyTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }
    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }
    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String color;
        private @Nullable String colorVar;
        private @Nullable String height;
        private @Nullable String heightVar;
        private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
        private @Nullable String width;
        private @Nullable String widthVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.colorVar = defaults.colorVar;
    	      this.height = defaults.height;
    	      this.heightVar = defaults.heightVar;
    	      this.transformation = defaults.transformation;
    	      this.width = defaults.width;
    	      this.widthVar = defaults.widthVar;
        }

        @CustomType.Setter
        public Builder color(@Nullable String color) {
            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder colorVar(@Nullable String colorVar) {
            this.colorVar = colorVar;
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable String height) {
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder heightVar(@Nullable String heightVar) {
            this.heightVar = heightVar;
            return this;
        }
        @CustomType.Setter
        public Builder transformation(@Nullable GetImagingPolicyImagePolicyTransformation transformation) {
            this.transformation = transformation;
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable String width) {
            this.width = width;
            return this;
        }
        @CustomType.Setter
        public Builder widthVar(@Nullable String widthVar) {
            this.widthVar = widthVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationCompositeImageBoxImage();
            _resultValue.color = color;
            _resultValue.colorVar = colorVar;
            _resultValue.height = height;
            _resultValue.heightVar = heightVar;
            _resultValue.transformation = transformation;
            _resultValue.width = width;
            _resultValue.widthVar = widthVar;
            return _resultValue;
        }
    }
}
