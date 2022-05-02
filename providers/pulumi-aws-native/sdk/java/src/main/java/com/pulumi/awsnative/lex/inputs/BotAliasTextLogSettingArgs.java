// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotAliasTextLogDestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasTextLogSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotAliasTextLogSettingArgs Empty = new BotAliasTextLogSettingArgs();

    @Import(name="destination", required=true)
    private Output<BotAliasTextLogDestinationArgs> destination;

    public Output<BotAliasTextLogDestinationArgs> destination() {
        return this.destination;
    }

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BotAliasTextLogSettingArgs() {}

    private BotAliasTextLogSettingArgs(BotAliasTextLogSettingArgs $) {
        this.destination = $.destination;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasTextLogSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasTextLogSettingArgs $;

        public Builder() {
            $ = new BotAliasTextLogSettingArgs();
        }

        public Builder(BotAliasTextLogSettingArgs defaults) {
            $ = new BotAliasTextLogSettingArgs(Objects.requireNonNull(defaults));
        }

        public Builder destination(Output<BotAliasTextLogDestinationArgs> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(BotAliasTextLogDestinationArgs destination) {
            return destination(Output.of(destination));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BotAliasTextLogSettingArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
