// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPigJobLoggingConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPigJobQueryList;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplateJobPigJob {
    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    private final @Nullable Boolean continueOnFailure;
    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final @Nullable WorkflowTemplateJobPigJobLoggingConfig loggingConfig;
    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    private final @Nullable String queryFileUri;
    /**
     * A list of queries.
     * 
     */
    private final @Nullable WorkflowTemplateJobPigJobQueryList queryList;
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name="value";`).
     * 
     */
    private final @Nullable Map<String,String> scriptVariables;

    @OutputCustomType.Constructor({"continueOnFailure","jarFileUris","loggingConfig","properties","queryFileUri","queryList","scriptVariables"})
    private WorkflowTemplateJobPigJob(
        @Nullable Boolean continueOnFailure,
        @Nullable List<String> jarFileUris,
        @Nullable WorkflowTemplateJobPigJobLoggingConfig loggingConfig,
        @Nullable Map<String,String> properties,
        @Nullable String queryFileUri,
        @Nullable WorkflowTemplateJobPigJobQueryList queryList,
        @Nullable Map<String,String> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    public Optional<Boolean> getContinueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }
    /**
     * Optional. HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    public List<String> getJarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    public Optional<WorkflowTemplateJobPigJobLoggingConfig> getLoggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    public Optional<String> getQueryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * A list of queries.
     * 
     */
    public Optional<WorkflowTemplateJobPigJobQueryList> getQueryList() {
        return Optional.ofNullable(this.queryList);
    }
    /**
     * Optional. Mapping of query variable names to values (equivalent to the Spark SQL command: SET `name="value";`).
     * 
     */
    public Map<String,String> getScriptVariables() {
        return this.scriptVariables == null ? Map.of() : this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPigJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean continueOnFailure;
        private @Nullable List<String> jarFileUris;
        private @Nullable WorkflowTemplateJobPigJobLoggingConfig loggingConfig;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable WorkflowTemplateJobPigJobQueryList queryList;
        private @Nullable Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPigJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setLoggingConfig(@Nullable WorkflowTemplateJobPigJobLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryList(@Nullable WorkflowTemplateJobPigJobQueryList queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder setScriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }

        public WorkflowTemplateJobPigJob build() {
            return new WorkflowTemplateJobPigJob(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}
