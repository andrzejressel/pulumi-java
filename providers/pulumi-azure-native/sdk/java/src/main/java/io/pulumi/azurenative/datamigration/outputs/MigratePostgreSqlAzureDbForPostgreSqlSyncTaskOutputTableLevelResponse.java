// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse {
    /**
     * Number of applied deletes
     * 
     */
    private final Double cdcDeleteCounter;
    /**
     * Number of applied inserts
     * 
     */
    private final Double cdcInsertCounter;
    /**
     * Number of applied updates
     * 
     */
    private final Double cdcUpdateCounter;
    /**
     * Number of data errors occurred
     * 
     */
    private final Double dataErrorsCounter;
    /**
     * Name of the database
     * 
     */
    private final String databaseName;
    /**
     * Full load end time
     * 
     */
    private final String fullLoadEndedOn;
    /**
     * Estimate to finish full load
     * 
     */
    private final String fullLoadEstFinishTime;
    /**
     * Full load start time
     * 
     */
    private final String fullLoadStartedOn;
    /**
     * Number of rows applied in full load
     * 
     */
    private final Double fullLoadTotalRows;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Last modified time on target
     * 
     */
    private final String lastModifiedTime;
    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Current state of the table migration
     * 
     */
    private final String state;
    /**
     * Name of the table
     * 
     */
    private final String tableName;
    /**
     * Total number of applied changes
     * 
     */
    private final Double totalChangesApplied;

    @OutputCustomType.Constructor
    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse(
        @OutputCustomType.Parameter("cdcDeleteCounter") Double cdcDeleteCounter,
        @OutputCustomType.Parameter("cdcInsertCounter") Double cdcInsertCounter,
        @OutputCustomType.Parameter("cdcUpdateCounter") Double cdcUpdateCounter,
        @OutputCustomType.Parameter("dataErrorsCounter") Double dataErrorsCounter,
        @OutputCustomType.Parameter("databaseName") String databaseName,
        @OutputCustomType.Parameter("fullLoadEndedOn") String fullLoadEndedOn,
        @OutputCustomType.Parameter("fullLoadEstFinishTime") String fullLoadEstFinishTime,
        @OutputCustomType.Parameter("fullLoadStartedOn") String fullLoadStartedOn,
        @OutputCustomType.Parameter("fullLoadTotalRows") Double fullLoadTotalRows,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @OutputCustomType.Parameter("resultType") String resultType,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("tableName") String tableName,
        @OutputCustomType.Parameter("totalChangesApplied") Double totalChangesApplied) {
        this.cdcDeleteCounter = cdcDeleteCounter;
        this.cdcInsertCounter = cdcInsertCounter;
        this.cdcUpdateCounter = cdcUpdateCounter;
        this.dataErrorsCounter = dataErrorsCounter;
        this.databaseName = databaseName;
        this.fullLoadEndedOn = fullLoadEndedOn;
        this.fullLoadEstFinishTime = fullLoadEstFinishTime;
        this.fullLoadStartedOn = fullLoadStartedOn;
        this.fullLoadTotalRows = fullLoadTotalRows;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.resultType = resultType;
        this.state = state;
        this.tableName = tableName;
        this.totalChangesApplied = totalChangesApplied;
    }

    /**
     * Number of applied deletes
     * 
    */
    public Double getCdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }
    /**
     * Number of applied inserts
     * 
    */
    public Double getCdcInsertCounter() {
        return this.cdcInsertCounter;
    }
    /**
     * Number of applied updates
     * 
    */
    public Double getCdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }
    /**
     * Number of data errors occurred
     * 
    */
    public Double getDataErrorsCounter() {
        return this.dataErrorsCounter;
    }
    /**
     * Name of the database
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Full load end time
     * 
    */
    public String getFullLoadEndedOn() {
        return this.fullLoadEndedOn;
    }
    /**
     * Estimate to finish full load
     * 
    */
    public String getFullLoadEstFinishTime() {
        return this.fullLoadEstFinishTime;
    }
    /**
     * Full load start time
     * 
    */
    public String getFullLoadStartedOn() {
        return this.fullLoadStartedOn;
    }
    /**
     * Number of rows applied in full load
     * 
    */
    public Double getFullLoadTotalRows() {
        return this.fullLoadTotalRows;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Last modified time on target
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Result type
     * Expected value is 'TableLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Current state of the table migration
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Name of the table
     * 
    */
    public String getTableName() {
        return this.tableName;
    }
    /**
     * Total number of applied changes
     * 
    */
    public Double getTotalChangesApplied() {
        return this.totalChangesApplied;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private Double dataErrorsCounter;
        private String databaseName;
        private String fullLoadEndedOn;
        private String fullLoadEstFinishTime;
        private String fullLoadStartedOn;
        private Double fullLoadTotalRows;
        private String id;
        private String lastModifiedTime;
        private String resultType;
        private String state;
        private String tableName;
        private Double totalChangesApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.dataErrorsCounter = defaults.dataErrorsCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.fullLoadEndedOn = defaults.fullLoadEndedOn;
    	      this.fullLoadEstFinishTime = defaults.fullLoadEstFinishTime;
    	      this.fullLoadStartedOn = defaults.fullLoadStartedOn;
    	      this.fullLoadTotalRows = defaults.fullLoadTotalRows;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.resultType = defaults.resultType;
    	      this.state = defaults.state;
    	      this.tableName = defaults.tableName;
    	      this.totalChangesApplied = defaults.totalChangesApplied;
        }

        public Builder setCdcDeleteCounter(Double cdcDeleteCounter) {
            this.cdcDeleteCounter = Objects.requireNonNull(cdcDeleteCounter);
            return this;
        }

        public Builder setCdcInsertCounter(Double cdcInsertCounter) {
            this.cdcInsertCounter = Objects.requireNonNull(cdcInsertCounter);
            return this;
        }

        public Builder setCdcUpdateCounter(Double cdcUpdateCounter) {
            this.cdcUpdateCounter = Objects.requireNonNull(cdcUpdateCounter);
            return this;
        }

        public Builder setDataErrorsCounter(Double dataErrorsCounter) {
            this.dataErrorsCounter = Objects.requireNonNull(dataErrorsCounter);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setFullLoadEndedOn(String fullLoadEndedOn) {
            this.fullLoadEndedOn = Objects.requireNonNull(fullLoadEndedOn);
            return this;
        }

        public Builder setFullLoadEstFinishTime(String fullLoadEstFinishTime) {
            this.fullLoadEstFinishTime = Objects.requireNonNull(fullLoadEstFinishTime);
            return this;
        }

        public Builder setFullLoadStartedOn(String fullLoadStartedOn) {
            this.fullLoadStartedOn = Objects.requireNonNull(fullLoadStartedOn);
            return this;
        }

        public Builder setFullLoadTotalRows(Double fullLoadTotalRows) {
            this.fullLoadTotalRows = Objects.requireNonNull(fullLoadTotalRows);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder setTotalChangesApplied(Double totalChangesApplied) {
            this.totalChangesApplied = Objects.requireNonNull(totalChangesApplied);
            return this;
        }
        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse build() {
            return new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskOutputTableLevelResponse(cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, dataErrorsCounter, databaseName, fullLoadEndedOn, fullLoadEstFinishTime, fullLoadStartedOn, fullLoadTotalRows, id, lastModifiedTime, resultType, state, tableName, totalChangesApplied);
        }
    }
}
