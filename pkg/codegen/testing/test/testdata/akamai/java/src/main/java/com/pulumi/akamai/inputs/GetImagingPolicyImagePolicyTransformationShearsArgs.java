// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyImagePolicyTransformationShearsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetImagingPolicyImagePolicyTransformationShearsArgs Empty = new GetImagingPolicyImagePolicyTransformationShearsArgs();

    @Import(name="xShear")
    private @Nullable Output<String> xShear;

    public Optional<Output<String>> xShear() {
        return Optional.ofNullable(this.xShear);
    }

    @Import(name="xShearVar")
    private @Nullable Output<String> xShearVar;

    public Optional<Output<String>> xShearVar() {
        return Optional.ofNullable(this.xShearVar);
    }

    @Import(name="yShear")
    private @Nullable Output<String> yShear;

    public Optional<Output<String>> yShear() {
        return Optional.ofNullable(this.yShear);
    }

    @Import(name="yShearVar")
    private @Nullable Output<String> yShearVar;

    public Optional<Output<String>> yShearVar() {
        return Optional.ofNullable(this.yShearVar);
    }

    private GetImagingPolicyImagePolicyTransformationShearsArgs() {}

    private GetImagingPolicyImagePolicyTransformationShearsArgs(GetImagingPolicyImagePolicyTransformationShearsArgs $) {
        this.xShear = $.xShear;
        this.xShearVar = $.xShearVar;
        this.yShear = $.yShear;
        this.yShearVar = $.yShearVar;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyImagePolicyTransformationShearsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyImagePolicyTransformationShearsArgs $;

        public Builder() {
            $ = new GetImagingPolicyImagePolicyTransformationShearsArgs();
        }

        public Builder(GetImagingPolicyImagePolicyTransformationShearsArgs defaults) {
            $ = new GetImagingPolicyImagePolicyTransformationShearsArgs(Objects.requireNonNull(defaults));
        }

        public Builder xShear(@Nullable Output<String> xShear) {
            $.xShear = xShear;
            return this;
        }

        public Builder xShear(String xShear) {
            return xShear(Output.of(xShear));
        }

        public Builder xShearVar(@Nullable Output<String> xShearVar) {
            $.xShearVar = xShearVar;
            return this;
        }

        public Builder xShearVar(String xShearVar) {
            return xShearVar(Output.of(xShearVar));
        }

        public Builder yShear(@Nullable Output<String> yShear) {
            $.yShear = yShear;
            return this;
        }

        public Builder yShear(String yShear) {
            return yShear(Output.of(yShear));
        }

        public Builder yShearVar(@Nullable Output<String> yShearVar) {
            $.yShearVar = yShearVar;
            return this;
        }

        public Builder yShearVar(String yShearVar) {
            return yShearVar(Output.of(yShearVar));
        }

        public GetImagingPolicyImagePolicyTransformationShearsArgs build() {
            return $;
        }
    }

}
