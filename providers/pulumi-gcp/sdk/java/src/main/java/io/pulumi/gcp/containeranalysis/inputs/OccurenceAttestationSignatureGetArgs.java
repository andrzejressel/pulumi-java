// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.containeranalysis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurenceAttestationSignatureGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurenceAttestationSignatureGetArgs Empty = new OccurenceAttestationSignatureGetArgs();

    /**
     * The identifier for the public key that verifies this
     * signature. MUST be an RFC3986 conformant
     * URI. * When possible, the key id should be an
     * immutable reference, such as a cryptographic digest.
     * Examples of valid values:
     * * OpenPGP V4 public key fingerprint. See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr
     *   for more details on this scheme.
     * * `openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA`
     * * RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):
     * * "ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU"
     * 
     */
    @InputImport(name="publicKeyId", required=true)
    private final Input<String> publicKeyId;

    public Input<String> getPublicKeyId() {
        return this.publicKeyId;
    }

    /**
     * The content of the signature, an opaque bytestring.
     * The payload that this signature verifies MUST be
     * unambiguously provided with the Signature during
     * verification. A wrapper message might provide the
     * payload explicitly. Alternatively, a message might
     * have a canonical serialization that can always be
     * unambiguously computed to derive the payload.
     * 
     */
    @InputImport(name="signature")
    private final @Nullable Input<String> signature;

    public Input<String> getSignature() {
        return this.signature == null ? Input.empty() : this.signature;
    }

    public OccurenceAttestationSignatureGetArgs(
        Input<String> publicKeyId,
        @Nullable Input<String> signature) {
        this.publicKeyId = Objects.requireNonNull(publicKeyId, "expected parameter 'publicKeyId' to be non-null");
        this.signature = signature;
    }

    private OccurenceAttestationSignatureGetArgs() {
        this.publicKeyId = Input.empty();
        this.signature = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurenceAttestationSignatureGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> publicKeyId;
        private @Nullable Input<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurenceAttestationSignatureGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyId = defaults.publicKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder setPublicKeyId(Input<String> publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }

        public Builder setPublicKeyId(String publicKeyId) {
            this.publicKeyId = Input.of(Objects.requireNonNull(publicKeyId));
            return this;
        }

        public Builder setSignature(@Nullable Input<String> signature) {
            this.signature = signature;
            return this;
        }

        public Builder setSignature(@Nullable String signature) {
            this.signature = Input.ofNullable(signature);
            return this;
        }

        public OccurenceAttestationSignatureGetArgs build() {
            return new OccurenceAttestationSignatureGetArgs(publicKeyId, signature);
        }
    }
}
