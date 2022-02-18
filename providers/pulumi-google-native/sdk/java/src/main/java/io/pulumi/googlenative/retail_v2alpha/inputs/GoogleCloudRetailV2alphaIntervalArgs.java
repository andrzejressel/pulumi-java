// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A floating point interval.
 * 
 */
public final class GoogleCloudRetailV2alphaIntervalArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaIntervalArgs Empty = new GoogleCloudRetailV2alphaIntervalArgs();

    /**
     * Exclusive upper bound.
     * 
     */
    @InputImport(name="exclusiveMaximum")
    private final @Nullable Input<Double> exclusiveMaximum;

    public Input<Double> getExclusiveMaximum() {
        return this.exclusiveMaximum == null ? Input.empty() : this.exclusiveMaximum;
    }

    /**
     * Exclusive lower bound.
     * 
     */
    @InputImport(name="exclusiveMinimum")
    private final @Nullable Input<Double> exclusiveMinimum;

    public Input<Double> getExclusiveMinimum() {
        return this.exclusiveMinimum == null ? Input.empty() : this.exclusiveMinimum;
    }

    /**
     * Inclusive upper bound.
     * 
     */
    @InputImport(name="maximum")
    private final @Nullable Input<Double> maximum;

    public Input<Double> getMaximum() {
        return this.maximum == null ? Input.empty() : this.maximum;
    }

    /**
     * Inclusive lower bound.
     * 
     */
    @InputImport(name="minimum")
    private final @Nullable Input<Double> minimum;

    public Input<Double> getMinimum() {
        return this.minimum == null ? Input.empty() : this.minimum;
    }

    public GoogleCloudRetailV2alphaIntervalArgs(
        @Nullable Input<Double> exclusiveMaximum,
        @Nullable Input<Double> exclusiveMinimum,
        @Nullable Input<Double> maximum,
        @Nullable Input<Double> minimum) {
        this.exclusiveMaximum = exclusiveMaximum;
        this.exclusiveMinimum = exclusiveMinimum;
        this.maximum = maximum;
        this.minimum = minimum;
    }

    private GoogleCloudRetailV2alphaIntervalArgs() {
        this.exclusiveMaximum = Input.empty();
        this.exclusiveMinimum = Input.empty();
        this.maximum = Input.empty();
        this.minimum = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> exclusiveMaximum;
        private @Nullable Input<Double> exclusiveMinimum;
        private @Nullable Input<Double> maximum;
        private @Nullable Input<Double> minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaIntervalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusiveMaximum = defaults.exclusiveMaximum;
    	      this.exclusiveMinimum = defaults.exclusiveMinimum;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder setExclusiveMaximum(@Nullable Input<Double> exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }

        public Builder setExclusiveMaximum(@Nullable Double exclusiveMaximum) {
            this.exclusiveMaximum = Input.ofNullable(exclusiveMaximum);
            return this;
        }

        public Builder setExclusiveMinimum(@Nullable Input<Double> exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }

        public Builder setExclusiveMinimum(@Nullable Double exclusiveMinimum) {
            this.exclusiveMinimum = Input.ofNullable(exclusiveMinimum);
            return this;
        }

        public Builder setMaximum(@Nullable Input<Double> maximum) {
            this.maximum = maximum;
            return this;
        }

        public Builder setMaximum(@Nullable Double maximum) {
            this.maximum = Input.ofNullable(maximum);
            return this;
        }

        public Builder setMinimum(@Nullable Input<Double> minimum) {
            this.minimum = minimum;
            return this;
        }

        public Builder setMinimum(@Nullable Double minimum) {
            this.minimum = Input.ofNullable(minimum);
            return this;
        }

        public GoogleCloudRetailV2alphaIntervalArgs build() {
            return new GoogleCloudRetailV2alphaIntervalArgs(exclusiveMaximum, exclusiveMinimum, maximum, minimum);
        }
    }
}
