// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkconnectivity.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeLinkedRouterApplianceInstancesInstanceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeLinkedRouterApplianceInstancesInstanceGetArgs Empty = new SpokeLinkedRouterApplianceInstancesInstanceGetArgs();

    /**
     * The IP address on the VM to use for peering.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The URI of the virtual machine resource
     * 
     */
    @InputImport(name="virtualMachine")
    private final @Nullable Input<String> virtualMachine;

    public Input<String> getVirtualMachine() {
        return this.virtualMachine == null ? Input.empty() : this.virtualMachine;
    }

    public SpokeLinkedRouterApplianceInstancesInstanceGetArgs(
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> virtualMachine) {
        this.ipAddress = ipAddress;
        this.virtualMachine = virtualMachine;
    }

    private SpokeLinkedRouterApplianceInstancesInstanceGetArgs() {
        this.ipAddress = Input.empty();
        this.virtualMachine = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeLinkedRouterApplianceInstancesInstanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeLinkedRouterApplianceInstancesInstanceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setVirtualMachine(@Nullable Input<String> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }

        public Builder setVirtualMachine(@Nullable String virtualMachine) {
            this.virtualMachine = Input.ofNullable(virtualMachine);
            return this;
        }

        public SpokeLinkedRouterApplianceInstancesInstanceGetArgs build() {
            return new SpokeLinkedRouterApplianceInstancesInstanceGetArgs(ipAddress, virtualMachine);
        }
    }
}
