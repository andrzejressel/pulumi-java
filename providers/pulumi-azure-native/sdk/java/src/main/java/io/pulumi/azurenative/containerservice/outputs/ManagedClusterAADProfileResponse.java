// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterAADProfileResponse {
    /**
     * AAD group object IDs that will have admin role of the cluster.
     * 
     */
    private final @Nullable List<String> adminGroupObjectIDs;
    /**
     * The client AAD application ID.
     * 
     */
    private final @Nullable String clientAppID;
    /**
     * Whether to enable Azure RBAC for Kubernetes authorization.
     * 
     */
    private final @Nullable Boolean enableAzureRBAC;
    /**
     * Whether to enable managed AAD.
     * 
     */
    private final @Nullable Boolean managed;
    /**
     * The server AAD application ID.
     * 
     */
    private final @Nullable String serverAppID;
    /**
     * The server AAD application secret.
     * 
     */
    private final @Nullable String serverAppSecret;
    /**
     * The AAD tenant ID to use for authentication. If not specified, will use the tenant of the deployment subscription.
     * 
     */
    private final @Nullable String tenantID;

    @OutputCustomType.Constructor
    private ManagedClusterAADProfileResponse(
        @OutputCustomType.Parameter("adminGroupObjectIDs") @Nullable List<String> adminGroupObjectIDs,
        @OutputCustomType.Parameter("clientAppID") @Nullable String clientAppID,
        @OutputCustomType.Parameter("enableAzureRBAC") @Nullable Boolean enableAzureRBAC,
        @OutputCustomType.Parameter("managed") @Nullable Boolean managed,
        @OutputCustomType.Parameter("serverAppID") @Nullable String serverAppID,
        @OutputCustomType.Parameter("serverAppSecret") @Nullable String serverAppSecret,
        @OutputCustomType.Parameter("tenantID") @Nullable String tenantID) {
        this.adminGroupObjectIDs = adminGroupObjectIDs;
        this.clientAppID = clientAppID;
        this.enableAzureRBAC = enableAzureRBAC;
        this.managed = managed;
        this.serverAppID = serverAppID;
        this.serverAppSecret = serverAppSecret;
        this.tenantID = tenantID;
    }

    /**
     * AAD group object IDs that will have admin role of the cluster.
     * 
    */
    public List<String> getAdminGroupObjectIDs() {
        return this.adminGroupObjectIDs == null ? List.of() : this.adminGroupObjectIDs;
    }
    /**
     * The client AAD application ID.
     * 
    */
    public Optional<String> getClientAppID() {
        return Optional.ofNullable(this.clientAppID);
    }
    /**
     * Whether to enable Azure RBAC for Kubernetes authorization.
     * 
    */
    public Optional<Boolean> getEnableAzureRBAC() {
        return Optional.ofNullable(this.enableAzureRBAC);
    }
    /**
     * Whether to enable managed AAD.
     * 
    */
    public Optional<Boolean> getManaged() {
        return Optional.ofNullable(this.managed);
    }
    /**
     * The server AAD application ID.
     * 
    */
    public Optional<String> getServerAppID() {
        return Optional.ofNullable(this.serverAppID);
    }
    /**
     * The server AAD application secret.
     * 
    */
    public Optional<String> getServerAppSecret() {
        return Optional.ofNullable(this.serverAppSecret);
    }
    /**
     * The AAD tenant ID to use for authentication. If not specified, will use the tenant of the deployment subscription.
     * 
    */
    public Optional<String> getTenantID() {
        return Optional.ofNullable(this.tenantID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAADProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> adminGroupObjectIDs;
        private @Nullable String clientAppID;
        private @Nullable Boolean enableAzureRBAC;
        private @Nullable Boolean managed;
        private @Nullable String serverAppID;
        private @Nullable String serverAppSecret;
        private @Nullable String tenantID;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAADProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminGroupObjectIDs = defaults.adminGroupObjectIDs;
    	      this.clientAppID = defaults.clientAppID;
    	      this.enableAzureRBAC = defaults.enableAzureRBAC;
    	      this.managed = defaults.managed;
    	      this.serverAppID = defaults.serverAppID;
    	      this.serverAppSecret = defaults.serverAppSecret;
    	      this.tenantID = defaults.tenantID;
        }

        public Builder setAdminGroupObjectIDs(@Nullable List<String> adminGroupObjectIDs) {
            this.adminGroupObjectIDs = adminGroupObjectIDs;
            return this;
        }

        public Builder setClientAppID(@Nullable String clientAppID) {
            this.clientAppID = clientAppID;
            return this;
        }

        public Builder setEnableAzureRBAC(@Nullable Boolean enableAzureRBAC) {
            this.enableAzureRBAC = enableAzureRBAC;
            return this;
        }

        public Builder setManaged(@Nullable Boolean managed) {
            this.managed = managed;
            return this;
        }

        public Builder setServerAppID(@Nullable String serverAppID) {
            this.serverAppID = serverAppID;
            return this;
        }

        public Builder setServerAppSecret(@Nullable String serverAppSecret) {
            this.serverAppSecret = serverAppSecret;
            return this;
        }

        public Builder setTenantID(@Nullable String tenantID) {
            this.tenantID = tenantID;
            return this;
        }
        public ManagedClusterAADProfileResponse build() {
            return new ManagedClusterAADProfileResponse(adminGroupObjectIDs, clientAppID, enableAzureRBAC, managed, serverAppID, serverAppSecret, tenantID);
        }
    }
}
