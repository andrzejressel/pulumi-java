// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteTriggerFulfillmentGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageTransitionRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageTransitionRouteGetArgs Empty = new CxPageTransitionRouteGetArgs();

    /**
     * The condition to evaluate against form parameters or session parameters.
     * At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @InputImport(name="condition")
    private final @Nullable Input<String> condition;

    public Input<String> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The unique identifier of an Intent.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/intents/<Intent ID>. Indicates that the transition can only happen when the given intent is matched. At least one of intent or condition must be specified. When both intent and condition are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @InputImport(name="intent")
    private final @Nullable Input<String> intent;

    public Input<String> getIntent() {
        return this.intent == null ? Input.empty() : this.intent;
    }

    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The target flow to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @InputImport(name="targetFlow")
    private final @Nullable Input<String> targetFlow;

    public Input<String> getTargetFlow() {
        return this.targetFlow == null ? Input.empty() : this.targetFlow;
    }

    /**
     * The target page to transition to.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/pages/<Page ID>.
     * 
     */
    @InputImport(name="targetPage")
    private final @Nullable Input<String> targetPage;

    public Input<String> getTargetPage() {
        return this.targetPage == null ? Input.empty() : this.targetPage;
    }

    /**
     * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
     * Structure is documented below.
     * 
     */
    @InputImport(name="triggerFulfillment")
    private final @Nullable Input<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment;

    public Input<CxPageTransitionRouteTriggerFulfillmentGetArgs> getTriggerFulfillment() {
        return this.triggerFulfillment == null ? Input.empty() : this.triggerFulfillment;
    }

    public CxPageTransitionRouteGetArgs(
        @Nullable Input<String> condition,
        @Nullable Input<String> intent,
        @Nullable Input<String> name,
        @Nullable Input<String> targetFlow,
        @Nullable Input<String> targetPage,
        @Nullable Input<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment) {
        this.condition = condition;
        this.intent = intent;
        this.name = name;
        this.targetFlow = targetFlow;
        this.targetPage = targetPage;
        this.triggerFulfillment = triggerFulfillment;
    }

    private CxPageTransitionRouteGetArgs() {
        this.condition = Input.empty();
        this.intent = Input.empty();
        this.name = Input.empty();
        this.targetFlow = Input.empty();
        this.targetPage = Input.empty();
        this.triggerFulfillment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageTransitionRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> condition;
        private @Nullable Input<String> intent;
        private @Nullable Input<String> name;
        private @Nullable Input<String> targetFlow;
        private @Nullable Input<String> targetPage;
        private @Nullable Input<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageTransitionRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.intent = defaults.intent;
    	      this.name = defaults.name;
    	      this.targetFlow = defaults.targetFlow;
    	      this.targetPage = defaults.targetPage;
    	      this.triggerFulfillment = defaults.triggerFulfillment;
        }

        public Builder setCondition(@Nullable Input<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable String condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setIntent(@Nullable Input<String> intent) {
            this.intent = intent;
            return this;
        }

        public Builder setIntent(@Nullable String intent) {
            this.intent = Input.ofNullable(intent);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTargetFlow(@Nullable Input<String> targetFlow) {
            this.targetFlow = targetFlow;
            return this;
        }

        public Builder setTargetFlow(@Nullable String targetFlow) {
            this.targetFlow = Input.ofNullable(targetFlow);
            return this;
        }

        public Builder setTargetPage(@Nullable Input<String> targetPage) {
            this.targetPage = targetPage;
            return this;
        }

        public Builder setTargetPage(@Nullable String targetPage) {
            this.targetPage = Input.ofNullable(targetPage);
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable Input<CxPageTransitionRouteTriggerFulfillmentGetArgs> triggerFulfillment) {
            this.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public Builder setTriggerFulfillment(@Nullable CxPageTransitionRouteTriggerFulfillmentGetArgs triggerFulfillment) {
            this.triggerFulfillment = Input.ofNullable(triggerFulfillment);
            return this;
        }

        public CxPageTransitionRouteGetArgs build() {
            return new CxPageTransitionRouteGetArgs(condition, intent, name, targetFlow, targetPage, triggerFulfillment);
        }
    }
}
