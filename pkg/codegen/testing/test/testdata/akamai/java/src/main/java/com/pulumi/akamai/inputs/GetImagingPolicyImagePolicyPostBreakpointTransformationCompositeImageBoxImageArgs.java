// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs Empty = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs();

    @Import(name="color")
    private @Nullable Output<String> color;

    public Optional<Output<String>> color() {
        return Optional.ofNullable(this.color);
    }

    @Import(name="colorVar")
    private @Nullable Output<String> colorVar;

    public Optional<Output<String>> colorVar() {
        return Optional.ofNullable(this.colorVar);
    }

    @Import(name="height")
    private @Nullable Output<String> height;

    public Optional<Output<String>> height() {
        return Optional.ofNullable(this.height);
    }

    @Import(name="heightVar")
    private @Nullable Output<String> heightVar;

    public Optional<Output<String>> heightVar() {
        return Optional.ofNullable(this.heightVar);
    }

    @Import(name="transformation")
    private @Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> transformation;

    public Optional<Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs>> transformation() {
        return Optional.ofNullable(this.transformation);
    }

    @Import(name="width")
    private @Nullable Output<String> width;

    public Optional<Output<String>> width() {
        return Optional.ofNullable(this.width);
    }

    @Import(name="widthVar")
    private @Nullable Output<String> widthVar;

    public Optional<Output<String>> widthVar() {
        return Optional.ofNullable(this.widthVar);
    }

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs() {}

    private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs $) {
        this.color = $.color;
        this.colorVar = $.colorVar;
        this.height = $.height;
        this.heightVar = $.heightVar;
        this.transformation = $.transformation;
        this.width = $.width;
        this.widthVar = $.widthVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs();
        }

        public Builder(GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs defaults) {
            $ = new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder color(@Nullable Output<String> color) {
            $.color = color;
            return this;
        }

        public Builder color(String color) {
            return color(Output.of(color));
        }

        public Builder colorVar(@Nullable Output<String> colorVar) {
            $.colorVar = colorVar;
            return this;
        }

        public Builder colorVar(String colorVar) {
            return colorVar(Output.of(colorVar));
        }

        public Builder height(@Nullable Output<String> height) {
            $.height = height;
            return this;
        }

        public Builder height(String height) {
            return height(Output.of(height));
        }

        public Builder heightVar(@Nullable Output<String> heightVar) {
            $.heightVar = heightVar;
            return this;
        }

        public Builder heightVar(String heightVar) {
            return heightVar(Output.of(heightVar));
        }

        public Builder transformation(@Nullable Output<GetImagingPolicyImagePolicyPostBreakpointTransformationArgs> transformation) {
            $.transformation = transformation;
            return this;
        }

        public Builder transformation(GetImagingPolicyImagePolicyPostBreakpointTransformationArgs transformation) {
            return transformation(Output.of(transformation));
        }

        public Builder width(@Nullable Output<String> width) {
            $.width = width;
            return this;
        }

        public Builder width(String width) {
            return width(Output.of(width));
        }

        public Builder widthVar(@Nullable Output<String> widthVar) {
            $.widthVar = widthVar;
            return this;
        }

        public Builder widthVar(String widthVar) {
            return widthVar(Output.of(widthVar));
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs build() {
            return $;
        }
    }

}
