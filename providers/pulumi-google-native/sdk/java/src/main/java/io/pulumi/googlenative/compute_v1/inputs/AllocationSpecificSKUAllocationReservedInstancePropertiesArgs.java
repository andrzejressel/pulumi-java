// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the SKU instances being reserved. Next ID: 9
 * 
 */
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUAllocationReservedInstancePropertiesArgs Empty = new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs();

    /**
     * Specifies accelerator type and count.
     * 
     */
    @InputImport(name="guestAccelerators")
    private final @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators;

    public Input<List<AcceleratorConfigArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    @InputImport(name="localSsds")
    private final @Nullable Input<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds;

    public Input<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> getLocalSsds() {
        return this.localSsds == null ? Input.empty() : this.localSsds;
    }

    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint")
    private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Minimum cpu platform the reservation.
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    public AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(
        @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators,
        @Nullable Input<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds,
        @Nullable Input<String> locationHint,
        @Nullable Input<String> machineType,
        @Nullable Input<String> minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.locationHint = locationHint;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
    }

    private AllocationSpecificSKUAllocationReservedInstancePropertiesArgs() {
        this.guestAccelerators = Input.empty();
        this.localSsds = Input.empty();
        this.locationHint = Input.empty();
        this.machineType = Input.empty();
        this.minCpuPlatform = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators;
        private @Nullable Input<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<String> machineType;
        private @Nullable Input<String> minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationReservedInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.locationHint = defaults.locationHint;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder setGuestAccelerators(@Nullable Input<List<AcceleratorConfigArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<AcceleratorConfigArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setLocalSsds(@Nullable Input<List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs>> localSsds) {
            this.localSsds = localSsds;
            return this;
        }

        public Builder setLocalSsds(@Nullable List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskArgs> localSsds) {
            this.localSsds = Input.ofNullable(localSsds);
            return this;
        }

        public Builder setLocationHint(@Nullable Input<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder setLocationHint(@Nullable String locationHint) {
            this.locationHint = Input.ofNullable(locationHint);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public AllocationSpecificSKUAllocationReservedInstancePropertiesArgs build() {
            return new AllocationSpecificSKUAllocationReservedInstancePropertiesArgs(guestAccelerators, localSsds, locationHint, machineType, minCpuPlatform);
        }
    }
}
