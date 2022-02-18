// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectCustomerEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectCustomerEncryptionGetArgs Empty = new BucketObjectCustomerEncryptionGetArgs();

    /**
     * Encryption algorithm. Default: AES256
     * 
     */
    @InputImport(name="encryptionAlgorithm")
    private final @Nullable Input<String> encryptionAlgorithm;

    public Input<String> getEncryptionAlgorithm() {
        return this.encryptionAlgorithm == null ? Input.empty() : this.encryptionAlgorithm;
    }

    /**
     * Base64 encoded Customer-Supplied Encryption Key.
     * 
     */
    @InputImport(name="encryptionKey", required=true)
    private final Input<String> encryptionKey;

    public Input<String> getEncryptionKey() {
        return this.encryptionKey;
    }

    public BucketObjectCustomerEncryptionGetArgs(
        @Nullable Input<String> encryptionAlgorithm,
        Input<String> encryptionKey) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
    }

    private BucketObjectCustomerEncryptionGetArgs() {
        this.encryptionAlgorithm = Input.empty();
        this.encryptionKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encryptionAlgorithm;
        private Input<String> encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder setEncryptionAlgorithm(@Nullable Input<String> encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        public Builder setEncryptionAlgorithm(@Nullable String encryptionAlgorithm) {
            this.encryptionAlgorithm = Input.ofNullable(encryptionAlgorithm);
            return this;
        }

        public Builder setEncryptionKey(Input<String> encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }

        public Builder setEncryptionKey(String encryptionKey) {
            this.encryptionKey = Input.of(Objects.requireNonNull(encryptionKey));
            return this;
        }

        public BucketObjectCustomerEncryptionGetArgs build() {
            return new BucketObjectCustomerEncryptionGetArgs(encryptionAlgorithm, encryptionKey);
        }
    }
}
