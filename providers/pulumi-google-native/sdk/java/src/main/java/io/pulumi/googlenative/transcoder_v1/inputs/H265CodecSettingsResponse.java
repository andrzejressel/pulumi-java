// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * H265 codec settings.
 * 
 */
public final class H265CodecSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final H265CodecSettingsResponse Empty = new H265CodecSettingsResponse();

    /**
     * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.
     * 
     */
    @InputImport(name="allowOpenGop", required=true)
    private final Boolean allowOpenGop;

    public Boolean getAllowOpenGop() {
        return this.allowOpenGop;
    }

    /**
     * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.
     * 
     */
    @InputImport(name="aqStrength", required=true)
    private final Double aqStrength;

    public Double getAqStrength() {
        return this.aqStrength;
    }

    /**
     * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
     * 
     */
    @InputImport(name="bFrameCount", required=true)
    private final Integer bFrameCount;

    public Integer getBFrameCount() {
        return this.bFrameCount;
    }

    /**
     * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.
     * 
     */
    @InputImport(name="bPyramid", required=true)
    private final Boolean bPyramid;

    public Boolean getBPyramid() {
        return this.bPyramid;
    }

    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000.
     * 
     */
    @InputImport(name="bitrateBps", required=true)
    private final Integer bitrateBps;

    public Integer getBitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.
     * 
     */
    @InputImport(name="crfLevel", required=true)
    private final Integer crfLevel;

    public Integer getCrfLevel() {
        return this.crfLevel;
    }

    /**
     * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`.
     * 
     */
    @InputImport(name="enableTwoPass", required=true)
    private final Boolean enableTwoPass;

    public Boolean getEnableTwoPass() {
        return this.enableTwoPass;
    }

    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    @InputImport(name="frameRate", required=true)
    private final Double frameRate;

    public Double getFrameRate() {
        return this.frameRate;
    }

    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    @InputImport(name="gopDuration", required=true)
    private final String gopDuration;

    public String getGopDuration() {
        return this.gopDuration;
    }

    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    @InputImport(name="gopFrameCount", required=true)
    private final Integer gopFrameCount;

    public Integer getGopFrameCount() {
        return this.gopFrameCount;
    }

    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    @InputImport(name="heightPixels", required=true)
    private final Integer heightPixels;

    public Integer getHeightPixels() {
        return this.heightPixels;
    }

    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    @InputImport(name="pixelFormat", required=true)
    private final String pixelFormat;

    public String getPixelFormat() {
        return this.pixelFormat;
    }

    /**
     * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @InputImport(name="preset", required=true)
    private final String preset;

    public String getPreset() {
        return this.preset;
    }

    /**
     * Enforces the specified codec profile. The following profiles are supported: * 8-bit profiles * `main` (default) * `main-intra` * `mainstillpicture` * 10-bit profiles * `main10` (default) * `main10-intra` * `main422-10` * `main422-10-intra` * `main444-10` * `main444-10-intra` * 12-bit profiles * `main12` (default) * `main12-intra` * `main422-12` * `main422-12-intra` * `main444-12` * `main444-12-intra` The available options are [FFmpeg-compatible](https://x265.readthedocs.io/). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @InputImport(name="profile", required=true)
    private final String profile;

    public String getProfile() {
        return this.profile;
    }

    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor
     * 
     */
    @InputImport(name="rateControlMode", required=true)
    private final String rateControlMode;

    public String getRateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.265). Note that certain values for this field may cause the transcoder to override other fields you set in the `H265CodecSettings` message.
     * 
     */
    @InputImport(name="tune", required=true)
    private final String tune;

    public String getTune() {
        return this.tune;
    }

    /**
     * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
     * 
     */
    @InputImport(name="vbvFullnessBits", required=true)
    private final Integer vbvFullnessBits;

    public Integer getVbvFullnessBits() {
        return this.vbvFullnessBits;
    }

    /**
     * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.
     * 
     */
    @InputImport(name="vbvSizeBits", required=true)
    private final Integer vbvSizeBits;

    public Integer getVbvSizeBits() {
        return this.vbvSizeBits;
    }

    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    @InputImport(name="widthPixels", required=true)
    private final Integer widthPixels;

    public Integer getWidthPixels() {
        return this.widthPixels;
    }

    public H265CodecSettingsResponse(
        Boolean allowOpenGop,
        Double aqStrength,
        Integer bFrameCount,
        Boolean bPyramid,
        Integer bitrateBps,
        Integer crfLevel,
        Boolean enableTwoPass,
        Double frameRate,
        String gopDuration,
        Integer gopFrameCount,
        Integer heightPixels,
        String pixelFormat,
        String preset,
        String profile,
        String rateControlMode,
        String tune,
        Integer vbvFullnessBits,
        Integer vbvSizeBits,
        Integer widthPixels) {
        this.allowOpenGop = Objects.requireNonNull(allowOpenGop, "expected parameter 'allowOpenGop' to be non-null");
        this.aqStrength = Objects.requireNonNull(aqStrength, "expected parameter 'aqStrength' to be non-null");
        this.bFrameCount = Objects.requireNonNull(bFrameCount, "expected parameter 'bFrameCount' to be non-null");
        this.bPyramid = Objects.requireNonNull(bPyramid, "expected parameter 'bPyramid' to be non-null");
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.crfLevel = Objects.requireNonNull(crfLevel, "expected parameter 'crfLevel' to be non-null");
        this.enableTwoPass = Objects.requireNonNull(enableTwoPass, "expected parameter 'enableTwoPass' to be non-null");
        this.frameRate = Objects.requireNonNull(frameRate, "expected parameter 'frameRate' to be non-null");
        this.gopDuration = Objects.requireNonNull(gopDuration, "expected parameter 'gopDuration' to be non-null");
        this.gopFrameCount = Objects.requireNonNull(gopFrameCount, "expected parameter 'gopFrameCount' to be non-null");
        this.heightPixels = Objects.requireNonNull(heightPixels, "expected parameter 'heightPixels' to be non-null");
        this.pixelFormat = Objects.requireNonNull(pixelFormat, "expected parameter 'pixelFormat' to be non-null");
        this.preset = Objects.requireNonNull(preset, "expected parameter 'preset' to be non-null");
        this.profile = Objects.requireNonNull(profile, "expected parameter 'profile' to be non-null");
        this.rateControlMode = Objects.requireNonNull(rateControlMode, "expected parameter 'rateControlMode' to be non-null");
        this.tune = Objects.requireNonNull(tune, "expected parameter 'tune' to be non-null");
        this.vbvFullnessBits = Objects.requireNonNull(vbvFullnessBits, "expected parameter 'vbvFullnessBits' to be non-null");
        this.vbvSizeBits = Objects.requireNonNull(vbvSizeBits, "expected parameter 'vbvSizeBits' to be non-null");
        this.widthPixels = Objects.requireNonNull(widthPixels, "expected parameter 'widthPixels' to be non-null");
    }

    private H265CodecSettingsResponse() {
        this.allowOpenGop = null;
        this.aqStrength = null;
        this.bFrameCount = null;
        this.bPyramid = null;
        this.bitrateBps = null;
        this.crfLevel = null;
        this.enableTwoPass = null;
        this.frameRate = null;
        this.gopDuration = null;
        this.gopFrameCount = null;
        this.heightPixels = null;
        this.pixelFormat = null;
        this.preset = null;
        this.profile = null;
        this.rateControlMode = null;
        this.tune = null;
        this.vbvFullnessBits = null;
        this.vbvSizeBits = null;
        this.widthPixels = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265CodecSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowOpenGop;
        private Double aqStrength;
        private Integer bFrameCount;
        private Boolean bPyramid;
        private Integer bitrateBps;
        private Integer crfLevel;
        private Boolean enableTwoPass;
        private Double frameRate;
        private String gopDuration;
        private Integer gopFrameCount;
        private Integer heightPixels;
        private String pixelFormat;
        private String preset;
        private String profile;
        private String rateControlMode;
        private String tune;
        private Integer vbvFullnessBits;
        private Integer vbvSizeBits;
        private Integer widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(H265CodecSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpenGop = defaults.allowOpenGop;
    	      this.aqStrength = defaults.aqStrength;
    	      this.bFrameCount = defaults.bFrameCount;
    	      this.bPyramid = defaults.bPyramid;
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.enableTwoPass = defaults.enableTwoPass;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.preset = defaults.preset;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.tune = defaults.tune;
    	      this.vbvFullnessBits = defaults.vbvFullnessBits;
    	      this.vbvSizeBits = defaults.vbvSizeBits;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder setAllowOpenGop(Boolean allowOpenGop) {
            this.allowOpenGop = Objects.requireNonNull(allowOpenGop);
            return this;
        }

        public Builder setAqStrength(Double aqStrength) {
            this.aqStrength = Objects.requireNonNull(aqStrength);
            return this;
        }

        public Builder setBFrameCount(Integer bFrameCount) {
            this.bFrameCount = Objects.requireNonNull(bFrameCount);
            return this;
        }

        public Builder setBPyramid(Boolean bPyramid) {
            this.bPyramid = Objects.requireNonNull(bPyramid);
            return this;
        }

        public Builder setBitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder setCrfLevel(Integer crfLevel) {
            this.crfLevel = Objects.requireNonNull(crfLevel);
            return this;
        }

        public Builder setEnableTwoPass(Boolean enableTwoPass) {
            this.enableTwoPass = Objects.requireNonNull(enableTwoPass);
            return this;
        }

        public Builder setFrameRate(Double frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }

        public Builder setGopDuration(String gopDuration) {
            this.gopDuration = Objects.requireNonNull(gopDuration);
            return this;
        }

        public Builder setGopFrameCount(Integer gopFrameCount) {
            this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
            return this;
        }

        public Builder setHeightPixels(Integer heightPixels) {
            this.heightPixels = Objects.requireNonNull(heightPixels);
            return this;
        }

        public Builder setPixelFormat(String pixelFormat) {
            this.pixelFormat = Objects.requireNonNull(pixelFormat);
            return this;
        }

        public Builder setPreset(String preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder setProfile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }

        public Builder setRateControlMode(String rateControlMode) {
            this.rateControlMode = Objects.requireNonNull(rateControlMode);
            return this;
        }

        public Builder setTune(String tune) {
            this.tune = Objects.requireNonNull(tune);
            return this;
        }

        public Builder setVbvFullnessBits(Integer vbvFullnessBits) {
            this.vbvFullnessBits = Objects.requireNonNull(vbvFullnessBits);
            return this;
        }

        public Builder setVbvSizeBits(Integer vbvSizeBits) {
            this.vbvSizeBits = Objects.requireNonNull(vbvSizeBits);
            return this;
        }

        public Builder setWidthPixels(Integer widthPixels) {
            this.widthPixels = Objects.requireNonNull(widthPixels);
            return this;
        }

        public H265CodecSettingsResponse build() {
            return new H265CodecSettingsResponse(allowOpenGop, aqStrength, bFrameCount, bPyramid, bitrateBps, crfLevel, enableTwoPass, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, preset, profile, rateControlMode, tune, vbvFullnessBits, vbvSizeBits, widthPixels);
        }
    }
}
