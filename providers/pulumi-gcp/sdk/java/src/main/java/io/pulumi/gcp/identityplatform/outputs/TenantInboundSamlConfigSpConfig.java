// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.identityplatform.outputs.TenantInboundSamlConfigSpConfigSpCertificate;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TenantInboundSamlConfigSpConfig {
    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    private final String callbackUri;
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<TenantInboundSamlConfigSpConfigSpCertificate> spCertificates;
    /**
     * Unique identifier for all SAML entities.
     * 
     */
    private final String spEntityId;

    @OutputCustomType.Constructor({"callbackUri","spCertificates","spEntityId"})
    private TenantInboundSamlConfigSpConfig(
        String callbackUri,
        @Nullable List<TenantInboundSamlConfigSpConfigSpCertificate> spCertificates,
        String spEntityId) {
        this.callbackUri = Objects.requireNonNull(callbackUri);
        this.spCertificates = spCertificates;
        this.spEntityId = Objects.requireNonNull(spEntityId);
    }

    /**
     * Callback URI where responses from IDP are handled. Must start with `https://`.
     * 
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }
    /**
     * - 
     * The IDP's certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    public List<TenantInboundSamlConfigSpConfigSpCertificate> getSpCertificates() {
        return this.spCertificates == null ? List.of() : this.spCertificates;
    }
    /**
     * Unique identifier for all SAML entities.
     * 
     */
    public String getSpEntityId() {
        return this.spEntityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantInboundSamlConfigSpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String callbackUri;
        private @Nullable List<TenantInboundSamlConfigSpConfigSpCertificate> spCertificates;
        private String spEntityId;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantInboundSamlConfigSpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callbackUri = defaults.callbackUri;
    	      this.spCertificates = defaults.spCertificates;
    	      this.spEntityId = defaults.spEntityId;
        }

        public Builder setCallbackUri(String callbackUri) {
            this.callbackUri = Objects.requireNonNull(callbackUri);
            return this;
        }

        public Builder setSpCertificates(@Nullable List<TenantInboundSamlConfigSpConfigSpCertificate> spCertificates) {
            this.spCertificates = spCertificates;
            return this;
        }

        public Builder setSpEntityId(String spEntityId) {
            this.spEntityId = Objects.requireNonNull(spEntityId);
            return this;
        }

        public TenantInboundSamlConfigSpConfig build() {
            return new TenantInboundSamlConfigSpConfig(callbackUri, spCertificates, spEntityId);
        }
    }
}
