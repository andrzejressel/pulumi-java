// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageTableCardRowArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Table card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageTableCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageTableCardArgs Empty = new GoogleCloudDialogflowV2IntentMessageTableCardArgs();

    /**
     * Optional. List of buttons for the card.
     * 
     */
    @InputImport(name="buttons")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs>> buttons;

    public Input<List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs>> getButtons() {
        return this.buttons == null ? Input.empty() : this.buttons;
    }

    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    @InputImport(name="columnProperties")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs>> columnProperties;

    public Input<List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs>> getColumnProperties() {
        return this.columnProperties == null ? Input.empty() : this.columnProperties;
    }

    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    @InputImport(name="image")
    private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    public Input<GoogleCloudDialogflowV2IntentMessageImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Optional. Rows in this table of data.
     * 
     */
    @InputImport(name="rows")
    private final @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs>> rows;

    public Input<List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs>> getRows() {
        return this.rows == null ? Input.empty() : this.rows;
    }

    /**
     * Optional. Subtitle to the title.
     * 
     */
    @InputImport(name="subtitle")
    private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    /**
     * Title of the card.
     * 
     */
    @InputImport(name="title", required=true)
    private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageTableCardArgs(
        @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs>> buttons,
        @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs>> columnProperties,
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image,
        @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs>> rows,
        @Nullable Input<String> subtitle,
        Input<String> title) {
        this.buttons = buttons;
        this.columnProperties = columnProperties;
        this.image = image;
        this.rows = rows;
        this.subtitle = subtitle;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageTableCardArgs() {
        this.buttons = Input.empty();
        this.columnProperties = Input.empty();
        this.image = Input.empty();
        this.rows = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageTableCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs>> buttons;
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs>> columnProperties;
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> image;
        private @Nullable Input<List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs>> rows;
        private @Nullable Input<String> subtitle;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageTableCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(@Nullable Input<List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs>> buttons) {
            this.buttons = buttons;
            return this;
        }

        public Builder setButtons(@Nullable List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs> buttons) {
            this.buttons = Input.ofNullable(buttons);
            return this;
        }

        public Builder setColumnProperties(@Nullable Input<List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs>> columnProperties) {
            this.columnProperties = columnProperties;
            return this;
        }

        public Builder setColumnProperties(@Nullable List<GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs> columnProperties) {
            this.columnProperties = Input.ofNullable(columnProperties);
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

        public Builder setRows(@Nullable Input<List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs>> rows) {
            this.rows = rows;
            return this;
        }

        public Builder setRows(@Nullable List<GoogleCloudDialogflowV2IntentMessageTableCardRowArgs> rows) {
            this.rows = Input.ofNullable(rows);
            return this;
        }

        public Builder setSubtitle(@Nullable Input<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = Input.ofNullable(subtitle);
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

        public GoogleCloudDialogflowV2IntentMessageTableCardArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageTableCardArgs(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
