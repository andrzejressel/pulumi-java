// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ZipInfoResponse {
    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    private final Integer filesCount;
    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
     * 
     */
    private final String sourceUrl;

    @OutputCustomType.Constructor({"filesCount","sourceUrl"})
    private ZipInfoResponse(
        Integer filesCount,
        String sourceUrl) {
        this.filesCount = Objects.requireNonNull(filesCount);
        this.sourceUrl = Objects.requireNonNull(sourceUrl);
    }

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    public Integer getFilesCount() {
        return this.filesCount;
    }
    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
     * 
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer filesCount;
        private String sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder setFilesCount(Integer filesCount) {
            this.filesCount = Objects.requireNonNull(filesCount);
            return this;
        }

        public Builder setSourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }

        public ZipInfoResponse build() {
            return new ZipInfoResponse(filesCount, sourceUrl);
        }
    }
}
