// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelReferenceArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationExtractArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationExtractArgs Empty = new JobConfigurationExtractArgs();

    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    @InputImport(name="compression")
    private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    @InputImport(name="destinationFormat")
    private final @Nullable Input<String> destinationFormat;

    public Input<String> getDestinationFormat() {
        return this.destinationFormat == null ? Input.empty() : this.destinationFormat;
    }

    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    @InputImport(name="destinationUri")
    private final @Nullable Input<String> destinationUri;

    public Input<String> getDestinationUri() {
        return this.destinationUri == null ? Input.empty() : this.destinationUri;
    }

    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @InputImport(name="destinationUris")
    private final @Nullable Input<List<String>> destinationUris;

    public Input<List<String>> getDestinationUris() {
        return this.destinationUris == null ? Input.empty() : this.destinationUris;
    }

    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
     * 
     */
    @InputImport(name="fieldDelimiter")
    private final @Nullable Input<String> fieldDelimiter;

    public Input<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Input.empty() : this.fieldDelimiter;
    }

    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    @InputImport(name="printHeader")
    private final @Nullable Input<Boolean> printHeader;

    public Input<Boolean> getPrintHeader() {
        return this.printHeader == null ? Input.empty() : this.printHeader;
    }

    /**
     * A reference to the model being exported.
     * 
     */
    @InputImport(name="sourceModel")
    private final @Nullable Input<ModelReferenceArgs> sourceModel;

    public Input<ModelReferenceArgs> getSourceModel() {
        return this.sourceModel == null ? Input.empty() : this.sourceModel;
    }

    /**
     * A reference to the table being exported.
     * 
     */
    @InputImport(name="sourceTable")
    private final @Nullable Input<TableReferenceArgs> sourceTable;

    public Input<TableReferenceArgs> getSourceTable() {
        return this.sourceTable == null ? Input.empty() : this.sourceTable;
    }

    /**
     * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    @InputImport(name="useAvroLogicalTypes")
    private final @Nullable Input<Boolean> useAvroLogicalTypes;

    public Input<Boolean> getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes == null ? Input.empty() : this.useAvroLogicalTypes;
    }

    public JobConfigurationExtractArgs(
        @Nullable Input<String> compression,
        @Nullable Input<String> destinationFormat,
        @Nullable Input<String> destinationUri,
        @Nullable Input<List<String>> destinationUris,
        @Nullable Input<String> fieldDelimiter,
        @Nullable Input<Boolean> printHeader,
        @Nullable Input<ModelReferenceArgs> sourceModel,
        @Nullable Input<TableReferenceArgs> sourceTable,
        @Nullable Input<Boolean> useAvroLogicalTypes) {
        this.compression = compression;
        this.destinationFormat = destinationFormat;
        this.destinationUri = destinationUri;
        this.destinationUris = destinationUris;
        this.fieldDelimiter = fieldDelimiter;
        this.printHeader = printHeader;
        this.sourceModel = sourceModel;
        this.sourceTable = sourceTable;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    private JobConfigurationExtractArgs() {
        this.compression = Input.empty();
        this.destinationFormat = Input.empty();
        this.destinationUri = Input.empty();
        this.destinationUris = Input.empty();
        this.fieldDelimiter = Input.empty();
        this.printHeader = Input.empty();
        this.sourceModel = Input.empty();
        this.sourceTable = Input.empty();
        this.useAvroLogicalTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> compression;
        private @Nullable Input<String> destinationFormat;
        private @Nullable Input<String> destinationUri;
        private @Nullable Input<List<String>> destinationUris;
        private @Nullable Input<String> fieldDelimiter;
        private @Nullable Input<Boolean> printHeader;
        private @Nullable Input<ModelReferenceArgs> sourceModel;
        private @Nullable Input<TableReferenceArgs> sourceTable;
        private @Nullable Input<Boolean> useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationExtractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUri = defaults.destinationUri;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setDestinationFormat(@Nullable Input<String> destinationFormat) {
            this.destinationFormat = destinationFormat;
            return this;
        }

        public Builder setDestinationFormat(@Nullable String destinationFormat) {
            this.destinationFormat = Input.ofNullable(destinationFormat);
            return this;
        }

        public Builder setDestinationUri(@Nullable Input<String> destinationUri) {
            this.destinationUri = destinationUri;
            return this;
        }

        public Builder setDestinationUri(@Nullable String destinationUri) {
            this.destinationUri = Input.ofNullable(destinationUri);
            return this;
        }

        public Builder setDestinationUris(@Nullable Input<List<String>> destinationUris) {
            this.destinationUris = destinationUris;
            return this;
        }

        public Builder setDestinationUris(@Nullable List<String> destinationUris) {
            this.destinationUris = Input.ofNullable(destinationUris);
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

        public Builder setPrintHeader(@Nullable Input<Boolean> printHeader) {
            this.printHeader = printHeader;
            return this;
        }

        public Builder setPrintHeader(@Nullable Boolean printHeader) {
            this.printHeader = Input.ofNullable(printHeader);
            return this;
        }

        public Builder setSourceModel(@Nullable Input<ModelReferenceArgs> sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }

        public Builder setSourceModel(@Nullable ModelReferenceArgs sourceModel) {
            this.sourceModel = Input.ofNullable(sourceModel);
            return this;
        }

        public Builder setSourceTable(@Nullable Input<TableReferenceArgs> sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }

        public Builder setSourceTable(@Nullable TableReferenceArgs sourceTable) {
            this.sourceTable = Input.ofNullable(sourceTable);
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

        public JobConfigurationExtractArgs build() {
            return new JobConfigurationExtractArgs(compression, destinationFormat, destinationUri, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
