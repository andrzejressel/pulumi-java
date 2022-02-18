// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.ResourceRecordSetResponse;
import java.util.List;
import java.util.Objects;


public final class ResponsePolicyRuleLocalDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResponsePolicyRuleLocalDataResponse Empty = new ResponsePolicyRuleLocalDataResponse();

    /**
     * All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     * 
     */
    @InputImport(name="localDatas", required=true)
    private final List<ResourceRecordSetResponse> localDatas;

    public List<ResourceRecordSetResponse> getLocalDatas() {
        return this.localDatas;
    }

    public ResponsePolicyRuleLocalDataResponse(List<ResourceRecordSetResponse> localDatas) {
        this.localDatas = Objects.requireNonNull(localDatas, "expected parameter 'localDatas' to be non-null");
    }

    private ResponsePolicyRuleLocalDataResponse() {
        this.localDatas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyRuleLocalDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceRecordSetResponse> localDatas;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyRuleLocalDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localDatas = defaults.localDatas;
        }

        public Builder setLocalDatas(List<ResourceRecordSetResponse> localDatas) {
            this.localDatas = Objects.requireNonNull(localDatas);
            return this;
        }

        public ResponsePolicyRuleLocalDataResponse build() {
            return new ResponsePolicyRuleLocalDataResponse(localDatas);
        }
    }
}
