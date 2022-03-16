// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dynamodb.TableArgs;
import io.pulumi.aws.dynamodb.inputs.TableState;
import io.pulumi.aws.dynamodb.outputs.TableAttribute;
import io.pulumi.aws.dynamodb.outputs.TableGlobalSecondaryIndex;
import io.pulumi.aws.dynamodb.outputs.TableLocalSecondaryIndex;
import io.pulumi.aws.dynamodb.outputs.TablePointInTimeRecovery;
import io.pulumi.aws.dynamodb.outputs.TableReplica;
import io.pulumi.aws.dynamodb.outputs.TableServerSideEncryption;
import io.pulumi.aws.dynamodb.outputs.TableTtl;
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
 * Provides a DynamoDB table resource
 * 
 * > **Note:** It is recommended to use [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) for `read_capacity` and/or `write_capacity` if there's `autoscaling policy` attached to the table.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DynamoDB tables can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dynamodb/table:Table basic-dynamodb-table GameScores
 * ```
 * 
 */
@ResourceType(type="aws:dynamodb/table:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * The arn of the table
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The arn of the table
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
     * 
     */
    @Export(name="attributes", type=List.class, parameters={TableAttribute.class})
    private Output<List<TableAttribute>> attributes;

    /**
     * @return List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
     * 
     */
    public Output<List<TableAttribute>> getAttributes() {
        return this.attributes;
    }
    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @Export(name="billingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingMode;

    /**
     * @return Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    public Output</* @Nullable */ String> getBillingMode() {
        return this.billingMode;
    }
    /**
     * Describe a GSI for the table;
     * subject to the normal limits on the number of GSIs, projected
     * attributes, etc.
     * 
     */
    @Export(name="globalSecondaryIndexes", type=List.class, parameters={TableGlobalSecondaryIndex.class})
    private Output</* @Nullable */ List<TableGlobalSecondaryIndex>> globalSecondaryIndexes;

    /**
     * @return Describe a GSI for the table;
     * subject to the normal limits on the number of GSIs, projected
     * attributes, etc.
     * 
     */
    public Output</* @Nullable */ List<TableGlobalSecondaryIndex>> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes;
    }
    /**
     * The name of the hash key in the index; must be
     * defined as an attribute in the resource.
     * 
     */
    @Export(name="hashKey", type=String.class, parameters={})
    private Output<String> hashKey;

    /**
     * @return The name of the hash key in the index; must be
     * defined as an attribute in the resource.
     * 
     */
    public Output<String> getHashKey() {
        return this.hashKey;
    }
    /**
     * Describe an LSI on the table;
     * these can only be allocated *at creation* so you cannot change this
     * definition after you have created the resource.
     * 
     */
    @Export(name="localSecondaryIndexes", type=List.class, parameters={TableLocalSecondaryIndex.class})
    private Output</* @Nullable */ List<TableLocalSecondaryIndex>> localSecondaryIndexes;

    /**
     * @return Describe an LSI on the table;
     * these can only be allocated *at creation* so you cannot change this
     * definition after you have created the resource.
     * 
     */
    public Output</* @Nullable */ List<TableLocalSecondaryIndex>> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes;
    }
    /**
     * The name of the index
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the index
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Enable point-in-time recovery options.
     * 
     */
    @Export(name="pointInTimeRecovery", type=TablePointInTimeRecovery.class, parameters={})
    private Output<TablePointInTimeRecovery> pointInTimeRecovery;

    /**
     * @return Enable point-in-time recovery options.
     * 
     */
    public Output<TablePointInTimeRecovery> getPointInTimeRecovery() {
        return this.pointInTimeRecovery;
    }
    /**
     * The name of the range key; must be defined
     * 
     */
    @Export(name="rangeKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> rangeKey;

    /**
     * @return The name of the range key; must be defined
     * 
     */
    public Output</* @Nullable */ String> getRangeKey() {
        return this.rangeKey;
    }
    /**
     * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Export(name="readCapacity", type=Integer.class, parameters={})
    private Output<Integer> readCapacity;

    /**
     * @return The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Output<Integer> getReadCapacity() {
        return this.readCapacity;
    }
    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
     * 
     */
    @Export(name="replicas", type=List.class, parameters={TableReplica.class})
    private Output</* @Nullable */ List<TableReplica>> replicas;

    /**
     * @return Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<TableReplica>> getReplicas() {
        return this.replicas;
    }
    /**
     * The time of the point-in-time recovery point to restore.
     * 
     */
    @Export(name="restoreDateTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreDateTime;

    /**
     * @return The time of the point-in-time recovery point to restore.
     * 
     */
    public Output</* @Nullable */ String> getRestoreDateTime() {
        return this.restoreDateTime;
    }
    /**
     * The name of the table to restore. Must match the name of an existing table.
     * 
     */
    @Export(name="restoreSourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> restoreSourceName;

    /**
     * @return The name of the table to restore. Must match the name of an existing table.
     * 
     */
    public Output</* @Nullable */ String> getRestoreSourceName() {
        return this.restoreSourceName;
    }
    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @Export(name="restoreToLatestTime", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> restoreToLatestTime;

    /**
     * @return If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    public Output</* @Nullable */ Boolean> getRestoreToLatestTime() {
        return this.restoreToLatestTime;
    }
    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
     * 
     */
    @Export(name="serverSideEncryption", type=TableServerSideEncryption.class, parameters={})
    private Output<TableServerSideEncryption> serverSideEncryption;

    /**
     * @return Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
     * 
     */
    public Output<TableServerSideEncryption> getServerSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * The ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    @Export(name="streamArn", type=String.class, parameters={})
    private Output<String> streamArn;

    /**
     * @return The ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    public Output<String> getStreamArn() {
        return this.streamArn;
    }
    /**
     * Indicates whether Streams are to be enabled (true) or disabled (false).
     * 
     */
    @Export(name="streamEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> streamEnabled;

    /**
     * @return Indicates whether Streams are to be enabled (true) or disabled (false).
     * 
     */
    public Output</* @Nullable */ Boolean> getStreamEnabled() {
        return this.streamEnabled;
    }
    /**
     * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
     * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
     * table name and this field is guaranteed to be unique.
     * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    @Export(name="streamLabel", type=String.class, parameters={})
    private Output<String> streamLabel;

    /**
     * @return A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
     * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
     * table name and this field is guaranteed to be unique.
     * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    public Output<String> getStreamLabel() {
        return this.streamLabel;
    }
    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @Export(name="streamViewType", type=String.class, parameters={})
    private Output<String> streamViewType;

    /**
     * @return When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    public Output<String> getStreamViewType() {
        return this.streamViewType;
    }
    /**
     * The storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @Export(name="tableClass", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableClass;

    /**
     * @return The storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    public Output</* @Nullable */ String> getTableClass() {
        return this.tableClass;
    }
    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * Defines ttl, has two properties, and can only be specified once:
     * 
     */
    @Export(name="ttl", type=TableTtl.class, parameters={})
    private Output<TableTtl> ttl;

    /**
     * @return Defines ttl, has two properties, and can only be specified once:
     * 
     */
    public Output<TableTtl> getTtl() {
        return this.ttl;
    }
    /**
     * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Export(name="writeCapacity", type=Integer.class, parameters={})
    private Output<Integer> writeCapacity;

    /**
     * @return The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Output<Integer> getWriteCapacity() {
        return this.writeCapacity;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TableArgs.Builder a);
    }
    private static io.pulumi.aws.dynamodb.TableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.dynamodb.TableArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Table(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, @Nullable TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, @Nullable TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dynamodb/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
