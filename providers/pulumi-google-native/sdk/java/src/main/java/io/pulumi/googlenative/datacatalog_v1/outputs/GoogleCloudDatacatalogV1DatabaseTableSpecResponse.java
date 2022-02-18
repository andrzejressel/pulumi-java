// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1DatabaseTableSpecResponse {
    /**
     * Type of this table.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"type"})
    private GoogleCloudDatacatalogV1DatabaseTableSpecResponse(String type) {
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Type of this table.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DatabaseTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DatabaseTableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudDatacatalogV1DatabaseTableSpecResponse build() {
            return new GoogleCloudDatacatalogV1DatabaseTableSpecResponse(type);
        }
    }
}
