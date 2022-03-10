// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetResponseSqlDataPath {
    /**
     * SQL query timeout. Unit in seconds.
     * 
     */
    private final Double queryTimeout;
    /**
     * SQL query
     * 
     */
    private final String sqlQuery;
    /**
     * SQL storedProcedure name
     * 
     */
    private final String sqlStoredProcedureName;
    /**
     * SQL table name
     * 
     */
    private final String sqlTableName;

    @OutputCustomType.Constructor
    private DatasetResponseSqlDataPath(
        @OutputCustomType.Parameter("queryTimeout") Double queryTimeout,
        @OutputCustomType.Parameter("sqlQuery") String sqlQuery,
        @OutputCustomType.Parameter("sqlStoredProcedureName") String sqlStoredProcedureName,
        @OutputCustomType.Parameter("sqlTableName") String sqlTableName) {
        this.queryTimeout = queryTimeout;
        this.sqlQuery = sqlQuery;
        this.sqlStoredProcedureName = sqlStoredProcedureName;
        this.sqlTableName = sqlTableName;
    }

    /**
     * SQL query timeout. Unit in seconds.
     * 
    */
    public Double getQueryTimeout() {
        return this.queryTimeout;
    }
    /**
     * SQL query
     * 
    */
    public String getSqlQuery() {
        return this.sqlQuery;
    }
    /**
     * SQL storedProcedure name
     * 
    */
    public String getSqlStoredProcedureName() {
        return this.sqlStoredProcedureName;
    }
    /**
     * SQL table name
     * 
    */
    public String getSqlTableName() {
        return this.sqlTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponseSqlDataPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double queryTimeout;
        private String sqlQuery;
        private String sqlStoredProcedureName;
        private String sqlTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponseSqlDataPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sqlQuery = defaults.sqlQuery;
    	      this.sqlStoredProcedureName = defaults.sqlStoredProcedureName;
    	      this.sqlTableName = defaults.sqlTableName;
        }

        public Builder setQueryTimeout(Double queryTimeout) {
            this.queryTimeout = Objects.requireNonNull(queryTimeout);
            return this;
        }

        public Builder setSqlQuery(String sqlQuery) {
            this.sqlQuery = Objects.requireNonNull(sqlQuery);
            return this;
        }

        public Builder setSqlStoredProcedureName(String sqlStoredProcedureName) {
            this.sqlStoredProcedureName = Objects.requireNonNull(sqlStoredProcedureName);
            return this;
        }

        public Builder setSqlTableName(String sqlTableName) {
            this.sqlTableName = Objects.requireNonNull(sqlTableName);
            return this;
        }
        public DatasetResponseSqlDataPath build() {
            return new DatasetResponseSqlDataPath(queryTimeout, sqlQuery, sqlStoredProcedureName, sqlTableName);
        }
    }
}
