// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.PublicKeyArgs;
import io.pulumi.googlenative.privateca_v1.inputs.SubjectConfigArgs;
import io.pulumi.googlenative.privateca_v1.inputs.X509ParametersArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CertificateConfig describes an X.509 certificate or CSR that is to be created, as an alternative to using ASN.1.
 * 
 */
public final class CertificateConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigArgs Empty = new CertificateConfigArgs();

    /**
     * Optional. The public key that corresponds to this config. This is, for example, used when issuing Certificates, but not when creating a self-signed CertificateAuthority or CertificateAuthority CSR.
     * 
     */
    @InputImport(name="publicKey")
    private final @Nullable Input<PublicKeyArgs> publicKey;

    public Input<PublicKeyArgs> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * 
     */
    @InputImport(name="subjectConfig", required=true)
    private final Input<SubjectConfigArgs> subjectConfig;

    public Input<SubjectConfigArgs> getSubjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * 
     */
    @InputImport(name="x509Config", required=true)
    private final Input<X509ParametersArgs> x509Config;

    public Input<X509ParametersArgs> getX509Config() {
        return this.x509Config;
    }

    public CertificateConfigArgs(
        @Nullable Input<PublicKeyArgs> publicKey,
        Input<SubjectConfigArgs> subjectConfig,
        Input<X509ParametersArgs> x509Config) {
        this.publicKey = publicKey;
        this.subjectConfig = Objects.requireNonNull(subjectConfig, "expected parameter 'subjectConfig' to be non-null");
        this.x509Config = Objects.requireNonNull(x509Config, "expected parameter 'x509Config' to be non-null");
    }

    private CertificateConfigArgs() {
        this.publicKey = Input.empty();
        this.subjectConfig = Input.empty();
        this.x509Config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PublicKeyArgs> publicKey;
        private Input<SubjectConfigArgs> subjectConfig;
        private Input<X509ParametersArgs> x509Config;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKey = defaults.publicKey;
    	      this.subjectConfig = defaults.subjectConfig;
    	      this.x509Config = defaults.x509Config;
        }

        public Builder setPublicKey(@Nullable Input<PublicKeyArgs> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable PublicKeyArgs publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
            return this;
        }

        public Builder setSubjectConfig(Input<SubjectConfigArgs> subjectConfig) {
            this.subjectConfig = Objects.requireNonNull(subjectConfig);
            return this;
        }

        public Builder setSubjectConfig(SubjectConfigArgs subjectConfig) {
            this.subjectConfig = Input.of(Objects.requireNonNull(subjectConfig));
            return this;
        }

        public Builder setX509Config(Input<X509ParametersArgs> x509Config) {
            this.x509Config = Objects.requireNonNull(x509Config);
            return this;
        }

        public Builder setX509Config(X509ParametersArgs x509Config) {
            this.x509Config = Input.of(Objects.requireNonNull(x509Config));
            return this;
        }

        public CertificateConfigArgs build() {
            return new CertificateConfigArgs(publicKey, subjectConfig, x509Config);
        }
    }
}
