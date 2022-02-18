// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1GcsFileSpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1GcsFilesetSpecResponse {
    /**
     * Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/*`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match the `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    private final List<String> filePatterns;
    /**
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * 
     */
    private final List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs;

    @OutputCustomType.Constructor({"filePatterns","sampleGcsFileSpecs"})
    private GoogleCloudDatacatalogV1GcsFilesetSpecResponse(
        List<String> filePatterns,
        List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs) {
        this.filePatterns = Objects.requireNonNull(filePatterns);
        this.sampleGcsFileSpecs = Objects.requireNonNull(sampleGcsFileSpecs);
    }

    /**
     * Patterns to identify a set of files in Google Cloud Storage. For more information, see [Wildcard Names] (https://cloud.google.com/storage/docs/gsutil/addlhelp/WildcardNames). Note: Currently, bucket wildcards are not supported. Examples of valid `file_patterns`: * `gs://bucket_name/dir/*`: matches all files in `bucket_name/dir` directory * `gs://bucket_name/dir/**`: matches all files in `bucket_name/dir` and all subdirectories * `gs://bucket_name/file*`: matches files prefixed by `file` in `bucket_name` * `gs://bucket_name/??.txt`: matches files with two characters followed by `.txt` in `bucket_name` * `gs://bucket_name/[aeiou].txt`: matches files that contain a single vowel character followed by `.txt` in `bucket_name` * `gs://bucket_name/[a-m].txt`: matches files that contain `a`, `b`, ... or `m` followed by `.txt` in `bucket_name` * `gs://bucket_name/a/*{@literal /}b`: matches all files in `bucket_name` that match the `a/*{@literal /}b` pattern, such as `a/c/b`, `a/d/b` * `gs://another_bucket/a.txt`: matches `gs://another_bucket/a.txt` You can combine wildcards to match complex sets of files, for example: `gs://bucket_name/[a-m]??.j*g`
     * 
     */
    public List<String> getFilePatterns() {
        return this.filePatterns;
    }
    /**
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * 
     */
    public List<GoogleCloudDatacatalogV1GcsFileSpecResponse> getSampleGcsFileSpecs() {
        return this.sampleGcsFileSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1GcsFilesetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> filePatterns;
        private List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1GcsFilesetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePatterns = defaults.filePatterns;
    	      this.sampleGcsFileSpecs = defaults.sampleGcsFileSpecs;
        }

        public Builder setFilePatterns(List<String> filePatterns) {
            this.filePatterns = Objects.requireNonNull(filePatterns);
            return this;
        }

        public Builder setSampleGcsFileSpecs(List<GoogleCloudDatacatalogV1GcsFileSpecResponse> sampleGcsFileSpecs) {
            this.sampleGcsFileSpecs = Objects.requireNonNull(sampleGcsFileSpecs);
            return this;
        }

        public GoogleCloudDatacatalogV1GcsFilesetSpecResponse build() {
            return new GoogleCloudDatacatalogV1GcsFilesetSpecResponse(filePatterns, sampleGcsFileSpecs);
        }
    }
}
