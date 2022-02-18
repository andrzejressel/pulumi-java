// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AdvancedMachineFeaturesResponse {
    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    private final Boolean enableNestedVirtualization;
    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    private final Boolean enableUefiNetworking;
    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    private final Integer threadsPerCore;

    @OutputCustomType.Constructor({"enableNestedVirtualization","enableUefiNetworking","threadsPerCore"})
    private AdvancedMachineFeaturesResponse(
        Boolean enableNestedVirtualization,
        Boolean enableUefiNetworking,
        Integer threadsPerCore) {
        this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
        this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
    }

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    public Boolean getEnableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }
    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    public Boolean getEnableUefiNetworking() {
        return this.enableUefiNetworking;
    }
    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    public Integer getThreadsPerCore() {
        return this.threadsPerCore;
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
        private Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder setEnableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }

        public Builder setEnableUefiNetworking(Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
            return this;
        }

        public Builder setThreadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }

        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(enableNestedVirtualization, enableUefiNetworking, threadsPerCore);
        }
    }
}
