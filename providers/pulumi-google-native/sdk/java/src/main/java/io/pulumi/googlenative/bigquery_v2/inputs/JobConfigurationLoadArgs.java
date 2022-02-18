// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.ClusteringArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.DestinationTablePropertiesArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.EncryptionConfigurationArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.HivePartitioningOptionsArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.ParquetOptionsArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.RangePartitioningArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableSchemaArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TimePartitioningArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationLoadArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationLoadArgs Empty = new JobConfigurationLoadArgs();

    /**
     * [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
     * 
     */
    @InputImport(name="allowJaggedRows")
    private final @Nullable Input<Boolean> allowJaggedRows;

    public Input<Boolean> getAllowJaggedRows() {
        return this.allowJaggedRows == null ? Input.empty() : this.allowJaggedRows;
    }

    /**
     * Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
     * 
     */
    @InputImport(name="allowQuotedNewlines")
    private final @Nullable Input<Boolean> allowQuotedNewlines;

    public Input<Boolean> getAllowQuotedNewlines() {
        return this.allowQuotedNewlines == null ? Input.empty() : this.allowQuotedNewlines;
    }

    /**
     * [Optional] Indicates if we should automatically infer the options and schema for CSV and JSON sources.
     * 
     */
    @InputImport(name="autodetect")
    private final @Nullable Input<Boolean> autodetect;

    public Input<Boolean> getAutodetect() {
        return this.autodetect == null ? Input.empty() : this.autodetect;
    }

    /**
     * [Beta] Clustering specification for the destination table. Must be specified with time-based partitioning, data in the table will be first partitioned and subsequently clustered.
     * 
     */
    @InputImport(name="clustering")
    private final @Nullable Input<ClusteringArgs> clustering;

    public Input<ClusteringArgs> getClustering() {
        return this.clustering == null ? Input.empty() : this.clustering;
    }

    /**
     * [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @InputImport(name="createDisposition")
    private final @Nullable Input<String> createDisposition;

    public Input<String> getCreateDisposition() {
        return this.createDisposition == null ? Input.empty() : this.createDisposition;
    }

    /**
     * [Optional] Defines the list of possible SQL data types to which the source decimal values are converted. This list and the precision and the scale parameters of the decimal field determine the target type. In the order of NUMERIC, BIGNUMERIC, and STRING, a type is picked if it is in the specified list and if it supports the precision and the scale. STRING supports all precision and scale values. If none of the listed types supports the precision and the scale, the type supporting the widest range in the specified list is picked, and if a value exceeds the supported range when reading the data, an error will be thrown. Example: Suppose the value of this field is ["NUMERIC", "BIGNUMERIC"]. If (precision,scale) is: (38,9) -> NUMERIC; (39,9) -> BIGNUMERIC (NUMERIC cannot hold 30 integer digits); (38,10) -> BIGNUMERIC (NUMERIC cannot hold 10 fractional digits); (76,38) -> BIGNUMERIC; (77,38) -> BIGNUMERIC (error if value exeeds supported range). This field cannot contain duplicate types. The order of the types in this field is ignored. For example, ["BIGNUMERIC", "NUMERIC"] is the same as ["NUMERIC", "BIGNUMERIC"] and NUMERIC always takes precedence over BIGNUMERIC. Defaults to ["NUMERIC", "STRING"] for ORC and ["NUMERIC"] for the other file formats.
     * 
     */
    @InputImport(name="decimalTargetTypes")
    private final @Nullable Input<List<String>> decimalTargetTypes;

    public Input<List<String>> getDecimalTargetTypes() {
        return this.decimalTargetTypes == null ? Input.empty() : this.decimalTargetTypes;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys).
     * 
     */
    @InputImport(name="destinationEncryptionConfiguration")
    private final @Nullable Input<EncryptionConfigurationArgs> destinationEncryptionConfiguration;

    public Input<EncryptionConfigurationArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Input.empty() : this.destinationEncryptionConfiguration;
    }

    /**
     * [Required] The destination table to load the data into.
     * 
     */
    @InputImport(name="destinationTable")
    private final @Nullable Input<TableReferenceArgs> destinationTable;

    public Input<TableReferenceArgs> getDestinationTable() {
        return this.destinationTable == null ? Input.empty() : this.destinationTable;
    }

    /**
     * [Beta] [Optional] Properties with which to create the destination table if it is new.
     * 
     */
    @InputImport(name="destinationTableProperties")
    private final @Nullable Input<DestinationTablePropertiesArgs> destinationTableProperties;

    public Input<DestinationTablePropertiesArgs> getDestinationTableProperties() {
        return this.destinationTableProperties == null ? Input.empty() : this.destinationTableProperties;
    }

    /**
     * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single-byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
     * 
     */
    @InputImport(name="fieldDelimiter")
    private final @Nullable Input<String> fieldDelimiter;

    public Input<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Input.empty() : this.fieldDelimiter;
    }

    /**
     * [Optional] Options to configure hive partitioning support.
     * 
     */
    @InputImport(name="hivePartitioningOptions")
    private final @Nullable Input<HivePartitioningOptionsArgs> hivePartitioningOptions;

    public Input<HivePartitioningOptionsArgs> getHivePartitioningOptions() {
        return this.hivePartitioningOptions == null ? Input.empty() : this.hivePartitioningOptions;
    }

    /**
     * [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
     * 
     */
    @InputImport(name="ignoreUnknownValues")
    private final @Nullable Input<Boolean> ignoreUnknownValues;

    public Input<Boolean> getIgnoreUnknownValues() {
        return this.ignoreUnknownValues == null ? Input.empty() : this.ignoreUnknownValues;
    }

    /**
     * [Optional] If sourceFormat is set to newline-delimited JSON, indicates whether it should be processed as a JSON variant such as GeoJSON. For a sourceFormat other than JSON, omit this field. If the sourceFormat is newline-delimited JSON: - for newline-delimited GeoJSON: set to GEOJSON.
     * 
     */
    @InputImport(name="jsonExtension")
    private final @Nullable Input<String> jsonExtension;

    public Input<String> getJsonExtension() {
        return this.jsonExtension == null ? Input.empty() : this.jsonExtension;
    }

    /**
     * [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. This is only valid for CSV and JSON. The default value is 0, which requires that all records are valid.
     * 
     */
    @InputImport(name="maxBadRecords")
    private final @Nullable Input<Integer> maxBadRecords;

    public Input<Integer> getMaxBadRecords() {
        return this.maxBadRecords == null ? Input.empty() : this.maxBadRecords;
    }

    /**
     * [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
     * 
     */
    @InputImport(name="nullMarker")
    private final @Nullable Input<String> nullMarker;

    public Input<String> getNullMarker() {
        return this.nullMarker == null ? Input.empty() : this.nullMarker;
    }

    /**
     * [Optional] Options to configure parquet support.
     * 
     */
    @InputImport(name="parquetOptions")
    private final @Nullable Input<ParquetOptionsArgs> parquetOptions;

    public Input<ParquetOptionsArgs> getParquetOptions() {
        return this.parquetOptions == null ? Input.empty() : this.parquetOptions;
    }

    /**
     * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.
     * 
     */
    @InputImport(name="projectionFields")
    private final @Nullable Input<List<String>> projectionFields;

    public Input<List<String>> getProjectionFields() {
        return this.projectionFields == null ? Input.empty() : this.projectionFields;
    }

    /**
     * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
     * 
     */
    @InputImport(name="quote")
    private final @Nullable Input<String> quote;

    public Input<String> getQuote() {
        return this.quote == null ? Input.empty() : this.quote;
    }

    /**
     * [TrustedTester] Range partitioning specification for this table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @InputImport(name="rangePartitioning")
    private final @Nullable Input<RangePartitioningArgs> rangePartitioning;

    public Input<RangePartitioningArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Input.empty() : this.rangePartitioning;
    }

    /**
     * [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from Google Cloud Datastore.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<TableSchemaArgs> schema;

    public Input<TableSchemaArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Allows the schema of the destination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
     * 
     */
    @InputImport(name="schemaUpdateOptions")
    private final @Nullable Input<List<String>> schemaUpdateOptions;

    public Input<List<String>> getSchemaUpdateOptions() {
        return this.schemaUpdateOptions == null ? Input.empty() : this.schemaUpdateOptions;
    }

    /**
     * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
     * 
     */
    @InputImport(name="skipLeadingRows")
    private final @Nullable Input<Integer> skipLeadingRows;

    public Input<Integer> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Input.empty() : this.skipLeadingRows;
    }

    /**
     * [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". For parquet, specify "PARQUET". For orc, specify "ORC". The default value is CSV.
     * 
     */
    @InputImport(name="sourceFormat")
    private final @Nullable Input<String> sourceFormat;

    public Input<String> getSourceFormat() {
        return this.sourceFormat == null ? Input.empty() : this.sourceFormat;
    }

    /**
     * [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
     * 
     */
    @InputImport(name="sourceUris")
    private final @Nullable Input<List<String>> sourceUris;

    public Input<List<String>> getSourceUris() {
        return this.sourceUris == null ? Input.empty() : this.sourceUris;
    }

    /**
     * Time-based partitioning specification for the destination table. Only one of timePartitioning and rangePartitioning should be specified.
     * 
     */
    @InputImport(name="timePartitioning")
    private final @Nullable Input<TimePartitioningArgs> timePartitioning;

    public Input<TimePartitioningArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Input.empty() : this.timePartitioning;
    }

    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
     */
    @InputImport(name="useAvroLogicalTypes")
    private final @Nullable Input<Boolean> useAvroLogicalTypes;

    public Input<Boolean> getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes == null ? Input.empty() : this.useAvroLogicalTypes;
    }

    /**
     * [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
     * 
     */
    @InputImport(name="writeDisposition")
    private final @Nullable Input<String> writeDisposition;

    public Input<String> getWriteDisposition() {
        return this.writeDisposition == null ? Input.empty() : this.writeDisposition;
    }

    public JobConfigurationLoadArgs(
        @Nullable Input<Boolean> allowJaggedRows,
        @Nullable Input<Boolean> allowQuotedNewlines,
        @Nullable Input<Boolean> autodetect,
        @Nullable Input<ClusteringArgs> clustering,
        @Nullable Input<String> createDisposition,
        @Nullable Input<List<String>> decimalTargetTypes,
        @Nullable Input<EncryptionConfigurationArgs> destinationEncryptionConfiguration,
        @Nullable Input<TableReferenceArgs> destinationTable,
        @Nullable Input<DestinationTablePropertiesArgs> destinationTableProperties,
        @Nullable Input<String> encoding,
        @Nullable Input<String> fieldDelimiter,
        @Nullable Input<HivePartitioningOptionsArgs> hivePartitioningOptions,
        @Nullable Input<Boolean> ignoreUnknownValues,
        @Nullable Input<String> jsonExtension,
        @Nullable Input<Integer> maxBadRecords,
        @Nullable Input<String> nullMarker,
        @Nullable Input<ParquetOptionsArgs> parquetOptions,
        @Nullable Input<List<String>> projectionFields,
        @Nullable Input<String> quote,
        @Nullable Input<RangePartitioningArgs> rangePartitioning,
        @Nullable Input<TableSchemaArgs> schema,
        @Nullable Input<List<String>> schemaUpdateOptions,
        @Nullable Input<Integer> skipLeadingRows,
        @Nullable Input<String> sourceFormat,
        @Nullable Input<List<String>> sourceUris,
        @Nullable Input<TimePartitioningArgs> timePartitioning,
        @Nullable Input<Boolean> useAvroLogicalTypes,
        @Nullable Input<String> writeDisposition) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.autodetect = autodetect;
        this.clustering = clustering;
        this.createDisposition = createDisposition;
        this.decimalTargetTypes = decimalTargetTypes;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.destinationTableProperties = destinationTableProperties;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.hivePartitioningOptions = hivePartitioningOptions;
        this.ignoreUnknownValues = ignoreUnknownValues;
        this.jsonExtension = jsonExtension;
        this.maxBadRecords = maxBadRecords;
        this.nullMarker = nullMarker;
        this.parquetOptions = parquetOptions;
        this.projectionFields = projectionFields;
        this.quote = quote;
        this.rangePartitioning = rangePartitioning;
        this.schema = schema;
        this.schemaUpdateOptions = schemaUpdateOptions;
        this.skipLeadingRows = skipLeadingRows;
        this.sourceFormat = sourceFormat;
        this.sourceUris = sourceUris;
        this.timePartitioning = timePartitioning;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
        this.writeDisposition = writeDisposition;
    }

    private JobConfigurationLoadArgs() {
        this.allowJaggedRows = Input.empty();
        this.allowQuotedNewlines = Input.empty();
        this.autodetect = Input.empty();
        this.clustering = Input.empty();
        this.createDisposition = Input.empty();
        this.decimalTargetTypes = Input.empty();
        this.destinationEncryptionConfiguration = Input.empty();
        this.destinationTable = Input.empty();
        this.destinationTableProperties = Input.empty();
        this.encoding = Input.empty();
        this.fieldDelimiter = Input.empty();
        this.hivePartitioningOptions = Input.empty();
        this.ignoreUnknownValues = Input.empty();
        this.jsonExtension = Input.empty();
        this.maxBadRecords = Input.empty();
        this.nullMarker = Input.empty();
        this.parquetOptions = Input.empty();
        this.projectionFields = Input.empty();
        this.quote = Input.empty();
        this.rangePartitioning = Input.empty();
        this.schema = Input.empty();
        this.schemaUpdateOptions = Input.empty();
        this.skipLeadingRows = Input.empty();
        this.sourceFormat = Input.empty();
        this.sourceUris = Input.empty();
        this.timePartitioning = Input.empty();
        this.useAvroLogicalTypes = Input.empty();
        this.writeDisposition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationLoadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowJaggedRows;
        private @Nullable Input<Boolean> allowQuotedNewlines;
        private @Nullable Input<Boolean> autodetect;
        private @Nullable Input<ClusteringArgs> clustering;
        private @Nullable Input<String> createDisposition;
        private @Nullable Input<List<String>> decimalTargetTypes;
        private @Nullable Input<EncryptionConfigurationArgs> destinationEncryptionConfiguration;
        private @Nullable Input<TableReferenceArgs> destinationTable;
        private @Nullable Input<DestinationTablePropertiesArgs> destinationTableProperties;
        private @Nullable Input<String> encoding;
        private @Nullable Input<String> fieldDelimiter;
        private @Nullable Input<HivePartitioningOptionsArgs> hivePartitioningOptions;
        private @Nullable Input<Boolean> ignoreUnknownValues;
        private @Nullable Input<String> jsonExtension;
        private @Nullable Input<Integer> maxBadRecords;
        private @Nullable Input<String> nullMarker;
        private @Nullable Input<ParquetOptionsArgs> parquetOptions;
        private @Nullable Input<List<String>> projectionFields;
        private @Nullable Input<String> quote;
        private @Nullable Input<RangePartitioningArgs> rangePartitioning;
        private @Nullable Input<TableSchemaArgs> schema;
        private @Nullable Input<List<String>> schemaUpdateOptions;
        private @Nullable Input<Integer> skipLeadingRows;
        private @Nullable Input<String> sourceFormat;
        private @Nullable Input<List<String>> sourceUris;
        private @Nullable Input<TimePartitioningArgs> timePartitioning;
        private @Nullable Input<Boolean> useAvroLogicalTypes;
        private @Nullable Input<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationLoadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.autodetect = defaults.autodetect;
    	      this.clustering = defaults.clustering;
    	      this.createDisposition = defaults.createDisposition;
    	      this.decimalTargetTypes = defaults.decimalTargetTypes;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.destinationTableProperties = defaults.destinationTableProperties;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.jsonExtension = defaults.jsonExtension;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.nullMarker = defaults.nullMarker;
    	      this.parquetOptions = defaults.parquetOptions;
    	      this.projectionFields = defaults.projectionFields;
    	      this.quote = defaults.quote;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.schemaUpdateOptions = defaults.schemaUpdateOptions;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setAllowJaggedRows(@Nullable Input<Boolean> allowJaggedRows) {
            this.allowJaggedRows = allowJaggedRows;
            return this;
        }

        public Builder setAllowJaggedRows(@Nullable Boolean allowJaggedRows) {
            this.allowJaggedRows = Input.ofNullable(allowJaggedRows);
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Input<Boolean> allowQuotedNewlines) {
            this.allowQuotedNewlines = allowQuotedNewlines;
            return this;
        }

        public Builder setAllowQuotedNewlines(@Nullable Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = Input.ofNullable(allowQuotedNewlines);
            return this;
        }

        public Builder setAutodetect(@Nullable Input<Boolean> autodetect) {
            this.autodetect = autodetect;
            return this;
        }

        public Builder setAutodetect(@Nullable Boolean autodetect) {
            this.autodetect = Input.ofNullable(autodetect);
            return this;
        }

        public Builder setClustering(@Nullable Input<ClusteringArgs> clustering) {
            this.clustering = clustering;
            return this;
        }

        public Builder setClustering(@Nullable ClusteringArgs clustering) {
            this.clustering = Input.ofNullable(clustering);
            return this;
        }

        public Builder setCreateDisposition(@Nullable Input<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder setCreateDisposition(@Nullable String createDisposition) {
            this.createDisposition = Input.ofNullable(createDisposition);
            return this;
        }

        public Builder setDecimalTargetTypes(@Nullable Input<List<String>> decimalTargetTypes) {
            this.decimalTargetTypes = decimalTargetTypes;
            return this;
        }

        public Builder setDecimalTargetTypes(@Nullable List<String> decimalTargetTypes) {
            this.decimalTargetTypes = Input.ofNullable(decimalTargetTypes);
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable Input<EncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable EncryptionConfigurationArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Input.ofNullable(destinationEncryptionConfiguration);
            return this;
        }

        public Builder setDestinationTable(@Nullable Input<TableReferenceArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder setDestinationTable(@Nullable TableReferenceArgs destinationTable) {
            this.destinationTable = Input.ofNullable(destinationTable);
            return this;
        }

        public Builder setDestinationTableProperties(@Nullable Input<DestinationTablePropertiesArgs> destinationTableProperties) {
            this.destinationTableProperties = destinationTableProperties;
            return this;
        }

        public Builder setDestinationTableProperties(@Nullable DestinationTablePropertiesArgs destinationTableProperties) {
            this.destinationTableProperties = Input.ofNullable(destinationTableProperties);
            return this;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setFieldDelimiter(@Nullable Input<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder setFieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Input.ofNullable(fieldDelimiter);
            return this;
        }

        public Builder setHivePartitioningOptions(@Nullable Input<HivePartitioningOptionsArgs> hivePartitioningOptions) {
            this.hivePartitioningOptions = hivePartitioningOptions;
            return this;
        }

        public Builder setHivePartitioningOptions(@Nullable HivePartitioningOptionsArgs hivePartitioningOptions) {
            this.hivePartitioningOptions = Input.ofNullable(hivePartitioningOptions);
            return this;
        }

        public Builder setIgnoreUnknownValues(@Nullable Input<Boolean> ignoreUnknownValues) {
            this.ignoreUnknownValues = ignoreUnknownValues;
            return this;
        }

        public Builder setIgnoreUnknownValues(@Nullable Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = Input.ofNullable(ignoreUnknownValues);
            return this;
        }

        public Builder setJsonExtension(@Nullable Input<String> jsonExtension) {
            this.jsonExtension = jsonExtension;
            return this;
        }

        public Builder setJsonExtension(@Nullable String jsonExtension) {
            this.jsonExtension = Input.ofNullable(jsonExtension);
            return this;
        }

        public Builder setMaxBadRecords(@Nullable Input<Integer> maxBadRecords) {
            this.maxBadRecords = maxBadRecords;
            return this;
        }

        public Builder setMaxBadRecords(@Nullable Integer maxBadRecords) {
            this.maxBadRecords = Input.ofNullable(maxBadRecords);
            return this;
        }

        public Builder setNullMarker(@Nullable Input<String> nullMarker) {
            this.nullMarker = nullMarker;
            return this;
        }

        public Builder setNullMarker(@Nullable String nullMarker) {
            this.nullMarker = Input.ofNullable(nullMarker);
            return this;
        }

        public Builder setParquetOptions(@Nullable Input<ParquetOptionsArgs> parquetOptions) {
            this.parquetOptions = parquetOptions;
            return this;
        }

        public Builder setParquetOptions(@Nullable ParquetOptionsArgs parquetOptions) {
            this.parquetOptions = Input.ofNullable(parquetOptions);
            return this;
        }

        public Builder setProjectionFields(@Nullable Input<List<String>> projectionFields) {
            this.projectionFields = projectionFields;
            return this;
        }

        public Builder setProjectionFields(@Nullable List<String> projectionFields) {
            this.projectionFields = Input.ofNullable(projectionFields);
            return this;
        }

        public Builder setQuote(@Nullable Input<String> quote) {
            this.quote = quote;
            return this;
        }

        public Builder setQuote(@Nullable String quote) {
            this.quote = Input.ofNullable(quote);
            return this;
        }

        public Builder setRangePartitioning(@Nullable Input<RangePartitioningArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }

        public Builder setRangePartitioning(@Nullable RangePartitioningArgs rangePartitioning) {
            this.rangePartitioning = Input.ofNullable(rangePartitioning);
            return this;
        }

        public Builder setSchema(@Nullable Input<TableSchemaArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable TableSchemaArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setSchemaUpdateOptions(@Nullable Input<List<String>> schemaUpdateOptions) {
            this.schemaUpdateOptions = schemaUpdateOptions;
            return this;
        }

        public Builder setSchemaUpdateOptions(@Nullable List<String> schemaUpdateOptions) {
            this.schemaUpdateOptions = Input.ofNullable(schemaUpdateOptions);
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Input<Integer> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = Input.ofNullable(skipLeadingRows);
            return this;
        }

        public Builder setSourceFormat(@Nullable Input<String> sourceFormat) {
            this.sourceFormat = sourceFormat;
            return this;
        }

        public Builder setSourceFormat(@Nullable String sourceFormat) {
            this.sourceFormat = Input.ofNullable(sourceFormat);
            return this;
        }

        public Builder setSourceUris(@Nullable Input<List<String>> sourceUris) {
            this.sourceUris = sourceUris;
            return this;
        }

        public Builder setSourceUris(@Nullable List<String> sourceUris) {
            this.sourceUris = Input.ofNullable(sourceUris);
            return this;
        }

        public Builder setTimePartitioning(@Nullable Input<TimePartitioningArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }

        public Builder setTimePartitioning(@Nullable TimePartitioningArgs timePartitioning) {
            this.timePartitioning = Input.ofNullable(timePartitioning);
            return this;
        }

        public Builder setUseAvroLogicalTypes(@Nullable Input<Boolean> useAvroLogicalTypes) {
            this.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }

        public Builder setUseAvroLogicalTypes(@Nullable Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Input.ofNullable(useAvroLogicalTypes);
            return this;
        }

        public Builder setWriteDisposition(@Nullable Input<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder setWriteDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Input.ofNullable(writeDisposition);
            return this;
        }

        public JobConfigurationLoadArgs build() {
            return new JobConfigurationLoadArgs(allowJaggedRows, allowQuotedNewlines, autodetect, clustering, createDisposition, decimalTargetTypes, destinationEncryptionConfiguration, destinationTable, destinationTableProperties, encoding, fieldDelimiter, hivePartitioningOptions, ignoreUnknownValues, jsonExtension, maxBadRecords, nullMarker, parquetOptions, projectionFields, quote, rangePartitioning, schema, schemaUpdateOptions, skipLeadingRows, sourceFormat, sourceUris, timePartitioning, useAvroLogicalTypes, writeDisposition);
        }
    }
}
