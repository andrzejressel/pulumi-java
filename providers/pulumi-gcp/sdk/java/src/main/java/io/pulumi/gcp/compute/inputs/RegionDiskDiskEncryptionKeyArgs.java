// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskDiskEncryptionKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskDiskEncryptionKeyArgs Empty = new RegionDiskDiskEncryptionKeyArgs();

    /**
     * The name of the encryption key that is stored in Google Cloud KMS.
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    @InputImport(name="rawKey")
    private final @Nullable Input<String> rawKey;

    public Input<String> getRawKey() {
        return this.rawKey == null ? Input.empty() : this.rawKey;
    }

    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    @InputImport(name="sha256")
    private final @Nullable Input<String> sha256;

    public Input<String> getSha256() {
        return this.sha256 == null ? Input.empty() : this.sha256;
    }

    public RegionDiskDiskEncryptionKeyArgs(
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<String> rawKey,
        @Nullable Input<String> sha256) {
        this.kmsKeyName = kmsKeyName;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    private RegionDiskDiskEncryptionKeyArgs() {
        this.kmsKeyName = Input.empty();
        this.rawKey = Input.empty();
        this.sha256 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskDiskEncryptionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<String> rawKey;
        private @Nullable Input<String> sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskDiskEncryptionKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setRawKey(@Nullable Input<String> rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder setRawKey(@Nullable String rawKey) {
            this.rawKey = Input.ofNullable(rawKey);
            return this;
        }

        public Builder setSha256(@Nullable Input<String> sha256) {
            this.sha256 = sha256;
            return this;
        }

        public Builder setSha256(@Nullable String sha256) {
            this.sha256 = Input.ofNullable(sha256);
            return this;
        }

        public RegionDiskDiskEncryptionKeyArgs build() {
            return new RegionDiskDiskEncryptionKeyArgs(kmsKeyName, rawKey, sha256);
        }
    }
}
