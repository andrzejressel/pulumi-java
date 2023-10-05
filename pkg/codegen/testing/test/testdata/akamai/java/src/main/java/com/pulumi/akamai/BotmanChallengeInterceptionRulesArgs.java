// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanChallengeInterceptionRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanChallengeInterceptionRulesArgs Empty = new BotmanChallengeInterceptionRulesArgs();

    @Import(name="challengeInterceptionRules", required=true)
    private Output<String> challengeInterceptionRules;

    public Output<String> challengeInterceptionRules() {
        return this.challengeInterceptionRules;
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private BotmanChallengeInterceptionRulesArgs() {}

    private BotmanChallengeInterceptionRulesArgs(BotmanChallengeInterceptionRulesArgs $) {
        this.challengeInterceptionRules = $.challengeInterceptionRules;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanChallengeInterceptionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanChallengeInterceptionRulesArgs $;

        public Builder() {
            $ = new BotmanChallengeInterceptionRulesArgs();
        }

        public Builder(BotmanChallengeInterceptionRulesArgs defaults) {
            $ = new BotmanChallengeInterceptionRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder challengeInterceptionRules(Output<String> challengeInterceptionRules) {
            $.challengeInterceptionRules = challengeInterceptionRules;
            return this;
        }

        public Builder challengeInterceptionRules(String challengeInterceptionRules) {
            return challengeInterceptionRules(Output.of(challengeInterceptionRules));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanChallengeInterceptionRulesArgs build() {
            $.challengeInterceptionRules = Objects.requireNonNull($.challengeInterceptionRules, "expected parameter 'challengeInterceptionRules' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
