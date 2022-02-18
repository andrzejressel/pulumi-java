// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1TableSpecResponse;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GoogleCloudDatacatalogV1beta1ViewSpecResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a BigQuery table.
 * 
 */
public final class GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse Empty = new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse();

    /**
     * The table source type.
     * 
     */
    @InputImport(name="tableSourceType", required=true)
    private final String tableSourceType;

    public String getTableSourceType() {
        return this.tableSourceType;
    }

    /**
     * Spec of a BigQuery table. This field should only be populated if `table_source_type` is `BIGQUERY_TABLE`.
     * 
     */
    @InputImport(name="tableSpec", required=true)
    private final GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec;

    public GoogleCloudDatacatalogV1beta1TableSpecResponse getTableSpec() {
        return this.tableSpec;
    }

    /**
     * Table view specification. This field should only be populated if `table_source_type` is `BIGQUERY_VIEW`.
     * 
     */
    @InputImport(name="viewSpec", required=true)
    private final GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec;

    public GoogleCloudDatacatalogV1beta1ViewSpecResponse getViewSpec() {
        return this.viewSpec;
    }

    public GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(
        String tableSourceType,
        GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec,
        GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec) {
        this.tableSourceType = Objects.requireNonNull(tableSourceType, "expected parameter 'tableSourceType' to be non-null");
        this.tableSpec = Objects.requireNonNull(tableSpec, "expected parameter 'tableSpec' to be non-null");
        this.viewSpec = Objects.requireNonNull(viewSpec, "expected parameter 'viewSpec' to be non-null");
    }

    private GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse() {
        this.tableSourceType = null;
        this.tableSpec = null;
        this.viewSpec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableSourceType;
        private GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec;
        private GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpec = defaults.tableSpec;
    	      this.viewSpec = defaults.viewSpec;
        }

        public Builder setTableSourceType(String tableSourceType) {
            this.tableSourceType = Objects.requireNonNull(tableSourceType);
            return this;
        }

        public Builder setTableSpec(GoogleCloudDatacatalogV1beta1TableSpecResponse tableSpec) {
            this.tableSpec = Objects.requireNonNull(tableSpec);
            return this;
        }

        public Builder setViewSpec(GoogleCloudDatacatalogV1beta1ViewSpecResponse viewSpec) {
            this.viewSpec = Objects.requireNonNull(viewSpec);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1BigQueryTableSpecResponse(tableSourceType, tableSpec, viewSpec);
        }
    }
}
