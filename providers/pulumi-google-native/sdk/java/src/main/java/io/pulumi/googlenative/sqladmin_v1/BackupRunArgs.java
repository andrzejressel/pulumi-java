// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.enums.BackupRunBackupKind;
import io.pulumi.googlenative.sqladmin_v1.enums.BackupRunStatus;
import io.pulumi.googlenative.sqladmin_v1.enums.BackupRunType;
import io.pulumi.googlenative.sqladmin_v1.inputs.DiskEncryptionConfigurationArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.DiskEncryptionStatusArgs;
import io.pulumi.googlenative.sqladmin_v1.inputs.OperationErrorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupRunArgs Empty = new BackupRunArgs();

    /**
     * Specifies the kind of backup, PHYSICAL or DEFAULT_SNAPSHOT.
     * 
     */
    @InputImport(name="backupKind")
    private final @Nullable Input<BackupRunBackupKind> backupKind;

    public Input<BackupRunBackupKind> getBackupKind() {
        return this.backupKind == null ? Input.empty() : this.backupKind;
    }

    /**
     * The description of this run, only applicable to on-demand backups.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Encryption configuration specific to a backup.
     * 
     */
    @InputImport(name="diskEncryptionConfiguration")
    private final @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;

    public Input<DiskEncryptionConfigurationArgs> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration == null ? Input.empty() : this.diskEncryptionConfiguration;
    }

    /**
     * Encryption status specific to a backup.
     * 
     */
    @InputImport(name="diskEncryptionStatus")
    private final @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;

    public Input<DiskEncryptionStatusArgs> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus == null ? Input.empty() : this.diskEncryptionStatus;
    }

    /**
     * The time the backup operation completed in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The time the run was enqueued in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="enqueuedTime")
    private final @Nullable Input<String> enqueuedTime;

    public Input<String> getEnqueuedTime() {
        return this.enqueuedTime == null ? Input.empty() : this.enqueuedTime;
    }

    /**
     * Information about why the backup operation failed. This is only present if the run has the FAILED status.
     * 
     */
    @InputImport(name="error")
    private final @Nullable Input<OperationErrorArgs> error;

    public Input<OperationErrorArgs> getError() {
        return this.error == null ? Input.empty() : this.error;
    }

    /**
     * The identifier for this backup run. Unique only for a specific Cloud SQL instance.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the database instance.
     * 
     */
    @InputImport(name="instance", required=true)
    private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * This is always `sql#backupRun`.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Location of the backups.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of this resource.
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * The time the backup operation actually started in UTC timezone in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The status of this run.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<BackupRunStatus> status;

    public Input<BackupRunStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The type of this run; can be either "AUTOMATED" or "ON_DEMAND". This field defaults to "ON_DEMAND" and is ignored, when specified for insert requests.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<BackupRunType> type;

    public Input<BackupRunType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The start time of the backup window during which this the backup was attempted in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @InputImport(name="windowStartTime")
    private final @Nullable Input<String> windowStartTime;

    public Input<String> getWindowStartTime() {
        return this.windowStartTime == null ? Input.empty() : this.windowStartTime;
    }

    public BackupRunArgs(
        @Nullable Input<BackupRunBackupKind> backupKind,
        @Nullable Input<String> description,
        @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration,
        @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus,
        @Nullable Input<String> endTime,
        @Nullable Input<String> enqueuedTime,
        @Nullable Input<OperationErrorArgs> error,
        @Nullable Input<String> id,
        Input<String> instance,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<String> startTime,
        @Nullable Input<BackupRunStatus> status,
        @Nullable Input<BackupRunType> type,
        @Nullable Input<String> windowStartTime) {
        this.backupKind = backupKind;
        this.description = description;
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        this.diskEncryptionStatus = diskEncryptionStatus;
        this.endTime = endTime;
        this.enqueuedTime = enqueuedTime;
        this.error = error;
        this.id = id;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.kind = kind;
        this.location = location;
        this.project = project;
        this.selfLink = selfLink;
        this.startTime = startTime;
        this.status = status;
        this.type = type;
        this.windowStartTime = windowStartTime;
    }

    private BackupRunArgs() {
        this.backupKind = Input.empty();
        this.description = Input.empty();
        this.diskEncryptionConfiguration = Input.empty();
        this.diskEncryptionStatus = Input.empty();
        this.endTime = Input.empty();
        this.enqueuedTime = Input.empty();
        this.error = Input.empty();
        this.id = Input.empty();
        this.instance = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.startTime = Input.empty();
        this.status = Input.empty();
        this.type = Input.empty();
        this.windowStartTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BackupRunBackupKind> backupKind;
        private @Nullable Input<String> description;
        private @Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration;
        private @Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> enqueuedTime;
        private @Nullable Input<OperationErrorArgs> error;
        private @Nullable Input<String> id;
        private Input<String> instance;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<String> startTime;
        private @Nullable Input<BackupRunStatus> status;
        private @Nullable Input<BackupRunType> type;
        private @Nullable Input<String> windowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupKind = defaults.backupKind;
    	      this.description = defaults.description;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.endTime = defaults.endTime;
    	      this.enqueuedTime = defaults.enqueuedTime;
    	      this.error = defaults.error;
    	      this.id = defaults.id;
    	      this.instance = defaults.instance;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.windowStartTime = defaults.windowStartTime;
        }

        public Builder setBackupKind(@Nullable Input<BackupRunBackupKind> backupKind) {
            this.backupKind = backupKind;
            return this;
        }

        public Builder setBackupKind(@Nullable BackupRunBackupKind backupKind) {
            this.backupKind = Input.ofNullable(backupKind);
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

        public Builder setDiskEncryptionConfiguration(@Nullable Input<DiskEncryptionConfigurationArgs> diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = diskEncryptionConfiguration;
            return this;
        }

        public Builder setDiskEncryptionConfiguration(@Nullable DiskEncryptionConfigurationArgs diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Input.ofNullable(diskEncryptionConfiguration);
            return this;
        }

        public Builder setDiskEncryptionStatus(@Nullable Input<DiskEncryptionStatusArgs> diskEncryptionStatus) {
            this.diskEncryptionStatus = diskEncryptionStatus;
            return this;
        }

        public Builder setDiskEncryptionStatus(@Nullable DiskEncryptionStatusArgs diskEncryptionStatus) {
            this.diskEncryptionStatus = Input.ofNullable(diskEncryptionStatus);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setEnqueuedTime(@Nullable Input<String> enqueuedTime) {
            this.enqueuedTime = enqueuedTime;
            return this;
        }

        public Builder setEnqueuedTime(@Nullable String enqueuedTime) {
            this.enqueuedTime = Input.ofNullable(enqueuedTime);
            return this;
        }

        public Builder setError(@Nullable Input<OperationErrorArgs> error) {
            this.error = error;
            return this;
        }

        public Builder setError(@Nullable OperationErrorArgs error) {
            this.error = Input.ofNullable(error);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setStatus(@Nullable Input<BackupRunStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable BackupRunStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(@Nullable Input<BackupRunType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable BackupRunType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setWindowStartTime(@Nullable Input<String> windowStartTime) {
            this.windowStartTime = windowStartTime;
            return this;
        }

        public Builder setWindowStartTime(@Nullable String windowStartTime) {
            this.windowStartTime = Input.ofNullable(windowStartTime);
            return this;
        }

        public BackupRunArgs build() {
            return new BackupRunArgs(backupKind, description, diskEncryptionConfiguration, diskEncryptionStatus, endTime, enqueuedTime, error, id, instance, kind, location, project, selfLink, startTime, status, type, windowStartTime);
        }
    }
}
