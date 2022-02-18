// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.JwtResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Occurrence that represents a single "attestation". The authenticity of an attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the authority to which this attestation is attached is primarily useful for lookup (how to find this attestation if you already know the authority and artifact to be verified) and intent (for which authority this attestation was intended to sign.
 * 
 */
public final class AttestationOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttestationOccurrenceResponse Empty = new AttestationOccurrenceResponse();

    /**
     * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload` field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API implementations. The JWT itself is opaque to Grafeas.
     * 
     */
    @InputImport(name="jwts", required=true)
    private final List<JwtResponse> jwts;

    public List<JwtResponse> getJwts() {
        return this.jwts;
    }

    /**
     * The serialized payload that is verified by one or more `signatures`.
     * 
     */
    @InputImport(name="serializedPayload", required=true)
    private final String serializedPayload;

    public String getSerializedPayload() {
        return this.serializedPayload;
    }

    /**
     * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    @InputImport(name="signatures", required=true)
    private final List<SignatureResponse> signatures;

    public List<SignatureResponse> getSignatures() {
        return this.signatures;
    }

    public AttestationOccurrenceResponse(
        List<JwtResponse> jwts,
        String serializedPayload,
        List<SignatureResponse> signatures) {
        this.jwts = Objects.requireNonNull(jwts, "expected parameter 'jwts' to be non-null");
        this.serializedPayload = Objects.requireNonNull(serializedPayload, "expected parameter 'serializedPayload' to be non-null");
        this.signatures = Objects.requireNonNull(signatures, "expected parameter 'signatures' to be non-null");
    }

    private AttestationOccurrenceResponse() {
        this.jwts = List.of();
        this.serializedPayload = null;
        this.signatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<JwtResponse> jwts;
        private String serializedPayload;
        private List<SignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jwts = defaults.jwts;
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder setJwts(List<JwtResponse> jwts) {
            this.jwts = Objects.requireNonNull(jwts);
            return this;
        }

        public Builder setSerializedPayload(String serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }

        public Builder setSignatures(List<SignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }

        public AttestationOccurrenceResponse build() {
            return new AttestationOccurrenceResponse(jwts, serializedPayload, signatures);
        }
    }
}
