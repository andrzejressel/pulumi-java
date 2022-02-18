// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v3.outputs.LocationResponse;
import java.util.Objects;

@OutputCustomType
public final class CompanyDerivedInfoResponse {
    /**
     * A structured headquarters location of the company, resolved from Company.hq_location if provided.
     * 
     */
    private final LocationResponse headquartersLocation;

    @OutputCustomType.Constructor({"headquartersLocation"})
    private CompanyDerivedInfoResponse(LocationResponse headquartersLocation) {
        this.headquartersLocation = Objects.requireNonNull(headquartersLocation);
    }

    /**
     * A structured headquarters location of the company, resolved from Company.hq_location if provided.
     * 
     */
    public LocationResponse getHeadquartersLocation() {
        return this.headquartersLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompanyDerivedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationResponse headquartersLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(CompanyDerivedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headquartersLocation = defaults.headquartersLocation;
        }

        public Builder setHeadquartersLocation(LocationResponse headquartersLocation) {
            this.headquartersLocation = Objects.requireNonNull(headquartersLocation);
            return this;
        }

        public CompanyDerivedInfoResponse build() {
            return new CompanyDerivedInfoResponse(headquartersLocation);
        }
    }
}
