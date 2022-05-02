// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex;

import com.pulumi.awsnative.lex.inputs.BotLocaleArgs;
import com.pulumi.awsnative.lex.inputs.BotS3LocationArgs;
import com.pulumi.awsnative.lex.inputs.BotTagArgs;
import com.pulumi.awsnative.lex.inputs.BotTestBotAliasSettingsArgs;
import com.pulumi.awsnative.lex.inputs.DataPrivacyPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotArgs Empty = new BotArgs();

    /**
     * Specifies whether to build the bot locales after bot creation completes.
     * 
     */
    @Import(name="autoBuildBotLocales")
    private @Nullable Output<Boolean> autoBuildBotLocales;

    /**
     * @return Specifies whether to build the bot locales after bot creation completes.
     * 
     */
    public Optional<Output<Boolean>> autoBuildBotLocales() {
        return Optional.ofNullable(this.autoBuildBotLocales);
    }

    @Import(name="botFileS3Location")
    private @Nullable Output<BotS3LocationArgs> botFileS3Location;

    public Optional<Output<BotS3LocationArgs>> botFileS3Location() {
        return Optional.ofNullable(this.botFileS3Location);
    }

    /**
     * List of bot locales
     * 
     */
    @Import(name="botLocales")
    private @Nullable Output<List<BotLocaleArgs>> botLocales;

    /**
     * @return List of bot locales
     * 
     */
    public Optional<Output<List<BotLocaleArgs>>> botLocales() {
        return Optional.ofNullable(this.botLocales);
    }

    /**
     * A list of tags to add to the bot, which can only be added at bot creation.
     * 
     */
    @Import(name="botTags")
    private @Nullable Output<List<BotTagArgs>> botTags;

    /**
     * @return A list of tags to add to the bot, which can only be added at bot creation.
     * 
     */
    public Optional<Output<List<BotTagArgs>>> botTags() {
        return Optional.ofNullable(this.botTags);
    }

    /**
     * Data privacy setting of the Bot.
     * 
     */
    @Import(name="dataPrivacy", required=true)
    private Output<DataPrivacyPropertiesArgs> dataPrivacy;

    /**
     * @return Data privacy setting of the Bot.
     * 
     */
    public Output<DataPrivacyPropertiesArgs> dataPrivacy() {
        return this.dataPrivacy;
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * IdleSessionTTLInSeconds of the resource
     * 
     */
    @Import(name="idleSessionTTLInSeconds", required=true)
    private Output<Integer> idleSessionTTLInSeconds;

    /**
     * @return IdleSessionTTLInSeconds of the resource
     * 
     */
    public Output<Integer> idleSessionTTLInSeconds() {
        return this.idleSessionTTLInSeconds;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="testBotAliasSettings")
    private @Nullable Output<BotTestBotAliasSettingsArgs> testBotAliasSettings;

    public Optional<Output<BotTestBotAliasSettingsArgs>> testBotAliasSettings() {
        return Optional.ofNullable(this.testBotAliasSettings);
    }

    /**
     * A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
     * 
     */
    @Import(name="testBotAliasTags")
    private @Nullable Output<List<BotTagArgs>> testBotAliasTags;

    /**
     * @return A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
     * 
     */
    public Optional<Output<List<BotTagArgs>>> testBotAliasTags() {
        return Optional.ofNullable(this.testBotAliasTags);
    }

    private BotArgs() {}

    private BotArgs(BotArgs $) {
        this.autoBuildBotLocales = $.autoBuildBotLocales;
        this.botFileS3Location = $.botFileS3Location;
        this.botLocales = $.botLocales;
        this.botTags = $.botTags;
        this.dataPrivacy = $.dataPrivacy;
        this.description = $.description;
        this.idleSessionTTLInSeconds = $.idleSessionTTLInSeconds;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.testBotAliasSettings = $.testBotAliasSettings;
        this.testBotAliasTags = $.testBotAliasTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotArgs $;

        public Builder() {
            $ = new BotArgs();
        }

        public Builder(BotArgs defaults) {
            $ = new BotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoBuildBotLocales Specifies whether to build the bot locales after bot creation completes.
         * 
         * @return builder
         * 
         */
        public Builder autoBuildBotLocales(@Nullable Output<Boolean> autoBuildBotLocales) {
            $.autoBuildBotLocales = autoBuildBotLocales;
            return this;
        }

        /**
         * @param autoBuildBotLocales Specifies whether to build the bot locales after bot creation completes.
         * 
         * @return builder
         * 
         */
        public Builder autoBuildBotLocales(Boolean autoBuildBotLocales) {
            return autoBuildBotLocales(Output.of(autoBuildBotLocales));
        }

        public Builder botFileS3Location(@Nullable Output<BotS3LocationArgs> botFileS3Location) {
            $.botFileS3Location = botFileS3Location;
            return this;
        }

        public Builder botFileS3Location(BotS3LocationArgs botFileS3Location) {
            return botFileS3Location(Output.of(botFileS3Location));
        }

        /**
         * @param botLocales List of bot locales
         * 
         * @return builder
         * 
         */
        public Builder botLocales(@Nullable Output<List<BotLocaleArgs>> botLocales) {
            $.botLocales = botLocales;
            return this;
        }

        /**
         * @param botLocales List of bot locales
         * 
         * @return builder
         * 
         */
        public Builder botLocales(List<BotLocaleArgs> botLocales) {
            return botLocales(Output.of(botLocales));
        }

        /**
         * @param botLocales List of bot locales
         * 
         * @return builder
         * 
         */
        public Builder botLocales(BotLocaleArgs... botLocales) {
            return botLocales(List.of(botLocales));
        }

        /**
         * @param botTags A list of tags to add to the bot, which can only be added at bot creation.
         * 
         * @return builder
         * 
         */
        public Builder botTags(@Nullable Output<List<BotTagArgs>> botTags) {
            $.botTags = botTags;
            return this;
        }

        /**
         * @param botTags A list of tags to add to the bot, which can only be added at bot creation.
         * 
         * @return builder
         * 
         */
        public Builder botTags(List<BotTagArgs> botTags) {
            return botTags(Output.of(botTags));
        }

        /**
         * @param botTags A list of tags to add to the bot, which can only be added at bot creation.
         * 
         * @return builder
         * 
         */
        public Builder botTags(BotTagArgs... botTags) {
            return botTags(List.of(botTags));
        }

        /**
         * @param dataPrivacy Data privacy setting of the Bot.
         * 
         * @return builder
         * 
         */
        public Builder dataPrivacy(Output<DataPrivacyPropertiesArgs> dataPrivacy) {
            $.dataPrivacy = dataPrivacy;
            return this;
        }

        /**
         * @param dataPrivacy Data privacy setting of the Bot.
         * 
         * @return builder
         * 
         */
        public Builder dataPrivacy(DataPrivacyPropertiesArgs dataPrivacy) {
            return dataPrivacy(Output.of(dataPrivacy));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param idleSessionTTLInSeconds IdleSessionTTLInSeconds of the resource
         * 
         * @return builder
         * 
         */
        public Builder idleSessionTTLInSeconds(Output<Integer> idleSessionTTLInSeconds) {
            $.idleSessionTTLInSeconds = idleSessionTTLInSeconds;
            return this;
        }

        /**
         * @param idleSessionTTLInSeconds IdleSessionTTLInSeconds of the resource
         * 
         * @return builder
         * 
         */
        public Builder idleSessionTTLInSeconds(Integer idleSessionTTLInSeconds) {
            return idleSessionTTLInSeconds(Output.of(idleSessionTTLInSeconds));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder testBotAliasSettings(@Nullable Output<BotTestBotAliasSettingsArgs> testBotAliasSettings) {
            $.testBotAliasSettings = testBotAliasSettings;
            return this;
        }

        public Builder testBotAliasSettings(BotTestBotAliasSettingsArgs testBotAliasSettings) {
            return testBotAliasSettings(Output.of(testBotAliasSettings));
        }

        /**
         * @param testBotAliasTags A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
         * 
         * @return builder
         * 
         */
        public Builder testBotAliasTags(@Nullable Output<List<BotTagArgs>> testBotAliasTags) {
            $.testBotAliasTags = testBotAliasTags;
            return this;
        }

        /**
         * @param testBotAliasTags A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
         * 
         * @return builder
         * 
         */
        public Builder testBotAliasTags(List<BotTagArgs> testBotAliasTags) {
            return testBotAliasTags(Output.of(testBotAliasTags));
        }

        /**
         * @param testBotAliasTags A list of tags to add to the test alias for a bot, , which can only be added at bot/bot alias creation.
         * 
         * @return builder
         * 
         */
        public Builder testBotAliasTags(BotTagArgs... testBotAliasTags) {
            return testBotAliasTags(List.of(testBotAliasTags));
        }

        public BotArgs build() {
            $.dataPrivacy = Objects.requireNonNull($.dataPrivacy, "expected parameter 'dataPrivacy' to be non-null");
            $.idleSessionTTLInSeconds = Objects.requireNonNull($.idleSessionTTLInSeconds, "expected parameter 'idleSessionTTLInSeconds' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
