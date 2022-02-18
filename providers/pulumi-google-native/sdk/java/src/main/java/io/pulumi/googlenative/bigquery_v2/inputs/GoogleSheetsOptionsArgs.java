// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleSheetsOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleSheetsOptionsArgs Empty = new GoogleSheetsOptionsArgs();

    /**
     * [Optional] Range of a sheet to query from. Only used when non-empty. Typical format: sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
     * 
     */
    @InputImport(name="range")
    private final @Nullable Input<String> range;

    public Input<String> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    /**
     * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
     * 
     */
    @InputImport(name="skipLeadingRows")
    private final @Nullable Input<String> skipLeadingRows;

    public Input<String> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Input.empty() : this.skipLeadingRows;
    }

    public GoogleSheetsOptionsArgs(
        @Nullable Input<String> range,
        @Nullable Input<String> skipLeadingRows) {
        this.range = range;
        this.skipLeadingRows = skipLeadingRows;
    }

    private GoogleSheetsOptionsArgs() {
        this.range = Input.empty();
        this.skipLeadingRows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleSheetsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> range;
        private @Nullable Input<String> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleSheetsOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setRange(@Nullable Input<String> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable String range) {
            this.range = Input.ofNullable(range);
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Input<String> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable String skipLeadingRows) {
            this.skipLeadingRows = Input.ofNullable(skipLeadingRows);
            return this;
        }

        public GoogleSheetsOptionsArgs build() {
            return new GoogleSheetsOptionsArgs(range, skipLeadingRows);
        }
    }
}
