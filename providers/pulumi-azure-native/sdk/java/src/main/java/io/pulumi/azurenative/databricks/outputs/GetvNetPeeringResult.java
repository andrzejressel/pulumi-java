// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.azurenative.databricks.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetvNetPeeringResult {
    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    private final @Nullable Boolean allowForwardedTraffic;
    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    private final @Nullable Boolean allowGatewayTransit;
    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    private final @Nullable Boolean allowVirtualNetworkAccess;
    /**
     * The reference to the databricks virtual network address space.
     * 
     */
    private final @Nullable AddressSpaceResponse databricksAddressSpace;
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    private final @Nullable VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork databricksVirtualNetwork;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Name of the virtual network peering resource
     * 
     */
    private final String name;
    /**
     * The status of the virtual network peering.
     * 
     */
    private final String peeringState;
    /**
     * The provisioning state of the virtual network peering resource.
     * 
     */
    private final String provisioningState;
    /**
     * The reference to the remote virtual network address space.
     * 
     */
    private final @Nullable AddressSpaceResponse remoteAddressSpace;
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    private final VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork remoteVirtualNetwork;
    /**
     * type of the virtual network peering resource
     * 
     */
    private final String type;
    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    private final @Nullable Boolean useRemoteGateways;

    @OutputCustomType.Constructor
    private GetvNetPeeringResult(
        @OutputCustomType.Parameter("allowForwardedTraffic") @Nullable Boolean allowForwardedTraffic,
        @OutputCustomType.Parameter("allowGatewayTransit") @Nullable Boolean allowGatewayTransit,
        @OutputCustomType.Parameter("allowVirtualNetworkAccess") @Nullable Boolean allowVirtualNetworkAccess,
        @OutputCustomType.Parameter("databricksAddressSpace") @Nullable AddressSpaceResponse databricksAddressSpace,
        @OutputCustomType.Parameter("databricksVirtualNetwork") @Nullable VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork databricksVirtualNetwork,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("peeringState") String peeringState,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("remoteAddressSpace") @Nullable AddressSpaceResponse remoteAddressSpace,
        @OutputCustomType.Parameter("remoteVirtualNetwork") VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork remoteVirtualNetwork,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("useRemoteGateways") @Nullable Boolean useRemoteGateways) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        this.allowGatewayTransit = allowGatewayTransit;
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        this.databricksAddressSpace = databricksAddressSpace;
        this.databricksVirtualNetwork = databricksVirtualNetwork;
        this.id = id;
        this.name = name;
        this.peeringState = peeringState;
        this.provisioningState = provisioningState;
        this.remoteAddressSpace = remoteAddressSpace;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.type = type;
        this.useRemoteGateways = useRemoteGateways;
    }

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
    */
    public Optional<Boolean> getAllowForwardedTraffic() {
        return Optional.ofNullable(this.allowForwardedTraffic);
    }
    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
    */
    public Optional<Boolean> getAllowGatewayTransit() {
        return Optional.ofNullable(this.allowGatewayTransit);
    }
    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
    */
    public Optional<Boolean> getAllowVirtualNetworkAccess() {
        return Optional.ofNullable(this.allowVirtualNetworkAccess);
    }
    /**
     * The reference to the databricks virtual network address space.
     * 
    */
    public Optional<AddressSpaceResponse> getDatabricksAddressSpace() {
        return Optional.ofNullable(this.databricksAddressSpace);
    }
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
    */
    public Optional<VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork> getDatabricksVirtualNetwork() {
        return Optional.ofNullable(this.databricksVirtualNetwork);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the virtual network peering resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The status of the virtual network peering.
     * 
    */
    public String getPeeringState() {
        return this.peeringState;
    }
    /**
     * The provisioning state of the virtual network peering resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the remote virtual network address space.
     * 
    */
    public Optional<AddressSpaceResponse> getRemoteAddressSpace() {
        return Optional.ofNullable(this.remoteAddressSpace);
    }
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
    */
    public VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }
    /**
     * type of the virtual network peering resource
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
    */
    public Optional<Boolean> getUseRemoteGateways() {
        return Optional.ofNullable(this.useRemoteGateways);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetvNetPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowForwardedTraffic;
        private @Nullable Boolean allowGatewayTransit;
        private @Nullable Boolean allowVirtualNetworkAccess;
        private @Nullable AddressSpaceResponse databricksAddressSpace;
        private @Nullable VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork databricksVirtualNetwork;
        private String id;
        private String name;
        private String peeringState;
        private String provisioningState;
        private @Nullable AddressSpaceResponse remoteAddressSpace;
        private VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork remoteVirtualNetwork;
        private String type;
        private @Nullable Boolean useRemoteGateways;

        public Builder() {
    	      // Empty
        }

        public Builder(GetvNetPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowForwardedTraffic = defaults.allowForwardedTraffic;
    	      this.allowGatewayTransit = defaults.allowGatewayTransit;
    	      this.allowVirtualNetworkAccess = defaults.allowVirtualNetworkAccess;
    	      this.databricksAddressSpace = defaults.databricksAddressSpace;
    	      this.databricksVirtualNetwork = defaults.databricksVirtualNetwork;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peeringState = defaults.peeringState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteAddressSpace = defaults.remoteAddressSpace;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.type = defaults.type;
    	      this.useRemoteGateways = defaults.useRemoteGateways;
        }

        public Builder setAllowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            this.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }

        public Builder setAllowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            this.allowGatewayTransit = allowGatewayTransit;
            return this;
        }

        public Builder setAllowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }

        public Builder setDatabricksAddressSpace(@Nullable AddressSpaceResponse databricksAddressSpace) {
            this.databricksAddressSpace = databricksAddressSpace;
            return this;
        }

        public Builder setDatabricksVirtualNetwork(@Nullable VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork databricksVirtualNetwork) {
            this.databricksVirtualNetwork = databricksVirtualNetwork;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeeringState(String peeringState) {
            this.peeringState = Objects.requireNonNull(peeringState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRemoteAddressSpace(@Nullable AddressSpaceResponse remoteAddressSpace) {
            this.remoteAddressSpace = remoteAddressSpace;
            return this;
        }

        public Builder setRemoteVirtualNetwork(VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork remoteVirtualNetwork) {
            this.remoteVirtualNetwork = Objects.requireNonNull(remoteVirtualNetwork);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseRemoteGateways(@Nullable Boolean useRemoteGateways) {
            this.useRemoteGateways = useRemoteGateways;
            return this;
        }
        public GetvNetPeeringResult build() {
            return new GetvNetPeeringResult(allowForwardedTraffic, allowGatewayTransit, allowVirtualNetworkAccess, databricksAddressSpace, databricksVirtualNetwork, id, name, peeringState, provisioningState, remoteAddressSpace, remoteVirtualNetwork, type, useRemoteGateways);
        }
    }
}
