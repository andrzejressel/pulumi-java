// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.identityplatform.inputs.TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TenantInboundSamlConfigIdpConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TenantInboundSamlConfigIdpConfigGetArgs Empty = new TenantInboundSamlConfigIdpConfigGetArgs();

    /**
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @InputImport(name="idpCertificates", required=true)
    private final Input<List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs>> idpCertificates;

    public Input<List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs>> getIdpCertificates() {
        return this.idpCertificates;
    }

    /**
     * Unique identifier for all SAML entities
     * 
     */
    @InputImport(name="idpEntityId", required=true)
    private final Input<String> idpEntityId;

    public Input<String> getIdpEntityId() {
        return this.idpEntityId;
    }

    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    @InputImport(name="signRequest")
    private final @Nullable Input<Boolean> signRequest;

    public Input<Boolean> getSignRequest() {
        return this.signRequest == null ? Input.empty() : this.signRequest;
    }

    /**
     * URL to send Authentication request to.
     * 
     */
    @InputImport(name="ssoUrl", required=true)
    private final Input<String> ssoUrl;

    public Input<String> getSsoUrl() {
        return this.ssoUrl;
    }

    public TenantInboundSamlConfigIdpConfigGetArgs(
        Input<List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs>> idpCertificates,
        Input<String> idpEntityId,
        @Nullable Input<Boolean> signRequest,
        Input<String> ssoUrl) {
        this.idpCertificates = Objects.requireNonNull(idpCertificates, "expected parameter 'idpCertificates' to be non-null");
        this.idpEntityId = Objects.requireNonNull(idpEntityId, "expected parameter 'idpEntityId' to be non-null");
        this.signRequest = signRequest;
        this.ssoUrl = Objects.requireNonNull(ssoUrl, "expected parameter 'ssoUrl' to be non-null");
    }

    private TenantInboundSamlConfigIdpConfigGetArgs() {
        this.idpCertificates = Input.empty();
        this.idpEntityId = Input.empty();
        this.signRequest = Input.empty();
        this.ssoUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigIdpConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs>> idpCertificates;
        private Input<String> idpEntityId;
        private @Nullable Input<Boolean> signRequest;
        private Input<String> ssoUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigIdpConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idpCertificates = defaults.idpCertificates;
    	      this.idpEntityId = defaults.idpEntityId;
    	      this.signRequest = defaults.signRequest;
    	      this.ssoUrl = defaults.ssoUrl;
        }

        public Builder setIdpCertificates(Input<List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs>> idpCertificates) {
            this.idpCertificates = Objects.requireNonNull(idpCertificates);
            return this;
        }

        public Builder setIdpCertificates(List<TenantInboundSamlConfigIdpConfigIdpCertificateGetArgs> idpCertificates) {
            this.idpCertificates = Input.of(Objects.requireNonNull(idpCertificates));
            return this;
        }

        public Builder setIdpEntityId(Input<String> idpEntityId) {
            this.idpEntityId = Objects.requireNonNull(idpEntityId);
            return this;
        }

        public Builder setIdpEntityId(String idpEntityId) {
            this.idpEntityId = Input.of(Objects.requireNonNull(idpEntityId));
            return this;
        }

        public Builder setSignRequest(@Nullable Input<Boolean> signRequest) {
            this.signRequest = signRequest;
            return this;
        }

        public Builder setSignRequest(@Nullable Boolean signRequest) {
            this.signRequest = Input.ofNullable(signRequest);
            return this;
        }

        public Builder setSsoUrl(Input<String> ssoUrl) {
            this.ssoUrl = Objects.requireNonNull(ssoUrl);
            return this;
        }

        public Builder setSsoUrl(String ssoUrl) {
            this.ssoUrl = Input.of(Objects.requireNonNull(ssoUrl));
            return this;
        }

        public TenantInboundSamlConfigIdpConfigGetArgs build() {
            return new TenantInboundSamlConfigIdpConfigGetArgs(idpCertificates, idpEntityId, signRequest, ssoUrl);
        }
    }
}
