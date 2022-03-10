// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.outputs;

import io.pulumi.azurenative.kubernetes.outputs.ConnectedClusterIdentityResponse;
import io.pulumi.azurenative.kubernetes.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectedClusterResult {
    /**
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
     */
    private final String agentPublicKeyCertificate;
    /**
     * Version of the agent running on the connected cluster resource
     * 
     */
    private final String agentVersion;
    /**
     * Represents the connectivity status of the connected cluster.
     * 
     */
    private final String connectivityStatus;
    /**
     * The Kubernetes distribution running on this connected cluster.
     * 
     */
    private final @Nullable String distribution;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the connected cluster.
     * 
     */
    private final ConnectedClusterIdentityResponse identity;
    /**
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
     */
    private final @Nullable String infrastructure;
    /**
     * The Kubernetes version of the connected cluster resource
     * 
     */
    private final String kubernetesVersion;
    /**
     * Time representing the last instance when heart beat was received from the cluster
     * 
     */
    private final String lastConnectivityTime;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Expiration time of the managed identity certificate
     * 
     */
    private final String managedIdentityCertificateExpirationTime;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Connected cluster offering
     * 
     */
    private final String offering;
    /**
     * Provisioning state of the connected cluster resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Number of CPU cores present in the connected cluster resource
     * 
     */
    private final Integer totalCoreCount;
    /**
     * Number of nodes present in the connected cluster resource
     * 
     */
    private final Integer totalNodeCount;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetConnectedClusterResult(
        @OutputCustomType.Parameter("agentPublicKeyCertificate") String agentPublicKeyCertificate,
        @OutputCustomType.Parameter("agentVersion") String agentVersion,
        @OutputCustomType.Parameter("connectivityStatus") String connectivityStatus,
        @OutputCustomType.Parameter("distribution") @Nullable String distribution,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") ConnectedClusterIdentityResponse identity,
        @OutputCustomType.Parameter("infrastructure") @Nullable String infrastructure,
        @OutputCustomType.Parameter("kubernetesVersion") String kubernetesVersion,
        @OutputCustomType.Parameter("lastConnectivityTime") String lastConnectivityTime,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("managedIdentityCertificateExpirationTime") String managedIdentityCertificateExpirationTime,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("offering") String offering,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("totalCoreCount") Integer totalCoreCount,
        @OutputCustomType.Parameter("totalNodeCount") Integer totalNodeCount,
        @OutputCustomType.Parameter("type") String type) {
        this.agentPublicKeyCertificate = agentPublicKeyCertificate;
        this.agentVersion = agentVersion;
        this.connectivityStatus = connectivityStatus;
        this.distribution = distribution;
        this.id = id;
        this.identity = identity;
        this.infrastructure = infrastructure;
        this.kubernetesVersion = kubernetesVersion;
        this.lastConnectivityTime = lastConnectivityTime;
        this.location = location;
        this.managedIdentityCertificateExpirationTime = managedIdentityCertificateExpirationTime;
        this.name = name;
        this.offering = offering;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.totalCoreCount = totalCoreCount;
        this.totalNodeCount = totalNodeCount;
        this.type = type;
    }

    /**
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
    */
    public String getAgentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }
    /**
     * Version of the agent running on the connected cluster resource
     * 
    */
    public String getAgentVersion() {
        return this.agentVersion;
    }
    /**
     * Represents the connectivity status of the connected cluster.
     * 
    */
    public String getConnectivityStatus() {
        return this.connectivityStatus;
    }
    /**
     * The Kubernetes distribution running on this connected cluster.
     * 
    */
    public Optional<String> getDistribution() {
        return Optional.ofNullable(this.distribution);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the connected cluster.
     * 
    */
    public ConnectedClusterIdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
    */
    public Optional<String> getInfrastructure() {
        return Optional.ofNullable(this.infrastructure);
    }
    /**
     * The Kubernetes version of the connected cluster resource
     * 
    */
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }
    /**
     * Time representing the last instance when heart beat was received from the cluster
     * 
    */
    public String getLastConnectivityTime() {
        return this.lastConnectivityTime;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Expiration time of the managed identity certificate
     * 
    */
    public String getManagedIdentityCertificateExpirationTime() {
        return this.managedIdentityCertificateExpirationTime;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Connected cluster offering
     * 
    */
    public String getOffering() {
        return this.offering;
    }
    /**
     * Provisioning state of the connected cluster resource.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Number of CPU cores present in the connected cluster resource
     * 
    */
    public Integer getTotalCoreCount() {
        return this.totalCoreCount;
    }
    /**
     * Number of nodes present in the connected cluster resource
     * 
    */
    public Integer getTotalNodeCount() {
        return this.totalNodeCount;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectedClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentPublicKeyCertificate;
        private String agentVersion;
        private String connectivityStatus;
        private @Nullable String distribution;
        private String id;
        private ConnectedClusterIdentityResponse identity;
        private @Nullable String infrastructure;
        private String kubernetesVersion;
        private String lastConnectivityTime;
        private String location;
        private String managedIdentityCertificateExpirationTime;
        private String name;
        private String offering;
        private @Nullable String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private Integer totalCoreCount;
        private Integer totalNodeCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPublicKeyCertificate = defaults.agentPublicKeyCertificate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.connectivityStatus = defaults.connectivityStatus;
    	      this.distribution = defaults.distribution;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.infrastructure = defaults.infrastructure;
    	      this.kubernetesVersion = defaults.kubernetesVersion;
    	      this.lastConnectivityTime = defaults.lastConnectivityTime;
    	      this.location = defaults.location;
    	      this.managedIdentityCertificateExpirationTime = defaults.managedIdentityCertificateExpirationTime;
    	      this.name = defaults.name;
    	      this.offering = defaults.offering;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.totalCoreCount = defaults.totalCoreCount;
    	      this.totalNodeCount = defaults.totalNodeCount;
    	      this.type = defaults.type;
        }

        public Builder setAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
            this.agentPublicKeyCertificate = Objects.requireNonNull(agentPublicKeyCertificate);
            return this;
        }

        public Builder setAgentVersion(String agentVersion) {
            this.agentVersion = Objects.requireNonNull(agentVersion);
            return this;
        }

        public Builder setConnectivityStatus(String connectivityStatus) {
            this.connectivityStatus = Objects.requireNonNull(connectivityStatus);
            return this;
        }

        public Builder setDistribution(@Nullable String distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(ConnectedClusterIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setInfrastructure(@Nullable String infrastructure) {
            this.infrastructure = infrastructure;
            return this;
        }

        public Builder setKubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = Objects.requireNonNull(kubernetesVersion);
            return this;
        }

        public Builder setLastConnectivityTime(String lastConnectivityTime) {
            this.lastConnectivityTime = Objects.requireNonNull(lastConnectivityTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedIdentityCertificateExpirationTime(String managedIdentityCertificateExpirationTime) {
            this.managedIdentityCertificateExpirationTime = Objects.requireNonNull(managedIdentityCertificateExpirationTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOffering(String offering) {
            this.offering = Objects.requireNonNull(offering);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTotalCoreCount(Integer totalCoreCount) {
            this.totalCoreCount = Objects.requireNonNull(totalCoreCount);
            return this;
        }

        public Builder setTotalNodeCount(Integer totalNodeCount) {
            this.totalNodeCount = Objects.requireNonNull(totalNodeCount);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetConnectedClusterResult build() {
            return new GetConnectedClusterResult(agentPublicKeyCertificate, agentVersion, connectivityStatus, distribution, id, identity, infrastructure, kubernetesVersion, lastConnectivityTime, location, managedIdentityCertificateExpirationTime, name, offering, provisioningState, systemData, tags, totalCoreCount, totalNodeCount, type);
        }
    }
}
