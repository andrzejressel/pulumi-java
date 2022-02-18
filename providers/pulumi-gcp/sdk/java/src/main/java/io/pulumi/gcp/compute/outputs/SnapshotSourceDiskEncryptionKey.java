// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SnapshotSourceDiskEncryptionKey {
    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    private final @Nullable String kmsKeyServiceAccount;
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final @Nullable String rawKey;

    @OutputCustomType.Constructor({"kmsKeyServiceAccount","rawKey"})
    private SnapshotSourceDiskEncryptionKey(
        @Nullable String kmsKeyServiceAccount,
        @Nullable String rawKey) {
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
    }

    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    public Optional<String> getKmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> getRawKey() {
        return Optional.ofNullable(this.rawKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotSourceDiskEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyServiceAccount;
        private @Nullable String rawKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotSourceDiskEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
        }

        public Builder setKmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder setRawKey(@Nullable String rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public SnapshotSourceDiskEncryptionKey build() {
            return new SnapshotSourceDiskEncryptionKey(kmsKeyServiceAccount, rawKey);
        }
    }
}
