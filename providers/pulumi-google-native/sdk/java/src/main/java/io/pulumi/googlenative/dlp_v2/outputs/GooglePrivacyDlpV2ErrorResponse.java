// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ErrorResponse {
    /**
     * Detailed error codes and messages.
     * 
     */
    private final GoogleRpcStatusResponse details;
    /**
     * The times the error occurred.
     * 
     */
    private final List<String> timestamps;

    @OutputCustomType.Constructor({"details","timestamps"})
    private GooglePrivacyDlpV2ErrorResponse(
        GoogleRpcStatusResponse details,
        List<String> timestamps) {
        this.details = Objects.requireNonNull(details);
        this.timestamps = Objects.requireNonNull(timestamps);
    }

    /**
     * Detailed error codes and messages.
     * 
     */
    public GoogleRpcStatusResponse getDetails() {
        return this.details;
    }
    /**
     * The times the error occurred.
     * 
     */
    public List<String> getTimestamps() {
        return this.timestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusResponse details;
        private List<String> timestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.timestamps = defaults.timestamps;
        }

        public Builder setDetails(GoogleRpcStatusResponse details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setTimestamps(List<String> timestamps) {
            this.timestamps = Objects.requireNonNull(timestamps);
            return this;
        }

        public GooglePrivacyDlpV2ErrorResponse build() {
            return new GooglePrivacyDlpV2ErrorResponse(details, timestamps);
        }
    }
}
