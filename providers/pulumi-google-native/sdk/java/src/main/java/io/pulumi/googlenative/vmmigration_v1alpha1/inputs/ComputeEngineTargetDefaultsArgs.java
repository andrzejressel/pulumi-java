// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.ComputeEngineTargetDefaultsDiskType;
import io.pulumi.googlenative.vmmigration_v1alpha1.enums.ComputeEngineTargetDefaultsLicenseType;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.ComputeSchedulingArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.NetworkInterfaceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ComputeEngineTargetDefaults is a collection of details for creating a VM in a target Compute Engine project.
 * 
 */
public final class ComputeEngineTargetDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEngineTargetDefaultsArgs Empty = new ComputeEngineTargetDefaultsArgs();

    /**
     * Additional licenses to assign to the VM.
     * 
     */
    @InputImport(name="additionalLicenses")
    private final @Nullable Input<List<String>> additionalLicenses;

    public Input<List<String>> getAdditionalLicenses() {
        return this.additionalLicenses == null ? Input.empty() : this.additionalLicenses;
    }

    /**
     * Compute instance scheduling information (if empty default is used).
     * 
     */
    @InputImport(name="computeScheduling")
    private final @Nullable Input<ComputeSchedulingArgs> computeScheduling;

    public Input<ComputeSchedulingArgs> getComputeScheduling() {
        return this.computeScheduling == null ? Input.empty() : this.computeScheduling;
    }

    /**
     * The disk type to use in the VM.
     * 
     */
    @InputImport(name="diskType")
    private final @Nullable Input<ComputeEngineTargetDefaultsDiskType> diskType;

    public Input<ComputeEngineTargetDefaultsDiskType> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * A map of labels to associate with the VM.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The license type to use in OS adaptation.
     * 
     */
    @InputImport(name="licenseType")
    private final @Nullable Input<ComputeEngineTargetDefaultsLicenseType> licenseType;

    public Input<ComputeEngineTargetDefaultsLicenseType> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    /**
     * The machine type to create the VM with.
     * 
     */
    @InputImport(name="machineType")
    private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * The machine type series to create the VM with.
     * 
     */
    @InputImport(name="machineTypeSeries")
    private final @Nullable Input<String> machineTypeSeries;

    public Input<String> getMachineTypeSeries() {
        return this.machineTypeSeries == null ? Input.empty() : this.machineTypeSeries;
    }

    /**
     * The metadata key/value pairs to assign to the VM.
     * 
     */
    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * List of NICs connected to this VM.
     * 
     */
    @InputImport(name="networkInterfaces")
    private final @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;

    public Input<List<NetworkInterfaceArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * A map of network tags to associate with the VM.
     * 
     */
    @InputImport(name="networkTags")
    private final @Nullable Input<List<String>> networkTags;

    public Input<List<String>> getNetworkTags() {
        return this.networkTags == null ? Input.empty() : this.networkTags;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    @InputImport(name="secureBoot")
    private final @Nullable Input<Boolean> secureBoot;

    public Input<Boolean> getSecureBoot() {
        return this.secureBoot == null ? Input.empty() : this.secureBoot;
    }

    /**
     * The service account to associate the VM with.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    @InputImport(name="targetProject")
    private final @Nullable Input<String> targetProject;

    public Input<String> getTargetProject() {
        return this.targetProject == null ? Input.empty() : this.targetProject;
    }

    /**
     * The name of the VM to create.
     * 
     */
    @InputImport(name="vmName")
    private final @Nullable Input<String> vmName;

    public Input<String> getVmName() {
        return this.vmName == null ? Input.empty() : this.vmName;
    }

    /**
     * The zone in which to create the VM.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public ComputeEngineTargetDefaultsArgs(
        @Nullable Input<List<String>> additionalLicenses,
        @Nullable Input<ComputeSchedulingArgs> computeScheduling,
        @Nullable Input<ComputeEngineTargetDefaultsDiskType> diskType,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<ComputeEngineTargetDefaultsLicenseType> licenseType,
        @Nullable Input<String> machineType,
        @Nullable Input<String> machineTypeSeries,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces,
        @Nullable Input<List<String>> networkTags,
        @Nullable Input<Boolean> secureBoot,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<String> targetProject,
        @Nullable Input<String> vmName,
        @Nullable Input<String> zone) {
        this.additionalLicenses = additionalLicenses;
        this.computeScheduling = computeScheduling;
        this.diskType = diskType;
        this.labels = labels;
        this.licenseType = licenseType;
        this.machineType = machineType;
        this.machineTypeSeries = machineTypeSeries;
        this.metadata = metadata;
        this.networkInterfaces = networkInterfaces;
        this.networkTags = networkTags;
        this.secureBoot = secureBoot;
        this.serviceAccount = serviceAccount;
        this.targetProject = targetProject;
        this.vmName = vmName;
        this.zone = zone;
    }

    private ComputeEngineTargetDefaultsArgs() {
        this.additionalLicenses = Input.empty();
        this.computeScheduling = Input.empty();
        this.diskType = Input.empty();
        this.labels = Input.empty();
        this.licenseType = Input.empty();
        this.machineType = Input.empty();
        this.machineTypeSeries = Input.empty();
        this.metadata = Input.empty();
        this.networkInterfaces = Input.empty();
        this.networkTags = Input.empty();
        this.secureBoot = Input.empty();
        this.serviceAccount = Input.empty();
        this.targetProject = Input.empty();
        this.vmName = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEngineTargetDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> additionalLicenses;
        private @Nullable Input<ComputeSchedulingArgs> computeScheduling;
        private @Nullable Input<ComputeEngineTargetDefaultsDiskType> diskType;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<ComputeEngineTargetDefaultsLicenseType> licenseType;
        private @Nullable Input<String> machineType;
        private @Nullable Input<String> machineTypeSeries;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Input<List<String>> networkTags;
        private @Nullable Input<Boolean> secureBoot;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<String> targetProject;
        private @Nullable Input<String> vmName;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEngineTargetDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLicenses = defaults.additionalLicenses;
    	      this.computeScheduling = defaults.computeScheduling;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.licenseType = defaults.licenseType;
    	      this.machineType = defaults.machineType;
    	      this.machineTypeSeries = defaults.machineTypeSeries;
    	      this.metadata = defaults.metadata;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkTags = defaults.networkTags;
    	      this.secureBoot = defaults.secureBoot;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.targetProject = defaults.targetProject;
    	      this.vmName = defaults.vmName;
    	      this.zone = defaults.zone;
        }

        public Builder setAdditionalLicenses(@Nullable Input<List<String>> additionalLicenses) {
            this.additionalLicenses = additionalLicenses;
            return this;
        }

        public Builder setAdditionalLicenses(@Nullable List<String> additionalLicenses) {
            this.additionalLicenses = Input.ofNullable(additionalLicenses);
            return this;
        }

        public Builder setComputeScheduling(@Nullable Input<ComputeSchedulingArgs> computeScheduling) {
            this.computeScheduling = computeScheduling;
            return this;
        }

        public Builder setComputeScheduling(@Nullable ComputeSchedulingArgs computeScheduling) {
            this.computeScheduling = Input.ofNullable(computeScheduling);
            return this;
        }

        public Builder setDiskType(@Nullable Input<ComputeEngineTargetDefaultsDiskType> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable ComputeEngineTargetDefaultsDiskType diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<ComputeEngineTargetDefaultsLicenseType> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable ComputeEngineTargetDefaultsLicenseType licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
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

        public Builder setMachineTypeSeries(@Nullable Input<String> machineTypeSeries) {
            this.machineTypeSeries = machineTypeSeries;
            return this;
        }

        public Builder setMachineTypeSeries(@Nullable String machineTypeSeries) {
            this.machineTypeSeries = Input.ofNullable(machineTypeSeries);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable Input<List<NetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<NetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder setNetworkTags(@Nullable Input<List<String>> networkTags) {
            this.networkTags = networkTags;
            return this;
        }

        public Builder setNetworkTags(@Nullable List<String> networkTags) {
            this.networkTags = Input.ofNullable(networkTags);
            return this;
        }

        public Builder setSecureBoot(@Nullable Input<Boolean> secureBoot) {
            this.secureBoot = secureBoot;
            return this;
        }

        public Builder setSecureBoot(@Nullable Boolean secureBoot) {
            this.secureBoot = Input.ofNullable(secureBoot);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setTargetProject(@Nullable Input<String> targetProject) {
            this.targetProject = targetProject;
            return this;
        }

        public Builder setTargetProject(@Nullable String targetProject) {
            this.targetProject = Input.ofNullable(targetProject);
            return this;
        }

        public Builder setVmName(@Nullable Input<String> vmName) {
            this.vmName = vmName;
            return this;
        }

        public Builder setVmName(@Nullable String vmName) {
            this.vmName = Input.ofNullable(vmName);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public ComputeEngineTargetDefaultsArgs build() {
            return new ComputeEngineTargetDefaultsArgs(additionalLicenses, computeScheduling, diskType, labels, licenseType, machineType, machineTypeSeries, metadata, networkInterfaces, networkTags, secureBoot, serviceAccount, targetProject, vmName, zone);
        }
    }
}
