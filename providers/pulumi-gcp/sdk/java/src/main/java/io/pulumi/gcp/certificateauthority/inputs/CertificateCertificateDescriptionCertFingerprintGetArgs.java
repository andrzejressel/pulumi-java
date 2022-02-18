// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionCertFingerprintGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionCertFingerprintGetArgs Empty = new CertificateCertificateDescriptionCertFingerprintGetArgs();

    @InputImport(name="sha256Hash")
    private final @Nullable Input<String> sha256Hash;

    public Input<String> getSha256Hash() {
        return this.sha256Hash == null ? Input.empty() : this.sha256Hash;
    }

    public CertificateCertificateDescriptionCertFingerprintGetArgs(@Nullable Input<String> sha256Hash) {
        this.sha256Hash = sha256Hash;
    }

    private CertificateCertificateDescriptionCertFingerprintGetArgs() {
        this.sha256Hash = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionCertFingerprintGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sha256Hash;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionCertFingerprintGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Hash = defaults.sha256Hash;
        }

        public Builder setSha256Hash(@Nullable Input<String> sha256Hash) {
            this.sha256Hash = sha256Hash;
            return this;
        }

        public Builder setSha256Hash(@Nullable String sha256Hash) {
            this.sha256Hash = Input.ofNullable(sha256Hash);
            return this;
        }

        public CertificateCertificateDescriptionCertFingerprintGetArgs build() {
            return new CertificateCertificateDescriptionCertFingerprintGetArgs(sha256Hash);
        }
    }
}
