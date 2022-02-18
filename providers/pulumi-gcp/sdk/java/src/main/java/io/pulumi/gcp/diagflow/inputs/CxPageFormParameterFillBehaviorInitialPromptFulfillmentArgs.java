// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs();

    /**
     * The list of rich message responses to present to the user.
     * Structure is documented below.
     * 
     */
    @InputImport(name="messages")
    private final @Nullable Input<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages;

    public Input<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> getMessages() {
        return this.messages == null ? Input.empty() : this.messages;
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @InputImport(name="returnPartialResponses")
    private final @Nullable Input<Boolean> returnPartialResponses;

    public Input<Boolean> getReturnPartialResponses() {
        return this.returnPartialResponses == null ? Input.empty() : this.returnPartialResponses;
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if webhook is specified.
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * The webhook to call. Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/webhooks/<Webhook ID>.
     * 
     */
    @InputImport(name="webhook")
    private final @Nullable Input<String> webhook;

    public Input<String> getWebhook() {
        return this.webhook == null ? Input.empty() : this.webhook;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs(
        @Nullable Input<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages,
        @Nullable Input<Boolean> returnPartialResponses,
        @Nullable Input<String> tag,
        @Nullable Input<String> webhook) {
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.tag = tag;
        this.webhook = webhook;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs() {
        this.messages = Input.empty();
        this.returnPartialResponses = Input.empty();
        this.tag = Input.empty();
        this.webhook = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages;
        private @Nullable Input<Boolean> returnPartialResponses;
        private @Nullable Input<String> tag;
        private @Nullable Input<String> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setMessages(@Nullable Input<List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder setMessages(@Nullable List<CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageArgs> messages) {
            this.messages = Input.ofNullable(messages);
            return this;
        }

        public Builder setReturnPartialResponses(@Nullable Input<Boolean> returnPartialResponses) {
            this.returnPartialResponses = returnPartialResponses;
            return this;
        }

        public Builder setReturnPartialResponses(@Nullable Boolean returnPartialResponses) {
            this.returnPartialResponses = Input.ofNullable(returnPartialResponses);
            return this;
        }

        public Builder setTag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setTag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public Builder setWebhook(@Nullable Input<String> webhook) {
            this.webhook = webhook;
            return this;
        }

        public Builder setWebhook(@Nullable String webhook) {
            this.webhook = Input.ofNullable(webhook);
            return this;
        }

        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentArgs(messages, returnPartialResponses, tag, webhook);
        }
    }
}
