// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.glue.CrawlerArgs;
import io.pulumi.aws.glue.inputs.CrawlerState;
import io.pulumi.aws.glue.outputs.CrawlerCatalogTarget;
import io.pulumi.aws.glue.outputs.CrawlerDeltaTarget;
import io.pulumi.aws.glue.outputs.CrawlerDynamodbTarget;
import io.pulumi.aws.glue.outputs.CrawlerJdbcTarget;
import io.pulumi.aws.glue.outputs.CrawlerLineageConfiguration;
import io.pulumi.aws.glue.outputs.CrawlerMongodbTarget;
import io.pulumi.aws.glue.outputs.CrawlerRecrawlPolicy;
import io.pulumi.aws.glue.outputs.CrawlerS3Target;
import io.pulumi.aws.glue.outputs.CrawlerSchemaChangePolicy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a Glue Crawler. More information can be found in the [AWS Glue Developer Guide](https://docs.aws.amazon.com/glue/latest/dg/add-crawler.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Glue Crawlers can be imported using `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/crawler:Crawler MyJob MyJob
 * ```
 * 
 */
@ResourceType(type="aws:glue/crawler:Crawler")
public class Crawler extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the crawler
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the crawler
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @Export(name="catalogTargets", type=List.class, parameters={CrawlerCatalogTarget.class})
    private Output</* @Nullable */ List<CrawlerCatalogTarget>> catalogTargets;

    public Output</* @Nullable */ List<CrawlerCatalogTarget>> getCatalogTargets() {
        return this.catalogTargets;
    }
    /**
     * List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    @Export(name="classifiers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> classifiers;

    /**
     * @return List of custom classifiers. By default, all AWS classifiers are included in a crawl, but these custom classifiers always override the default classifiers for a given classification.
     * 
     */
    public Output</* @Nullable */ List<String>> getClassifiers() {
        return this.classifiers;
    }
    /**
     * JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    @Export(name="configuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> configuration;

    /**
     * @return JSON string of configuration information. For more details see [Setting Crawler Configuration Options](https://docs.aws.amazon.com/glue/latest/dg/crawler-configuration.html).
     * 
     */
    public Output</* @Nullable */ String> getConfiguration() {
        return this.configuration;
    }
    /**
     * The name of the Glue database to be synchronized.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the Glue database to be synchronized.
     * 
     */
    public Output<String> getDatabaseName() {
        return this.databaseName;
    }
    @Export(name="deltaTargets", type=List.class, parameters={CrawlerDeltaTarget.class})
    private Output</* @Nullable */ List<CrawlerDeltaTarget>> deltaTargets;

    public Output</* @Nullable */ List<CrawlerDeltaTarget>> getDeltaTargets() {
        return this.deltaTargets;
    }
    /**
     * Description of the crawler.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the crawler.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    @Export(name="dynamodbTargets", type=List.class, parameters={CrawlerDynamodbTarget.class})
    private Output</* @Nullable */ List<CrawlerDynamodbTarget>> dynamodbTargets;

    /**
     * @return List of nested DynamoDB target arguments. See Dynamodb Target below.
     * 
     */
    public Output</* @Nullable */ List<CrawlerDynamodbTarget>> getDynamodbTargets() {
        return this.dynamodbTargets;
    }
    /**
     * List of nested JBDC target arguments. See JDBC Target below.
     * 
     */
    @Export(name="jdbcTargets", type=List.class, parameters={CrawlerJdbcTarget.class})
    private Output</* @Nullable */ List<CrawlerJdbcTarget>> jdbcTargets;

    /**
     * @return List of nested JBDC target arguments. See JDBC Target below.
     * 
     */
    public Output</* @Nullable */ List<CrawlerJdbcTarget>> getJdbcTargets() {
        return this.jdbcTargets;
    }
    /**
     * Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    @Export(name="lineageConfiguration", type=CrawlerLineageConfiguration.class, parameters={})
    private Output</* @Nullable */ CrawlerLineageConfiguration> lineageConfiguration;

    /**
     * @return Specifies data lineage configuration settings for the crawler. See Lineage Configuration below.
     * 
     */
    public Output</* @Nullable */ CrawlerLineageConfiguration> getLineageConfiguration() {
        return this.lineageConfiguration;
    }
    /**
     * List nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    @Export(name="mongodbTargets", type=List.class, parameters={CrawlerMongodbTarget.class})
    private Output</* @Nullable */ List<CrawlerMongodbTarget>> mongodbTargets;

    /**
     * @return List nested MongoDB target arguments. See MongoDB Target below.
     * 
     */
    public Output</* @Nullable */ List<CrawlerMongodbTarget>> getMongodbTargets() {
        return this.mongodbTargets;
    }
    /**
     * Name of the crawler.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the crawler.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    @Export(name="recrawlPolicy", type=CrawlerRecrawlPolicy.class, parameters={})
    private Output</* @Nullable */ CrawlerRecrawlPolicy> recrawlPolicy;

    /**
     * @return A policy that specifies whether to crawl the entire dataset again, or to crawl only folders that were added since the last crawler run.. See Recrawl Policy below.
     * 
     */
    public Output</* @Nullable */ CrawlerRecrawlPolicy> getRecrawlPolicy() {
        return this.recrawlPolicy;
    }
    /**
     * The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The IAM role friendly name (including path without leading slash), or ARN of an IAM role, used by the crawler to access other resources.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * List nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    @Export(name="s3Targets", type=List.class, parameters={CrawlerS3Target.class})
    private Output</* @Nullable */ List<CrawlerS3Target>> s3Targets;

    /**
     * @return List nested Amazon S3 target arguments. See S3 Target below.
     * 
     */
    public Output</* @Nullable */ List<CrawlerS3Target>> getS3Targets() {
        return this.s3Targets;
    }
    /**
     * A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return A cron expression used to specify the schedule. For more information, see [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html). For example, to run something every day at 12:15 UTC, you would specify: `cron(15 12 * * ? *)`.
     * 
     */
    public Output</* @Nullable */ String> getSchedule() {
        return this.schedule;
    }
    /**
     * Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     * 
     */
    @Export(name="schemaChangePolicy", type=CrawlerSchemaChangePolicy.class, parameters={})
    private Output</* @Nullable */ CrawlerSchemaChangePolicy> schemaChangePolicy;

    /**
     * @return Policy for the crawler's update and deletion behavior. See Schema Change Policy below.
     * 
     */
    public Output</* @Nullable */ CrawlerSchemaChangePolicy> getSchemaChangePolicy() {
        return this.schemaChangePolicy;
    }
    /**
     * The name of Security Configuration to be used by the crawler
     * 
     */
    @Export(name="securityConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityConfiguration;

    /**
     * @return The name of Security Configuration to be used by the crawler
     * 
     */
    public Output</* @Nullable */ String> getSecurityConfiguration() {
        return this.securityConfiguration;
    }
    /**
     * The table prefix used for catalog tables that are created.
     * 
     */
    @Export(name="tablePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> tablePrefix;

    /**
     * @return The table prefix used for catalog tables that are created.
     * 
     */
    public Output</* @Nullable */ String> getTablePrefix() {
        return this.tablePrefix;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(CrawlerArgs.Builder a);
    }
    private static io.pulumi.aws.glue.CrawlerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.glue.CrawlerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Crawler(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Crawler(String name) {
        this(name, CrawlerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Crawler(String name, CrawlerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Crawler(String name, CrawlerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/crawler:Crawler", name, args == null ? CrawlerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Crawler(String name, Output<String> id, @Nullable CrawlerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/crawler:Crawler", name, state, makeResourceOptions(options, id));
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
    public static Crawler get(String name, Output<String> id, @Nullable CrawlerState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Crawler(name, id, state, options);
    }
}
