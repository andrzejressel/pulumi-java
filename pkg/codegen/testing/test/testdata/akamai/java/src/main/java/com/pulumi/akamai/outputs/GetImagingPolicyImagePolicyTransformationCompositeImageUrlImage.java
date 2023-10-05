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
public final class GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage {
    private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
    private @Nullable String url;
    private @Nullable String urlVar;

    private GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage() {}
    public Optional<GetImagingPolicyImagePolicyTransformation> transformation() {
        return Optional.ofNullable(this.transformation);
    }
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    public Optional<String> urlVar() {
        return Optional.ofNullable(this.urlVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetImagingPolicyImagePolicyTransformation transformation;
        private @Nullable String url;
        private @Nullable String urlVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transformation = defaults.transformation;
    	      this.url = defaults.url;
    	      this.urlVar = defaults.urlVar;
        }

        @CustomType.Setter
        public Builder transformation(@Nullable GetImagingPolicyImagePolicyTransformation transformation) {
            this.transformation = transformation;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder urlVar(@Nullable String urlVar) {
            this.urlVar = urlVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationCompositeImageUrlImage();
            _resultValue.transformation = transformation;
            _resultValue.url = url;
            _resultValue.urlVar = urlVar;
            return _resultValue;
        }
    }
}
