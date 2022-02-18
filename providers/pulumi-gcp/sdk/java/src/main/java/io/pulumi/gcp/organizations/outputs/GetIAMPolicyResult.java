// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.organizations.outputs.GetIAMPolicyAuditConfig;
import io.pulumi.gcp.organizations.outputs.GetIAMPolicyBinding;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIAMPolicyResult {
    private final @Nullable List<GetIAMPolicyAuditConfig> auditConfigs;
    private final @Nullable List<GetIAMPolicyBinding> bindings;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The above bindings serialized in a format suitable for
     * referencing from a resource that supports IAM.
     * 
     */
    private final String policyData;

    @OutputCustomType.Constructor({"auditConfigs","bindings","id","policyData"})
    private GetIAMPolicyResult(
        @Nullable List<GetIAMPolicyAuditConfig> auditConfigs,
        @Nullable List<GetIAMPolicyBinding> bindings,
        String id,
        String policyData) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.id = Objects.requireNonNull(id);
        this.policyData = Objects.requireNonNull(policyData);
    }

    public List<GetIAMPolicyAuditConfig> getAuditConfigs() {
        return this.auditConfigs == null ? List.of() : this.auditConfigs;
    }
    public List<GetIAMPolicyBinding> getBindings() {
        return this.bindings == null ? List.of() : this.bindings;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The above bindings serialized in a format suitable for
     * referencing from a resource that supports IAM.
     * 
     */
    public String getPolicyData() {
        return this.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetIAMPolicyAuditConfig> auditConfigs;
        private @Nullable List<GetIAMPolicyBinding> bindings;
        private String id;
        private String policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.id = defaults.id;
    	      this.policyData = defaults.policyData;
        }

        public Builder setAuditConfigs(@Nullable List<GetIAMPolicyAuditConfig> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setBindings(@Nullable List<GetIAMPolicyBinding> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public GetIAMPolicyResult build() {
            return new GetIAMPolicyResult(auditConfigs, bindings, id, policyData);
        }
    }
}
