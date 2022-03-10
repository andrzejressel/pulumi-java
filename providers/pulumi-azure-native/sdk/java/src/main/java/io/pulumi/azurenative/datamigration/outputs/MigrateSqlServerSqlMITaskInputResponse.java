// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.BlobShareResponse;
import io.pulumi.azurenative.datamigration.outputs.FileShareResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMIDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateSqlServerSqlMITaskInputResponse {
    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
     */
    private final BlobShareResponse backupBlobShare;
    /**
     * Backup file share information for all selected databases.
     * 
     */
    private final @Nullable FileShareResponse backupFileShare;
    /**
     * Backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup file paths are required to be provided in selectedDatabases.
     * 
     */
    private final @Nullable String backupMode;
    /**
     * Agent Jobs to migrate.
     * 
     */
    private final @Nullable List<String> selectedAgentJobs;
    /**
     * Databases to migrate
     * 
     */
    private final List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
    /**
     * Logins to migrate.
     * 
     */
    private final @Nullable List<String> selectedLogins;
    /**
     * Information for connecting to source
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Information for connecting to target
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor
    private MigrateSqlServerSqlMITaskInputResponse(
        @OutputCustomType.Parameter("backupBlobShare") BlobShareResponse backupBlobShare,
        @OutputCustomType.Parameter("backupFileShare") @Nullable FileShareResponse backupFileShare,
        @OutputCustomType.Parameter("backupMode") @Nullable String backupMode,
        @OutputCustomType.Parameter("selectedAgentJobs") @Nullable List<String> selectedAgentJobs,
        @OutputCustomType.Parameter("selectedDatabases") List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases,
        @OutputCustomType.Parameter("selectedLogins") @Nullable List<String> selectedLogins,
        @OutputCustomType.Parameter("sourceConnectionInfo") SqlConnectionInfoResponse sourceConnectionInfo,
        @OutputCustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo) {
        this.backupBlobShare = backupBlobShare;
        this.backupFileShare = backupFileShare;
        this.backupMode = backupMode;
        this.selectedAgentJobs = selectedAgentJobs;
        this.selectedDatabases = selectedDatabases;
        this.selectedLogins = selectedLogins;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     * 
    */
    public BlobShareResponse getBackupBlobShare() {
        return this.backupBlobShare;
    }
    /**
     * Backup file share information for all selected databases.
     * 
    */
    public Optional<FileShareResponse> getBackupFileShare() {
        return Optional.ofNullable(this.backupFileShare);
    }
    /**
     * Backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup file paths are required to be provided in selectedDatabases.
     * 
    */
    public Optional<String> getBackupMode() {
        return Optional.ofNullable(this.backupMode);
    }
    /**
     * Agent Jobs to migrate.
     * 
    */
    public List<String> getSelectedAgentJobs() {
        return this.selectedAgentJobs == null ? List.of() : this.selectedAgentJobs;
    }
    /**
     * Databases to migrate
     * 
    */
    public List<MigrateSqlServerSqlMIDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }
    /**
     * Logins to migrate.
     * 
    */
    public List<String> getSelectedLogins() {
        return this.selectedLogins == null ? List.of() : this.selectedLogins;
    }
    /**
     * Information for connecting to source
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Information for connecting to target
     * 
    */
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobShareResponse backupBlobShare;
        private @Nullable FileShareResponse backupFileShare;
        private @Nullable String backupMode;
        private @Nullable List<String> selectedAgentJobs;
        private List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases;
        private @Nullable List<String> selectedLogins;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupBlobShare = defaults.backupBlobShare;
    	      this.backupFileShare = defaults.backupFileShare;
    	      this.backupMode = defaults.backupMode;
    	      this.selectedAgentJobs = defaults.selectedAgentJobs;
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.selectedLogins = defaults.selectedLogins;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setBackupBlobShare(BlobShareResponse backupBlobShare) {
            this.backupBlobShare = Objects.requireNonNull(backupBlobShare);
            return this;
        }

        public Builder setBackupFileShare(@Nullable FileShareResponse backupFileShare) {
            this.backupFileShare = backupFileShare;
            return this;
        }

        public Builder setBackupMode(@Nullable String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        public Builder setSelectedAgentJobs(@Nullable List<String> selectedAgentJobs) {
            this.selectedAgentJobs = selectedAgentJobs;
            return this;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSelectedLogins(@Nullable List<String> selectedLogins) {
            this.selectedLogins = selectedLogins;
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public MigrateSqlServerSqlMITaskInputResponse build() {
            return new MigrateSqlServerSqlMITaskInputResponse(backupBlobShare, backupFileShare, backupMode, selectedAgentJobs, selectedDatabases, selectedLogins, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
