// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class KeyRingImportJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobArgs Empty = new KeyRingImportJobArgs();

    /**
     * It must be unique within a KeyRing and match the regular expression [a-zA-Z0-9_-]{1,63}
     * 
     */
    @InputImport(name="importJobId", required=true)
    private final Input<String> importJobId;

    public Input<String> getImportJobId() {
        return this.importJobId;
    }

    /**
     * The wrapping method to be used for incoming key material.
     * Possible values are `RSA_OAEP_3072_SHA1_AES_256` and `RSA_OAEP_4096_SHA1_AES_256`.
     * 
     */
    @InputImport(name="importMethod", required=true)
    private final Input<String> importMethod;

    public Input<String> getImportMethod() {
        return this.importMethod;
    }

    /**
     * The KeyRing that this import job belongs to.
     * Format: `'projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}'`.
     * 
     */
    @InputImport(name="keyRing", required=true)
    private final Input<String> keyRing;

    public Input<String> getKeyRing() {
        return this.keyRing;
    }

    /**
     * The protection level of the ImportJob. This must match the protectionLevel of the
     * versionTemplate on the CryptoKey you attempt to import into.
     * Possible values are `SOFTWARE`, `HSM`, and `EXTERNAL`.
     * 
     */
    @InputImport(name="protectionLevel", required=true)
    private final Input<String> protectionLevel;

    public Input<String> getProtectionLevel() {
        return this.protectionLevel;
    }

    public KeyRingImportJobArgs(
        Input<String> importJobId,
        Input<String> importMethod,
        Input<String> keyRing,
        Input<String> protectionLevel) {
        this.importJobId = Objects.requireNonNull(importJobId, "expected parameter 'importJobId' to be non-null");
        this.importMethod = Objects.requireNonNull(importMethod, "expected parameter 'importMethod' to be non-null");
        this.keyRing = Objects.requireNonNull(keyRing, "expected parameter 'keyRing' to be non-null");
        this.protectionLevel = Objects.requireNonNull(protectionLevel, "expected parameter 'protectionLevel' to be non-null");
    }

    private KeyRingImportJobArgs() {
        this.importJobId = Input.empty();
        this.importMethod = Input.empty();
        this.keyRing = Input.empty();
        this.protectionLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> importJobId;
        private Input<String> importMethod;
        private Input<String> keyRing;
        private Input<String> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importJobId = defaults.importJobId;
    	      this.importMethod = defaults.importMethod;
    	      this.keyRing = defaults.keyRing;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder setImportJobId(Input<String> importJobId) {
            this.importJobId = Objects.requireNonNull(importJobId);
            return this;
        }

        public Builder setImportJobId(String importJobId) {
            this.importJobId = Input.of(Objects.requireNonNull(importJobId));
            return this;
        }

        public Builder setImportMethod(Input<String> importMethod) {
            this.importMethod = Objects.requireNonNull(importMethod);
            return this;
        }

        public Builder setImportMethod(String importMethod) {
            this.importMethod = Input.of(Objects.requireNonNull(importMethod));
            return this;
        }

        public Builder setKeyRing(Input<String> keyRing) {
            this.keyRing = Objects.requireNonNull(keyRing);
            return this;
        }

        public Builder setKeyRing(String keyRing) {
            this.keyRing = Input.of(Objects.requireNonNull(keyRing));
            return this;
        }

        public Builder setProtectionLevel(Input<String> protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }

        public Builder setProtectionLevel(String protectionLevel) {
            this.protectionLevel = Input.of(Objects.requireNonNull(protectionLevel));
            return this;
        }

        public KeyRingImportJobArgs build() {
            return new KeyRingImportJobArgs(importJobId, importMethod, keyRing, protectionLevel);
        }
    }
}
