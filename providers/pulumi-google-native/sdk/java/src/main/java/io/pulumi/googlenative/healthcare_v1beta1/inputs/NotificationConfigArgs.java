// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies where to send notifications upon changes to a data store.
 * 
 */
public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    /**
     * The [Pub/Sub](https://cloud.google.com/pubsub/docs/) topic that notifications of changes are published on. Supplied by the client. PubsubMessage.Data contains the resource name. PubsubMessage.MessageId is the ID of this message. It is guaranteed to be unique within the topic. PubsubMessage.PublishTime is the time at which the message was published. Notifications are only sent if the topic is non-empty. [Topic names](https://cloud.google.com/pubsub/docs/overview#names) must be scoped to a project. Cloud Healthcare API service account must have publisher permissions on the given Pub/Sub topic. Not having adequate permissions causes the calls that send notifications to fail. If a notification can't be published to Pub/Sub, errors are logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)). If the number of errors exceeds a certain rate, some aren't submitted. Note that not all operations trigger notifications, see [Configuring Pub/Sub notifications](https://cloud.google.com/healthcare/docs/how-tos/pubsub) for specific details.
     * 
     */
    @InputImport(name="pubsubTopic")
    private final @Nullable Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Input.empty() : this.pubsubTopic;
    }

    /**
     * Indicates whether or not to send Pub/Sub notifications on bulk import. Only supported for DICOM imports.
     * 
     */
    @InputImport(name="sendForBulkImport")
    private final @Nullable Input<Boolean> sendForBulkImport;

    public Input<Boolean> getSendForBulkImport() {
        return this.sendForBulkImport == null ? Input.empty() : this.sendForBulkImport;
    }

    public NotificationConfigArgs(
        @Nullable Input<String> pubsubTopic,
        @Nullable Input<Boolean> sendForBulkImport) {
        this.pubsubTopic = pubsubTopic;
        this.sendForBulkImport = sendForBulkImport;
    }

    private NotificationConfigArgs() {
        this.pubsubTopic = Input.empty();
        this.sendForBulkImport = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pubsubTopic;
        private @Nullable Input<Boolean> sendForBulkImport;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.sendForBulkImport = defaults.sendForBulkImport;
        }

        public Builder setPubsubTopic(@Nullable Input<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder setPubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Input.ofNullable(pubsubTopic);
            return this;
        }

        public Builder setSendForBulkImport(@Nullable Input<Boolean> sendForBulkImport) {
            this.sendForBulkImport = sendForBulkImport;
            return this;
        }

        public Builder setSendForBulkImport(@Nullable Boolean sendForBulkImport) {
            this.sendForBulkImport = Input.ofNullable(sendForBulkImport);
            return this;
        }

        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(pubsubTopic, sendForBulkImport);
        }
    }
}
