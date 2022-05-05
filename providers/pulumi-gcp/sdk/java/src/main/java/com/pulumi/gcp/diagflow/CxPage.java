// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.CxPageArgs;
import com.pulumi.gcp.diagflow.inputs.CxPageState;
import com.pulumi.gcp.diagflow.outputs.CxPageEntryFulfillment;
import com.pulumi.gcp.diagflow.outputs.CxPageEventHandler;
import com.pulumi.gcp.diagflow.outputs.CxPageForm;
import com.pulumi.gcp.diagflow.outputs.CxPageTransitionRoute;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages.
 * 
 * To get more information about Page, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows.pages)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * ### Dialogflowcx Page Full
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var agent = new CxAgent(&#34;agent&#34;, CxAgentArgs.builder()        
 *             .displayName(&#34;dialogflowcx-agent&#34;)
 *             .location(&#34;global&#34;)
 *             .defaultLanguageCode(&#34;en&#34;)
 *             .supportedLanguageCodes(            
 *                 &#34;fr&#34;,
 *                 &#34;de&#34;,
 *                 &#34;es&#34;)
 *             .timeZone(&#34;America/New_York&#34;)
 *             .description(&#34;Example description.&#34;)
 *             .avatarUri(&#34;https://cloud.google.com/_static/images/cloud/icons/favicons/onecloud/super_cloud.png&#34;)
 *             .enableStackdriverLogging(true)
 *             .enableSpellCorrection(true)
 *             .speechToTextSettings(CxAgentSpeechToTextSettings.builder()
 *                 .enableSpeechAdaptation(true)
 *                 .build())
 *             .build());
 * 
 *         var myPage2 = new CxPage(&#34;myPage2&#34;, CxPageArgs.builder()        
 *             .parent(agent.getStartFlow())
 *             .displayName(&#34;MyPage2&#34;)
 *             .build());
 * 
 *         var basicPage = new CxPage(&#34;basicPage&#34;, CxPageArgs.builder()        
 *             .parent(agent.getStartFlow())
 *             .displayName(&#34;MyPage&#34;)
 *             .entryFulfillment(CxPageEntryFulfillment.builder()
 *                 .messages(CxPageEntryFulfillmentMessage.builder()
 *                     .text(CxPageEntryFulfillmentMessageText.builder()
 *                         .texts(&#34;Welcome to page&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .form(CxPageForm.builder()
 *                 .parameters(CxPageFormParameter.builder()
 *                     .displayName(&#34;param1&#34;)
 *                     .entityType(&#34;projects/-/locations/-/agents/-/entityTypes/sys.date&#34;)
 *                     .fillBehavior(CxPageFormParameterFillBehavior.builder()
 *                         .initialPromptFulfillment(CxPageFormParameterFillBehaviorInitialPromptFulfillment.builder()
 *                             .messages(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessage.builder()
 *                                 .text(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageText.builder()
 *                                     .texts(&#34;Please provide param1&#34;)
 *                                     .build())
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .required(&#34;true&#34;)
 *                     .redact(&#34;true&#34;)
 *                     .build())
 *                 .build())
 *             .transitionRoutes(CxPageTransitionRoute.builder()
 *                 .condition(&#34;$page.params.status = &#39;FINAL&#39;&#34;)
 *                 .triggerFulfillment(CxPageTransitionRouteTriggerFulfillment.builder()
 *                     .messages(CxPageTransitionRouteTriggerFulfillmentMessage.builder()
 *                         .text(CxPageTransitionRouteTriggerFulfillmentMessageText.builder()
 *                             .texts(&#34;information completed, navigating to page 2&#34;)
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .targetPage(myPage2.getId())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Page can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxPage:CxPage default {{parent}}/pages/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxPage:CxPage default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxPage:CxPage")
public class CxPage extends com.pulumi.resources.CustomResource {
    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the parameter, unique within the form.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The fulfillment to call when the session is entering the page.
     * Structure is documented below.
     * 
     */
    @Export(name="entryFulfillment", type=CxPageEntryFulfillment.class, parameters={})
    private Output</* @Nullable */ CxPageEntryFulfillment> entryFulfillment;

    /**
     * @return The fulfillment to call when the session is entering the page.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CxPageEntryFulfillment>> entryFulfillment() {
        return Codegen.optional(this.entryFulfillment);
    }
    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * Structure is documented below.
     * 
     */
    @Export(name="eventHandlers", type=List.class, parameters={CxPageEventHandler.class})
    private Output</* @Nullable */ List<CxPageEventHandler>> eventHandlers;

    /**
     * @return Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<CxPageEventHandler>>> eventHandlers() {
        return Codegen.optional(this.eventHandlers);
    }
    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * Structure is documented below.
     * 
     */
    @Export(name="form", type=CxPageForm.class, parameters={})
    private Output</* @Nullable */ CxPageForm> form;

    /**
     * @return The form associated with the page, used for collecting parameters relevant to the page.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CxPageForm>> form() {
        return Codegen.optional(this.form);
    }
    /**
     * The language of the following fields in page:
     * Page.entry_fulfillment.messages
     * Page.entry_fulfillment.conditional_cases
     * Page.event_handlers.trigger_fulfillment.messages
     * Page.event_handlers.trigger_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.messages
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases
     * Page.transition_routes.trigger_fulfillment.messages
     * Page.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in page:
     * Page.entry_fulfillment.messages
     * Page.entry_fulfillment.conditional_cases
     * Page.event_handlers.trigger_fulfillment.messages
     * Page.event_handlers.trigger_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.messages
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases
     * Page.transition_routes.trigger_fulfillment.messages
     * Page.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output<Optional<String>> languageCode() {
        return Codegen.optional(this.languageCode);
    }
    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The flow to create a page for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The flow to create a page for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;.
     * 
     */
    public Output<Optional<String>> parent() {
        return Codegen.optional(this.parent);
    }
    /**
     * Ordered list of TransitionRouteGroups associated with the page. Transition route groups must be unique within a page.
     * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route &gt; page&#39;s transition route group &gt; flow&#39;s transition routes.
     * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence.
     * Format:projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;.
     * 
     */
    @Export(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> transitionRouteGroups;

    /**
     * @return Ordered list of TransitionRouteGroups associated with the page. Transition route groups must be unique within a page.
     * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route &gt; page&#39;s transition route group &gt; flow&#39;s transition routes.
     * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence.
     * Format:projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;.
     * 
     */
    public Output<Optional<List<String>>> transitionRouteGroups() {
        return Codegen.optional(this.transitionRouteGroups);
    }
    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow.
     * When we are in a certain page, the TransitionRoutes are evalauted in the following order:
     * TransitionRoutes defined in the page with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in flow with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in the page with only condition specified.
     * TransitionRoutes defined in the transition route groups with only condition specified.
     * Structure is documented below.
     * 
     */
    @Export(name="transitionRoutes", type=List.class, parameters={CxPageTransitionRoute.class})
    private Output</* @Nullable */ List<CxPageTransitionRoute>> transitionRoutes;

    /**
     * @return A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow.
     * When we are in a certain page, the TransitionRoutes are evalauted in the following order:
     * TransitionRoutes defined in the page with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in flow with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in the page with only condition specified.
     * TransitionRoutes defined in the transition route groups with only condition specified.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<CxPageTransitionRoute>>> transitionRoutes() {
        return Codegen.optional(this.transitionRoutes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxPage(String name) {
        this(name, CxPageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxPage(String name, CxPageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxPage(String name, CxPageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxPage:CxPage", name, args == null ? CxPageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CxPage(String name, Output<String> id, @Nullable CxPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxPage:CxPage", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CxPage get(String name, Output<String> id, @Nullable CxPageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CxPage(name, id, state, options);
    }
}
