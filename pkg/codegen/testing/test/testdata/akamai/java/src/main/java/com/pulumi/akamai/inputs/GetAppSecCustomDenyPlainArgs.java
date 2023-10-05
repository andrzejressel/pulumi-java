// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecCustomDenyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecCustomDenyPlainArgs Empty = new GetAppSecCustomDenyPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="customDenyId")
    private @Nullable String customDenyId;

    public Optional<String> customDenyId() {
        return Optional.ofNullable(this.customDenyId);
    }

    private GetAppSecCustomDenyPlainArgs() {}

    private GetAppSecCustomDenyPlainArgs(GetAppSecCustomDenyPlainArgs $) {
        this.configId = $.configId;
        this.customDenyId = $.customDenyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecCustomDenyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecCustomDenyPlainArgs $;

        public Builder() {
            $ = new GetAppSecCustomDenyPlainArgs();
        }

        public Builder(GetAppSecCustomDenyPlainArgs defaults) {
            $ = new GetAppSecCustomDenyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder customDenyId(@Nullable String customDenyId) {
            $.customDenyId = customDenyId;
            return this;
        }

        public GetAppSecCustomDenyPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
