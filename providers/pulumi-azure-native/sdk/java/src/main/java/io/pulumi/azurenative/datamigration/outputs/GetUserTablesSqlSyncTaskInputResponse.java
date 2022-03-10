// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.SqlConnectionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetUserTablesSqlSyncTaskInputResponse {
    /**
     * List of source database names to collect tables for
     * 
     */
    private final List<String> selectedSourceDatabases;
    /**
     * List of target database names to collect tables for
     * 
     */
    private final List<String> selectedTargetDatabases;
    /**
     * Connection information for SQL Server
     * 
     */
    private final SqlConnectionInfoResponse sourceConnectionInfo;
    /**
     * Connection information for SQL DB
     * 
     */
    private final SqlConnectionInfoResponse targetConnectionInfo;

    @OutputCustomType.Constructor
    private GetUserTablesSqlSyncTaskInputResponse(
        @OutputCustomType.Parameter("selectedSourceDatabases") List<String> selectedSourceDatabases,
        @OutputCustomType.Parameter("selectedTargetDatabases") List<String> selectedTargetDatabases,
        @OutputCustomType.Parameter("sourceConnectionInfo") SqlConnectionInfoResponse sourceConnectionInfo,
        @OutputCustomType.Parameter("targetConnectionInfo") SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedSourceDatabases = selectedSourceDatabases;
        this.selectedTargetDatabases = selectedTargetDatabases;
        this.sourceConnectionInfo = sourceConnectionInfo;
        this.targetConnectionInfo = targetConnectionInfo;
    }

    /**
     * List of source database names to collect tables for
     * 
    */
    public List<String> getSelectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }
    /**
     * List of target database names to collect tables for
     * 
    */
    public List<String> getSelectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }
    /**
     * Connection information for SQL Server
     * 
    */
    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }
    /**
     * Connection information for SQL DB
     * 
    */
    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> selectedSourceDatabases;
        private List<String> selectedTargetDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedSourceDatabases = defaults.selectedSourceDatabases;
    	      this.selectedTargetDatabases = defaults.selectedTargetDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedSourceDatabases(List<String> selectedSourceDatabases) {
            this.selectedSourceDatabases = Objects.requireNonNull(selectedSourceDatabases);
            return this;
        }

        public Builder setSelectedTargetDatabases(List<String> selectedTargetDatabases) {
            this.selectedTargetDatabases = Objects.requireNonNull(selectedTargetDatabases);
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
        public GetUserTablesSqlSyncTaskInputResponse build() {
            return new GetUserTablesSqlSyncTaskInputResponse(selectedSourceDatabases, selectedTargetDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
