// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The suggestion chip message that the user can tap to quickly post a reply to the conversation.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSuggestionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSuggestionResponse Empty = new GoogleCloudDialogflowV2IntentMessageSuggestionResponse();

    /**
     * The text shown the in the suggestion chip.
     * 
     */
    @InputImport(name="title", required=true)
    private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageSuggestionResponse(String title) {
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageSuggestionResponse() {
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.title = defaults.title;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageSuggestionResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionResponse(title);
        }
    }
}
