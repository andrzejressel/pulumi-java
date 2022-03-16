// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ActionGroupArgs;
import io.pulumi.azurenative.insights.outputs.ArmRoleReceiverResponse;
import io.pulumi.azurenative.insights.outputs.AutomationRunbookReceiverResponse;
import io.pulumi.azurenative.insights.outputs.AzureAppPushReceiverResponse;
import io.pulumi.azurenative.insights.outputs.AzureFunctionReceiverResponse;
import io.pulumi.azurenative.insights.outputs.EmailReceiverResponse;
import io.pulumi.azurenative.insights.outputs.ItsmReceiverResponse;
import io.pulumi.azurenative.insights.outputs.LogicAppReceiverResponse;
import io.pulumi.azurenative.insights.outputs.SmsReceiverResponse;
import io.pulumi.azurenative.insights.outputs.VoiceReceiverResponse;
import io.pulumi.azurenative.insights.outputs.WebhookReceiverResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An action group resource.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:ActionGroup SampleActionGroup /subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/Default-NotificationRules/providers/microsoft.insights/actionGroups/SampleActionGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ActionGroup")
public class ActionGroup extends io.pulumi.resources.CustomResource {
    /**
     * The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    @Export(name="armRoleReceivers", type=List.class, parameters={ArmRoleReceiverResponse.class})
    private Output</* @Nullable */ List<ArmRoleReceiverResponse>> armRoleReceivers;

    /**
     * @return The list of ARM role receivers that are part of this action group. Roles are Azure RBAC roles and only built-in roles are supported.
     * 
     */
    public Output</* @Nullable */ List<ArmRoleReceiverResponse>> getArmRoleReceivers() {
        return this.armRoleReceivers;
    }
    /**
     * The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    @Export(name="automationRunbookReceivers", type=List.class, parameters={AutomationRunbookReceiverResponse.class})
    private Output</* @Nullable */ List<AutomationRunbookReceiverResponse>> automationRunbookReceivers;

    /**
     * @return The list of AutomationRunbook receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<AutomationRunbookReceiverResponse>> getAutomationRunbookReceivers() {
        return this.automationRunbookReceivers;
    }
    /**
     * The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    @Export(name="azureAppPushReceivers", type=List.class, parameters={AzureAppPushReceiverResponse.class})
    private Output</* @Nullable */ List<AzureAppPushReceiverResponse>> azureAppPushReceivers;

    /**
     * @return The list of AzureAppPush receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<AzureAppPushReceiverResponse>> getAzureAppPushReceivers() {
        return this.azureAppPushReceivers;
    }
    /**
     * The list of azure function receivers that are part of this action group.
     * 
     */
    @Export(name="azureFunctionReceivers", type=List.class, parameters={AzureFunctionReceiverResponse.class})
    private Output</* @Nullable */ List<AzureFunctionReceiverResponse>> azureFunctionReceivers;

    /**
     * @return The list of azure function receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<AzureFunctionReceiverResponse>> getAzureFunctionReceivers() {
        return this.azureFunctionReceivers;
    }
    /**
     * The list of email receivers that are part of this action group.
     * 
     */
    @Export(name="emailReceivers", type=List.class, parameters={EmailReceiverResponse.class})
    private Output</* @Nullable */ List<EmailReceiverResponse>> emailReceivers;

    /**
     * @return The list of email receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<EmailReceiverResponse>> getEmailReceivers() {
        return this.emailReceivers;
    }
    /**
     * Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether this action group is enabled. If an action group is not enabled, then none of its receivers will receive communications.
     * 
     */
    public Output<Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * The short name of the action group. This will be used in SMS messages.
     * 
     */
    @Export(name="groupShortName", type=String.class, parameters={})
    private Output<String> groupShortName;

    /**
     * @return The short name of the action group. This will be used in SMS messages.
     * 
     */
    public Output<String> getGroupShortName() {
        return this.groupShortName;
    }
    /**
     * Azure resource identity
     * 
     */
    @Export(name="identity", type=String.class, parameters={})
    private Output<String> identity;

    /**
     * @return Azure resource identity
     * 
     */
    public Output<String> getIdentity() {
        return this.identity;
    }
    /**
     * The list of ITSM receivers that are part of this action group.
     * 
     */
    @Export(name="itsmReceivers", type=List.class, parameters={ItsmReceiverResponse.class})
    private Output</* @Nullable */ List<ItsmReceiverResponse>> itsmReceivers;

    /**
     * @return The list of ITSM receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<ItsmReceiverResponse>> getItsmReceivers() {
        return this.itsmReceivers;
    }
    /**
     * Azure resource kind
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Azure resource kind
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The list of logic app receivers that are part of this action group.
     * 
     */
    @Export(name="logicAppReceivers", type=List.class, parameters={LogicAppReceiverResponse.class})
    private Output</* @Nullable */ List<LogicAppReceiverResponse>> logicAppReceivers;

    /**
     * @return The list of logic app receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<LogicAppReceiverResponse>> getLogicAppReceivers() {
        return this.logicAppReceivers;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The list of SMS receivers that are part of this action group.
     * 
     */
    @Export(name="smsReceivers", type=List.class, parameters={SmsReceiverResponse.class})
    private Output</* @Nullable */ List<SmsReceiverResponse>> smsReceivers;

    /**
     * @return The list of SMS receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<SmsReceiverResponse>> getSmsReceivers() {
        return this.smsReceivers;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The list of voice receivers that are part of this action group.
     * 
     */
    @Export(name="voiceReceivers", type=List.class, parameters={VoiceReceiverResponse.class})
    private Output</* @Nullable */ List<VoiceReceiverResponse>> voiceReceivers;

    /**
     * @return The list of voice receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<VoiceReceiverResponse>> getVoiceReceivers() {
        return this.voiceReceivers;
    }
    /**
     * The list of webhook receivers that are part of this action group.
     * 
     */
    @Export(name="webhookReceivers", type=List.class, parameters={WebhookReceiverResponse.class})
    private Output</* @Nullable */ List<WebhookReceiverResponse>> webhookReceivers;

    /**
     * @return The list of webhook receivers that are part of this action group.
     * 
     */
    public Output</* @Nullable */ List<WebhookReceiverResponse>> getWebhookReceivers() {
        return this.webhookReceivers;
    }

    public interface BuilderApplicator {
        public void apply(ActionGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.insights.ActionGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.insights.ActionGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ActionGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionGroup(String name) {
        this(name, ActionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionGroup(String name, ActionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionGroup(String name, ActionGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActionGroup", name, args == null ? ActionGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ActionGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActionGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20170401:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180301:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20180901:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20190301:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20190601:ActionGroup").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210901:ActionGroup").build())
            ))
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
    public static ActionGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActionGroup(name, id, options);
    }
}
