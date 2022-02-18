// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Instructs the speech synthesizer on how to generate the output audio content.
 * 
 */
public final class GoogleCloudDialogflowV2TextToSpeechSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2TextToSpeechSettingsResponse Empty = new GoogleCloudDialogflowV2TextToSpeechSettingsResponse();

    /**
     * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
     * 
     */
    @InputImport(name="enableTextToSpeech", required=true)
    private final Boolean enableTextToSpeech;

    public Boolean getEnableTextToSpeech() {
        return this.enableTextToSpeech;
    }

    /**
     * Audio encoding of the synthesized audio content.
     * 
     */
    @InputImport(name="outputAudioEncoding", required=true)
    private final String outputAudioEncoding;

    public String getOutputAudioEncoding() {
        return this.outputAudioEncoding;
    }

    /**
     * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice's natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
     * 
     */
    @InputImport(name="sampleRateHertz", required=true)
    private final Integer sampleRateHertz;

    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }

    /**
     * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
     * 
     */
    @InputImport(name="synthesizeSpeechConfigs", required=true)
    private final Map<String,String> synthesizeSpeechConfigs;

    public Map<String,String> getSynthesizeSpeechConfigs() {
        return this.synthesizeSpeechConfigs;
    }

    public GoogleCloudDialogflowV2TextToSpeechSettingsResponse(
        Boolean enableTextToSpeech,
        String outputAudioEncoding,
        Integer sampleRateHertz,
        Map<String,String> synthesizeSpeechConfigs) {
        this.enableTextToSpeech = Objects.requireNonNull(enableTextToSpeech, "expected parameter 'enableTextToSpeech' to be non-null");
        this.outputAudioEncoding = Objects.requireNonNull(outputAudioEncoding, "expected parameter 'outputAudioEncoding' to be non-null");
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz, "expected parameter 'sampleRateHertz' to be non-null");
        this.synthesizeSpeechConfigs = Objects.requireNonNull(synthesizeSpeechConfigs, "expected parameter 'synthesizeSpeechConfigs' to be non-null");
    }

    private GoogleCloudDialogflowV2TextToSpeechSettingsResponse() {
        this.enableTextToSpeech = null;
        this.outputAudioEncoding = null;
        this.sampleRateHertz = null;
        this.synthesizeSpeechConfigs = Map.of();
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
