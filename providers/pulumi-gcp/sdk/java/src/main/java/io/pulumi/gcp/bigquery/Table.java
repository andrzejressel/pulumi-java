// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.TableArgs;
import io.pulumi.gcp.bigquery.inputs.TableState;
import io.pulumi.gcp.bigquery.outputs.TableEncryptionConfiguration;
import io.pulumi.gcp.bigquery.outputs.TableExternalDataConfiguration;
import io.pulumi.gcp.bigquery.outputs.TableMaterializedView;
import io.pulumi.gcp.bigquery.outputs.TableRangePartitioning;
import io.pulumi.gcp.bigquery.outputs.TableTimePartitioning;
import io.pulumi.gcp.bigquery.outputs.TableView;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a table resource in a dataset for Google BigQuery. For more information see
 * [the official documentation](https://cloud.google.com/bigquery/docs/) and
 * [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
 * 
 * > **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
 * (and run `pulumi update` to write the field to state) in order to destroy an instance.
 * It is recommended to not set this field (or set it to true) until you're ready to destroy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * BigQuery tables can be imported using the `project`, `dataset_id`, and `table_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/table:Table default gcp-project/foo/bar
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/table:Table")
public class Table extends io.pulumi.resources.CustomResource {
    /**
     * Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    @Export(name="clusterings", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> clusterings;

    /**
     * @return Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    public Output</* @Nullable */ List<String>> getClusterings() {
        return this.clusterings;
    }
    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    @Export(name="creationTime", type=Integer.class, parameters={})
    private Output<Integer> creationTime;

    /**
     * @return The time when this table was created, in milliseconds since the epoch.
     * 
     */
    public Output<Integer> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    /**
     * @return The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getDatasetId() {
        return this.datasetId;
    }
    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * The field description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The field description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    @Export(name="encryptionConfiguration", type=TableEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ TableEncryptionConfiguration> encryptionConfiguration;

    /**
     * @return Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * A hash of the resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A hash of the resource.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    @Export(name="expirationTime", type=Integer.class, parameters={})
    private Output<Integer> expirationTime;

    /**
     * @return The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    public Output<Integer> getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    @Export(name="externalDataConfiguration", type=TableExternalDataConfiguration.class, parameters={})
    private Output</* @Nullable */ TableExternalDataConfiguration> externalDataConfiguration;

    /**
     * @return Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableExternalDataConfiguration> getExternalDataConfiguration() {
        return this.externalDataConfiguration;
    }
    /**
     * A descriptive name for the table.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return A descriptive name for the table.
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * A mapping of labels to assign to the resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return A mapping of labels to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    @Export(name="lastModifiedTime", type=Integer.class, parameters={})
    private Output<Integer> lastModifiedTime;

    /**
     * @return The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    public Output<Integer> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    @Export(name="materializedView", type=TableMaterializedView.class, parameters={})
    private Output</* @Nullable */ TableMaterializedView> materializedView;

    /**
     * @return If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableMaterializedView> getMaterializedView() {
        return this.materializedView;
    }
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    @Export(name="numBytes", type=Integer.class, parameters={})
    private Output<Integer> numBytes;

    /**
     * @return The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    public Output<Integer> getNumBytes() {
        return this.numBytes;
    }
    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    @Export(name="numLongTermBytes", type=Integer.class, parameters={})
    private Output<Integer> numLongTermBytes;

    /**
     * @return The number of bytes in the table that are considered "long-term storage".
     * 
     */
    public Output<Integer> getNumLongTermBytes() {
        return this.numLongTermBytes;
    }
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    @Export(name="numRows", type=Integer.class, parameters={})
    private Output<Integer> numRows;

    /**
     * @return The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    public Output<Integer> getNumRows() {
        return this.numRows;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
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
     * If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Export(name="rangePartitioning", type=TableRangePartitioning.class, parameters={})
    private Output</* @Nullable */ TableRangePartitioning> rangePartitioning;

    /**
     * @return If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableRangePartitioning> getRangePartitioning() {
        return this.rangePartitioning;
    }
    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    public Output<String> getSchema() {
        return this.schema;
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
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="tableId", type=String.class, parameters={})
    private Output<String> tableId;

    /**
     * @return A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getTableId() {
        return this.tableId;
    }
    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Export(name="timePartitioning", type=TableTimePartitioning.class, parameters={})
    private Output</* @Nullable */ TableTimePartitioning> timePartitioning;

    /**
     * @return If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableTimePartitioning> getTimePartitioning() {
        return this.timePartitioning;
    }
    /**
     * The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The supported types are DAY, HOUR, MONTH, and YEAR,
     * which will generate one partition per day, hour, month, and year, respectively.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    @Export(name="view", type=TableView.class, parameters={})
    private Output</* @Nullable */ TableView> view;

    /**
     * @return If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ TableView> getView() {
        return this.view;
    }

    public interface BuilderApplicator {
        public void apply(TableArgs.Builder a);
    }
    private static io.pulumi.gcp.bigquery.TableArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.bigquery.TableArgs.builder();
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
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/table:Table", name, state, makeResourceOptions(options, id));
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
