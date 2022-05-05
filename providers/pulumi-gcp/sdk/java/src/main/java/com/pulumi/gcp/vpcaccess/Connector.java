// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vpcaccess;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vpcaccess.ConnectorArgs;
import com.pulumi.gcp.vpcaccess.inputs.ConnectorState;
import com.pulumi.gcp.vpcaccess.outputs.ConnectorSubnet;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Serverless VPC Access connector resource.
 * 
 * To get more information about Connector, see:
 * 
 * * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
 * * How-to Guides
 *     * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
 * 
 * ## Example Usage
 * ### VPC Access Connector
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
 *         var connector = new Connector(&#34;connector&#34;, ConnectorArgs.builder()        
 *             .ipCidrRange(&#34;10.8.0.0/28&#34;)
 *             .network(&#34;default&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### VPC Access Connector Shared VPC
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
 *         var customTestNetwork = new Network(&#34;customTestNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var customTestSubnetwork = new Subnetwork(&#34;customTestSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .ipCidrRange(&#34;10.2.0.0/28&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .network(customTestNetwork.getId())
 *             .build());
 * 
 *         var connector = new Connector(&#34;connector&#34;, ConnectorArgs.builder()        
 *             .subnet(ConnectorSubnet.builder()
 *                 .name(customTestSubnetwork.getName())
 *                 .build())
 *             .machineType(&#34;e2-standard-4&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Cloudrun VPC Access Connector
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
 *         var vpcaccessApi = new Service(&#34;vpcaccessApi&#34;, ServiceArgs.builder()        
 *             .service(&#34;vpcaccess.googleapis.com&#34;)
 *             .disableOnDestroy(false)
 *             .build());
 * 
 *         var default_ = new Network(&#34;default&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build());
 * 
 *         var connector = new Connector(&#34;connector&#34;, ConnectorArgs.builder()        
 *             .region(&#34;us-west1&#34;)
 *             .ipCidrRange(&#34;10.8.0.0/28&#34;)
 *             .network(default_.getName())
 *             .build());
 * 
 *         var router = new Router(&#34;router&#34;, RouterArgs.builder()        
 *             .region(&#34;us-west1&#34;)
 *             .network(default_.getId())
 *             .build());
 * 
 *         var routerNat = new RouterNat(&#34;routerNat&#34;, RouterNatArgs.builder()        
 *             .region(&#34;us-west1&#34;)
 *             .router(router.getName())
 *             .sourceSubnetworkIpRangesToNat(&#34;ALL_SUBNETWORKS_ALL_IP_RANGES&#34;)
 *             .natIpAllocateOption(&#34;AUTO_ONLY&#34;)
 *             .build());
 * 
 *         var gcrService = new Service(&#34;gcrService&#34;, ServiceArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .template(ServiceTemplate.builder()
 *                 .spec(ServiceTemplateSpec.builder()
 *                     .containers(ServiceTemplateSpecContainer.builder()
 *                         .image(&#34;us-docker.pkg.dev/cloudrun/container/hello&#34;)
 *                         .resources(ServiceTemplateSpecContainerResources.builder()
 *                             .limits(Map.ofEntries(
 *                                 Map.entry(&#34;cpu&#34;, &#34;1000m&#34;),
 *                                 Map.entry(&#34;memory&#34;, &#34;512M&#34;)
 *                             ))
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .metadata(ServiceTemplateMetadata.builder()
 *                     .annotations(Map.ofEntries(
 *                         Map.entry(&#34;autoscaling.knative.dev/maxScale&#34;, &#34;5&#34;),
 *                         Map.entry(&#34;run.googleapis.com/vpc-access-connector&#34;, connector.getName()),
 *                         Map.entry(&#34;run.googleapis.com/vpc-access-egress&#34;, &#34;all&#34;)
 *                     ))
 *                     .build())
 *                 .build())
 *             .autogenerateRevisionName(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Connector can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default projects/{{project}}/locations/{{region}}/connectors/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:vpcaccess/connector:Connector default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:vpcaccess/connector:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    /**
     * The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    @Export(name="ipCidrRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipCidrRange;

    /**
     * @return The range of internal addresses that follows RFC 4632 notation. Example: `10.132.0.0/28`.
     * 
     */
    public Output<Optional<String>> ipCidrRange() {
        return Codegen.optional(this.ipCidrRange);
    }
    /**
     * Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output</* @Nullable */ String> machineType;

    /**
     * @return Machine type of VM Instance underlying connector. Default is e2-micro
     * 
     */
    public Output<Optional<String>> machineType() {
        return Codegen.optional(this.machineType);
    }
    /**
     * Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Export(name="maxInstances", type=Integer.class, parameters={})
    private Output<Integer> maxInstances;

    /**
     * @return Maximum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> maxInstances() {
        return this.maxInstances;
    }
    /**
     * Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    @Export(name="maxThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxThroughput;

    /**
     * @return Maximum throughput of the connector in Mbps, must be greater than `min_throughput`. Default is 300.
     * 
     */
    public Output<Optional<Integer>> maxThroughput() {
        return Codegen.optional(this.maxThroughput);
    }
    /**
     * Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    @Export(name="minInstances", type=Integer.class, parameters={})
    private Output<Integer> minInstances;

    /**
     * @return Minimum value of instances in autoscaling group underlying the connector.
     * 
     */
    public Output<Integer> minInstances() {
        return this.minInstances;
    }
    /**
     * Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    @Export(name="minThroughput", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minThroughput;

    /**
     * @return Minimum throughput of the connector in Mbps. Default and min is 200.
     * 
     */
    public Output<Optional<Integer>> minThroughput() {
        return Codegen.optional(this.minThroughput);
    }
    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}&#34;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    @Export(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return Name or self_link of the VPC network. Required if `ip_cidr_range` is set.
     * 
     */
    public Output<String> network() {
        return this.network;
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
     * Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the VPC Access connector resides. If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The fully qualified name of this VPC connector
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this VPC connector
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * State of the VPC access connector.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the VPC access connector.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    @Export(name="subnet", type=ConnectorSubnet.class, parameters={})
    private Output</* @Nullable */ ConnectorSubnet> subnet;

    /**
     * @return The subnet in which to house the connector
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectorSubnet>> subnet() {
        return Codegen.optional(this.subnet);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, @Nullable ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, @Nullable ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vpcaccess/connector:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:vpcaccess/connector:Connector", name, state, makeResourceOptions(options, id));
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
    public static Connector get(String name, Output<String> id, @Nullable ConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, state, options);
    }
}
