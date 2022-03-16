// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.NetworkArgs;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkPeeringResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NetworkRoutingConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a network in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/alpha:Network")
public class Network extends io.pulumi.resources.CustomResource {
    /**
     * Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    @Export(name="autoCreateSubnetworks", type=Boolean.class, parameters={})
    private Output<Boolean> autoCreateSubnetworks;

    /**
     * @return Must be set to create a VPC network. If not set, a legacy network is created. When set to true, the VPC network is created in auto mode. When set to false, the VPC network is created in custom mode. An auto mode VPC network starts with one subnet per region. Each subnet has a predetermined range as described in Auto mode VPC network IP ranges. For custom mode VPC networks, you can add subnets using the subnetworks insert method.
     * 
     */
    public Output<Boolean> getAutoCreateSubnetworks() {
        return this.autoCreateSubnetworks;
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
     * Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    @Export(name="enableUlaInternalIpv6", type=Boolean.class, parameters={})
    private Output<Boolean> enableUlaInternalIpv6;

    /**
     * @return Enable ULA internal ipv6 on this network. Enabling this feature will assign a /48 from google defined ULA prefix fd20::/20. .
     * 
     */
    public Output<Boolean> getEnableUlaInternalIpv6() {
        return this.enableUlaInternalIpv6;
    }
    /**
     * URL of the firewall policy the network is associated with.
     * 
     */
    @Export(name="firewallPolicy", type=String.class, parameters={})
    private Output<String> firewallPolicy;

    /**
     * @return URL of the firewall policy the network is associated with.
     * 
     */
    public Output<String> getFirewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * The gateway address for default routing out of the network, selected by GCP.
     * 
     */
    @Export(name="gatewayIPv4", type=String.class, parameters={})
    private Output<String> gatewayIPv4;

    /**
     * @return The gateway address for default routing out of the network, selected by GCP.
     * 
     */
    public Output<String> getGatewayIPv4() {
        return this.gatewayIPv4;
    }
    /**
     * When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    @Export(name="internalIpv6Range", type=String.class, parameters={})
    private Output<String> internalIpv6Range;

    /**
     * @return When enabling ula internal ipv6, caller optionally can specify the /48 range they want from the google defined ULA prefix fd20::/20. The input must be a valid /48 ULA IPv6 address and must be within the fd20::/20. Operation will fail if the speficied /48 is already in used by another resource. If the field is not speficied, then a /48 range will be randomly allocated from fd20::/20 and returned via this field. .
     * 
     */
    public Output<String> getInternalIpv6Range() {
        return this.internalIpv6Range;
    }
    /**
     * Type of the resource. Always compute#network for networks.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#network for networks.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    @Export(name="mtu", type=Integer.class, parameters={})
    private Output<Integer> mtu;

    /**
     * @return Maximum Transmission Unit in bytes. The minimum value for this field is 1460 and the maximum value is 1500 bytes. If unspecified, defaults to 1460.
     * 
     */
    public Output<Integer> getMtu() {
        return this.mtu;
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
    @Export(name="networkFirewallPolicyEnforcementOrder", type=String.class, parameters={})
    private Output<String> networkFirewallPolicyEnforcementOrder;

    public Output<String> getNetworkFirewallPolicyEnforcementOrder() {
        return this.networkFirewallPolicyEnforcementOrder;
    }
    /**
     * A list of network peerings for the resource.
     * 
     */
    @Export(name="peerings", type=List.class, parameters={NetworkPeeringResponse.class})
    private Output<List<NetworkPeeringResponse>> peerings;

    /**
     * @return A list of network peerings for the resource.
     * 
     */
    public Output<List<NetworkPeeringResponse>> getPeerings() {
        return this.peerings;
    }
    /**
     * URL of the region where the regional network resides. This field is not applicable to global network. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional network resides. This field is not applicable to global network. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    @Export(name="routingConfig", type=NetworkRoutingConfigResponse.class, parameters={})
    private Output<NetworkRoutingConfigResponse> routingConfig;

    /**
     * @return The network-level routing configuration for this network. Used by Cloud Router to determine what type of network-wide routing behavior to enforce.
     * 
     */
    public Output<NetworkRoutingConfigResponse> getRoutingConfig() {
        return this.routingConfig;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @Export(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
     */
    @Export(name="subnetworks", type=List.class, parameters={String.class})
    private Output<List<String>> subnetworks;

    /**
     * @return Server-defined fully-qualified URLs for all subnetworks in this VPC network.
     * 
     */
    public Output<List<String>> getSubnetworks() {
        return this.subnetworks;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable NetworkArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_alpha.NetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_alpha.NetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Network(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Network(String name) {
        this(name, NetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Network(String name, @Nullable NetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Network(String name, @Nullable NetworkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Network", name, args == null ? NetworkArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Network(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:Network", name, null, makeResourceOptions(options, id));
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
    public static Network get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Network(name, id, options);
    }
}
