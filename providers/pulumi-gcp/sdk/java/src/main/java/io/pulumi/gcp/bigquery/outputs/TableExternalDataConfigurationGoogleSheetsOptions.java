// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableExternalDataConfigurationGoogleSheetsOptions {
    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    private final @Nullable String range;
    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    private final @Nullable Integer skipLeadingRows;

    @OutputCustomType.Constructor({"range","skipLeadingRows"})
    private TableExternalDataConfigurationGoogleSheetsOptions(
        @Nullable String range,
        @Nullable Integer skipLeadingRows) {
        this.range = range;
        this.skipLeadingRows = skipLeadingRows;
    }

    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    public Optional<String> getRange() {
        return Optional.ofNullable(this.range);
    }
    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    public Optional<Integer> getSkipLeadingRows() {
        return Optional.ofNullable(this.skipLeadingRows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationGoogleSheetsOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String range;
        private @Nullable Integer skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationGoogleSheetsOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setRange(@Nullable String range) {
            this.range = range;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public TableExternalDataConfigurationGoogleSheetsOptions build() {
            return new TableExternalDataConfigurationGoogleSheetsOptions(range, skipLeadingRows);
        }
    }
}
