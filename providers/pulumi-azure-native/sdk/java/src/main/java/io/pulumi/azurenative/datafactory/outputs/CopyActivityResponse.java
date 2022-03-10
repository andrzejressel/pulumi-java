// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonMWSSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForOracleSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForSqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRedshiftSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AvroSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AvroSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMySqlSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMySqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureQueueSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSearchIndexSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureTableSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureTableSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.BinarySinkResponse;
import io.pulumi.azurenative.datafactory.outputs.BinarySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.BlobSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.BlobSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CassandraSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ConcurSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbSqlApiSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbSqlApiSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.CouchbaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.Db2SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DelimitedTextSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DelimitedTextSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DocumentDbCollectionSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DocumentDbCollectionSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DrillSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsAXSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsCrmSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsCrmSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.EloquaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ExcelSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.FileSystemSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.FileSystemSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleAdWordsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleBigQuerySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.GreenplumSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HBaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HiveSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.HubspotSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ImpalaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.InformixSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.InformixSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.JiraSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LogSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.LogStorageSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.MagentoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MariaDBSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MarketoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MicrosoftAccessSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.MicrosoftAccessSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbAtlasSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbAtlasSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbV2SinkResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbV2SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.MySqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.NetezzaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ODataSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OdbcSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.OdbcSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.Office365SourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PaypalSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PhoenixSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PostgreSqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.PrestoSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.QuickBooksSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.RedirectIncompatibleRowSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.RelationalSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ResponsysSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.RestSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.RestSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceMarketingCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapBwSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapEccSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapHanaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapOpenHubSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SapTableSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ServiceNowSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SharePointOnlineListSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ShopifySourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SkipErrorFileResponse;
import io.pulumi.azurenative.datafactory.outputs.SnowflakeSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SnowflakeSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SparkSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlDWSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlDWSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlMISinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlMISourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.SquareSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.StagingSettingsResponse;
import io.pulumi.azurenative.datafactory.outputs.SybaseSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TabularSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TeradataSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.outputs.VerticaSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.WebSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.XeroSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.XmlSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.ZohoSourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CopyActivityResponse {
    /**
     * Maximum number of data integration units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object dataIntegrationUnits;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableSkipIncompatibleRow;
    /**
     * Specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object enableStaging;
    /**
     * List of inputs for the activity.
     * 
     */
    private final @Nullable List<DatasetReferenceResponse> inputs;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Log settings customer needs provide when enabling log.
     * 
     */
    private final @Nullable LogSettingsResponse logSettings;
    /**
     * (Deprecated. Please use LogSettings) Log storage settings customer need to provide when enabling session log.
     * 
     */
    private final @Nullable LogStorageSettingsResponse logStorageSettings;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * List of outputs for the activity.
     * 
     */
    private final @Nullable List<DatasetReferenceResponse> outputs;
    /**
     * Maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object parallelCopies;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Preserve rules.
     * 
     */
    private final @Nullable List<Object> preserve;
    /**
     * Preserve Rules.
     * 
     */
    private final @Nullable List<Object> preserveRules;
    /**
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     * 
     */
    private final @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings;
    /**
     * Copy activity sink.
     * 
     */
    private final Object sink;
    /**
     * Specify the fault tolerance for data consistency.
     * 
     */
    private final @Nullable SkipErrorFileResponse skipErrorFile;
    /**
     * Copy activity source.
     * 
     */
    private final Object source;
    /**
     * Specifies interim staging settings when EnableStaging is true.
     * 
     */
    private final @Nullable StagingSettingsResponse stagingSettings;
    /**
     * Copy activity translator. If not specified, tabular translator is used.
     * 
     */
    private final @Nullable Object translator;
    /**
     * Type of activity.
     * Expected value is 'Copy'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Whether to enable Data Consistency validation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object validateDataConsistency;

    @OutputCustomType.Constructor
    private CopyActivityResponse(
        @OutputCustomType.Parameter("dataIntegrationUnits") @Nullable Object dataIntegrationUnits,
        @OutputCustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("enableSkipIncompatibleRow") @Nullable Object enableSkipIncompatibleRow,
        @OutputCustomType.Parameter("enableStaging") @Nullable Object enableStaging,
        @OutputCustomType.Parameter("inputs") @Nullable List<DatasetReferenceResponse> inputs,
        @OutputCustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @OutputCustomType.Parameter("logSettings") @Nullable LogSettingsResponse logSettings,
        @OutputCustomType.Parameter("logStorageSettings") @Nullable LogStorageSettingsResponse logStorageSettings,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("outputs") @Nullable List<DatasetReferenceResponse> outputs,
        @OutputCustomType.Parameter("parallelCopies") @Nullable Object parallelCopies,
        @OutputCustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @OutputCustomType.Parameter("preserve") @Nullable List<Object> preserve,
        @OutputCustomType.Parameter("preserveRules") @Nullable List<Object> preserveRules,
        @OutputCustomType.Parameter("redirectIncompatibleRowSettings") @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings,
        @OutputCustomType.Parameter("sink") Object sink,
        @OutputCustomType.Parameter("skipErrorFile") @Nullable SkipErrorFileResponse skipErrorFile,
        @OutputCustomType.Parameter("source") Object source,
        @OutputCustomType.Parameter("stagingSettings") @Nullable StagingSettingsResponse stagingSettings,
        @OutputCustomType.Parameter("translator") @Nullable Object translator,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @OutputCustomType.Parameter("validateDataConsistency") @Nullable Object validateDataConsistency) {
        this.dataIntegrationUnits = dataIntegrationUnits;
        this.dependsOn = dependsOn;
        this.description = description;
        this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
        this.enableStaging = enableStaging;
        this.inputs = inputs;
        this.linkedServiceName = linkedServiceName;
        this.logSettings = logSettings;
        this.logStorageSettings = logStorageSettings;
        this.name = name;
        this.outputs = outputs;
        this.parallelCopies = parallelCopies;
        this.policy = policy;
        this.preserve = preserve;
        this.preserveRules = preserveRules;
        this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
        this.sink = sink;
        this.skipErrorFile = skipErrorFile;
        this.source = source;
        this.stagingSettings = stagingSettings;
        this.translator = translator;
        this.type = type;
        this.userProperties = userProperties;
        this.validateDataConsistency = validateDataConsistency;
    }

    /**
     * Maximum number of data integration units that can be used to perform this data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getDataIntegrationUnits() {
        return Optional.ofNullable(this.dataIntegrationUnits);
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Whether to skip incompatible row. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableSkipIncompatibleRow() {
        return Optional.ofNullable(this.enableSkipIncompatibleRow);
    }
    /**
     * Specifies whether to copy data via an interim staging. Default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getEnableStaging() {
        return Optional.ofNullable(this.enableStaging);
    }
    /**
     * List of inputs for the activity.
     * 
    */
    public List<DatasetReferenceResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Log settings customer needs provide when enabling log.
     * 
    */
    public Optional<LogSettingsResponse> getLogSettings() {
        return Optional.ofNullable(this.logSettings);
    }
    /**
     * (Deprecated. Please use LogSettings) Log storage settings customer need to provide when enabling session log.
     * 
    */
    public Optional<LogStorageSettingsResponse> getLogStorageSettings() {
        return Optional.ofNullable(this.logStorageSettings);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of outputs for the activity.
     * 
    */
    public List<DatasetReferenceResponse> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * Maximum number of concurrent sessions opened on the source or sink to avoid overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
    */
    public Optional<Object> getParallelCopies() {
        return Optional.ofNullable(this.parallelCopies);
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Preserve rules.
     * 
    */
    public List<Object> getPreserve() {
        return this.preserve == null ? List.of() : this.preserve;
    }
    /**
     * Preserve Rules.
     * 
    */
    public List<Object> getPreserveRules() {
        return this.preserveRules == null ? List.of() : this.preserveRules;
    }
    /**
     * Redirect incompatible row settings when EnableSkipIncompatibleRow is true.
     * 
    */
    public Optional<RedirectIncompatibleRowSettingsResponse> getRedirectIncompatibleRowSettings() {
        return Optional.ofNullable(this.redirectIncompatibleRowSettings);
    }
    /**
     * Copy activity sink.
     * 
    */
    public Object getSink() {
        return this.sink;
    }
    /**
     * Specify the fault tolerance for data consistency.
     * 
    */
    public Optional<SkipErrorFileResponse> getSkipErrorFile() {
        return Optional.ofNullable(this.skipErrorFile);
    }
    /**
     * Copy activity source.
     * 
    */
    public Object getSource() {
        return this.source;
    }
    /**
     * Specifies interim staging settings when EnableStaging is true.
     * 
    */
    public Optional<StagingSettingsResponse> getStagingSettings() {
        return Optional.ofNullable(this.stagingSettings);
    }
    /**
     * Copy activity translator. If not specified, tabular translator is used.
     * 
    */
    public Optional<Object> getTranslator() {
        return Optional.ofNullable(this.translator);
    }
    /**
     * Type of activity.
     * Expected value is 'Copy'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * Whether to enable Data Consistency validation. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getValidateDataConsistency() {
        return Optional.ofNullable(this.validateDataConsistency);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object dataIntegrationUnits;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object enableSkipIncompatibleRow;
        private @Nullable Object enableStaging;
        private @Nullable List<DatasetReferenceResponse> inputs;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable LogSettingsResponse logSettings;
        private @Nullable LogStorageSettingsResponse logStorageSettings;
        private String name;
        private @Nullable List<DatasetReferenceResponse> outputs;
        private @Nullable Object parallelCopies;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<Object> preserve;
        private @Nullable List<Object> preserveRules;
        private @Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings;
        private Object sink;
        private @Nullable SkipErrorFileResponse skipErrorFile;
        private Object source;
        private @Nullable StagingSettingsResponse stagingSettings;
        private @Nullable Object translator;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object validateDataConsistency;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataIntegrationUnits = defaults.dataIntegrationUnits;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.enableSkipIncompatibleRow = defaults.enableSkipIncompatibleRow;
    	      this.enableStaging = defaults.enableStaging;
    	      this.inputs = defaults.inputs;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logSettings = defaults.logSettings;
    	      this.logStorageSettings = defaults.logStorageSettings;
    	      this.name = defaults.name;
    	      this.outputs = defaults.outputs;
    	      this.parallelCopies = defaults.parallelCopies;
    	      this.policy = defaults.policy;
    	      this.preserve = defaults.preserve;
    	      this.preserveRules = defaults.preserveRules;
    	      this.redirectIncompatibleRowSettings = defaults.redirectIncompatibleRowSettings;
    	      this.sink = defaults.sink;
    	      this.skipErrorFile = defaults.skipErrorFile;
    	      this.source = defaults.source;
    	      this.stagingSettings = defaults.stagingSettings;
    	      this.translator = defaults.translator;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.validateDataConsistency = defaults.validateDataConsistency;
        }

        public Builder setDataIntegrationUnits(@Nullable Object dataIntegrationUnits) {
            this.dataIntegrationUnits = dataIntegrationUnits;
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnableSkipIncompatibleRow(@Nullable Object enableSkipIncompatibleRow) {
            this.enableSkipIncompatibleRow = enableSkipIncompatibleRow;
            return this;
        }

        public Builder setEnableStaging(@Nullable Object enableStaging) {
            this.enableStaging = enableStaging;
            return this;
        }

        public Builder setInputs(@Nullable List<DatasetReferenceResponse> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLogSettings(@Nullable LogSettingsResponse logSettings) {
            this.logSettings = logSettings;
            return this;
        }

        public Builder setLogStorageSettings(@Nullable LogStorageSettingsResponse logStorageSettings) {
            this.logStorageSettings = logStorageSettings;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputs(@Nullable List<DatasetReferenceResponse> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setParallelCopies(@Nullable Object parallelCopies) {
            this.parallelCopies = parallelCopies;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPreserve(@Nullable List<Object> preserve) {
            this.preserve = preserve;
            return this;
        }

        public Builder setPreserveRules(@Nullable List<Object> preserveRules) {
            this.preserveRules = preserveRules;
            return this;
        }

        public Builder setRedirectIncompatibleRowSettings(@Nullable RedirectIncompatibleRowSettingsResponse redirectIncompatibleRowSettings) {
            this.redirectIncompatibleRowSettings = redirectIncompatibleRowSettings;
            return this;
        }

        public Builder setSink(Object sink) {
            this.sink = Objects.requireNonNull(sink);
            return this;
        }

        public Builder setSkipErrorFile(@Nullable SkipErrorFileResponse skipErrorFile) {
            this.skipErrorFile = skipErrorFile;
            return this;
        }

        public Builder setSource(Object source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setStagingSettings(@Nullable StagingSettingsResponse stagingSettings) {
            this.stagingSettings = stagingSettings;
            return this;
        }

        public Builder setTranslator(@Nullable Object translator) {
            this.translator = translator;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public Builder setValidateDataConsistency(@Nullable Object validateDataConsistency) {
            this.validateDataConsistency = validateDataConsistency;
            return this;
        }
        public CopyActivityResponse build() {
            return new CopyActivityResponse(dataIntegrationUnits, dependsOn, description, enableSkipIncompatibleRow, enableStaging, inputs, linkedServiceName, logSettings, logStorageSettings, name, outputs, parallelCopies, policy, preserve, preserveRules, redirectIncompatibleRowSettings, sink, skipErrorFile, source, stagingSettings, translator, type, userProperties, validateDataConsistency);
        }
    }
}
