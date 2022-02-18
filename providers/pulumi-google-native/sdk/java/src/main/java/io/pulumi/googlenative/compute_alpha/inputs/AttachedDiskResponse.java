// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.AttachedDiskInitializeParamsResponse;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureResponse;
import io.pulumi.googlenative.compute_alpha.inputs.InitialStateConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An instance-attached disk resource.
 * 
 */
public final class AttachedDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final AttachedDiskResponse Empty = new AttachedDiskResponse();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @InputImport(name="autoDelete", required=true)
    private final Boolean autoDelete;

    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @InputImport(name="boot", required=true)
    private final Boolean boot;

    public Boolean getBoot() {
        return this.boot;
    }

    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    @InputImport(name="diskEncryptionKey", required=true)
    private final CustomerEncryptionKeyResponse diskEncryptionKey;

    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * The size of the disk in GB.
     * 
     */
    @InputImport(name="diskSizeGb", required=true)
    private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * [Input Only] Whether to force attach the regional disk even if it's currently attached to another instance. If you try to force attach a zonal disk to an instance, you will receive an error.
     * 
     */
    @InputImport(name="forceAttach", required=true)
    private final Boolean forceAttach;

    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @InputImport(name="guestOsFeatures", required=true)
    private final List<GuestOsFeatureResponse> guestOsFeatures;

    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }

    /**
     * A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    @InputImport(name="index", required=true)
    private final Integer index;

    public Integer getIndex() {
        return this.index;
    }

    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    @InputImport(name="initializeParams", required=true)
    private final AttachedDiskInitializeParamsResponse initializeParams;

    public AttachedDiskInitializeParamsResponse getInitializeParams() {
        return this.initializeParams;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @InputImport(name="interface", required=true)
    private final String $interface;

    public String get$interface() {
        return this.$interface;
    }

    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Any valid publicly visible licenses.
     * 
     */
    @InputImport(name="licenses", required=true)
    private final List<String> licenses;

    public List<String> getLicenses() {
        return this.licenses;
    }

    /**
     * Whether to indicate the attached disk is locked. The locked disk is not allowed to be detached from the instance, or to be used as the source of the snapshot creation, and the image creation. The instance with at least one locked attached disk is not allow to be used as source of machine image creation, instant snapshot creation, and not allowed to be deleted with --keep-disk parameter set to true for locked disks.
     * 
     */
    @InputImport(name="locked", required=true)
    private final Boolean locked;

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    @InputImport(name="mode", required=true)
    private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * For LocalSSD disks on VM Instances in STOPPED or SUSPENDED state, this field is set to PRESERVED if the LocalSSD data has been saved to a persistent location by customer request. (see the discard_local_ssd option on Stop/Suspend). Read-only in the api.
     * 
     */
    @InputImport(name="savedState", required=true)
    private final String savedState;

    public String getSavedState() {
        return this.savedState;
    }

    /**
     * shielded vm initial state stored on disk
     * 
     */
    @InputImport(name="shieldedInstanceInitialState", required=true)
    private final InitialStateConfigResponse shieldedInstanceInitialState;

    public InitialStateConfigResponse getShieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    @InputImport(name="source", required=true)
    private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * A list of user provided licenses. It represents a list of URLs to the license resource. Unlike regular licenses, user provided licenses can be modified after the disk is created.
     * 
     */
    @InputImport(name="userLicenses", required=true)
    private final List<String> userLicenses;

    public List<String> getUserLicenses() {
        return this.userLicenses;
    }

    public AttachedDiskResponse(
        Boolean autoDelete,
        Boolean boot,
        String deviceName,
        CustomerEncryptionKeyResponse diskEncryptionKey,
        String diskSizeGb,
        Boolean forceAttach,
        List<GuestOsFeatureResponse> guestOsFeatures,
        Integer index,
        AttachedDiskInitializeParamsResponse initializeParams,
        String $interface,
        String kind,
        List<String> licenses,
        Boolean locked,
        String mode,
        String savedState,
        InitialStateConfigResponse shieldedInstanceInitialState,
        String source,
        String type,
        List<String> userLicenses) {
        this.autoDelete = Objects.requireNonNull(autoDelete, "expected parameter 'autoDelete' to be non-null");
        this.boot = Objects.requireNonNull(boot, "expected parameter 'boot' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey, "expected parameter 'diskEncryptionKey' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.forceAttach = Objects.requireNonNull(forceAttach, "expected parameter 'forceAttach' to be non-null");
        this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures, "expected parameter 'guestOsFeatures' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.initializeParams = Objects.requireNonNull(initializeParams, "expected parameter 'initializeParams' to be non-null");
        this.$interface = Objects.requireNonNull($interface, "expected parameter '$interface' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.licenses = Objects.requireNonNull(licenses, "expected parameter 'licenses' to be non-null");
        this.locked = Objects.requireNonNull(locked, "expected parameter 'locked' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.savedState = Objects.requireNonNull(savedState, "expected parameter 'savedState' to be non-null");
        this.shieldedInstanceInitialState = Objects.requireNonNull(shieldedInstanceInitialState, "expected parameter 'shieldedInstanceInitialState' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userLicenses = Objects.requireNonNull(userLicenses, "expected parameter 'userLicenses' to be non-null");
    }

    private AttachedDiskResponse() {
        this.autoDelete = null;
        this.boot = null;
        this.deviceName = null;
        this.diskEncryptionKey = null;
        this.diskSizeGb = null;
        this.forceAttach = null;
        this.guestOsFeatures = List.of();
        this.index = null;
        this.initializeParams = null;
        this.$interface = null;
        this.kind = null;
        this.licenses = List.of();
        this.locked = null;
        this.mode = null;
        this.savedState = null;
        this.shieldedInstanceInitialState = null;
        this.source = null;
        this.type = null;
        this.userLicenses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private Boolean forceAttach;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private AttachedDiskInitializeParamsResponse initializeParams;
        private String $interface;
        private String kind;
        private List<String> licenses;
        private Boolean locked;
        private String mode;
        private String savedState;
        private InitialStateConfigResponse shieldedInstanceInitialState;
        private String source;
        private String type;
        private List<String> userLicenses;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.forceAttach = defaults.forceAttach;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.locked = defaults.locked;
    	      this.mode = defaults.mode;
    	      this.savedState = defaults.savedState;
    	      this.shieldedInstanceInitialState = defaults.shieldedInstanceInitialState;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
    	      this.userLicenses = defaults.userLicenses;
        }

        public Builder setAutoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }

        public Builder setBoot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDiskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setForceAttach(Boolean forceAttach) {
            this.forceAttach = Objects.requireNonNull(forceAttach);
            return this;
        }

        public Builder setGuestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setInitializeParams(AttachedDiskInitializeParamsResponse initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
            return this;
        }

        public Builder set$interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setLocked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setSavedState(String savedState) {
            this.savedState = Objects.requireNonNull(savedState);
            return this;
        }

        public Builder setShieldedInstanceInitialState(InitialStateConfigResponse shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = Objects.requireNonNull(shieldedInstanceInitialState);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserLicenses(List<String> userLicenses) {
            this.userLicenses = Objects.requireNonNull(userLicenses);
            return this;
        }

        public AttachedDiskResponse build() {
            return new AttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, forceAttach, guestOsFeatures, index, initializeParams, $interface, kind, licenses, locked, mode, savedState, shieldedInstanceInitialState, source, type, userLicenses);
        }
    }
}
