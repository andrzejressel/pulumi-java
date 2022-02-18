// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Synthesizes speech and plays back the synthesized audio to the caller in Telephony Gateway. Telephony Gateway takes the synthesizer settings from `DetectIntentResponse.output_audio_config` which can either be set at request-level or can come from the agent-level synthesizer config.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs();

    /**
     * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
     * 
     */
    @InputImport(name="ssml")
    private final @Nullable Input<String> ssml;

    public Input<String> getSsml() {
        return this.ssml == null ? Input.empty() : this.ssml;
    }

    /**
     * The raw text to be synthesized.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<String> text;

    public Input<String> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs(
        @Nullable Input<String> ssml,
        @Nullable Input<String> text) {
        this.ssml = ssml;
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs() {
        this.ssml = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ssml;
        private @Nullable Input<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder setSsml(@Nullable Input<String> ssml) {
            this.ssml = ssml;
            return this;
        }

        public Builder setSsml(@Nullable String ssml) {
            this.ssml = Input.ofNullable(ssml);
            return this;
        }

        public Builder setText(@Nullable Input<String> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable String text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs(ssml, text);
        }
    }
}
