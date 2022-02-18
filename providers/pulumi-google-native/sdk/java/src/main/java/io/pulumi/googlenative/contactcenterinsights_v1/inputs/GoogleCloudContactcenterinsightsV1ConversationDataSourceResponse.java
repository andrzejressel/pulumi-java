// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1DialogflowSourceResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1GcsSourceResponse;
import java.util.Objects;


/**
 * The conversation source, which is a combination of transcript and audio.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse();

    /**
     * The source when the conversation comes from Dialogflow.
     * 
     */
    @InputImport(name="dialogflowSource", required=true)
    private final GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource;

    public GoogleCloudContactcenterinsightsV1DialogflowSourceResponse getDialogflowSource() {
        return this.dialogflowSource;
    }

    /**
     * A Cloud Storage location specification for the audio and transcript.
     * 
     */
    @InputImport(name="gcsSource", required=true)
    private final GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource;

    public GoogleCloudContactcenterinsightsV1GcsSourceResponse getGcsSource() {
        return this.gcsSource;
    }

    public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(
        GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource,
        GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource) {
        this.dialogflowSource = Objects.requireNonNull(dialogflowSource, "expected parameter 'dialogflowSource' to be non-null");
        this.gcsSource = Objects.requireNonNull(gcsSource, "expected parameter 'gcsSource' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse() {
        this.dialogflowSource = null;
        this.gcsSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource;
        private GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dialogflowSource = defaults.dialogflowSource;
    	      this.gcsSource = defaults.gcsSource;
        }

        public Builder setDialogflowSource(GoogleCloudContactcenterinsightsV1DialogflowSourceResponse dialogflowSource) {
            this.dialogflowSource = Objects.requireNonNull(dialogflowSource);
            return this;
        }

        public Builder setGcsSource(GoogleCloudContactcenterinsightsV1GcsSourceResponse gcsSource) {
            this.gcsSource = Objects.requireNonNull(gcsSource);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationDataSourceResponse(dialogflowSource, gcsSource);
        }
    }
}
