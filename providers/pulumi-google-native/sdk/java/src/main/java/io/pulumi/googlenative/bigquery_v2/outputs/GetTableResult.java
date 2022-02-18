// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ClusteringResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.EncryptionConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ExternalDataConfigurationResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.MaterializedViewDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ModelDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.RangePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.SnapshotDefinitionResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.StreamingbufferResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableSchemaResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TimePartitioningResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.ViewDefinitionResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetTableResult {
    /**
     * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    private final ClusteringResponse clustering;
    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    private final String creationTime;
    /**
     * The default collation of the table.
     * 
     */
    private final String defaultCollation;
    /**
     * [Optional] A user-friendly description of this table.
     * 
     */
    private final String description;
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    private final EncryptionConfigurationResponse encryptionConfiguration;
    /**
     * A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
     * 
     */
    private final String etag;
    /**
     * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    private final String expirationTime;
    /**
     * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    private final ExternalDataConfigurationResponse externalDataConfiguration;
    /**
     * [Optional] A descriptive name for this table.
     * 
     */
    private final String friendlyName;
    /**
     * The type of the resource.
     * 
     */
    private final String kind;
    /**
     * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    private final String location;
    /**
     * [Optional] Materialized view definition.
     * 
     */
    private final MaterializedViewDefinitionResponse materializedView;
    /**
     * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    private final ModelDefinitionResponse model;
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    private final String numBytes;
    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    private final String numLongTermBytes;
    /**
     * [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
     * 
     */
    private final String numPhysicalBytes;
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    private final String numRows;
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final RangePartitioningResponse rangePartitioning;
    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    private final Boolean requirePartitionFilter;
    /**
     * [Optional] Describes the schema of this table.
     * 
     */
    private final TableSchemaResponse schema;
    /**
     * A URL that can be used to access this resource again.
     * 
     */
    private final String selfLink;
    /**
     * Snapshot definition.
     * 
     */
    private final SnapshotDefinitionResponse snapshotDefinition;
    /**
     * Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
     * 
     */
    private final StreamingbufferResponse streamingBuffer;
    /**
     * [Required] Reference describing the ID of this table.
     * 
     */
    private final TableReferenceResponse tableReference;
    /**
     * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    private final TimePartitioningResponse timePartitioning;
    /**
     * Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
     * 
     */
    private final String type;
    /**
     * [Optional] The view definition.
     * 
     */
    private final ViewDefinitionResponse view;

    @OutputCustomType.Constructor({"clustering","creationTime","defaultCollation","description","encryptionConfiguration","etag","expirationTime","externalDataConfiguration","friendlyName","kind","labels","lastModifiedTime","location","materializedView","model","numBytes","numLongTermBytes","numPhysicalBytes","numRows","rangePartitioning","requirePartitionFilter","schema","selfLink","snapshotDefinition","streamingBuffer","tableReference","timePartitioning","type","view"})
    private GetTableResult(
        ClusteringResponse clustering,
        String creationTime,
        String defaultCollation,
        String description,
        EncryptionConfigurationResponse encryptionConfiguration,
        String etag,
        String expirationTime,
        ExternalDataConfigurationResponse externalDataConfiguration,
        String friendlyName,
        String kind,
        Map<String,String> labels,
        String lastModifiedTime,
        String location,
        MaterializedViewDefinitionResponse materializedView,
        ModelDefinitionResponse model,
        String numBytes,
        String numLongTermBytes,
        String numPhysicalBytes,
        String numRows,
        RangePartitioningResponse rangePartitioning,
        Boolean requirePartitionFilter,
        TableSchemaResponse schema,
        String selfLink,
        SnapshotDefinitionResponse snapshotDefinition,
        StreamingbufferResponse streamingBuffer,
        TableReferenceResponse tableReference,
        TimePartitioningResponse timePartitioning,
        String type,
        ViewDefinitionResponse view) {
        this.clustering = Objects.requireNonNull(clustering);
        this.creationTime = Objects.requireNonNull(creationTime);
        this.defaultCollation = Objects.requireNonNull(defaultCollation);
        this.description = Objects.requireNonNull(description);
        this.encryptionConfiguration = Objects.requireNonNull(encryptionConfiguration);
        this.etag = Objects.requireNonNull(etag);
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.externalDataConfiguration = Objects.requireNonNull(externalDataConfiguration);
        this.friendlyName = Objects.requireNonNull(friendlyName);
        this.kind = Objects.requireNonNull(kind);
        this.labels = Objects.requireNonNull(labels);
        this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
        this.location = Objects.requireNonNull(location);
        this.materializedView = Objects.requireNonNull(materializedView);
        this.model = Objects.requireNonNull(model);
        this.numBytes = Objects.requireNonNull(numBytes);
        this.numLongTermBytes = Objects.requireNonNull(numLongTermBytes);
        this.numPhysicalBytes = Objects.requireNonNull(numPhysicalBytes);
        this.numRows = Objects.requireNonNull(numRows);
        this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
        this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
        this.schema = Objects.requireNonNull(schema);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.snapshotDefinition = Objects.requireNonNull(snapshotDefinition);
        this.streamingBuffer = Objects.requireNonNull(streamingBuffer);
        this.tableReference = Objects.requireNonNull(tableReference);
        this.timePartitioning = Objects.requireNonNull(timePartitioning);
        this.type = Objects.requireNonNull(type);
        this.view = Objects.requireNonNull(view);
    }

    /**
     * [Beta] Clustering specification for the table. Must be specified with partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    public ClusteringResponse getClustering() {
        return this.clustering;
    }
    /**
     * The time when this table was created, in milliseconds since the epoch.
     * 
     */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The default collation of the table.
     * 
     */
    public String getDefaultCollation() {
        return this.defaultCollation;
    }
    /**
     * [Optional] A user-friendly description of this table.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    public EncryptionConfigurationResponse getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }
    /**
     * A hash of the table metadata. Used to ensure there were no concurrent modifications to the resource when attempting an update. Not guaranteed to change when the table contents or the fields numRows, numBytes, numLongTermBytes or lastModifiedTime change.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created tables.
     * 
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
     * 
     */
    public ExternalDataConfigurationResponse getExternalDataConfiguration() {
        return this.externalDataConfiguration;
    }
    /**
     * [Optional] A descriptive name for this table.
     * 
     */
    public String getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The time when this table was last modified, in milliseconds since the epoch.
     * 
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The geographic location where the table resides. This value is inherited from the dataset.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * [Optional] Materialized view definition.
     * 
     */
    public MaterializedViewDefinitionResponse getMaterializedView() {
        return this.materializedView;
    }
    /**
     * [Output-only, Beta] Present iff this table represents a ML model. Describes the training information for the model, and it is required to run 'PREDICT' queries.
     * 
     */
    public ModelDefinitionResponse getModel() {
        return this.model;
    }
    /**
     * The size of this table in bytes, excluding any data in the streaming buffer.
     * 
     */
    public String getNumBytes() {
        return this.numBytes;
    }
    /**
     * The number of bytes in the table that are considered "long-term storage".
     * 
     */
    public String getNumLongTermBytes() {
        return this.numLongTermBytes;
    }
    /**
     * [TrustedTester] The physical size of this table in bytes, excluding any data in the streaming buffer. This includes compression and storage used for time travel.
     * 
     */
    public String getNumPhysicalBytes() {
        return this.numPhysicalBytes;
    }
    /**
     * The number of rows of data in this table, excluding any data in the streaming buffer.
     * 
     */
    public String getNumRows() {
        return this.numRows;
    }
    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    public RangePartitioningResponse getRangePartitioning() {
        return this.rangePartitioning;
    }
    /**
     * [Optional] If set to true, queries over this table require a partition filter that can be used for partition elimination to be specified.
     * 
     */
    public Boolean getRequirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * [Optional] Describes the schema of this table.
     * 
     */
    public TableSchemaResponse getSchema() {
        return this.schema;
    }
    /**
     * A URL that can be used to access this resource again.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Snapshot definition.
     * 
     */
    public SnapshotDefinitionResponse getSnapshotDefinition() {
        return this.snapshotDefinition;
    }
    /**
     * Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
     * 
     */
    public StreamingbufferResponse getStreamingBuffer() {
        return this.streamingBuffer;
    }
    /**
     * [Required] Reference describing the ID of this table.
     * 
     */
    public TableReferenceResponse getTableReference() {
        return this.tableReference;
    }
    /**
     * Time-based partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    public TimePartitioningResponse getTimePartitioning() {
        return this.timePartitioning;
    }
    /**
     * Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. SNAPSHOT: An immutable, read-only table that is a copy of another table. [TrustedTester] MATERIALIZED_VIEW: SQL query whose result is persisted. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * [Optional] The view definition.
     * 
     */
    public ViewDefinitionResponse getView() {
        return this.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusteringResponse clustering;
        private String creationTime;
        private String defaultCollation;
        private String description;
        private EncryptionConfigurationResponse encryptionConfiguration;
        private String etag;
        private String expirationTime;
        private ExternalDataConfigurationResponse externalDataConfiguration;
        private String friendlyName;
        private String kind;
        private Map<String,String> labels;
        private String lastModifiedTime;
        private String location;
        private MaterializedViewDefinitionResponse materializedView;
        private ModelDefinitionResponse model;
        private String numBytes;
        private String numLongTermBytes;
        private String numPhysicalBytes;
        private String numRows;
        private RangePartitioningResponse rangePartitioning;
        private Boolean requirePartitionFilter;
        private TableSchemaResponse schema;
        private String selfLink;
        private SnapshotDefinitionResponse snapshotDefinition;
        private StreamingbufferResponse streamingBuffer;
        private TableReferenceResponse tableReference;
        private TimePartitioningResponse timePartitioning;
        private String type;
        private ViewDefinitionResponse view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clustering = defaults.clustering;
    	      this.creationTime = defaults.creationTime;
    	      this.defaultCollation = defaults.defaultCollation;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.etag = defaults.etag;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.materializedView = defaults.materializedView;
    	      this.model = defaults.model;
    	      this.numBytes = defaults.numBytes;
    	      this.numLongTermBytes = defaults.numLongTermBytes;
    	      this.numPhysicalBytes = defaults.numPhysicalBytes;
    	      this.numRows = defaults.numRows;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.schema = defaults.schema;
    	      this.selfLink = defaults.selfLink;
    	      this.snapshotDefinition = defaults.snapshotDefinition;
    	      this.streamingBuffer = defaults.streamingBuffer;
    	      this.tableReference = defaults.tableReference;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.type = defaults.type;
    	      this.view = defaults.view;
        }

        public Builder setClustering(ClusteringResponse clustering) {
            this.clustering = Objects.requireNonNull(clustering);
            return this;
        }

        public Builder setCreationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder setDefaultCollation(String defaultCollation) {
            this.defaultCollation = Objects.requireNonNull(defaultCollation);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEncryptionConfiguration(EncryptionConfigurationResponse encryptionConfiguration) {
            this.encryptionConfiguration = Objects.requireNonNull(encryptionConfiguration);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setExternalDataConfiguration(ExternalDataConfigurationResponse externalDataConfiguration) {
            this.externalDataConfiguration = Objects.requireNonNull(externalDataConfiguration);
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaterializedView(MaterializedViewDefinitionResponse materializedView) {
            this.materializedView = Objects.requireNonNull(materializedView);
            return this;
        }

        public Builder setModel(ModelDefinitionResponse model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder setNumBytes(String numBytes) {
            this.numBytes = Objects.requireNonNull(numBytes);
            return this;
        }

        public Builder setNumLongTermBytes(String numLongTermBytes) {
            this.numLongTermBytes = Objects.requireNonNull(numLongTermBytes);
            return this;
        }

        public Builder setNumPhysicalBytes(String numPhysicalBytes) {
            this.numPhysicalBytes = Objects.requireNonNull(numPhysicalBytes);
            return this;
        }

        public Builder setNumRows(String numRows) {
            this.numRows = Objects.requireNonNull(numRows);
            return this;
        }

        public Builder setRangePartitioning(RangePartitioningResponse rangePartitioning) {
            this.rangePartitioning = Objects.requireNonNull(rangePartitioning);
            return this;
        }

        public Builder setRequirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }

        public Builder setSchema(TableSchemaResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSnapshotDefinition(SnapshotDefinitionResponse snapshotDefinition) {
            this.snapshotDefinition = Objects.requireNonNull(snapshotDefinition);
            return this;
        }

        public Builder setStreamingBuffer(StreamingbufferResponse streamingBuffer) {
            this.streamingBuffer = Objects.requireNonNull(streamingBuffer);
            return this;
        }

        public Builder setTableReference(TableReferenceResponse tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }

        public Builder setTimePartitioning(TimePartitioningResponse timePartitioning) {
            this.timePartitioning = Objects.requireNonNull(timePartitioning);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setView(ViewDefinitionResponse view) {
            this.view = Objects.requireNonNull(view);
            return this;
        }

        public GetTableResult build() {
            return new GetTableResult(clustering, creationTime, defaultCollation, description, encryptionConfiguration, etag, expirationTime, externalDataConfiguration, friendlyName, kind, labels, lastModifiedTime, location, materializedView, model, numBytes, numLongTermBytes, numPhysicalBytes, numRows, rangePartitioning, requirePartitionFilter, schema, selfLink, snapshotDefinition, streamingBuffer, tableReference, timePartitioning, type, view);
        }
    }
}
