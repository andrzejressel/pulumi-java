// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class ParquetOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParquetOptionsResponse Empty = new ParquetOptionsResponse();

    /**
     * [Optional] Indicates whether to use schema inference specifically for Parquet LIST logical type.
     * 
     */
    @InputImport(name="enableListInference", required=true)
    private final Boolean enableListInference;

    public Boolean getEnableListInference() {
        return this.enableListInference;
    }

    /**
     * [Optional] Indicates whether to infer Parquet ENUM logical type as STRING instead of BYTES by default.
     * 
     */
    @InputImport(name="enumAsString", required=true)
    private final Boolean enumAsString;

    public Boolean getEnumAsString() {
        return this.enumAsString;
    }

    public ParquetOptionsResponse(
        Boolean enableListInference,
        Boolean enumAsString) {
        this.enableListInference = Objects.requireNonNull(enableListInference, "expected parameter 'enableListInference' to be non-null");
        this.enumAsString = Objects.requireNonNull(enumAsString, "expected parameter 'enumAsString' to be non-null");
    }

    private ParquetOptionsResponse() {
        this.enableListInference = null;
        this.enumAsString = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableListInference;
        private Boolean enumAsString;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableListInference = defaults.enableListInference;
    	      this.enumAsString = defaults.enumAsString;
        }

        public Builder setEnableListInference(Boolean enableListInference) {
            this.enableListInference = Objects.requireNonNull(enableListInference);
            return this;
        }

        public Builder setEnumAsString(Boolean enumAsString) {
            this.enumAsString = Objects.requireNonNull(enumAsString);
            return this;
        }

        public ParquetOptionsResponse build() {
            return new ParquetOptionsResponse(enableListInference, enumAsString);
        }
    }
}
