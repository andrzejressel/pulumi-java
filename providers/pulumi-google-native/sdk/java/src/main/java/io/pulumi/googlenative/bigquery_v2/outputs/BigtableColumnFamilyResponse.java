// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.BigtableColumnResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BigtableColumnFamilyResponse {
    /**
     * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
     * 
     */
    private final List<BigtableColumnResponse> columns;
    /**
     * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
     * 
     */
    private final String encoding;
    /**
     * Identifier of the column family.
     * 
     */
    private final String familyId;
    /**
     * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.
     * 
     */
    private final Boolean onlyReadLatest;
    /**
     * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"columns","encoding","familyId","onlyReadLatest","type"})
    private BigtableColumnFamilyResponse(
        List<BigtableColumnResponse> columns,
        String encoding,
        String familyId,
        Boolean onlyReadLatest,
        String type) {
        this.columns = Objects.requireNonNull(columns);
        this.encoding = Objects.requireNonNull(encoding);
        this.familyId = Objects.requireNonNull(familyId);
        this.onlyReadLatest = Objects.requireNonNull(onlyReadLatest);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
     * 
     */
    public List<BigtableColumnResponse> getColumns() {
        return this.columns;
    }
    /**
     * [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
     * 
     */
    public String getEncoding() {
        return this.encoding;
    }
    /**
     * Identifier of the column family.
     * 
     */
    public String getFamilyId() {
        return this.familyId;
    }
    /**
     * [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.
     * 
     */
    public Boolean getOnlyReadLatest() {
        return this.onlyReadLatest;
    }
    /**
     * [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigtableColumnFamilyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BigtableColumnResponse> columns;
        private String encoding;
        private String familyId;
        private Boolean onlyReadLatest;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BigtableColumnFamilyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.encoding = defaults.encoding;
    	      this.familyId = defaults.familyId;
    	      this.onlyReadLatest = defaults.onlyReadLatest;
    	      this.type = defaults.type;
        }

        public Builder setColumns(List<BigtableColumnResponse> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setFamilyId(String familyId) {
            this.familyId = Objects.requireNonNull(familyId);
            return this;
        }

        public Builder setOnlyReadLatest(Boolean onlyReadLatest) {
            this.onlyReadLatest = Objects.requireNonNull(onlyReadLatest);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BigtableColumnFamilyResponse build() {
            return new BigtableColumnFamilyResponse(columns, encoding, familyId, onlyReadLatest, type);
        }
    }
}
