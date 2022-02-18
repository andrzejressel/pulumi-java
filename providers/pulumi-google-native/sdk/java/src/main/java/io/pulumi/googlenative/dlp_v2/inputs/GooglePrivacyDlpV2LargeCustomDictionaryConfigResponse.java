// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryFieldResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageFileSetResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import java.util.Objects;


/**
 * Configuration for a custom dictionary created from a data source of any size up to the maximum size defined in the [limits](https://cloud.google.com/dlp/limits) page. The artifacts of dictionary creation are stored in the specified Google Cloud Storage location. Consider using `CustomInfoType.Dictionary` for smaller dictionaries that satisfy the size requirements.
 * 
 */
public final class GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse Empty = new GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse();

    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * 
     */
    @InputImport(name="bigQueryField", required=true)
    private final GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField;

    public GooglePrivacyDlpV2BigQueryFieldResponse getBigQueryField() {
        return this.bigQueryField;
    }

    /**
     * Set of files containing newline-delimited lists of dictionary phrases.
     * 
     */
    @InputImport(name="cloudStorageFileSet", required=true)
    private final GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet;

    public GooglePrivacyDlpV2CloudStorageFileSetResponse getCloudStorageFileSet() {
        return this.cloudStorageFileSet;
    }

    /**
     * Location to store dictionary artifacts in Google Cloud Storage. These files will only be accessible by project owners and the DLP API. If any of these artifacts are modified, the dictionary is considered invalid and can no longer be used.
     * 
     */
    @InputImport(name="outputPath", required=true)
    private final GooglePrivacyDlpV2CloudStoragePathResponse outputPath;

    public GooglePrivacyDlpV2CloudStoragePathResponse getOutputPath() {
        return this.outputPath;
    }

    public GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse(
        GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField,
        GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet,
        GooglePrivacyDlpV2CloudStoragePathResponse outputPath) {
        this.bigQueryField = Objects.requireNonNull(bigQueryField, "expected parameter 'bigQueryField' to be non-null");
        this.cloudStorageFileSet = Objects.requireNonNull(cloudStorageFileSet, "expected parameter 'cloudStorageFileSet' to be non-null");
        this.outputPath = Objects.requireNonNull(outputPath, "expected parameter 'outputPath' to be non-null");
    }

    private GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse() {
        this.bigQueryField = null;
        this.cloudStorageFileSet = null;
        this.outputPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField;
        private GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet;
        private GooglePrivacyDlpV2CloudStoragePathResponse outputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryField = defaults.bigQueryField;
    	      this.cloudStorageFileSet = defaults.cloudStorageFileSet;
    	      this.outputPath = defaults.outputPath;
        }

        public Builder setBigQueryField(GooglePrivacyDlpV2BigQueryFieldResponse bigQueryField) {
            this.bigQueryField = Objects.requireNonNull(bigQueryField);
            return this;
        }

        public Builder setCloudStorageFileSet(GooglePrivacyDlpV2CloudStorageFileSetResponse cloudStorageFileSet) {
            this.cloudStorageFileSet = Objects.requireNonNull(cloudStorageFileSet);
            return this;
        }

        public Builder setOutputPath(GooglePrivacyDlpV2CloudStoragePathResponse outputPath) {
            this.outputPath = Objects.requireNonNull(outputPath);
            return this;
        }

        public GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse build() {
            return new GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse(bigQueryField, cloudStorageFileSet, outputPath);
        }
    }
}
