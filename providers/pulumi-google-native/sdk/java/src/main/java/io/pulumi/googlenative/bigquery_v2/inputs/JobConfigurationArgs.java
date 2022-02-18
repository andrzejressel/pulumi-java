// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationExtractArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationLoadArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationQueryArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationTableCopyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobConfigurationArgs Empty = new JobConfigurationArgs();

    /**
     * [Pick one] Copies a table.
     * 
     */
    @InputImport(name="copy")
    private final @Nullable Input<JobConfigurationTableCopyArgs> copy;

    public Input<JobConfigurationTableCopyArgs> getCopy() {
        return this.copy == null ? Input.empty() : this.copy;
    }

    /**
     * [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
     * 
     */
    @InputImport(name="dryRun")
    private final @Nullable Input<Boolean> dryRun;

    public Input<Boolean> getDryRun() {
        return this.dryRun == null ? Input.empty() : this.dryRun;
    }

    /**
     * [Pick one] Configures an extract job.
     * 
     */
    @InputImport(name="extract")
    private final @Nullable Input<JobConfigurationExtractArgs> extract;

    public Input<JobConfigurationExtractArgs> getExtract() {
        return this.extract == null ? Input.empty() : this.extract;
    }

    /**
     * [Optional] Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @InputImport(name="jobTimeoutMs")
    private final @Nullable Input<String> jobTimeoutMs;

    public Input<String> getJobTimeoutMs() {
        return this.jobTimeoutMs == null ? Input.empty() : this.jobTimeoutMs;
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * [Pick one] Configures a load job.
     * 
     */
    @InputImport(name="load")
    private final @Nullable Input<JobConfigurationLoadArgs> load;

    public Input<JobConfigurationLoadArgs> getLoad() {
        return this.load == null ? Input.empty() : this.load;
    }

    /**
     * [Pick one] Configures a query job.
     * 
     */
    @InputImport(name="query")
    private final @Nullable Input<JobConfigurationQueryArgs> query;

    public Input<JobConfigurationQueryArgs> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    public JobConfigurationArgs(
        @Nullable Input<JobConfigurationTableCopyArgs> copy,
        @Nullable Input<Boolean> dryRun,
        @Nullable Input<JobConfigurationExtractArgs> extract,
        @Nullable Input<String> jobTimeoutMs,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<JobConfigurationLoadArgs> load,
        @Nullable Input<JobConfigurationQueryArgs> query) {
        this.copy = copy;
        this.dryRun = dryRun;
        this.extract = extract;
        this.jobTimeoutMs = jobTimeoutMs;
        this.labels = labels;
        this.load = load;
        this.query = query;
    }

    private JobConfigurationArgs() {
        this.copy = Input.empty();
        this.dryRun = Input.empty();
        this.extract = Input.empty();
        this.jobTimeoutMs = Input.empty();
        this.labels = Input.empty();
        this.load = Input.empty();
        this.query = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobConfigurationTableCopyArgs> copy;
        private @Nullable Input<Boolean> dryRun;
        private @Nullable Input<JobConfigurationExtractArgs> extract;
        private @Nullable Input<String> jobTimeoutMs;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<JobConfigurationLoadArgs> load;
        private @Nullable Input<JobConfigurationQueryArgs> query;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copy = defaults.copy;
    	      this.dryRun = defaults.dryRun;
    	      this.extract = defaults.extract;
    	      this.jobTimeoutMs = defaults.jobTimeoutMs;
    	      this.labels = defaults.labels;
    	      this.load = defaults.load;
    	      this.query = defaults.query;
        }

        public Builder setCopy(@Nullable Input<JobConfigurationTableCopyArgs> copy) {
            this.copy = copy;
            return this;
        }

        public Builder setCopy(@Nullable JobConfigurationTableCopyArgs copy) {
            this.copy = Input.ofNullable(copy);
            return this;
        }

        public Builder setDryRun(@Nullable Input<Boolean> dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        public Builder setDryRun(@Nullable Boolean dryRun) {
            this.dryRun = Input.ofNullable(dryRun);
            return this;
        }

        public Builder setExtract(@Nullable Input<JobConfigurationExtractArgs> extract) {
            this.extract = extract;
            return this;
        }

        public Builder setExtract(@Nullable JobConfigurationExtractArgs extract) {
            this.extract = Input.ofNullable(extract);
            return this;
        }

        public Builder setJobTimeoutMs(@Nullable Input<String> jobTimeoutMs) {
            this.jobTimeoutMs = jobTimeoutMs;
            return this;
        }

        public Builder setJobTimeoutMs(@Nullable String jobTimeoutMs) {
            this.jobTimeoutMs = Input.ofNullable(jobTimeoutMs);
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

        public Builder setLoad(@Nullable Input<JobConfigurationLoadArgs> load) {
            this.load = load;
            return this;
        }

        public Builder setLoad(@Nullable JobConfigurationLoadArgs load) {
            this.load = Input.ofNullable(load);
            return this;
        }

        public Builder setQuery(@Nullable Input<JobConfigurationQueryArgs> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable JobConfigurationQueryArgs query) {
            this.query = Input.ofNullable(query);
            return this;
        }

        public JobConfigurationArgs build() {
            return new JobConfigurationArgs(copy, dryRun, extract, jobTimeoutMs, labels, load, query);
        }
    }
}
