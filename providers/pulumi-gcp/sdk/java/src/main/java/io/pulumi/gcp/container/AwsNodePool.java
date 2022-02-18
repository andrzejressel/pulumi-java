// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.container.AwsNodePoolArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolState;
import io.pulumi.gcp.container.outputs.AwsNodePoolAutoscaling;
import io.pulumi.gcp.container.outputs.AwsNodePoolConfig;
import io.pulumi.gcp.container.outputs.AwsNodePoolMaxPodsConstraint;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An Anthos node pool running on AWS.
 * 
 * For more information, see:
 * * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
 * ## Example Usage
 * 
 * ## Import
 * 
 * NodePool can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:container/awsNodePool:AwsNodePool default projects/{{project}}/locations/{{location}}/awsClusters/{{cluster}}/awsNodePools/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/awsNodePool:AwsNodePool default {{project}}/{{location}}/{{cluster}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/awsNodePool:AwsNodePool default {{location}}/{{cluster}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:container/awsNodePool:AwsNodePool")
public class AwsNodePool extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @OutputExport(name="annotations", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Optional. Annotations on the node pool. This field has the same restrictions as Kubernetes annotations. The total size of all keys and values combined is limited to 256k. Key can have 2 segments: prefix (optional) and name (required), separated by a slash (/). Prefix must be a DNS subdomain. Name must be 63 characters or less, begin and end with alphanumerics, with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getAnnotations() {
        return this.annotations;
    }
    /**
     * Required. Autoscaler configuration for this node pool.
     * 
     */
    @OutputExport(name="autoscaling", type=AwsNodePoolAutoscaling.class, parameters={})
    private Output<AwsNodePoolAutoscaling> autoscaling;

    /**
     * @return Required. Autoscaler configuration for this node pool.
     * 
     */
    public Output<AwsNodePoolAutoscaling> getAutoscaling() {
        return this.autoscaling;
    }
    /**
     * The awsCluster for the resource
     * 
     */
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The awsCluster for the resource
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    /**
     * Required. The configuration of the node pool.
     * 
     */
    @OutputExport(name="config", type=AwsNodePoolConfig.class, parameters={})
    private Output<AwsNodePoolConfig> config;

    /**
     * @return Required. The configuration of the node pool.
     * 
     */
    public Output<AwsNodePoolConfig> getConfig() {
        return this.config;
    }
    /**
     * Output only. The time at which this node pool was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time at which this node pool was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Allows clients to perform consistent read-modify-writes through optimistic concurrency control. May be sent on update
     * and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The location for the resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    @OutputExport(name="maxPodsConstraint", type=AwsNodePoolMaxPodsConstraint.class, parameters={})
    private Output<AwsNodePoolMaxPodsConstraint> maxPodsConstraint;

    /**
     * @return Required. The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * 
     */
    public Output<AwsNodePoolMaxPodsConstraint> getMaxPodsConstraint() {
        return this.maxPodsConstraint;
    }
    /**
     * The name of this resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Output only. If set, there are currently changes in flight to the node pool.
     * 
     */
    @OutputExport(name="reconciling", type=Boolean.class, parameters={})
    private Output<Boolean> reconciling;

    /**
     * @return Output only. If set, there are currently changes in flight to the node pool.
     * 
     */
    public Output<Boolean> getReconciling() {
        return this.reconciling;
    }
    /**
     * Output only. The lifecycle state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING,
     * RECONCILING, STOPPING, ERROR, DEGRADED
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Output only. The lifecycle state of the node pool. Possible values: STATE_UNSPECIFIED, PROVISIONING, RUNNING,
     * RECONCILING, STOPPING, ERROR, DEGRADED
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Required. The subnet where the node pool node run.
     * 
     */
    @OutputExport(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return Required. The subnet where the node pool node run.
     * 
     */
    public Output<String> getSubnetId() {
        return this.subnetId;
    }
    /**
     * Output only. A globally unique identifier for the node pool.
     * 
     */
    @OutputExport(name="uid", type=String.class, parameters={})
    private Output<String> uid;

    /**
     * @return Output only. A globally unique identifier for the node pool.
     * 
     */
    public Output<String> getUid() {
        return this.uid;
    }
    /**
     * Output only. The time at which this node pool was last updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time at which this node pool was last updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * Required. The Kubernetes version to run on this node pool (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAwsServerConfig.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Required. The Kubernetes version to run on this node pool (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAwsServerConfig.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsNodePool(String name, AwsNodePoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/awsNodePool:AwsNodePool", name, args == null ? AwsNodePoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AwsNodePool(String name, Input<String> id, @Nullable AwsNodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/awsNodePool:AwsNodePool", name, state, makeResourceOptions(options, id));
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
    public static AwsNodePool get(String name, Input<String> id, @Nullable AwsNodePoolState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AwsNodePool(name, id, state, options);
    }
}
