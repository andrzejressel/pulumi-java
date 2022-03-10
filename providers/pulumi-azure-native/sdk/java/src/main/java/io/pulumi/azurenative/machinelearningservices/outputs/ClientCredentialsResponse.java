// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClientCredentialsResponse {
    /**
     * The authority URL used for authentication.
     * 
     */
    private final @Nullable String authorityUrl;
    /**
     * The content of the certificate used for authentication.
     * 
     */
    private final @Nullable String certificate;
    /**
     * The Client ID/Application ID
     * 
     */
    private final @Nullable String clientId;
    /**
     * The client secret.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    private final @Nullable Boolean isCertAuth;
    /**
     * Resource Group.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * The resource the service principal/app has access to.
     * 
     */
    private final @Nullable String resourceUri;
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
     */
    private final @Nullable String serviceDataAccessAuthIdentity;
    /**
     * Subscription ID.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The thumbprint of the certificate above.
     * 
     */
    private final @Nullable String thumbprint;

    @OutputCustomType.Constructor
    private ClientCredentialsResponse(
        @OutputCustomType.Parameter("authorityUrl") @Nullable String authorityUrl,
        @OutputCustomType.Parameter("certificate") @Nullable String certificate,
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @OutputCustomType.Parameter("isCertAuth") @Nullable Boolean isCertAuth,
        @OutputCustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @OutputCustomType.Parameter("resourceUri") @Nullable String resourceUri,
        @OutputCustomType.Parameter("serviceDataAccessAuthIdentity") @Nullable String serviceDataAccessAuthIdentity,
        @OutputCustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId,
        @OutputCustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.isCertAuth = isCertAuth;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
    }

    /**
     * The authority URL used for authentication.
     * 
    */
    public Optional<String> getAuthorityUrl() {
        return Optional.ofNullable(this.authorityUrl);
    }
    /**
     * The content of the certificate used for authentication.
     * 
    */
    public Optional<String> getCertificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * The Client ID/Application ID
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The client secret.
     * 
    */
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
    */
    public Optional<Boolean> getIsCertAuth() {
        return Optional.ofNullable(this.isCertAuth);
    }
    /**
     * Resource Group.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * The resource the service principal/app has access to.
     * 
    */
    public Optional<String> getResourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }
    /**
     * Indicates which identity to use to authenticate service data access to customer's storage.
     * 
    */
    public Optional<String> getServiceDataAccessAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }
    /**
     * Subscription ID.
     * 
    */
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The thumbprint of the certificate above.
     * 
    */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable Boolean isCertAuth;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setAuthorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }

        public Builder setCertificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setIsCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setServiceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public ClientCredentialsResponse build() {
            return new ClientCredentialsResponse(authorityUrl, certificate, clientId, clientSecret, isCertAuth, resourceGroup, resourceUri, serviceDataAccessAuthIdentity, subscriptionId, tenantId, thumbprint);
        }
    }
}
