// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FileReferenceResponse {
    /**
     * The URI of a file stored in Google Cloud Storage. For example: http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil format: gs://mybucket/path/to/test.xml with version-specific info, gs://mybucket/path/to/test.xml#1360383693690000 An INVALID_ARGUMENT error will be returned if the URI format is not supported. - In response: always set - In create/update request: always set
     * 
     */
    private final String fileUri;

    @OutputCustomType.Constructor({"fileUri"})
    private FileReferenceResponse(String fileUri) {
        this.fileUri = Objects.requireNonNull(fileUri);
    }

    /**
     * The URI of a file stored in Google Cloud Storage. For example: http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil format: gs://mybucket/path/to/test.xml with version-specific info, gs://mybucket/path/to/test.xml#1360383693690000 An INVALID_ARGUMENT error will be returned if the URI format is not supported. - In response: always set - In create/update request: always set
     * 
     */
    public String getFileUri() {
        return this.fileUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(FileReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUri = defaults.fileUri;
        }

        public Builder setFileUri(String fileUri) {
            this.fileUri = Objects.requireNonNull(fileUri);
            return this;
        }

        public FileReferenceResponse build() {
            return new FileReferenceResponse(fileUri);
        }
    }
}
