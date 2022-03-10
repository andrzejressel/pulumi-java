// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.JobStepActionResponse;
import io.pulumi.azurenative.sql.outputs.JobStepExecutionOptionsResponse;
import io.pulumi.azurenative.sql.outputs.JobStepOutputResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobStepResult {
    /**
     * The action payload of the job step.
     * 
     */
    private final JobStepActionResponse action;
    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
     */
    private final String credential;
    /**
     * Execution options for the job step.
     * 
     */
    private final @Nullable JobStepExecutionOptionsResponse executionOptions;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Output destination properties of the job step.
     * 
     */
    private final @Nullable JobStepOutputResponse output;
    /**
     * The job step's index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
     */
    private final @Nullable Integer stepId;
    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
     */
    private final String targetGroup;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetJobStepResult(
        @OutputCustomType.Parameter("action") JobStepActionResponse action,
        @OutputCustomType.Parameter("credential") String credential,
        @OutputCustomType.Parameter("executionOptions") @Nullable JobStepExecutionOptionsResponse executionOptions,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("output") @Nullable JobStepOutputResponse output,
        @OutputCustomType.Parameter("stepId") @Nullable Integer stepId,
        @OutputCustomType.Parameter("targetGroup") String targetGroup,
        @OutputCustomType.Parameter("type") String type) {
        this.action = action;
        this.credential = credential;
        this.executionOptions = executionOptions;
        this.id = id;
        this.name = name;
        this.output = output;
        this.stepId = stepId;
        this.targetGroup = targetGroup;
        this.type = type;
    }

    /**
     * The action payload of the job step.
     * 
    */
    public JobStepActionResponse getAction() {
        return this.action;
    }
    /**
     * The resource ID of the job credential that will be used to connect to the targets.
     * 
    */
    public String getCredential() {
        return this.credential;
    }
    /**
     * Execution options for the job step.
     * 
    */
    public Optional<JobStepExecutionOptionsResponse> getExecutionOptions() {
        return Optional.ofNullable(this.executionOptions);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Output destination properties of the job step.
     * 
    */
    public Optional<JobStepOutputResponse> getOutput() {
        return Optional.ofNullable(this.output);
    }
    /**
     * The job step's index within the job. If not specified when creating the job step, it will be created as the last step. If not specified when updating the job step, the step id is not modified.
     * 
    */
    public Optional<Integer> getStepId() {
        return Optional.ofNullable(this.stepId);
    }
    /**
     * The resource ID of the target group that the job step will be executed on.
     * 
    */
    public String getTargetGroup() {
        return this.targetGroup;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobStepResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStepActionResponse action;
        private String credential;
        private @Nullable JobStepExecutionOptionsResponse executionOptions;
        private String id;
        private String name;
        private @Nullable JobStepOutputResponse output;
        private @Nullable Integer stepId;
        private String targetGroup;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobStepResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.credential = defaults.credential;
    	      this.executionOptions = defaults.executionOptions;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.output = defaults.output;
    	      this.stepId = defaults.stepId;
    	      this.targetGroup = defaults.targetGroup;
    	      this.type = defaults.type;
        }

        public Builder setAction(JobStepActionResponse action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setCredential(String credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setExecutionOptions(@Nullable JobStepExecutionOptionsResponse executionOptions) {
            this.executionOptions = executionOptions;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutput(@Nullable JobStepOutputResponse output) {
            this.output = output;
            return this;
        }

        public Builder setStepId(@Nullable Integer stepId) {
            this.stepId = stepId;
            return this;
        }

        public Builder setTargetGroup(String targetGroup) {
            this.targetGroup = Objects.requireNonNull(targetGroup);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetJobStepResult build() {
            return new GetJobStepResult(action, credential, executionOptions, id, name, output, stepId, targetGroup, type);
        }
    }
}
