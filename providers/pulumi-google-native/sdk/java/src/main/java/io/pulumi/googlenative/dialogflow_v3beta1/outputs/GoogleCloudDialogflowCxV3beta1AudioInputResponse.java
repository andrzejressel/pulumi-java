// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1AudioInputResponse {
    /**
     * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    private final String audio;
    /**
     * Instructs the speech recognizer how to process the speech audio.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config;

    @OutputCustomType.Constructor({"audio","config"})
    private GoogleCloudDialogflowCxV3beta1AudioInputResponse(
        String audio,
        GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config) {
        this.audio = Objects.requireNonNull(audio);
        this.config = Objects.requireNonNull(config);
    }

    /**
     * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    public String getAudio() {
        return this.audio;
    }
    /**
     * Instructs the speech recognizer how to process the speech audio.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse getConfig() {
        return this.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AudioInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audio;
        private GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AudioInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.config = defaults.config;
        }

        public Builder setAudio(String audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder setConfig(GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1AudioInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1AudioInputResponse(audio, config);
        }
    }
}
