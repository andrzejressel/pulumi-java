// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FeatureMap represents extra features that customers want to include in the recommendation model for catalogs/user events as categorical/numerical features.
 * 
 */
public final class GoogleCloudRecommendationengineV1beta1FeatureMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRecommendationengineV1beta1FeatureMapArgs Empty = new GoogleCloudRecommendationengineV1beta1FeatureMapArgs();

    /**
     * Categorical features that can take on one of a limited number of possible values. Some examples would be the brand/maker of a product, or country of a customer. Feature names and values must be UTF-8 encoded strings. For example: `{ "colors": {"value": ["yellow", "green"]}, "sizes": {"value":["S", "M"]}`
     * 
     */
    @InputImport(name="categoricalFeatures")
    private final @Nullable Input<Map<String,String>> categoricalFeatures;

    public Input<Map<String,String>> getCategoricalFeatures() {
        return this.categoricalFeatures == null ? Input.empty() : this.categoricalFeatures;
    }

    /**
     * Numerical features. Some examples would be the height/weight of a product, or age of a customer. Feature names must be UTF-8 encoded strings. For example: `{ "lengths_cm": {"value":[2.3, 15.4]}, "heights_cm": {"value":[8.1, 6.4]} }`
     * 
     */
    @InputImport(name="numericalFeatures")
    private final @Nullable Input<Map<String,String>> numericalFeatures;

    public Input<Map<String,String>> getNumericalFeatures() {
        return this.numericalFeatures == null ? Input.empty() : this.numericalFeatures;
    }

    public GoogleCloudRecommendationengineV1beta1FeatureMapArgs(
        @Nullable Input<Map<String,String>> categoricalFeatures,
        @Nullable Input<Map<String,String>> numericalFeatures) {
        this.categoricalFeatures = categoricalFeatures;
        this.numericalFeatures = numericalFeatures;
    }

    private GoogleCloudRecommendationengineV1beta1FeatureMapArgs() {
        this.categoricalFeatures = Input.empty();
        this.numericalFeatures = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecommendationengineV1beta1FeatureMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> categoricalFeatures;
        private @Nullable Input<Map<String,String>> numericalFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecommendationengineV1beta1FeatureMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalFeatures = defaults.categoricalFeatures;
    	      this.numericalFeatures = defaults.numericalFeatures;
        }

        public Builder setCategoricalFeatures(@Nullable Input<Map<String,String>> categoricalFeatures) {
            this.categoricalFeatures = categoricalFeatures;
            return this;
        }

        public Builder setCategoricalFeatures(@Nullable Map<String,String> categoricalFeatures) {
            this.categoricalFeatures = Input.ofNullable(categoricalFeatures);
            return this;
        }

        public Builder setNumericalFeatures(@Nullable Input<Map<String,String>> numericalFeatures) {
            this.numericalFeatures = numericalFeatures;
            return this;
        }

        public Builder setNumericalFeatures(@Nullable Map<String,String> numericalFeatures) {
            this.numericalFeatures = Input.ofNullable(numericalFeatures);
            return this;
        }

        public GoogleCloudRecommendationengineV1beta1FeatureMapArgs build() {
            return new GoogleCloudRecommendationengineV1beta1FeatureMapArgs(categoricalFeatures, numericalFeatures);
        }
    }
}
