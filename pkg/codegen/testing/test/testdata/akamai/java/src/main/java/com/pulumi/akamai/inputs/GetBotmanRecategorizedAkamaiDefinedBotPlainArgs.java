// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanRecategorizedAkamaiDefinedBotPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanRecategorizedAkamaiDefinedBotPlainArgs Empty = new GetBotmanRecategorizedAkamaiDefinedBotPlainArgs();

    @Import(name="botId")
    private @Nullable String botId;

    public Optional<String> botId() {
        return Optional.ofNullable(this.botId);
    }

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    private GetBotmanRecategorizedAkamaiDefinedBotPlainArgs() {}

    private GetBotmanRecategorizedAkamaiDefinedBotPlainArgs(GetBotmanRecategorizedAkamaiDefinedBotPlainArgs $) {
        this.botId = $.botId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanRecategorizedAkamaiDefinedBotPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanRecategorizedAkamaiDefinedBotPlainArgs $;

        public Builder() {
            $ = new GetBotmanRecategorizedAkamaiDefinedBotPlainArgs();
        }

        public Builder(GetBotmanRecategorizedAkamaiDefinedBotPlainArgs defaults) {
            $ = new GetBotmanRecategorizedAkamaiDefinedBotPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder botId(@Nullable String botId) {
            $.botId = botId;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public GetBotmanRecategorizedAkamaiDefinedBotPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
