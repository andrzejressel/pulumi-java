// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.azurenative.cache.outputs.EnterpriseSkuResponse;
import io.pulumi.azurenative.cache.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRedisEnterpriseResult {
    /**
     * DNS name of the cluster endpoint
     * 
     */
    private final String hostName;
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
     * The minimum TLS version for the cluster to support, e.g. '1.2'
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Current provisioning status of the cluster
     * 
     */
    private final String provisioningState;
    /**
     * Version of redis the cluster supports, e.g. '6'
     * 
     */
    private final String redisVersion;
    /**
     * Current resource status of the cluster
     * 
     */
    private final String resourceState;
    /**
     * The SKU to create, which affects price, performance, and features.
     * 
     */
    private final EnterpriseSkuResponse sku;
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
     * The Availability Zones where this cluster will be deployed.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor
    private GetRedisEnterpriseResult(
        @OutputCustomType.Parameter("hostName") String hostName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("minimumTlsVersion") @Nullable String minimumTlsVersion,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("redisVersion") String redisVersion,
        @OutputCustomType.Parameter("resourceState") String resourceState,
        @OutputCustomType.Parameter("sku") EnterpriseSkuResponse sku,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("zones") @Nullable List<String> zones) {
        this.hostName = hostName;
        this.id = id;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = name;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.redisVersion = redisVersion;
        this.resourceState = resourceState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.zones = zones;
    }

    /**
     * DNS name of the cluster endpoint
     * 
    */
    public String getHostName() {
        return this.hostName;
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
     * The minimum TLS version for the cluster to support, e.g. '1.2'
     * 
    */
    public Optional<String> getMinimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of private endpoint connections associated with the specified RedisEnterprise cluster
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Current provisioning status of the cluster
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Version of redis the cluster supports, e.g. '6'
     * 
    */
    public String getRedisVersion() {
        return this.redisVersion;
    }
    /**
     * Current resource status of the cluster
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The SKU to create, which affects price, performance, and features.
     * 
    */
    public EnterpriseSkuResponse getSku() {
        return this.sku;
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
     * The Availability Zones where this cluster will be deployed.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRedisEnterpriseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String id;
        private String location;
        private @Nullable String minimumTlsVersion;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private String redisVersion;
        private String resourceState;
        private EnterpriseSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRedisEnterpriseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redisVersion = defaults.redisVersion;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zones = defaults.zones;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
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

        public Builder setMinimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setSku(EnterpriseSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
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

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetRedisEnterpriseResult build() {
            return new GetRedisEnterpriseResult(hostName, id, location, minimumTlsVersion, name, privateEndpointConnections, provisioningState, redisVersion, resourceState, sku, tags, type, zones);
        }
    }
}
