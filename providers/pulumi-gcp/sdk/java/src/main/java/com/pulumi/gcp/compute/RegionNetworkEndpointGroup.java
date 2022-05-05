// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionNetworkEndpointGroupArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkEndpointGroupState;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupAppEngine;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudFunction;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupCloudRun;
import com.pulumi.gcp.compute.outputs.RegionNetworkEndpointGroupServerlessDeployment;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A regional NEG that can support Serverless Products.
 * 
 * To get more information about RegionNetworkEndpointGroup, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/beta/regionNetworkEndpointGroups)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/load-balancing/docs/negs/serverless-neg-concepts)
 * 
 * ## Example Usage
 * ### Region Network Endpoint Group Functions
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
 *         var bucket = new Bucket(&#34;bucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var archive = new BucketObject(&#34;archive&#34;, BucketObjectArgs.builder()        
 *             .bucket(bucket.getName())
 *             .source(new FileAsset(&#34;path/to/index.zip&#34;))
 *             .build());
 * 
 *         var functionNegFunction = new Function(&#34;functionNegFunction&#34;, FunctionArgs.builder()        
 *             .description(&#34;My function&#34;)
 *             .runtime(&#34;nodejs10&#34;)
 *             .availableMemoryMb(128)
 *             .sourceArchiveBucket(bucket.getName())
 *             .sourceArchiveObject(archive.getName())
 *             .triggerHttp(true)
 *             .timeout(60)
 *             .entryPoint(&#34;helloGET&#34;)
 *             .build());
 * 
 *         var functionNegRegionNetworkEndpointGroup = new RegionNetworkEndpointGroup(&#34;functionNegRegionNetworkEndpointGroup&#34;, RegionNetworkEndpointGroupArgs.builder()        
 *             .networkEndpointType(&#34;SERVERLESS&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .cloudFunction(RegionNetworkEndpointGroupCloudFunction.builder()
 *                 .function(functionNegFunction.getName())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Region Network Endpoint Group Cloudrun
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
 *         var cloudrunNegService = new Service(&#34;cloudrunNegService&#34;, ServiceArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .template(ServiceTemplate.builder()
 *                 .spec(ServiceTemplateSpec.builder()
 *                     .containers(ServiceTemplateSpecContainer.builder()
 *                         .image(&#34;us-docker.pkg.dev/cloudrun/container/hello&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .traffics(ServiceTraffic.builder()
 *                 .percent(100)
 *                 .latestRevision(true)
 *                 .build())
 *             .build());
 * 
 *         var cloudrunNegRegionNetworkEndpointGroup = new RegionNetworkEndpointGroup(&#34;cloudrunNegRegionNetworkEndpointGroup&#34;, RegionNetworkEndpointGroupArgs.builder()        
 *             .networkEndpointType(&#34;SERVERLESS&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .cloudRun(RegionNetworkEndpointGroupCloudRun.builder()
 *                 .service(cloudrunNegService.getName())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Region Network Endpoint Group Appengine
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
 *         var appengineNegBucket = new Bucket(&#34;appengineNegBucket&#34;, BucketArgs.builder()        
 *             .location(&#34;US&#34;)
 *             .build());
 * 
 *         var appengineNegBucketObject = new BucketObject(&#34;appengineNegBucketObject&#34;, BucketObjectArgs.builder()        
 *             .bucket(appengineNegBucket.getName())
 *             .source(new FileAsset(&#34;./test-fixtures/appengine/hello-world.zip&#34;))
 *             .build());
 * 
 *         var appengineNegFlexibleAppVersion = new FlexibleAppVersion(&#34;appengineNegFlexibleAppVersion&#34;, FlexibleAppVersionArgs.builder()        
 *             .versionId(&#34;v1&#34;)
 *             .service(&#34;appengine-network-endpoint-group&#34;)
 *             .runtime(&#34;nodejs&#34;)
 *             .entrypoint(FlexibleAppVersionEntrypoint.builder()
 *                 .shell(&#34;node ./app.js&#34;)
 *                 .build())
 *             .deployment(FlexibleAppVersionDeployment.builder()
 *                 .zip(FlexibleAppVersionDeploymentZip.builder()
 *                     .sourceUrl(Output.tuple(appengineNegBucket.getName(), appengineNegBucketObject.getName()).apply(values -&gt; {
 *                         var appengineNegBucketName = values.t1;
 *                         var appengineNegBucketObjectName = values.t2;
 *                         return String.format(&#34;https://storage.googleapis.com/%s/%s&#34;, appengineNegBucketName,appengineNegBucketObjectName);
 *                     }))
 *                     .build())
 *                 .build())
 *             .livenessCheck(FlexibleAppVersionLivenessCheck.builder()
 *                 .path(&#34;/&#34;)
 *                 .build())
 *             .readinessCheck(FlexibleAppVersionReadinessCheck.builder()
 *                 .path(&#34;/&#34;)
 *                 .build())
 *             .envVariables(Map.of(&#34;port&#34;, &#34;8080&#34;))
 *             .handlers(FlexibleAppVersionHandler.builder()
 *                 .urlRegex(&#34;.*\\/my-path\\/*&#34;)
 *                 .securityLevel(&#34;SECURE_ALWAYS&#34;)
 *                 .login(&#34;LOGIN_REQUIRED&#34;)
 *                 .authFailAction(&#34;AUTH_FAIL_ACTION_REDIRECT&#34;)
 *                 .staticFiles(FlexibleAppVersionHandlerStaticFiles.builder()
 *                     .path(&#34;my-other-path&#34;)
 *                     .uploadPathRegex(&#34;.*\\/my-path\\/*&#34;)
 *                     .build())
 *                 .build())
 *             .automaticScaling(FlexibleAppVersionAutomaticScaling.builder()
 *                 .coolDownPeriod(&#34;120s&#34;)
 *                 .cpuUtilization(FlexibleAppVersionAutomaticScalingCpuUtilization.builder()
 *                     .targetUtilization(0.5)
 *                     .build())
 *                 .build())
 *             .noopOnDestroy(true)
 *             .build());
 * 
 *         var appengineNegRegionNetworkEndpointGroup = new RegionNetworkEndpointGroup(&#34;appengineNegRegionNetworkEndpointGroup&#34;, RegionNetworkEndpointGroupArgs.builder()        
 *             .networkEndpointType(&#34;SERVERLESS&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .appEngine(RegionNetworkEndpointGroupAppEngine.builder()
 *                 .service(appengineNegFlexibleAppVersion.getService())
 *                 .version(appengineNegFlexibleAppVersion.getVersionId())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * RegionNetworkEndpointGroup can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default projects/{{project}}/regions/{{region}}/networkEndpointGroups/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup")
public class RegionNetworkEndpointGroup extends com.pulumi.resources.CustomResource {
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="appEngine", type=RegionNetworkEndpointGroupAppEngine.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupAppEngine> appEngine;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupAppEngine>> appEngine() {
        return Codegen.optional(this.appEngine);
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudFunction", type=RegionNetworkEndpointGroupCloudFunction.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudFunction> cloudFunction;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupCloudFunction>> cloudFunction() {
        return Codegen.optional(this.cloudFunction);
    }
    /**
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    @Export(name="cloudRun", type=RegionNetworkEndpointGroupCloudRun.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupCloudRun> cloudRun;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;.
     * Only one of cloud_run, app_engine, cloud_function or serverless_deployment may be set.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupCloudRun>> cloudRun() {
        return Codegen.optional(this.cloudRun);
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
     * Name of the resource; provided by the client when the resource is
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
     * @return Name of the resource; provided by the client when the resource is
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
     * Type of network endpoints in this network endpoint group. Defaults to SERVERLESS
     * Default value is `SERVERLESS`.
     * Possible values are `SERVERLESS`.
     * 
     */
    @Export(name="networkEndpointType", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkEndpointType;

    /**
     * @return Type of network endpoints in this network endpoint group. Defaults to SERVERLESS
     * Default value is `SERVERLESS`.
     * Possible values are `SERVERLESS`.
     * 
     */
    public Output<Optional<String>> networkEndpointType() {
        return Codegen.optional(this.networkEndpointType);
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
     * A reference to the region where the Serverless NEGs Reside.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return A reference to the region where the Serverless NEGs Reside.
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
     * Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or
     * serverlessDeployment may be set.
     * 
     */
    @Export(name="serverlessDeployment", type=RegionNetworkEndpointGroupServerlessDeployment.class, parameters={})
    private Output</* @Nullable */ RegionNetworkEndpointGroupServerlessDeployment> serverlessDeployment;

    /**
     * @return Only valid when networkEndpointType is &#34;SERVERLESS&#34;. Only one of cloudRun, appEngine, cloudFunction or
     * serverlessDeployment may be set.
     * 
     */
    public Output<Optional<RegionNetworkEndpointGroupServerlessDeployment>> serverlessDeployment() {
        return Codegen.optional(this.serverlessDeployment);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkEndpointGroup(String name) {
        this(name, RegionNetworkEndpointGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkEndpointGroup(String name, RegionNetworkEndpointGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkEndpointGroup(String name, RegionNetworkEndpointGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, args == null ? RegionNetworkEndpointGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionNetworkEndpointGroup(String name, Output<String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkEndpointGroup:RegionNetworkEndpointGroup", name, state, makeResourceOptions(options, id));
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
    public static RegionNetworkEndpointGroup get(String name, Output<String> id, @Nullable RegionNetworkEndpointGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkEndpointGroup(name, id, state, options);
    }
}
