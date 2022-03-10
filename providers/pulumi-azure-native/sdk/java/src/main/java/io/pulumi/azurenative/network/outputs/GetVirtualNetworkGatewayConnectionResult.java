// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import io.pulumi.azurenative.network.outputs.LocalNetworkGatewayResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import io.pulumi.azurenative.network.outputs.TunnelConnectionHealthResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewayResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkGatewayConnectionResult {
    /**
     * The authorizationKey.
     * 
     */
    private final @Nullable String authorizationKey;
    /**
     * The connection mode for this connection.
     * 
     */
    private final @Nullable String connectionMode;
    /**
     * Connection protocol used for this connection.
     * 
     */
    private final @Nullable String connectionProtocol;
    /**
     * Virtual Network Gateway connection status.
     * 
     */
    private final String connectionStatus;
    /**
     * Gateway connection type.
     * 
     */
    private final String connectionType;
    /**
     * The dead peer detection timeout of this connection in seconds.
     * 
     */
    private final @Nullable Integer dpdTimeoutSeconds;
    /**
     * The egress bytes transferred in this connection.
     * 
     */
    private final Double egressBytesTransferred;
    /**
     * EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableBgp;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    private final @Nullable Boolean expressRouteGatewayBypass;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The ingress bytes transferred in this connection.
     * 
     */
    private final Double ingressBytesTransferred;
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> ipsecPolicies;
    /**
     * The reference to local network gateway resource.
     * 
     */
    private final @Nullable LocalNetworkGatewayResponse localNetworkGateway2;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The reference to peerings resource.
     * 
     */
    private final @Nullable SubResourceResponse peer;
    /**
     * The provisioning state of the virtual network gateway connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    private final String resourceGuid;
    /**
     * The routing weight.
     * 
     */
    private final @Nullable Integer routingWeight;
    /**
     * The IPSec shared key.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
    /**
     * Collection of all tunnels' connection health status.
     * 
     */
    private final List<TunnelConnectionHealthResponse> tunnelConnectionStatus;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Use private local Azure IP for the connection.
     * 
     */
    private final @Nullable Boolean useLocalAzureIpAddress;
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    private final @Nullable Boolean usePolicyBasedTrafficSelectors;
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    private final VirtualNetworkGatewayResponse virtualNetworkGateway1;
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    private final @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2;

    @OutputCustomType.Constructor
    private GetVirtualNetworkGatewayConnectionResult(
        @OutputCustomType.Parameter("authorizationKey") @Nullable String authorizationKey,
        @OutputCustomType.Parameter("connectionMode") @Nullable String connectionMode,
        @OutputCustomType.Parameter("connectionProtocol") @Nullable String connectionProtocol,
        @OutputCustomType.Parameter("connectionStatus") String connectionStatus,
        @OutputCustomType.Parameter("connectionType") String connectionType,
        @OutputCustomType.Parameter("dpdTimeoutSeconds") @Nullable Integer dpdTimeoutSeconds,
        @OutputCustomType.Parameter("egressBytesTransferred") Double egressBytesTransferred,
        @OutputCustomType.Parameter("enableBgp") @Nullable Boolean enableBgp,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("expressRouteGatewayBypass") @Nullable Boolean expressRouteGatewayBypass,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("ingressBytesTransferred") Double ingressBytesTransferred,
        @OutputCustomType.Parameter("ipsecPolicies") @Nullable List<IpsecPolicyResponse> ipsecPolicies,
        @OutputCustomType.Parameter("localNetworkGateway2") @Nullable LocalNetworkGatewayResponse localNetworkGateway2,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("peer") @Nullable SubResourceResponse peer,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("resourceGuid") String resourceGuid,
        @OutputCustomType.Parameter("routingWeight") @Nullable Integer routingWeight,
        @OutputCustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("trafficSelectorPolicies") @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies,
        @OutputCustomType.Parameter("tunnelConnectionStatus") List<TunnelConnectionHealthResponse> tunnelConnectionStatus,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("useLocalAzureIpAddress") @Nullable Boolean useLocalAzureIpAddress,
        @OutputCustomType.Parameter("usePolicyBasedTrafficSelectors") @Nullable Boolean usePolicyBasedTrafficSelectors,
        @OutputCustomType.Parameter("virtualNetworkGateway1") VirtualNetworkGatewayResponse virtualNetworkGateway1,
        @OutputCustomType.Parameter("virtualNetworkGateway2") @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2) {
        this.authorizationKey = authorizationKey;
        this.connectionMode = connectionMode;
        this.connectionProtocol = connectionProtocol;
        this.connectionStatus = connectionStatus;
        this.connectionType = connectionType;
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.egressBytesTransferred = egressBytesTransferred;
        this.enableBgp = enableBgp;
        this.etag = etag;
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.ingressBytesTransferred = ingressBytesTransferred;
        this.ipsecPolicies = ipsecPolicies;
        this.localNetworkGateway2 = localNetworkGateway2;
        this.location = location;
        this.name = name;
        this.peer = peer;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.tags = tags;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.tunnelConnectionStatus = tunnelConnectionStatus;
        this.type = type;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
    }

    /**
     * The authorizationKey.
     * 
    */
    public Optional<String> getAuthorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    /**
     * The connection mode for this connection.
     * 
    */
    public Optional<String> getConnectionMode() {
        return Optional.ofNullable(this.connectionMode);
    }
    /**
     * Connection protocol used for this connection.
     * 
    */
    public Optional<String> getConnectionProtocol() {
        return Optional.ofNullable(this.connectionProtocol);
    }
    /**
     * Virtual Network Gateway connection status.
     * 
    */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Gateway connection type.
     * 
    */
    public String getConnectionType() {
        return this.connectionType;
    }
    /**
     * The dead peer detection timeout of this connection in seconds.
     * 
    */
    public Optional<Integer> getDpdTimeoutSeconds() {
        return Optional.ofNullable(this.dpdTimeoutSeconds);
    }
    /**
     * The egress bytes transferred in this connection.
     * 
    */
    public Double getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * EnableBgp flag.
     * 
    */
    public Optional<Boolean> getEnableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     * 
    */
    public Optional<Boolean> getExpressRouteGatewayBypass() {
        return Optional.ofNullable(this.expressRouteGatewayBypass);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The ingress bytes transferred in this connection.
     * 
    */
    public Double getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
    */
    public List<IpsecPolicyResponse> getIpsecPolicies() {
        return this.ipsecPolicies == null ? List.of() : this.ipsecPolicies;
    }
    /**
     * The reference to local network gateway resource.
     * 
    */
    public Optional<LocalNetworkGatewayResponse> getLocalNetworkGateway2() {
        return Optional.ofNullable(this.localNetworkGateway2);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The reference to peerings resource.
     * 
    */
    public Optional<SubResourceResponse> getPeer() {
        return Optional.ofNullable(this.peer);
    }
    /**
     * The provisioning state of the virtual network gateway connection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the virtual network gateway connection resource.
     * 
    */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The routing weight.
     * 
    */
    public Optional<Integer> getRoutingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }
    /**
     * The IPSec shared key.
     * 
    */
    public Optional<String> getSharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
    */
    public List<TrafficSelectorPolicyResponse> getTrafficSelectorPolicies() {
        return this.trafficSelectorPolicies == null ? List.of() : this.trafficSelectorPolicies;
    }
    /**
     * Collection of all tunnels' connection health status.
     * 
    */
    public List<TunnelConnectionHealthResponse> getTunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Use private local Azure IP for the connection.
     * 
    */
    public Optional<Boolean> getUseLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }
    /**
     * Enable policy-based traffic selectors.
     * 
    */
    public Optional<Boolean> getUsePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }
    /**
     * The reference to virtual network gateway resource.
     * 
    */
    public VirtualNetworkGatewayResponse getVirtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }
    /**
     * The reference to virtual network gateway resource.
     * 
    */
    public Optional<VirtualNetworkGatewayResponse> getVirtualNetworkGateway2() {
        return Optional.ofNullable(this.virtualNetworkGateway2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable String connectionMode;
        private @Nullable String connectionProtocol;
        private String connectionStatus;
        private String connectionType;
        private @Nullable Integer dpdTimeoutSeconds;
        private Double egressBytesTransferred;
        private @Nullable Boolean enableBgp;
        private String etag;
        private @Nullable Boolean expressRouteGatewayBypass;
        private @Nullable String id;
        private Double ingressBytesTransferred;
        private @Nullable List<IpsecPolicyResponse> ipsecPolicies;
        private @Nullable LocalNetworkGatewayResponse localNetworkGateway2;
        private @Nullable String location;
        private String name;
        private @Nullable SubResourceResponse peer;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Integer routingWeight;
        private @Nullable String sharedKey;
        private @Nullable Map<String,String> tags;
        private @Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies;
        private List<TunnelConnectionHealthResponse> tunnelConnectionStatus;
        private String type;
        private @Nullable Boolean useLocalAzureIpAddress;
        private @Nullable Boolean usePolicyBasedTrafficSelectors;
        private VirtualNetworkGatewayResponse virtualNetworkGateway1;
        private @Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionMode = defaults.connectionMode;
    	      this.connectionProtocol = defaults.connectionProtocol;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.connectionType = defaults.connectionType;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.etag = defaults.etag;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.localNetworkGateway2 = defaults.localNetworkGateway2;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peer = defaults.peer;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.tags = defaults.tags;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.tunnelConnectionStatus = defaults.tunnelConnectionStatus;
    	      this.type = defaults.type;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.virtualNetworkGateway1 = defaults.virtualNetworkGateway1;
    	      this.virtualNetworkGateway2 = defaults.virtualNetworkGateway2;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setConnectionMode(@Nullable String connectionMode) {
            this.connectionMode = connectionMode;
            return this;
        }

        public Builder setConnectionProtocol(@Nullable String connectionProtocol) {
            this.connectionProtocol = connectionProtocol;
            return this;
        }

        public Builder setConnectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }

        public Builder setConnectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }

        public Builder setDpdTimeoutSeconds(@Nullable Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = dpdTimeoutSeconds;
            return this;
        }

        public Builder setEgressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }

        public Builder setEnableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpressRouteGatewayBypass(@Nullable Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = expressRouteGatewayBypass;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIngressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }

        public Builder setIpsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }

        public Builder setLocalNetworkGateway2(@Nullable LocalNetworkGatewayResponse localNetworkGateway2) {
            this.localNetworkGateway2 = localNetworkGateway2;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeer(@Nullable SubResourceResponse peer) {
            this.peer = peer;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setRoutingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }

        public Builder setSharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrafficSelectorPolicies(@Nullable List<TrafficSelectorPolicyResponse> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = trafficSelectorPolicies;
            return this;
        }

        public Builder setTunnelConnectionStatus(List<TunnelConnectionHealthResponse> tunnelConnectionStatus) {
            this.tunnelConnectionStatus = Objects.requireNonNull(tunnelConnectionStatus);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }

        public Builder setUsePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }

        public Builder setVirtualNetworkGateway1(VirtualNetworkGatewayResponse virtualNetworkGateway1) {
            this.virtualNetworkGateway1 = Objects.requireNonNull(virtualNetworkGateway1);
            return this;
        }

        public Builder setVirtualNetworkGateway2(@Nullable VirtualNetworkGatewayResponse virtualNetworkGateway2) {
            this.virtualNetworkGateway2 = virtualNetworkGateway2;
            return this;
        }
        public GetVirtualNetworkGatewayConnectionResult build() {
            return new GetVirtualNetworkGatewayConnectionResult(authorizationKey, connectionMode, connectionProtocol, connectionStatus, connectionType, dpdTimeoutSeconds, egressBytesTransferred, enableBgp, etag, expressRouteGatewayBypass, id, ingressBytesTransferred, ipsecPolicies, localNetworkGateway2, location, name, peer, provisioningState, resourceGuid, routingWeight, sharedKey, tags, trafficSelectorPolicies, tunnelConnectionStatus, type, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, virtualNetworkGateway1, virtualNetworkGateway2);
        }
    }
}
