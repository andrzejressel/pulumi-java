// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.outputs.BotCloudWatchLogGroupLogDestination;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class BotTextLogDestination {
    private final BotCloudWatchLogGroupLogDestination cloudWatch;

    @CustomType.Constructor
    private BotTextLogDestination(@CustomType.Parameter("cloudWatch") BotCloudWatchLogGroupLogDestination cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    public BotCloudWatchLogGroupLogDestination cloudWatch() {
        return this.cloudWatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotTextLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotCloudWatchLogGroupLogDestination cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotTextLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder cloudWatch(BotCloudWatchLogGroupLogDestination cloudWatch) {
            this.cloudWatch = Objects.requireNonNull(cloudWatch);
            return this;
        }        public BotTextLogDestination build() {
            return new BotTextLogDestination(cloudWatch);
        }
    }
}
