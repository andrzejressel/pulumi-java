// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2BucketResponse {
    /**
     * Upper bound of the range, exclusive; type must match min.
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse max;
    /**
     * Lower bound of the range, inclusive. Type should be the same as max if used.
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse min;
    /**
     * Replacement value for this bucket.
     * 
     */
    private final GooglePrivacyDlpV2ValueResponse replacementValue;

    @OutputCustomType.Constructor({"max","min","replacementValue"})
    private GooglePrivacyDlpV2BucketResponse(
        GooglePrivacyDlpV2ValueResponse max,
        GooglePrivacyDlpV2ValueResponse min,
        GooglePrivacyDlpV2ValueResponse replacementValue) {
        this.max = Objects.requireNonNull(max);
        this.min = Objects.requireNonNull(min);
        this.replacementValue = Objects.requireNonNull(replacementValue);
    }

    /**
     * Upper bound of the range, exclusive; type must match min.
     * 
     */
    public GooglePrivacyDlpV2ValueResponse getMax() {
        return this.max;
    }
    /**
     * Lower bound of the range, inclusive. Type should be the same as max if used.
     * 
     */
    public GooglePrivacyDlpV2ValueResponse getMin() {
        return this.min;
    }
    /**
     * Replacement value for this bucket.
     * 
     */
    public GooglePrivacyDlpV2ValueResponse getReplacementValue() {
        return this.replacementValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ValueResponse max;
        private GooglePrivacyDlpV2ValueResponse min;
        private GooglePrivacyDlpV2ValueResponse replacementValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
    	      this.replacementValue = defaults.replacementValue;
        }

        public Builder setMax(GooglePrivacyDlpV2ValueResponse max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMin(GooglePrivacyDlpV2ValueResponse min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }

        public Builder setReplacementValue(GooglePrivacyDlpV2ValueResponse replacementValue) {
            this.replacementValue = Objects.requireNonNull(replacementValue);
            return this;
        }

        public GooglePrivacyDlpV2BucketResponse build() {
            return new GooglePrivacyDlpV2BucketResponse(max, min, replacementValue);
        }
    }
}
