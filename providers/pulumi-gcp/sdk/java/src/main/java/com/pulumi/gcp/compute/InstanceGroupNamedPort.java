// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.InstanceGroupNamedPortArgs;
import com.pulumi.gcp.compute.inputs.InstanceGroupNamedPortState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Mange the named ports setting for a managed instance group without
 * managing the group as whole. This resource is primarily intended for use
 * with GKE-generated groups that shouldn&#39;t otherwise be managed by other
 * tools.
 * 
 * To get more information about InstanceGroupNamedPort, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/instanceGroup)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/instance-groups/)
 * 
 * ## Example Usage
 * ### Instance Group Named Port Gke
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var containerNetwork = new Network(&#34;containerNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var containerSubnetwork = new Subnetwork(&#34;containerSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .network(containerNetwork.getName())
 *             .ipCidrRange(&#34;10.0.36.0/24&#34;)
 *             .build());
 * 
 *         var myCluster = new Cluster(&#34;myCluster&#34;, ClusterArgs.builder()        
 *             .location(&#34;us-central1-a&#34;)
 *             .initialNodeCount(1)
 *             .network(containerNetwork.getName())
 *             .subnetwork(containerSubnetwork.getName())
 *             .ipAllocationPolicy(ClusterIpAllocationPolicy.builder()
 *                 .clusterIpv4CidrBlock(&#34;/19&#34;)
 *                 .servicesIpv4CidrBlock(&#34;/22&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myPort = new InstanceGroupNamedPort(&#34;myPort&#34;, InstanceGroupNamedPortArgs.builder()        
 *             .group(myCluster.getNodePools().apply(nodePools -&gt; nodePools[0].getInstanceGroupUrls()[0]))
 *             .zone(&#34;us-central1-a&#34;)
 *             .port(8080)
 *             .build());
 * 
 *         var myPorts = new InstanceGroupNamedPort(&#34;myPorts&#34;, InstanceGroupNamedPortArgs.builder()        
 *             .group(myCluster.getNodePools().apply(nodePools -&gt; nodePools[0].getInstanceGroupUrls()[0]))
 *             .zone(&#34;us-central1-a&#34;)
 *             .port(4443)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * InstanceGroupNamedPort can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort default projects/{{project}}/zones/{{zone}}/instanceGroups/{{group}}/{{port}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort default {{project}}/{{zone}}/{{group}}/{{port}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort default {{zone}}/{{group}}/{{port}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort default {{group}}/{{port}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort")
public class InstanceGroupNamedPort extends com.pulumi.resources.CustomResource {
    /**
     * The name of the instance group.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The name of the instance group.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The name for this named port. The name must be 1-63 characters
     * long, and comply with RFC1035.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for this named port. The name must be 1-63 characters
     * long, and comply with RFC1035.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The port number, which can be a value between 1 and 65535.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port number, which can be a value between 1 and 65535.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The zone of the instance group.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone of the instance group.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceGroupNamedPort(String name) {
        this(name, InstanceGroupNamedPortArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceGroupNamedPort(String name, InstanceGroupNamedPortArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceGroupNamedPort(String name, InstanceGroupNamedPortArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort", name, args == null ? InstanceGroupNamedPortArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceGroupNamedPort(String name, Output<String> id, @Nullable InstanceGroupNamedPortState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceGroupNamedPort:InstanceGroupNamedPort", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static InstanceGroupNamedPort get(String name, Output<String> id, @Nullable InstanceGroupNamedPortState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceGroupNamedPort(name, id, state, options);
    }
}
