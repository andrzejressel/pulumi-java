// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Browse Carousel Card for Actions on Google. https://developers.google.com/actions/assistant/responses#browsing_carousel
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse Empty = new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse();

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @InputImport(name="imageDisplayOptions", required=true)
    private final String imageDisplayOptions;

    public String getImageDisplayOptions() {
        return this.imageDisplayOptions;
    }

    /**
     * List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    @InputImport(name="items", required=true)
    private final List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items;

    public List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> getItems() {
        return this.items;
    }

    public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse(
        String imageDisplayOptions,
        List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items) {
        this.imageDisplayOptions = Objects.requireNonNull(imageDisplayOptions, "expected parameter 'imageDisplayOptions' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse() {
        this.imageDisplayOptions = null;
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageDisplayOptions;
        private List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageDisplayOptions = defaults.imageDisplayOptions;
    	      this.items = defaults.items;
        }

        public Builder setImageDisplayOptions(String imageDisplayOptions) {
            this.imageDisplayOptions = Objects.requireNonNull(imageDisplayOptions);
            return this;
        }

        public Builder setItems(List<GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardResponse(imageDisplayOptions, items);
        }
    }
}
