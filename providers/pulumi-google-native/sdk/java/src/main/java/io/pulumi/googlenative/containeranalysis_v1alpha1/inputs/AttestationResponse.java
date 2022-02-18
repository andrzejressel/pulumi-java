// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.PgpSignedAttestationResponse;
import java.util.Objects;


/**
 * Occurrence that represents a single "attestation". The authenticity of an Attestation can be verified using the attached signature. If the verifier trusts the public key of the signer, then verifying the signature is sufficient to establish trust. In this circumstance, the AttestationAuthority to which this Attestation is attached is primarily useful for look-up (how to find this Attestation if you already know the Authority and artifact to be verified) and intent (which authority was this attestation intended to sign for).
 * 
 */
public final class AttestationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttestationResponse Empty = new AttestationResponse();

    @InputImport(name="pgpSignedAttestation", required=true)
    private final PgpSignedAttestationResponse pgpSignedAttestation;

    public PgpSignedAttestationResponse getPgpSignedAttestation() {
        return this.pgpSignedAttestation;
    }

    public AttestationResponse(PgpSignedAttestationResponse pgpSignedAttestation) {
        this.pgpSignedAttestation = Objects.requireNonNull(pgpSignedAttestation, "expected parameter 'pgpSignedAttestation' to be non-null");
    }

    private AttestationResponse() {
        this.pgpSignedAttestation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PgpSignedAttestationResponse pgpSignedAttestation;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pgpSignedAttestation = defaults.pgpSignedAttestation;
        }

        public Builder setPgpSignedAttestation(PgpSignedAttestationResponse pgpSignedAttestation) {
            this.pgpSignedAttestation = Objects.requireNonNull(pgpSignedAttestation);
            return this;
        }

        public AttestationResponse build() {
            return new AttestationResponse(pgpSignedAttestation);
        }
    }
}
