// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketIAMPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final BucketIAMPolicyState Empty = new BucketIAMPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
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

    public BucketIAMPolicyState(
        @Nullable Input<String> bucket,
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData) {
        this.bucket = bucket;
        this.etag = etag;
        this.policyData = policyData;
    }

    private BucketIAMPolicyState() {
        this.bucket = Input.empty();
        this.etag = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
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

        public BucketIAMPolicyState build() {
            return new BucketIAMPolicyState(bucket, etag, policyData);
        }
    }
}
