// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Column properties for TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs();

    /**
     * Column heading.
     * 
     */
    @InputImport(name="header", required=true)
    private final Input<String> header;

    public Input<String> getHeader() {
        return this.header;
    }

    /**
     * Optional. Defines text alignment for all cells in this column.
     * 
     */
    @InputImport(name="horizontalAlignment")
    private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> getHorizontalAlignment() {
        return this.horizontalAlignment == null ? Input.empty() : this.horizontalAlignment;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs(
        Input<String> header,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.horizontalAlignment = horizontalAlignment;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs() {
        this.header = Input.empty();
        this.horizontalAlignment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> header;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.horizontalAlignment = defaults.horizontalAlignment;
        }

        public Builder setHeader(Input<String> header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder setHeader(String header) {
            this.header = Input.of(Objects.requireNonNull(header));
            return this;
        }

        public Builder setHorizontalAlignment(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setHorizontalAlignment(@Nullable GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesHorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = Input.ofNullable(horizontalAlignment);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs(header, horizontalAlignment);
        }
    }
}
