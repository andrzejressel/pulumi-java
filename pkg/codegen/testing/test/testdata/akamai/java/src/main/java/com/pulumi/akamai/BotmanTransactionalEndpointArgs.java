// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanTransactionalEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanTransactionalEndpointArgs Empty = new BotmanTransactionalEndpointArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="operationId", required=true)
    private Output<String> operationId;

    public Output<String> operationId() {
        return this.operationId;
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    @Import(name="transactionalEndpoint", required=true)
    private Output<String> transactionalEndpoint;

    public Output<String> transactionalEndpoint() {
        return this.transactionalEndpoint;
    }

    private BotmanTransactionalEndpointArgs() {}

    private BotmanTransactionalEndpointArgs(BotmanTransactionalEndpointArgs $) {
        this.configId = $.configId;
        this.operationId = $.operationId;
        this.securityPolicyId = $.securityPolicyId;
        this.transactionalEndpoint = $.transactionalEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanTransactionalEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanTransactionalEndpointArgs $;

        public Builder() {
            $ = new BotmanTransactionalEndpointArgs();
        }

        public Builder(BotmanTransactionalEndpointArgs defaults) {
            $ = new BotmanTransactionalEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder operationId(Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public Builder transactionalEndpoint(Output<String> transactionalEndpoint) {
            $.transactionalEndpoint = transactionalEndpoint;
            return this;
        }

        public Builder transactionalEndpoint(String transactionalEndpoint) {
            return transactionalEndpoint(Output.of(transactionalEndpoint));
        }

        public BotmanTransactionalEndpointArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.operationId = Objects.requireNonNull($.operationId, "expected parameter 'operationId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            $.transactionalEndpoint = Objects.requireNonNull($.transactionalEndpoint, "expected parameter 'transactionalEndpoint' to be non-null");
            return $;
        }
    }

}
