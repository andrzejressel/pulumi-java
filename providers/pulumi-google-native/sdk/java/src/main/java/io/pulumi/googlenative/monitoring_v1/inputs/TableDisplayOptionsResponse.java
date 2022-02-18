// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Table display options that can be reused.
 * 
 */
public final class TableDisplayOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TableDisplayOptionsResponse Empty = new TableDisplayOptionsResponse();

    /**
     * Optional. Columns to display in the table. Leave empty to display all available columns. Note: This field is for future features and is not currently used.
     * 
     */
    @InputImport(name="shownColumns", required=true)
    private final List<String> shownColumns;

    public List<String> getShownColumns() {
        return this.shownColumns;
    }

    public TableDisplayOptionsResponse(List<String> shownColumns) {
        this.shownColumns = Objects.requireNonNull(shownColumns, "expected parameter 'shownColumns' to be non-null");
    }

    private TableDisplayOptionsResponse() {
        this.shownColumns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableDisplayOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> shownColumns;

        public Builder() {
    	      // Empty
        }

        public Builder(TableDisplayOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shownColumns = defaults.shownColumns;
        }

        public Builder setShownColumns(List<String> shownColumns) {
            this.shownColumns = Objects.requireNonNull(shownColumns);
            return this;
        }

        public TableDisplayOptionsResponse build() {
            return new TableDisplayOptionsResponse(shownColumns);
        }
    }
}
