// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataproc.AutoscalingPolicyArgs;
import com.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState;
import com.pulumi.gcp.dataproc.outputs.AutoscalingPolicyBasicAlgorithm;
import com.pulumi.gcp.dataproc.outputs.AutoscalingPolicySecondaryWorkerConfig;
import com.pulumi.gcp.dataproc.outputs.AutoscalingPolicyWorkerConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes an autoscaling policy for Dataproc cluster autoscaler.
 * 
 * ## Example Usage
 * ### Dataproc Autoscaling Policy
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
 *         var asp = new AutoscalingPolicy(&#34;asp&#34;, AutoscalingPolicyArgs.builder()        
 *             .policyId(&#34;dataproc-policy&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .workerConfig(AutoscalingPolicyWorkerConfig.builder()
 *                 .maxInstances(3)
 *                 .build())
 *             .basicAlgorithm(AutoscalingPolicyBasicAlgorithm.builder()
 *                 .yarnConfig(AutoscalingPolicyBasicAlgorithmYarnConfig.builder()
 *                     .gracefulDecommissionTimeout(&#34;30s&#34;)
 *                     .scaleUpFactor(0.5)
 *                     .scaleDownFactor(0.5)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var basic = new Cluster(&#34;basic&#34;, ClusterArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .clusterConfig(ClusterClusterConfig.builder()
 *                 .autoscalingConfig(ClusterClusterConfigAutoscalingConfig.builder()
 *                     .policyUri(asp.getName())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AutoscalingPolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default {{project}}/{{location}}/{{policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default {{location}}/{{policy_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/autoscalingPolicy:AutoscalingPolicy")
public class AutoscalingPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Basic algorithm for autoscaling.
     * Structure is documented below.
     * 
     */
    @Export(name="basicAlgorithm", type=AutoscalingPolicyBasicAlgorithm.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicyBasicAlgorithm> basicAlgorithm;

    /**
     * @return Basic algorithm for autoscaling.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AutoscalingPolicyBasicAlgorithm>> basicAlgorithm() {
        return Codegen.optional(this.basicAlgorithm);
    }
    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The &#34;resource name&#34; of the autoscaling policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The &#34;resource name&#34; of the autoscaling policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The policy id. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 50 characters.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The policy id. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 50 characters.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
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
     * Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * 
     */
    @Export(name="secondaryWorkerConfig", type=AutoscalingPolicySecondaryWorkerConfig.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicySecondaryWorkerConfig> secondaryWorkerConfig;

    /**
     * @return Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AutoscalingPolicySecondaryWorkerConfig>> secondaryWorkerConfig() {
        return Codegen.optional(this.secondaryWorkerConfig);
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * 
     */
    @Export(name="workerConfig", type=AutoscalingPolicyWorkerConfig.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicyWorkerConfig> workerConfig;

    /**
     * @return Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AutoscalingPolicyWorkerConfig>> workerConfig() {
        return Codegen.optional(this.workerConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscalingPolicy(String name) {
        this(name, AutoscalingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/autoscalingPolicy:AutoscalingPolicy", name, args == null ? AutoscalingPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AutoscalingPolicy(String name, Output<String> id, @Nullable AutoscalingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/autoscalingPolicy:AutoscalingPolicy", name, state, makeResourceOptions(options, id));
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
    public static AutoscalingPolicy get(String name, Output<String> id, @Nullable AutoscalingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingPolicy(name, id, state, options);
    }
}
