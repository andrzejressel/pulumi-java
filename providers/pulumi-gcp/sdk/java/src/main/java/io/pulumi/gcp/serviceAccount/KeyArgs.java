// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyArgs Empty = new KeyArgs();

    /**
     * Arbitrary map of values that, when changed, will trigger a new key to be generated.
     * 
     */
    @InputImport(name="keepers")
    private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    /**
     * The algorithm used to generate the key. KEY_ALG_RSA_2048 is the default algorithm.
     * Valid values are listed at
     * [ServiceAccountPrivateKeyType](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys#ServiceAccountKeyAlgorithm)
     * (only used on create)
     * 
     */
    @InputImport(name="keyAlgorithm")
    private final @Nullable Input<String> keyAlgorithm;

    public Input<String> getKeyAlgorithm() {
        return this.keyAlgorithm == null ? Input.empty() : this.keyAlgorithm;
    }

    /**
     * The output format of the private key. TYPE_GOOGLE_CREDENTIALS_FILE is the default output format.
     * 
     */
    @InputImport(name="privateKeyType")
    private final @Nullable Input<String> privateKeyType;

    public Input<String> getPrivateKeyType() {
        return this.privateKeyType == null ? Input.empty() : this.privateKeyType;
    }

    /**
     * Public key data to create a service account key for given service account. The expected format for this field is a base64 encoded X509_PEM and it conflicts with `public_key_type` and `private_key_type`.
     * 
     */
    @InputImport(name="publicKeyData")
    private final @Nullable Input<String> publicKeyData;

    public Input<String> getPublicKeyData() {
        return this.publicKeyData == null ? Input.empty() : this.publicKeyData;
    }

    /**
     * The output format of the public key requested. TYPE_X509_PEM_FILE is the default output format.
     * 
     */
    @InputImport(name="publicKeyType")
    private final @Nullable Input<String> publicKeyType;

    public Input<String> getPublicKeyType() {
        return this.publicKeyType == null ? Input.empty() : this.publicKeyType;
    }

    /**
     * The Service account id of the Key. This can be a string in the format
     * `{ACCOUNT}` or `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT}`, where `{ACCOUNT}` is the email address or
     * unique id of the service account. If the `{ACCOUNT}` syntax is used, the project will be inferred from the account.
     * 
     */
    @InputImport(name="serviceAccountId", required=true)
    private final Input<String> serviceAccountId;

    public Input<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    public KeyArgs(
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<String> keyAlgorithm,
        @Nullable Input<String> privateKeyType,
        @Nullable Input<String> publicKeyData,
        @Nullable Input<String> publicKeyType,
        Input<String> serviceAccountId) {
        this.keepers = keepers;
        this.keyAlgorithm = keyAlgorithm;
        this.privateKeyType = privateKeyType;
        this.publicKeyData = publicKeyData;
        this.publicKeyType = publicKeyType;
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
    }

    private KeyArgs() {
        this.keepers = Input.empty();
        this.keyAlgorithm = Input.empty();
        this.privateKeyType = Input.empty();
        this.publicKeyData = Input.empty();
        this.publicKeyType = Input.empty();
        this.serviceAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<String> keyAlgorithm;
        private @Nullable Input<String> privateKeyType;
        private @Nullable Input<String> publicKeyData;
        private @Nullable Input<String> publicKeyType;
        private Input<String> serviceAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.privateKeyType = defaults.privateKeyType;
    	      this.publicKeyData = defaults.publicKeyData;
    	      this.publicKeyType = defaults.publicKeyType;
    	      this.serviceAccountId = defaults.serviceAccountId;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setKeyAlgorithm(@Nullable Input<String> keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        public Builder setKeyAlgorithm(@Nullable String keyAlgorithm) {
            this.keyAlgorithm = Input.ofNullable(keyAlgorithm);
            return this;
        }

        public Builder setPrivateKeyType(@Nullable Input<String> privateKeyType) {
            this.privateKeyType = privateKeyType;
            return this;
        }

        public Builder setPrivateKeyType(@Nullable String privateKeyType) {
            this.privateKeyType = Input.ofNullable(privateKeyType);
            return this;
        }

        public Builder setPublicKeyData(@Nullable Input<String> publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }

        public Builder setPublicKeyData(@Nullable String publicKeyData) {
            this.publicKeyData = Input.ofNullable(publicKeyData);
            return this;
        }

        public Builder setPublicKeyType(@Nullable Input<String> publicKeyType) {
            this.publicKeyType = publicKeyType;
            return this;
        }

        public Builder setPublicKeyType(@Nullable String publicKeyType) {
            this.publicKeyType = Input.ofNullable(publicKeyType);
            return this;
        }

        public Builder setServiceAccountId(Input<String> serviceAccountId) {
            this.serviceAccountId = Objects.requireNonNull(serviceAccountId);
            return this;
        }

        public Builder setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = Input.of(Objects.requireNonNull(serviceAccountId));
            return this;
        }

        public KeyArgs build() {
            return new KeyArgs(keepers, keyAlgorithm, privateKeyType, publicKeyData, publicKeyType, serviceAccountId);
        }
    }
}
