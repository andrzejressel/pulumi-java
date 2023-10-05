// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeAnchor;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape();

    @Import(name="anchor", required=true)
    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeAnchor anchor;

    public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeAnchor anchor() {
        return this.anchor;
    }

    @Import(name="height")
    private @Nullable String height;

    public Optional<String> height() {
        return Optional.ofNullable(this.height);
    }

    @Import(name="heightVar")
    private @Nullable String heightVar;

    public Optional<String> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    @Import(name="width")
    private @Nullable String width;

    public Optional<String> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthVar")
    private @Nullable String widthVar;

    public Optional<String> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape $) {
        this.anchor = $.anchor;
        this.height = $.height;
        this.heightVar = $.heightVar;
        this.width = $.width;
        this.widthVar = $.widthVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape(Objects.requireNonNull(defaults));
        }

        public Builder anchor(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShapeAnchor anchor) {
            $.anchor = anchor;
            return this;
        }

        public Builder height(@Nullable String height) {
            $.height = height;
            return this;
        }

        public Builder heightVar(@Nullable String heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        public Builder width(@Nullable String width) {
            $.width = width;
            return this;
        }

        public Builder widthVar(@Nullable String widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestUnionShapeShapeRectangleShape build() {
            $.anchor = Objects.requireNonNull($.anchor, "expected parameter 'anchor' to be non-null");
            return $;
        }
    }

}
