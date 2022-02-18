// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2TextToSpeechSettingsResponse {
    /**
     * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
     * 
     */
    private final Boolean enableTextToSpeech;
    /**
     * Audio encoding of the synthesized audio content.
     * 
     */
    private final String outputAudioEncoding;
    /**
     * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
     * 
     */
    private final Integer sampleRateHertz;
    /**
     * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
     * 
     */
    private final Map<String,String> synthesizeSpeechConfigs;

    @OutputCustomType.Constructor({"enableTextToSpeech","outputAudioEncoding","sampleRateHertz","synthesizeSpeechConfigs"})
    private GoogleCloudDialogflowV2TextToSpeechSettingsResponse(
        Boolean enableTextToSpeech,
        String outputAudioEncoding,
        Integer sampleRateHertz,
        Map<String,String> synthesizeSpeechConfigs) {
        this.enableTextToSpeech = Objects.requireNonNull(enableTextToSpeech);
        this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding);
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
        this.synthesizeSpeechConfigs = Objects.requireNonNull(synthesizeSpeechConfigs);
    }

    /**
     * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
     * 
     */
    public Boolean getEnableTextToSpeech() {
        return this.enableTextToSpeech;
    }
    /**
     * Audio encoding of the synthesized audio content.
     * 
     */
    public String getOutputAudioEncoding() {
        return this.outputAudioEncoding;
    }
    /**
     * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
     * 
     */
    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }
    /**
     * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
     * 
     */
    public Map<String,String> getSynthesizeSpeechConfigs() {
        return this.synthesizeSpeechConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2TextToSpeechSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableTextToSpeech;
        private String outputAudioEncoding;
        private Integer sampleRateHertz;
        private Map<String,String> synthesizeSpeechConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2TextToSpeechSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableTextToSpeech = defaults.enableTextToSpeech;
    	      this.outputAudioEncoding = defaults.outputAudioEncoding;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.synthesizeSpeechConfigs = defaults.synthesizeSpeechConfigs;
        }

        public Builder setEnableTextToSpeech(Boolean enableTextToSpeech) {
            this.enableTextToSpeech = Objects.requireNonNull(enableTextToSpeech);
            return this;
        }

        public Builder setOutputAudioEncoding(String outputAudioEncoding) {
            this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public Builder setSynthesizeSpeechConfigs(Map<String,String> synthesizeSpeechConfigs) {
            this.synthesizeSpeechConfigs = Objects.requireNonNull(synthesizeSpeechConfigs);
            return this;
        }

        public GoogleCloudDialogflowV2TextToSpeechSettingsResponse build() {
            return new GoogleCloudDialogflowV2TextToSpeechSettingsResponse(enableTextToSpeech, outputAudioEncoding, sampleRateHertz, synthesizeSpeechConfigs);
        }
    }
}
