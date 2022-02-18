// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreIamPolicyState Empty = new ConsentStoreIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="consentStoreId")
    private final @Nullable Input<String> consentStoreId;

    public Input<String> getConsentStoreId() {
        return this.consentStoreId == null ? Input.empty() : this.consentStoreId;
    }

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
    private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    public ConsentStoreIamPolicyState(
        @Nullable Input<String> consentStoreId,
        @Nullable Input<String> dataset,
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData) {
        this.consentStoreId = consentStoreId;
        this.dataset = dataset;
        this.etag = etag;
        this.policyData = policyData;
    }

    private ConsentStoreIamPolicyState() {
        this.consentStoreId = Input.empty();
        this.dataset = Input.empty();
        this.etag = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> consentStoreId;
        private @Nullable Input<String> dataset;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataset = defaults.dataset;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
        }

        public Builder setConsentStoreId(@Nullable Input<String> consentStoreId) {
            this.consentStoreId = consentStoreId;
            return this;
        }

        public Builder setConsentStoreId(@Nullable String consentStoreId) {
            this.consentStoreId = Input.ofNullable(consentStoreId);
            return this;
        }

        public Builder setDataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }

        public ConsentStoreIamPolicyState build() {
            return new ConsentStoreIamPolicyState(consentStoreId, dataset, etag, policyData);
        }
    }
}
