// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecRuleState Empty = new AppSecRuleState();

    /**
     * JSON-formatted condition and exception information for the rule
     * 
     */
    @Import(name="conditionException")
    private @Nullable Output<String> conditionException;

    /**
     * @return JSON-formatted condition and exception information for the rule
     * 
     */
    public Optional<Output<String>> conditionException() {
        return Optional.ofNullable(this.conditionException);
    }

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Action to be taken when the rule is triggered
     * 
     */
    @Import(name="ruleAction")
    private @Nullable Output<String> ruleAction;

    /**
     * @return Action to be taken when the rule is triggered
     * 
     */
    public Optional<Output<String>> ruleAction() {
        return Optional.ofNullable(this.ruleAction);
    }

    /**
     * Unique identifier of the rule
     * 
     */
    @Import(name="ruleId")
    private @Nullable Output<Integer> ruleId;

    /**
     * @return Unique identifier of the rule
     * 
     */
    public Optional<Output<Integer>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private AppSecRuleState() {}

    private AppSecRuleState(AppSecRuleState $) {
        this.conditionException = $.conditionException;
        this.configId = $.configId;
        this.ruleAction = $.ruleAction;
        this.ruleId = $.ruleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecRuleState $;

        public Builder() {
            $ = new AppSecRuleState();
        }

        public Builder(AppSecRuleState defaults) {
            $ = new AppSecRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionException JSON-formatted condition and exception information for the rule
         * 
         * @return builder
         * 
         */
        public Builder conditionException(@Nullable Output<String> conditionException) {
            $.conditionException = conditionException;
            return this;
        }

        /**
         * @param conditionException JSON-formatted condition and exception information for the rule
         * 
         * @return builder
         * 
         */
        public Builder conditionException(String conditionException) {
            return conditionException(Output.of(conditionException));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param ruleAction Action to be taken when the rule is triggered
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(@Nullable Output<String> ruleAction) {
            $.ruleAction = ruleAction;
            return this;
        }

        /**
         * @param ruleAction Action to be taken when the rule is triggered
         * 
         * @return builder
         * 
         */
        public Builder ruleAction(String ruleAction) {
            return ruleAction(Output.of(ruleAction));
        }

        /**
         * @param ruleId Unique identifier of the rule
         * 
         * @return builder
         * 
         */
        public Builder ruleId(@Nullable Output<Integer> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        /**
         * @param ruleId Unique identifier of the rule
         * 
         * @return builder
         * 
         */
        public Builder ruleId(Integer ruleId) {
            return ruleId(Output.of(ruleId));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public AppSecRuleState build() {
            return $;
        }
    }

}
