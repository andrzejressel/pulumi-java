// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.CustomerGatewayArgs;
import io.pulumi.aws.ec2.inputs.CustomerGatewayState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a customer gateway inside a VPC. These objects can be connected to VPN gateways via VPN connections, and allow you to establish tunnels between your network and the VPC.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Customer Gateways can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/customerGateway:CustomerGateway main cgw-b4dc3961
 * ```
 * 
 */
@ResourceType(type="aws:ec2/customerGateway:CustomerGateway")
public class CustomerGateway extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the customer gateway.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the customer gateway.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @Export(name="bgpAsn", type=String.class, parameters={})
    private Output<String> bgpAsn;

    /**
     * @return The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    public Output<String> getBgpAsn() {
        return this.bgpAsn;
    }
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    public Output</* @Nullable */ String> getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * A name for the customer gateway device.
     * 
     */
    @Export(name="deviceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceName;

    /**
     * @return A name for the customer gateway device.
     * 
     */
    public Output</* @Nullable */ String> getDeviceName() {
        return this.deviceName;
    }
    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The IP address of the gateway's Internet-routable external interface.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CustomerGatewayArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.CustomerGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.CustomerGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CustomerGateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomerGateway(String name) {
        this(name, CustomerGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomerGateway(String name, CustomerGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomerGateway(String name, CustomerGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/customerGateway:CustomerGateway", name, args == null ? CustomerGatewayArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CustomerGateway(String name, Output<String> id, @Nullable CustomerGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/customerGateway:CustomerGateway", name, state, makeResourceOptions(options, id));
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
    public static CustomerGateway get(String name, Output<String> id, @Nullable CustomerGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomerGateway(name, id, state, options);
    }
}
