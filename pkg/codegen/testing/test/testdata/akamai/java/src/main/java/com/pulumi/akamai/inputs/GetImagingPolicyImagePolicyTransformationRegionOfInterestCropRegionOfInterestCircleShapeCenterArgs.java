// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs Empty = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs();

    @Import(name="x")
    private @Nullable Output<String> x;

    public Optional<Output<String>> x() {
        return Optional.ofNullable(this.x);
    }

    @Import(name="xVar")
    private @Nullable Output<String> xVar;

    public Optional<Output<String>> xVar() {
        return Optional.ofNullable(this.xVar);
    }

    @Import(name="y")
    private @Nullable Output<String> y;

    public Optional<Output<String>> y() {
        return Optional.ofNullable(this.y);
    }

    @Import(name="yVar")
    private @Nullable Output<String> yVar;

    public Optional<Output<String>> yVar() {
        return Optional.ofNullable(this.yVar);
    }

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs() {}

    private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs $) {
        this.x = $.x;
        this.xVar = $.xVar;
        this.y = $.y;
        this.yVar = $.yVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs(Objects.requireNonNull(defaults));
        }

        public Builder x(@Nullable Output<String> x) {
            $.x = x;
            return this;
        }

        public Builder x(String x) {
            return x(Output.of(x));
        }

        public Builder xVar(@Nullable Output<String> xVar) {
            $.xVar = xVar;
            return this;
        }

        public Builder xVar(String xVar) {
            return xVar(Output.of(xVar));
        }

        public Builder y(@Nullable Output<String> y) {
            $.y = y;
            return this;
        }

        public Builder y(String y) {
            return y(Output.of(y));
        }

        public Builder yVar(@Nullable Output<String> yVar) {
            $.yVar = yVar;
            return this;
        }

        public Builder yVar(String yVar) {
            return yVar(Output.of(yVar));
        }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestCircleShapeCenterArgs build() {
            return $;
        }
    }

}
