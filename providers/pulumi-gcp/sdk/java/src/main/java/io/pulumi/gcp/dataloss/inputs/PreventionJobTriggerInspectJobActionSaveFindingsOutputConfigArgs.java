// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs Empty = new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs();

    /**
     * Schema used for writing the findings for Inspect jobs. This field is only used for
     * Inspect and must be unspecified for Risk jobs. Columns are derived from the Finding
     * object. If appending to an existing table, any columns from the predefined schema
     * that are missing will be added. No columns in the existing table will be deleted.
     * If unspecified, then all available columns will be used for a new table or an (existing)
     * table with no schema, and no changes will be made to an existing table that has a schema.
     * Only for use with external storage.
     * Possible values are `BASIC_COLUMNS`, `GCS_COLUMNS`, `DATASTORE_COLUMNS`, `BIG_QUERY_COLUMNS`, and `ALL_COLUMNS`.
     * 
     */
    @InputImport(name="outputSchema")
    private final @Nullable Input<String> outputSchema;

    public Input<String> getOutputSchema() {
        return this.outputSchema == null ? Input.empty() : this.outputSchema;
    }

    /**
     * Information on the location of the target BigQuery Table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="table", required=true)
    private final Input<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs> table;

    public Input<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs> getTable() {
        return this.table;
    }

    public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs(
        @Nullable Input<String> outputSchema,
        Input<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs> table) {
        this.outputSchema = outputSchema;
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs() {
        this.outputSchema = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> outputSchema;
        private Input<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs> table;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputSchema = defaults.outputSchema;
    	      this.table = defaults.table;
        }

        public Builder setOutputSchema(@Nullable Input<String> outputSchema) {
            this.outputSchema = outputSchema;
            return this;
        }

        public Builder setOutputSchema(@Nullable String outputSchema) {
            this.outputSchema = Input.ofNullable(outputSchema);
            return this;
        }

        public Builder setTable(Input<PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setTable(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs table) {
            this.table = Input.of(Objects.requireNonNull(table));
            return this;
        }

        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigArgs(outputSchema, table);
        }
    }
}
