// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionTargetHttpsProxyArgs;
import io.pulumi.gcp.compute.inputs.RegionTargetHttpsProxyState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a RegionTargetHttpsProxy resource, which is used by one or more
 * forwarding rules to route incoming HTTPS requests to a URL map.
 * 
 * To get more information about RegionTargetHttpsProxy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionTargetHttpsProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RegionTargetHttpsProxy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default projects/{{project}}/regions/{{region}}/targetHttpsProxies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy")
public class RegionTargetHttpsProxy extends io.pulumi.resources.CustomResource {
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
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
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
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="proxyId", type=Integer.class, parameters={})
    private Output<Integer> proxyId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> getProxyId() {
        return this.proxyId;
    }
    /**
     * The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the created target https proxy should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    @Export(name="sslCertificates", type=List.class, parameters={String.class})
    private Output<List<String>> sslCertificates;

    /**
     * @return A list of RegionSslCertificate resources that are used to authenticate
     * connections between users and the load balancer. Currently, exactly
     * one SSL certificate must be specified.
     * 
     */
    public Output<List<String>> getSslCertificates() {
        return this.sslCertificates;
    }
    /**
     * A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    @Export(name="urlMap", type=String.class, parameters={})
    private Output<String> urlMap;

    /**
     * @return A reference to the RegionUrlMap resource that defines the mapping from URL
     * to the RegionBackendService.
     * 
     */
    public Output<String> getUrlMap() {
        return this.urlMap;
    }

    public interface BuilderApplicator {
        public void apply(RegionTargetHttpsProxyArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.RegionTargetHttpsProxyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.RegionTargetHttpsProxyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionTargetHttpsProxy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionTargetHttpsProxy(String name) {
        this(name, RegionTargetHttpsProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionTargetHttpsProxy(String name, RegionTargetHttpsProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionTargetHttpsProxy(String name, RegionTargetHttpsProxyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy", name, args == null ? RegionTargetHttpsProxyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionTargetHttpsProxy(String name, Output<String> id, @Nullable RegionTargetHttpsProxyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy", name, state, makeResourceOptions(options, id));
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
    public static RegionTargetHttpsProxy get(String name, Output<String> id, @Nullable RegionTargetHttpsProxyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionTargetHttpsProxy(name, id, state, options);
    }
}
