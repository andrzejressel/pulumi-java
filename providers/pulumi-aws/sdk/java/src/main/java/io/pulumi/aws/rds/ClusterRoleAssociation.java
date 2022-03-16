// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ClusterRoleAssociationArgs;
import io.pulumi.aws.rds.inputs.ClusterRoleAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a RDS DB Cluster association with an IAM Role. Example use cases:
 * 
 * * [Creating an IAM Role to Allow Amazon Aurora to Access AWS Services](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Integrating.Authorizing.IAM.CreateRole.html)
 * * [Importing Amazon S3 Data into an RDS PostgreSQL DB Cluster](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PostgreSQL.S3Import.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_rds_cluster_role_association` can be imported using the DB Cluster Identifier and IAM Role ARN separated by a comma (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterRoleAssociation:ClusterRoleAssociation example my-db-cluster,arn:aws:iam::123456789012:role/my-role
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterRoleAssociation:ClusterRoleAssociation")
public class ClusterRoleAssociation extends io.pulumi.resources.CustomResource {
    /**
     * DB Cluster Identifier to associate with the IAM Role.
     * 
     */
    @Export(name="dbClusterIdentifier", type=String.class, parameters={})
    private Output<String> dbClusterIdentifier;

    /**
     * @return DB Cluster Identifier to associate with the IAM Role.
     * 
     */
    public Output<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     * 
     */
    @Export(name="featureName", type=String.class, parameters={})
    private Output<String> featureName;

    /**
     * @return Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     * 
     */
    public Output<String> getFeatureName() {
        return this.featureName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     * 
     */
    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    public interface BuilderApplicator {
        public void apply(ClusterRoleAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.rds.ClusterRoleAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.rds.ClusterRoleAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterRoleAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterRoleAssociation(String name) {
        this(name, ClusterRoleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterRoleAssociation(String name, ClusterRoleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterRoleAssociation(String name, ClusterRoleAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterRoleAssociation:ClusterRoleAssociation", name, args == null ? ClusterRoleAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterRoleAssociation(String name, Output<String> id, @Nullable ClusterRoleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterRoleAssociation:ClusterRoleAssociation", name, state, makeResourceOptions(options, id));
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
    public static ClusterRoleAssociation get(String name, Output<String> id, @Nullable ClusterRoleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterRoleAssociation(name, id, state, options);
    }
}
