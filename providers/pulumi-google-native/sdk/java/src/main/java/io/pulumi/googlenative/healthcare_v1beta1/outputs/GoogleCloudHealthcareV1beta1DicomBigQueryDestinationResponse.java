// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse {
    /**
     * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    private final Boolean force;
    /**
     * BigQuery URI to a table, up to 2000 characters long, in the format `bq://projectId.bqDatasetId.tableId`
     * 
     */
    private final String tableUri;
    /**
     * Determines whether the existing table in the destination is to be overwritten or appended to. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    private final String writeDisposition;

    @OutputCustomType.Constructor({"force","tableUri","writeDisposition"})
    private GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse(
        Boolean force,
        String tableUri,
        String writeDisposition) {
        this.force = Objects.requireNonNull(force);
        this.tableUri = Objects.requireNonNull(tableUri);
        this.writeDisposition = Objects.requireNonNull(writeDisposition);
    }

    /**
     * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    public Boolean getForce() {
        return this.force;
    }
    /**
     * BigQuery URI to a table, up to 2000 characters long, in the format `bq://projectId.bqDatasetId.tableId`
     * 
     */
    public String getTableUri() {
        return this.tableUri;
    }
    /**
     * Determines whether the existing table in the destination is to be overwritten or appended to. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    public String getWriteDisposition() {
        return this.writeDisposition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean force;
        private String tableUri;
        private String writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.force = defaults.force;
    	      this.tableUri = defaults.tableUri;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setForce(Boolean force) {
            this.force = Objects.requireNonNull(force);
            return this;
        }

        public Builder setTableUri(String tableUri) {
            this.tableUri = Objects.requireNonNull(tableUri);
            return this;
        }

        public Builder setWriteDisposition(String writeDisposition) {
            this.writeDisposition = Objects.requireNonNull(writeDisposition);
            return this;
        }

        public GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse build() {
            return new GoogleCloudHealthcareV1beta1DicomBigQueryDestinationResponse(force, tableUri, writeDisposition);
        }
    }
}
