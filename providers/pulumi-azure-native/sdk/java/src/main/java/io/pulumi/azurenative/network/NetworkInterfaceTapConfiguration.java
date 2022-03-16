// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.NetworkInterfaceTapConfigurationArgs;
import io.pulumi.azurenative.network.outputs.VirtualNetworkTapResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Tap configuration in a Network Interface.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:NetworkInterfaceTapConfiguration tapConfiguration1 /subscriptions/subid/resourceGroups/testrg/providers/Microsoft.Network/networkInterfaces/mynic/tapConfigurations/tapConfiguration1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NetworkInterfaceTapConfiguration")
public class NetworkInterfaceTapConfiguration extends io.pulumi.resources.CustomResource {
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * The provisioning state of the network interface tap configuration resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the network interface tap configuration resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Sub Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Sub Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The reference to the Virtual Network Tap resource.
     * 
     */
    @Export(name="virtualNetworkTap", type=VirtualNetworkTapResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkTapResponse> virtualNetworkTap;

    /**
     * @return The reference to the Virtual Network Tap resource.
     * 
     */
    public Output</* @Nullable */ VirtualNetworkTapResponse> getVirtualNetworkTap() {
        return this.virtualNetworkTap;
    }

    public interface BuilderApplicator {
        public void apply(NetworkInterfaceTapConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.NetworkInterfaceTapConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.NetworkInterfaceTapConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkInterfaceTapConfiguration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkInterfaceTapConfiguration(String name) {
        this(name, NetworkInterfaceTapConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkInterfaceTapConfiguration(String name, NetworkInterfaceTapConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkInterfaceTapConfiguration(String name, NetworkInterfaceTapConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterfaceTapConfiguration", name, args == null ? NetworkInterfaceTapConfigurationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkInterfaceTapConfiguration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkInterfaceTapConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180801:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:NetworkInterfaceTapConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:NetworkInterfaceTapConfiguration").build())
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
    public static NetworkInterfaceTapConfiguration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkInterfaceTapConfiguration(name, id, options);
    }
}
