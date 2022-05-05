// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.HttpHealthCheckArgs;
import com.pulumi.gcp.compute.inputs.HttpHealthCheckState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An HttpHealthCheck resource. This resource defines a template for how
 * individual VMs should be checked for health, via HTTP.
 * 
 * &gt; **Note:** gcp.compute.HttpHealthCheck is a legacy health check.
 * The newer [gcp.compute.HealthCheck](https://www.terraform.io/docs/providers/google/r/compute_health_check.html)
 * should be preferred for all uses except
 * [Network Load Balancers](https://cloud.google.com/compute/docs/load-balancing/network/)
 * which still require the legacy version.
 * 
 * To get more information about HttpHealthCheck, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/httpHealthChecks)
 * * How-to Guides
 *     * [Adding Health Checks](https://cloud.google.com/compute/docs/load-balancing/health-checks#legacy_health_checks)
 * 
 * ## Example Usage
 * ### Http Health Check Basic
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
 *         var default_ = new HttpHealthCheck(&#34;default&#34;, HttpHealthCheckArgs.builder()        
 *             .checkIntervalSec(1)
 *             .requestPath(&#34;/health_check&#34;)
 *             .timeoutSec(1)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * HttpHealthCheck can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/httpHealthCheck:HttpHealthCheck default projects/{{project}}/global/httpHealthChecks/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/httpHealthCheck:HttpHealthCheck default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/httpHealthCheck:HttpHealthCheck default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/httpHealthCheck:HttpHealthCheck")
public class HttpHealthCheck extends com.pulumi.resources.CustomResource {
    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @Export(name="checkIntervalSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    public Output<Optional<Integer>> checkIntervalSec() {
        return Codegen.optional(this.checkIntervalSec);
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
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @Export(name="healthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    public Output<Optional<Integer>> healthyThreshold() {
        return Codegen.optional(this.healthyThreshold);
    }
    /**
     * The value of the host header in the HTTP health check request. If
     * left empty (default value), the public IP on behalf of which this
     * health check is performed will be used.
     * 
     */
    @Export(name="host", type=String.class, parameters={})
    private Output</* @Nullable */ String> host;

    /**
     * @return The value of the host header in the HTTP health check request. If
     * left empty (default value), the public IP on behalf of which this
     * health check is performed will be used.
     * 
     */
    public Output<Optional<String>> host() {
        return Codegen.optional(this.host);
    }
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The TCP port number for the HTTP health check request.
     * The default value is 80.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The TCP port number for the HTTP health check request.
     * The default value is 80.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
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
     * The request path of the HTTP health check request.
     * The default value is /.
     * 
     */
    @Export(name="requestPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestPath;

    /**
     * @return The request path of the HTTP health check request.
     * The default value is /.
     * 
     */
    public Output<Optional<String>> requestPath() {
        return Codegen.optional(this.requestPath);
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
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @Export(name="timeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    public Output<Optional<Integer>> timeoutSec() {
        return Codegen.optional(this.timeoutSec);
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @Export(name="unhealthyThreshold", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    public Output<Optional<Integer>> unhealthyThreshold() {
        return Codegen.optional(this.unhealthyThreshold);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpHealthCheck(String name) {
        this(name, HttpHealthCheckArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpHealthCheck(String name, @Nullable HttpHealthCheckArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpHealthCheck(String name, @Nullable HttpHealthCheckArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/httpHealthCheck:HttpHealthCheck", name, args == null ? HttpHealthCheckArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HttpHealthCheck(String name, Output<String> id, @Nullable HttpHealthCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/httpHealthCheck:HttpHealthCheck", name, state, makeResourceOptions(options, id));
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
    public static HttpHealthCheck get(String name, Output<String> id, @Nullable HttpHealthCheckState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpHealthCheck(name, id, state, options);
    }
}
