// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.securitycenter_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.securitycenter_v1.inputs.StreamingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    @InputImport(name="configId", required=true)
    private final Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId;
    }

    /**
     * The description of the notification config (max of 1024 characters).
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The relative resource name of this notification config. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * The Pub/Sub topic to send notifications to. Its format is "projects/[project_id]/topics/[topic]".
     * 
     */
    @InputImport(name="pubsubTopic")
    private final @Nullable Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Input.empty() : this.pubsubTopic;
    }

    /**
     * The config for triggering streaming-based notifications.
     * 
     */
    @InputImport(name="streamingConfig")
    private final @Nullable Input<StreamingConfigArgs> streamingConfig;

    public Input<StreamingConfigArgs> getStreamingConfig() {
        return this.streamingConfig == null ? Input.empty() : this.streamingConfig;
    }

    public NotificationConfigArgs(
        Input<String> configId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<String> pubsubTopic,
        @Nullable Input<StreamingConfigArgs> streamingConfig) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.description = description;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.pubsubTopic = pubsubTopic;
        this.streamingConfig = streamingConfig;
    }

    private NotificationConfigArgs() {
        this.configId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.pubsubTopic = Input.empty();
        this.streamingConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<String> pubsubTopic;
        private @Nullable Input<StreamingConfigArgs> streamingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.streamingConfig = defaults.streamingConfig;
        }

        public Builder setConfigId(Input<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder setConfigId(String configId) {
            this.configId = Input.of(Objects.requireNonNull(configId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setPubsubTopic(@Nullable Input<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder setPubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Input.ofNullable(pubsubTopic);
            return this;
        }

        public Builder setStreamingConfig(@Nullable Input<StreamingConfigArgs> streamingConfig) {
            this.streamingConfig = streamingConfig;
            return this;
        }

        public Builder setStreamingConfig(@Nullable StreamingConfigArgs streamingConfig) {
            this.streamingConfig = Input.ofNullable(streamingConfig);
            return this;
        }

        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(configId, description, name, organizationId, pubsubTopic, streamingConfig);
        }
    }
}
