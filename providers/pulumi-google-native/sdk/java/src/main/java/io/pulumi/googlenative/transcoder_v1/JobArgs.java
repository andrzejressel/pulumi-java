// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.JobConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The configuration for this job.
     * 
     */
    @InputImport(name="config")
    private final @Nullable Input<JobConfigArgs> config;

    public Input<JobConfigArgs> getConfig() {
        return this.config == null ? Input.empty() : this.config;
    }

    /**
     * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. Input files must be at least 5 seconds in duration and stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * 
     */
    @InputImport(name="inputUri")
    private final @Nullable Input<String> inputUri;

    public Input<String> getInputUri() {
        return this.inputUri == null ? Input.empty() : this.inputUri;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The resource name of the job. Format: `projects/{project_number}/locations/{location}/jobs/{job}`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example, `gs://my-bucket/outputs/`.
     * 
     */
    @InputImport(name="outputUri")
    private final @Nullable Input<String> outputUri;

    public Input<String> getOutputUri() {
        return this.outputUri == null ? Input.empty() : this.outputUri;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined JobTemplate: `{job_template_id}`
     * 
     */
    @InputImport(name="templateId")
    private final @Nullable Input<String> templateId;

    public Input<String> getTemplateId() {
        return this.templateId == null ? Input.empty() : this.templateId;
    }

    /**
     * Job time to live value in days, which will be effective after job completion. Job should be deleted automatically after the given TTL. Enter a value between 1 and 90. The default is 30.
     * 
     */
    @InputImport(name="ttlAfterCompletionDays")
    private final @Nullable Input<Integer> ttlAfterCompletionDays;

    public Input<Integer> getTtlAfterCompletionDays() {
        return this.ttlAfterCompletionDays == null ? Input.empty() : this.ttlAfterCompletionDays;
    }

    public JobArgs(
        @Nullable Input<JobConfigArgs> config,
        @Nullable Input<String> inputUri,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> outputUri,
        @Nullable Input<String> project,
        @Nullable Input<String> templateId,
        @Nullable Input<Integer> ttlAfterCompletionDays) {
        this.config = config;
        this.inputUri = inputUri;
        this.location = location;
        this.name = name;
        this.outputUri = outputUri;
        this.project = project;
        this.templateId = templateId;
        this.ttlAfterCompletionDays = ttlAfterCompletionDays;
    }

    private JobArgs() {
        this.config = Input.empty();
        this.inputUri = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.outputUri = Input.empty();
        this.project = Input.empty();
        this.templateId = Input.empty();
        this.ttlAfterCompletionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobConfigArgs> config;
        private @Nullable Input<String> inputUri;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> outputUri;
        private @Nullable Input<String> project;
        private @Nullable Input<String> templateId;
        private @Nullable Input<Integer> ttlAfterCompletionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.inputUri = defaults.inputUri;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outputUri = defaults.outputUri;
    	      this.project = defaults.project;
    	      this.templateId = defaults.templateId;
    	      this.ttlAfterCompletionDays = defaults.ttlAfterCompletionDays;
        }

        public Builder setConfig(@Nullable Input<JobConfigArgs> config) {
            this.config = config;
            return this;
        }

        public Builder setConfig(@Nullable JobConfigArgs config) {
            this.config = Input.ofNullable(config);
            return this;
        }

        public Builder setInputUri(@Nullable Input<String> inputUri) {
            this.inputUri = inputUri;
            return this;
        }

        public Builder setInputUri(@Nullable String inputUri) {
            this.inputUri = Input.ofNullable(inputUri);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOutputUri(@Nullable Input<String> outputUri) {
            this.outputUri = outputUri;
            return this;
        }

        public Builder setOutputUri(@Nullable String outputUri) {
            this.outputUri = Input.ofNullable(outputUri);
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

        public Builder setTemplateId(@Nullable Input<String> templateId) {
            this.templateId = templateId;
            return this;
        }

        public Builder setTemplateId(@Nullable String templateId) {
            this.templateId = Input.ofNullable(templateId);
            return this;
        }

        public Builder setTtlAfterCompletionDays(@Nullable Input<Integer> ttlAfterCompletionDays) {
            this.ttlAfterCompletionDays = ttlAfterCompletionDays;
            return this;
        }

        public Builder setTtlAfterCompletionDays(@Nullable Integer ttlAfterCompletionDays) {
            this.ttlAfterCompletionDays = Input.ofNullable(ttlAfterCompletionDays);
            return this;
        }

        public JobArgs build() {
            return new JobArgs(config, inputUri, location, name, outputUri, project, templateId, ttlAfterCompletionDays);
        }
    }
}
