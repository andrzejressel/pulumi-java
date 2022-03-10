// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.CustomDnsConfigPropertiesFormatResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.PrivateLinkServiceConnectionResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointResult {
    /**
     * An array of custom dns configurations.
     * 
     */
    private final @Nullable List<CustomDnsConfigPropertiesFormatResponse> customDnsConfigs;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The extended location of the load balancer.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * An array of references to the network interfaces created for this private endpoint.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * A grouping of information about the connection to the remote resource.
     * 
     */
    private final @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
    /**
     * The provisioning state of the private endpoint resource.
     * 
     */
    private final String provisioningState;
    /**
     * The ID of the subnet from which the private IP will be allocated.
     * 
     */
    private final @Nullable SubnetResponse subnet;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPrivateEndpointResult(
        @OutputCustomType.Parameter("customDnsConfigs") @Nullable List<CustomDnsConfigPropertiesFormatResponse> customDnsConfigs,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("manualPrivateLinkServiceConnections") @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @OutputCustomType.Parameter("privateLinkServiceConnections") @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("subnet") @Nullable SubnetResponse subnet,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.customDnsConfigs = customDnsConfigs;
        this.etag = etag;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.location = location;
        this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.privateLinkServiceConnections = privateLinkServiceConnections;
        this.provisioningState = provisioningState;
        this.subnet = subnet;
        this.tags = tags;
        this.type = type;
    }

    /**
     * An array of custom dns configurations.
     * 
    */
    public List<CustomDnsConfigPropertiesFormatResponse> getCustomDnsConfigs() {
        return this.customDnsConfigs == null ? List.of() : this.customDnsConfigs;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The extended location of the load balancer.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * A grouping of information about the connection to the remote resource. Used when the network admin does not have access to approve connections to the remote resource.
     * 
    */
    public List<PrivateLinkServiceConnectionResponse> getManualPrivateLinkServiceConnections() {
        return this.manualPrivateLinkServiceConnections == null ? List.of() : this.manualPrivateLinkServiceConnections;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An array of references to the network interfaces created for this private endpoint.
     * 
    */
    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * A grouping of information about the connection to the remote resource.
     * 
    */
    public List<PrivateLinkServiceConnectionResponse> getPrivateLinkServiceConnections() {
        return this.privateLinkServiceConnections == null ? List.of() : this.privateLinkServiceConnections;
    }
    /**
     * The provisioning state of the private endpoint resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The ID of the subnet from which the private IP will be allocated.
     * 
    */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomDnsConfigPropertiesFormatResponse> customDnsConfigs;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections;
        private String name;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private @Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections;
        private String provisioningState;
        private @Nullable SubnetResponse subnet;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDnsConfigs = defaults.customDnsConfigs;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.manualPrivateLinkServiceConnections = defaults.manualPrivateLinkServiceConnections;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.privateLinkServiceConnections = defaults.privateLinkServiceConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCustomDnsConfigs(@Nullable List<CustomDnsConfigPropertiesFormatResponse> customDnsConfigs) {
            this.customDnsConfigs = customDnsConfigs;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setManualPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> manualPrivateLinkServiceConnections) {
            this.manualPrivateLinkServiceConnections = manualPrivateLinkServiceConnections;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setPrivateLinkServiceConnections(@Nullable List<PrivateLinkServiceConnectionResponse> privateLinkServiceConnections) {
            this.privateLinkServiceConnections = privateLinkServiceConnections;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
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
        public GetPrivateEndpointResult build() {
            return new GetPrivateEndpointResult(customDnsConfigs, etag, extendedLocation, id, location, manualPrivateLinkServiceConnections, name, networkInterfaces, privateLinkServiceConnections, provisioningState, subnet, tags, type);
        }
    }
}
