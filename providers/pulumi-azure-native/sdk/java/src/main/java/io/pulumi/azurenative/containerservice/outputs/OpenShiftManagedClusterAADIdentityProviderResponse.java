// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenShiftManagedClusterAADIdentityProviderResponse {
    /**
     * The clientId password associated with the provider.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The groupId to be granted cluster admin role.
     * 
     */
    private final @Nullable String customerAdminGroupId;
    /**
     * The kind of the provider.
     * Expected value is 'AADIdentityProvider'.
     * 
     */
    private final String kind;
    /**
     * The secret password associated with the provider.
     * 
     */
    private final @Nullable String secret;
    /**
     * The tenantId associated with the provider.
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor
    private OpenShiftManagedClusterAADIdentityProviderResponse(
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("customerAdminGroupId") @Nullable String customerAdminGroupId,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("secret") @Nullable String secret,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.clientId = clientId;
        this.customerAdminGroupId = customerAdminGroupId;
        this.kind = kind;
        this.secret = secret;
        this.tenantId = tenantId;
    }

    /**
     * The clientId password associated with the provider.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The groupId to be granted cluster admin role.
     * 
    */
    public Optional<String> getCustomerAdminGroupId() {
        return Optional.ofNullable(this.customerAdminGroupId);
    }
    /**
     * The kind of the provider.
     * Expected value is 'AADIdentityProvider'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The secret password associated with the provider.
     * 
    */
    public Optional<String> getSecret() {
        return Optional.ofNullable(this.secret);
    }
    /**
     * The tenantId associated with the provider.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String customerAdminGroupId;
        private String kind;
        private @Nullable String secret;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAADIdentityProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.customerAdminGroupId = defaults.customerAdminGroupId;
    	      this.kind = defaults.kind;
    	      this.secret = defaults.secret;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setCustomerAdminGroupId(@Nullable String customerAdminGroupId) {
            this.customerAdminGroupId = customerAdminGroupId;
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = secret;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public OpenShiftManagedClusterAADIdentityProviderResponse build() {
            return new OpenShiftManagedClusterAADIdentityProviderResponse(clientId, customerAdminGroupId, kind, secret, tenantId);
        }
    }
}
