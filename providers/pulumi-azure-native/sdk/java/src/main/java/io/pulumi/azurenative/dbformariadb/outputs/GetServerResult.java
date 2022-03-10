// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.azurenative.dbformariadb.outputs.ServerPrivateEndpointConnectionResponse;
import io.pulumi.azurenative.dbformariadb.outputs.SkuResponse;
import io.pulumi.azurenative.dbformariadb.outputs.StorageProfileResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerResult {
    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    private final @Nullable String administratorLogin;
    /**
     * Earliest restore point creation time (ISO8601 format)
     * 
     */
    private final @Nullable String earliestRestoreDate;
    /**
     * The fully qualified domain name of a server.
     * 
     */
    private final @Nullable String fullyQualifiedDomainName;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The master server id of a replica server.
     * 
     */
    private final @Nullable String masterServerId;
    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    private final @Nullable String minimalTlsVersion;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of private endpoint connections on a server
     * 
     */
    private final List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The maximum number of replicas that a master server can have.
     * 
     */
    private final @Nullable Integer replicaCapacity;
    /**
     * The replication role of the server.
     * 
     */
    private final @Nullable String replicationRole;
    /**
     * The SKU (pricing tier) of the server.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    private final @Nullable String sslEnforcement;
    /**
     * Storage profile of a server.
     * 
     */
    private final @Nullable StorageProfileResponse storageProfile;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * A state of a server that is visible to user.
     * 
     */
    private final @Nullable String userVisibleState;
    /**
     * Server version.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private GetServerResult(
        @OutputCustomType.Parameter("administratorLogin") @Nullable String administratorLogin,
        @OutputCustomType.Parameter("earliestRestoreDate") @Nullable String earliestRestoreDate,
        @OutputCustomType.Parameter("fullyQualifiedDomainName") @Nullable String fullyQualifiedDomainName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("masterServerId") @Nullable String masterServerId,
        @OutputCustomType.Parameter("minimalTlsVersion") @Nullable String minimalTlsVersion,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpointConnections") List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess,
        @OutputCustomType.Parameter("replicaCapacity") @Nullable Integer replicaCapacity,
        @OutputCustomType.Parameter("replicationRole") @Nullable String replicationRole,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("sslEnforcement") @Nullable String sslEnforcement,
        @OutputCustomType.Parameter("storageProfile") @Nullable StorageProfileResponse storageProfile,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userVisibleState") @Nullable String userVisibleState,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.administratorLogin = administratorLogin;
        this.earliestRestoreDate = earliestRestoreDate;
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
        this.id = id;
        this.location = location;
        this.masterServerId = masterServerId;
        this.minimalTlsVersion = minimalTlsVersion;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.publicNetworkAccess = publicNetworkAccess;
        this.replicaCapacity = replicaCapacity;
        this.replicationRole = replicationRole;
        this.sku = sku;
        this.sslEnforcement = sslEnforcement;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.type = type;
        this.userVisibleState = userVisibleState;
        this.version = version;
    }

    /**
     * The administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
    */
    public Optional<String> getAdministratorLogin() {
        return Optional.ofNullable(this.administratorLogin);
    }
    /**
     * Earliest restore point creation time (ISO8601 format)
     * 
    */
    public Optional<String> getEarliestRestoreDate() {
        return Optional.ofNullable(this.earliestRestoreDate);
    }
    /**
     * The fully qualified domain name of a server.
     * 
    */
    public Optional<String> getFullyQualifiedDomainName() {
        return Optional.ofNullable(this.fullyQualifiedDomainName);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The master server id of a replica server.
     * 
    */
    public Optional<String> getMasterServerId() {
        return Optional.ofNullable(this.masterServerId);
    }
    /**
     * Enforce a minimal Tls version for the server.
     * 
    */
    public Optional<String> getMinimalTlsVersion() {
        return Optional.ofNullable(this.minimalTlsVersion);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of private endpoint connections on a server
     * 
    */
    public List<ServerPrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be 'Enabled' or 'Disabled'
     * 
    */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The maximum number of replicas that a master server can have.
     * 
    */
    public Optional<Integer> getReplicaCapacity() {
        return Optional.ofNullable(this.replicaCapacity);
    }
    /**
     * The replication role of the server.
     * 
    */
    public Optional<String> getReplicationRole() {
        return Optional.ofNullable(this.replicationRole);
    }
    /**
     * The SKU (pricing tier) of the server.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Enable ssl enforcement or not when connect to server.
     * 
    */
    public Optional<String> getSslEnforcement() {
        return Optional.ofNullable(this.sslEnforcement);
    }
    /**
     * Storage profile of a server.
     * 
    */
    public Optional<StorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A state of a server that is visible to user.
     * 
    */
    public Optional<String> getUserVisibleState() {
        return Optional.ofNullable(this.userVisibleState);
    }
    /**
     * Server version.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorLogin;
        private @Nullable String earliestRestoreDate;
        private @Nullable String fullyQualifiedDomainName;
        private String id;
        private String location;
        private @Nullable String masterServerId;
        private @Nullable String minimalTlsVersion;
        private String name;
        private List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String publicNetworkAccess;
        private @Nullable Integer replicaCapacity;
        private @Nullable String replicationRole;
        private @Nullable SkuResponse sku;
        private @Nullable String sslEnforcement;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String userVisibleState;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.earliestRestoreDate = defaults.earliestRestoreDate;
    	      this.fullyQualifiedDomainName = defaults.fullyQualifiedDomainName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.masterServerId = defaults.masterServerId;
    	      this.minimalTlsVersion = defaults.minimalTlsVersion;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.replicaCapacity = defaults.replicaCapacity;
    	      this.replicationRole = defaults.replicationRole;
    	      this.sku = defaults.sku;
    	      this.sslEnforcement = defaults.sslEnforcement;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userVisibleState = defaults.userVisibleState;
    	      this.version = defaults.version;
        }

        public Builder setAdministratorLogin(@Nullable String administratorLogin) {
            this.administratorLogin = administratorLogin;
            return this;
        }

        public Builder setEarliestRestoreDate(@Nullable String earliestRestoreDate) {
            this.earliestRestoreDate = earliestRestoreDate;
            return this;
        }

        public Builder setFullyQualifiedDomainName(@Nullable String fullyQualifiedDomainName) {
            this.fullyQualifiedDomainName = fullyQualifiedDomainName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMasterServerId(@Nullable String masterServerId) {
            this.masterServerId = masterServerId;
            return this;
        }

        public Builder setMinimalTlsVersion(@Nullable String minimalTlsVersion) {
            this.minimalTlsVersion = minimalTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<ServerPrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setReplicaCapacity(@Nullable Integer replicaCapacity) {
            this.replicaCapacity = replicaCapacity;
            return this;
        }

        public Builder setReplicationRole(@Nullable String replicationRole) {
            this.replicationRole = replicationRole;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSslEnforcement(@Nullable String sslEnforcement) {
            this.sslEnforcement = sslEnforcement;
            return this;
        }

        public Builder setStorageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserVisibleState(@Nullable String userVisibleState) {
            this.userVisibleState = userVisibleState;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GetServerResult build() {
            return new GetServerResult(administratorLogin, earliestRestoreDate, fullyQualifiedDomainName, id, location, masterServerId, minimalTlsVersion, name, privateEndpointConnections, publicNetworkAccess, replicaCapacity, replicationRole, sku, sslEnforcement, storageProfile, tags, type, userVisibleState, version);
        }
    }
}
