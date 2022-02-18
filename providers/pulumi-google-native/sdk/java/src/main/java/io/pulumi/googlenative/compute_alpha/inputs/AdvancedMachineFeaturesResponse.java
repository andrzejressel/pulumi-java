// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
 * 
 */
public final class AdvancedMachineFeaturesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdvancedMachineFeaturesResponse Empty = new AdvancedMachineFeaturesResponse();

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    @InputImport(name="enableNestedVirtualization", required=true)
    private final Boolean enableNestedVirtualization;

    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }

    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    @InputImport(name="enableUefiNetworking", required=true)
    private final Boolean enableUefiNetworking;

    public Boolean getEnableUefiNetworking() {
        return this.enableUefiNetworking;
    }

    /**
     * The number of vNUMA nodes.
     * 
     */
    @InputImport(name="numaNodeCount", required=true)
    private final Integer numaNodeCount;

    public Integer getNumaNodeCount() {
        return this.numaNodeCount;
    }

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @InputImport(name="threadsPerCore", required=true)
    private final Integer threadsPerCore;

    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
    }

    /**
     * The number of physical cores to expose to an instance. Multiply by the number of threads per core to compute the total number of virtual CPUs to expose to the instance. If unset, the number of cores is inferred from the instance's nominal CPU count and the underlying platform's SMT width.
     * 
     */
    @InputImport(name="visibleCoreCount", required=true)
    private final Integer visibleCoreCount;

    public Integer getVisibleCoreCount() {
        return this.visibleCoreCount;
    }

    public AdvancedMachineFeaturesResponse(
        Boolean enableNestedVirtualization,
        Boolean enableUefiNetworking,
        Integer numaNodeCount,
        Integer threadsPerCore,
        Integer visibleCoreCount) {
        this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization, "expected parameter 'enableNestedVirtualization' to be non-null");
        this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking, "expected parameter 'enableUefiNetworking' to be non-null");
        this.numaNodeCount = Objects.requireNonNull(numaNodeCount, "expected parameter 'numaNodeCount' to be non-null");
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore, "expected parameter 'threadsPerCore' to be non-null");
        this.visibleCoreCount = Objects.requireNonNull(visibleCoreCount, "expected parameter 'visibleCoreCount' to be non-null");
    }

    private AdvancedMachineFeaturesResponse() {
        this.enableNestedVirtualization = null;
        this.enableUefiNetworking = null;
        this.numaNodeCount = null;
        this.threadsPerCore = null;
        this.visibleCoreCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Boolean enableUefiNetworking;
        private Integer numaNodeCount;
        private Integer threadsPerCore;
        private Integer visibleCoreCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.numaNodeCount = defaults.numaNodeCount;
    	      this.threadsPerCore = defaults.threadsPerCore;
    	      this.visibleCoreCount = defaults.visibleCoreCount;
        }

        public Builder setEnableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder setEnableUefiNetworking(Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
            return this;
        }

        public Builder setNumaNodeCount(Integer numaNodeCount) {
            this.numaNodeCount = Objects.requireNonNull(numaNodeCount);
            return this;
        }

        public Builder setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }

        public Builder setVisibleCoreCount(Integer visibleCoreCount) {
            this.visibleCoreCount = Objects.requireNonNull(visibleCoreCount);
            return this;
        }

        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(enableNestedVirtualization, enableUefiNetworking, numaNodeCount, threadsPerCore, visibleCoreCount);
        }
    }
}
