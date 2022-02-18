// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponse {
    /**
     * List of media objects.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
    /**
     * Optional. What type of media is the content (ie "audio").
     * 
     */
    private final String mediaType;

    @OutputCustomType.Constructor({"mediaObjects","mediaType"})
    private GoogleCloudDialogflowV2IntentMessageMediaContentResponse(
        List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects,
        String mediaType) {
        this.mediaObjects = Objects.requireNonNull(mediaObjects);
        this.mediaType = Objects.requireNonNull(mediaType);
    }

    /**
     * List of media objects.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> getMediaObjects() {
        return this.mediaObjects;
    }
    /**
     * Optional. What type of media is the content (ie "audio").
     * 
     */
    public String getMediaType() {
        return this.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects;
        private String mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mediaObjects = defaults.mediaObjects;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder setMediaObjects(List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectResponse> mediaObjects) {
            this.mediaObjects = Objects.requireNonNull(mediaObjects);
            return this;
        }

        public Builder setMediaType(String mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageMediaContentResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponse(mediaObjects, mediaType);
        }
    }
}
