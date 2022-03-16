// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.appsync.DataSourceArgs;
import io.pulumi.aws.appsync.inputs.DataSourceState;
import io.pulumi.aws.appsync.outputs.DataSourceDynamodbConfig;
import io.pulumi.aws.appsync.outputs.DataSourceElasticsearchConfig;
import io.pulumi.aws.appsync.outputs.DataSourceHttpConfig;
import io.pulumi.aws.appsync.outputs.DataSourceLambdaConfig;
import io.pulumi.aws.appsync.outputs.DataSourceRelationalDatabaseConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AppSync DataSource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_appsync_datasource` can be imported with their `api_id`, a hyphen, and `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appsync/dataSource:DataSource example abcdef123456-example
 * ```
 * 
 */
@ResourceType(type="aws:appsync/dataSource:DataSource")
public class DataSource extends io.pulumi.resources.CustomResource {
    /**
     * The API ID for the GraphQL API for the DataSource.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API ID for the GraphQL API for the DataSource.
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * The ARN
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the DataSource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the DataSource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * DynamoDB settings. See below
     * 
     */
    @Export(name="dynamodbConfig", type=DataSourceDynamodbConfig.class, parameters={})
    private Output</* @Nullable */ DataSourceDynamodbConfig> dynamodbConfig;

    /**
     * @return DynamoDB settings. See below
     * 
     */
    public Output</* @Nullable */ DataSourceDynamodbConfig> getDynamodbConfig() {
        return this.dynamodbConfig;
    }
    /**
     * Amazon Elasticsearch settings. See below
     * 
     */
    @Export(name="elasticsearchConfig", type=DataSourceElasticsearchConfig.class, parameters={})
    private Output</* @Nullable */ DataSourceElasticsearchConfig> elasticsearchConfig;

    /**
     * @return Amazon Elasticsearch settings. See below
     * 
     */
    public Output</* @Nullable */ DataSourceElasticsearchConfig> getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }
    /**
     * HTTP settings. See below
     * 
     */
    @Export(name="httpConfig", type=DataSourceHttpConfig.class, parameters={})
    private Output</* @Nullable */ DataSourceHttpConfig> httpConfig;

    /**
     * @return HTTP settings. See below
     * 
     */
    public Output</* @Nullable */ DataSourceHttpConfig> getHttpConfig() {
        return this.httpConfig;
    }
    /**
     * AWS Lambda settings. See below
     * 
     */
    @Export(name="lambdaConfig", type=DataSourceLambdaConfig.class, parameters={})
    private Output</* @Nullable */ DataSourceLambdaConfig> lambdaConfig;

    /**
     * @return AWS Lambda settings. See below
     * 
     */
    public Output</* @Nullable */ DataSourceLambdaConfig> getLambdaConfig() {
        return this.lambdaConfig;
    }
    /**
     * A user-supplied name for the DataSource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-supplied name for the DataSource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * AWS RDS settings. See Relational Database Config
     * 
     */
    @Export(name="relationalDatabaseConfig", type=DataSourceRelationalDatabaseConfig.class, parameters={})
    private Output</* @Nullable */ DataSourceRelationalDatabaseConfig> relationalDatabaseConfig;

    /**
     * @return AWS RDS settings. See Relational Database Config
     * 
     */
    public Output</* @Nullable */ DataSourceRelationalDatabaseConfig> getRelationalDatabaseConfig() {
        return this.relationalDatabaseConfig;
    }
    /**
     * The IAM service role ARN for the data source.
     * 
     */
    @Export(name="serviceRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceRoleArn;

    /**
     * @return The IAM service role ARN for the data source.
     * 
     */
    public Output</* @Nullable */ String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }
    /**
     * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DataSourceArgs.Builder a);
    }
    private static io.pulumi.aws.appsync.DataSourceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.appsync.DataSourceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataSource(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSource(String name) {
        this(name, DataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSource(String name, DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, DataSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/dataSource:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable DataSourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:appsync/dataSource:DataSource", name, state, makeResourceOptions(options, id));
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
    public static DataSource get(String name, Output<String> id, @Nullable DataSourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSource(name, id, state, options);
    }
}
