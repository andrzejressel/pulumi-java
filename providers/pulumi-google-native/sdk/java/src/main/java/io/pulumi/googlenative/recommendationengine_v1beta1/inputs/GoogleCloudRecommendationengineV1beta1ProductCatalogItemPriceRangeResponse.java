// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * Product price range when there are a range of prices for different variations of the same product.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse Empty = new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse();

    /**
     * The maximum product price.
     * 
     */
    @InputImport(name="max", required=true)
    private final Double max;

    public Double getMax() {
        return this.max;
    }

    /**
     * The minimum product price.
     * 
     */
    @InputImport(name="min", required=true)
    private final Double min;

    public Double getMin() {
        return this.min;
    }

    public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(
        Double max,
        Double min) {
        this.max = Objects.requireNonNull(max, "expected parameter 'max' to be non-null");
        this.min = Objects.requireNonNull(min, "expected parameter 'min' to be non-null");
    }

    private GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse() {
        this.max = null;
        this.min = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double max;
        private Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(Double max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder setMin(Double min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse build() {
            return new GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRangeResponse(max, min);
        }
    }
}
