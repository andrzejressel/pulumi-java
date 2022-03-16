// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.memorydb.ClusterArgs;
import io.pulumi.aws.memorydb.inputs.ClusterState;
import io.pulumi.aws.memorydb.outputs.ClusterClusterEndpoint;
import io.pulumi.aws.memorydb.outputs.ClusterShard;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a MemoryDB Cluster.
 * 
 * More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Use the `name` to import a cluster. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/cluster:Cluster example my-cluster
 * ```
 * 
 */
@ResourceType(type="aws:memorydb/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Access Control List to associate with the cluster.
     * 
     */
    @Export(name="aclName", type=String.class, parameters={})
    private Output<String> aclName;

    /**
     * @return The name of the Access Control List to associate with the cluster.
     * 
     */
    public Output<String> getAclName() {
        return this.aclName;
    }
    /**
     * The ARN of the cluster.
     * * `cluster_endpoint`
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the cluster.
     * * `cluster_endpoint`
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    @Export(name="clusterEndpoints", type=List.class, parameters={ClusterClusterEndpoint.class})
    private Output<List<ClusterClusterEndpoint>> clusterEndpoints;

    public Output<List<ClusterClusterEndpoint>> getClusterEndpoints() {
        return this.clusterEndpoints;
    }
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Patch version number of the Redis engine used by the cluster.
     * 
     */
    @Export(name="enginePatchVersion", type=String.class, parameters={})
    private Output<String> enginePatchVersion;

    /**
     * @return Patch version number of the Redis engine used by the cluster.
     * 
     */
    public Output<String> getEnginePatchVersion() {
        return this.enginePatchVersion;
    }
    /**
     * Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Export(name="finalSnapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotName;

    /**
     * @return Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
     * 
     */
    public Output</* @Nullable */ String> getFinalSnapshotName() {
        return this.finalSnapshotName;
    }
    /**
     * ARN of the KMS key used to encrypt the cluster at rest.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyArn;

    /**
     * @return ARN of the KMS key used to encrypt the cluster at rest.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
     * 
     */
    @Export(name="maintenanceWindow", type=String.class, parameters={})
    private Output<String> maintenanceWindow;

    /**
     * @return Specifies the weekly time range during which maintenance on the cluster is performed. It is specified as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
     * 
     */
    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * Name of this node.
     * * `endpoint`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this node.
     * * `endpoint`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
     * 
     */
    @Export(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
     * 
     */
    @Export(name="numReplicasPerShard", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numReplicasPerShard;

    /**
     * @return The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
     * 
     */
    public Output</* @Nullable */ Integer> getNumReplicasPerShard() {
        return this.numReplicasPerShard;
    }
    /**
     * The number of shards in the cluster. Defaults to `1`.
     * 
     */
    @Export(name="numShards", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numShards;

    /**
     * @return The number of shards in the cluster. Defaults to `1`.
     * 
     */
    public Output</* @Nullable */ Integer> getNumShards() {
        return this.numShards;
    }
    /**
     * The name of the parameter group associated with the cluster.
     * 
     */
    @Export(name="parameterGroupName", type=String.class, parameters={})
    private Output<String> parameterGroupName;

    /**
     * @return The name of the parameter group associated with the cluster.
     * 
     */
    public Output<String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port number on which each of the nodes accepts connections. Defaults to `6379`.
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * Set of VPC Security Group ID-s to associate with this cluster.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return Set of VPC Security Group ID-s to associate with this cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Set of shards in this cluster.
     * 
     */
    @Export(name="shards", type=List.class, parameters={ClusterShard.class})
    private Output<List<ClusterShard>> shards;

    /**
     * @return Set of shards in this cluster.
     * 
     */
    public Output<List<ClusterShard>> getShards() {
        return this.shards;
    }
    /**
     * List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
     * 
     */
    @Export(name="snapshotArns", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotArns;

    /**
     * @return List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotArns() {
        return this.snapshotArns;
    }
    /**
     * The name of a snapshot from which to restore data into the new cluster.
     * 
     */
    @Export(name="snapshotName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotName;

    /**
     * @return The name of a snapshot from which to restore data into the new cluster.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotName() {
        return this.snapshotName;
    }
    /**
     * The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
     * 
     */
    @Export(name="snapshotRetentionLimit", type=Integer.class, parameters={})
    private Output<Integer> snapshotRetentionLimit;

    /**
     * @return The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
     * 
     */
    public Output<Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
     * 
     */
    @Export(name="snapshotWindow", type=String.class, parameters={})
    private Output<String> snapshotWindow;

    /**
     * @return The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
     * 
     */
    public Output<String> getSnapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * ARN of the SNS topic to which cluster notifications are sent.
     * 
     */
    @Export(name="snsTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> snsTopicArn;

    /**
     * @return ARN of the SNS topic to which cluster notifications are sent.
     * 
     */
    public Output</* @Nullable */ String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
     * 
     */
    @Export(name="subnetGroupName", type=String.class, parameters={})
    private Output<String> subnetGroupName;

    /**
     * @return The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
     * 
     */
    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * A flag to enable in-transit encryption on the cluster. When set to `false`, the `acl_name` must be `open-access`. Defaults to `true`.
     * 
     */
    @Export(name="tlsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tlsEnabled;

    /**
     * @return A flag to enable in-transit encryption on the cluster. When set to `false`, the `acl_name` must be `open-access`. Defaults to `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getTlsEnabled() {
        return this.tlsEnabled;
    }

    public interface BuilderApplicator {
        public void apply(ClusterArgs.Builder a);
    }
    private static io.pulumi.aws.memorydb.ClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.memorydb.ClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
