// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2OutputStorageConfigOutputSchema;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud repository for storing output.
 * 
 */
public final class GooglePrivacyDlpV2OutputStorageConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2OutputStorageConfigArgs Empty = new GooglePrivacyDlpV2OutputStorageConfigArgs();

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for Inspect and must be unspecified for Risk jobs. Columns are derived from the `Finding` object. If appending to an existing table, any columns from the predefined schema that are missing will be added. No columns in the existing table will be deleted. If unspecified, then all available columns will be used for a new table or an (existing) table with no schema, and no changes will be made to an existing table that has a schema. Only for use with external storage.
     * 
     */
    @InputImport(name="outputSchema")
    private final @Nullable Input<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema;

    public Input<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> getOutputSchema() {
        return this.outputSchema == null ? Input.empty() : this.outputSchema;
    }

    /**
     * Store findings in an existing table or a new table in an existing dataset. If table_id is not set a new one will be generated for you with the following format: dlp_googleapis_yyyy_mm_dd_[dlp_job_id]. Pacific timezone will be used for generating the date details. For Inspect, each column in an existing output table must have the same name, type, and mode of a field in the `Finding` object. For Risk, an existing output table should be the output of a previous Risk analysis job run on the same source table, with the same privacy metric and quasi-identifiers. Risk jobs that analyze the same table but compute a different privacy metric, or use different sets of quasi-identifiers, cannot store their results in the same table.
     * 
     */
    @InputImport(name="table")
    private final @Nullable Input<GooglePrivacyDlpV2BigQueryTableArgs> table;

    public Input<GooglePrivacyDlpV2BigQueryTableArgs> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    public GooglePrivacyDlpV2OutputStorageConfigArgs(
        @Nullable Input<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema,
        @Nullable Input<GooglePrivacyDlpV2BigQueryTableArgs> table) {
        this.outputSchema = outputSchema;
        this.table = table;
    }

    private GooglePrivacyDlpV2OutputStorageConfigArgs() {
        this.outputSchema = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2OutputStorageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema;
        private @Nullable Input<GooglePrivacyDlpV2BigQueryTableArgs> table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2OutputStorageConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSchema = defaults.outputSchema;
    	      this.table = defaults.table;
        }

        public Builder setOutputSchema(@Nullable Input<GooglePrivacyDlpV2OutputStorageConfigOutputSchema> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public Builder setOutputSchema(@Nullable GooglePrivacyDlpV2OutputStorageConfigOutputSchema outputSchema) {
            this.outputSchema = Input.ofNullable(outputSchema);
            return this;
        }

        public Builder setTable(@Nullable Input<GooglePrivacyDlpV2BigQueryTableArgs> table) {
            this.table = table;
            return this;
        }

        public Builder setTable(@Nullable GooglePrivacyDlpV2BigQueryTableArgs table) {
            this.table = Input.ofNullable(table);
            return this;
        }

        public GooglePrivacyDlpV2OutputStorageConfigArgs build() {
            return new GooglePrivacyDlpV2OutputStorageConfigArgs(outputSchema, table);
        }
    }
}
