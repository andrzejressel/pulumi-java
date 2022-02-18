// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.AppliedLicenseResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.ComputeSchedulingResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.inputs.NetworkInterfaceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * ComputeEngineTargetDefaults is a collection of details for creating a VM in a target Compute Engine project.
 * 
 */
public final class ComputeEngineTargetDefaultsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeEngineTargetDefaultsResponse Empty = new ComputeEngineTargetDefaultsResponse();

    /**
     * Additional licenses to assign to the VM.
     * 
     */
    @InputImport(name="additionalLicenses", required=true)
    private final List<String> additionalLicenses;

    public List<String> getAdditionalLicenses() {
        return this.additionalLicenses;
    }

    /**
     * The OS license returned from the adaptation module report.
     * 
     */
    @InputImport(name="appliedLicense", required=true)
    private final AppliedLicenseResponse appliedLicense;

    public AppliedLicenseResponse getAppliedLicense() {
        return this.appliedLicense;
    }

    /**
     * The VM Boot Option, as set in the source vm.
     * 
     */
    @InputImport(name="bootOption", required=true)
    private final String bootOption;

    public String getBootOption() {
        return this.bootOption;
    }

    /**
     * Compute instance scheduling information (if empty default is used).
     * 
     */
    @InputImport(name="computeScheduling", required=true)
    private final ComputeSchedulingResponse computeScheduling;

    public ComputeSchedulingResponse getComputeScheduling() {
        return this.computeScheduling;
    }

    /**
     * The disk type to use in the VM.
     * 
     */
    @InputImport(name="diskType", required=true)
    private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * A map of labels to associate with the VM.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The license type to use in OS adaptation.
     * 
     */
    @InputImport(name="licenseType", required=true)
    private final String licenseType;

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * The machine type to create the VM with.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * The machine type series to create the VM with.
     * 
     */
    @InputImport(name="machineTypeSeries", required=true)
    private final String machineTypeSeries;

    public String getMachineTypeSeries() {
        return this.machineTypeSeries;
    }

    /**
     * The metadata key/value pairs to assign to the VM.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * List of NICs connected to this VM.
     * 
     */
    @InputImport(name="networkInterfaces", required=true)
    private final List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * A map of network tags to associate with the VM.
     * 
     */
    @InputImport(name="networkTags", required=true)
    private final List<String> networkTags;

    public List<String> getNetworkTags() {
        return this.networkTags;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    @InputImport(name="secureBoot", required=true)
    private final Boolean secureBoot;

    public Boolean getSecureBoot() {
        return this.secureBoot;
    }

    /**
     * The service account to associate the VM with.
     * 
     */
    @InputImport(name="serviceAccount", required=true)
    private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * The full path of the resource of type TargetProject which represents the Compute Engine project in which to create this VM.
     * 
     */
    @InputImport(name="targetProject", required=true)
    private final String targetProject;

    public String getTargetProject() {
        return this.targetProject;
    }

    /**
     * The name of the VM to create.
     * 
     */
    @InputImport(name="vmName", required=true)
    private final String vmName;

    public String getVmName() {
        return this.vmName;
    }

    /**
     * The zone in which to create the VM.
     * 
     */
    @InputImport(name="zone", required=true)
    private final String zone;

    public String getZone() {
        return this.zone;
    }

    public ComputeEngineTargetDefaultsResponse(
        List<String> additionalLicenses,
        AppliedLicenseResponse appliedLicense,
        String bootOption,
        ComputeSchedulingResponse computeScheduling,
        String diskType,
        Map<String,String> labels,
        String licenseType,
        String machineType,
        String machineTypeSeries,
        Map<String,String> metadata,
        List<NetworkInterfaceResponse> networkInterfaces,
        List<String> networkTags,
        Boolean secureBoot,
        String serviceAccount,
        String targetProject,
        String vmName,
        String zone) {
        this.additionalLicenses = Objects.requireNonNull(additionalLicenses, "expected parameter 'additionalLicenses' to be non-null");
        this.appliedLicense = Objects.requireNonNull(appliedLicense, "expected parameter 'appliedLicense' to be non-null");
        this.bootOption = Objects.requireNonNull(bootOption, "expected parameter 'bootOption' to be non-null");
        this.computeScheduling = Objects.requireNonNull(computeScheduling, "expected parameter 'computeScheduling' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries, "expected parameter 'machineTypeSeries' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
        this.networkTags = Objects.requireNonNull(networkTags, "expected parameter 'networkTags' to be non-null");
        this.secureBoot = Objects.requireNonNull(secureBoot, "expected parameter 'secureBoot' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.targetProject = Objects.requireNonNull(targetProject, "expected parameter 'targetProject' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private ComputeEngineTargetDefaultsResponse() {
        this.additionalLicenses = List.of();
        this.appliedLicense = null;
        this.bootOption = null;
        this.computeScheduling = null;
        this.diskType = null;
        this.labels = Map.of();
        this.licenseType = null;
        this.machineType = null;
        this.machineTypeSeries = null;
        this.metadata = Map.of();
        this.networkInterfaces = List.of();
        this.networkTags = List.of();
        this.secureBoot = null;
        this.serviceAccount = null;
        this.targetProject = null;
        this.vmName = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEngineTargetDefaultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalLicenses;
        private AppliedLicenseResponse appliedLicense;
        private String bootOption;
        private ComputeSchedulingResponse computeScheduling;
        private String diskType;
        private Map<String,String> labels;
        private String licenseType;
        private String machineType;
        private String machineTypeSeries;
        private Map<String,String> metadata;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private List<String> networkTags;
        private Boolean secureBoot;
        private String serviceAccount;
        private String targetProject;
        private String vmName;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEngineTargetDefaultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLicenses = defaults.additionalLicenses;
    	      this.appliedLicense = defaults.appliedLicense;
    	      this.bootOption = defaults.bootOption;
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

        public Builder setAdditionalLicenses(List<String> additionalLicenses) {
            this.additionalLicenses = Objects.requireNonNull(additionalLicenses);
            return this;
        }

        public Builder setAppliedLicense(AppliedLicenseResponse appliedLicense) {
            this.appliedLicense = Objects.requireNonNull(appliedLicense);
            return this;
        }

        public Builder setBootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }

        public Builder setComputeScheduling(ComputeSchedulingResponse computeScheduling) {
            this.computeScheduling = Objects.requireNonNull(computeScheduling);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLicenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMachineTypeSeries(String machineTypeSeries) {
            this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setNetworkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setNetworkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }

        public Builder setSecureBoot(Boolean secureBoot) {
            this.secureBoot = Objects.requireNonNull(secureBoot);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setTargetProject(String targetProject) {
            this.targetProject = Objects.requireNonNull(targetProject);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public ComputeEngineTargetDefaultsResponse build() {
            return new ComputeEngineTargetDefaultsResponse(additionalLicenses, appliedLicense, bootOption, computeScheduling, diskType, labels, licenseType, machineType, machineTypeSeries, metadata, networkInterfaces, networkTags, secureBoot, serviceAccount, targetProject, vmName, zone);
        }
    }
}
