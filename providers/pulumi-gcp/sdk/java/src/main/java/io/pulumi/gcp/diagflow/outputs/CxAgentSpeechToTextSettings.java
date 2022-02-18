// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CxAgentSpeechToTextSettings {
    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    private final @Nullable Boolean enableSpeechAdaptation;

    @OutputCustomType.Constructor({"enableSpeechAdaptation"})
    private CxAgentSpeechToTextSettings(@Nullable Boolean enableSpeechAdaptation) {
        this.enableSpeechAdaptation = enableSpeechAdaptation;
    }

    /**
     * Whether to use speech adaptation for speech recognition.
     * 
     */
    public Optional<Boolean> getEnableSpeechAdaptation() {
        return Optional.ofNullable(this.enableSpeechAdaptation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentSpeechToTextSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableSpeechAdaptation;

        public Builder() {
    	      // Empty
        }

        public Builder(CxAgentSpeechToTextSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSpeechAdaptation = defaults.enableSpeechAdaptation;
        }

        public Builder setEnableSpeechAdaptation(@Nullable Boolean enableSpeechAdaptation) {
            this.enableSpeechAdaptation = enableSpeechAdaptation;
            return this;
        }

        public CxAgentSpeechToTextSettings build() {
            return new CxAgentSpeechToTextSettings(enableSpeechAdaptation);
        }
    }
}
