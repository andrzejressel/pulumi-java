// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AudioInputArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1DtmfInputArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventInputArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1IntentInputArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TextInputArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the query input. It can contain one of: 1. A conversational query in the form of text. 2. An intent query that specifies which intent to trigger. 3. Natural language speech audio to be processed. 4. An event to be triggered.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1QueryInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1QueryInputArgs Empty = new GoogleCloudDialogflowCxV3beta1QueryInputArgs();

    /**
     * The natural language speech audio to be processed.
     * 
     */
    @InputImport(name="audio")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio;

    public Input<GoogleCloudDialogflowCxV3beta1AudioInputArgs> getAudio() {
        return this.audio == null ? Input.empty() : this.audio;
    }

    /**
     * The DTMF event to be handled.
     * 
     */
    @InputImport(name="dtmf")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf;

    public Input<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> getDtmf() {
        return this.dtmf == null ? Input.empty() : this.dtmf;
    }

    /**
     * The event to be triggered.
     * 
     */
    @InputImport(name="event")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1EventInputArgs> event;

    public Input<GoogleCloudDialogflowCxV3beta1EventInputArgs> getEvent() {
        return this.event == null ? Input.empty() : this.event;
    }

    /**
     * The intent to be triggered.
     * 
     */
    @InputImport(name="intent")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent;

    public Input<GoogleCloudDialogflowCxV3beta1IntentInputArgs> getIntent() {
        return this.intent == null ? Input.empty() : this.intent;
    }

    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    @InputImport(name="languageCode", required=true)
    private final Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode;
    }

    /**
     * The natural language text to be processed.
     * 
     */
    @InputImport(name="text")
    private final @Nullable Input<GoogleCloudDialogflowCxV3beta1TextInputArgs> text;

    public Input<GoogleCloudDialogflowCxV3beta1TextInputArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public GoogleCloudDialogflowCxV3beta1QueryInputArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1EventInputArgs> event,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent,
        Input<String> languageCode,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1TextInputArgs> text) {
        this.audio = audio;
        this.dtmf = dtmf;
        this.event = event;
        this.intent = intent;
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
        this.text = text;
    }

    private GoogleCloudDialogflowCxV3beta1QueryInputArgs() {
        this.audio = Input.empty();
        this.dtmf = Input.empty();
        this.event = Input.empty();
        this.intent = Input.empty();
        this.languageCode = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1QueryInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1EventInputArgs> event;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent;
        private Input<String> languageCode;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1TextInputArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1QueryInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.dtmf = defaults.dtmf;
    	      this.event = defaults.event;
    	      this.intent = defaults.intent;
    	      this.languageCode = defaults.languageCode;
    	      this.text = defaults.text;
        }

        public Builder setAudio(@Nullable Input<GoogleCloudDialogflowCxV3beta1AudioInputArgs> audio) {
            this.audio = audio;
            return this;
        }

        public Builder setAudio(@Nullable GoogleCloudDialogflowCxV3beta1AudioInputArgs audio) {
            this.audio = Input.ofNullable(audio);
            return this;
        }

        public Builder setDtmf(@Nullable Input<GoogleCloudDialogflowCxV3beta1DtmfInputArgs> dtmf) {
            this.dtmf = dtmf;
            return this;
        }

        public Builder setDtmf(@Nullable GoogleCloudDialogflowCxV3beta1DtmfInputArgs dtmf) {
            this.dtmf = Input.ofNullable(dtmf);
            return this;
        }

        public Builder setEvent(@Nullable Input<GoogleCloudDialogflowCxV3beta1EventInputArgs> event) {
            this.event = event;
            return this;
        }

        public Builder setEvent(@Nullable GoogleCloudDialogflowCxV3beta1EventInputArgs event) {
            this.event = Input.ofNullable(event);
            return this;
        }

        public Builder setIntent(@Nullable Input<GoogleCloudDialogflowCxV3beta1IntentInputArgs> intent) {
            this.intent = intent;
            return this;
        }

        public Builder setIntent(@Nullable GoogleCloudDialogflowCxV3beta1IntentInputArgs intent) {
            this.intent = Input.ofNullable(intent);
            return this;
        }

        public Builder setLanguageCode(Input<String> languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Input.of(Objects.requireNonNull(languageCode));
            return this;
        }

        public Builder setText(@Nullable Input<GoogleCloudDialogflowCxV3beta1TextInputArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable GoogleCloudDialogflowCxV3beta1TextInputArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1QueryInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1QueryInputArgs(audio, dtmf, event, intent, languageCode, text);
        }
    }
}
