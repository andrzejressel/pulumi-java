// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PublicKeyResponse {
    /**
     * A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
     * 
     */
    private final String key;
    /**
     * Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"key","type"})
    private PublicKeyResponse(
        String key,
        String type) {
        this.key = Objects.requireNonNull(key);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public PublicKeyResponse build() {
            return new PublicKeyResponse(key, type);
        }
    }
}
