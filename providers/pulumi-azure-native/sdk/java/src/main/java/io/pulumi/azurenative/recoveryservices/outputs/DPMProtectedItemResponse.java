// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DPMProtectedItemExtendedInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DPMProtectedItemResponse {
    /**
     * Backup Management server protecting this backup item
     * 
     */
    private final @Nullable String backupEngineName;
    /**
     * Type of backup management for the backed up item.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Name of the backup set the backup item belongs to
     * 
     */
    private final @Nullable String backupSetName;
    /**
     * Unique name of container
     * 
     */
    private final @Nullable String containerName;
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
     */
    private final @Nullable String createMode;
    /**
     * Time for deferred deletion in UTC
     * 
     */
    private final @Nullable String deferredDeleteTimeInUTC;
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
     */
    private final @Nullable String deferredDeleteTimeRemaining;
    /**
     * Extended info of the backup item.
     * 
     */
    private final @Nullable DPMProtectedItemExtendedInfoResponse extendedInfo;
    /**
     * Friendly name of the managed item
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
     */
    private final @Nullable Boolean isDeferredDeleteScheduleUpcoming;
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
     */
    private final @Nullable Boolean isRehydrate;
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
     */
    private final @Nullable Boolean isScheduledForDeferredDelete;
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
     */
    private final @Nullable String lastRecoveryPoint;
    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    private final @Nullable String policyId;
    /**
     * backup item type.
     * Expected value is 'DPMProtectedItem'.
     * 
     */
    private final String protectedItemType;
    /**
     * Protection state of the backup engine
     * 
     */
    private final @Nullable String protectionState;
    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    private final @Nullable String sourceResourceId;
    /**
     * Type of workload this item represents.
     * 
     */
    private final @Nullable String workloadType;

    @OutputCustomType.Constructor
    private DPMProtectedItemResponse(
        @OutputCustomType.Parameter("backupEngineName") @Nullable String backupEngineName,
        @OutputCustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @OutputCustomType.Parameter("backupSetName") @Nullable String backupSetName,
        @OutputCustomType.Parameter("containerName") @Nullable String containerName,
        @OutputCustomType.Parameter("createMode") @Nullable String createMode,
        @OutputCustomType.Parameter("deferredDeleteTimeInUTC") @Nullable String deferredDeleteTimeInUTC,
        @OutputCustomType.Parameter("deferredDeleteTimeRemaining") @Nullable String deferredDeleteTimeRemaining,
        @OutputCustomType.Parameter("extendedInfo") @Nullable DPMProtectedItemExtendedInfoResponse extendedInfo,
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("isDeferredDeleteScheduleUpcoming") @Nullable Boolean isDeferredDeleteScheduleUpcoming,
        @OutputCustomType.Parameter("isRehydrate") @Nullable Boolean isRehydrate,
        @OutputCustomType.Parameter("isScheduledForDeferredDelete") @Nullable Boolean isScheduledForDeferredDelete,
        @OutputCustomType.Parameter("lastRecoveryPoint") @Nullable String lastRecoveryPoint,
        @OutputCustomType.Parameter("policyId") @Nullable String policyId,
        @OutputCustomType.Parameter("protectedItemType") String protectedItemType,
        @OutputCustomType.Parameter("protectionState") @Nullable String protectionState,
        @OutputCustomType.Parameter("sourceResourceId") @Nullable String sourceResourceId,
        @OutputCustomType.Parameter("workloadType") @Nullable String workloadType) {
        this.backupEngineName = backupEngineName;
        this.backupManagementType = backupManagementType;
        this.backupSetName = backupSetName;
        this.containerName = containerName;
        this.createMode = createMode;
        this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        this.isRehydrate = isRehydrate;
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        this.lastRecoveryPoint = lastRecoveryPoint;
        this.policyId = policyId;
        this.protectedItemType = protectedItemType;
        this.protectionState = protectionState;
        this.sourceResourceId = sourceResourceId;
        this.workloadType = workloadType;
    }

    /**
     * Backup Management server protecting this backup item
     * 
    */
    public Optional<String> getBackupEngineName() {
        return Optional.ofNullable(this.backupEngineName);
    }
    /**
     * Type of backup management for the backed up item.
     * 
    */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Name of the backup set the backup item belongs to
     * 
    */
    public Optional<String> getBackupSetName() {
        return Optional.ofNullable(this.backupSetName);
    }
    /**
     * Unique name of container
     * 
    */
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * Create mode to indicate recovery of existing soft deleted data source or creation of new data source.
     * 
    */
    public Optional<String> getCreateMode() {
        return Optional.ofNullable(this.createMode);
    }
    /**
     * Time for deferred deletion in UTC
     * 
    */
    public Optional<String> getDeferredDeleteTimeInUTC() {
        return Optional.ofNullable(this.deferredDeleteTimeInUTC);
    }
    /**
     * Time remaining before the DS marked for deferred delete is permanently deleted
     * 
    */
    public Optional<String> getDeferredDeleteTimeRemaining() {
        return Optional.ofNullable(this.deferredDeleteTimeRemaining);
    }
    /**
     * Extended info of the backup item.
     * 
    */
    public Optional<DPMProtectedItemExtendedInfoResponse> getExtendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    /**
     * Friendly name of the managed item
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Flag to identify whether the deferred deleted DS is to be purged soon
     * 
    */
    public Optional<Boolean> getIsDeferredDeleteScheduleUpcoming() {
        return Optional.ofNullable(this.isDeferredDeleteScheduleUpcoming);
    }
    /**
     * Flag to identify that deferred deleted DS is to be moved into Pause state
     * 
    */
    public Optional<Boolean> getIsRehydrate() {
        return Optional.ofNullable(this.isRehydrate);
    }
    /**
     * Flag to identify whether the DS is scheduled for deferred delete
     * 
    */
    public Optional<Boolean> getIsScheduledForDeferredDelete() {
        return Optional.ofNullable(this.isScheduledForDeferredDelete);
    }
    /**
     * Timestamp when the last (latest) backup copy was created for this backup item.
     * 
    */
    public Optional<String> getLastRecoveryPoint() {
        return Optional.ofNullable(this.lastRecoveryPoint);
    }
    /**
     * ID of the backup policy with which this item is backed up.
     * 
    */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * backup item type.
     * Expected value is 'DPMProtectedItem'.
     * 
    */
    public String getProtectedItemType() {
        return this.protectedItemType;
    }
    /**
     * Protection state of the backup engine
     * 
    */
    public Optional<String> getProtectionState() {
        return Optional.ofNullable(this.protectionState);
    }
    /**
     * ARM ID of the resource to be backed up.
     * 
    */
    public Optional<String> getSourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }
    /**
     * Type of workload this item represents.
     * 
    */
    public Optional<String> getWorkloadType() {
        return Optional.ofNullable(this.workloadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DPMProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupEngineName;
        private @Nullable String backupManagementType;
        private @Nullable String backupSetName;
        private @Nullable String containerName;
        private @Nullable String createMode;
        private @Nullable String deferredDeleteTimeInUTC;
        private @Nullable String deferredDeleteTimeRemaining;
        private @Nullable DPMProtectedItemExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable Boolean isDeferredDeleteScheduleUpcoming;
        private @Nullable Boolean isRehydrate;
        private @Nullable Boolean isScheduledForDeferredDelete;
        private @Nullable String lastRecoveryPoint;
        private @Nullable String policyId;
        private String protectedItemType;
        private @Nullable String protectionState;
        private @Nullable String sourceResourceId;
        private @Nullable String workloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(DPMProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupEngineName = defaults.backupEngineName;
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.backupSetName = defaults.backupSetName;
    	      this.containerName = defaults.containerName;
    	      this.createMode = defaults.createMode;
    	      this.deferredDeleteTimeInUTC = defaults.deferredDeleteTimeInUTC;
    	      this.deferredDeleteTimeRemaining = defaults.deferredDeleteTimeRemaining;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.isDeferredDeleteScheduleUpcoming = defaults.isDeferredDeleteScheduleUpcoming;
    	      this.isRehydrate = defaults.isRehydrate;
    	      this.isScheduledForDeferredDelete = defaults.isScheduledForDeferredDelete;
    	      this.lastRecoveryPoint = defaults.lastRecoveryPoint;
    	      this.policyId = defaults.policyId;
    	      this.protectedItemType = defaults.protectedItemType;
    	      this.protectionState = defaults.protectionState;
    	      this.sourceResourceId = defaults.sourceResourceId;
    	      this.workloadType = defaults.workloadType;
        }

        public Builder setBackupEngineName(@Nullable String backupEngineName) {
            this.backupEngineName = backupEngineName;
            return this;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupSetName(@Nullable String backupSetName) {
            this.backupSetName = backupSetName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setDeferredDeleteTimeInUTC(@Nullable String deferredDeleteTimeInUTC) {
            this.deferredDeleteTimeInUTC = deferredDeleteTimeInUTC;
            return this;
        }

        public Builder setDeferredDeleteTimeRemaining(@Nullable String deferredDeleteTimeRemaining) {
            this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
            return this;
        }

        public Builder setExtendedInfo(@Nullable DPMProtectedItemExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setIsDeferredDeleteScheduleUpcoming(@Nullable Boolean isDeferredDeleteScheduleUpcoming) {
            this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
            return this;
        }

        public Builder setIsRehydrate(@Nullable Boolean isRehydrate) {
            this.isRehydrate = isRehydrate;
            return this;
        }

        public Builder setIsScheduledForDeferredDelete(@Nullable Boolean isScheduledForDeferredDelete) {
            this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
            return this;
        }

        public Builder setLastRecoveryPoint(@Nullable String lastRecoveryPoint) {
            this.lastRecoveryPoint = lastRecoveryPoint;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProtectedItemType(String protectedItemType) {
            this.protectedItemType = Objects.requireNonNull(protectedItemType);
            return this;
        }

        public Builder setProtectionState(@Nullable String protectionState) {
            this.protectionState = protectionState;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setWorkloadType(@Nullable String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public DPMProtectedItemResponse build() {
            return new DPMProtectedItemResponse(backupEngineName, backupManagementType, backupSetName, containerName, createMode, deferredDeleteTimeInUTC, deferredDeleteTimeRemaining, extendedInfo, friendlyName, isDeferredDeleteScheduleUpcoming, isRehydrate, isScheduledForDeferredDelete, lastRecoveryPoint, policyId, protectedItemType, protectionState, sourceResourceId, workloadType);
        }
    }
}
