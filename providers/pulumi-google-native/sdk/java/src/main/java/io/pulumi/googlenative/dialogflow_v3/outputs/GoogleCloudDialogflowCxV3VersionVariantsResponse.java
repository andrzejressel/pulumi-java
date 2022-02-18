// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3VersionVariantsVariantResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3VersionVariantsResponse {
    /**
     * A list of flow version variants.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants;

    @OutputCustomType.Constructor({"variants"})
    private GoogleCloudDialogflowCxV3VersionVariantsResponse(List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants) {
        this.variants = Objects.requireNonNull(variants);
    }

    /**
     * A list of flow version variants.
     * 
     */
    public List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> getVariants() {
        return this.variants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VersionVariantsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VersionVariantsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder setVariants(List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants) {
            this.variants = Objects.requireNonNull(variants);
            return this;
        }

        public GoogleCloudDialogflowCxV3VersionVariantsResponse build() {
            return new GoogleCloudDialogflowCxV3VersionVariantsResponse(variants);
        }
    }
}
