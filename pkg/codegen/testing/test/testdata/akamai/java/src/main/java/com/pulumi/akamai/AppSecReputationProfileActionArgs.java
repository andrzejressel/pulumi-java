// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AppSecReputationProfileActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecReputationProfileActionArgs Empty = new AppSecReputationProfileActionArgs();

    /**
     * Action to be taken when the reputation profile is triggered
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Action to be taken when the reputation profile is triggered
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * Unique identifier of the reputation profile
     * 
     */
    @Import(name="reputationProfileId", required=true)
    private Output<Integer> reputationProfileId;

    /**
     * @return Unique identifier of the reputation profile
     * 
     */
    public Output<Integer> reputationProfileId() {
        return this.reputationProfileId;
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private AppSecReputationProfileActionArgs() {}

    private AppSecReputationProfileActionArgs(AppSecReputationProfileActionArgs $) {
        this.action = $.action;
        this.configId = $.configId;
        this.reputationProfileId = $.reputationProfileId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecReputationProfileActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecReputationProfileActionArgs $;

        public Builder() {
            $ = new AppSecReputationProfileActionArgs();
        }

        public Builder(AppSecReputationProfileActionArgs defaults) {
            $ = new AppSecReputationProfileActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action to be taken when the reputation profile is triggered
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action to be taken when the reputation profile is triggered
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
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
         * @param reputationProfileId Unique identifier of the reputation profile
         * 
         * @return builder
         * 
         */
        public Builder reputationProfileId(Output<Integer> reputationProfileId) {
            $.reputationProfileId = reputationProfileId;
            return this;
        }

        /**
         * @param reputationProfileId Unique identifier of the reputation profile
         * 
         * @return builder
         * 
         */
        public Builder reputationProfileId(Integer reputationProfileId) {
            return reputationProfileId(Output.of(reputationProfileId));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
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

        public AppSecReputationProfileActionArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.reputationProfileId = Objects.requireNonNull($.reputationProfileId, "expected parameter 'reputationProfileId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
