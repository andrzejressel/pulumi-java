// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class A2AProtectedDiskDetailsResponse {
    /**
     * The disk level operations list.
     * 
     */
    private final @Nullable List<String> allowedDiskLevelOperation;
    /**
     * The data pending at source virtual machine in MB.
     * 
     */
    private final @Nullable Double dataPendingAtSourceAgentInMB;
    /**
     * The data pending for replication in MB at staging account.
     * 
     */
    private final @Nullable Double dataPendingInStagingStorageAccountInMB;
    /**
     * The KeyVault resource id for secret (BEK).
     * 
     */
    private final @Nullable String dekKeyVaultArmId;
    /**
     * The disk capacity in bytes.
     * 
     */
    private final @Nullable Double diskCapacityInBytes;
    /**
     * The disk name.
     * 
     */
    private final @Nullable String diskName;
    /**
     * The disk state.
     * 
     */
    private final @Nullable String diskState;
    /**
     * The type of disk.
     * 
     */
    private final @Nullable String diskType;
    /**
     * The disk uri.
     * 
     */
    private final @Nullable String diskUri;
    /**
     * A value indicating whether vm has encrypted os disk or not.
     * 
     */
    private final @Nullable Boolean isDiskEncrypted;
    /**
     * A value indicating whether disk key got encrypted or not.
     * 
     */
    private final @Nullable Boolean isDiskKeyEncrypted;
    /**
     * The KeyVault resource id for key (KEK).
     * 
     */
    private final @Nullable String kekKeyVaultArmId;
    /**
     * The key URL / identifier (KEK).
     * 
     */
    private final @Nullable String keyIdentifier;
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
     */
    private final @Nullable String monitoringJobType;
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
     */
    private final @Nullable Integer monitoringPercentageCompletion;
    /**
     * The primary disk storage account.
     * 
     */
    private final @Nullable String primaryDiskAzureStorageAccountId;
    /**
     * The primary staging storage account.
     * 
     */
    private final @Nullable String primaryStagingAzureStorageAccountId;
    /**
     * The recovery disk storage account.
     * 
     */
    private final @Nullable String recoveryAzureStorageAccountId;
    /**
     * Recovery disk uri.
     * 
     */
    private final @Nullable String recoveryDiskUri;
    /**
     * A value indicating whether resync is required for this disk.
     * 
     */
    private final @Nullable Boolean resyncRequired;
    /**
     * The secret URL / identifier (BEK).
     * 
     */
    private final @Nullable String secretIdentifier;

    @OutputCustomType.Constructor
    private A2AProtectedDiskDetailsResponse(
        @OutputCustomType.Parameter("allowedDiskLevelOperation") @Nullable List<String> allowedDiskLevelOperation,
        @OutputCustomType.Parameter("dataPendingAtSourceAgentInMB") @Nullable Double dataPendingAtSourceAgentInMB,
        @OutputCustomType.Parameter("dataPendingInStagingStorageAccountInMB") @Nullable Double dataPendingInStagingStorageAccountInMB,
        @OutputCustomType.Parameter("dekKeyVaultArmId") @Nullable String dekKeyVaultArmId,
        @OutputCustomType.Parameter("diskCapacityInBytes") @Nullable Double diskCapacityInBytes,
        @OutputCustomType.Parameter("diskName") @Nullable String diskName,
        @OutputCustomType.Parameter("diskState") @Nullable String diskState,
        @OutputCustomType.Parameter("diskType") @Nullable String diskType,
        @OutputCustomType.Parameter("diskUri") @Nullable String diskUri,
        @OutputCustomType.Parameter("isDiskEncrypted") @Nullable Boolean isDiskEncrypted,
        @OutputCustomType.Parameter("isDiskKeyEncrypted") @Nullable Boolean isDiskKeyEncrypted,
        @OutputCustomType.Parameter("kekKeyVaultArmId") @Nullable String kekKeyVaultArmId,
        @OutputCustomType.Parameter("keyIdentifier") @Nullable String keyIdentifier,
        @OutputCustomType.Parameter("monitoringJobType") @Nullable String monitoringJobType,
        @OutputCustomType.Parameter("monitoringPercentageCompletion") @Nullable Integer monitoringPercentageCompletion,
        @OutputCustomType.Parameter("primaryDiskAzureStorageAccountId") @Nullable String primaryDiskAzureStorageAccountId,
        @OutputCustomType.Parameter("primaryStagingAzureStorageAccountId") @Nullable String primaryStagingAzureStorageAccountId,
        @OutputCustomType.Parameter("recoveryAzureStorageAccountId") @Nullable String recoveryAzureStorageAccountId,
        @OutputCustomType.Parameter("recoveryDiskUri") @Nullable String recoveryDiskUri,
        @OutputCustomType.Parameter("resyncRequired") @Nullable Boolean resyncRequired,
        @OutputCustomType.Parameter("secretIdentifier") @Nullable String secretIdentifier) {
        this.allowedDiskLevelOperation = allowedDiskLevelOperation;
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        this.dekKeyVaultArmId = dekKeyVaultArmId;
        this.diskCapacityInBytes = diskCapacityInBytes;
        this.diskName = diskName;
        this.diskState = diskState;
        this.diskType = diskType;
        this.diskUri = diskUri;
        this.isDiskEncrypted = isDiskEncrypted;
        this.isDiskKeyEncrypted = isDiskKeyEncrypted;
        this.kekKeyVaultArmId = kekKeyVaultArmId;
        this.keyIdentifier = keyIdentifier;
        this.monitoringJobType = monitoringJobType;
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        this.recoveryDiskUri = recoveryDiskUri;
        this.resyncRequired = resyncRequired;
        this.secretIdentifier = secretIdentifier;
    }

    /**
     * The disk level operations list.
     * 
    */
    public List<String> getAllowedDiskLevelOperation() {
        return this.allowedDiskLevelOperation == null ? List.of() : this.allowedDiskLevelOperation;
    }
    /**
     * The data pending at source virtual machine in MB.
     * 
    */
    public Optional<Double> getDataPendingAtSourceAgentInMB() {
        return Optional.ofNullable(this.dataPendingAtSourceAgentInMB);
    }
    /**
     * The data pending for replication in MB at staging account.
     * 
    */
    public Optional<Double> getDataPendingInStagingStorageAccountInMB() {
        return Optional.ofNullable(this.dataPendingInStagingStorageAccountInMB);
    }
    /**
     * The KeyVault resource id for secret (BEK).
     * 
    */
    public Optional<String> getDekKeyVaultArmId() {
        return Optional.ofNullable(this.dekKeyVaultArmId);
    }
    /**
     * The disk capacity in bytes.
     * 
    */
    public Optional<Double> getDiskCapacityInBytes() {
        return Optional.ofNullable(this.diskCapacityInBytes);
    }
    /**
     * The disk name.
     * 
    */
    public Optional<String> getDiskName() {
        return Optional.ofNullable(this.diskName);
    }
    /**
     * The disk state.
     * 
    */
    public Optional<String> getDiskState() {
        return Optional.ofNullable(this.diskState);
    }
    /**
     * The type of disk.
     * 
    */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * The disk uri.
     * 
    */
    public Optional<String> getDiskUri() {
        return Optional.ofNullable(this.diskUri);
    }
    /**
     * A value indicating whether vm has encrypted os disk or not.
     * 
    */
    public Optional<Boolean> getIsDiskEncrypted() {
        return Optional.ofNullable(this.isDiskEncrypted);
    }
    /**
     * A value indicating whether disk key got encrypted or not.
     * 
    */
    public Optional<Boolean> getIsDiskKeyEncrypted() {
        return Optional.ofNullable(this.isDiskKeyEncrypted);
    }
    /**
     * The KeyVault resource id for key (KEK).
     * 
    */
    public Optional<String> getKekKeyVaultArmId() {
        return Optional.ofNullable(this.kekKeyVaultArmId);
    }
    /**
     * The key URL / identifier (KEK).
     * 
    */
    public Optional<String> getKeyIdentifier() {
        return Optional.ofNullable(this.keyIdentifier);
    }
    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
    */
    public Optional<String> getMonitoringJobType() {
        return Optional.ofNullable(this.monitoringJobType);
    }
    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
    */
    public Optional<Integer> getMonitoringPercentageCompletion() {
        return Optional.ofNullable(this.monitoringPercentageCompletion);
    }
    /**
     * The primary disk storage account.
     * 
    */
    public Optional<String> getPrimaryDiskAzureStorageAccountId() {
        return Optional.ofNullable(this.primaryDiskAzureStorageAccountId);
    }
    /**
     * The primary staging storage account.
     * 
    */
    public Optional<String> getPrimaryStagingAzureStorageAccountId() {
        return Optional.ofNullable(this.primaryStagingAzureStorageAccountId);
    }
    /**
     * The recovery disk storage account.
     * 
    */
    public Optional<String> getRecoveryAzureStorageAccountId() {
        return Optional.ofNullable(this.recoveryAzureStorageAccountId);
    }
    /**
     * Recovery disk uri.
     * 
    */
    public Optional<String> getRecoveryDiskUri() {
        return Optional.ofNullable(this.recoveryDiskUri);
    }
    /**
     * A value indicating whether resync is required for this disk.
     * 
    */
    public Optional<Boolean> getResyncRequired() {
        return Optional.ofNullable(this.resyncRequired);
    }
    /**
     * The secret URL / identifier (BEK).
     * 
    */
    public Optional<String> getSecretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedDiskLevelOperation;
        private @Nullable Double dataPendingAtSourceAgentInMB;
        private @Nullable Double dataPendingInStagingStorageAccountInMB;
        private @Nullable String dekKeyVaultArmId;
        private @Nullable Double diskCapacityInBytes;
        private @Nullable String diskName;
        private @Nullable String diskState;
        private @Nullable String diskType;
        private @Nullable String diskUri;
        private @Nullable Boolean isDiskEncrypted;
        private @Nullable Boolean isDiskKeyEncrypted;
        private @Nullable String kekKeyVaultArmId;
        private @Nullable String keyIdentifier;
        private @Nullable String monitoringJobType;
        private @Nullable Integer monitoringPercentageCompletion;
        private @Nullable String primaryDiskAzureStorageAccountId;
        private @Nullable String primaryStagingAzureStorageAccountId;
        private @Nullable String recoveryAzureStorageAccountId;
        private @Nullable String recoveryDiskUri;
        private @Nullable Boolean resyncRequired;
        private @Nullable String secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDiskLevelOperation = defaults.allowedDiskLevelOperation;
    	      this.dataPendingAtSourceAgentInMB = defaults.dataPendingAtSourceAgentInMB;
    	      this.dataPendingInStagingStorageAccountInMB = defaults.dataPendingInStagingStorageAccountInMB;
    	      this.dekKeyVaultArmId = defaults.dekKeyVaultArmId;
    	      this.diskCapacityInBytes = defaults.diskCapacityInBytes;
    	      this.diskName = defaults.diskName;
    	      this.diskState = defaults.diskState;
    	      this.diskType = defaults.diskType;
    	      this.diskUri = defaults.diskUri;
    	      this.isDiskEncrypted = defaults.isDiskEncrypted;
    	      this.isDiskKeyEncrypted = defaults.isDiskKeyEncrypted;
    	      this.kekKeyVaultArmId = defaults.kekKeyVaultArmId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.monitoringJobType = defaults.monitoringJobType;
    	      this.monitoringPercentageCompletion = defaults.monitoringPercentageCompletion;
    	      this.primaryDiskAzureStorageAccountId = defaults.primaryDiskAzureStorageAccountId;
    	      this.primaryStagingAzureStorageAccountId = defaults.primaryStagingAzureStorageAccountId;
    	      this.recoveryAzureStorageAccountId = defaults.recoveryAzureStorageAccountId;
    	      this.recoveryDiskUri = defaults.recoveryDiskUri;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder setAllowedDiskLevelOperation(@Nullable List<String> allowedDiskLevelOperation) {
            this.allowedDiskLevelOperation = allowedDiskLevelOperation;
            return this;
        }

        public Builder setDataPendingAtSourceAgentInMB(@Nullable Double dataPendingAtSourceAgentInMB) {
            this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
            return this;
        }

        public Builder setDataPendingInStagingStorageAccountInMB(@Nullable Double dataPendingInStagingStorageAccountInMB) {
            this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
            return this;
        }

        public Builder setDekKeyVaultArmId(@Nullable String dekKeyVaultArmId) {
            this.dekKeyVaultArmId = dekKeyVaultArmId;
            return this;
        }

        public Builder setDiskCapacityInBytes(@Nullable Double diskCapacityInBytes) {
            this.diskCapacityInBytes = diskCapacityInBytes;
            return this;
        }

        public Builder setDiskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder setDiskState(@Nullable String diskState) {
            this.diskState = diskState;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskUri(@Nullable String diskUri) {
            this.diskUri = diskUri;
            return this;
        }

        public Builder setIsDiskEncrypted(@Nullable Boolean isDiskEncrypted) {
            this.isDiskEncrypted = isDiskEncrypted;
            return this;
        }

        public Builder setIsDiskKeyEncrypted(@Nullable Boolean isDiskKeyEncrypted) {
            this.isDiskKeyEncrypted = isDiskKeyEncrypted;
            return this;
        }

        public Builder setKekKeyVaultArmId(@Nullable String kekKeyVaultArmId) {
            this.kekKeyVaultArmId = kekKeyVaultArmId;
            return this;
        }

        public Builder setKeyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }

        public Builder setMonitoringJobType(@Nullable String monitoringJobType) {
            this.monitoringJobType = monitoringJobType;
            return this;
        }

        public Builder setMonitoringPercentageCompletion(@Nullable Integer monitoringPercentageCompletion) {
            this.monitoringPercentageCompletion = monitoringPercentageCompletion;
            return this;
        }

        public Builder setPrimaryDiskAzureStorageAccountId(@Nullable String primaryDiskAzureStorageAccountId) {
            this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
            return this;
        }

        public Builder setPrimaryStagingAzureStorageAccountId(@Nullable String primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
            return this;
        }

        public Builder setRecoveryAzureStorageAccountId(@Nullable String recoveryAzureStorageAccountId) {
            this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
            return this;
        }

        public Builder setRecoveryDiskUri(@Nullable String recoveryDiskUri) {
            this.recoveryDiskUri = recoveryDiskUri;
            return this;
        }

        public Builder setResyncRequired(@Nullable Boolean resyncRequired) {
            this.resyncRequired = resyncRequired;
            return this;
        }

        public Builder setSecretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }
        public A2AProtectedDiskDetailsResponse build() {
            return new A2AProtectedDiskDetailsResponse(allowedDiskLevelOperation, dataPendingAtSourceAgentInMB, dataPendingInStagingStorageAccountInMB, dekKeyVaultArmId, diskCapacityInBytes, diskName, diskState, diskType, diskUri, isDiskEncrypted, isDiskKeyEncrypted, kekKeyVaultArmId, keyIdentifier, monitoringJobType, monitoringPercentageCompletion, primaryDiskAzureStorageAccountId, primaryStagingAzureStorageAccountId, recoveryAzureStorageAccountId, recoveryDiskUri, resyncRequired, secretIdentifier);
        }
    }
}
