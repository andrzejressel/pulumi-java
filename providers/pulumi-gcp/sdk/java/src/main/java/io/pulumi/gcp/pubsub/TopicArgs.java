// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs;
import io.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * The resource name of the Cloud KMS CryptoKey to be used to protect access
     * to messages published on this topic. Your project's PubSub service account
     * (`service-{{PROJECT_NUMBER}}@gcp-sa-pubsub.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * The expected format is `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * A set of key/value label pairs to assign to this Topic.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Indicates the minimum duration to retain a message after it is published
     * to the topic. If this field is set, messages published to the topic in
     * the last messageRetentionDuration are always available to subscribers.
     * For instance, it allows any attached subscription to seek to a timestamp
     * that is up to messageRetentionDuration in the past. If this field is not
     * set, message retention is controlled by settings on individual subscriptions.
     * Cannot be more than 7 days or less than 10 minutes.
     * 
     */
    @InputImport(name="messageRetentionDuration")
    private final @Nullable Input<String> messageRetentionDuration;

    public Input<String> getMessageRetentionDuration() {
        return this.messageRetentionDuration == null ? Input.empty() : this.messageRetentionDuration;
    }

    /**
     * Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * 
     */
    @InputImport(name="messageStoragePolicy")
    private final @Nullable Input<TopicMessageStoragePolicyArgs> messageStoragePolicy;

    public Input<TopicMessageStoragePolicyArgs> getMessageStoragePolicy() {
        return this.messageStoragePolicy == null ? Input.empty() : this.messageStoragePolicy;
    }

    /**
     * Name of the topic.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Settings for validating messages published against a schema.
     * Structure is documented below.
     * 
     */
    @InputImport(name="schemaSettings")
    private final @Nullable Input<TopicSchemaSettingsArgs> schemaSettings;

    public Input<TopicSchemaSettingsArgs> getSchemaSettings() {
        return this.schemaSettings == null ? Input.empty() : this.schemaSettings;
    }

    public TopicArgs(
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> messageRetentionDuration,
        @Nullable Input<TopicMessageStoragePolicyArgs> messageStoragePolicy,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<TopicSchemaSettingsArgs> schemaSettings) {
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.messageRetentionDuration = messageRetentionDuration;
        this.messageStoragePolicy = messageStoragePolicy;
        this.name = name;
        this.project = project;
        this.schemaSettings = schemaSettings;
    }

    private TopicArgs() {
        this.kmsKeyName = Input.empty();
        this.labels = Input.empty();
        this.messageRetentionDuration = Input.empty();
        this.messageStoragePolicy = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.schemaSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> messageRetentionDuration;
        private @Nullable Input<TopicMessageStoragePolicyArgs> messageStoragePolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<TopicSchemaSettingsArgs> schemaSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.messageStoragePolicy = defaults.messageStoragePolicy;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.schemaSettings = defaults.schemaSettings;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMessageRetentionDuration(@Nullable Input<String> messageRetentionDuration) {
            this.messageRetentionDuration = messageRetentionDuration;
            return this;
        }

        public Builder setMessageRetentionDuration(@Nullable String messageRetentionDuration) {
            this.messageRetentionDuration = Input.ofNullable(messageRetentionDuration);
            return this;
        }

        public Builder setMessageStoragePolicy(@Nullable Input<TopicMessageStoragePolicyArgs> messageStoragePolicy) {
            this.messageStoragePolicy = messageStoragePolicy;
            return this;
        }

        public Builder setMessageStoragePolicy(@Nullable TopicMessageStoragePolicyArgs messageStoragePolicy) {
            this.messageStoragePolicy = Input.ofNullable(messageStoragePolicy);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSchemaSettings(@Nullable Input<TopicSchemaSettingsArgs> schemaSettings) {
            this.schemaSettings = schemaSettings;
            return this;
        }

        public Builder setSchemaSettings(@Nullable TopicSchemaSettingsArgs schemaSettings) {
            this.schemaSettings = Input.ofNullable(schemaSettings);
            return this;
        }

        public TopicArgs build() {
            return new TopicArgs(kmsKeyName, labels, messageRetentionDuration, messageStoragePolicy, name, project, schemaSettings);
        }
    }
}
