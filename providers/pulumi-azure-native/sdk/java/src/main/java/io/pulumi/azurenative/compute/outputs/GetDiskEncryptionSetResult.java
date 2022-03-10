// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.EncryptionSetIdentityResponse;
import io.pulumi.azurenative.compute.outputs.KeyForDiskEncryptionSetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiskEncryptionSetResult {
    /**
     * The key vault key which is currently used by this disk encryption set.
     * 
     */
    private final @Nullable KeyForDiskEncryptionSetResponse activeKey;
    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    private final @Nullable String encryptionType;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be used to encrypt disks.
     * 
     */
    private final @Nullable EncryptionSetIdentityResponse identity;
    /**
     * The time when the active key of this disk encryption set was updated.
     * 
     */
    private final String lastKeyRotationTimestamp;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
     */
    private final List<KeyForDiskEncryptionSetResponse> previousKeys;
    /**
     * The disk encryption set provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     * 
     */
    private final @Nullable Boolean rotationToLatestKeyVersionEnabled;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetDiskEncryptionSetResult(
        @OutputCustomType.Parameter("activeKey") @Nullable KeyForDiskEncryptionSetResponse activeKey,
        @OutputCustomType.Parameter("encryptionType") @Nullable String encryptionType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") @Nullable EncryptionSetIdentityResponse identity,
        @OutputCustomType.Parameter("lastKeyRotationTimestamp") String lastKeyRotationTimestamp,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("previousKeys") List<KeyForDiskEncryptionSetResponse> previousKeys,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("rotationToLatestKeyVersionEnabled") @Nullable Boolean rotationToLatestKeyVersionEnabled,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.activeKey = activeKey;
        this.encryptionType = encryptionType;
        this.id = id;
        this.identity = identity;
        this.lastKeyRotationTimestamp = lastKeyRotationTimestamp;
        this.location = location;
        this.name = name;
        this.previousKeys = previousKeys;
        this.provisioningState = provisioningState;
        this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The key vault key which is currently used by this disk encryption set.
     * 
    */
    public Optional<KeyForDiskEncryptionSetResponse> getActiveKey() {
        return Optional.ofNullable(this.activeKey);
    }
    /**
     * The type of key used to encrypt the data of the disk.
     * 
    */
    public Optional<String> getEncryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The managed identity for the disk encryption set. It should be given permission on the key vault before it can be used to encrypt disks.
     * 
    */
    public Optional<EncryptionSetIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The time when the active key of this disk encryption set was updated.
     * 
    */
    public String getLastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A readonly collection of key vault keys previously used by this disk encryption set while a key rotation is in progress. It will be empty if there is no ongoing key rotation.
     * 
    */
    public List<KeyForDiskEncryptionSetResponse> getPreviousKeys() {
        return this.previousKeys;
    }
    /**
     * The disk encryption set provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Set this flag to true to enable auto-updating of this disk encryption set to the latest key version.
     * 
    */
    public Optional<Boolean> getRotationToLatestKeyVersionEnabled() {
        return Optional.ofNullable(this.rotationToLatestKeyVersionEnabled);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskEncryptionSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyForDiskEncryptionSetResponse activeKey;
        private @Nullable String encryptionType;
        private String id;
        private @Nullable EncryptionSetIdentityResponse identity;
        private String lastKeyRotationTimestamp;
        private String location;
        private String name;
        private List<KeyForDiskEncryptionSetResponse> previousKeys;
        private String provisioningState;
        private @Nullable Boolean rotationToLatestKeyVersionEnabled;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskEncryptionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeKey = defaults.activeKey;
    	      this.encryptionType = defaults.encryptionType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastKeyRotationTimestamp = defaults.lastKeyRotationTimestamp;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.previousKeys = defaults.previousKeys;
    	      this.provisioningState = defaults.provisioningState;
    	      this.rotationToLatestKeyVersionEnabled = defaults.rotationToLatestKeyVersionEnabled;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setActiveKey(@Nullable KeyForDiskEncryptionSetResponse activeKey) {
            this.activeKey = activeKey;
            return this;
        }

        public Builder setEncryptionType(@Nullable String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable EncryptionSetIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLastKeyRotationTimestamp(String lastKeyRotationTimestamp) {
            this.lastKeyRotationTimestamp = Objects.requireNonNull(lastKeyRotationTimestamp);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPreviousKeys(List<KeyForDiskEncryptionSetResponse> previousKeys) {
            this.previousKeys = Objects.requireNonNull(previousKeys);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRotationToLatestKeyVersionEnabled(@Nullable Boolean rotationToLatestKeyVersionEnabled) {
            this.rotationToLatestKeyVersionEnabled = rotationToLatestKeyVersionEnabled;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDiskEncryptionSetResult build() {
            return new GetDiskEncryptionSetResult(activeKey, encryptionType, id, identity, lastKeyRotationTimestamp, location, name, previousKeys, provisioningState, rotationToLatestKeyVersionEnabled, tags, type);
        }
    }
}
