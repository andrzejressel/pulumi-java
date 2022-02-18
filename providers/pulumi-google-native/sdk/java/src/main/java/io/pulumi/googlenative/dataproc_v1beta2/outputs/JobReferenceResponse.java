// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobReferenceResponse {
    /**
     * Optional. The job ID, which must be unique within the project. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    private final String jobId;
    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor({"jobId","project"})
    private JobReferenceResponse(
        String jobId,
        String project) {
        this.jobId = Objects.requireNonNull(jobId);
        this.project = Objects.requireNonNull(project);
    }

    /**
     * Optional. The job ID, which must be unique within the project. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    public String getJobId() {
        return this.jobId;
    }
    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    public String getProject() {
        return this.project;
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
