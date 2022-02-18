// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A KeyId identifies a specific public key, usually by hashing the public key.
 * 
 */
public final class KeyIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyIdResponse Empty = new KeyIdResponse();

    /**
     * Optional. The value of this KeyId encoded in lowercase hexadecimal. This is most likely the 160 bit SHA-1 hash of the public key.
     * 
     */
    @InputImport(name="keyId", required=true)
    private final String keyId;

    public String getKeyId() {
        return this.keyId;
    }

    public KeyIdResponse(String keyId) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
    }

    private KeyIdResponse() {
        this.keyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public KeyIdResponse build() {
            return new KeyIdResponse(keyId);
        }
    }
}
