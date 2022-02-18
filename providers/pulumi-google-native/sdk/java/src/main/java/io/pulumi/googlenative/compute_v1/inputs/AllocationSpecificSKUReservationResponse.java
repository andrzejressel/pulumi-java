// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUAllocationReservedInstancePropertiesResponse;
import java.lang.String;
import java.util.Objects;


/**
 * This reservation type allows to pre allocate specific instance configuration. Next ID: 5
 * 
 */
public final class AllocationSpecificSKUReservationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AllocationSpecificSKUReservationResponse Empty = new AllocationSpecificSKUReservationResponse();

    /**
     * Specifies the number of resources that are allocated.
     * 
     */
    @InputImport(name="count", required=true)
    private final String count;

    public String getCount() {
        return this.count;
    }

    /**
     * Indicates how many instances are in use.
     * 
     */
    @InputImport(name="inUseCount", required=true)
    private final String inUseCount;

    public String getInUseCount() {
        return this.inUseCount;
    }

    /**
     * The instance properties for the reservation.
     * 
     */
    @InputImport(name="instanceProperties", required=true)
    private final AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;

    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse getInstanceProperties() {
        return this.instanceProperties;
    }

    public AllocationSpecificSKUReservationResponse(
        String count,
        String inUseCount,
        AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.inUseCount = Objects.requireNonNull(inUseCount, "expected parameter 'inUseCount' to be non-null");
        this.instanceProperties = Objects.requireNonNull(instanceProperties, "expected parameter 'instanceProperties' to be non-null");
    }

    private AllocationSpecificSKUReservationResponse() {
        this.count = null;
        this.inUseCount = null;
        this.instanceProperties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUReservationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String count;
        private String inUseCount;
        private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUReservationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.inUseCount = defaults.inUseCount;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder setCount(String count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setInUseCount(String inUseCount) {
            this.inUseCount = Objects.requireNonNull(inUseCount);
            return this;
        }

        public Builder setInstanceProperties(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse instanceProperties) {
            this.instanceProperties = Objects.requireNonNull(instanceProperties);
            return this;
        }

        public AllocationSpecificSKUReservationResponse build() {
            return new AllocationSpecificSKUReservationResponse(count, inUseCount, instanceProperties);
        }
    }
}
