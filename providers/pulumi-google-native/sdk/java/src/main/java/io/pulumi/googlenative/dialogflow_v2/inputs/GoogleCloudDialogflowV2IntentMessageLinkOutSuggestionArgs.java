// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The suggestion chip message that allows the user to jump out to the app or website associated with this agent.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs Empty = new GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs();

    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    @InputImport(name="destinationName", required=true)
    private final Input<String> destinationName;

    public Input<String> getDestinationName() {
        return this.destinationName;
    }

    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs(
        Input<String> destinationName,
        Input<String> uri) {
        this.destinationName = Objects.requireNonNull(destinationName, "expected parameter 'destinationName' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs() {
        this.destinationName = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationName;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationName = defaults.destinationName;
    	      this.uri = defaults.uri;
        }

        public Builder setDestinationName(Input<String> destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }

        public Builder setDestinationName(String destinationName) {
            this.destinationName = Input.of(Objects.requireNonNull(destinationName));
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionArgs(destinationName, uri);
        }
    }
}
