// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A fulfillment can do one or more of the following actions at the same time: * Generate rich message responses. * Set parameter values. * Call the webhook. Fulfillments can be called at various stages in the Page or Form lifecycle. For example, when a DetectIntentRequest drives a session to enter a new page, the page's entry fulfillment can add a static response to the QueryResult in the returning DetectIntentResponse, call the webhook (for example, to load user data from a database), or both.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentArgs Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentArgs();

    /**
     * Conditional cases for this fulfillment.
     * 
     */
    @InputImport(name="conditionalCases")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> conditionalCases;

    public Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> getConditionalCases() {
        return this.conditionalCases == null ? Input.empty() : this.conditionalCases;
    }

    /**
     * The list of rich message responses to present to the user.
     * 
     */
    @InputImport(name="messages")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> messages;

    public Input<List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> getMessages() {
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
     * Set parameter values before executing the webhook.
     * 
     */
    @InputImport(name="setParameterActions")
    private final @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs>> setParameterActions;

    public Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs>> getSetParameterActions() {
        return this.setParameterActions == null ? Input.empty() : this.setParameterActions;
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if `webhook` is specified.
     * 
     */
    @InputImport(name="tag")
    private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @InputImport(name="webhook")
    private final @Nullable Input<String> webhook;

    public Input<String> getWebhook() {
        return this.webhook == null ? Input.empty() : this.webhook;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentArgs(
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> conditionalCases,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> messages,
        @Nullable Input<Boolean> returnPartialResponses,
        @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs>> setParameterActions,
        @Nullable Input<String> tag,
        @Nullable Input<String> webhook) {
        this.conditionalCases = conditionalCases;
        this.messages = messages;
        this.returnPartialResponses = returnPartialResponses;
        this.setParameterActions = setParameterActions;
        this.tag = tag;
        this.webhook = webhook;
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentArgs() {
        this.conditionalCases = Input.empty();
        this.messages = Input.empty();
        this.returnPartialResponses = Input.empty();
        this.setParameterActions = Input.empty();
        this.tag = Input.empty();
        this.webhook = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> conditionalCases;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> messages;
        private @Nullable Input<Boolean> returnPartialResponses;
        private @Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs>> setParameterActions;
        private @Nullable Input<String> tag;
        private @Nullable Input<String> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder setConditionalCases(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs>> conditionalCases) {
            this.conditionalCases = conditionalCases;
            return this;
        }

        public Builder setConditionalCases(@Nullable List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs> conditionalCases) {
            this.conditionalCases = Input.ofNullable(conditionalCases);
            return this;
        }

        public Builder setMessages(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs>> messages) {
            this.messages = messages;
            return this;
        }

        public Builder setMessages(@Nullable List<GoogleCloudDialogflowCxV3beta1ResponseMessageArgs> messages) {
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

        public Builder setSetParameterActions(@Nullable Input<List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs>> setParameterActions) {
            this.setParameterActions = setParameterActions;
            return this;
        }

        public Builder setSetParameterActions(@Nullable List<GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs> setParameterActions) {
            this.setParameterActions = Input.ofNullable(setParameterActions);
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

        public GoogleCloudDialogflowCxV3beta1FulfillmentArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentArgs(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}
