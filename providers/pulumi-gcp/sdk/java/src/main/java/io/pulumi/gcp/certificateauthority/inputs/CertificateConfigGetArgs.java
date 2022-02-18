// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigPublicKeyGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigGetArgs;
import java.util.Objects;


public final class CertificateConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigGetArgs Empty = new CertificateConfigGetArgs();

    /**
     * A PublicKey describes a public key.
     * Structure is documented below.
     * 
     */
    @InputImport(name="publicKey", required=true)
    private final Input<CertificateConfigPublicKeyGetArgs> publicKey;

    public Input<CertificateConfigPublicKeyGetArgs> getPublicKey() {
        return this.publicKey;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subjectConfig", required=true)
    private final Input<CertificateConfigSubjectConfigGetArgs> subjectConfig;

    public Input<CertificateConfigSubjectConfigGetArgs> getSubjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    @InputImport(name="x509Config", required=true)
    private final Input<CertificateConfigX509ConfigGetArgs> x509Config;

    public Input<CertificateConfigX509ConfigGetArgs> getX509Config() {
        return this.x509Config;
    }

    public CertificateConfigGetArgs(
        Input<CertificateConfigPublicKeyGetArgs> publicKey,
        Input<CertificateConfigSubjectConfigGetArgs> subjectConfig,
        Input<CertificateConfigX509ConfigGetArgs> x509Config) {
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
        this.x509Config = Objects.requireNonNull(x509Config, "expected parameter 'x509Config' to be non-null");
    }

    private CertificateConfigGetArgs() {
        this.publicKey = Input.empty();
        this.subjectConfig = Input.empty();
        this.x509Config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CertificateConfigPublicKeyGetArgs> publicKey;
        private Input<CertificateConfigSubjectConfigGetArgs> subjectConfig;
        private Input<CertificateConfigX509ConfigGetArgs> x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder setPublicKey(Input<CertificateConfigPublicKeyGetArgs> publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setPublicKey(CertificateConfigPublicKeyGetArgs publicKey) {
            this.publicKey = Input.of(Objects.requireNonNull(publicKey));
            return this;
        }

        public Builder setSubjectConfig(Input<CertificateConfigSubjectConfigGetArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder setSubjectConfig(CertificateConfigSubjectConfigGetArgs subjectConfig) {
            this.subjectConfig = Input.of(Objects.requireNonNull(subjectConfig));
            return this;
        }

        public Builder setX509Config(Input<CertificateConfigX509ConfigGetArgs> x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }

        public Builder setX509Config(CertificateConfigX509ConfigGetArgs x509Config) {
            this.x509Config = Input.of(Objects.requireNonNull(x509Config));
            return this;
        }

        public CertificateConfigGetArgs build() {
            return new CertificateConfigGetArgs(publicKey, subjectConfig, x509Config);
        }
    }
}
