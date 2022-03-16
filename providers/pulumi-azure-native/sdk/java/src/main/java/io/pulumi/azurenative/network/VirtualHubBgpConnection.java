// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.VirtualHubBgpConnectionArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Virtual Appliance Site resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualHubBgpConnection conn1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1/bgpConnections/conn1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHubBgpConnection")
public class VirtualHubBgpConnection extends io.pulumi.resources.CustomResource {
    /**
     * The current state of the VirtualHub to Peer.
     * 
     */
    @Export(name="connectionState", type=String.class, parameters={})
    private Output<String> connectionState;

    /**
     * @return The current state of the VirtualHub to Peer.
     * 
     */
    public Output<String> getConnectionState() {
        return this.connectionState;
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
     * Name of the connection.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the connection.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Peer ASN.
     * 
     */
    @Export(name="peerAsn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> peerAsn;

    /**
     * @return Peer ASN.
     * 
     */
    public Output</* @Nullable */ Double> getPeerAsn() {
        return this.peerAsn;
    }
    /**
     * Peer IP.
     * 
     */
    @Export(name="peerIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerIp;

    /**
     * @return Peer IP.
     * 
     */
    public Output</* @Nullable */ String> getPeerIp() {
        return this.peerIp;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Connection type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Connection type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(VirtualHubBgpConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.VirtualHubBgpConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.VirtualHubBgpConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualHubBgpConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHubBgpConnection(String name) {
        this(name, VirtualHubBgpConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHubBgpConnection(String name, VirtualHubBgpConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHubBgpConnection(String name, VirtualHubBgpConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubBgpConnection", name, args == null ? VirtualHubBgpConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualHubBgpConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubBgpConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualHubBgpConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualHubBgpConnection").build())
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
    public static VirtualHubBgpConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHubBgpConnection(name, id, options);
    }
}
