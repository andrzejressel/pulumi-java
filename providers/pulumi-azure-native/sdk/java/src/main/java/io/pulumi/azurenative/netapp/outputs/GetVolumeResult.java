// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.azurenative.netapp.outputs.MountTargetPropertiesResponse;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseDataProtection;
import io.pulumi.azurenative.netapp.outputs.VolumePropertiesResponseExportPolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVolumeResult {
    /**
     * UUID v4 or resource identifier used to identify the Backup.
     * 
     */
    private final @Nullable String backupId;
    /**
     * Unique Baremetal Tenant Identifier.
     * 
     */
    private final String baremetalTenantId;
    /**
     * A unique file path for the volume. Used when creating mount targets
     * 
     */
    private final String creationToken;
    /**
     * DataProtection type volumes include an object containing details of the replication
     * 
     */
    private final @Nullable VolumePropertiesResponseDataProtection dataProtection;
    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'
     * 
     */
    private final @Nullable String encryptionKeySource;
    /**
     * Set of export policy rules
     * 
     */
    private final @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
    /**
     * Unique FileSystem Identifier.
     * 
     */
    private final String fileSystemId;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Restoring
     * 
     */
    private final @Nullable Boolean isRestoring;
    /**
     * Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberosEnabled;
    /**
     * Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
     */
    private final @Nullable Boolean ldapEnabled;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * List of mount targets
     * 
     */
    private final List<MountTargetPropertiesResponse> mountTargets;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
     */
    private final @Nullable List<String> protocolTypes;
    /**
     * Azure lifecycle management
     * 
     */
    private final String provisioningState;
    /**
     * The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
     */
    private final @Nullable String securityStyle;
    /**
     * The service level of the file system
     * 
     */
    private final @Nullable String serviceLevel;
    /**
     * Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
     */
    private final @Nullable Boolean smbContinuouslyAvailable;
    /**
     * Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
     */
    private final @Nullable Boolean smbEncryption;
    /**
     * If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume's snapshots (default to true).
     * 
     */
    private final @Nullable Boolean snapshotDirectoryVisible;
    /**
     * UUID v4 or resource identifier used to identify the Snapshot.
     * 
     */
    private final @Nullable String snapshotId;
    /**
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
     */
    private final String subnetId;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    private final @Nullable Double throughputMibps;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    private final Double usageThreshold;
    /**
     * What type of volume is this
     * 
     */
    private final @Nullable String volumeType;

    @OutputCustomType.Constructor
    private GetVolumeResult(
        @OutputCustomType.Parameter("backupId") @Nullable String backupId,
        @OutputCustomType.Parameter("baremetalTenantId") String baremetalTenantId,
        @OutputCustomType.Parameter("creationToken") String creationToken,
        @OutputCustomType.Parameter("dataProtection") @Nullable VolumePropertiesResponseDataProtection dataProtection,
        @OutputCustomType.Parameter("encryptionKeySource") @Nullable String encryptionKeySource,
        @OutputCustomType.Parameter("exportPolicy") @Nullable VolumePropertiesResponseExportPolicy exportPolicy,
        @OutputCustomType.Parameter("fileSystemId") String fileSystemId,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("isRestoring") @Nullable Boolean isRestoring,
        @OutputCustomType.Parameter("kerberosEnabled") @Nullable Boolean kerberosEnabled,
        @OutputCustomType.Parameter("ldapEnabled") @Nullable Boolean ldapEnabled,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("mountTargets") List<MountTargetPropertiesResponse> mountTargets,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("protocolTypes") @Nullable List<String> protocolTypes,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("securityStyle") @Nullable String securityStyle,
        @OutputCustomType.Parameter("serviceLevel") @Nullable String serviceLevel,
        @OutputCustomType.Parameter("smbContinuouslyAvailable") @Nullable Boolean smbContinuouslyAvailable,
        @OutputCustomType.Parameter("smbEncryption") @Nullable Boolean smbEncryption,
        @OutputCustomType.Parameter("snapshotDirectoryVisible") @Nullable Boolean snapshotDirectoryVisible,
        @OutputCustomType.Parameter("snapshotId") @Nullable String snapshotId,
        @OutputCustomType.Parameter("subnetId") String subnetId,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("throughputMibps") @Nullable Double throughputMibps,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("usageThreshold") Double usageThreshold,
        @OutputCustomType.Parameter("volumeType") @Nullable String volumeType) {
        this.backupId = backupId;
        this.baremetalTenantId = baremetalTenantId;
        this.creationToken = creationToken;
        this.dataProtection = dataProtection;
        this.encryptionKeySource = encryptionKeySource;
        this.exportPolicy = exportPolicy;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.isRestoring = isRestoring;
        this.kerberosEnabled = kerberosEnabled;
        this.ldapEnabled = ldapEnabled;
        this.location = location;
        this.mountTargets = mountTargets;
        this.name = name;
        this.protocolTypes = protocolTypes;
        this.provisioningState = provisioningState;
        this.securityStyle = securityStyle;
        this.serviceLevel = serviceLevel;
        this.smbContinuouslyAvailable = smbContinuouslyAvailable;
        this.smbEncryption = smbEncryption;
        this.snapshotDirectoryVisible = snapshotDirectoryVisible;
        this.snapshotId = snapshotId;
        this.subnetId = subnetId;
        this.tags = tags;
        this.throughputMibps = throughputMibps;
        this.type = type;
        this.usageThreshold = usageThreshold;
        this.volumeType = volumeType;
    }

    /**
     * UUID v4 or resource identifier used to identify the Backup.
     * 
    */
    public Optional<String> getBackupId() {
        return Optional.ofNullable(this.backupId);
    }
    /**
     * Unique Baremetal Tenant Identifier.
     * 
    */
    public String getBaremetalTenantId() {
        return this.baremetalTenantId;
    }
    /**
     * A unique file path for the volume. Used when creating mount targets
     * 
    */
    public String getCreationToken() {
        return this.creationToken;
    }
    /**
     * DataProtection type volumes include an object containing details of the replication
     * 
    */
    public Optional<VolumePropertiesResponseDataProtection> getDataProtection() {
        return Optional.ofNullable(this.dataProtection);
    }
    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'
     * 
    */
    public Optional<String> getEncryptionKeySource() {
        return Optional.ofNullable(this.encryptionKeySource);
    }
    /**
     * Set of export policy rules
     * 
    */
    public Optional<VolumePropertiesResponseExportPolicy> getExportPolicy() {
        return Optional.ofNullable(this.exportPolicy);
    }
    /**
     * Unique FileSystem Identifier.
     * 
    */
    public String getFileSystemId() {
        return this.fileSystemId;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Restoring
     * 
    */
    public Optional<Boolean> getIsRestoring() {
        return Optional.ofNullable(this.isRestoring);
    }
    /**
     * Describe if a volume is KerberosEnabled. To be use with swagger version 2020-05-01 or later
     * 
    */
    public Optional<Boolean> getKerberosEnabled() {
        return Optional.ofNullable(this.kerberosEnabled);
    }
    /**
     * Specifies whether LDAP is enabled or not for a given NFS volume.
     * 
    */
    public Optional<Boolean> getLdapEnabled() {
        return Optional.ofNullable(this.ldapEnabled);
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * List of mount targets
     * 
    */
    public List<MountTargetPropertiesResponse> getMountTargets() {
        return this.mountTargets;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Set of protocol types, default NFSv3, CIFS for SMB protocol
     * 
    */
    public List<String> getProtocolTypes() {
        return this.protocolTypes == null ? List.of() : this.protocolTypes;
    }
    /**
     * Azure lifecycle management
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The security style of volume, default unix, defaults to ntfs for dual protocol or CIFS protocol
     * 
    */
    public Optional<String> getSecurityStyle() {
        return Optional.ofNullable(this.securityStyle);
    }
    /**
     * The service level of the file system
     * 
    */
    public Optional<String> getServiceLevel() {
        return Optional.ofNullable(this.serviceLevel);
    }
    /**
     * Enables continuously available share property for smb volume. Only applicable for SMB volume
     * 
    */
    public Optional<Boolean> getSmbContinuouslyAvailable() {
        return Optional.ofNullable(this.smbContinuouslyAvailable);
    }
    /**
     * Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol volume. To be used with swagger version 2020-08-01 or later
     * 
    */
    public Optional<Boolean> getSmbEncryption() {
        return Optional.ofNullable(this.smbEncryption);
    }
    /**
     * If enabled (true) the volume will contain a read-only snapshot directory which provides access to each of the volume's snapshots (default to true).
     * 
    */
    public Optional<Boolean> getSnapshotDirectoryVisible() {
        return Optional.ofNullable(this.snapshotDirectoryVisible);
    }
    /**
     * UUID v4 or resource identifier used to identify the Snapshot.
     * 
    */
    public Optional<String> getSnapshotId() {
        return Optional.ofNullable(this.snapshotId);
    }
    /**
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<Double> getThroughputMibps() {
        return Optional.ofNullable(this.throughputMibps);
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
    */
    public Double getUsageThreshold() {
        return this.usageThreshold;
    }
    /**
     * What type of volume is this
     * 
    */
    public Optional<String> getVolumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupId;
        private String baremetalTenantId;
        private String creationToken;
        private @Nullable VolumePropertiesResponseDataProtection dataProtection;
        private @Nullable String encryptionKeySource;
        private @Nullable VolumePropertiesResponseExportPolicy exportPolicy;
        private String fileSystemId;
        private String id;
        private @Nullable Boolean isRestoring;
        private @Nullable Boolean kerberosEnabled;
        private @Nullable Boolean ldapEnabled;
        private String location;
        private List<MountTargetPropertiesResponse> mountTargets;
        private String name;
        private @Nullable List<String> protocolTypes;
        private String provisioningState;
        private @Nullable String securityStyle;
        private @Nullable String serviceLevel;
        private @Nullable Boolean smbContinuouslyAvailable;
        private @Nullable Boolean smbEncryption;
        private @Nullable Boolean snapshotDirectoryVisible;
        private @Nullable String snapshotId;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable Double throughputMibps;
        private String type;
        private Double usageThreshold;
        private @Nullable String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.baremetalTenantId = defaults.baremetalTenantId;
    	      this.creationToken = defaults.creationToken;
    	      this.dataProtection = defaults.dataProtection;
    	      this.encryptionKeySource = defaults.encryptionKeySource;
    	      this.exportPolicy = defaults.exportPolicy;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.id = defaults.id;
    	      this.isRestoring = defaults.isRestoring;
    	      this.kerberosEnabled = defaults.kerberosEnabled;
    	      this.ldapEnabled = defaults.ldapEnabled;
    	      this.location = defaults.location;
    	      this.mountTargets = defaults.mountTargets;
    	      this.name = defaults.name;
    	      this.protocolTypes = defaults.protocolTypes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securityStyle = defaults.securityStyle;
    	      this.serviceLevel = defaults.serviceLevel;
    	      this.smbContinuouslyAvailable = defaults.smbContinuouslyAvailable;
    	      this.smbEncryption = defaults.smbEncryption;
    	      this.snapshotDirectoryVisible = defaults.snapshotDirectoryVisible;
    	      this.snapshotId = defaults.snapshotId;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.throughputMibps = defaults.throughputMibps;
    	      this.type = defaults.type;
    	      this.usageThreshold = defaults.usageThreshold;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setBackupId(@Nullable String backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder setBaremetalTenantId(String baremetalTenantId) {
            this.baremetalTenantId = Objects.requireNonNull(baremetalTenantId);
            return this;
        }

        public Builder setCreationToken(String creationToken) {
            this.creationToken = Objects.requireNonNull(creationToken);
            return this;
        }

        public Builder setDataProtection(@Nullable VolumePropertiesResponseDataProtection dataProtection) {
            this.dataProtection = dataProtection;
            return this;
        }

        public Builder setEncryptionKeySource(@Nullable String encryptionKeySource) {
            this.encryptionKeySource = encryptionKeySource;
            return this;
        }

        public Builder setExportPolicy(@Nullable VolumePropertiesResponseExportPolicy exportPolicy) {
            this.exportPolicy = exportPolicy;
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsRestoring(@Nullable Boolean isRestoring) {
            this.isRestoring = isRestoring;
            return this;
        }

        public Builder setKerberosEnabled(@Nullable Boolean kerberosEnabled) {
            this.kerberosEnabled = kerberosEnabled;
            return this;
        }

        public Builder setLdapEnabled(@Nullable Boolean ldapEnabled) {
            this.ldapEnabled = ldapEnabled;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMountTargets(List<MountTargetPropertiesResponse> mountTargets) {
            this.mountTargets = Objects.requireNonNull(mountTargets);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtocolTypes(@Nullable List<String> protocolTypes) {
            this.protocolTypes = protocolTypes;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSecurityStyle(@Nullable String securityStyle) {
            this.securityStyle = securityStyle;
            return this;
        }

        public Builder setServiceLevel(@Nullable String serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }

        public Builder setSmbContinuouslyAvailable(@Nullable Boolean smbContinuouslyAvailable) {
            this.smbContinuouslyAvailable = smbContinuouslyAvailable;
            return this;
        }

        public Builder setSmbEncryption(@Nullable Boolean smbEncryption) {
            this.smbEncryption = smbEncryption;
            return this;
        }

        public Builder setSnapshotDirectoryVisible(@Nullable Boolean snapshotDirectoryVisible) {
            this.snapshotDirectoryVisible = snapshotDirectoryVisible;
            return this;
        }

        public Builder setSnapshotId(@Nullable String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setThroughputMibps(@Nullable Double throughputMibps) {
            this.throughputMibps = throughputMibps;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsageThreshold(Double usageThreshold) {
            this.usageThreshold = Objects.requireNonNull(usageThreshold);
            return this;
        }

        public Builder setVolumeType(@Nullable String volumeType) {
            this.volumeType = volumeType;
            return this;
        }
        public GetVolumeResult build() {
            return new GetVolumeResult(backupId, baremetalTenantId, creationToken, dataProtection, encryptionKeySource, exportPolicy, fileSystemId, id, isRestoring, kerberosEnabled, ldapEnabled, location, mountTargets, name, protocolTypes, provisioningState, securityStyle, serviceLevel, smbContinuouslyAvailable, smbEncryption, snapshotDirectoryVisible, snapshotId, subnetId, tags, throughputMibps, type, usageThreshold, volumeType);
        }
    }
}
