// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse;
import java.util.List;
import java.util.Objects;


/**
 * The collection of suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse();

    /**
     * The list of suggested replies.
     * 
     */
    @InputImport(name="suggestions", required=true)
    private final List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions;

    public List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> getSuggestions() {
        return this.suggestions;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse(List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions) {
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse() {
        this.suggestions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder setSuggestions(List<GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse(suggestions);
        }
    }
}
