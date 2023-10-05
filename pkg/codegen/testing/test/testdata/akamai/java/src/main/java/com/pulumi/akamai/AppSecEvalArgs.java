// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecEvalArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecEvalArgs Empty = new AppSecEvalArgs();

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
     * Evaluation mode (ASE_AUTO or ASE_MANUAL)
     * 
     */
    @Import(name="evalMode")
    private @Nullable Output<String> evalMode;

    /**
     * @return Evaluation mode (ASE_AUTO or ASE_MANUAL)
     * 
     */
    public Optional<Output<String>> evalMode() {
        return Optional.ofNullable(this.evalMode);
    }

    /**
     * Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
     * 
     */
    @Import(name="evalOperation", required=true)
    private Output<String> evalOperation;

    /**
     * @return Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
     * 
     */
    public Output<String> evalOperation() {
        return this.evalOperation;
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

    private AppSecEvalArgs() {}

    private AppSecEvalArgs(AppSecEvalArgs $) {
        this.configId = $.configId;
        this.evalMode = $.evalMode;
        this.evalOperation = $.evalOperation;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecEvalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecEvalArgs $;

        public Builder() {
            $ = new AppSecEvalArgs();
        }

        public Builder(AppSecEvalArgs defaults) {
            $ = new AppSecEvalArgs(Objects.requireNonNull(defaults));
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
         * @param evalMode Evaluation mode (ASE_AUTO or ASE_MANUAL)
         * 
         * @return builder
         * 
         */
        public Builder evalMode(@Nullable Output<String> evalMode) {
            $.evalMode = evalMode;
            return this;
        }

        /**
         * @param evalMode Evaluation mode (ASE_AUTO or ASE_MANUAL)
         * 
         * @return builder
         * 
         */
        public Builder evalMode(String evalMode) {
            return evalMode(Output.of(evalMode));
        }

        /**
         * @param evalOperation Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
         * 
         * @return builder
         * 
         */
        public Builder evalOperation(Output<String> evalOperation) {
            $.evalOperation = evalOperation;
            return this;
        }

        /**
         * @param evalOperation Evaluation mode operation (START, STOP, RESTART, UPDATE or COMPLETE)
         * 
         * @return builder
         * 
         */
        public Builder evalOperation(String evalOperation) {
            return evalOperation(Output.of(evalOperation));
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

        public AppSecEvalArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.evalOperation = Objects.requireNonNull($.evalOperation, "expected parameter 'evalOperation' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
