// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.SegmentSettingsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MuxStreamResponse {
    /**
     * The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
     * 
     */
    private final String container;
    /**
     * List of `ElementaryStream.key`s multiplexed in this stream.
     * 
     */
    private final List<String> elementaryStreams;
    /**
     * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
     * 
     */
    private final String fileName;
    /**
     * A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
     * 
     */
    private final String key;
    /**
     * Segment settings for `ts`, `fmp4` and `vtt`.
     * 
     */
    private final SegmentSettingsResponse segmentSettings;

    @OutputCustomType.Constructor({"container","elementaryStreams","fileName","key","segmentSettings"})
    private MuxStreamResponse(
        String container,
        List<String> elementaryStreams,
        String fileName,
        String key,
        SegmentSettingsResponse segmentSettings) {
        this.container = Objects.requireNonNull(container);
        this.elementaryStreams = Objects.requireNonNull(elementaryStreams);
        this.fileName = Objects.requireNonNull(fileName);
        this.key = Objects.requireNonNull(key);
        this.segmentSettings = Objects.requireNonNull(segmentSettings);
    }

    /**
     * The container format. The default is `mp4` Supported container formats: - `ts` - `fmp4`- the corresponding file extension is `.m4s` - `mp4` - `vtt`
     * 
     */
    public String getContainer() {
        return this.container;
    }
    /**
     * List of `ElementaryStream.key`s multiplexed in this stream.
     * 
     */
    public List<String> getElementaryStreams() {
        return this.elementaryStreams;
    }
    /**
     * The name of the generated file. The default is `MuxStream.key` with the extension suffix corresponding to the `MuxStream.container`. Individual segments also have an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `mux_stream0000000123.ts`.
     * 
     */
    public String getFileName() {
        return this.fileName;
    }
    /**
     * A unique key for this multiplexed stream. HLS media manifests will be named `MuxStream.key` with the `.m3u8` extension suffix.
     * 
     */
    public String getKey() {
        return this.key;
    }
    /**
     * Segment settings for `ts`, `fmp4` and `vtt`.
     * 
     */
    public SegmentSettingsResponse getSegmentSettings() {
        return this.segmentSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MuxStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private List<String> elementaryStreams;
        private String fileName;
        private String key;
        private SegmentSettingsResponse segmentSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(MuxStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.elementaryStreams = defaults.elementaryStreams;
    	      this.fileName = defaults.fileName;
    	      this.key = defaults.key;
    	      this.segmentSettings = defaults.segmentSettings;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setElementaryStreams(List<String> elementaryStreams) {
            this.elementaryStreams = Objects.requireNonNull(elementaryStreams);
            return this;
        }

        public Builder setFileName(String fileName) {
            this.fileName = Objects.requireNonNull(fileName);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setSegmentSettings(SegmentSettingsResponse segmentSettings) {
            this.segmentSettings = Objects.requireNonNull(segmentSettings);
            return this;
        }

        public MuxStreamResponse build() {
            return new MuxStreamResponse(container, elementaryStreams, fileName, key, segmentSettings);
        }
    }
}
