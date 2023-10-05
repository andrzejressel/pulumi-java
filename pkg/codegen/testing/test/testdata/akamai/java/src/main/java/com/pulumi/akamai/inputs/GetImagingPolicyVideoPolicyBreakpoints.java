// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyVideoPolicyBreakpoints extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyVideoPolicyBreakpoints Empty = new GetImagingPolicyVideoPolicyBreakpoints();

    @Import(name="widths")
    private @Nullable List<Integer> widths;

    public Optional<List<Integer>> widths() {
        return Optional.ofNullable(this.widths);
    }

    private GetImagingPolicyVideoPolicyBreakpoints() {}

    private GetImagingPolicyVideoPolicyBreakpoints(GetImagingPolicyVideoPolicyBreakpoints $) {
        this.widths = $.widths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyBreakpoints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyBreakpoints $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyBreakpoints();
        }

        public Builder(GetImagingPolicyVideoPolicyBreakpoints defaults) {
            $ = new GetImagingPolicyVideoPolicyBreakpoints(Objects.requireNonNull(defaults));
        }

        public Builder widths(@Nullable List<Integer> widths) {
            $.widths = widths;
            return this;
        }

        public Builder widths(Integer... widths) {
            return widths(List.of(widths));
        }

        public GetImagingPolicyVideoPolicyBreakpoints build() {
            return $;
        }
    }

}
