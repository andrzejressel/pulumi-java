// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configures speech transcription for ConversationProfile.
 * 
 */
public final class GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs Empty = new GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs();

    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
     */
    @InputImport(name="speechModelVariant")
    private final @Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant> speechModelVariant;

    public Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant> getSpeechModelVariant() {
        return this.speechModelVariant == null ? Input.empty() : this.speechModelVariant;
    }

    public GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs(@Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant> speechModelVariant) {
        this.speechModelVariant = speechModelVariant;
    }

    private GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs() {
        this.speechModelVariant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant> speechModelVariant;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.speechModelVariant = defaults.speechModelVariant;
        }

        public Builder setSpeechModelVariant(@Nullable Input<GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant> speechModelVariant) {
            this.speechModelVariant = speechModelVariant;
            return this;
        }

        public Builder setSpeechModelVariant(@Nullable GoogleCloudDialogflowV2beta1SpeechToTextConfigSpeechModelVariant speechModelVariant) {
            this.speechModelVariant = Input.ofNullable(speechModelVariant);
            return this;
        }

        public GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs(speechModelVariant);
        }
    }
}
