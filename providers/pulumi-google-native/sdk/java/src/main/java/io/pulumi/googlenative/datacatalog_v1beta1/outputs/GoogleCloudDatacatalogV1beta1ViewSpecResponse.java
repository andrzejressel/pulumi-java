// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1beta1ViewSpecResponse {
    /**
     * The query that defines the table view.
     * 
     */
    private final String viewQuery;

    @OutputCustomType.Constructor({"viewQuery"})
    private GoogleCloudDatacatalogV1beta1ViewSpecResponse(String viewQuery) {
        this.viewQuery = Objects.requireNonNull(viewQuery);
    }

    /**
     * The query that defines the table view.
     * 
     */
    public String getViewQuery() {
        return this.viewQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1ViewSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String viewQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1ViewSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.viewQuery = defaults.viewQuery;
        }

        public Builder setViewQuery(String viewQuery) {
            this.viewQuery = Objects.requireNonNull(viewQuery);
            return this;
        }

        public GoogleCloudDatacatalogV1beta1ViewSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1ViewSpecResponse(viewQuery);
        }
    }
}
