// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImageResponse {
    /**
     * Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
     * 
     */
    private final String gcsUri;
    /**
     * Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
     * 
     */
    private final String rawBytes;

    @OutputCustomType.Constructor({"gcsUri","rawBytes"})
    private ImageResponse(
        String gcsUri,
        String rawBytes) {
        this.gcsUri = Objects.requireNonNull(gcsUri);
        this.rawBytes = Objects.requireNonNull(rawBytes);
    }

    /**
     * Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
     * 
     */
    public String getGcsUri() {
        return this.gcsUri;
    }
    /**
     * Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
     * 
     */
    public String getRawBytes() {
        return this.rawBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsUri;
        private String rawBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsUri = defaults.gcsUri;
    	      this.rawBytes = defaults.rawBytes;
        }

        public Builder setGcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }

        public Builder setRawBytes(String rawBytes) {
            this.rawBytes = Objects.requireNonNull(rawBytes);
            return this;
        }

        public ImageResponse build() {
            return new ImageResponse(gcsUri, rawBytes);
        }
    }
}
