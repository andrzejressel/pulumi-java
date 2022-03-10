// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.ResourceHealthDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KPIResourceHealthDetailsResponse {
    /**
     * Resource Health Status
     * 
     */
    private final @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails;
    /**
     * Resource Health Status
     * 
     */
    private final @Nullable String resourceHealthStatus;

    @OutputCustomType.Constructor
    private KPIResourceHealthDetailsResponse(
        @OutputCustomType.Parameter("resourceHealthDetails") @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails,
        @OutputCustomType.Parameter("resourceHealthStatus") @Nullable String resourceHealthStatus) {
        this.resourceHealthDetails = resourceHealthDetails;
        this.resourceHealthStatus = resourceHealthStatus;
    }

    /**
     * Resource Health Status
     * 
    */
    public List<ResourceHealthDetailsResponse> getResourceHealthDetails() {
        return this.resourceHealthDetails == null ? List.of() : this.resourceHealthDetails;
    }
    /**
     * Resource Health Status
     * 
    */
    public Optional<String> getResourceHealthStatus() {
        return Optional.ofNullable(this.resourceHealthStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KPIResourceHealthDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails;
        private @Nullable String resourceHealthStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(KPIResourceHealthDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceHealthDetails = defaults.resourceHealthDetails;
    	      this.resourceHealthStatus = defaults.resourceHealthStatus;
        }

        public Builder setResourceHealthDetails(@Nullable List<ResourceHealthDetailsResponse> resourceHealthDetails) {
            this.resourceHealthDetails = resourceHealthDetails;
            return this;
        }

        public Builder setResourceHealthStatus(@Nullable String resourceHealthStatus) {
            this.resourceHealthStatus = resourceHealthStatus;
            return this;
        }
        public KPIResourceHealthDetailsResponse build() {
            return new KPIResourceHealthDetailsResponse(resourceHealthDetails, resourceHealthStatus);
        }
    }
}
