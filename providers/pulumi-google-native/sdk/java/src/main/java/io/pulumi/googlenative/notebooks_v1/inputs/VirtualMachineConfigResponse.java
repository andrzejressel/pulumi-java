// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.inputs.ContainerImageResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.EncryptionConfigResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.LocalDiskResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.RuntimeAcceleratorConfigResponse;
import io.pulumi.googlenative.notebooks_v1.inputs.RuntimeShieldedInstanceConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * The config settings for virtual machine.
 * 
 */
public final class VirtualMachineConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineConfigResponse Empty = new VirtualMachineConfigResponse();

    /**
     * Optional. The Compute Engine accelerator configuration for this runtime.
     * 
     */
    @InputImport(name="acceleratorConfig", required=true)
    private final RuntimeAcceleratorConfigResponse acceleratorConfig;

    public RuntimeAcceleratorConfigResponse getAcceleratorConfig() {
        return this.acceleratorConfig;
    }

    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    @InputImport(name="containerImages", required=true)
    private final List<ContainerImageResponse> containerImages;

    public List<ContainerImageResponse> getContainerImages() {
        return this.containerImages;
    }

    /**
     * Data disk option configuration settings.
     * 
     */
    @InputImport(name="dataDisk", required=true)
    private final LocalDiskResponse dataDisk;

    public LocalDiskResponse getDataDisk() {
        return this.dataDisk;
    }

    /**
     * Optional. Encryption settings for virtual machine data disk.
     * 
     */
    @InputImport(name="encryptionConfig", required=true)
    private final EncryptionConfigResponse encryptionConfig;

    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * The Compute Engine guest attributes. (see [Project and instance guest attributes](https://cloud.google.com/compute/docs/storing-retrieving-metadata#guest_attributes)).
     * 
     */
    @InputImport(name="guestAttributes", required=true)
    private final Map<String,String> guestAttributes;

    public Map<String,String> getGuestAttributes() {
        return this.guestAttributes;
    }

    /**
     * Optional. If true, runtime will only have internal IP addresses. By default, runtimes are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each vm. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @InputImport(name="internalIpOnly", required=true)
    private final Boolean internalIpOnly;

    public Boolean getInternalIpOnly() {
        return this.internalIpOnly;
    }

    /**
     * Optional. The labels to associate with this runtime. Label **keys** must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be empty, but, if present, must contain 1 to 63 characters, and must conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The Compute Engine machine type used for runtimes. Short name is valid. Examples: * `n1-standard-2` * `e2-standard-8`
     * 
     */
    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * Optional. The Compute Engine metadata entries to add to virtual machine. (see [Project and instance metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @InputImport(name="metadata", required=true)
    private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork. If neither `network` nor `subnet` is specified, the "default" network of the project is used, if it exists. A full URL or partial URI. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default` * `projects/[project_id]/regions/global/default` Runtimes are managed resources inside Google Infrastructure. Runtimes support the following network configurations: * Google Managed Network (Network & subnet are empty) * Consumer Project VPC (network & subnet are required). Requires configuring Private Service Access. * Shared VPC (network & subnet are required). Requires configuring Private Service Access.
     * 
     */
    @InputImport(name="network", required=true)
    private final String network;

    public String getNetwork() {
        return this.network;
    }

    /**
     * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
     * 
     */
    @InputImport(name="nicType", required=true)
    private final String nicType;

    public String getNicType() {
        return this.nicType;
    }

    /**
     * Optional. Shielded VM Instance configuration settings.
     * 
     */
    @InputImport(name="shieldedInstanceConfig", required=true)
    private final RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig;

    public RuntimeShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network. A full URL or partial URI are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0` * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    @InputImport(name="subnet", required=true)
    private final String subnet;

    public String getSubnet() {
        return this.subnet;
    }

    /**
     * Optional. The Compute Engine tags to add to runtime (see [Tagging instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @InputImport(name="tags", required=true)
    private final List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    /**
     * The zone where the virtual machine is located. If using regional request, the notebooks service will pick a location in the corresponding runtime region. On a get request, zone will always be present. Example: * `us-central1-b`
     * 
     */
    @InputImport(name="zone", required=true)
    private final String zone;

    public String getZone() {
        return this.zone;
    }

    public VirtualMachineConfigResponse(
        RuntimeAcceleratorConfigResponse acceleratorConfig,
        List<ContainerImageResponse> containerImages,
        LocalDiskResponse dataDisk,
        EncryptionConfigResponse encryptionConfig,
        Map<String,String> guestAttributes,
        Boolean internalIpOnly,
        Map<String,String> labels,
        String machineType,
        Map<String,String> metadata,
        String network,
        String nicType,
        RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig,
        String subnet,
        List<String> tags,
        String zone) {
        this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig, "expected parameter 'acceleratorConfig' to be non-null");
        this.containerImages = Objects.requireNonNull(containerImages, "expected parameter 'containerImages' to be non-null");
        this.dataDisk = Objects.requireNonNull(dataDisk, "expected parameter 'dataDisk' to be non-null");
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
        this.guestAttributes = Objects.requireNonNull(guestAttributes, "expected parameter 'guestAttributes' to be non-null");
        this.internalIpOnly = Objects.requireNonNull(internalIpOnly, "expected parameter 'internalIpOnly' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.nicType = Objects.requireNonNull(nicType, "expected parameter 'nicType' to be non-null");
        this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig, "expected parameter 'shieldedInstanceConfig' to be non-null");
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private VirtualMachineConfigResponse() {
        this.acceleratorConfig = null;
        this.containerImages = List.of();
        this.dataDisk = null;
        this.encryptionConfig = null;
        this.guestAttributes = Map.of();
        this.internalIpOnly = null;
        this.labels = Map.of();
        this.machineType = null;
        this.metadata = Map.of();
        this.network = null;
        this.nicType = null;
        this.shieldedInstanceConfig = null;
        this.subnet = null;
        this.tags = List.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeAcceleratorConfigResponse acceleratorConfig;
        private List<ContainerImageResponse> containerImages;
        private LocalDiskResponse dataDisk;
        private EncryptionConfigResponse encryptionConfig;
        private Map<String,String> guestAttributes;
        private Boolean internalIpOnly;
        private Map<String,String> labels;
        private String machineType;
        private Map<String,String> metadata;
        private String network;
        private String nicType;
        private RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig;
        private String subnet;
        private List<String> tags;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImages = defaults.containerImages;
    	      this.dataDisk = defaults.dataDisk;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.guestAttributes = defaults.guestAttributes;
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setAcceleratorConfig(RuntimeAcceleratorConfigResponse acceleratorConfig) {
            this.acceleratorConfig = Objects.requireNonNull(acceleratorConfig);
            return this;
        }

        public Builder setContainerImages(List<ContainerImageResponse> containerImages) {
            this.containerImages = Objects.requireNonNull(containerImages);
            return this;
        }

        public Builder setDataDisk(LocalDiskResponse dataDisk) {
            this.dataDisk = Objects.requireNonNull(dataDisk);
            return this;
        }

        public Builder setEncryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder setGuestAttributes(Map<String,String> guestAttributes) {
            this.guestAttributes = Objects.requireNonNull(guestAttributes);
            return this;
        }

        public Builder setInternalIpOnly(Boolean internalIpOnly) {
            this.internalIpOnly = Objects.requireNonNull(internalIpOnly);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder setShieldedInstanceConfig(RuntimeShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder setSubnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public VirtualMachineConfigResponse build() {
            return new VirtualMachineConfigResponse(acceleratorConfig, containerImages, dataDisk, encryptionConfig, guestAttributes, internalIpOnly, labels, machineType, metadata, network, nicType, shieldedInstanceConfig, subnet, tags, zone);
        }
    }
}
