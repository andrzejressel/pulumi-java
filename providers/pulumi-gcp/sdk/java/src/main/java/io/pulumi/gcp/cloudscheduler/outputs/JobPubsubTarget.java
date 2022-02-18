// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobPubsubTarget {
    /**
     * Attributes for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    private final @Nullable Map<String,String> attributes;
    /**
     * The message payload for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * A base64-encoded string.
     * 
     */
    private final @Nullable String data;
    /**
     * The full resource name for the Cloud Pub/Sub topic to which
     * messages will be published when a job is delivered. ~>**NOTE:**
     * The topic name must be in the same format as required by PubSub's
     * PublishRequest.name, e.g. `projects/my-project/topics/my-topic`.
     * 
     */
    private final String topicName;

    @OutputCustomType.Constructor({"attributes","data","topicName"})
    private JobPubsubTarget(
        @Nullable Map<String,String> attributes,
        @Nullable String data,
        String topicName) {
        this.attributes = attributes;
        this.data = data;
        this.topicName = Objects.requireNonNull(topicName);
    }

    /**
     * Attributes for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * 
     */
    public Map<String,String> getAttributes() {
        return this.attributes == null ? Map.of() : this.attributes;
    }
    /**
     * The message payload for PubsubMessage.
     * Pubsub message must contain either non-empty data, or at least one attribute.
     * A base64-encoded string.
     * 
     */
    public Optional<String> getData() {
        return Optional.ofNullable(this.data);
    }
    /**
     * The full resource name for the Cloud Pub/Sub topic to which
     * messages will be published when a job is delivered. ~>**NOTE:**
     * The topic name must be in the same format as required by PubSub's
     * PublishRequest.name, e.g. `projects/my-project/topics/my-topic`.
     * 
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPubsubTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> attributes;
        private @Nullable String data;
        private String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPubsubTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.data = defaults.data;
    	      this.topicName = defaults.topicName;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setData(@Nullable String data) {
            this.data = data;
            return this;
        }

        public Builder setTopicName(String topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }

        public JobPubsubTarget build() {
            return new JobPubsubTarget(attributes, data, topicName);
        }
    }
}
