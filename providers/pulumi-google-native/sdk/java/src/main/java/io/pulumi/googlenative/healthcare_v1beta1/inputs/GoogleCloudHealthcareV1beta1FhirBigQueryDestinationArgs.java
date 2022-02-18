// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.enums.GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.SchemaConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for exporting to BigQuery.
 * 
 */
public final class GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs Empty = new GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs();

    /**
     * BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`.
     * 
     */
    @InputImport(name="datasetUri")
    private final @Nullable Input<String> datasetUri;

    public Input<String> getDatasetUri() {
        return this.datasetUri == null ? Input.empty() : this.datasetUri;
    }

    /**
     * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @InputImport(name="force")
    private final @Nullable Input<Boolean> force;

    public Input<Boolean> getForce() {
        return this.force == null ? Input.empty() : this.force;
    }

    /**
     * The configuration for the exported BigQuery schema.
     * 
     */
    @InputImport(name="schemaConfig")
    private final @Nullable Input<SchemaConfigArgs> schemaConfig;

    public Input<SchemaConfigArgs> getSchemaConfig() {
        return this.schemaConfig == null ? Input.empty() : this.schemaConfig;
    }

    /**
     * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @InputImport(name="writeDisposition")
    private final @Nullable Input<GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition> writeDisposition;

    public Input<GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition> getWriteDisposition() {
        return this.writeDisposition == null ? Input.empty() : this.writeDisposition;
    }

    public GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs(
        @Nullable Input<String> datasetUri,
        @Nullable Input<Boolean> force,
        @Nullable Input<SchemaConfigArgs> schemaConfig,
        @Nullable Input<GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition> writeDisposition) {
        this.datasetUri = datasetUri;
        this.force = force;
        this.schemaConfig = schemaConfig;
        this.writeDisposition = writeDisposition;
    }

    private GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs() {
        this.datasetUri = Input.empty();
        this.force = Input.empty();
        this.schemaConfig = Input.empty();
        this.writeDisposition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetUri;
        private @Nullable Input<Boolean> force;
        private @Nullable Input<SchemaConfigArgs> schemaConfig;
        private @Nullable Input<GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetUri = defaults.datasetUri;
    	      this.force = defaults.force;
    	      this.schemaConfig = defaults.schemaConfig;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setDatasetUri(@Nullable Input<String> datasetUri) {
            this.datasetUri = datasetUri;
            return this;
        }

        public Builder setDatasetUri(@Nullable String datasetUri) {
            this.datasetUri = Input.ofNullable(datasetUri);
            return this;
        }

        public Builder setForce(@Nullable Input<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder setForce(@Nullable Boolean force) {
            this.force = Input.ofNullable(force);
            return this;
        }

        public Builder setSchemaConfig(@Nullable Input<SchemaConfigArgs> schemaConfig) {
            this.schemaConfig = schemaConfig;
            return this;
        }

        public Builder setSchemaConfig(@Nullable SchemaConfigArgs schemaConfig) {
            this.schemaConfig = Input.ofNullable(schemaConfig);
            return this;
        }

        public Builder setWriteDisposition(@Nullable Input<GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder setWriteDisposition(@Nullable GoogleCloudHealthcareV1beta1FhirBigQueryDestinationWriteDisposition writeDisposition) {
            this.writeDisposition = Input.ofNullable(writeDisposition);
            return this;
        }

        public GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs build() {
            return new GoogleCloudHealthcareV1beta1FhirBigQueryDestinationArgs(datasetUri, force, schemaConfig, writeDisposition);
        }
    }
}
