// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class Hl7StoreIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamPolicyArgs Empty = new Hl7StoreIamPolicyArgs();

    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="hl7V2StoreId", required=true)
    private final Input<String> hl7V2StoreId;

    public Input<String> getHl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    public Hl7StoreIamPolicyArgs(
        Input<String> hl7V2StoreId,
        Input<String> policyData) {
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
    }

    private Hl7StoreIamPolicyArgs() {
        this.hl7V2StoreId = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hl7V2StoreId;
        private Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.policyData = defaults.policyData;
        }

        public Builder setHl7V2StoreId(Input<String> hl7V2StoreId) {
            this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId);
            return this;
        }

        public Builder setHl7V2StoreId(String hl7V2StoreId) {
            this.hl7V2StoreId = Input.of(Objects.requireNonNull(hl7V2StoreId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Hl7StoreIamPolicyArgs build() {
            return new Hl7StoreIamPolicyArgs(hl7V2StoreId, policyData);
        }
    }
}
