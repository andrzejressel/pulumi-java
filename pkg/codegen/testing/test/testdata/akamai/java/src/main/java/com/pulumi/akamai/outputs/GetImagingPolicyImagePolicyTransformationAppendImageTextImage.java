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
public final class GetImagingPolicyImagePolicyTransformationAppendImageTextImage {
    private @Nullable String fill;
    private @Nullable String fillVar;
    private @Nullable String size;
    private @Nullable String sizeVar;
    private @Nullable String stroke;
    private @Nullable String strokeSize;
    private @Nullable String strokeSizeVar;
    private @Nullable String strokeVar;
    private @Nullable String text;
    private @Nullable String textVar;
    private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
    private @Nullable String typeface;
    private @Nullable String typefaceVar;

    private GetImagingPolicyImagePolicyTransformationAppendImageTextImage() {}
    public Optional<String> fill() {
        return Optional.ofNullable(this.fill);
    }
    public Optional<String> fillVar() {
        return Optional.ofNullable(this.fillVar);
    }
    public Optional<String> size() {
        return Optional.ofNullable(this.size);
    }
    public Optional<String> sizeVar() {
        return Optional.ofNullable(this.sizeVar);
    }
    public Optional<String> stroke() {
        return Optional.ofNullable(this.stroke);
    }
    public Optional<String> strokeSize() {
        return Optional.ofNullable(this.strokeSize);
    }
    public Optional<String> strokeSizeVar() {
        return Optional.ofNullable(this.strokeSizeVar);
    }
    public Optional<String> strokeVar() {
        return Optional.ofNullable(this.strokeVar);
    }
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    public Optional<String> textVar() {
        return Optional.ofNullable(this.textVar);
    }
    public Optional<GetImagingPolicyImagePolicyTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }
    public Optional<String> typeface() {
        return Optional.ofNullable(this.typeface);
    }
    public Optional<String> typefaceVar() {
        return Optional.ofNullable(this.typefaceVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationAppendImageTextImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String fill;
        private @Nullable String fillVar;
        private @Nullable String size;
        private @Nullable String sizeVar;
        private @Nullable String stroke;
        private @Nullable String strokeSize;
        private @Nullable String strokeSizeVar;
        private @Nullable String strokeVar;
        private @Nullable String text;
        private @Nullable String textVar;
        private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
        private @Nullable String typeface;
        private @Nullable String typefaceVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationAppendImageTextImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fill = defaults.fill;
    	      this.fillVar = defaults.fillVar;
    	      this.size = defaults.size;
    	      this.sizeVar = defaults.sizeVar;
    	      this.stroke = defaults.stroke;
    	      this.strokeSize = defaults.strokeSize;
    	      this.strokeSizeVar = defaults.strokeSizeVar;
    	      this.strokeVar = defaults.strokeVar;
    	      this.text = defaults.text;
    	      this.textVar = defaults.textVar;
    	      this.transformation = defaults.transformation;
    	      this.typeface = defaults.typeface;
    	      this.typefaceVar = defaults.typefaceVar;
        }

        @CustomType.Setter
        public Builder fill(@Nullable String fill) {
            this.fill = fill;
            return this;
        }
        @CustomType.Setter
        public Builder fillVar(@Nullable String fillVar) {
            this.fillVar = fillVar;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder sizeVar(@Nullable String sizeVar) {
            this.sizeVar = sizeVar;
            return this;
        }
        @CustomType.Setter
        public Builder stroke(@Nullable String stroke) {
            this.stroke = stroke;
            return this;
        }
        @CustomType.Setter
        public Builder strokeSize(@Nullable String strokeSize) {
            this.strokeSize = strokeSize;
            return this;
        }
        @CustomType.Setter
        public Builder strokeSizeVar(@Nullable String strokeSizeVar) {
            this.strokeSizeVar = strokeSizeVar;
            return this;
        }
        @CustomType.Setter
        public Builder strokeVar(@Nullable String strokeVar) {
            this.strokeVar = strokeVar;
            return this;
        }
        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder textVar(@Nullable String textVar) {
            this.textVar = textVar;
            return this;
        }
        @CustomType.Setter
        public Builder transformation(@Nullable GetImagingPolicyImagePolicyTransformation transformation) {
            this.transformation = transformation;
            return this;
        }
        @CustomType.Setter
        public Builder typeface(@Nullable String typeface) {
            this.typeface = typeface;
            return this;
        }
        @CustomType.Setter
        public Builder typefaceVar(@Nullable String typefaceVar) {
            this.typefaceVar = typefaceVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationAppendImageTextImage build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationAppendImageTextImage();
            _resultValue.fill = fill;
            _resultValue.fillVar = fillVar;
            _resultValue.size = size;
            _resultValue.sizeVar = sizeVar;
            _resultValue.stroke = stroke;
            _resultValue.strokeSize = strokeSize;
            _resultValue.strokeSizeVar = strokeSizeVar;
            _resultValue.strokeVar = strokeVar;
            _resultValue.text = text;
            _resultValue.textVar = textVar;
            _resultValue.transformation = transformation;
            _resultValue.typeface = typeface;
            _resultValue.typefaceVar = typefaceVar;
            return _resultValue;
        }
    }
}
