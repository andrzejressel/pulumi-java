// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEdgeWorkersResourceTierPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEdgeWorkersResourceTierPlainArgs Empty = new GetEdgeWorkersResourceTierPlainArgs();

    @Import(name="contractId", required=true)
    private String contractId;

    public String contractId() {
        return this.contractId;
    }

    @Import(name="resourceTierName", required=true)
    private String resourceTierName;

    public String resourceTierName() {
        return this.resourceTierName;
    }

    private GetEdgeWorkersResourceTierPlainArgs() {}

    private GetEdgeWorkersResourceTierPlainArgs(GetEdgeWorkersResourceTierPlainArgs $) {
        this.contractId = $.contractId;
        this.resourceTierName = $.resourceTierName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEdgeWorkersResourceTierPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEdgeWorkersResourceTierPlainArgs $;

        public Builder() {
            $ = new GetEdgeWorkersResourceTierPlainArgs();
        }

        public Builder(GetEdgeWorkersResourceTierPlainArgs defaults) {
            $ = new GetEdgeWorkersResourceTierPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(String contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder resourceTierName(String resourceTierName) {
            $.resourceTierName = resourceTierName;
            return this;
        }

        public GetEdgeWorkersResourceTierPlainArgs build() {
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.resourceTierName = Objects.requireNonNull($.resourceTierName, "expected parameter 'resourceTierName' to be non-null");
            return $;
        }
    }

}
