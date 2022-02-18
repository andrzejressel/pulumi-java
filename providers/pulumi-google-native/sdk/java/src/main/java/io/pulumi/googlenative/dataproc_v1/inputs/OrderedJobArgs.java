// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.HadoopJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.HiveJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.JobSchedulingArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PigJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PrestoJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.PySparkJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkRJobArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.SparkSqlJobArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A job executed by the workflow.
 * 
 */
public final class OrderedJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrderedJobArgs Empty = new OrderedJobArgs();

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @InputImport(name="hadoopJob")
    private final @Nullable Input<HadoopJobArgs> hadoopJob;

    public Input<HadoopJobArgs> getHadoopJob() {
        return this.hadoopJob == null ? Input.empty() : this.hadoopJob;
    }

    /**
     * Optional. Job is a Hive job.
     * 
     */
    @InputImport(name="hiveJob")
    private final @Nullable Input<HiveJobArgs> hiveJob;

    public Input<HiveJobArgs> getHiveJob() {
        return this.hiveJob == null ? Input.empty() : this.hiveJob;
    }

    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Optional. Job is a Pig job.
     * 
     */
    @InputImport(name="pigJob")
    private final @Nullable Input<PigJobArgs> pigJob;

    public Input<PigJobArgs> getPigJob() {
        return this.pigJob == null ? Input.empty() : this.pigJob;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    @InputImport(name="prerequisiteStepIds")
    private final @Nullable Input<List<String>> prerequisiteStepIds;

    public Input<List<String>> getPrerequisiteStepIds() {
        return this.prerequisiteStepIds == null ? Input.empty() : this.prerequisiteStepIds;
    }

    /**
     * Optional. Job is a Presto job.
     * 
     */
    @InputImport(name="prestoJob")
    private final @Nullable Input<PrestoJobArgs> prestoJob;

    public Input<PrestoJobArgs> getPrestoJob() {
        return this.prestoJob == null ? Input.empty() : this.prestoJob;
    }

    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @InputImport(name="pysparkJob")
    private final @Nullable Input<PySparkJobArgs> pysparkJob;

    public Input<PySparkJobArgs> getPysparkJob() {
        return this.pysparkJob == null ? Input.empty() : this.pysparkJob;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @InputImport(name="scheduling")
    private final @Nullable Input<JobSchedulingArgs> scheduling;

    public Input<JobSchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * Optional. Job is a Spark job.
     * 
     */
    @InputImport(name="sparkJob")
    private final @Nullable Input<SparkJobArgs> sparkJob;

    public Input<SparkJobArgs> getSparkJob() {
        return this.sparkJob == null ? Input.empty() : this.sparkJob;
    }

    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @InputImport(name="sparkRJob")
    private final @Nullable Input<SparkRJobArgs> sparkRJob;

    public Input<SparkRJobArgs> getSparkRJob() {
        return this.sparkRJob == null ? Input.empty() : this.sparkRJob;
    }

    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @InputImport(name="sparkSqlJob")
    private final @Nullable Input<SparkSqlJobArgs> sparkSqlJob;

    public Input<SparkSqlJobArgs> getSparkSqlJob() {
        return this.sparkSqlJob == null ? Input.empty() : this.sparkSqlJob;
    }

    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    @InputImport(name="stepId", required=true)
    private final Input<String> stepId;

    public Input<String> getStepId() {
        return this.stepId;
    }

    public OrderedJobArgs(
        @Nullable Input<HadoopJobArgs> hadoopJob,
        @Nullable Input<HiveJobArgs> hiveJob,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<PigJobArgs> pigJob,
        @Nullable Input<List<String>> prerequisiteStepIds,
        @Nullable Input<PrestoJobArgs> prestoJob,
        @Nullable Input<PySparkJobArgs> pysparkJob,
        @Nullable Input<JobSchedulingArgs> scheduling,
        @Nullable Input<SparkJobArgs> sparkJob,
        @Nullable Input<SparkRJobArgs> sparkRJob,
        @Nullable Input<SparkSqlJobArgs> sparkSqlJob,
        Input<String> stepId) {
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.labels = labels;
        this.pigJob = pigJob;
        this.prerequisiteStepIds = prerequisiteStepIds;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private OrderedJobArgs() {
        this.hadoopJob = Input.empty();
        this.hiveJob = Input.empty();
        this.labels = Input.empty();
        this.pigJob = Input.empty();
        this.prerequisiteStepIds = Input.empty();
        this.prestoJob = Input.empty();
        this.pysparkJob = Input.empty();
        this.scheduling = Input.empty();
        this.sparkJob = Input.empty();
        this.sparkRJob = Input.empty();
        this.sparkSqlJob = Input.empty();
        this.stepId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderedJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HadoopJobArgs> hadoopJob;
        private @Nullable Input<HiveJobArgs> hiveJob;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<PigJobArgs> pigJob;
        private @Nullable Input<List<String>> prerequisiteStepIds;
        private @Nullable Input<PrestoJobArgs> prestoJob;
        private @Nullable Input<PySparkJobArgs> pysparkJob;
        private @Nullable Input<JobSchedulingArgs> scheduling;
        private @Nullable Input<SparkJobArgs> sparkJob;
        private @Nullable Input<SparkRJobArgs> sparkRJob;
        private @Nullable Input<SparkSqlJobArgs> sparkSqlJob;
        private Input<String> stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderedJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder setHadoopJob(@Nullable Input<HadoopJobArgs> hadoopJob) {
            this.hadoopJob = hadoopJob;
            return this;
        }

        public Builder setHadoopJob(@Nullable HadoopJobArgs hadoopJob) {
            this.hadoopJob = Input.ofNullable(hadoopJob);
            return this;
        }

        public Builder setHiveJob(@Nullable Input<HiveJobArgs> hiveJob) {
            this.hiveJob = hiveJob;
            return this;
        }

        public Builder setHiveJob(@Nullable HiveJobArgs hiveJob) {
            this.hiveJob = Input.ofNullable(hiveJob);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setPigJob(@Nullable Input<PigJobArgs> pigJob) {
            this.pigJob = pigJob;
            return this;
        }

        public Builder setPigJob(@Nullable PigJobArgs pigJob) {
            this.pigJob = Input.ofNullable(pigJob);
            return this;
        }

        public Builder setPrerequisiteStepIds(@Nullable Input<List<String>> prerequisiteStepIds) {
            this.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }

        public Builder setPrerequisiteStepIds(@Nullable List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = Input.ofNullable(prerequisiteStepIds);
            return this;
        }

        public Builder setPrestoJob(@Nullable Input<PrestoJobArgs> prestoJob) {
            this.prestoJob = prestoJob;
            return this;
        }

        public Builder setPrestoJob(@Nullable PrestoJobArgs prestoJob) {
            this.prestoJob = Input.ofNullable(prestoJob);
            return this;
        }

        public Builder setPysparkJob(@Nullable Input<PySparkJobArgs> pysparkJob) {
            this.pysparkJob = pysparkJob;
            return this;
        }

        public Builder setPysparkJob(@Nullable PySparkJobArgs pysparkJob) {
            this.pysparkJob = Input.ofNullable(pysparkJob);
            return this;
        }

        public Builder setScheduling(@Nullable Input<JobSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable JobSchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder setSparkJob(@Nullable Input<SparkJobArgs> sparkJob) {
            this.sparkJob = sparkJob;
            return this;
        }

        public Builder setSparkJob(@Nullable SparkJobArgs sparkJob) {
            this.sparkJob = Input.ofNullable(sparkJob);
            return this;
        }

        public Builder setSparkRJob(@Nullable Input<SparkRJobArgs> sparkRJob) {
            this.sparkRJob = sparkRJob;
            return this;
        }

        public Builder setSparkRJob(@Nullable SparkRJobArgs sparkRJob) {
            this.sparkRJob = Input.ofNullable(sparkRJob);
            return this;
        }

        public Builder setSparkSqlJob(@Nullable Input<SparkSqlJobArgs> sparkSqlJob) {
            this.sparkSqlJob = sparkSqlJob;
            return this;
        }

        public Builder setSparkSqlJob(@Nullable SparkSqlJobArgs sparkSqlJob) {
            this.sparkSqlJob = Input.ofNullable(sparkSqlJob);
            return this;
        }

        public Builder setStepId(Input<String> stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Input.of(Objects.requireNonNull(stepId));
            return this;
        }

        public OrderedJobArgs build() {
            return new OrderedJobArgs(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
