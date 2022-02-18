// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse {
    /**
     * Optional. The body text of the card.
     * 
     */
    private final String description;
    /**
     * Optional. The image to display.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse image;
    /**
     * Additional info about the option item.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info;
    /**
     * Title of the carousel item.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"description","image","info","title"})
    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse(
        String description,
        GoogleCloudDialogflowV2IntentMessageImageResponse image,
        GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info,
        String title) {
        this.description = Objects.requireNonNull(description);
        this.image = Objects.requireNonNull(image);
        this.info = Objects.requireNonNull(info);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Optional. The body text of the card.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. The image to display.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Additional info about the option item.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse getInfo() {
        return this.info;
    }
    /**
     * Title of the carousel item.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setInfo(GoogleCloudDialogflowV2IntentMessageSelectItemInfoResponse info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemResponse(description, image, info, title);
        }
    }
}
