// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotAliasTextLogDestination;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class BotAliasTextLogSetting {
    private final BotAliasTextLogDestination destination;
    private final Boolean enabled;

    @CustomType.Constructor
    private BotAliasTextLogSetting(
        @CustomType.Parameter("destination") BotAliasTextLogDestination destination,
        @CustomType.Parameter("enabled") Boolean enabled) {
        this.destination = destination;
        this.enabled = enabled;
    }

    public BotAliasTextLogDestination destination() {
        return this.destination;
    }
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasTextLogDestination destination;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.enabled = defaults.enabled;
        }

        public Builder destination(BotAliasTextLogDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public BotAliasTextLogSetting build() {
            return new BotAliasTextLogSetting(destination, enabled);
        }
    }
}
