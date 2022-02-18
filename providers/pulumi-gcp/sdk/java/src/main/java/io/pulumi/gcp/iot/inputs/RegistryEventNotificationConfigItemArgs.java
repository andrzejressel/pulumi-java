// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemArgs Empty = new RegistryEventNotificationConfigItemArgs();

    /**
     * PubSub topic name to publish device events.
     * 
     */
    @InputImport(name="pubsubTopicName", required=true)
    private final Input<String> pubsubTopicName;

    public Input<String> getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    /**
     * If the subfolder name matches this string exactly, this
     * configuration will be used. The string must not include the
     * leading '/' character. If empty, all strings are matched. Empty
     * value can only be used for the last `event_notification_configs`
     * item.
     * 
     */
    @InputImport(name="subfolderMatches")
    private final @Nullable Input<String> subfolderMatches;

    public Input<String> getSubfolderMatches() {
        return this.subfolderMatches == null ? Input.empty() : this.subfolderMatches;
    }

    public RegistryEventNotificationConfigItemArgs(
        Input<String> pubsubTopicName,
        @Nullable Input<String> subfolderMatches) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
        this.subfolderMatches = subfolderMatches;
    }

    private RegistryEventNotificationConfigItemArgs() {
        this.pubsubTopicName = Input.empty();
        this.subfolderMatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEventNotificationConfigItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> pubsubTopicName;
        private @Nullable Input<String> subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryEventNotificationConfigItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder setPubsubTopicName(Input<String> pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }

        public Builder setPubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Input.of(Objects.requireNonNull(pubsubTopicName));
            return this;
        }

        public Builder setSubfolderMatches(@Nullable Input<String> subfolderMatches) {
            this.subfolderMatches = subfolderMatches;
            return this;
        }

        public Builder setSubfolderMatches(@Nullable String subfolderMatches) {
            this.subfolderMatches = Input.ofNullable(subfolderMatches);
            return this;
        }

        public RegistryEventNotificationConfigItemArgs build() {
            return new RegistryEventNotificationConfigItemArgs(pubsubTopicName, subfolderMatches);
        }
    }
}
