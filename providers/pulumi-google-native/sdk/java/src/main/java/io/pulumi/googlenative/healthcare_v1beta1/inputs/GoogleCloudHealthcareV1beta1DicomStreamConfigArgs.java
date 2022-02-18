// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StreamConfig specifies configuration for a streaming DICOM export.
 * 
 */
public final class GoogleCloudHealthcareV1beta1DicomStreamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1beta1DicomStreamConfigArgs Empty = new GoogleCloudHealthcareV1beta1DicomStreamConfigArgs();

    /**
     * Results are appended to this table. The server creates a new table in the given BigQuery dataset if the specified table does not exist. To enable the Cloud Healthcare API to write to your BigQuery table, you must give the Cloud Healthcare API service account the bigquery.dataEditor role. The service account is: `service-{PROJECT_NUMBER}@gcp-sa-healthcare.iam.gserviceaccount.com`. The PROJECT_NUMBER identifies the project that the DICOM store resides in. To get the project number, go to the Cloud Console Dashboard. It is recommended to not have a custom schema in the destination table which could conflict with the schema created by the Cloud Healthcare API. Instance deletions are not applied to the destination table. The destination's table schema will be automatically updated in case a new instance's data is incompatible with the current schema. The schema should not be updated manually as this can cause incompatibilies that cannot be resolved automatically. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table recreation. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any instance that generates more than 1 MB of BigQuery data will not be streamed. If an instance cannot be streamed to BigQuery, errors will be logged to Cloud Logging (see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
     * 
     */
    @InputImport(name="bigqueryDestination")
    private final @Nullable Input<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs> bigqueryDestination;

    public Input<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs> getBigqueryDestination() {
        return this.bigqueryDestination == null ? Input.empty() : this.bigqueryDestination;
    }

    public GoogleCloudHealthcareV1beta1DicomStreamConfigArgs(@Nullable Input<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs> bigqueryDestination) {
        this.bigqueryDestination = bigqueryDestination;
    }

    private GoogleCloudHealthcareV1beta1DicomStreamConfigArgs() {
        this.bigqueryDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1DicomStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs> bigqueryDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1DicomStreamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
        }

        public Builder setBigqueryDestination(@Nullable Input<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs> bigqueryDestination) {
            this.bigqueryDestination = bigqueryDestination;
            return this;
        }

        public Builder setBigqueryDestination(@Nullable GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs bigqueryDestination) {
            this.bigqueryDestination = Input.ofNullable(bigqueryDestination);
            return this;
        }

        public GoogleCloudHealthcareV1beta1DicomStreamConfigArgs build() {
            return new GoogleCloudHealthcareV1beta1DicomStreamConfigArgs(bigqueryDestination);
        }
    }
}
