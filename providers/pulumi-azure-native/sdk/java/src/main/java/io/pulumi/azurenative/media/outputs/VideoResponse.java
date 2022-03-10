// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VideoResponse {
    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    private final @Nullable String keyFrameInterval;
    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Video'.
     * 
     */
    private final String odataType;
    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    private final @Nullable String stretchMode;
    /**
     * The Video Sync Mode
     * 
     */
    private final @Nullable String syncMode;

    @OutputCustomType.Constructor
    private VideoResponse(
        @OutputCustomType.Parameter("keyFrameInterval") @Nullable String keyFrameInterval,
        @OutputCustomType.Parameter("label") @Nullable String label,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("stretchMode") @Nullable String stretchMode,
        @OutputCustomType.Parameter("syncMode") @Nullable String syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.odataType = odataType;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
    */
    public Optional<String> getKeyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
    */
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Video'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
    */
    public Optional<String> getStretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }
    /**
     * The Video Sync Mode
     * 
    */
    public Optional<String> getSyncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private String odataType;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setStretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setSyncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public VideoResponse build() {
            return new VideoResponse(keyFrameInterval, label, odataType, stretchMode, syncMode);
        }
    }
}
