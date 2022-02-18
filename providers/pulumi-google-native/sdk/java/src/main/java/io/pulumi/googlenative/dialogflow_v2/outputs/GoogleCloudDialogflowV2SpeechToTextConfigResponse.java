// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2SpeechToTextConfigResponse {
    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
     */
    private final String speechModelVariant;

    @OutputCustomType.Constructor({"speechModelVariant"})
    private GoogleCloudDialogflowV2SpeechToTextConfigResponse(String speechModelVariant) {
        this.speechModelVariant = Objects.requireNonNull(speechModelVariant);
    }

    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
     */
    public String getSpeechModelVariant() {
        return this.speechModelVariant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2SpeechToTextConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String speechModelVariant;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2SpeechToTextConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.speechModelVariant = defaults.speechModelVariant;
        }

        public Builder setSpeechModelVariant(String speechModelVariant) {
            this.speechModelVariant = Objects.requireNonNull(speechModelVariant);
            return this;
        }

        public GoogleCloudDialogflowV2SpeechToTextConfigResponse build() {
            return new GoogleCloudDialogflowV2SpeechToTextConfigResponse(speechModelVariant);
        }
    }
}
