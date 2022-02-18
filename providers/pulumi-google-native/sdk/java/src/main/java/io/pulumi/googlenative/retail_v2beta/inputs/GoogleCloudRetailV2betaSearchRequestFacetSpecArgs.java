// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.retail_v2beta.inputs.GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A facet specification to perform faceted search.
 * 
 */
public final class GoogleCloudRetailV2betaSearchRequestFacetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaSearchRequestFacetSpecArgs Empty = new GoogleCloudRetailV2betaSearchRequestFacetSpecArgs();

    /**
     * Enables dynamic position for this facet. If set to true, the position of this facet among all facets in the response is determined by Google Retail Search. It will be ordered together with dynamic facets if dynamic facets is enabled. If set to false, the position of this facet in the response will be the same as in the request, and it will be ranked before the facets with dynamic position enable and all dynamic facets. For example, you may always want to have rating facet returned in the response, but it's not necessarily to always display the rating facet at the top. In that case, you can set enable_dynamic_position to true so that the position of rating facet in response will be determined by Google Retail Search. Another example, assuming you have the following facets in the request: * "rating", enable_dynamic_position = true * "price", enable_dynamic_position = false * "brands", enable_dynamic_position = false And also you have a dynamic facets enable, which will generate a facet 'gender'. Then the final order of the facets in the response can be ("price", "brands", "rating", "gender") or ("price", "brands", "gender", "rating") depends on how Google Retail Search orders "gender" and "rating" facets. However, notice that "price" and "brands" will always be ranked at 1st and 2nd position since their enable_dynamic_position are false.
     * 
     */
    @InputImport(name="enableDynamicPosition")
    private final @Nullable Input<Boolean> enableDynamicPosition;

    public Input<Boolean> getEnableDynamicPosition() {
        return this.enableDynamicPosition == null ? Input.empty() : this.enableDynamicPosition;
    }

    /**
     * List of keys to exclude when faceting. By default, FacetKey.key is not excluded from the filter unless it is listed in this field. For example, suppose there are 100 products with color facet "Red" and 200 products with color facet "Blue". A query containing the filter "colorFamilies:ANY("Red")" and have "colorFamilies" as FacetKey.key will by default return the "Red" with count 100. If this field contains "colorFamilies", then the query returns both the "Red" with count 100 and "Blue" with count 200, because the "colorFamilies" key is now excluded from the filter. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @InputImport(name="excludedFilterKeys")
    private final @Nullable Input<List<String>> excludedFilterKeys;

    public Input<List<String>> getExcludedFilterKeys() {
        return this.excludedFilterKeys == null ? Input.empty() : this.excludedFilterKeys;
    }

    /**
     * The facet key specification.
     * 
     */
    @InputImport(name="facetKey", required=true)
    private final Input<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey;

    public Input<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> getFacetKey() {
        return this.facetKey;
    }

    /**
     * Maximum of facet values that should be returned for this facet. If unspecified, defaults to 20. The maximum allowed value is 300. Values above 300 will be coerced to 300. If this field is negative, an INVALID_ARGUMENT is returned.
     * 
     */
    @InputImport(name="limit")
    private final @Nullable Input<Integer> limit;

    public Input<Integer> getLimit() {
        return this.limit == null ? Input.empty() : this.limit;
    }

    public GoogleCloudRetailV2betaSearchRequestFacetSpecArgs(
        @Nullable Input<Boolean> enableDynamicPosition,
        @Nullable Input<List<String>> excludedFilterKeys,
        Input<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey,
        @Nullable Input<Integer> limit) {
        this.enableDynamicPosition = enableDynamicPosition;
        this.excludedFilterKeys = excludedFilterKeys;
        this.facetKey = Objects.requireNonNull(facetKey, "expected parameter 'facetKey' to be non-null");
        this.limit = limit;
    }

    private GoogleCloudRetailV2betaSearchRequestFacetSpecArgs() {
        this.enableDynamicPosition = Input.empty();
        this.excludedFilterKeys = Input.empty();
        this.facetKey = Input.empty();
        this.limit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaSearchRequestFacetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDynamicPosition;
        private @Nullable Input<List<String>> excludedFilterKeys;
        private Input<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey;
        private @Nullable Input<Integer> limit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaSearchRequestFacetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicPosition = defaults.enableDynamicPosition;
    	      this.excludedFilterKeys = defaults.excludedFilterKeys;
    	      this.facetKey = defaults.facetKey;
    	      this.limit = defaults.limit;
        }

        public Builder setEnableDynamicPosition(@Nullable Input<Boolean> enableDynamicPosition) {
            this.enableDynamicPosition = enableDynamicPosition;
            return this;
        }

        public Builder setEnableDynamicPosition(@Nullable Boolean enableDynamicPosition) {
            this.enableDynamicPosition = Input.ofNullable(enableDynamicPosition);
            return this;
        }

        public Builder setExcludedFilterKeys(@Nullable Input<List<String>> excludedFilterKeys) {
            this.excludedFilterKeys = excludedFilterKeys;
            return this;
        }

        public Builder setExcludedFilterKeys(@Nullable List<String> excludedFilterKeys) {
            this.excludedFilterKeys = Input.ofNullable(excludedFilterKeys);
            return this;
        }

        public Builder setFacetKey(Input<GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs> facetKey) {
            this.facetKey = Objects.requireNonNull(facetKey);
            return this;
        }

        public Builder setFacetKey(GoogleCloudRetailV2betaSearchRequestFacetSpecFacetKeyArgs facetKey) {
            this.facetKey = Input.of(Objects.requireNonNull(facetKey));
            return this;
        }

        public Builder setLimit(@Nullable Input<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder setLimit(@Nullable Integer limit) {
            this.limit = Input.ofNullable(limit);
            return this;
        }

        public GoogleCloudRetailV2betaSearchRequestFacetSpecArgs build() {
            return new GoogleCloudRetailV2betaSearchRequestFacetSpecArgs(enableDynamicPosition, excludedFilterKeys, facetKey, limit);
        }
    }
}
