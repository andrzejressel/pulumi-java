// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages. For each flow, you define many pages, where your combined pages can handle a complete conversation on the topics the flow is designed for. At any given moment, exactly one page is the current page, the current page is considered active, and the flow associated with that page is considered active. Every flow has a special start page. When a flow initially becomes active, the start page page becomes the current page. For each conversational turn, the current page will either stay the same or transition to another page. You configure each page to collect information from the end-user that is relevant for the conversational state represented by the page. For more information, see the [Page guide](https://cloud.google.com/dialogflow/cx/docs/concept/page).
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1PageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1PageResponse Empty = new GoogleCloudDialogflowCxV3beta1PageResponse();

    /**
     * The human-readable name of the page, unique within the agent.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * The fulfillment to call when the session is entering the page.
     * 
     */
    @InputImport(name="entryFulfillment", required=true)
    private final GoogleCloudDialogflowCxV3beta1FulfillmentResponse entryFulfillment;

    public GoogleCloudDialogflowCxV3beta1FulfillmentResponse getEntryFulfillment() {
        return this.entryFulfillment;
    }

    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    @InputImport(name="eventHandlers", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> eventHandlers;

    public List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> getEventHandlers() {
        return this.eventHandlers;
    }

    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    @InputImport(name="form", required=true)
    private final GoogleCloudDialogflowCxV3beta1FormResponse form;

    public GoogleCloudDialogflowCxV3beta1FormResponse getForm() {
        return this.form;
    }

    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page's transition route -> page's transition route group -> flow's transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @InputImport(name="transitionRouteGroups", required=true)
    private final List<String> transitionRouteGroups;

    public List<String> getTransitionRouteGroups() {
        return this.transitionRouteGroups;
    }

    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    @InputImport(name="transitionRoutes", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes;

    public List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> getTransitionRoutes() {
        return this.transitionRoutes;
    }

    public GoogleCloudDialogflowCxV3beta1PageResponse(
        String displayName,
        GoogleCloudDialogflowCxV3beta1FulfillmentResponse entryFulfillment,
        List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> eventHandlers,
        GoogleCloudDialogflowCxV3beta1FormResponse form,
        String name,
        List<String> transitionRouteGroups,
        List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entryFulfillment = Objects.requireNonNull(entryFulfillment, "expected parameter 'entryFulfillment' to be non-null");
        this.eventHandlers = Objects.requireNonNull(eventHandlers, "expected parameter 'eventHandlers' to be non-null");
        this.form = Objects.requireNonNull(form, "expected parameter 'form' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups, "expected parameter 'transitionRouteGroups' to be non-null");
        this.transitionRoutes = Objects.requireNonNull(transitionRoutes, "expected parameter 'transitionRoutes' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1PageResponse() {
        this.displayName = null;
        this.entryFulfillment = null;
        this.eventHandlers = List.of();
        this.form = null;
        this.name = null;
        this.transitionRouteGroups = List.of();
        this.transitionRoutes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1PageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private GoogleCloudDialogflowCxV3beta1FulfillmentResponse entryFulfillment;
        private List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> eventHandlers;
        private GoogleCloudDialogflowCxV3beta1FormResponse form;
        private String name;
        private List<String> transitionRouteGroups;
        private List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1PageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.name = defaults.name;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEntryFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentResponse entryFulfillment) {
            this.entryFulfillment = Objects.requireNonNull(entryFulfillment);
            return this;
        }

        public Builder setEventHandlers(List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse> eventHandlers) {
            this.eventHandlers = Objects.requireNonNull(eventHandlers);
            return this;
        }

        public Builder setForm(GoogleCloudDialogflowCxV3beta1FormResponse form) {
            this.form = Objects.requireNonNull(form);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTransitionRouteGroups(List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Objects.requireNonNull(transitionRouteGroups);
            return this;
        }

        public Builder setTransitionRoutes(List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse> transitionRoutes) {
            this.transitionRoutes = Objects.requireNonNull(transitionRoutes);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1PageResponse build() {
            return new GoogleCloudDialogflowCxV3beta1PageResponse(displayName, entryFulfillment, eventHandlers, form, name, transitionRouteGroups, transitionRoutes);
        }
    }
}
