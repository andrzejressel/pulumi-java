// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2.ConversationArgs;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2ConversationPhoneNumberResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new conversation. Conversations are auto-completed after 24 hours. Conversation Lifecycle: There are two stages during a conversation: Automated Agent Stage and Assist Stage. For Automated Agent Stage, there will be a dialogflow agent responding to user queries. For Assist Stage, there's no dialogflow agent responding to user queries. But we will provide suggestions which are generated from conversation. If Conversation.conversation_profile is configured for a dialogflow agent, conversation will start from `Automated Agent Stage`, otherwise, it will start from `Assist Stage`. And during `Automated Agent Stage`, once an Intent with Intent.live_agent_handoff is triggered, conversation will transfer to Assist Stage.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2:Conversation")
public class Conversation extends io.pulumi.resources.CustomResource {
    /**
     * The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @Export(name="conversationProfile", type=String.class, parameters={})
    private Output<String> conversationProfile;

    /**
     * @return The Conversation Profile to be used to configure this Conversation. This field cannot be updated. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    public Output<String> getConversationProfile() {
        return this.conversationProfile;
    }
    /**
     * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
     */
    @Export(name="conversationStage", type=String.class, parameters={})
    private Output<String> conversationStage;

    /**
     * @return The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
     */
    public Output<String> getConversationStage() {
        return this.conversationStage;
    }
    /**
     * The time the conversation was finished.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time the conversation was finished.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * The current state of the Conversation.
     * 
     */
    @Export(name="lifecycleState", type=String.class, parameters={})
    private Output<String> lifecycleState;

    /**
     * @return The current state of the Conversation.
     * 
     */
    public Output<String> getLifecycleState() {
        return this.lifecycleState;
    }
    /**
     * The unique identifier of this conversation. Format: `projects//locations//conversations/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this conversation. Format: `projects//locations//conversations/`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * It will not be empty if the conversation is to be connected over telephony.
     * 
     */
    @Export(name="phoneNumber", type=GoogleCloudDialogflowV2ConversationPhoneNumberResponse.class, parameters={})
    private Output<GoogleCloudDialogflowV2ConversationPhoneNumberResponse> phoneNumber;

    /**
     * @return It will not be empty if the conversation is to be connected over telephony.
     * 
     */
    public Output<GoogleCloudDialogflowV2ConversationPhoneNumberResponse> getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The time the conversation was started.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The time the conversation was started.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }

    public interface BuilderApplicator {
        public void apply(ConversationArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v2.ConversationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v2.ConversationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Conversation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Conversation(String name) {
        this(name, ConversationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Conversation(String name, ConversationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Conversation(String name, ConversationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Conversation", name, args == null ? ConversationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Conversation(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2:Conversation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Conversation get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Conversation(name, id, options);
    }
}
