// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class ResourceStatusSchedulingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceStatusSchedulingResponse Empty = new ResourceStatusSchedulingResponse();

    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
     */
    @InputImport(name="availabilityDomain", required=true)
    private final Integer availabilityDomain;

    public Integer getAvailabilityDomain() {
        return this.availabilityDomain;
    }

    public ResourceStatusSchedulingResponse(Integer availabilityDomain) {
        this.availabilityDomain = Objects.requireNonNull(availabilityDomain, "expected parameter 'availabilityDomain' to be non-null");
    }

    private ResourceStatusSchedulingResponse() {
        this.availabilityDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceStatusSchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer availabilityDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceStatusSchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomain = defaults.availabilityDomain;
        }

        public Builder setAvailabilityDomain(Integer availabilityDomain) {
            this.availabilityDomain = Objects.requireNonNull(availabilityDomain);
            return this;
        }

        public ResourceStatusSchedulingResponse build() {
            return new ResourceStatusSchedulingResponse(availabilityDomain);
        }
    }
}
