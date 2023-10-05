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


public final class AppSecCustomRuleActionState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecCustomRuleActionState Empty = new AppSecCustomRuleActionState();

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
     * Action to be taken when the custom rule is invoked
     * 
     */
    @Import(name="customRuleAction")
    private @Nullable Output<String> customRuleAction;

    /**
     * @return Action to be taken when the custom rule is invoked
     * 
     */
    public Optional<Output<String>> customRuleAction() {
        return Optional.ofNullable(this.customRuleAction);
    }

    /**
     * Unique identifier of the custom rule whose action is being modified
     * 
     */
    @Import(name="customRuleId")
    private @Nullable Output<Integer> customRuleId;

    /**
     * @return Unique identifier of the custom rule whose action is being modified
     * 
     */
    public Optional<Output<Integer>> customRuleId() {
        return Optional.ofNullable(this.customRuleId);
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

    private AppSecCustomRuleActionState() {}

    private AppSecCustomRuleActionState(AppSecCustomRuleActionState $) {
        this.configId = $.configId;
        this.customRuleAction = $.customRuleAction;
        this.customRuleId = $.customRuleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecCustomRuleActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecCustomRuleActionState $;

        public Builder() {
            $ = new AppSecCustomRuleActionState();
        }

        public Builder(AppSecCustomRuleActionState defaults) {
            $ = new AppSecCustomRuleActionState(Objects.requireNonNull(defaults));
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
         * @param customRuleAction Action to be taken when the custom rule is invoked
         * 
         * @return builder
         * 
         */
        public Builder customRuleAction(@Nullable Output<String> customRuleAction) {
            $.customRuleAction = customRuleAction;
            return this;
        }

        /**
         * @param customRuleAction Action to be taken when the custom rule is invoked
         * 
         * @return builder
         * 
         */
        public Builder customRuleAction(String customRuleAction) {
            return customRuleAction(Output.of(customRuleAction));
        }

        /**
         * @param customRuleId Unique identifier of the custom rule whose action is being modified
         * 
         * @return builder
         * 
         */
        public Builder customRuleId(@Nullable Output<Integer> customRuleId) {
            $.customRuleId = customRuleId;
            return this;
        }

        /**
         * @param customRuleId Unique identifier of the custom rule whose action is being modified
         * 
         * @return builder
         * 
         */
        public Builder customRuleId(Integer customRuleId) {
            return customRuleId(Output.of(customRuleId));
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

        public AppSecCustomRuleActionState build() {
            return $;
        }
    }

}
