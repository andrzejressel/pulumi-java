// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * Product price range when there are a range of prices for different variations of the same product.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs();

    /**
     * The maximum product price.
     * 
     */
    @InputImport(name="max", required=true)
    private final Input<Double> max;

    public Input<Double> getMax() {
        return this.max;
    }

    /**
     * The minimum product price.
     * 
     */
    @InputImport(name="min", required=true)
    private final Input<Double> min;

    public Input<Double> getMin() {
        return this.min;
    }

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs(
        Input<Double> max,
        Input<Double> min) {
        this.max = Objects.requireNonNull(max, "expected parameter 'max' to be non-null");
        this.min = Objects.requireNonNull(min, "expected parameter 'min' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Double> max;
        private Input<Double> min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(Input<Double> max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMax(Double max) {
            this.max = Input.of(Objects.requireNonNull(max));
            return this;
        }

        public Builder setMin(Input<Double> min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }

        public Builder setMin(Double min) {
            this.min = Input.of(Objects.requireNonNull(min));
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeArgs(max, min);
        }
    }
}
