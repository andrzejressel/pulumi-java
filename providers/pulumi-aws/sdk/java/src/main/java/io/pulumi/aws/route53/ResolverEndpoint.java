// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverEndpointArgs;
import io.pulumi.aws.route53.inputs.ResolverEndpointState;
import io.pulumi.aws.route53.outputs.ResolverEndpointIpAddress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver endpoint resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver endpoints can be imported using the Route 53 Resolver endpoint ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverEndpoint:ResolverEndpoint foo rslvr-in-abcdef01234567890
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverEndpoint:ResolverEndpoint")
public class ResolverEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the Route 53 Resolver endpoint.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the Route 53 Resolver endpoint.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    @Export(name="direction", type=String.class, parameters={})
    private Output<String> direction;

    /**
     * @return The direction of DNS queries to or from the Route 53 Resolver endpoint.
     * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
     * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
     * 
     */
    public Output<String> getDirection() {
        return this.direction;
    }
    /**
     * The ID of the VPC that you want to create the resolver endpoint in.
     * 
     */
    @Export(name="hostVpcId", type=String.class, parameters={})
    private Output<String> hostVpcId;

    /**
     * @return The ID of the VPC that you want to create the resolver endpoint in.
     * 
     */
    public Output<String> getHostVpcId() {
        return this.hostVpcId;
    }
    /**
     * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    @Export(name="ipAddresses", type=List.class, parameters={ResolverEndpointIpAddress.class})
    private Output<List<ResolverEndpointIpAddress>> ipAddresses;

    /**
     * @return The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
     * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
     * 
     */
    public Output<List<ResolverEndpointIpAddress>> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The friendly name of the Route 53 Resolver endpoint.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupIds;

    /**
     * @return The ID of one or more security groups that you want to use to control access to this VPC.
     * 
     */
    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    public interface BuilderApplicator {
        public void apply(ResolverEndpointArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverEndpoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverEndpoint(String name) {
        this(name, ResolverEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverEndpoint(String name, ResolverEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverEndpoint(String name, ResolverEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverEndpoint:ResolverEndpoint", name, args == null ? ResolverEndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ResolverEndpoint(String name, Output<String> id, @Nullable ResolverEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverEndpoint:ResolverEndpoint", name, state, makeResourceOptions(options, id));
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
    public static ResolverEndpoint get(String name, Output<String> id, @Nullable ResolverEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverEndpoint(name, id, state, options);
    }
}
