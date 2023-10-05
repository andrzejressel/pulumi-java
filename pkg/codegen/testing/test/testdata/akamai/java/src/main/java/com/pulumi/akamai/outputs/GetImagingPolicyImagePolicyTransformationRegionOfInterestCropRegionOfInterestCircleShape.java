// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape {
    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center;
    private @Nullable String radius;
    private @Nullable String radiusVar;

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape() {}
    public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center() {
        return this.center;
    }
    public Optional<String> radius() {
        return Optional.ofNullable(this.radius);
    }
    public Optional<String> radiusVar() {
        return Optional.ofNullable(this.radiusVar);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center;
        private @Nullable String radius;
        private @Nullable String radiusVar;
        public Builder() {}
        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.center = defaults.center;
    	      this.radius = defaults.radius;
    	      this.radiusVar = defaults.radiusVar;
        }

        @CustomType.Setter
        public Builder center(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenter center) {
            this.center = Objects.requireNonNull(center);
            return this;
        }
        @CustomType.Setter
        public Builder radius(@Nullable String radius) {
            this.radius = radius;
            return this;
        }
        @CustomType.Setter
        public Builder radiusVar(@Nullable String radiusVar) {
            this.radiusVar = radiusVar;
            return this;
        }
        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape build() {
            final var _resultValue = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShape();
            _resultValue.center = center;
            _resultValue.radius = radius;
            _resultValue.radiusVar = radiusVar;
            return _resultValue;
        }
    }
}
