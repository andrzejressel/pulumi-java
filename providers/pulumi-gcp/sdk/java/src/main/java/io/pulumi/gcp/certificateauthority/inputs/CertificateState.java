// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateConfigGetArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateRevocationDetailGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateState extends io.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * Certificate Authority name.
     * 
     */
    @InputImport(name="certificateAuthority")
    private final @Nullable Input<String> certificateAuthority;

    public Input<String> getCertificateAuthority() {
        return this.certificateAuthority == null ? Input.empty() : this.certificateAuthority;
    }

    /**
     * Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    @InputImport(name="certificateDescriptions")
    private final @Nullable Input<List<CertificateCertificateDescriptionGetArgs>> certificateDescriptions;

    public Input<List<CertificateCertificateDescriptionGetArgs>> getCertificateDescriptions() {
        return this.certificateDescriptions == null ? Input.empty() : this.certificateDescriptions;
    }

    /**
     * The resource name for a CertificateTemplate used to issue this certificate,
     * in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`. If this is specified,
     * the caller must have the necessary permission to use this template. If this is
     * omitted, no template will be used. This template must be in the same location
     * as the Certificate.
     * 
     */
    @InputImport(name="certificateTemplate")
    private final @Nullable Input<String> certificateTemplate;

    public Input<String> getCertificateTemplate() {
        return this.certificateTemplate == null ? Input.empty() : this.certificateTemplate;
    }

    /**
     * The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<CertificateConfigGetArgs> config;

    public Input<CertificateConfigGetArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * The time that this resource was created on the server. This is in RFC3339 text format.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Labels with user-defined metadata to apply to this resource.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="lifetime")
    private final @Nullable Input<String> lifetime;

    public Input<String> getLifetime() {
        return this.lifetime == null ? Input.empty() : this.lifetime;
    }

    /**
     * Location of the Certificate. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name for this Certificate.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Output only. The pem-encoded, signed X.509 certificate.
     * 
     */
    @InputImport(name="pemCertificate")
    private final @Nullable Input<String> pemCertificate;

    public Input<String> getPemCertificate() {
        return this.pemCertificate == null ? Input.empty() : this.pemCertificate;
    }

    /**
     * Required. Expected to be in leaf-to-root order according to RFC 5246.
     * 
     */
    @InputImport(name="pemCertificates")
    private final @Nullable Input<List<String>> pemCertificates;

    public Input<List<String>> getPemCertificates() {
        return this.pemCertificates == null ? Input.empty() : this.pemCertificates;
    }

    /**
     * Immutable. A pem-encoded X.509 certificate signing request (CSR).
     * 
     */
    @InputImport(name="pemCsr")
    private final @Nullable Input<String> pemCsr;

    public Input<String> getPemCsr() {
        return this.pemCsr == null ? Input.empty() : this.pemCsr;
    }

    /**
     * The name of the CaPool this Certificate belongs to.
     * 
     */
    @InputImport(name="pool")
    private final @Nullable Input<String> pool;

    public Input<String> getPool() {
        return this.pool == null ? Input.empty() : this.pool;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if
     * this field is present.
     * 
     */
    @InputImport(name="revocationDetails")
    private final @Nullable Input<List<CertificateRevocationDetailGetArgs>> revocationDetails;

    public Input<List<CertificateRevocationDetailGetArgs>> getRevocationDetails() {
        return this.revocationDetails == null ? Input.empty() : this.revocationDetails;
    }

    /**
     * Output only. The time at which this CertificateAuthority was updated. This is in RFC3339 text format.
     * 
     */
    @InputImport(name="updateTime")
    private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public CertificateState(
        @Nullable Input<String> certificateAuthority,
        @Nullable Input<List<CertificateCertificateDescriptionGetArgs>> certificateDescriptions,
        @Nullable Input<String> certificateTemplate,
        @Nullable Input<CertificateConfigGetArgs> config,
        @Nullable Input<String> createTime,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> lifetime,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> pemCertificate,
        @Nullable Input<List<String>> pemCertificates,
        @Nullable Input<String> pemCsr,
        @Nullable Input<String> pool,
        @Nullable Input<String> project,
        @Nullable Input<List<CertificateRevocationDetailGetArgs>> revocationDetails,
        @Nullable Input<String> updateTime) {
        this.certificateAuthority = certificateAuthority;
        this.certificateDescriptions = certificateDescriptions;
        this.certificateTemplate = certificateTemplate;
        this.config = config;
        this.createTime = createTime;
        this.labels = labels;
        this.lifetime = lifetime;
        this.location = location;
        this.name = name;
        this.pemCertificate = pemCertificate;
        this.pemCertificates = pemCertificates;
        this.pemCsr = pemCsr;
        this.pool = pool;
        this.project = project;
        this.revocationDetails = revocationDetails;
        this.updateTime = updateTime;
    }

    private CertificateState() {
        this.certificateAuthority = Input.empty();
        this.certificateDescriptions = Input.empty();
        this.certificateTemplate = Input.empty();
        this.config = Input.empty();
        this.createTime = Input.empty();
        this.labels = Input.empty();
        this.lifetime = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.pemCertificate = Input.empty();
        this.pemCertificates = Input.empty();
        this.pemCsr = Input.empty();
        this.pool = Input.empty();
        this.project = Input.empty();
        this.revocationDetails = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateAuthority;
        private @Nullable Input<List<CertificateCertificateDescriptionGetArgs>> certificateDescriptions;
        private @Nullable Input<String> certificateTemplate;
        private @Nullable Input<CertificateConfigGetArgs> config;
        private @Nullable Input<String> createTime;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> lifetime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> pemCertificate;
        private @Nullable Input<List<String>> pemCertificates;
        private @Nullable Input<String> pemCsr;
        private @Nullable Input<String> pool;
        private @Nullable Input<String> project;
        private @Nullable Input<List<CertificateRevocationDetailGetArgs>> revocationDetails;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.certificateDescriptions = defaults.certificateDescriptions;
    	      this.certificateTemplate = defaults.certificateTemplate;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.pemCertificate = defaults.pemCertificate;
    	      this.pemCertificates = defaults.pemCertificates;
    	      this.pemCsr = defaults.pemCsr;
    	      this.pool = defaults.pool;
    	      this.project = defaults.project;
    	      this.revocationDetails = defaults.revocationDetails;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCertificateAuthority(@Nullable Input<String> certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder setCertificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = Input.ofNullable(certificateAuthority);
            return this;
        }

        public Builder setCertificateDescriptions(@Nullable Input<List<CertificateCertificateDescriptionGetArgs>> certificateDescriptions) {
            this.certificateDescriptions = certificateDescriptions;
            return this;
        }

        public Builder setCertificateDescriptions(@Nullable List<CertificateCertificateDescriptionGetArgs> certificateDescriptions) {
            this.certificateDescriptions = Input.ofNullable(certificateDescriptions);
            return this;
        }

        public Builder setCertificateTemplate(@Nullable Input<String> certificateTemplate) {
            this.certificateTemplate = certificateTemplate;
            return this;
        }

        public Builder setCertificateTemplate(@Nullable String certificateTemplate) {
            this.certificateTemplate = Input.ofNullable(certificateTemplate);
            return this;
        }

        public Builder setConfig(@Nullable Input<CertificateConfigGetArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable CertificateConfigGetArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLifetime(@Nullable Input<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = Input.ofNullable(lifetime);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPemCertificate(@Nullable Input<String> pemCertificate) {
            this.pemCertificate = pemCertificate;
            return this;
        }

        public Builder setPemCertificate(@Nullable String pemCertificate) {
            this.pemCertificate = Input.ofNullable(pemCertificate);
            return this;
        }

        public Builder setPemCertificates(@Nullable Input<List<String>> pemCertificates) {
            this.pemCertificates = pemCertificates;
            return this;
        }

        public Builder setPemCertificates(@Nullable List<String> pemCertificates) {
            this.pemCertificates = Input.ofNullable(pemCertificates);
            return this;
        }

        public Builder setPemCsr(@Nullable Input<String> pemCsr) {
            this.pemCsr = pemCsr;
            return this;
        }

        public Builder setPemCsr(@Nullable String pemCsr) {
            this.pemCsr = Input.ofNullable(pemCsr);
            return this;
        }

        public Builder setPool(@Nullable Input<String> pool) {
            this.pool = pool;
            return this;
        }

        public Builder setPool(@Nullable String pool) {
            this.pool = Input.ofNullable(pool);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRevocationDetails(@Nullable Input<List<CertificateRevocationDetailGetArgs>> revocationDetails) {
            this.revocationDetails = revocationDetails;
            return this;
        }

        public Builder setRevocationDetails(@Nullable List<CertificateRevocationDetailGetArgs> revocationDetails) {
            this.revocationDetails = Input.ofNullable(revocationDetails);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public CertificateState build() {
            return new CertificateState(certificateAuthority, certificateDescriptions, certificateTemplate, config, createTime, labels, lifetime, location, name, pemCertificate, pemCertificates, pemCsr, pool, project, revocationDetails, updateTime);
        }
    }
}
