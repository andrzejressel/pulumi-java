// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.StreamingPathResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListStreamingLocatorPathsResult {
    /**
     * Download Paths supported by current Streaming Locator
     * 
     */
    private final @Nullable List<String> downloadPaths;
    /**
     * Streaming Paths supported by current Streaming Locator
     * 
     */
    private final @Nullable List<StreamingPathResponse> streamingPaths;

    @OutputCustomType.Constructor
    private ListStreamingLocatorPathsResult(
        @OutputCustomType.Parameter("downloadPaths") @Nullable List<String> downloadPaths,
        @OutputCustomType.Parameter("streamingPaths") @Nullable List<StreamingPathResponse> streamingPaths) {
        this.downloadPaths = downloadPaths;
        this.streamingPaths = streamingPaths;
    }

    /**
     * Download Paths supported by current Streaming Locator
     * 
    */
    public List<String> getDownloadPaths() {
        return this.downloadPaths == null ? List.of() : this.downloadPaths;
    }
    /**
     * Streaming Paths supported by current Streaming Locator
     * 
    */
    public List<StreamingPathResponse> getStreamingPaths() {
        return this.streamingPaths == null ? List.of() : this.streamingPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStreamingLocatorPathsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> downloadPaths;
        private @Nullable List<StreamingPathResponse> streamingPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStreamingLocatorPathsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadPaths = defaults.downloadPaths;
    	      this.streamingPaths = defaults.streamingPaths;
        }

        public Builder setDownloadPaths(@Nullable List<String> downloadPaths) {
            this.downloadPaths = downloadPaths;
            return this;
        }

        public Builder setStreamingPaths(@Nullable List<StreamingPathResponse> streamingPaths) {
            this.streamingPaths = streamingPaths;
            return this;
        }
        public ListStreamingLocatorPathsResult build() {
            return new ListStreamingLocatorPathsResult(downloadPaths, streamingPaths);
        }
    }
}
