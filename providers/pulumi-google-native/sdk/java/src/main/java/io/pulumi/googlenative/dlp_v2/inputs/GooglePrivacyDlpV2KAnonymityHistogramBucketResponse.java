// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Histogram of k-anonymity equivalence classes.
 * 
 */
public final class GooglePrivacyDlpV2KAnonymityHistogramBucketResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KAnonymityHistogramBucketResponse Empty = new GooglePrivacyDlpV2KAnonymityHistogramBucketResponse();

    /**
     * Total number of equivalence classes in this bucket.
     * 
     */
    @InputImport(name="bucketSize", required=true)
    private final String bucketSize;

    public String getBucketSize() {
        return this.bucketSize;
    }

    /**
     * Total number of distinct equivalence classes in this bucket.
     * 
     */
    @InputImport(name="bucketValueCount", required=true)
    private final String bucketValueCount;

    public String getBucketValueCount() {
        return this.bucketValueCount;
    }

    /**
     * Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    @InputImport(name="bucketValues", required=true)
    private final List<GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse> bucketValues;

    public List<GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse> getBucketValues() {
        return this.bucketValues;
    }

    /**
     * Lower bound on the size of the equivalence classes in this bucket.
     * 
     */
    @InputImport(name="equivalenceClassSizeLowerBound", required=true)
    private final String equivalenceClassSizeLowerBound;

    public String getEquivalenceClassSizeLowerBound() {
        return this.equivalenceClassSizeLowerBound;
    }

    /**
     * Upper bound on the size of the equivalence classes in this bucket.
     * 
     */
    @InputImport(name="equivalenceClassSizeUpperBound", required=true)
    private final String equivalenceClassSizeUpperBound;

    public String getEquivalenceClassSizeUpperBound() {
        return this.equivalenceClassSizeUpperBound;
    }

    public GooglePrivacyDlpV2KAnonymityHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse> bucketValues,
        String equivalenceClassSizeLowerBound,
        String equivalenceClassSizeUpperBound) {
        this.bucketSize = Objects.requireNonNull(bucketSize, "expected parameter 'bucketSize' to be non-null");
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount, "expected parameter 'bucketValueCount' to be non-null");
        this.bucketValues = Objects.requireNonNull(bucketValues, "expected parameter 'bucketValues' to be non-null");
        this.equivalenceClassSizeLowerBound = Objects.requireNonNull(equivalenceClassSizeLowerBound, "expected parameter 'equivalenceClassSizeLowerBound' to be non-null");
        this.equivalenceClassSizeUpperBound = Objects.requireNonNull(equivalenceClassSizeUpperBound, "expected parameter 'equivalenceClassSizeUpperBound' to be non-null");
    }

    private GooglePrivacyDlpV2KAnonymityHistogramBucketResponse() {
        this.bucketSize = null;
        this.bucketValueCount = null;
        this.bucketValues = List.of();
        this.equivalenceClassSizeLowerBound = null;
        this.equivalenceClassSizeUpperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse> bucketValues;
        private String equivalenceClassSizeLowerBound;
        private String equivalenceClassSizeUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.equivalenceClassSizeLowerBound = defaults.equivalenceClassSizeLowerBound;
    	      this.equivalenceClassSizeUpperBound = defaults.equivalenceClassSizeUpperBound;
        }

        public Builder setBucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder setBucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }

        public Builder setBucketValues(List<GooglePrivacyDlpV2KAnonymityEquivalenceClassResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }

        public Builder setEquivalenceClassSizeLowerBound(String equivalenceClassSizeLowerBound) {
            this.equivalenceClassSizeLowerBound = Objects.requireNonNull(equivalenceClassSizeLowerBound);
            return this;
        }

        public Builder setEquivalenceClassSizeUpperBound(String equivalenceClassSizeUpperBound) {
            this.equivalenceClassSizeUpperBound = Objects.requireNonNull(equivalenceClassSizeUpperBound);
            return this;
        }

        public GooglePrivacyDlpV2KAnonymityHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2KAnonymityHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, equivalenceClassSizeLowerBound, equivalenceClassSizeUpperBound);
        }
    }
}
