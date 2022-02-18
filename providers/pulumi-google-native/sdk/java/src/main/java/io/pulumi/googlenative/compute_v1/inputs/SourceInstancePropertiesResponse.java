// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.MetadataResponse;
import io.pulumi.googlenative.compute_v1.inputs.NetworkInterfaceResponse;
import io.pulumi.googlenative.compute_v1.inputs.SavedAttachedDiskResponse;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingResponse;
import io.pulumi.googlenative.compute_v1.inputs.ServiceAccountResponse;
import io.pulumi.googlenative.compute_v1.inputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * DEPRECATED: Please use compute#instanceProperties instead. New properties will not be added to this field.
 * 
 */
public final class SourceInstancePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceInstancePropertiesResponse Empty = new SourceInstancePropertiesResponse();

    /**
     * Enables instances created based on this machine image to send packets with source IP addresses other than their own and receive packets with destination IP addresses other than their own. If these instances will be used as an IP gateway or it will be set as the next-hop in a Route resource, specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation for more information.
     * 
     */
    @InputImport(name="canIpForward", required=true)
    private final Boolean canIpForward;

    public Boolean getCanIpForward() {
        return this.canIpForward;
    }

    /**
     * Whether the instance created from this machine image should be protected against deletion.
     * 
     */
    @InputImport(name="deletionProtection", required=true)
    private final Boolean deletionProtection;

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * An optional text description for the instances that are created from this machine image.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * An array of disks that are associated with the instances that are created from this machine image.
     * 
     */
    @InputImport(name="disks", required=true)
    private final List<SavedAttachedDiskResponse> disks;

    public List<SavedAttachedDiskResponse> getDisks() {
        return this.disks;
    }

    /**
     * A list of guest accelerator cards' type and count to use for instances created from this machine image.
     * 
     */
    @InputImport(name="guestAccelerators", required=true)
    private final List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> getGuestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Labels to apply to instances that are created from this machine image.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * The machine type to use for instances that are created from this machine image.
     * 
     */
    @InputImport(name="machineType", required=true)
    private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * The metadata key/value pairs to assign to instances that are created from this machine image. These pairs can consist of custom metadata or predefined keys. See Project and instance metadata for more information.
     * 
     */
    @InputImport(name="metadata", required=true)
    private final MetadataResponse metadata;

    public MetadataResponse getMetadata() {
        return this.metadata;
    }

    /**
     * Minimum cpu/platform to be used by instances created from this machine image. The instance may be scheduled on the specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more information, read Specifying a Minimum CPU Platform.
     * 
     */
    @InputImport(name="minCpuPlatform", required=true)
    private final String minCpuPlatform;

    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }

    /**
     * An array of network access configurations for this interface.
     * 
     */
    @InputImport(name="networkInterfaces", required=true)
    private final List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * Specifies the scheduling options for the instances that are created from this machine image.
     * 
     */
    @InputImport(name="scheduling", required=true)
    private final SchedulingResponse scheduling;

    public SchedulingResponse getScheduling() {
        return this.scheduling;
    }

    /**
     * A list of service accounts with specified scopes. Access tokens for these service accounts are available to the instances that are created from this machine image. Use metadata queries to obtain the access tokens for these instances.
     * 
     */
    @InputImport(name="serviceAccounts", required=true)
    private final List<ServiceAccountResponse> serviceAccounts;

    public List<ServiceAccountResponse> getServiceAccounts() {
        return this.serviceAccounts;
    }

    /**
     * A list of tags to apply to the instances that are created from this machine image. The tags identify valid sources or targets for network firewalls. The setTags method can modify this list of tags. Each tag within the list must comply with RFC1035.
     * 
     */
    @InputImport(name="tags", required=true)
    private final TagsResponse tags;

    public TagsResponse getTags() {
        return this.tags;
    }

    public SourceInstancePropertiesResponse(
        Boolean canIpForward,
        Boolean deletionProtection,
        String description,
        List<SavedAttachedDiskResponse> disks,
        List<AcceleratorConfigResponse> guestAccelerators,
        Map<String,String> labels,
        String machineType,
        MetadataResponse metadata,
        String minCpuPlatform,
        List<NetworkInterfaceResponse> networkInterfaces,
        SchedulingResponse scheduling,
        List<ServiceAccountResponse> serviceAccounts,
        TagsResponse tags) {
        this.canIpForward = Objects.requireNonNull(canIpForward, "expected parameter 'canIpForward' to be non-null");
        this.deletionProtection = Objects.requireNonNull(deletionProtection, "expected parameter 'deletionProtection' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
        this.networkInterfaces = Objects.requireNonNull(networkInterfaces, "expected parameter 'networkInterfaces' to be non-null");
        this.scheduling = Objects.requireNonNull(scheduling, "expected parameter 'scheduling' to be non-null");
        this.serviceAccounts = Objects.requireNonNull(serviceAccounts, "expected parameter 'serviceAccounts' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private SourceInstancePropertiesResponse() {
        this.canIpForward = null;
        this.deletionProtection = null;
        this.description = null;
        this.disks = List.of();
        this.guestAccelerators = List.of();
        this.labels = Map.of();
        this.machineType = null;
        this.metadata = null;
        this.minCpuPlatform = null;
        this.networkInterfaces = List.of();
        this.scheduling = null;
        this.serviceAccounts = List.of();
        this.tags = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canIpForward;
        private Boolean deletionProtection;
        private String description;
        private List<SavedAttachedDiskResponse> disks;
        private List<AcceleratorConfigResponse> guestAccelerators;
        private Map<String,String> labels;
        private String machineType;
        private MetadataResponse metadata;
        private String minCpuPlatform;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private SchedulingResponse scheduling;
        private List<ServiceAccountResponse> serviceAccounts;
        private TagsResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canIpForward = defaults.canIpForward;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccounts = defaults.serviceAccounts;
    	      this.tags = defaults.tags;
        }

        public Builder setCanIpForward(Boolean canIpForward) {
            this.canIpForward = Objects.requireNonNull(canIpForward);
            return this;
        }

        public Builder setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = Objects.requireNonNull(deletionProtection);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisks(List<SavedAttachedDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setGuestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
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

        public Builder setMetadata(MetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder setNetworkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }

        public Builder setScheduling(SchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder setServiceAccounts(List<ServiceAccountResponse> serviceAccounts) {
            this.serviceAccounts = Objects.requireNonNull(serviceAccounts);
            return this;
        }

        public Builder setTags(TagsResponse tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public SourceInstancePropertiesResponse build() {
            return new SourceInstancePropertiesResponse(canIpForward, deletionProtection, description, disks, guestAccelerators, labels, machineType, metadata, minCpuPlatform, networkInterfaces, scheduling, serviceAccounts, tags);
        }
    }
}
