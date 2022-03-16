// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigquery_v2.DatasetArgs;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetAccessItemResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetTagsItemResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new empty dataset.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:bigquery/v2:Dataset")
public class Dataset extends io.pulumi.resources.CustomResource {
    /**
     * [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
     * 
     */
    @Export(name="access", type=List.class, parameters={DatasetAccessItemResponse.class})
    private Output<List<DatasetAccessItemResponse>> access;

    /**
     * @return [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
     * 
     */
    public Output<List<DatasetAccessItemResponse>> getAccess() {
        return this.access;
    }
    /**
     * The time when this dataset was created, in milliseconds since the epoch.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time when this dataset was created, in milliseconds since the epoch.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * [Required] A reference that identifies the dataset.
     * 
     */
    @Export(name="datasetReference", type=DatasetReferenceResponse.class, parameters={})
    private Output<DatasetReferenceResponse> datasetReference;

    /**
     * @return [Required] A reference that identifies the dataset.
     * 
     */
    public Output<DatasetReferenceResponse> getDatasetReference() {
        return this.datasetReference;
    }
    /**
     * The default collation of the dataset.
     * 
     */
    @Export(name="defaultCollation", type=String.class, parameters={})
    private Output<String> defaultCollation;

    /**
     * @return The default collation of the dataset.
     * 
     */
    public Output<String> getDefaultCollation() {
        return this.defaultCollation;
    }
    @Export(name="defaultEncryptionConfiguration", type=EncryptionConfigurationResponse.class, parameters={})
    private Output<EncryptionConfigurationResponse> defaultEncryptionConfiguration;

    public Output<EncryptionConfigurationResponse> getDefaultEncryptionConfiguration() {
        return this.defaultEncryptionConfiguration;
    }
    /**
     * [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
     * 
     */
    @Export(name="defaultPartitionExpirationMs", type=String.class, parameters={})
    private Output<String> defaultPartitionExpirationMs;

    /**
     * @return [Optional] The default partition expiration for all partitioned tables in the dataset, in milliseconds. Once this property is set, all newly-created partitioned tables in the dataset will have an expirationMs property in the timePartitioning settings set to this value, and changing the value will only affect new tables, not existing ones. The storage in a partition will have an expiration time of its partition time plus this value. Setting this property overrides the use of defaultTableExpirationMs for partitioned tables: only one of defaultTableExpirationMs and defaultPartitionExpirationMs will be used for any new partitioned table. If you provide an explicit timePartitioning.expirationMs when creating or updating a partitioned table, that value takes precedence over the default partition expiration time indicated by this property.
     * 
     */
    public Output<String> getDefaultPartitionExpirationMs() {
        return this.defaultPartitionExpirationMs;
    }
    /**
     * [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
     * 
     */
    @Export(name="defaultTableExpirationMs", type=String.class, parameters={})
    private Output<String> defaultTableExpirationMs;

    /**
     * @return [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
     * 
     */
    public Output<String> getDefaultTableExpirationMs() {
        return this.defaultTableExpirationMs;
    }
    /**
     * [Optional] A user-friendly description of the dataset.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return [Optional] A user-friendly description of the dataset.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
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
     * [Optional] A descriptive name for the dataset.
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    /**
     * @return [Optional] A descriptive name for the dataset.
     * 
     */
    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * [Optional] Indicates if table names are case insensitive in the dataset.
     * 
     */
    @Export(name="isCaseInsensitive", type=Boolean.class, parameters={})
    private Output<Boolean> isCaseInsensitive;

    /**
     * @return [Optional] Indicates if table names are case insensitive in the dataset.
     * 
     */
    public Output<Boolean> getIsCaseInsensitive() {
        return this.isCaseInsensitive;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Creating and Updating Dataset Labels for more information.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
     * 
     */
    @Export(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    /**
     * @return The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
     * 
     */
    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geographic location where the dataset should reside. The default value is US. See details at https://cloud.google.com/bigquery/docs/locations.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPZS", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPZS;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPZS() {
        return this.satisfiesPZS;
    }
    /**
     * A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * [Optional]The tags associated with this dataset. Tag keys are globally unique.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DatasetTagsItemResponse.class})
    private Output<List<DatasetTagsItemResponse>> tags;

    /**
     * @return [Optional]The tags associated with this dataset. Tag keys are globally unique.
     * 
     */
    public Output<List<DatasetTagsItemResponse>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DatasetArgs.Builder a);
    }
    private static io.pulumi.googlenative.bigquery_v2.DatasetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.bigquery_v2.DatasetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Dataset(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, @Nullable DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, @Nullable DatasetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Dataset(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigquery/v2:Dataset", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Dataset get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, options);
    }
}
