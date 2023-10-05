// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetAppSecVersionNotesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecVersionNotesArgs Empty = new GetAppSecVersionNotesArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetAppSecVersionNotesArgs() {}

    private GetAppSecVersionNotesArgs(GetAppSecVersionNotesArgs $) {
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecVersionNotesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecVersionNotesArgs $;

        public Builder() {
            $ = new GetAppSecVersionNotesArgs();
        }

        public Builder(GetAppSecVersionNotesArgs defaults) {
            $ = new GetAppSecVersionNotesArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetAppSecVersionNotesArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
