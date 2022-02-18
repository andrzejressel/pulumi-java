// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An item in the carousel.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs();

    /**
     * Optional. The body text of the card.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. The image to display.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    public Input<GoogleCloudDialogflowV2IntentMessageImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Additional info about the option item.
     * 
     */
    @InputImport(name="info", required=true)
    private final Input<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;

    public Input<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> getInfo() {
        return this.info;
    }

    /**
     * Title of the carousel item.
     * 
     */
    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(
        @Nullable Input<String> description,
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image,
        Input<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info,
        Input<String> title) {
        this.description = description;
        this.image = image;
        this.info = Objects.requireNonNull(info, "expected parameter 'info' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs() {
        this.description = Input.empty();
        this.image = Input.empty();
        this.info = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image;
        private Input<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setImage(@Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }

        public Builder setImage(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder setInfo(Input<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }

        public Builder setInfo(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs info) {
            this.info = Input.of(Objects.requireNonNull(info));
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(description, image, info, title);
        }
    }
}
