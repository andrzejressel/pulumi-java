// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.BigtableColumnFamilyResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class BigtableOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BigtableOptionsResponse Empty = new BigtableOptionsResponse();

    /**
     * [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
     * 
     */
    @InputImport(name="columnFamilies", required=true)
    private final List<BigtableColumnFamilyResponse> columnFamilies;

    public List<BigtableColumnFamilyResponse> getColumnFamilies() {
        return this.columnFamilies;
    }

    /**
     * [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.
     * 
     */
    @InputImport(name="ignoreUnspecifiedColumnFamilies", required=true)
    private final Boolean ignoreUnspecifiedColumnFamilies;

    public Boolean getIgnoreUnspecifiedColumnFamilies() {
        return this.ignoreUnspecifiedColumnFamilies;
    }

    /**
     * [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.
     * 
     */
    @InputImport(name="readRowkeyAsString", required=true)
    private final Boolean readRowkeyAsString;

    public Boolean getReadRowkeyAsString() {
        return this.readRowkeyAsString;
    }

    public BigtableOptionsResponse(
        List<BigtableColumnFamilyResponse> columnFamilies,
        Boolean ignoreUnspecifiedColumnFamilies,
        Boolean readRowkeyAsString) {
        this.columnFamilies = Objects.requireNonNull(columnFamilies, "expected parameter 'columnFamilies' to be non-null");
        this.ignoreUnspecifiedColumnFamilies = Objects.requireNonNull(ignoreUnspecifiedColumnFamilies, "expected parameter 'ignoreUnspecifiedColumnFamilies' to be non-null");
        this.readRowkeyAsString = Objects.requireNonNull(readRowkeyAsString, "expected parameter 'readRowkeyAsString' to be non-null");
    }

    private BigtableOptionsResponse() {
        this.columnFamilies = List.of();
        this.ignoreUnspecifiedColumnFamilies = null;
        this.readRowkeyAsString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigtableOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BigtableColumnFamilyResponse> columnFamilies;
        private Boolean ignoreUnspecifiedColumnFamilies;
        private Boolean readRowkeyAsString;

        public Builder() {
    	      // Empty
        }

        public Builder(BigtableOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFamilies = defaults.columnFamilies;
    	      this.ignoreUnspecifiedColumnFamilies = defaults.ignoreUnspecifiedColumnFamilies;
    	      this.readRowkeyAsString = defaults.readRowkeyAsString;
        }

        public Builder setColumnFamilies(List<BigtableColumnFamilyResponse> columnFamilies) {
            this.columnFamilies = Objects.requireNonNull(columnFamilies);
            return this;
        }

        public Builder setIgnoreUnspecifiedColumnFamilies(Boolean ignoreUnspecifiedColumnFamilies) {
            this.ignoreUnspecifiedColumnFamilies = Objects.requireNonNull(ignoreUnspecifiedColumnFamilies);
            return this;
        }

        public Builder setReadRowkeyAsString(Boolean readRowkeyAsString) {
            this.readRowkeyAsString = Objects.requireNonNull(readRowkeyAsString);
            return this;
        }

        public BigtableOptionsResponse build() {
            return new BigtableOptionsResponse(columnFamilies, ignoreUnspecifiedColumnFamilies, readRowkeyAsString);
        }
    }
}
