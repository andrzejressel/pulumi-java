// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_v1.inputs.GuestOsFeatureArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskArgs Empty = new RegionDiskArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: "diskEncryptionKey.kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don't need to provide a key to use the disk later.
     * 
     */
    @InputImport(name="diskEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @InputImport(name="guestOsFeatures")
    private final @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Input<List<GuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Input.empty() : this.guestOsFeatures;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    @InputImport(name="licenseCodes")
    private final @Nullable Input<List<String>> licenseCodes;

    public Input<List<String>> getLicenseCodes() {
        return this.licenseCodes == null ? Input.empty() : this.licenseCodes;
    }

    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    @InputImport(name="licenses")
    private final @Nullable Input<List<String>> licenses;

    public Input<List<String>> getLicenses() {
        return this.licenses == null ? Input.empty() : this.licenses;
    }

    /**
     * An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint")
    private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Internal use only.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<String> options;

    public Input<String> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller's project.
     * 
     */
    @InputImport(name="physicalBlockSizeBytes")
    private final @Nullable Input<String> physicalBlockSizeBytes;

    public Input<String> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Input.empty() : this.physicalBlockSizeBytes;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @InputImport(name="provisionedIops")
    private final @Nullable Input<String> provisionedIops;

    public Input<String> getProvisionedIops() {
        return this.provisionedIops == null ? Input.empty() : this.provisionedIops;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    @InputImport(name="replicaZones")
    private final @Nullable Input<List<String>> replicaZones;

    public Input<List<String>> getReplicaZones() {
        return this.replicaZones == null ? Input.empty() : this.replicaZones;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    @InputImport(name="resourcePolicies")
    private final @Nullable Input<List<String>> resourcePolicies;

    public Input<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    /**
     * Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    @InputImport(name="sizeGb")
    private final @Nullable Input<String> sizeGb;

    public Input<String> getSizeGb() {
        return this.sizeGb == null ? Input.empty() : this.sizeGb;
    }

    /**
     * The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    @InputImport(name="sourceDisk")
    private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    /**
     * The source image used to create this disk. If the source image is deleted, this field will not be set. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family
     * 
     */
    @InputImport(name="sourceImage")
    private final @Nullable Input<String> sourceImage;

    public Input<String> getSourceImage() {
        return this.sourceImage == null ? Input.empty() : this.sourceImage;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceImageEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Input.empty() : this.sourceImageEncryptionKey;
    }

    /**
     * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    @InputImport(name="sourceSnapshot")
    private final @Nullable Input<String> sourceSnapshot;

    public Input<String> getSourceSnapshot() {
        return this.sourceSnapshot == null ? Input.empty() : this.sourceSnapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceSnapshotEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Input.empty() : this.sourceSnapshotEncryptionKey;
    }

    /**
     * The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    @InputImport(name="sourceStorageObject")
    private final @Nullable Input<String> sourceStorageObject;

    public Input<String> getSourceStorageObject() {
        return this.sourceStorageObject == null ? Input.empty() : this.sourceStorageObject;
    }

    /**
     * URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RegionDiskArgs(
        @Nullable Input<String> description,
        @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> licenseCodes,
        @Nullable Input<List<String>> licenses,
        @Nullable Input<String> locationHint,
        @Nullable Input<String> name,
        @Nullable Input<String> options,
        @Nullable Input<String> physicalBlockSizeBytes,
        @Nullable Input<String> project,
        @Nullable Input<String> provisionedIops,
        Input<String> region,
        @Nullable Input<List<String>> replicaZones,
        @Nullable Input<String> requestId,
        @Nullable Input<List<String>> resourcePolicies,
        @Nullable Input<String> sizeGb,
        @Nullable Input<String> sourceDisk,
        @Nullable Input<String> sourceImage,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey,
        @Nullable Input<String> sourceSnapshot,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey,
        @Nullable Input<String> sourceStorageObject,
        @Nullable Input<String> type) {
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.guestOsFeatures = guestOsFeatures;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locationHint = locationHint;
        this.name = name;
        this.options = options;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.provisionedIops = provisionedIops;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.replicaZones = replicaZones;
        this.requestId = requestId;
        this.resourcePolicies = resourcePolicies;
        this.sizeGb = sizeGb;
        this.sourceDisk = sourceDisk;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceStorageObject = sourceStorageObject;
        this.type = type;
    }

    private RegionDiskArgs() {
        this.description = Input.empty();
        this.diskEncryptionKey = Input.empty();
        this.guestOsFeatures = Input.empty();
        this.labels = Input.empty();
        this.licenseCodes = Input.empty();
        this.licenses = Input.empty();
        this.locationHint = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.physicalBlockSizeBytes = Input.empty();
        this.project = Input.empty();
        this.provisionedIops = Input.empty();
        this.region = Input.empty();
        this.replicaZones = Input.empty();
        this.requestId = Input.empty();
        this.resourcePolicies = Input.empty();
        this.sizeGb = Input.empty();
        this.sourceDisk = Input.empty();
        this.sourceImage = Input.empty();
        this.sourceImageEncryptionKey = Input.empty();
        this.sourceSnapshot = Input.empty();
        this.sourceSnapshotEncryptionKey = Input.empty();
        this.sourceStorageObject = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> licenseCodes;
        private @Nullable Input<List<String>> licenses;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<String> name;
        private @Nullable Input<String> options;
        private @Nullable Input<String> physicalBlockSizeBytes;
        private @Nullable Input<String> project;
        private @Nullable Input<String> provisionedIops;
        private Input<String> region;
        private @Nullable Input<List<String>> replicaZones;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<String>> resourcePolicies;
        private @Nullable Input<String> sizeGb;
        private @Nullable Input<String> sourceDisk;
        private @Nullable Input<String> sourceImage;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;
        private @Nullable Input<String> sourceSnapshot;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;
        private @Nullable Input<String> sourceStorageObject;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locationHint = defaults.locationHint;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.requestId = defaults.requestId;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sizeGb = defaults.sizeGb;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceStorageObject = defaults.sourceStorageObject;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable CustomerEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable Input<List<GuestOsFeatureArgs>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }

        public Builder setGuestOsFeatures(@Nullable List<GuestOsFeatureArgs> guestOsFeatures) {
            this.guestOsFeatures = Input.ofNullable(guestOsFeatures);
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

        public Builder setLicenseCodes(@Nullable Input<List<String>> licenseCodes) {
            this.licenseCodes = licenseCodes;
            return this;
        }

        public Builder setLicenseCodes(@Nullable List<String> licenseCodes) {
            this.licenseCodes = Input.ofNullable(licenseCodes);
            return this;
        }

        public Builder setLicenses(@Nullable Input<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder setLicenses(@Nullable List<String> licenses) {
            this.licenses = Input.ofNullable(licenses);
            return this;
        }

        public Builder setLocationHint(@Nullable Input<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder setLocationHint(@Nullable String locationHint) {
            this.locationHint = Input.ofNullable(locationHint);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptions(@Nullable Input<String> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable String options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable Input<String> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable String physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Input.ofNullable(physicalBlockSizeBytes);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProvisionedIops(@Nullable Input<String> provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        public Builder setProvisionedIops(@Nullable String provisionedIops) {
            this.provisionedIops = Input.ofNullable(provisionedIops);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setReplicaZones(@Nullable Input<List<String>> replicaZones) {
            this.replicaZones = replicaZones;
            return this;
        }

        public Builder setReplicaZones(@Nullable List<String> replicaZones) {
            this.replicaZones = Input.ofNullable(replicaZones);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setResourcePolicies(@Nullable Input<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder setResourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder setSizeGb(@Nullable Input<String> sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }

        public Builder setSizeGb(@Nullable String sizeGb) {
            this.sizeGb = Input.ofNullable(sizeGb);
            return this;
        }

        public Builder setSourceDisk(@Nullable Input<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder setSourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Input.ofNullable(sourceDisk);
            return this;
        }

        public Builder setSourceImage(@Nullable Input<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder setSourceImage(@Nullable String sourceImage) {
            this.sourceImage = Input.ofNullable(sourceImage);
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }

        public Builder setSourceImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Input.ofNullable(sourceImageEncryptionKey);
            return this;
        }

        public Builder setSourceSnapshot(@Nullable Input<String> sourceSnapshot) {
            this.sourceSnapshot = sourceSnapshot;
            return this;
        }

        public Builder setSourceSnapshot(@Nullable String sourceSnapshot) {
            this.sourceSnapshot = Input.ofNullable(sourceSnapshot);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Input.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder setSourceStorageObject(@Nullable Input<String> sourceStorageObject) {
            this.sourceStorageObject = sourceStorageObject;
            return this;
        }

        public Builder setSourceStorageObject(@Nullable String sourceStorageObject) {
            this.sourceStorageObject = Input.ofNullable(sourceStorageObject);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public RegionDiskArgs build() {
            return new RegionDiskArgs(description, diskEncryptionKey, guestOsFeatures, labels, licenseCodes, licenses, locationHint, name, options, physicalBlockSizeBytes, project, provisionedIops, region, replicaZones, requestId, resourcePolicies, sizeGb, sourceDisk, sourceImage, sourceImageEncryptionKey, sourceSnapshot, sourceSnapshotEncryptionKey, sourceStorageObject, type);
        }
    }
}
