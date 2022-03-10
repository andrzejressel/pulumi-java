// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHubVirtualNetworkConnectionResult {
    /**
     * Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     * 
     */
    private final @Nullable Boolean allowHubToRemoteVnetTransit;
    /**
     * Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     * 
     */
    private final @Nullable Boolean allowRemoteVnetToUseHubVnetGateways;
    /**
     * Enable internet security.
     * 
     */
    private final @Nullable Boolean enableInternetSecurity;
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the hub virtual network connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * Reference to the remote virtual network.
     * 
     */
    private final @Nullable SubResourceResponse remoteVirtualNetwork;
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    private final @Nullable RoutingConfigurationResponse routingConfiguration;

    @OutputCustomType.Constructor
    private GetHubVirtualNetworkConnectionResult(
        @OutputCustomType.Parameter("allowHubToRemoteVnetTransit") @Nullable Boolean allowHubToRemoteVnetTransit,
        @OutputCustomType.Parameter("allowRemoteVnetToUseHubVnetGateways") @Nullable Boolean allowRemoteVnetToUseHubVnetGateways,
        @OutputCustomType.Parameter("enableInternetSecurity") @Nullable Boolean enableInternetSecurity,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("remoteVirtualNetwork") @Nullable SubResourceResponse remoteVirtualNetwork,
        @OutputCustomType.Parameter("routingConfiguration") @Nullable RoutingConfigurationResponse routingConfiguration) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        this.enableInternetSecurity = enableInternetSecurity;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        this.routingConfiguration = routingConfiguration;
    }

    /**
     * Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     * 
    */
    public Optional<Boolean> getAllowHubToRemoteVnetTransit() {
        return Optional.ofNullable(this.allowHubToRemoteVnetTransit);
    }
    /**
     * Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     * 
    */
    public Optional<Boolean> getAllowRemoteVnetToUseHubVnetGateways() {
        return Optional.ofNullable(this.allowRemoteVnetToUseHubVnetGateways);
    }
    /**
     * Enable internet security.
     * 
    */
    public Optional<Boolean> getEnableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the hub virtual network connection resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Reference to the remote virtual network.
     * 
    */
    public Optional<SubResourceResponse> getRemoteVirtualNetwork() {
        return Optional.ofNullable(this.remoteVirtualNetwork);
    }
    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
    */
    public Optional<RoutingConfigurationResponse> getRoutingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHubVirtualNetworkConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowHubToRemoteVnetTransit;
        private @Nullable Boolean allowRemoteVnetToUseHubVnetGateways;
        private @Nullable Boolean enableInternetSecurity;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable SubResourceResponse remoteVirtualNetwork;
        private @Nullable RoutingConfigurationResponse routingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHubVirtualNetworkConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowHubToRemoteVnetTransit = defaults.allowHubToRemoteVnetTransit;
    	      this.allowRemoteVnetToUseHubVnetGateways = defaults.allowRemoteVnetToUseHubVnetGateways;
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.routingConfiguration = defaults.routingConfiguration;
        }

        public Builder setAllowHubToRemoteVnetTransit(@Nullable Boolean allowHubToRemoteVnetTransit) {
            this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
            return this;
        }

        public Builder setAllowRemoteVnetToUseHubVnetGateways(@Nullable Boolean allowRemoteVnetToUseHubVnetGateways) {
            this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
            return this;
        }

        public Builder setEnableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
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

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRemoteVirtualNetwork(@Nullable SubResourceResponse remoteVirtualNetwork) {
            this.remoteVirtualNetwork = remoteVirtualNetwork;
            return this;
        }

        public Builder setRoutingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }
        public GetHubVirtualNetworkConnectionResult build() {
            return new GetHubVirtualNetworkConnectionResult(allowHubToRemoteVnetTransit, allowRemoteVnetToUseHubVnetGateways, enableInternetSecurity, etag, id, name, provisioningState, remoteVirtualNetwork, routingConfiguration);
        }
    }
}
