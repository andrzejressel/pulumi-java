// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs();

    /**
     * Designated field in the BigQuery table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="field", required=true)
    private final Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs> field;

    public Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs> getField() {
        return this.field;
    }

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    @InputImport(name="table", required=true)
    private final Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs> table;

    public Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs> getTable() {
        return this.table;
    }

    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs(
        Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs> field,
        Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs> table) {
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.table = Objects.requireNonNull(table, "expected parameter 'table' to be non-null");
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs() {
        this.field = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs> field;
        private Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs> table;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.table = defaults.table;
        }

        public Builder setField(Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setField(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldFieldGetArgs field) {
            this.field = Input.of(Objects.requireNonNull(field));
            return this;
        }

        public Builder setTable(Input<PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs> table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public Builder setTable(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs table) {
            this.table = Input.of(Objects.requireNonNull(table));
            return this;
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldGetArgs(field, table);
        }
    }
}
