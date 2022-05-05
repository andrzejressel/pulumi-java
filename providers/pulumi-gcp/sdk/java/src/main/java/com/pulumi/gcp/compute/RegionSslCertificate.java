// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionSslCertificateArgs;
import com.pulumi.gcp.compute.inputs.RegionSslCertificateState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A RegionSslCertificate resource, used for HTTPS load balancing. This resource
 * provides a mechanism to upload an SSL key and certificate to
 * the load balancer to serve secure connections from the user.
 * 
 * To get more information about RegionSslCertificate, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionSslCertificates)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/ssl-certificates)
 * 
 * &gt; **Warning:** All arguments including `certificate` and `private_key` will be stored in the raw
 * state as plain-text. [Read more about secrets in state](https://www.pulumi.com/docs/intro/concepts/programming-model/#secrets).
 * 
 * ## Example Usage
 * ### Region Ssl Certificate Basic
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
 *         var default_ = new RegionSslCertificate(&#34;default&#34;, RegionSslCertificateArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .namePrefix(&#34;my-certificate-&#34;)
 *             .description(&#34;a description&#34;)
 *             .privateKey(Files.readString(&#34;path/to/private.key&#34;))
 *             .certificate(Files.readString(&#34;path/to/certificate.crt&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Region Ssl Certificate Random Provider
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
 *         var default_ = new RegionSslCertificate(&#34;default&#34;, RegionSslCertificateArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .privateKey(Files.readString(&#34;path/to/private.key&#34;))
 *             .certificate(Files.readString(&#34;path/to/certificate.crt&#34;))
 *             .build());
 * 
 *         var certificate = new RandomId(&#34;certificate&#34;, RandomIdArgs.builder()        
 *             .byteLength(4)
 *             .prefix(&#34;my-certificate-&#34;)
 *             .keepers(Map.ofEntries(
 *                 Map.entry(&#34;private_key&#34;, computeFileBase64Sha256(&#34;path/to/private.key&#34;)),
 *                 Map.entry(&#34;certificate&#34;, computeFileBase64Sha256(&#34;path/to/certificate.crt&#34;))
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Region Ssl Certificate Target Https Proxies
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
 *         var defaultRegionSslCertificate = new RegionSslCertificate(&#34;defaultRegionSslCertificate&#34;, RegionSslCertificateArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .namePrefix(&#34;my-certificate-&#34;)
 *             .privateKey(Files.readString(&#34;path/to/private.key&#34;))
 *             .certificate(Files.readString(&#34;path/to/certificate.crt&#34;))
 *             .build());
 * 
 *         var defaultRegionHealthCheck = new RegionHealthCheck(&#34;defaultRegionHealthCheck&#34;, RegionHealthCheckArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .httpHealthCheck(RegionHealthCheckHttpHealthCheck.builder()
 *                 .port(80)
 *                 .build())
 *             .build());
 * 
 *         var defaultRegionBackendService = new RegionBackendService(&#34;defaultRegionBackendService&#34;, RegionBackendServiceArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .loadBalancingScheme(&#34;INTERNAL_MANAGED&#34;)
 *             .timeoutSec(10)
 *             .healthChecks(defaultRegionHealthCheck.getId())
 *             .build());
 * 
 *         var defaultRegionUrlMap = new RegionUrlMap(&#34;defaultRegionUrlMap&#34;, RegionUrlMapArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .description(&#34;a description&#34;)
 *             .defaultService(defaultRegionBackendService.getId())
 *             .hostRules(RegionUrlMapHostRule.builder()
 *                 .hosts(&#34;mysite.com&#34;)
 *                 .pathMatcher(&#34;allpaths&#34;)
 *                 .build())
 *             .pathMatchers(RegionUrlMapPathMatcher.builder()
 *                 .name(&#34;allpaths&#34;)
 *                 .defaultService(defaultRegionBackendService.getId())
 *                 .pathRules(RegionUrlMapPathMatcherPathRule.builder()
 *                     .paths(&#34;/*&#34;)
 *                     .service(defaultRegionBackendService.getId())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var defaultRegionTargetHttpsProxy = new RegionTargetHttpsProxy(&#34;defaultRegionTargetHttpsProxy&#34;, RegionTargetHttpsProxyArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .urlMap(defaultRegionUrlMap.getId())
 *             .sslCertificates(defaultRegionSslCertificate.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * RegionSslCertificate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionSslCertificate:RegionSslCertificate default projects/{{project}}/regions/{{region}}/sslCertificates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionSslCertificate:RegionSslCertificate default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionSslCertificate:RegionSslCertificate default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionSslCertificate:RegionSslCertificate default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionSslCertificate:RegionSslCertificate")
public class RegionSslCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The certificate in PEM format.
     * The certificate chain must be no greater than 5 certs long.
     * The chain must include at least one intermediate cert.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The certificate in PEM format.
     * The certificate chain must be no greater than 5 certs long.
     * The chain must include at least one intermediate cert.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * The unique identifier for the resource.
     * 
     */
    @Export(name="certificateId", type=Integer.class, parameters={})
    private Output<Integer> certificateId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Output<Integer> certificateId() {
        return this.certificateId;
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
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the
     * specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The write-only private key in PEM format.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return The write-only private key in PEM format.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
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
     * The Region in which the created regional ssl certificate should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The Region in which the created regional ssl certificate should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    public Output<String> region() {
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
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionSslCertificate(String name) {
        this(name, RegionSslCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionSslCertificate(String name, RegionSslCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionSslCertificate(String name, RegionSslCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionSslCertificate:RegionSslCertificate", name, args == null ? RegionSslCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionSslCertificate(String name, Output<String> id, @Nullable RegionSslCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionSslCertificate:RegionSslCertificate", name, state, makeResourceOptions(options, id));
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
    public static RegionSslCertificate get(String name, Output<String> id, @Nullable RegionSslCertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionSslCertificate(name, id, state, options);
    }
}
