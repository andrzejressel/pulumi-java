// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Encapsulates the full scoping used to reference a job.
 * 
 */
public final class JobReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobReferenceResponse Empty = new JobReferenceResponse();

    /**
     * Optional. The job ID, which must be unique within the project. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    @InputImport(name="jobId", required=true)
    private final String jobId;

    public String getJobId() {
        return this.jobId;
    }

    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    @InputImport(name="project", required=true)
    private final String project;

    public String getProject() {
        return this.project;
    }

    public JobReferenceResponse(
        String jobId,
        String project) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private JobReferenceResponse() {
        this.jobId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jobId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(JobReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.project = defaults.project;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public JobReferenceResponse build() {
            return new JobReferenceResponse(jobId, project);
        }
    }
}
