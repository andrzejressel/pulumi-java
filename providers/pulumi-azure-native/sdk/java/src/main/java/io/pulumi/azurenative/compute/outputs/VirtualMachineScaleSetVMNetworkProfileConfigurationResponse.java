// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetNetworkConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetVMNetworkProfileConfigurationResponse {
    /**
     * The list of network configurations.
     * 
     */
    private final @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

    @OutputCustomType.Constructor
    private VirtualMachineScaleSetVMNetworkProfileConfigurationResponse(@OutputCustomType.Parameter("networkInterfaceConfigurations") @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
    }

    /**
     * The list of network configurations.
     * 
    */
    public List<VirtualMachineScaleSetNetworkConfigurationResponse> getNetworkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations == null ? List.of() : this.networkInterfaceConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMNetworkProfileConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMNetworkProfileConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceConfigurations = defaults.networkInterfaceConfigurations;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }
        public VirtualMachineScaleSetVMNetworkProfileConfigurationResponse build() {
            return new VirtualMachineScaleSetVMNetworkProfileConfigurationResponse(networkInterfaceConfigurations);
        }
    }
}
