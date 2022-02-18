// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.OracleColumnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle table.
 * 
 */
public final class OracleTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleTableArgs Empty = new OracleTableArgs();

    /**
     * Oracle columns in the schema. When unspecified as part of inclue/exclude lists, includes/excludes everything.
     * 
     */
    @InputImport(name="oracleColumns")
    private final @Nullable Input<List<OracleColumnArgs>> oracleColumns;

    public Input<List<OracleColumnArgs>> getOracleColumns() {
        return this.oracleColumns == null ? Input.empty() : this.oracleColumns;
    }

    /**
     * Table name.
     * 
     */
    @InputImport(name="table")
    private final @Nullable Input<String> table;

    public Input<String> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    public OracleTableArgs(
        @Nullable Input<List<OracleColumnArgs>> oracleColumns,
        @Nullable Input<String> table) {
        this.oracleColumns = oracleColumns;
        this.table = table;
    }

    private OracleTableArgs() {
        this.oracleColumns = Input.empty();
        this.table = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OracleColumnArgs>> oracleColumns;
        private @Nullable Input<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleColumns = defaults.oracleColumns;
    	      this.table = defaults.table;
        }

        public Builder setOracleColumns(@Nullable Input<List<OracleColumnArgs>> oracleColumns) {
            this.oracleColumns = oracleColumns;
            return this;
        }

        public Builder setOracleColumns(@Nullable List<OracleColumnArgs> oracleColumns) {
            this.oracleColumns = Input.ofNullable(oracleColumns);
            return this;
        }

        public Builder setTable(@Nullable Input<String> table) {
            this.table = table;
            return this;
        }

        public Builder setTable(@Nullable String table) {
            this.table = Input.ofNullable(table);
            return this;
        }

        public OracleTableArgs build() {
            return new OracleTableArgs(oracleColumns, table);
        }
    }
}
