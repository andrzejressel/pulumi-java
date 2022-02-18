// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.GlobalNetworkEndpointArgs;
import io.pulumi.gcp.compute.inputs.GlobalNetworkEndpointState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Global Network endpoint represents a IP address and port combination that exists outside of GCP.
 * **NOTE**: Global network endpoints cannot be created outside of a
 * global network endpoint group.
 * 
 * To get more information about GlobalNetworkEndpoint, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/networkEndpointGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * GlobalNetworkEndpoint can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint default projects/{{project}}/global/networkEndpointGroups/{{global_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint default {{project}}/{{global_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint default {{global_network_endpoint_group}}/{{ip_address}}/{{fqdn}}/{{port}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint")
public class GlobalNetworkEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    @OutputExport(name="fqdn", type=String.class, parameters={})
    private Output</* @Nullable */ String> fqdn;

    /**
     * @return Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    public Output</* @Nullable */ String> getFqdn() {
        return this.fqdn;
    }
    /**
     * The global network endpoint group this endpoint is part of.
     * 
     */
    @OutputExport(name="globalNetworkEndpointGroup", type=String.class, parameters={})
    private Output<String> globalNetworkEndpointGroup;

    /**
     * @return The global network endpoint group this endpoint is part of.
     * 
     */
    public Output<String> getGlobalNetworkEndpointGroup() {
        return this.globalNetworkEndpointGroup;
    }
    /**
     * IPv4 address external endpoint.
     * 
     */
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipAddress;

    /**
     * @return IPv4 address external endpoint.
     * 
     */
    public Output</* @Nullable */ String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Port number of the external endpoint.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Port number of the external endpoint.
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalNetworkEndpoint(String name, GlobalNetworkEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint", name, args == null ? GlobalNetworkEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GlobalNetworkEndpoint(String name, Input<String> id, @Nullable GlobalNetworkEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/globalNetworkEndpoint:GlobalNetworkEndpoint", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static GlobalNetworkEndpoint get(String name, Input<String> id, @Nullable GlobalNetworkEndpointState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalNetworkEndpoint(name, id, state, options);
    }
}
