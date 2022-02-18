// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MetricBucketOptionsExplicitBuckets {
    /**
     * The values must be monotonically increasing.
     * 
     */
    private final List<Double> bounds;

    @OutputCustomType.Constructor({"bounds"})
    private MetricBucketOptionsExplicitBuckets(List<Double> bounds) {
        this.bounds = Objects.requireNonNull(bounds);
    }

    /**
     * The values must be monotonically increasing.
     * 
     */
    public List<Double> getBounds() {
        return this.bounds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExplicitBuckets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Double> bounds;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExplicitBuckets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bounds = defaults.bounds;
        }

        public Builder setBounds(List<Double> bounds) {
            this.bounds = Objects.requireNonNull(bounds);
            return this;
        }

        public MetricBucketOptionsExplicitBuckets build() {
            return new MetricBucketOptionsExplicitBuckets(bounds);
        }
    }
}
