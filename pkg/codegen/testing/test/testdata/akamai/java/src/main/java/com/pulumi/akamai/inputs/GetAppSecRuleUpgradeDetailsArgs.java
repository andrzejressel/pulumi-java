// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecRuleUpgradeDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecRuleUpgradeDetailsArgs Empty = new GetAppSecRuleUpgradeDetailsArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecRuleUpgradeDetailsArgs() {}

    private GetAppSecRuleUpgradeDetailsArgs(GetAppSecRuleUpgradeDetailsArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecRuleUpgradeDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecRuleUpgradeDetailsArgs $;

        public Builder() {
            $ = new GetAppSecRuleUpgradeDetailsArgs();
        }

        public Builder(GetAppSecRuleUpgradeDetailsArgs defaults) {
            $ = new GetAppSecRuleUpgradeDetailsArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecRuleUpgradeDetailsArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
