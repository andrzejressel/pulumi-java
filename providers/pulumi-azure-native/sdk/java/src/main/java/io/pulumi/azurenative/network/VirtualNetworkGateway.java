// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualNetworkGatewayArgs;
import io.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.VirtualNetworkGatewaySkuResponse;
import io.pulumi.azurenative.network.outputs.VpnClientConfigurationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A common class for general resource information.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualNetworkGateway vpngw /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualNetworkGateway")
public class VirtualNetworkGateway extends io.pulumi.resources.CustomResource {
    /**
     * ActiveActive flag.
     * 
     */
    @Export(name="activeActive", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> activeActive;

    /**
     * @return ActiveActive flag.
     * 
     */
    public Output</* @Nullable */ Boolean> getActiveActive() {
        return this.activeActive;
    }
    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    @Export(name="bgpSettings", type=BgpSettingsResponse.class, parameters={})
    private Output</* @Nullable */ BgpSettingsResponse> bgpSettings;

    /**
     * @return Virtual network gateway's BGP speaker settings.
     * 
     */
    public Output</* @Nullable */ BgpSettingsResponse> getBgpSettings() {
        return this.bgpSettings;
    }
    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    @Export(name="customRoutes", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> customRoutes;

    /**
     * @return The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    public Output</* @Nullable */ AddressSpaceResponse> getCustomRoutes() {
        return this.customRoutes;
    }
    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    @Export(name="enableBgp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBgp;

    /**
     * @return Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableBgp() {
        return this.enableBgp;
    }
    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    @Export(name="enableDnsForwarding", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDnsForwarding;

    /**
     * @return Whether dns forwarding is enabled or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDnsForwarding() {
        return this.enableDnsForwarding;
    }
    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    @Export(name="enablePrivateIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePrivateIpAddress;

    /**
     * @return Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnablePrivateIpAddress() {
        return this.enablePrivateIpAddress;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location of type local virtual network gateway.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    @Export(name="gatewayDefaultSite", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> gatewayDefaultSite;

    /**
     * @return The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getGatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }
    /**
     * The type of this virtual network gateway.
     * 
     */
    @Export(name="gatewayType", type=String.class, parameters={})
    private Output</* @Nullable */ String> gatewayType;

    /**
     * @return The type of this virtual network gateway.
     * 
     */
    public Output</* @Nullable */ String> getGatewayType() {
        return this.gatewayType;
    }
    /**
     * The IP address allocated by the gateway to which dns requests can be sent.
     * 
     */
    @Export(name="inboundDnsForwardingEndpoint", type=String.class, parameters={})
    private Output<String> inboundDnsForwardingEndpoint;

    /**
     * @return The IP address allocated by the gateway to which dns requests can be sent.
     * 
     */
    public Output<String> getInboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }
    /**
     * IP configurations for virtual network gateway.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={VirtualNetworkGatewayIPConfigurationResponse.class})
    private Output</* @Nullable */ List<VirtualNetworkGatewayIPConfigurationResponse>> ipConfigurations;

    /**
     * @return IP configurations for virtual network gateway.
     * 
     */
    public Output</* @Nullable */ List<VirtualNetworkGatewayIPConfigurationResponse>> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the virtual network gateway resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual network gateway resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the virtual network gateway resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the virtual network gateway resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    @Export(name="sku", type=VirtualNetworkGatewaySkuResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewaySkuResponse> sku;

    /**
     * @return The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkGatewaySkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    @Export(name="vNetExtendedLocationResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vNetExtendedLocationResourceId;

    /**
     * @return Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    public Output</* @Nullable */ String> getVNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId;
    }
    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    @Export(name="vpnClientConfiguration", type=VpnClientConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ VpnClientConfigurationResponse> vpnClientConfiguration;

    /**
     * @return The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    public Output</* @Nullable */ VpnClientConfigurationResponse> getVpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }
    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    @Export(name="vpnGatewayGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnGatewayGeneration;

    /**
     * @return The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    public Output</* @Nullable */ String> getVpnGatewayGeneration() {
        return this.vpnGatewayGeneration;
    }
    /**
     * The type of this virtual network gateway.
     * 
     */
    @Export(name="vpnType", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnType;

    /**
     * @return The type of this virtual network gateway.
     * 
     */
    public Output</* @Nullable */ String> getVpnType() {
        return this.vpnType;
    }

    public interface BuilderApplicator {
        public void apply(VirtualNetworkGatewayArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualNetworkGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualNetworkGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualNetworkGateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkGateway(String name) {
        this(name, VirtualNetworkGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkGateway(String name, VirtualNetworkGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkGateway(String name, VirtualNetworkGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGateway", name, args == null ? VirtualNetworkGatewayArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualNetworkGateway(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGateway", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150615:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualNetworkGateway").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualNetworkGateway").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualNetworkGateway get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGateway(name, id, options);
    }
}
