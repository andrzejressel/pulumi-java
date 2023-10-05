// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEdgeWorkersResourceTierArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEdgeWorkersResourceTierArgs Empty = new GetEdgeWorkersResourceTierArgs();

    @Import(name="contractId", required=true)
    private Output<String> contractId;

    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="resourceTierName", required=true)
    private Output<String> resourceTierName;

    public Output<String> resourceTierName() {
        return this.resourceTierName;
    }

    private GetEdgeWorkersResourceTierArgs() {}

    private GetEdgeWorkersResourceTierArgs(GetEdgeWorkersResourceTierArgs $) {
        this.contractId = $.contractId;
        this.resourceTierName = $.resourceTierName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEdgeWorkersResourceTierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEdgeWorkersResourceTierArgs $;

        public Builder() {
            $ = new GetEdgeWorkersResourceTierArgs();
        }

        public Builder(GetEdgeWorkersResourceTierArgs defaults) {
            $ = new GetEdgeWorkersResourceTierArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder resourceTierName(Output<String> resourceTierName) {
            $.resourceTierName = resourceTierName;
            return this;
        }

        public Builder resourceTierName(String resourceTierName) {
            return resourceTierName(Output.of(resourceTierName));
        }

        public GetEdgeWorkersResourceTierArgs build() {
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.resourceTierName = Objects.requireNonNull($.resourceTierName, "expected parameter 'resourceTierName' to be non-null");
            return $;
        }
    }

}
