// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerPubsubConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerPubsubConfigGetArgs Empty = new TriggerPubsubConfigGetArgs();

    /**
     * Service account that will make the push request.
     * 
     */
    @InputImport(name="serviceAccountEmail")
    private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * - 
     * Output only. Name of the subscription.
     * 
     */
    @InputImport(name="subscription")
    private final @Nullable Input<String> subscription;

    public Input<String> getSubscription() {
        return this.subscription == null ? Input.empty() : this.subscription;
    }

    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public TriggerPubsubConfigGetArgs(
        @Nullable Input<String> serviceAccountEmail,
        @Nullable Input<String> state,
        @Nullable Input<String> subscription,
        Input<String> topic) {
        this.serviceAccountEmail = serviceAccountEmail;
        this.state = state;
        this.subscription = subscription;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TriggerPubsubConfigGetArgs() {
        this.serviceAccountEmail = Input.empty();
        this.state = Input.empty();
        this.subscription = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPubsubConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> serviceAccountEmail;
        private @Nullable Input<String> state;
        private @Nullable Input<String> subscription;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPubsubConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.state = defaults.state;
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder setServiceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder setServiceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSubscription(@Nullable Input<String> subscription) {
            this.subscription = subscription;
            return this;
        }

        public Builder setSubscription(@Nullable String subscription) {
            this.subscription = Input.ofNullable(subscription);
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public TriggerPubsubConfigGetArgs build() {
            return new TriggerPubsubConfigGetArgs(serviceAccountEmail, state, subscription, topic);
        }
    }
}
