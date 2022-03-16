// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.RouteArgs;
import io.pulumi.googlenative.compute_beta.outputs.RouteAsPathResponse;
import io.pulumi.googlenative.compute_beta.outputs.RouteWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Route resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:Route")
public class Route extends io.pulumi.resources.CustomResource {
    /**
     * AS path.
     * 
     */
    @Export(name="asPaths", type=List.class, parameters={RouteAsPathResponse.class})
    private Output<List<RouteAsPathResponse>> asPaths;

    /**
     * @return AS path.
     * 
     */
    public Output<List<RouteAsPathResponse>> getAsPaths() {
        return this.asPaths;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    @Export(name="destRange", type=String.class, parameters={})
    private Output<String> destRange;

    /**
     * @return The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    public Output<String> getDestRange() {
        return this.destRange;
    }
    /**
     * Type of this resource. Always compute#routes for Route resources.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of this resource. Always compute#routes for Route resources.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Fully-qualified URL of the network that this route applies to.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    @Export(name="nextHopGateway", type=String.class, parameters={})
    private Output<String> nextHopGateway;

    /**
     * @return The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    public Output<String> getNextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    @Export(name="nextHopIlb", type=String.class, parameters={})
    private Output<String> nextHopIlb;

    /**
     * @return The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    public Output<String> getNextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    @Export(name="nextHopInstance", type=String.class, parameters={})
    private Output<String> nextHopInstance;

    /**
     * @return The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    public Output<String> getNextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    @Export(name="nextHopInterconnectAttachment", type=String.class, parameters={})
    private Output<String> nextHopInterconnectAttachment;

    /**
     * @return The URL to an InterconnectAttachment which is the next hop for the route. This field will only be populated for the dynamic routes generated by Cloud Router with a linked interconnectAttachment.
     * 
     */
    public Output<String> getNextHopInterconnectAttachment() {
        return this.nextHopInterconnectAttachment;
    }
    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    @Export(name="nextHopIp", type=String.class, parameters={})
    private Output<String> nextHopIp;

    /**
     * @return The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    public Output<String> getNextHopIp() {
        return this.nextHopIp;
    }
    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    @Export(name="nextHopNetwork", type=String.class, parameters={})
    private Output<String> nextHopNetwork;

    /**
     * @return The URL of the local network if it should handle matching packets.
     * 
     */
    public Output<String> getNextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    @Export(name="nextHopPeering", type=String.class, parameters={})
    private Output<String> nextHopPeering;

    /**
     * @return The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    public Output<String> getNextHopPeering() {
        return this.nextHopPeering;
    }
    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    @Export(name="nextHopVpnTunnel", type=String.class, parameters={})
    private Output<String> nextHopVpnTunnel;

    /**
     * @return The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    public Output<String> getNextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
     */
    @Export(name="routeType", type=String.class, parameters={})
    private Output<String> routeType;

    /**
     * @return The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
     */
    public Output<String> getRouteType() {
        return this.routeType;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined fully-qualified URL for this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A list of instance tags to which this route applies.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return A list of instance tags to which this route applies.
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    @Export(name="warnings", type=List.class, parameters={RouteWarningsItemResponse.class})
    private Output<List<RouteWarningsItemResponse>> warnings;

    /**
     * @return If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    public Output<List<RouteWarningsItemResponse>> getWarnings() {
        return this.warnings;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RouteArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_beta.RouteArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_beta.RouteArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Route(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, @Nullable RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, @Nullable RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Route(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:Route", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Route get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
