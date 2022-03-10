// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LdapsSettingsResponse {
    /**
     * NotAfter DateTime of configure ldaps certificate.
     * 
     */
    private final String certificateNotAfter;
    /**
     * Thumbprint of configure ldaps certificate.
     * 
     */
    private final String certificateThumbprint;
    /**
     * A flag to determine whether or not Secure LDAP access over the internet is enabled or disabled.
     * 
     */
    private final @Nullable String externalAccess;
    /**
     * A flag to determine whether or not Secure LDAP is enabled or disabled.
     * 
     */
    private final @Nullable String ldaps;
    /**
     * The certificate required to configure Secure LDAP. The parameter passed here should be a base64encoded representation of the certificate pfx file.
     * 
     */
    private final @Nullable String pfxCertificate;
    /**
     * The password to decrypt the provided Secure LDAP certificate pfx file.
     * 
     */
    private final @Nullable String pfxCertificatePassword;
    /**
     * Public certificate used to configure secure ldap.
     * 
     */
    private final String publicCertificate;

    @OutputCustomType.Constructor
    private LdapsSettingsResponse(
        @OutputCustomType.Parameter("certificateNotAfter") String certificateNotAfter,
        @OutputCustomType.Parameter("certificateThumbprint") String certificateThumbprint,
        @OutputCustomType.Parameter("externalAccess") @Nullable String externalAccess,
        @OutputCustomType.Parameter("ldaps") @Nullable String ldaps,
        @OutputCustomType.Parameter("pfxCertificate") @Nullable String pfxCertificate,
        @OutputCustomType.Parameter("pfxCertificatePassword") @Nullable String pfxCertificatePassword,
        @OutputCustomType.Parameter("publicCertificate") String publicCertificate) {
        this.certificateNotAfter = certificateNotAfter;
        this.certificateThumbprint = certificateThumbprint;
        this.externalAccess = externalAccess;
        this.ldaps = ldaps;
        this.pfxCertificate = pfxCertificate;
        this.pfxCertificatePassword = pfxCertificatePassword;
        this.publicCertificate = publicCertificate;
    }

    /**
     * NotAfter DateTime of configure ldaps certificate.
     * 
    */
    public String getCertificateNotAfter() {
        return this.certificateNotAfter;
    }
    /**
     * Thumbprint of configure ldaps certificate.
     * 
    */
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }
    /**
     * A flag to determine whether or not Secure LDAP access over the internet is enabled or disabled.
     * 
    */
    public Optional<String> getExternalAccess() {
        return Optional.ofNullable(this.externalAccess);
    }
    /**
     * A flag to determine whether or not Secure LDAP is enabled or disabled.
     * 
    */
    public Optional<String> getLdaps() {
        return Optional.ofNullable(this.ldaps);
    }
    /**
     * The certificate required to configure Secure LDAP. The parameter passed here should be a base64encoded representation of the certificate pfx file.
     * 
    */
    public Optional<String> getPfxCertificate() {
        return Optional.ofNullable(this.pfxCertificate);
    }
    /**
     * The password to decrypt the provided Secure LDAP certificate pfx file.
     * 
    */
    public Optional<String> getPfxCertificatePassword() {
        return Optional.ofNullable(this.pfxCertificatePassword);
    }
    /**
     * Public certificate used to configure secure ldap.
     * 
    */
    public String getPublicCertificate() {
        return this.publicCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LdapsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateNotAfter;
        private String certificateThumbprint;
        private @Nullable String externalAccess;
        private @Nullable String ldaps;
        private @Nullable String pfxCertificate;
        private @Nullable String pfxCertificatePassword;
        private String publicCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(LdapsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateNotAfter = defaults.certificateNotAfter;
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.externalAccess = defaults.externalAccess;
    	      this.ldaps = defaults.ldaps;
    	      this.pfxCertificate = defaults.pfxCertificate;
    	      this.pfxCertificatePassword = defaults.pfxCertificatePassword;
    	      this.publicCertificate = defaults.publicCertificate;
        }

        public Builder setCertificateNotAfter(String certificateNotAfter) {
            this.certificateNotAfter = Objects.requireNonNull(certificateNotAfter);
            return this;
        }

        public Builder setCertificateThumbprint(String certificateThumbprint) {
            this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint);
            return this;
        }

        public Builder setExternalAccess(@Nullable String externalAccess) {
            this.externalAccess = externalAccess;
            return this;
        }

        public Builder setLdaps(@Nullable String ldaps) {
            this.ldaps = ldaps;
            return this;
        }

        public Builder setPfxCertificate(@Nullable String pfxCertificate) {
            this.pfxCertificate = pfxCertificate;
            return this;
        }

        public Builder setPfxCertificatePassword(@Nullable String pfxCertificatePassword) {
            this.pfxCertificatePassword = pfxCertificatePassword;
            return this;
        }

        public Builder setPublicCertificate(String publicCertificate) {
            this.publicCertificate = Objects.requireNonNull(publicCertificate);
            return this;
        }
        public LdapsSettingsResponse build() {
            return new LdapsSettingsResponse(certificateNotAfter, certificateThumbprint, externalAccess, ldaps, pfxCertificate, pfxCertificatePassword, publicCertificate);
        }
    }
}
