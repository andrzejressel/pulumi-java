// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BucketCustomPlacementConfigResponse {
    /**
     * The list of regional locations in which data is placed.
     * 
     */
    private final List<String> dataLocations;

    @OutputCustomType.Constructor({"dataLocations"})
    private BucketCustomPlacementConfigResponse(List<String> dataLocations) {
        this.dataLocations = Objects.requireNonNull(dataLocations);
    }

    /**
     * The list of regional locations in which data is placed.
     * 
     */
    public List<String> getDataLocations() {
        return this.dataLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCustomPlacementConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dataLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCustomPlacementConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLocations = defaults.dataLocations;
        }

        public Builder setDataLocations(List<String> dataLocations) {
            this.dataLocations = Objects.requireNonNull(dataLocations);
            return this;
        }

        public BucketCustomPlacementConfigResponse build() {
            return new BucketCustomPlacementConfigResponse(dataLocations);
        }
    }
}
