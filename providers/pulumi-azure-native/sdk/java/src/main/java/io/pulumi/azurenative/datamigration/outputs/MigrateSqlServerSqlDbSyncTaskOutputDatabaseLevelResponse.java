// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse {
    /**
     * Number of applied changes
     * 
     */
    private final Double appliedChanges;
    /**
     * Number of cdc deletes
     * 
     */
    private final Double cdcDeleteCounter;
    /**
     * Number of cdc inserts
     * 
     */
    private final Double cdcInsertCounter;
    /**
     * Number of cdc updates
     * 
     */
    private final Double cdcUpdateCounter;
    /**
     * Name of the database
     * 
     */
    private final String databaseName;
    /**
     * Migration end time
     * 
     */
    private final String endedOn;
    /**
     * Number of tables completed in full load
     * 
     */
    private final Double fullLoadCompletedTables;
    /**
     * Number of tables errored in full load
     * 
     */
    private final Double fullLoadErroredTables;
    /**
     * Number of tables loading in full load
     * 
     */
    private final Double fullLoadLoadingTables;
    /**
     * Number of tables queued in full load
     * 
     */
    private final Double fullLoadQueuedTables;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Number of incoming changes
     * 
     */
    private final Double incomingChanges;
    /**
     * Indicates if initial load (full load) has been completed
     * 
     */
    private final Boolean initializationCompleted;
    /**
     * CDC apply latency
     * 
     */
    private final Double latency;
    /**
     * Migration state that this database is in
     * 
     */
    private final String migrationState;
    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Migration start time
     * 
     */
    private final String startedOn;

    @OutputCustomType.Constructor
    private MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse(
        @OutputCustomType.Parameter("appliedChanges") Double appliedChanges,
        @OutputCustomType.Parameter("cdcDeleteCounter") Double cdcDeleteCounter,
        @OutputCustomType.Parameter("cdcInsertCounter") Double cdcInsertCounter,
        @OutputCustomType.Parameter("cdcUpdateCounter") Double cdcUpdateCounter,
        @OutputCustomType.Parameter("databaseName") String databaseName,
        @OutputCustomType.Parameter("endedOn") String endedOn,
        @OutputCustomType.Parameter("fullLoadCompletedTables") Double fullLoadCompletedTables,
        @OutputCustomType.Parameter("fullLoadErroredTables") Double fullLoadErroredTables,
        @OutputCustomType.Parameter("fullLoadLoadingTables") Double fullLoadLoadingTables,
        @OutputCustomType.Parameter("fullLoadQueuedTables") Double fullLoadQueuedTables,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("incomingChanges") Double incomingChanges,
        @OutputCustomType.Parameter("initializationCompleted") Boolean initializationCompleted,
        @OutputCustomType.Parameter("latency") Double latency,
        @OutputCustomType.Parameter("migrationState") String migrationState,
        @OutputCustomType.Parameter("resultType") String resultType,
        @OutputCustomType.Parameter("startedOn") String startedOn) {
        this.appliedChanges = appliedChanges;
        this.cdcDeleteCounter = cdcDeleteCounter;
        this.cdcInsertCounter = cdcInsertCounter;
        this.cdcUpdateCounter = cdcUpdateCounter;
        this.databaseName = databaseName;
        this.endedOn = endedOn;
        this.fullLoadCompletedTables = fullLoadCompletedTables;
        this.fullLoadErroredTables = fullLoadErroredTables;
        this.fullLoadLoadingTables = fullLoadLoadingTables;
        this.fullLoadQueuedTables = fullLoadQueuedTables;
        this.id = id;
        this.incomingChanges = incomingChanges;
        this.initializationCompleted = initializationCompleted;
        this.latency = latency;
        this.migrationState = migrationState;
        this.resultType = resultType;
        this.startedOn = startedOn;
    }

    /**
     * Number of applied changes
     * 
    */
    public Double getAppliedChanges() {
        return this.appliedChanges;
    }
    /**
     * Number of cdc deletes
     * 
    */
    public Double getCdcDeleteCounter() {
        return this.cdcDeleteCounter;
    }
    /**
     * Number of cdc inserts
     * 
    */
    public Double getCdcInsertCounter() {
        return this.cdcInsertCounter;
    }
    /**
     * Number of cdc updates
     * 
    */
    public Double getCdcUpdateCounter() {
        return this.cdcUpdateCounter;
    }
    /**
     * Name of the database
     * 
    */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * Migration end time
     * 
    */
    public String getEndedOn() {
        return this.endedOn;
    }
    /**
     * Number of tables completed in full load
     * 
    */
    public Double getFullLoadCompletedTables() {
        return this.fullLoadCompletedTables;
    }
    /**
     * Number of tables errored in full load
     * 
    */
    public Double getFullLoadErroredTables() {
        return this.fullLoadErroredTables;
    }
    /**
     * Number of tables loading in full load
     * 
    */
    public Double getFullLoadLoadingTables() {
        return this.fullLoadLoadingTables;
    }
    /**
     * Number of tables queued in full load
     * 
    */
    public Double getFullLoadQueuedTables() {
        return this.fullLoadQueuedTables;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Number of incoming changes
     * 
    */
    public Double getIncomingChanges() {
        return this.incomingChanges;
    }
    /**
     * Indicates if initial load (full load) has been completed
     * 
    */
    public Boolean getInitializationCompleted() {
        return this.initializationCompleted;
    }
    /**
     * CDC apply latency
     * 
    */
    public Double getLatency() {
        return this.latency;
    }
    /**
     * Migration state that this database is in
     * 
    */
    public String getMigrationState() {
        return this.migrationState;
    }
    /**
     * Result type
     * Expected value is 'DatabaseLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Migration start time
     * 
    */
    public String getStartedOn() {
        return this.startedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double appliedChanges;
        private Double cdcDeleteCounter;
        private Double cdcInsertCounter;
        private Double cdcUpdateCounter;
        private String databaseName;
        private String endedOn;
        private Double fullLoadCompletedTables;
        private Double fullLoadErroredTables;
        private Double fullLoadLoadingTables;
        private Double fullLoadQueuedTables;
        private String id;
        private Double incomingChanges;
        private Boolean initializationCompleted;
        private Double latency;
        private String migrationState;
        private String resultType;
        private String startedOn;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appliedChanges = defaults.appliedChanges;
    	      this.cdcDeleteCounter = defaults.cdcDeleteCounter;
    	      this.cdcInsertCounter = defaults.cdcInsertCounter;
    	      this.cdcUpdateCounter = defaults.cdcUpdateCounter;
    	      this.databaseName = defaults.databaseName;
    	      this.endedOn = defaults.endedOn;
    	      this.fullLoadCompletedTables = defaults.fullLoadCompletedTables;
    	      this.fullLoadErroredTables = defaults.fullLoadErroredTables;
    	      this.fullLoadLoadingTables = defaults.fullLoadLoadingTables;
    	      this.fullLoadQueuedTables = defaults.fullLoadQueuedTables;
    	      this.id = defaults.id;
    	      this.incomingChanges = defaults.incomingChanges;
    	      this.initializationCompleted = defaults.initializationCompleted;
    	      this.latency = defaults.latency;
    	      this.migrationState = defaults.migrationState;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
        }

        public Builder setAppliedChanges(Double appliedChanges) {
            this.appliedChanges = Objects.requireNonNull(appliedChanges);
            return this;
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

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setEndedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder setFullLoadCompletedTables(Double fullLoadCompletedTables) {
            this.fullLoadCompletedTables = Objects.requireNonNull(fullLoadCompletedTables);
            return this;
        }

        public Builder setFullLoadErroredTables(Double fullLoadErroredTables) {
            this.fullLoadErroredTables = Objects.requireNonNull(fullLoadErroredTables);
            return this;
        }

        public Builder setFullLoadLoadingTables(Double fullLoadLoadingTables) {
            this.fullLoadLoadingTables = Objects.requireNonNull(fullLoadLoadingTables);
            return this;
        }

        public Builder setFullLoadQueuedTables(Double fullLoadQueuedTables) {
            this.fullLoadQueuedTables = Objects.requireNonNull(fullLoadQueuedTables);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIncomingChanges(Double incomingChanges) {
            this.incomingChanges = Objects.requireNonNull(incomingChanges);
            return this;
        }

        public Builder setInitializationCompleted(Boolean initializationCompleted) {
            this.initializationCompleted = Objects.requireNonNull(initializationCompleted);
            return this;
        }

        public Builder setLatency(Double latency) {
            this.latency = Objects.requireNonNull(latency);
            return this;
        }

        public Builder setMigrationState(String migrationState) {
            this.migrationState = Objects.requireNonNull(migrationState);
            return this;
        }

        public Builder setResultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder setStartedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }
        public MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse build() {
            return new MigrateSqlServerSqlDbSyncTaskOutputDatabaseLevelResponse(appliedChanges, cdcDeleteCounter, cdcInsertCounter, cdcUpdateCounter, databaseName, endedOn, fullLoadCompletedTables, fullLoadErroredTables, fullLoadLoadingTables, fullLoadQueuedTables, id, incomingChanges, initializationCompleted, latency, migrationState, resultType, startedOn);
        }
    }
}
