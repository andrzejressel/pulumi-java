// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricBucketOptionsLinearBucketsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsLinearBucketsArgs Empty = new MetricBucketOptionsLinearBucketsArgs();

    /**
     * Must be greater than 0.
     * 
     */
    @InputImport(name="numFiniteBuckets")
    private final @Nullable Input<Integer> numFiniteBuckets;

    public Input<Integer> getNumFiniteBuckets() {
        return this.numFiniteBuckets == null ? Input.empty() : this.numFiniteBuckets;
    }

    /**
     * Lower bound of the first bucket.
     * 
     */
    @InputImport(name="offset")
    private final @Nullable Input<Double> offset;

    public Input<Double> getOffset() {
        return this.offset == null ? Input.empty() : this.offset;
    }

    /**
     * Must be greater than 0.
     * 
     */
    @InputImport(name="width")
    private final @Nullable Input<Double> width;

    public Input<Double> getWidth() {
        return this.width == null ? Input.empty() : this.width;
    }

    public MetricBucketOptionsLinearBucketsArgs(
        @Nullable Input<Integer> numFiniteBuckets,
        @Nullable Input<Double> offset,
        @Nullable Input<Double> width) {
        this.numFiniteBuckets = numFiniteBuckets;
        this.offset = offset;
        this.width = width;
    }

    private MetricBucketOptionsLinearBucketsArgs() {
        this.numFiniteBuckets = Input.empty();
        this.offset = Input.empty();
        this.width = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsLinearBucketsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numFiniteBuckets;
        private @Nullable Input<Double> offset;
        private @Nullable Input<Double> width;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsLinearBucketsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.offset = defaults.offset;
    	      this.width = defaults.width;
        }

        public Builder setNumFiniteBuckets(@Nullable Input<Integer> numFiniteBuckets) {
            this.numFiniteBuckets = numFiniteBuckets;
            return this;
        }

        public Builder setNumFiniteBuckets(@Nullable Integer numFiniteBuckets) {
            this.numFiniteBuckets = Input.ofNullable(numFiniteBuckets);
            return this;
        }

        public Builder setOffset(@Nullable Input<Double> offset) {
            this.offset = offset;
            return this;
        }

        public Builder setOffset(@Nullable Double offset) {
            this.offset = Input.ofNullable(offset);
            return this;
        }

        public Builder setWidth(@Nullable Input<Double> width) {
            this.width = width;
            return this;
        }

        public Builder setWidth(@Nullable Double width) {
            this.width = Input.ofNullable(width);
            return this;
        }

        public MetricBucketOptionsLinearBucketsArgs build() {
            return new MetricBucketOptionsLinearBucketsArgs(numFiniteBuckets, offset, width);
        }
    }
}
