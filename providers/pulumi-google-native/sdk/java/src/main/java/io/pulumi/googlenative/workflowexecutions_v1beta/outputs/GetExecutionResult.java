// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.workflowexecutions_v1beta.outputs.ErrorResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetExecutionResult {
    /**
     * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"}"}'`
     * 
     */
    private final String argument;
    /**
     * The call logging level associated to this execution.
     * 
     */
    private final String callLogLevel;
    /**
     * Marks the end of execution, successful or not.
     * 
     */
    private final String endTime;
    /**
     * The error which caused the execution to finish prematurely. The value is only present if the execution's state is `FAILED` or `CANCELLED`.
     * 
     */
    private final ErrorResponse error;
    /**
     * The resource name of the execution. Format: projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
     * 
     */
    private final String name;
    /**
     * Output of the execution represented as a JSON string. The value can only be present if the execution's state is `SUCCEEDED`.
     * 
     */
    private final String result;
    /**
     * Marks the beginning of execution.
     * 
     */
    private final String startTime;
    /**
     * Current state of the execution.
     * 
     */
    private final String state;
    /**
     * Revision of the workflow this execution is using.
     * 
     */
    private final String workflowRevisionId;

    @OutputCustomType.Constructor({"argument","callLogLevel","endTime","error","name","result","startTime","state","workflowRevisionId"})
    private GetExecutionResult(
        String argument,
        String callLogLevel,
        String endTime,
        ErrorResponse error,
        String name,
        String result,
        String startTime,
        String state,
        String workflowRevisionId) {
        this.argument = Objects.requireNonNull(argument);
        this.callLogLevel = Objects.requireNonNull(callLogLevel);
        this.endTime = Objects.requireNonNull(endTime);
        this.error = Objects.requireNonNull(error);
        this.name = Objects.requireNonNull(name);
        this.result = Objects.requireNonNull(result);
        this.startTime = Objects.requireNonNull(startTime);
        this.state = Objects.requireNonNull(state);
        this.workflowRevisionId = Objects.requireNonNull(workflowRevisionId);
    }

    /**
     * Input parameters of the execution represented as a JSON string. The size limit is 32KB. *Note*: If you are using the REST API directly to run your workflow, you must escape any JSON string value of `argument`. Example: `'{"argument":"{\"firstName\":\"FIRST\",\"lastName\":\"LAST\"}"}'`
     * 
     */
    public String getArgument() {
        return this.argument;
    }
    /**
     * The call logging level associated to this execution.
     * 
     */
    public String getCallLogLevel() {
        return this.callLogLevel;
    }
    /**
     * Marks the end of execution, successful or not.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The error which caused the execution to finish prematurely. The value is only present if the execution's state is `FAILED` or `CANCELLED`.
     * 
     */
    public ErrorResponse getError() {
        return this.error;
    }
    /**
     * The resource name of the execution. Format: projects/{project}/locations/{location}/workflows/{workflow}/executions/{execution}
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Output of the execution represented as a JSON string. The value can only be present if the execution's state is `SUCCEEDED`.
     * 
     */
    public String getResult() {
        return this.result;
    }
    /**
     * Marks the beginning of execution.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Current state of the execution.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Revision of the workflow this execution is using.
     * 
     */
    public String getWorkflowRevisionId() {
        return this.workflowRevisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExecutionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String argument;
        private String callLogLevel;
        private String endTime;
        private ErrorResponse error;
        private String name;
        private String result;
        private String startTime;
        private String state;
        private String workflowRevisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExecutionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argument = defaults.argument;
    	      this.callLogLevel = defaults.callLogLevel;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.name = defaults.name;
    	      this.result = defaults.result;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.workflowRevisionId = defaults.workflowRevisionId;
        }

        public Builder setArgument(String argument) {
            this.argument = Objects.requireNonNull(argument);
            return this;
        }

        public Builder setCallLogLevel(String callLogLevel) {
            this.callLogLevel = Objects.requireNonNull(callLogLevel);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(ErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setWorkflowRevisionId(String workflowRevisionId) {
            this.workflowRevisionId = Objects.requireNonNull(workflowRevisionId);
            return this;
        }

        public GetExecutionResult build() {
            return new GetExecutionResult(argument, callLogLevel, endTime, error, name, result, startTime, state, workflowRevisionId);
        }
    }
}
