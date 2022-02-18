// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a part of a training phrase.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs Empty = new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs();

    /**
     * The parameter used to annotate this part of the training phrase. This field is required for annotated parts of the training phrase.
     * 
     */
    @InputImport(name="parameterId")
    private final @Nullable Input<String> parameterId;

    public Input<String> getParameterId() {
        return this.parameterId == null ? Input.empty() : this.parameterId;
    }

    /**
     * The text for this part.
     * 
     */
    @InputImport(name="text", required=true)
    private final Input<String> text;

    public Input<String> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs(
        @Nullable Input<String> parameterId,
        Input<String> text) {
        this.parameterId = parameterId;
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs() {
        this.parameterId = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> parameterId;
        private Input<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterId = defaults.parameterId;
    	      this.text = defaults.text;
        }

        public Builder setParameterId(@Nullable Input<String> parameterId) {
            this.parameterId = parameterId;
            return this;
        }

        public Builder setParameterId(@Nullable String parameterId) {
            this.parameterId = Input.ofNullable(parameterId);
            return this;
        }

        public Builder setText(Input<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }

        public Builder setText(String text) {
            this.text = Input.of(Objects.requireNonNull(text));
            return this;
        }

        public GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs build() {
            return new GoogleCloudDialogflowCxV3IntentTrainingPhrasePartArgs(parameterId, text);
        }
    }
}
