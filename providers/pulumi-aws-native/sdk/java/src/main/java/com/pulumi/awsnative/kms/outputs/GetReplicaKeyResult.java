// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms.outputs;

import com.pulumi.awsnative.kms.outputs.ReplicaKeyTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReplicaKeyResult {
    private final @Nullable String arn;
    /**
     * @return A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
     * 
     */
    private final @Nullable Boolean enabled;
    private final @Nullable String keyId;
    /**
     * @return The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
     * 
     */
    private final @Nullable Object keyPolicy;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<ReplicaKeyTag> tags;

    @CustomType.Constructor
    private GetReplicaKeyResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("keyId") @Nullable String keyId,
        @CustomType.Parameter("keyPolicy") @Nullable Object keyPolicy,
        @CustomType.Parameter("tags") @Nullable List<ReplicaKeyTag> tags) {
        this.arn = arn;
        this.description = description;
        this.enabled = enabled;
        this.keyId = keyId;
        this.keyPolicy = keyPolicy;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return A description of the AWS KMS key. Use a description that helps you to distinguish this AWS KMS key from others in the account, such as its intended use.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Specifies whether the AWS KMS key is enabled. Disabled AWS KMS keys cannot be used in cryptographic operations.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    /**
     * @return The key policy that authorizes use of the AWS KMS key. The key policy must observe the following rules.
     * 
     */
    public Optional<Object> keyPolicy() {
        return Optional.ofNullable(this.keyPolicy);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<ReplicaKeyTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicaKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable String keyId;
        private @Nullable Object keyPolicy;
        private @Nullable List<ReplicaKeyTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicaKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.keyId = defaults.keyId;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyPolicy(@Nullable Object keyPolicy) {
            this.keyPolicy = keyPolicy;
            return this;
        }
        public Builder tags(@Nullable List<ReplicaKeyTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ReplicaKeyTag... tags) {
            return tags(List.of(tags));
        }        public GetReplicaKeyResult build() {
            return new GetReplicaKeyResult(arn, description, enabled, keyId, keyPolicy, tags);
        }
    }
}
