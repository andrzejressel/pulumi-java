// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIamStatesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIamStatesArgs Empty = new GetIamStatesArgs();

    @Import(name="country", required=true)
    private Output<String> country;

    public Output<String> country() {
        return this.country;
    }

    private GetIamStatesArgs() {}

    private GetIamStatesArgs(GetIamStatesArgs $) {
        this.country = $.country;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIamStatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIamStatesArgs $;

        public Builder() {
            $ = new GetIamStatesArgs();
        }

        public Builder(GetIamStatesArgs defaults) {
            $ = new GetIamStatesArgs(Objects.requireNonNull(defaults));
        }

        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        public Builder country(String country) {
            return country(Output.of(country));
        }

        public GetIamStatesArgs build() {
            $.country = Objects.requireNonNull($.country, "expected parameter 'country' to be non-null");
            return $;
        }
    }

}
