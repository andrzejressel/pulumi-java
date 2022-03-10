// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdAssetReferenceResponse {
    /**
     * ARM resource ID of the asset.
     * 
     */
    private final String assetId;
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'Id'.
     * 
     */
    private final String referenceType;

    @OutputCustomType.Constructor
    private IdAssetReferenceResponse(
        @OutputCustomType.Parameter("assetId") String assetId,
        @OutputCustomType.Parameter("referenceType") String referenceType) {
        this.assetId = assetId;
        this.referenceType = referenceType;
    }

    /**
     * ARM resource ID of the asset.
     * 
    */
    public String getAssetId() {
        return this.assetId;
    }
    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'Id'.
     * 
    */
    public String getReferenceType() {
        return this.referenceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(IdAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setAssetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }
        public IdAssetReferenceResponse build() {
            return new IdAssetReferenceResponse(assetId, referenceType);
        }
    }
}
