// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1ColumnSchemaResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1beta1SchemaResponse {
    /**
     * Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
     * 
     */
    private final List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> columns;

    @OutputCustomType.Constructor({"columns"})
    private GoogleCloudDatacatalogV1beta1SchemaResponse(List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> columns) {
        this.columns = Objects.requireNonNull(columns);
    }

    /**
     * Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
     * 
     */
    public List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> getColumns() {
        return this.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1SchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1SchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(List<GoogleCloudDatacatalogV1beta1ColumnSchemaResponse> columns) {
            this.columns = Objects.requireNonNull(columns);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1SchemaResponse build() {
            return new GoogleCloudDatacatalogV1beta1SchemaResponse(columns);
        }
    }
}
