// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SnapshotSnapshotType;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * Creates the new snapshot in the snapshot chain labeled with the specified name. The chain name must be 1-63 characters long and comply with RFC1035. This is an uncommon option only for advanced service owners who needs to create separate snapshot chains, for example, for chargeback tracking. When you describe your snapshot resource, this field is visible only if it has a non-empty value.
     * 
     */
    @InputImport(name="chainName")
    private final @Nullable Input<String> chainName;

    public Input<String> getChainName() {
        return this.chainName == null ? Input.empty() : this.chainName;
    }

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
     * [Input Only] Whether to attempt an application consistent snapshot by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @InputImport(name="guestFlush")
    private final @Nullable Input<Boolean> guestFlush;

    public Input<Boolean> getGuestFlush() {
        return this.guestFlush == null ? Input.empty() : this.guestFlush;
    }

    /**
     * Labels to apply to this snapshot. These can be later modified by the setLabels method. Label values may be empty.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * An opaque location hint used to place the snapshot close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint")
    private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Encrypts the snapshot using a customer-supplied encryption key. After you encrypt a snapshot using a customer-supplied key, you must provide the same key if you use the snapshot later. For example, you must provide the encryption key when you create a disk from the encrypted snapshot in a future request. Customer-supplied encryption keys do not protect access to metadata of the snapshot. If you do not provide an encryption key when creating the snapshot, then the snapshot will be encrypted using an automatically generated key and you do not need to provide a key to use the snapshot later.
     * 
     */
    @InputImport(name="snapshotEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> snapshotEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSnapshotEncryptionKey() {
        return this.snapshotEncryptionKey == null ? Input.empty() : this.snapshotEncryptionKey;
    }

    /**
     * Indicates the type of the snapshot.
     * 
     */
    @InputImport(name="snapshotType")
    private final @Nullable Input<SnapshotSnapshotType> snapshotType;

    public Input<SnapshotSnapshotType> getSnapshotType() {
        return this.snapshotType == null ? Input.empty() : this.snapshotType;
    }

    /**
     * The source disk used to create this snapshot.
     * 
     */
    @InputImport(name="sourceDisk")
    private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @InputImport(name="sourceDiskEncryptionKey")
    private final @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;

    public Input<CustomerEncryptionKeyArgs> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey == null ? Input.empty() : this.sourceDiskEncryptionKey;
    }

    /**
     * The source instant snapshot used to create this snapshot. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instantSnapshots/instantSnapshot - projects/project/zones/zone/instantSnapshots/instantSnapshot - zones/zone/instantSnapshots/instantSnapshot
     * 
     */
    @InputImport(name="sourceInstantSnapshot")
    private final @Nullable Input<String> sourceInstantSnapshot;

    public Input<String> getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot == null ? Input.empty() : this.sourceInstantSnapshot;
    }

    /**
     * Cloud Storage bucket storage location of the snapshot (regional or multi-regional).
     * 
     */
    @InputImport(name="storageLocations")
    private final @Nullable Input<List<String>> storageLocations;

    public Input<List<String>> getStorageLocations() {
        return this.storageLocations == null ? Input.empty() : this.storageLocations;
    }

    public SnapshotArgs(
        @Nullable Input<String> chainName,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> guestFlush,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> locationHint,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<CustomerEncryptionKeyArgs> snapshotEncryptionKey,
        @Nullable Input<SnapshotSnapshotType> snapshotType,
        @Nullable Input<String> sourceDisk,
        @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey,
        @Nullable Input<String> sourceInstantSnapshot,
        @Nullable Input<List<String>> storageLocations) {
        this.chainName = chainName;
        this.description = description;
        this.guestFlush = guestFlush;
        this.labels = labels;
        this.locationHint = locationHint;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.snapshotEncryptionKey = snapshotEncryptionKey;
        this.snapshotType = snapshotType;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.sourceInstantSnapshot = sourceInstantSnapshot;
        this.storageLocations = storageLocations;
    }

    private SnapshotArgs() {
        this.chainName = Input.empty();
        this.description = Input.empty();
        this.guestFlush = Input.empty();
        this.labels = Input.empty();
        this.locationHint = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.snapshotEncryptionKey = Input.empty();
        this.snapshotType = Input.empty();
        this.sourceDisk = Input.empty();
        this.sourceDiskEncryptionKey = Input.empty();
        this.sourceInstantSnapshot = Input.empty();
        this.storageLocations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> chainName;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> guestFlush;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<CustomerEncryptionKeyArgs> snapshotEncryptionKey;
        private @Nullable Input<SnapshotSnapshotType> snapshotType;
        private @Nullable Input<String> sourceDisk;
        private @Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey;
        private @Nullable Input<String> sourceInstantSnapshot;
        private @Nullable Input<List<String>> storageLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainName = defaults.chainName;
    	      this.description = defaults.description;
    	      this.guestFlush = defaults.guestFlush;
    	      this.labels = defaults.labels;
    	      this.locationHint = defaults.locationHint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.snapshotEncryptionKey = defaults.snapshotEncryptionKey;
    	      this.snapshotType = defaults.snapshotType;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.storageLocations = defaults.storageLocations;
        }

        public Builder setChainName(@Nullable Input<String> chainName) {
            this.chainName = chainName;
            return this;
        }

        public Builder setChainName(@Nullable String chainName) {
            this.chainName = Input.ofNullable(chainName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGuestFlush(@Nullable Input<Boolean> guestFlush) {
            this.guestFlush = guestFlush;
            return this;
        }

        public Builder setGuestFlush(@Nullable Boolean guestFlush) {
            this.guestFlush = Input.ofNullable(guestFlush);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
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

        public Builder setSnapshotEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> snapshotEncryptionKey) {
            this.snapshotEncryptionKey = snapshotEncryptionKey;
            return this;
        }

        public Builder setSnapshotEncryptionKey(@Nullable CustomerEncryptionKeyArgs snapshotEncryptionKey) {
            this.snapshotEncryptionKey = Input.ofNullable(snapshotEncryptionKey);
            return this;
        }

        public Builder setSnapshotType(@Nullable Input<SnapshotSnapshotType> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder setSnapshotType(@Nullable SnapshotSnapshotType snapshotType) {
            this.snapshotType = Input.ofNullable(snapshotType);
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

        public Builder setSourceDiskEncryptionKey(@Nullable Input<CustomerEncryptionKeyArgs> sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
            return this;
        }

        public Builder setSourceDiskEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Input.ofNullable(sourceDiskEncryptionKey);
            return this;
        }

        public Builder setSourceInstantSnapshot(@Nullable Input<String> sourceInstantSnapshot) {
            this.sourceInstantSnapshot = sourceInstantSnapshot;
            return this;
        }

        public Builder setSourceInstantSnapshot(@Nullable String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Input.ofNullable(sourceInstantSnapshot);
            return this;
        }

        public Builder setStorageLocations(@Nullable Input<List<String>> storageLocations) {
            this.storageLocations = storageLocations;
            return this;
        }

        public Builder setStorageLocations(@Nullable List<String> storageLocations) {
            this.storageLocations = Input.ofNullable(storageLocations);
            return this;
        }

        public SnapshotArgs build() {
            return new SnapshotArgs(chainName, description, guestFlush, labels, locationHint, name, project, requestId, snapshotEncryptionKey, snapshotType, sourceDisk, sourceDiskEncryptionKey, sourceInstantSnapshot, storageLocations);
        }
    }
}
