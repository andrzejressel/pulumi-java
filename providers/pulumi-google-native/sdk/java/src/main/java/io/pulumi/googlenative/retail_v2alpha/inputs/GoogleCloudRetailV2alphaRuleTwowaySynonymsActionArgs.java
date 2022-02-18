// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Creates a set of terms that will be treated as synonyms of each other. Example: synonyms of "sneakers" and "shoes". * "sneakers" will use a synonym of "shoes". * "shoes" will use a synonym of "sneakers".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs Empty = new GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs();

    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    @InputImport(name="synonyms")
    private final @Nullable Input<List<String>> synonyms;

    public Input<List<String>> getSynonyms() {
        return this.synonyms == null ? Input.empty() : this.synonyms;
    }

    public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs(@Nullable Input<List<String>> synonyms) {
        this.synonyms = synonyms;
    }

    private GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs() {
        this.synonyms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setSynonyms(@Nullable Input<List<String>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder setSynonyms(@Nullable List<String> synonyms) {
            this.synonyms = Input.ofNullable(synonyms);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleTwowaySynonymsActionArgs(synonyms);
        }
    }
}
