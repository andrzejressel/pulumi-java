// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyVmMaintenancePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyVmMaintenancePolicyArgs Empty = new ResourcePolicyVmMaintenancePolicyArgs();

    @InputImport(name="concurrencyControlGroup")
    private final @Nullable Input<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup;

    public Input<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> getConcurrencyControlGroup() {
        return this.concurrencyControlGroup == null ? Input.empty() : this.concurrencyControlGroup;
    }

    /**
     * Maintenance windows that are applied to VMs covered by this policy.
     * 
     */
    @InputImport(name="maintenanceWindow")
    private final @Nullable Input<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow;

    public Input<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    public ResourcePolicyVmMaintenancePolicyArgs(
        @Nullable Input<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup,
        @Nullable Input<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow) {
        this.concurrencyControlGroup = concurrencyControlGroup;
        this.maintenanceWindow = maintenanceWindow;
    }

    private ResourcePolicyVmMaintenancePolicyArgs() {
        this.concurrencyControlGroup = Input.empty();
        this.maintenanceWindow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup;
        private @Nullable Input<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyControlGroup = defaults.concurrencyControlGroup;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
        }

        public Builder setConcurrencyControlGroup(@Nullable Input<ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs> concurrencyControlGroup) {
            this.concurrencyControlGroup = concurrencyControlGroup;
            return this;
        }

        public Builder setConcurrencyControlGroup(@Nullable ResourcePolicyVmMaintenancePolicyConcurrencyControlArgs concurrencyControlGroup) {
            this.concurrencyControlGroup = Input.ofNullable(concurrencyControlGroup);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable Input<ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable ResourcePolicyVmMaintenancePolicyMaintenanceWindowArgs maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public ResourcePolicyVmMaintenancePolicyArgs build() {
            return new ResourcePolicyVmMaintenancePolicyArgs(concurrencyControlGroup, maintenanceWindow);
        }
    }
}
