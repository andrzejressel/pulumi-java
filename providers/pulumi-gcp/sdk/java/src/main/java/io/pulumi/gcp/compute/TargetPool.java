// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.TargetPoolArgs;
import io.pulumi.gcp.compute.inputs.TargetPoolState;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Target Pool within GCE. This is a collection of instances used as
 * target of a network load balancer (Forwarding Rule). For more information see
 * [the official
 * documentation](https://cloud.google.com/compute/docs/load-balancing/network/target-pools)
 * and [API](https://cloud.google.com/compute/docs/reference/latest/targetPools).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Target pools can be imported using any of the following formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetPool:TargetPool default projects/{{project}}/regions/{{region}}/targetPools/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetPool:TargetPool default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetPool:TargetPool default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/targetPool:TargetPool default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/targetPool:TargetPool")
public class TargetPool extends io.pulumi.resources.CustomResource {
    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     * 
     */
    @OutputExport(name="backupPool", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupPool;

    /**
     * @return URL to the backup target pool. Must also set
     * failover\_ratio.
     * 
     */
    public Output</* @Nullable */ String> getBackupPool() {
        return this.backupPool;
    }
    /**
     * Textual description field.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Textual description field.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     * 
     */
    @OutputExport(name="failoverRatio", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> failoverRatio;

    /**
     * @return Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     * 
     */
    public Output</* @Nullable */ Double> getFailoverRatio() {
        return this.failoverRatio;
    }
    /**
     * List of zero or one health check name or self_link. Only
     * legacy `gcp.compute.HttpHealthCheck` is supported.
     * 
     */
    @OutputExport(name="healthChecks", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthChecks;

    /**
     * @return List of zero or one health check name or self_link. Only
     * legacy `gcp.compute.HttpHealthCheck` is supported.
     * 
     */
    public Output</* @Nullable */ String> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * interpolation to create a dependency on the instances from the
     * target pool.
     * 
     */
    @OutputExport(name="instances", type=List.class, parameters={String.class})
    private Output<List<String>> instances;

    /**
     * @return List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * interpolation to create a dependency on the instances from the
     * target pool.
     * 
     */
    public Output<List<String>> getInstances() {
        return this.instances;
    }
    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Where the target pool resides. Defaults to project
     * region.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Where the target pool resides. Defaults to project
     * region.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     * 
     */
    @OutputExport(name="sessionAffinity", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionAffinity;

    /**
     * @return How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     * 
     */
    public Output</* @Nullable */ String> getSessionAffinity() {
        return this.sessionAffinity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetPool(String name, @Nullable TargetPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetPool:TargetPool", name, args == null ? TargetPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TargetPool(String name, Input<String> id, @Nullable TargetPoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/targetPool:TargetPool", name, state, makeResourceOptions(options, id));
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
    public static TargetPool get(String name, Input<String> id, @Nullable TargetPoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TargetPool(name, id, state, options);
    }
}
