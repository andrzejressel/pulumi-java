// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanCustomBotCategoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomBotCategoryPlainArgs Empty = new GetBotmanCustomBotCategoryPlainArgs();

    @Import(name="categoryId")
    private @Nullable String categoryId;

    public Optional<String> categoryId() {
        return Optional.ofNullable(this.categoryId);
    }

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    private GetBotmanCustomBotCategoryPlainArgs() {}

    private GetBotmanCustomBotCategoryPlainArgs(GetBotmanCustomBotCategoryPlainArgs $) {
        this.categoryId = $.categoryId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomBotCategoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomBotCategoryPlainArgs $;

        public Builder() {
            $ = new GetBotmanCustomBotCategoryPlainArgs();
        }

        public Builder(GetBotmanCustomBotCategoryPlainArgs defaults) {
            $ = new GetBotmanCustomBotCategoryPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder categoryId(@Nullable String categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public GetBotmanCustomBotCategoryPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
