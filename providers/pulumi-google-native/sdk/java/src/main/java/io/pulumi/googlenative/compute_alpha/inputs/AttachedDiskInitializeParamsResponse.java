// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class AttachedDiskInitializeParamsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttachedDiskInitializeParamsResponse Empty = new AttachedDiskInitializeParamsResponse();

    /**
     * The architecture of the attached disk. Valid values are arm64 or x86_64.
     * 
     */
    @InputImport(name="architecture", required=true)
    private final String architecture;

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * An optional description. Provide this property when creating the disk.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
     */
    @InputImport(name="diskName", required=true)
    private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
     */
    @InputImport(name="diskSizeGb", required=true)
    private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
     */
    @InputImport(name="diskType", required=true)
    private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options. Guest OS features are applied by merging initializeParams.guestOsFeatures and disks.guestOsFeatures
     * 
     */
    @InputImport(name="guestOsFeatures", required=true)
    private final List<GuestOsFeatureResponse> guestOsFeatures;

    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    @InputImport(name="licenseCodes", required=true)
    private final List<String> licenseCodes;

    public List<String> getLicenseCodes() {
        return this.licenseCodes;
    }

    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    @InputImport(name="licenses", required=true)
    private final List<String> licenses;

    public List<String> getLicenses() {
        return this.licenses;
    }

    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    @InputImport(name="multiWriter", required=true)
    private final Boolean multiWriter;

    public Boolean getMultiWriter() {
        return this.multiWriter;
    }

    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
     */
    @InputImport(name="onUpdateAction", required=true)
    private final String onUpdateAction;

    public String getOnUpdateAction() {
        return this.onUpdateAction;
    }

    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @InputImport(name="provisionedIops", required=true)
    private final String provisionedIops;

    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    @InputImport(name="replicaZones", required=true)
    private final List<String> replicaZones;

    public List<String> getReplicaZones() {
        return this.replicaZones;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
     */
    @InputImport(name="resourcePolicies", required=true)
    private final List<String> resourcePolicies;

    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }

    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceImage", required=true)
    private final String sourceImage;

    public String getSourceImage() {
        return this.sourceImage;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
     */
    @InputImport(name="sourceImageEncryptionKey", required=true)
    private final CustomerEncryptionKeyResponse sourceImageEncryptionKey;

    public CustomerEncryptionKeyResponse getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }

    /**
     * The source instant-snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceInstantSnapshot initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: us-central1-a/instantSnapshots/my-backup If the source instant-snapshot is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceInstantSnapshot", required=true)
    private final String sourceInstantSnapshot;

    public String getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot;
    }

    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
     */
    @InputImport(name="sourceSnapshot", required=true)
    private final String sourceSnapshot;

    public String getSourceSnapshot() {
        return this.sourceSnapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
     */
    @InputImport(name="sourceSnapshotEncryptionKey", required=true)
    private final CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;

    public CustomerEncryptionKeyResponse getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }

    public AttachedDiskInitializeParamsResponse(
        String architecture,
        String description,
        String diskName,
        String diskSizeGb,
        String diskType,
        List<GuestOsFeatureResponse> guestOsFeatures,
        Map<String,String> labels,
        List<String> licenseCodes,
        List<String> licenses,
        Boolean multiWriter,
        String onUpdateAction,
        String provisionedIops,
        List<String> replicaZones,
        List<String> resourcePolicies,
        String sourceImage,
        CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        String sourceInstantSnapshot,
        String sourceSnapshot,
        CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
        this.architecture = Objects.requireNonNull(architecture, "expected parameter 'architecture' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures, "expected parameter 'guestOsFeatures' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.licenseCodes = Objects.requireNonNull(licenseCodes, "expected parameter 'licenseCodes' to be non-null");
        this.licenses = Objects.requireNonNull(licenses, "expected parameter 'licenses' to be non-null");
        this.multiWriter = Objects.requireNonNull(multiWriter, "expected parameter 'multiWriter' to be non-null");
        this.onUpdateAction = Objects.requireNonNull(onUpdateAction, "expected parameter 'onUpdateAction' to be non-null");
        this.provisionedIops = Objects.requireNonNull(provisionedIops, "expected parameter 'provisionedIops' to be non-null");
        this.replicaZones = Objects.requireNonNull(replicaZones, "expected parameter 'replicaZones' to be non-null");
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies, "expected parameter 'resourcePolicies' to be non-null");
        this.sourceImage = Objects.requireNonNull(sourceImage, "expected parameter 'sourceImage' to be non-null");
        this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey, "expected parameter 'sourceImageEncryptionKey' to be non-null");
        this.sourceInstantSnapshot = Objects.requireNonNull(sourceInstantSnapshot, "expected parameter 'sourceInstantSnapshot' to be non-null");
        this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot, "expected parameter 'sourceSnapshot' to be non-null");
        this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey, "expected parameter 'sourceSnapshotEncryptionKey' to be non-null");
    }

    private AttachedDiskInitializeParamsResponse() {
        this.architecture = null;
        this.description = null;
        this.diskName = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.guestOsFeatures = List.of();
        this.labels = Map.of();
        this.licenseCodes = List.of();
        this.licenses = List.of();
        this.multiWriter = null;
        this.onUpdateAction = null;
        this.provisionedIops = null;
        this.replicaZones = List.of();
        this.resourcePolicies = List.of();
        this.sourceImage = null;
        this.sourceImageEncryptionKey = null;
        this.sourceInstantSnapshot = null;
        this.sourceSnapshot = null;
        this.sourceSnapshotEncryptionKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskInitializeParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String description;
        private String diskName;
        private String diskSizeGb;
        private String diskType;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Map<String,String> labels;
        private List<String> licenseCodes;
        private List<String> licenses;
        private Boolean multiWriter;
        private String onUpdateAction;
        private String provisionedIops;
        private List<String> replicaZones;
        private List<String> resourcePolicies;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceInstantSnapshot;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskInitializeParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.multiWriter = defaults.multiWriter;
    	      this.onUpdateAction = defaults.onUpdateAction;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.replicaZones = defaults.replicaZones;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setGuestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLicenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }

        public Builder setLicenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setMultiWriter(Boolean multiWriter) {
            this.multiWriter = Objects.requireNonNull(multiWriter);
            return this;
        }

        public Builder setOnUpdateAction(String onUpdateAction) {
            this.onUpdateAction = Objects.requireNonNull(onUpdateAction);
            return this;
        }

        public Builder setProvisionedIops(String provisionedIops) {
            this.provisionedIops = Objects.requireNonNull(provisionedIops);
            return this;
        }

        public Builder setReplicaZones(List<String> replicaZones) {
            this.replicaZones = Objects.requireNonNull(replicaZones);
            return this;
        }

        public Builder setResourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder setSourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }

        public Builder setSourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }

        public Builder setSourceInstantSnapshot(String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Objects.requireNonNull(sourceInstantSnapshot);
            return this;
        }

        public Builder setSourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }

        public AttachedDiskInitializeParamsResponse build() {
            return new AttachedDiskInitializeParamsResponse(architecture, description, diskName, diskSizeGb, diskType, guestOsFeatures, labels, licenseCodes, licenses, multiWriter, onUpdateAction, provisionedIops, replicaZones, resourcePolicies, sourceImage, sourceImageEncryptionKey, sourceInstantSnapshot, sourceSnapshot, sourceSnapshotEncryptionKey);
        }
    }
}
