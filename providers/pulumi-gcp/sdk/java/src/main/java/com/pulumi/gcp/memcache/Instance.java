// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.memcache.InstanceArgs;
import com.pulumi.gcp.memcache.inputs.InstanceState;
import com.pulumi.gcp.memcache.outputs.InstanceMemcacheNode;
import com.pulumi.gcp.memcache.outputs.InstanceMemcacheParameters;
import com.pulumi.gcp.memcache.outputs.InstanceNodeConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Google Cloud Memcache instance.
 * 
 * To get more information about Instance, see:
 * 
 * * [API documentation](https://cloud.google.com/memorystore/docs/memcached/reference/rest/v1/projects.locations.instances)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/memcache/docs/creating-instances)
 * 
 * ## Example Usage
 * ### Memcache Instance Basic
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
 *         final var memcacheNetwork = Output.of(ComputeFunctions.getNetwork(GetNetworkArgs.builder()
 *             .name(&#34;test-network&#34;)
 *             .build()));
 * 
 *         var serviceRange = new GlobalAddress(&#34;serviceRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(memcacheNetwork.apply(getNetworkResult -&gt; getNetworkResult.getId()))
 *             .build());
 * 
 *         var privateServiceConnection = new Connection(&#34;privateServiceConnection&#34;, ConnectionArgs.builder()        
 *             .network(memcacheNetwork.apply(getNetworkResult -&gt; getNetworkResult.getId()))
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(serviceRange.getName())
 *             .build());
 * 
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .authorizedNetwork(privateServiceConnection.getNetwork())
 *             .nodeConfig(InstanceNodeConfig.builder()
 *                 .cpuCount(1)
 *                 .memorySizeMb(1024)
 *                 .build())
 *             .nodeCount(1)
 *             .memcacheVersion(&#34;MEMCACHE_1_5&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Instance can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:memcache/instance:Instance default projects/{{project}}/locations/{{region}}/instances/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:memcache/instance:Instance default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:memcache/instance:Instance default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:memcache/instance:Instance default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:memcache/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * The full name of the GCE network to connect the instance to.  If not provided,
     * &#39;default&#39; will be used.
     * 
     */
    @Export(name="authorizedNetwork", type=String.class, parameters={})
    private Output<String> authorizedNetwork;

    /**
     * @return The full name of the GCE network to connect the instance to.  If not provided,
     * &#39;default&#39; will be used.
     * 
     */
    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Endpoint for Discovery API
     * 
     */
    @Export(name="discoveryEndpoint", type=String.class, parameters={})
    private Output<String> discoveryEndpoint;

    /**
     * @return Endpoint for Discovery API
     * 
     */
    public Output<String> discoveryEndpoint() {
        return this.discoveryEndpoint;
    }
    /**
     * A user-visible name for the instance.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-visible name for the instance.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user-provided metadata.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The full version of memcached server running on this instance.
     * 
     */
    @Export(name="memcacheFullVersion", type=String.class, parameters={})
    private Output<String> memcacheFullVersion;

    /**
     * @return The full version of memcached server running on this instance.
     * 
     */
    public Output<String> memcacheFullVersion() {
        return this.memcacheFullVersion;
    }
    /**
     * Additional information about the instance state, if available.
     * 
     */
    @Export(name="memcacheNodes", type=List.class, parameters={InstanceMemcacheNode.class})
    private Output<List<InstanceMemcacheNode>> memcacheNodes;

    /**
     * @return Additional information about the instance state, if available.
     * 
     */
    public Output<List<InstanceMemcacheNode>> memcacheNodes() {
        return this.memcacheNodes;
    }
    /**
     * User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    @Export(name="memcacheParameters", type=InstanceMemcacheParameters.class, parameters={})
    private Output</* @Nullable */ InstanceMemcacheParameters> memcacheParameters;

    /**
     * @return User-specified parameters for this memcache instance.
     * Structure is documented below.
     * 
     */
    public Output<Optional<InstanceMemcacheParameters>> memcacheParameters() {
        return Codegen.optional(this.memcacheParameters);
    }
    /**
     * The major version of Memcached software. If not provided, latest supported version will be used.
     * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
     * determined by our system based on the latest supported minor version.
     * Default value is `MEMCACHE_1_5`.
     * Possible values are `MEMCACHE_1_5`.
     * 
     */
    @Export(name="memcacheVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> memcacheVersion;

    /**
     * @return The major version of Memcached software. If not provided, latest supported version will be used.
     * Currently the latest supported major version is MEMCACHE_1_5. The minor version will be automatically
     * determined by our system based on the latest supported minor version.
     * Default value is `MEMCACHE_1_5`.
     * Possible values are `MEMCACHE_1_5`.
     * 
     */
    public Output<Optional<String>> memcacheVersion() {
        return Codegen.optional(this.memcacheVersion);
    }
    /**
     * The resource name of the instance.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    @Export(name="nodeConfig", type=InstanceNodeConfig.class, parameters={})
    private Output<InstanceNodeConfig> nodeConfig;

    /**
     * @return Configuration for memcache nodes.
     * Structure is documented below.
     * 
     */
    public Output<InstanceNodeConfig> nodeConfig() {
        return this.nodeConfig;
    }
    /**
     * Number of nodes in the memcache instance.
     * 
     */
    @Export(name="nodeCount", type=Integer.class, parameters={})
    private Output<Integer> nodeCount;

    /**
     * @return Number of nodes in the memcache instance.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
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
     * The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region of the Memcache instance. If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return Zones where memcache nodes should be provisioned.  If not
     * provided, all zones will be used.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:memcache/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:memcache/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
