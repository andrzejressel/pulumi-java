// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.BootDiagnosticsInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.DiskInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.azurenative.compute.outputs.MaintenanceRedeployStatusResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineAgentInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineExtensionInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineHealthStatusResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachinePatchStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineInstanceViewResponse {
    /**
     * Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. <br><br>Minimum api-version: 2020-06-01.
     * 
     */
    private final String assignedHost;
    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
     */
    private final @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics;
    /**
     * The computer name assigned to the virtual machine.
     * 
     */
    private final @Nullable String computerName;
    /**
     * The virtual machine disk information.
     * 
     */
    private final @Nullable List<DiskInstanceViewResponse> disks;
    /**
     * The extensions information.
     * 
     */
    private final @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions;
    /**
     * Specifies the HyperVGeneration Type associated with a resource
     * 
     */
    private final @Nullable String hyperVGeneration;
    /**
     * The Maintenance Operation status on the virtual machine.
     * 
     */
    private final @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus;
    /**
     * The Operating System running on the virtual machine.
     * 
     */
    private final @Nullable String osName;
    /**
     * The version of Operating System running on the virtual machine.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * [Preview Feature] The status of virtual machine patch operations.
     * 
     */
    private final @Nullable VirtualMachinePatchStatusResponse patchStatus;
    /**
     * Specifies the fault domain of the virtual machine.
     * 
     */
    private final @Nullable Integer platformFaultDomain;
    /**
     * Specifies the update domain of the virtual machine.
     * 
     */
    private final @Nullable Integer platformUpdateDomain;
    /**
     * The Remote desktop certificate thumbprint.
     * 
     */
    private final @Nullable String rdpThumbPrint;
    /**
     * The resource status information.
     * 
     */
    private final @Nullable List<InstanceViewStatusResponse> statuses;
    /**
     * The VM Agent running on the virtual machine.
     * 
     */
    private final @Nullable VirtualMachineAgentInstanceViewResponse vmAgent;
    /**
     * The health status for the VM.
     * 
     */
    private final VirtualMachineHealthStatusResponse vmHealth;

    @OutputCustomType.Constructor
    private VirtualMachineInstanceViewResponse(
        @OutputCustomType.Parameter("assignedHost") String assignedHost,
        @OutputCustomType.Parameter("bootDiagnostics") @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics,
        @OutputCustomType.Parameter("computerName") @Nullable String computerName,
        @OutputCustomType.Parameter("disks") @Nullable List<DiskInstanceViewResponse> disks,
        @OutputCustomType.Parameter("extensions") @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions,
        @OutputCustomType.Parameter("hyperVGeneration") @Nullable String hyperVGeneration,
        @OutputCustomType.Parameter("maintenanceRedeployStatus") @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus,
        @OutputCustomType.Parameter("osName") @Nullable String osName,
        @OutputCustomType.Parameter("osVersion") @Nullable String osVersion,
        @OutputCustomType.Parameter("patchStatus") @Nullable VirtualMachinePatchStatusResponse patchStatus,
        @OutputCustomType.Parameter("platformFaultDomain") @Nullable Integer platformFaultDomain,
        @OutputCustomType.Parameter("platformUpdateDomain") @Nullable Integer platformUpdateDomain,
        @OutputCustomType.Parameter("rdpThumbPrint") @Nullable String rdpThumbPrint,
        @OutputCustomType.Parameter("statuses") @Nullable List<InstanceViewStatusResponse> statuses,
        @OutputCustomType.Parameter("vmAgent") @Nullable VirtualMachineAgentInstanceViewResponse vmAgent,
        @OutputCustomType.Parameter("vmHealth") VirtualMachineHealthStatusResponse vmHealth) {
        this.assignedHost = assignedHost;
        this.bootDiagnostics = bootDiagnostics;
        this.computerName = computerName;
        this.disks = disks;
        this.extensions = extensions;
        this.hyperVGeneration = hyperVGeneration;
        this.maintenanceRedeployStatus = maintenanceRedeployStatus;
        this.osName = osName;
        this.osVersion = osVersion;
        this.patchStatus = patchStatus;
        this.platformFaultDomain = platformFaultDomain;
        this.platformUpdateDomain = platformUpdateDomain;
        this.rdpThumbPrint = rdpThumbPrint;
        this.statuses = statuses;
        this.vmAgent = vmAgent;
        this.vmHealth = vmHealth;
    }

    /**
     * Resource id of the dedicated host, on which the virtual machine is allocated through automatic placement, when the virtual machine is associated with a dedicated host group that has automatic placement enabled. <br><br>Minimum api-version: 2020-06-01.
     * 
    */
    public String getAssignedHost() {
        return this.assignedHost;
    }
    /**
     * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
     * 
    */
    public Optional<BootDiagnosticsInstanceViewResponse> getBootDiagnostics() {
        return Optional.ofNullable(this.bootDiagnostics);
    }
    /**
     * The computer name assigned to the virtual machine.
     * 
    */
    public Optional<String> getComputerName() {
        return Optional.ofNullable(this.computerName);
    }
    /**
     * The virtual machine disk information.
     * 
    */
    public List<DiskInstanceViewResponse> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * The extensions information.
     * 
    */
    public List<VirtualMachineExtensionInstanceViewResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }
    /**
     * Specifies the HyperVGeneration Type associated with a resource
     * 
    */
    public Optional<String> getHyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }
    /**
     * The Maintenance Operation status on the virtual machine.
     * 
    */
    public Optional<MaintenanceRedeployStatusResponse> getMaintenanceRedeployStatus() {
        return Optional.ofNullable(this.maintenanceRedeployStatus);
    }
    /**
     * The Operating System running on the virtual machine.
     * 
    */
    public Optional<String> getOsName() {
        return Optional.ofNullable(this.osName);
    }
    /**
     * The version of Operating System running on the virtual machine.
     * 
    */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * [Preview Feature] The status of virtual machine patch operations.
     * 
    */
    public Optional<VirtualMachinePatchStatusResponse> getPatchStatus() {
        return Optional.ofNullable(this.patchStatus);
    }
    /**
     * Specifies the fault domain of the virtual machine.
     * 
    */
    public Optional<Integer> getPlatformFaultDomain() {
        return Optional.ofNullable(this.platformFaultDomain);
    }
    /**
     * Specifies the update domain of the virtual machine.
     * 
    */
    public Optional<Integer> getPlatformUpdateDomain() {
        return Optional.ofNullable(this.platformUpdateDomain);
    }
    /**
     * The Remote desktop certificate thumbprint.
     * 
    */
    public Optional<String> getRdpThumbPrint() {
        return Optional.ofNullable(this.rdpThumbPrint);
    }
    /**
     * The resource status information.
     * 
    */
    public List<InstanceViewStatusResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }
    /**
     * The VM Agent running on the virtual machine.
     * 
    */
    public Optional<VirtualMachineAgentInstanceViewResponse> getVmAgent() {
        return Optional.ofNullable(this.vmAgent);
    }
    /**
     * The health status for the VM.
     * 
    */
    public VirtualMachineHealthStatusResponse getVmHealth() {
        return this.vmHealth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignedHost;
        private @Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics;
        private @Nullable String computerName;
        private @Nullable List<DiskInstanceViewResponse> disks;
        private @Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions;
        private @Nullable String hyperVGeneration;
        private @Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus;
        private @Nullable String osName;
        private @Nullable String osVersion;
        private @Nullable VirtualMachinePatchStatusResponse patchStatus;
        private @Nullable Integer platformFaultDomain;
        private @Nullable Integer platformUpdateDomain;
        private @Nullable String rdpThumbPrint;
        private @Nullable List<InstanceViewStatusResponse> statuses;
        private @Nullable VirtualMachineAgentInstanceViewResponse vmAgent;
        private VirtualMachineHealthStatusResponse vmHealth;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedHost = defaults.assignedHost;
    	      this.bootDiagnostics = defaults.bootDiagnostics;
    	      this.computerName = defaults.computerName;
    	      this.disks = defaults.disks;
    	      this.extensions = defaults.extensions;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.maintenanceRedeployStatus = defaults.maintenanceRedeployStatus;
    	      this.osName = defaults.osName;
    	      this.osVersion = defaults.osVersion;
    	      this.patchStatus = defaults.patchStatus;
    	      this.platformFaultDomain = defaults.platformFaultDomain;
    	      this.platformUpdateDomain = defaults.platformUpdateDomain;
    	      this.rdpThumbPrint = defaults.rdpThumbPrint;
    	      this.statuses = defaults.statuses;
    	      this.vmAgent = defaults.vmAgent;
    	      this.vmHealth = defaults.vmHealth;
        }

        public Builder setAssignedHost(String assignedHost) {
            this.assignedHost = Objects.requireNonNull(assignedHost);
            return this;
        }

        public Builder setBootDiagnostics(@Nullable BootDiagnosticsInstanceViewResponse bootDiagnostics) {
            this.bootDiagnostics = bootDiagnostics;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setDisks(@Nullable List<DiskInstanceViewResponse> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setExtensions(@Nullable List<VirtualMachineExtensionInstanceViewResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setHyperVGeneration(@Nullable String hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder setMaintenanceRedeployStatus(@Nullable MaintenanceRedeployStatusResponse maintenanceRedeployStatus) {
            this.maintenanceRedeployStatus = maintenanceRedeployStatus;
            return this;
        }

        public Builder setOsName(@Nullable String osName) {
            this.osName = osName;
            return this;
        }

        public Builder setOsVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder setPatchStatus(@Nullable VirtualMachinePatchStatusResponse patchStatus) {
            this.patchStatus = patchStatus;
            return this;
        }

        public Builder setPlatformFaultDomain(@Nullable Integer platformFaultDomain) {
            this.platformFaultDomain = platformFaultDomain;
            return this;
        }

        public Builder setPlatformUpdateDomain(@Nullable Integer platformUpdateDomain) {
            this.platformUpdateDomain = platformUpdateDomain;
            return this;
        }

        public Builder setRdpThumbPrint(@Nullable String rdpThumbPrint) {
            this.rdpThumbPrint = rdpThumbPrint;
            return this;
        }

        public Builder setStatuses(@Nullable List<InstanceViewStatusResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setVmAgent(@Nullable VirtualMachineAgentInstanceViewResponse vmAgent) {
            this.vmAgent = vmAgent;
            return this;
        }

        public Builder setVmHealth(VirtualMachineHealthStatusResponse vmHealth) {
            this.vmHealth = Objects.requireNonNull(vmHealth);
            return this;
        }
        public VirtualMachineInstanceViewResponse build() {
            return new VirtualMachineInstanceViewResponse(assignedHost, bootDiagnostics, computerName, disks, extensions, hyperVGeneration, maintenanceRedeployStatus, osName, osVersion, patchStatus, platformFaultDomain, platformUpdateDomain, rdpThumbPrint, statuses, vmAgent, vmHealth);
        }
    }
}
