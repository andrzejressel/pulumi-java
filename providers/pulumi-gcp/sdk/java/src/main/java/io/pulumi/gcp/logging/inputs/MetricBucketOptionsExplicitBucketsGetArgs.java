// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


public final class MetricBucketOptionsExplicitBucketsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsExplicitBucketsGetArgs Empty = new MetricBucketOptionsExplicitBucketsGetArgs();

    /**
     * The values must be monotonically increasing.
     * 
     */
    @InputImport(name="bounds", required=true)
    private final Input<List<Double>> bounds;

    public Input<List<Double>> getBounds() {
        return this.bounds;
    }

    public MetricBucketOptionsExplicitBucketsGetArgs(Input<List<Double>> bounds) {
        this.bounds = Objects.requireNonNull(bounds, "expected parameter 'bounds' to be non-null");
    }

    private MetricBucketOptionsExplicitBucketsGetArgs() {
        this.bounds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExplicitBucketsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<Double>> bounds;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExplicitBucketsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bounds = defaults.bounds;
        }

        public Builder setBounds(Input<List<Double>> bounds) {
            this.bounds = Objects.requireNonNull(bounds);
            return this;
        }

        public Builder setBounds(List<Double> bounds) {
            this.bounds = Input.of(Objects.requireNonNull(bounds));
            return this;
        }

        public MetricBucketOptionsExplicitBucketsGetArgs build() {
            return new MetricBucketOptionsExplicitBucketsGetArgs(bounds);
        }
    }
}
