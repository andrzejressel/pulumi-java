// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs;
import io.pulumi.aws.ec2.inputs.VpcEndpointConnectionAccepterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to accept a pending VPC Endpoint Connection accept request to VPC Endpoint Service.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * VPC Endpoint Services can be imported using ID of the connection, which is the `VPC Endpoint Service ID` and `VPC Endpoint ID` separated by underscore (`_`). e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpointConnectionAccepter:VpcEndpointConnectionAccepter foo vpce-svc-0f97a19d3fa8220bc_vpce-010601a6db371e263
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointConnectionAccepter:VpcEndpointConnectionAccepter")
public class VpcEndpointConnectionAccepter extends io.pulumi.resources.CustomResource {
    /**
     * AWS VPC Endpoint ID.
     * 
     */
    @Export(name="vpcEndpointId", type=String.class, parameters={})
    private Output<String> vpcEndpointId;

    /**
     * @return AWS VPC Endpoint ID.
     * 
     */
    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId;
    }
    /**
     * AWS VPC Endpoint Service ID.
     * 
     */
    @Export(name="vpcEndpointServiceId", type=String.class, parameters={})
    private Output<String> vpcEndpointServiceId;

    /**
     * @return AWS VPC Endpoint Service ID.
     * 
     */
    public Output<String> getVpcEndpointServiceId() {
        return this.vpcEndpointServiceId;
    }
    /**
     * State of the VPC Endpoint.
     * 
     */
    @Export(name="vpcEndpointState", type=String.class, parameters={})
    private Output<String> vpcEndpointState;

    /**
     * @return State of the VPC Endpoint.
     * 
     */
    public Output<String> getVpcEndpointState() {
        return this.vpcEndpointState;
    }

    public interface BuilderApplicator {
        public void apply(VpcEndpointConnectionAccepterArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.VpcEndpointConnectionAccepterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VpcEndpointConnectionAccepter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointConnectionAccepter(String name) {
        this(name, VpcEndpointConnectionAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointConnectionAccepter(String name, VpcEndpointConnectionAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointConnectionAccepter(String name, VpcEndpointConnectionAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionAccepter:VpcEndpointConnectionAccepter", name, args == null ? VpcEndpointConnectionAccepterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VpcEndpointConnectionAccepter(String name, Output<String> id, @Nullable VpcEndpointConnectionAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionAccepter:VpcEndpointConnectionAccepter", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointConnectionAccepter get(String name, Output<String> id, @Nullable VpcEndpointConnectionAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointConnectionAccepter(name, id, state, options);
    }
}
