// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaConditionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleBoostActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleFilterActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleIgnoreActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleRedirectActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleReplacementActionArgs;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule is a condition-action pair * A condition defines when a rule is to be triggered. * An action specifies what occurs on that trigger. Currently only boost rules are supported. Currently only supported by the search endpoint.
 * 
 */
public final class GoogleCloudRetailV2betaRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaRuleArgs Empty = new GoogleCloudRetailV2betaRuleArgs();

    /**
     * A boost action.
     * 
     */
    @InputImport(name="boostAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleBoostActionArgs> boostAction;

    public Input<GoogleCloudRetailV2betaRuleBoostActionArgs> getBoostAction() {
        return this.boostAction == null ? Input.empty() : this.boostAction;
    }

    /**
     * The condition that triggers the rule. If the condition is empty, the rule will always apply.
     * 
     */
    @InputImport(name="condition", required=true)
    private final Input<GoogleCloudRetailV2betaConditionArgs> condition;

    public Input<GoogleCloudRetailV2betaConditionArgs> getCondition() {
        return this.condition;
    }

    /**
     * Prevents term from being associated with other terms.
     * 
     */
    @InputImport(name="doNotAssociateAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs> doNotAssociateAction;

    public Input<GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs> getDoNotAssociateAction() {
        return this.doNotAssociateAction == null ? Input.empty() : this.doNotAssociateAction;
    }

    /**
     * Filters results.
     * 
     */
    @InputImport(name="filterAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleFilterActionArgs> filterAction;

    public Input<GoogleCloudRetailV2betaRuleFilterActionArgs> getFilterAction() {
        return this.filterAction == null ? Input.empty() : this.filterAction;
    }

    /**
     * Ignores specific terms from query during search.
     * 
     */
    @InputImport(name="ignoreAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleIgnoreActionArgs> ignoreAction;

    public Input<GoogleCloudRetailV2betaRuleIgnoreActionArgs> getIgnoreAction() {
        return this.ignoreAction == null ? Input.empty() : this.ignoreAction;
    }

    /**
     * Treats specific term as a synonym with a group of terms. Group of terms will not be treated as synonyms with the specific term.
     * 
     */
    @InputImport(name="onewaySynonymsAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs> onewaySynonymsAction;

    public Input<GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs> getOnewaySynonymsAction() {
        return this.onewaySynonymsAction == null ? Input.empty() : this.onewaySynonymsAction;
    }

    /**
     * Redirects a shopper to a specific page.
     * 
     */
    @InputImport(name="redirectAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleRedirectActionArgs> redirectAction;

    public Input<GoogleCloudRetailV2betaRuleRedirectActionArgs> getRedirectAction() {
        return this.redirectAction == null ? Input.empty() : this.redirectAction;
    }

    /**
     * Replaces specific terms in the query.
     * 
     */
    @InputImport(name="replacementAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleReplacementActionArgs> replacementAction;

    public Input<GoogleCloudRetailV2betaRuleReplacementActionArgs> getReplacementAction() {
        return this.replacementAction == null ? Input.empty() : this.replacementAction;
    }

    /**
     * Treats a set of terms as synonyms of one another.
     * 
     */
    @InputImport(name="twowaySynonymsAction")
    private final @Nullable Input<GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs> twowaySynonymsAction;

    public Input<GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs> getTwowaySynonymsAction() {
        return this.twowaySynonymsAction == null ? Input.empty() : this.twowaySynonymsAction;
    }

    public GoogleCloudRetailV2betaRuleArgs(
        @Nullable Input<GoogleCloudRetailV2betaRuleBoostActionArgs> boostAction,
        Input<GoogleCloudRetailV2betaConditionArgs> condition,
        @Nullable Input<GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs> doNotAssociateAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleFilterActionArgs> filterAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleIgnoreActionArgs> ignoreAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs> onewaySynonymsAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleRedirectActionArgs> redirectAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleReplacementActionArgs> replacementAction,
        @Nullable Input<GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs> twowaySynonymsAction) {
        this.boostAction = boostAction;
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.doNotAssociateAction = doNotAssociateAction;
        this.filterAction = filterAction;
        this.ignoreAction = ignoreAction;
        this.onewaySynonymsAction = onewaySynonymsAction;
        this.redirectAction = redirectAction;
        this.replacementAction = replacementAction;
        this.twowaySynonymsAction = twowaySynonymsAction;
    }

    private GoogleCloudRetailV2betaRuleArgs() {
        this.boostAction = Input.empty();
        this.condition = Input.empty();
        this.doNotAssociateAction = Input.empty();
        this.filterAction = Input.empty();
        this.ignoreAction = Input.empty();
        this.onewaySynonymsAction = Input.empty();
        this.redirectAction = Input.empty();
        this.replacementAction = Input.empty();
        this.twowaySynonymsAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudRetailV2betaRuleBoostActionArgs> boostAction;
        private Input<GoogleCloudRetailV2betaConditionArgs> condition;
        private @Nullable Input<GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs> doNotAssociateAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleFilterActionArgs> filterAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleIgnoreActionArgs> ignoreAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs> onewaySynonymsAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleRedirectActionArgs> redirectAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleReplacementActionArgs> replacementAction;
        private @Nullable Input<GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs> twowaySynonymsAction;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boostAction = defaults.boostAction;
    	      this.condition = defaults.condition;
    	      this.doNotAssociateAction = defaults.doNotAssociateAction;
    	      this.filterAction = defaults.filterAction;
    	      this.ignoreAction = defaults.ignoreAction;
    	      this.onewaySynonymsAction = defaults.onewaySynonymsAction;
    	      this.redirectAction = defaults.redirectAction;
    	      this.replacementAction = defaults.replacementAction;
    	      this.twowaySynonymsAction = defaults.twowaySynonymsAction;
        }

        public Builder setBoostAction(@Nullable Input<GoogleCloudRetailV2betaRuleBoostActionArgs> boostAction) {
            this.boostAction = boostAction;
            return this;
        }

        public Builder setBoostAction(@Nullable GoogleCloudRetailV2betaRuleBoostActionArgs boostAction) {
            this.boostAction = Input.ofNullable(boostAction);
            return this;
        }

        public Builder setCondition(Input<GoogleCloudRetailV2betaConditionArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(GoogleCloudRetailV2betaConditionArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }

        public Builder setDoNotAssociateAction(@Nullable Input<GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs> doNotAssociateAction) {
            this.doNotAssociateAction = doNotAssociateAction;
            return this;
        }

        public Builder setDoNotAssociateAction(@Nullable GoogleCloudRetailV2betaRuleDoNotAssociateActionArgs doNotAssociateAction) {
            this.doNotAssociateAction = Input.ofNullable(doNotAssociateAction);
            return this;
        }

        public Builder setFilterAction(@Nullable Input<GoogleCloudRetailV2betaRuleFilterActionArgs> filterAction) {
            this.filterAction = filterAction;
            return this;
        }

        public Builder setFilterAction(@Nullable GoogleCloudRetailV2betaRuleFilterActionArgs filterAction) {
            this.filterAction = Input.ofNullable(filterAction);
            return this;
        }

        public Builder setIgnoreAction(@Nullable Input<GoogleCloudRetailV2betaRuleIgnoreActionArgs> ignoreAction) {
            this.ignoreAction = ignoreAction;
            return this;
        }

        public Builder setIgnoreAction(@Nullable GoogleCloudRetailV2betaRuleIgnoreActionArgs ignoreAction) {
            this.ignoreAction = Input.ofNullable(ignoreAction);
            return this;
        }

        public Builder setOnewaySynonymsAction(@Nullable Input<GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs> onewaySynonymsAction) {
            this.onewaySynonymsAction = onewaySynonymsAction;
            return this;
        }

        public Builder setOnewaySynonymsAction(@Nullable GoogleCloudRetailV2betaRuleOnewaySynonymsActionArgs onewaySynonymsAction) {
            this.onewaySynonymsAction = Input.ofNullable(onewaySynonymsAction);
            return this;
        }

        public Builder setRedirectAction(@Nullable Input<GoogleCloudRetailV2betaRuleRedirectActionArgs> redirectAction) {
            this.redirectAction = redirectAction;
            return this;
        }

        public Builder setRedirectAction(@Nullable GoogleCloudRetailV2betaRuleRedirectActionArgs redirectAction) {
            this.redirectAction = Input.ofNullable(redirectAction);
            return this;
        }

        public Builder setReplacementAction(@Nullable Input<GoogleCloudRetailV2betaRuleReplacementActionArgs> replacementAction) {
            this.replacementAction = replacementAction;
            return this;
        }

        public Builder setReplacementAction(@Nullable GoogleCloudRetailV2betaRuleReplacementActionArgs replacementAction) {
            this.replacementAction = Input.ofNullable(replacementAction);
            return this;
        }

        public Builder setTwowaySynonymsAction(@Nullable Input<GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs> twowaySynonymsAction) {
            this.twowaySynonymsAction = twowaySynonymsAction;
            return this;
        }

        public Builder setTwowaySynonymsAction(@Nullable GoogleCloudRetailV2betaRuleTwowaySynonymsActionArgs twowaySynonymsAction) {
            this.twowaySynonymsAction = Input.ofNullable(twowaySynonymsAction);
            return this;
        }

        public GoogleCloudRetailV2betaRuleArgs build() {
            return new GoogleCloudRetailV2betaRuleArgs(boostAction, condition, doNotAssociateAction, filterAction, ignoreAction, onewaySynonymsAction, redirectAction, replacementAction, twowaySynonymsAction);
        }
    }
}
