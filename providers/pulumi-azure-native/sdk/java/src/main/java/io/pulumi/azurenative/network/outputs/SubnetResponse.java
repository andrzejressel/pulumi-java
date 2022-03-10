// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.DelegationResponse;
import io.pulumi.azurenative.network.outputs.IPConfigurationProfileResponse;
import io.pulumi.azurenative.network.outputs.IPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.NetworkSecurityGroupResponse;
import io.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.network.outputs.ResourceNavigationLinkResponse;
import io.pulumi.azurenative.network.outputs.RouteTableResponse;
import io.pulumi.azurenative.network.outputs.ServiceAssociationLinkResponse;
import io.pulumi.azurenative.network.outputs.ServiceEndpointPolicyResponse;
import io.pulumi.azurenative.network.outputs.ServiceEndpointPropertiesFormatResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubnetResponse {
    /**
     * The address prefix for the subnet.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * List of address prefixes for the subnet.
     * 
     */
    private final @Nullable List<String> addressPrefixes;
    /**
     * Application gateway IP configurations of virtual network resource.
     * 
     */
    private final @Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations;
    /**
     * An array of references to the delegations on the subnet.
     * 
     */
    private final @Nullable List<DelegationResponse> delegations;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Array of IpAllocation which reference this subnet.
     * 
     */
    private final @Nullable List<SubResourceResponse> ipAllocations;
    /**
     * Array of IP configuration profiles which reference this subnet.
     * 
     */
    private final List<IPConfigurationProfileResponse> ipConfigurationProfiles;
    /**
     * An array of references to the network interface IP configurations using subnet.
     * 
     */
    private final List<IPConfigurationResponse> ipConfigurations;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * Nat gateway associated with this subnet.
     * 
     */
    private final @Nullable SubResourceResponse natGateway;
    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
     */
    private final @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
     */
    private final @Nullable String privateEndpointNetworkPolicies;
    /**
     * An array of references to private endpoints.
     * 
     */
    private final List<PrivateEndpointResponse> privateEndpoints;
    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    private final @Nullable String privateLinkServiceNetworkPolicies;
    /**
     * The provisioning state of the subnet resource.
     * 
     */
    private final String provisioningState;
    /**
     * A read-only string identifying the intention of use for this subnet based on delegations and other user-defined properties.
     * 
     */
    private final String purpose;
    /**
     * An array of references to the external resources using subnet.
     * 
     */
    private final List<ResourceNavigationLinkResponse> resourceNavigationLinks;
    /**
     * The reference to the RouteTable resource.
     * 
     */
    private final @Nullable RouteTableResponse routeTable;
    /**
     * An array of references to services injecting into this subnet.
     * 
     */
    private final List<ServiceAssociationLinkResponse> serviceAssociationLinks;
    /**
     * An array of service endpoint policies.
     * 
     */
    private final @Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies;
    /**
     * An array of service endpoints.
     * 
     */
    private final @Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints;
    /**
     * Resource type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private SubnetResponse(
        @OutputCustomType.Parameter("addressPrefix") @Nullable String addressPrefix,
        @OutputCustomType.Parameter("addressPrefixes") @Nullable List<String> addressPrefixes,
        @OutputCustomType.Parameter("applicationGatewayIpConfigurations") @Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations,
        @OutputCustomType.Parameter("delegations") @Nullable List<DelegationResponse> delegations,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("ipAllocations") @Nullable List<SubResourceResponse> ipAllocations,
        @OutputCustomType.Parameter("ipConfigurationProfiles") List<IPConfigurationProfileResponse> ipConfigurationProfiles,
        @OutputCustomType.Parameter("ipConfigurations") List<IPConfigurationResponse> ipConfigurations,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("natGateway") @Nullable SubResourceResponse natGateway,
        @OutputCustomType.Parameter("networkSecurityGroup") @Nullable NetworkSecurityGroupResponse networkSecurityGroup,
        @OutputCustomType.Parameter("privateEndpointNetworkPolicies") @Nullable String privateEndpointNetworkPolicies,
        @OutputCustomType.Parameter("privateEndpoints") List<PrivateEndpointResponse> privateEndpoints,
        @OutputCustomType.Parameter("privateLinkServiceNetworkPolicies") @Nullable String privateLinkServiceNetworkPolicies,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("purpose") String purpose,
        @OutputCustomType.Parameter("resourceNavigationLinks") List<ResourceNavigationLinkResponse> resourceNavigationLinks,
        @OutputCustomType.Parameter("routeTable") @Nullable RouteTableResponse routeTable,
        @OutputCustomType.Parameter("serviceAssociationLinks") List<ServiceAssociationLinkResponse> serviceAssociationLinks,
        @OutputCustomType.Parameter("serviceEndpointPolicies") @Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies,
        @OutputCustomType.Parameter("serviceEndpoints") @Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.addressPrefix = addressPrefix;
        this.addressPrefixes = addressPrefixes;
        this.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
        this.delegations = delegations;
        this.etag = etag;
        this.id = id;
        this.ipAllocations = ipAllocations;
        this.ipConfigurationProfiles = ipConfigurationProfiles;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.natGateway = natGateway;
        this.networkSecurityGroup = networkSecurityGroup;
        this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
        this.privateEndpoints = privateEndpoints;
        this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
        this.provisioningState = provisioningState;
        this.purpose = purpose;
        this.resourceNavigationLinks = resourceNavigationLinks;
        this.routeTable = routeTable;
        this.serviceAssociationLinks = serviceAssociationLinks;
        this.serviceEndpointPolicies = serviceEndpointPolicies;
        this.serviceEndpoints = serviceEndpoints;
        this.type = type;
    }

    /**
     * The address prefix for the subnet.
     * 
    */
    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * List of address prefixes for the subnet.
     * 
    */
    public List<String> getAddressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }
    /**
     * Application gateway IP configurations of virtual network resource.
     * 
    */
    public List<ApplicationGatewayIPConfigurationResponse> getApplicationGatewayIpConfigurations() {
        return this.applicationGatewayIpConfigurations == null ? List.of() : this.applicationGatewayIpConfigurations;
    }
    /**
     * An array of references to the delegations on the subnet.
     * 
    */
    public List<DelegationResponse> getDelegations() {
        return this.delegations == null ? List.of() : this.delegations;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Array of IpAllocation which reference this subnet.
     * 
    */
    public List<SubResourceResponse> getIpAllocations() {
        return this.ipAllocations == null ? List.of() : this.ipAllocations;
    }
    /**
     * Array of IP configuration profiles which reference this subnet.
     * 
    */
    public List<IPConfigurationProfileResponse> getIpConfigurationProfiles() {
        return this.ipConfigurationProfiles;
    }
    /**
     * An array of references to the network interface IP configurations using subnet.
     * 
    */
    public List<IPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Nat gateway associated with this subnet.
     * 
    */
    public Optional<SubResourceResponse> getNatGateway() {
        return Optional.ofNullable(this.natGateway);
    }
    /**
     * The reference to the NetworkSecurityGroup resource.
     * 
    */
    public Optional<NetworkSecurityGroupResponse> getNetworkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }
    /**
     * Enable or Disable apply network policies on private end point in the subnet.
     * 
    */
    public Optional<String> getPrivateEndpointNetworkPolicies() {
        return Optional.ofNullable(this.privateEndpointNetworkPolicies);
    }
    /**
     * An array of references to private endpoints.
     * 
    */
    public List<PrivateEndpointResponse> getPrivateEndpoints() {
        return this.privateEndpoints;
    }
    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
    */
    public Optional<String> getPrivateLinkServiceNetworkPolicies() {
        return Optional.ofNullable(this.privateLinkServiceNetworkPolicies);
    }
    /**
     * The provisioning state of the subnet resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * A read-only string identifying the intention of use for this subnet based on delegations and other user-defined properties.
     * 
    */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * An array of references to the external resources using subnet.
     * 
    */
    public List<ResourceNavigationLinkResponse> getResourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }
    /**
     * The reference to the RouteTable resource.
     * 
    */
    public Optional<RouteTableResponse> getRouteTable() {
        return Optional.ofNullable(this.routeTable);
    }
    /**
     * An array of references to services injecting into this subnet.
     * 
    */
    public List<ServiceAssociationLinkResponse> getServiceAssociationLinks() {
        return this.serviceAssociationLinks;
    }
    /**
     * An array of service endpoint policies.
     * 
    */
    public List<ServiceEndpointPolicyResponse> getServiceEndpointPolicies() {
        return this.serviceEndpointPolicies == null ? List.of() : this.serviceEndpointPolicies;
    }
    /**
     * An array of service endpoints.
     * 
    */
    public List<ServiceEndpointPropertiesFormatResponse> getServiceEndpoints() {
        return this.serviceEndpoints == null ? List.of() : this.serviceEndpoints;
    }
    /**
     * Resource type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable List<String> addressPrefixes;
        private @Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations;
        private @Nullable List<DelegationResponse> delegations;
        private String etag;
        private @Nullable String id;
        private @Nullable List<SubResourceResponse> ipAllocations;
        private List<IPConfigurationProfileResponse> ipConfigurationProfiles;
        private List<IPConfigurationResponse> ipConfigurations;
        private @Nullable String name;
        private @Nullable SubResourceResponse natGateway;
        private @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
        private @Nullable String privateEndpointNetworkPolicies;
        private List<PrivateEndpointResponse> privateEndpoints;
        private @Nullable String privateLinkServiceNetworkPolicies;
        private String provisioningState;
        private String purpose;
        private List<ResourceNavigationLinkResponse> resourceNavigationLinks;
        private @Nullable RouteTableResponse routeTable;
        private List<ServiceAssociationLinkResponse> serviceAssociationLinks;
        private @Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies;
        private @Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.applicationGatewayIpConfigurations = defaults.applicationGatewayIpConfigurations;
    	      this.delegations = defaults.delegations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipAllocations = defaults.ipAllocations;
    	      this.ipConfigurationProfiles = defaults.ipConfigurationProfiles;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.natGateway = defaults.natGateway;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.privateEndpointNetworkPolicies = defaults.privateEndpointNetworkPolicies;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.privateLinkServiceNetworkPolicies = defaults.privateLinkServiceNetworkPolicies;
    	      this.provisioningState = defaults.provisioningState;
    	      this.purpose = defaults.purpose;
    	      this.resourceNavigationLinks = defaults.resourceNavigationLinks;
    	      this.routeTable = defaults.routeTable;
    	      this.serviceAssociationLinks = defaults.serviceAssociationLinks;
    	      this.serviceEndpointPolicies = defaults.serviceEndpointPolicies;
    	      this.serviceEndpoints = defaults.serviceEndpoints;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder setApplicationGatewayIpConfigurations(@Nullable List<ApplicationGatewayIPConfigurationResponse> applicationGatewayIpConfigurations) {
            this.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
            return this;
        }

        public Builder setDelegations(@Nullable List<DelegationResponse> delegations) {
            this.delegations = delegations;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpAllocations(@Nullable List<SubResourceResponse> ipAllocations) {
            this.ipAllocations = ipAllocations;
            return this;
        }

        public Builder setIpConfigurationProfiles(List<IPConfigurationProfileResponse> ipConfigurationProfiles) {
            this.ipConfigurationProfiles = Objects.requireNonNull(ipConfigurationProfiles);
            return this;
        }

        public Builder setIpConfigurations(List<IPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNatGateway(@Nullable SubResourceResponse natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable NetworkSecurityGroupResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public Builder setPrivateEndpointNetworkPolicies(@Nullable String privateEndpointNetworkPolicies) {
            this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
            return this;
        }

        public Builder setPrivateEndpoints(List<PrivateEndpointResponse> privateEndpoints) {
            this.privateEndpoints = Objects.requireNonNull(privateEndpoints);
            return this;
        }

        public Builder setPrivateLinkServiceNetworkPolicies(@Nullable String privateLinkServiceNetworkPolicies) {
            this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPurpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }

        public Builder setResourceNavigationLinks(List<ResourceNavigationLinkResponse> resourceNavigationLinks) {
            this.resourceNavigationLinks = Objects.requireNonNull(resourceNavigationLinks);
            return this;
        }

        public Builder setRouteTable(@Nullable RouteTableResponse routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder setServiceAssociationLinks(List<ServiceAssociationLinkResponse> serviceAssociationLinks) {
            this.serviceAssociationLinks = Objects.requireNonNull(serviceAssociationLinks);
            return this;
        }

        public Builder setServiceEndpointPolicies(@Nullable List<ServiceEndpointPolicyResponse> serviceEndpointPolicies) {
            this.serviceEndpointPolicies = serviceEndpointPolicies;
            return this;
        }

        public Builder setServiceEndpoints(@Nullable List<ServiceEndpointPropertiesFormatResponse> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public SubnetResponse build() {
            return new SubnetResponse(addressPrefix, addressPrefixes, applicationGatewayIpConfigurations, delegations, etag, id, ipAllocations, ipConfigurationProfiles, ipConfigurations, name, natGateway, networkSecurityGroup, privateEndpointNetworkPolicies, privateEndpoints, privateLinkServiceNetworkPolicies, provisioningState, purpose, resourceNavigationLinks, routeTable, serviceAssociationLinks, serviceEndpointPolicies, serviceEndpoints, type);
        }
    }
}
