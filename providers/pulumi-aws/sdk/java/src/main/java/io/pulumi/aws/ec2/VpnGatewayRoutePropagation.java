// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs;
import io.pulumi.aws.ec2.inputs.VpnGatewayRoutePropagationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Requests automatic route propagation between a VPN gateway and a route table.
 * 
 * > **Note:** This resource should not be used with a route table that has
 * the `propagating_vgws` argument set. If that argument is set, any route
 * propagation not explicitly listed in its value will be removed.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ec2/vpnGatewayRoutePropagation:VpnGatewayRoutePropagation")
public class VpnGatewayRoutePropagation extends io.pulumi.resources.CustomResource {
    /**
     * The id of the `aws.ec2.RouteTable` to propagate routes into.
     * 
     */
    @Export(name="routeTableId", type=String.class, parameters={})
    private Output<String> routeTableId;

    /**
     * @return The id of the `aws.ec2.RouteTable` to propagate routes into.
     * 
     */
    public Output<String> getRouteTableId() {
        return this.routeTableId;
    }
    /**
     * The id of the `aws.ec2.VpnGateway` to propagate routes from.
     * 
     */
    @Export(name="vpnGatewayId", type=String.class, parameters={})
    private Output<String> vpnGatewayId;

    /**
     * @return The id of the `aws.ec2.VpnGateway` to propagate routes from.
     * 
     */
    public Output<String> getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public interface BuilderApplicator {
        public void apply(VpnGatewayRoutePropagationArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpnGatewayRoutePropagationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpnGatewayRoutePropagation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnGatewayRoutePropagation(String name) {
        this(name, VpnGatewayRoutePropagationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnGatewayRoutePropagation(String name, VpnGatewayRoutePropagationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnGatewayRoutePropagation(String name, VpnGatewayRoutePropagationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGatewayRoutePropagation:VpnGatewayRoutePropagation", name, args == null ? VpnGatewayRoutePropagationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpnGatewayRoutePropagation(String name, Output<String> id, @Nullable VpnGatewayRoutePropagationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpnGatewayRoutePropagation:VpnGatewayRoutePropagation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpnGatewayRoutePropagation get(String name, Output<String> id, @Nullable VpnGatewayRoutePropagationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpnGatewayRoutePropagation(name, id, state, options);
    }
}
