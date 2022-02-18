// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Represents a response message that can be returned by a conversational agent. Response messages are also used for output audio synthesis. The approach is as follows: * If at least one OutputAudioText response is present, then all OutputAudioText responses are linearly concatenated, and the result is used for output audio synthesis. * If the OutputAudioText responses are a mixture of text and SSML, then the concatenated result is treated as SSML; otherwise, the result is treated as either text or SSML as appropriate. The agent designer should ideally use either text or SSML consistently throughout the bot design. * Otherwise, all Text responses are linearly concatenated, and the result is used for output audio synthesis. This approach allows for more sophisticated user experience scenarios, where the text displayed to the user may differ from what is heard.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageResponse Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageResponse();

    /**
     * Indicates that the conversation succeeded.
     * 
     */
    @InputImport(name="conversationSuccess", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse conversationSuccess;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse getConversationSuccess() {
        return this.conversationSuccess;
    }

    /**
     * A signal that indicates the interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is not supposed to be defined by the user. It's guaranteed that there is at most one such message in each response.
     * 
     */
    @InputImport(name="endInteraction", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse endInteraction;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse getEndInteraction() {
        return this.endInteraction;
    }

    /**
     * Hands off conversation to a human agent.
     * 
     */
    @InputImport(name="liveAgentHandoff", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse getLiveAgentHandoff() {
        return this.liveAgentHandoff;
    }

    /**
     * An audio response message composed of both the synthesized Dialogflow agent responses and responses defined via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     * 
     */
    @InputImport(name="mixedAudio", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse mixedAudio;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse getMixedAudio() {
        return this.mixedAudio;
    }

    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    @InputImport(name="outputAudioText", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse outputAudioText;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse getOutputAudioText() {
        return this.outputAudioText;
    }

    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    @InputImport(name="payload", required=true)
    private final Map<String,String> payload;

    public Map<String,String> getPayload() {
        return this.payload;
    }

    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    @InputImport(name="playAudio", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse playAudio;

    public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse getPlayAudio() {
        return this.playAudio;
    }

    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    @InputImport(name="telephonyTransferCall", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse getTelephonyTransferCall() {
        return this.telephonyTransferCall;
    }

    /**
     * Returns a text response.
     * 
     */
    @InputImport(name="text", required=true)
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse text;

    public GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageResponse(
        GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse conversationSuccess,
        GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse endInteraction,
        GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse liveAgentHandoff,
        GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse mixedAudio,
        GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse outputAudioText,
        Map<String,String> payload,
        GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse playAudio,
        GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse telephonyTransferCall,
        GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse text) {
        this.conversationSuccess = Objects.requireNonNull(conversationSuccess, "expected parameter 'conversationSuccess' to be non-null");
        this.endInteraction = Objects.requireNonNull(endInteraction, "expected parameter 'endInteraction' to be non-null");
        this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff, "expected parameter 'liveAgentHandoff' to be non-null");
        this.mixedAudio = Objects.requireNonNull(mixedAudio, "expected parameter 'mixedAudio' to be non-null");
        this.outputAudioText = Objects.requireNonNull(outputAudioText, "expected parameter 'outputAudioText' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.playAudio = Objects.requireNonNull(playAudio, "expected parameter 'playAudio' to be non-null");
        this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall, "expected parameter 'telephonyTransferCall' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageResponse() {
        this.conversationSuccess = null;
        this.endInteraction = null;
        this.liveAgentHandoff = null;
        this.mixedAudio = null;
        this.outputAudioText = null;
        this.payload = Map.of();
        this.playAudio = null;
        this.telephonyTransferCall = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse conversationSuccess;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse endInteraction;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse mixedAudio;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse outputAudioText;
        private Map<String,String> payload;
        private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse playAudio;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationSuccess = defaults.conversationSuccess;
    	      this.endInteraction = defaults.endInteraction;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.mixedAudio = defaults.mixedAudio;
    	      this.outputAudioText = defaults.outputAudioText;
    	      this.payload = defaults.payload;
    	      this.playAudio = defaults.playAudio;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder setConversationSuccess(GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessResponse conversationSuccess) {
            this.conversationSuccess = Objects.requireNonNull(conversationSuccess);
            return this;
        }

        public Builder setEndInteraction(GoogleCloudDialogflowCxV3beta1ResponseMessageEndInteractionResponse endInteraction) {
            this.endInteraction = Objects.requireNonNull(endInteraction);
            return this;
        }

        public Builder setLiveAgentHandoff(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffResponse liveAgentHandoff) {
            this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff);
            return this;
        }

        public Builder setMixedAudio(GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioResponse mixedAudio) {
            this.mixedAudio = Objects.requireNonNull(mixedAudio);
            return this;
        }

        public Builder setOutputAudioText(GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextResponse outputAudioText) {
            this.outputAudioText = Objects.requireNonNull(outputAudioText);
            return this;
        }

        public Builder setPayload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPlayAudio(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse playAudio) {
            this.playAudio = Objects.requireNonNull(playAudio);
            return this;
        }

        public Builder setTelephonyTransferCall(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallResponse telephonyTransferCall) {
            this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowCxV3beta1ResponseMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ResponseMessageResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageResponse(conversationSuccess, endInteraction, liveAgentHandoff, mixedAudio, outputAudioText, payload, playAudio, telephonyTransferCall, text);
        }
    }
}
