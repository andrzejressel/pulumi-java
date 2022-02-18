// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltName {
    private final @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan> customSans;
    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    private final @Nullable List<String> dnsNames;
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    private final @Nullable List<String> emailAddresses;
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    private final @Nullable List<String> uris;

    @OutputCustomType.Constructor({"customSans","dnsNames","emailAddresses","ipAddresses","uris"})
    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltName(
        @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan> customSans,
        @Nullable List<String> dnsNames,
        @Nullable List<String> emailAddresses,
        @Nullable List<String> ipAddresses,
        @Nullable List<String> uris) {
        this.customSans = customSans;
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    public List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan> getCustomSans() {
        return this.customSans == null ? List.of() : this.customSans;
    }
    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    public List<String> getDnsNames() {
        return this.dnsNames == null ? List.of() : this.dnsNames;
    }
    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    public List<String> getEmailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }
    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    public List<String> getUris() {
        return this.uris == null ? List.of() : this.uris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan> customSans;
        private @Nullable List<String> dnsNames;
        private @Nullable List<String> emailAddresses;
        private @Nullable List<String> ipAddresses;
        private @Nullable List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder setCustomSans(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSan> customSans) {
            this.customSans = customSans;
            return this;
        }

        public Builder setDnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }

        public Builder setEmailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setUris(@Nullable List<String> uris) {
            this.uris = uris;
            return this;
        }

        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltName build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectAltName(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
