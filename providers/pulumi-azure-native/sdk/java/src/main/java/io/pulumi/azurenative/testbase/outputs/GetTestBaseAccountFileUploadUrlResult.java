// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTestBaseAccountFileUploadUrlResult {
    /**
     * The blob path of the uploaded package. It will be used as the 'blobPath' property of PackageResource.
     * 
     */
    private final String blobPath;
    /**
     * The URL used for uploading the package.
     * 
     */
    private final String uploadUrl;

    @OutputCustomType.Constructor
    private GetTestBaseAccountFileUploadUrlResult(
        @OutputCustomType.Parameter("blobPath") String blobPath,
        @OutputCustomType.Parameter("uploadUrl") String uploadUrl) {
        this.blobPath = blobPath;
        this.uploadUrl = uploadUrl;
    }

    /**
     * The blob path of the uploaded package. It will be used as the 'blobPath' property of PackageResource.
     * 
    */
    public String getBlobPath() {
        return this.blobPath;
    }
    /**
     * The URL used for uploading the package.
     * 
    */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestBaseAccountFileUploadUrlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String blobPath;
        private String uploadUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestBaseAccountFileUploadUrlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobPath = defaults.blobPath;
    	      this.uploadUrl = defaults.uploadUrl;
        }

        public Builder setBlobPath(String blobPath) {
            this.blobPath = Objects.requireNonNull(blobPath);
            return this;
        }

        public Builder setUploadUrl(String uploadUrl) {
            this.uploadUrl = Objects.requireNonNull(uploadUrl);
            return this;
        }
        public GetTestBaseAccountFileUploadUrlResult build() {
            return new GetTestBaseAccountFileUploadUrlResult(blobPath, uploadUrl);
        }
    }
}
