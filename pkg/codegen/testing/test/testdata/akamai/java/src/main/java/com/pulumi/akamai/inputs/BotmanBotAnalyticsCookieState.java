// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotmanBotAnalyticsCookieState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanBotAnalyticsCookieState Empty = new BotmanBotAnalyticsCookieState();

    @Import(name="botAnalyticsCookie")
    private @Nullable Output<String> botAnalyticsCookie;

    public Optional<Output<String>> botAnalyticsCookie() {
        return Optional.ofNullable(this.botAnalyticsCookie);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    private BotmanBotAnalyticsCookieState() {}

    private BotmanBotAnalyticsCookieState(BotmanBotAnalyticsCookieState $) {
        this.botAnalyticsCookie = $.botAnalyticsCookie;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanBotAnalyticsCookieState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanBotAnalyticsCookieState $;

        public Builder() {
            $ = new BotmanBotAnalyticsCookieState();
        }

        public Builder(BotmanBotAnalyticsCookieState defaults) {
            $ = new BotmanBotAnalyticsCookieState(Objects.requireNonNull(defaults));
        }

        public Builder botAnalyticsCookie(@Nullable Output<String> botAnalyticsCookie) {
            $.botAnalyticsCookie = botAnalyticsCookie;
            return this;
        }

        public Builder botAnalyticsCookie(String botAnalyticsCookie) {
            return botAnalyticsCookie(Output.of(botAnalyticsCookie));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanBotAnalyticsCookieState build() {
            return $;
        }
    }

}
