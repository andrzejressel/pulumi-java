// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.toolresults_v1beta3.enums.ExecutionState;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.MatrixDimensionDefinitionArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.OutcomeArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.SpecificationArgs;
import io.pulumi.googlenative.toolresults_v1beta3.inputs.TimestampArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExecutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionArgs Empty = new ExecutionArgs();

    /**
     * The time when the Execution status transitioned to COMPLETE. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. - In create/update request: never set
     * 
     */
    @InputImport(name="completionTime")
    private final @Nullable Input<TimestampArgs> completionTime;

    public Input<TimestampArgs> getCompletionTime() {
        return this.completionTime == null ? Input.empty() : this.completionTime;
    }

    /**
     * The time when the Execution was created. This value will be set automatically when CreateExecution is called. - In response: always set - In create/update request: never set
     * 
     */
    @InputImport(name="creationTime")
    private final @Nullable Input<TimestampArgs> creationTime;

    public Input<TimestampArgs> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * The dimensions along which different steps in this execution may vary. This must remain fixed over the life of the execution. Returns INVALID_ARGUMENT if this field is set in an update request. Returns INVALID_ARGUMENT if the same name occurs in more than one dimension_definition. Returns INVALID_ARGUMENT if the size of the list is over 100. - In response: present if set by create - In create request: optional - In update request: never set
     * 
     */
    @InputImport(name="dimensionDefinitions")
    private final @Nullable Input<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions;

    public Input<List<MatrixDimensionDefinitionArgs>> getDimensionDefinitions() {
        return this.dimensionDefinitions == null ? Input.empty() : this.dimensionDefinitions;
    }

    /**
     * A unique identifier within a History for this Execution. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create/update request: never set
     * 
     */
    @InputImport(name="executionId")
    private final @Nullable Input<String> executionId;

    public Input<String> getExecutionId() {
        return this.executionId == null ? Input.empty() : this.executionId;
    }

    @InputImport(name="historyId", required=true)
    private final Input<String> historyId;

    public Input<String> getHistoryId() {
        return this.historyId;
    }

    /**
     * Classify the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional
     * 
     */
    @InputImport(name="outcome")
    private final @Nullable Input<OutcomeArgs> outcome;

    public Input<OutcomeArgs> getOutcome() {
        return this.outcome == null ? Input.empty() : this.outcome;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Lightweight information about execution request. - In response: present if set by create - In create: optional - In update: optional
     * 
     */
    @InputImport(name="specification")
    private final @Nullable Input<SpecificationArgs> specification;

    public Input<SpecificationArgs> getSpecification() {
        return this.specification == null ? Input.empty() : this.specification;
    }

    /**
     * The initial state is IN_PROGRESS. The only legal state transitions is from IN_PROGRESS to COMPLETE. A PRECONDITION_FAILED will be returned if an invalid transition is requested. The state can only be set to COMPLETE once. A FAILED_PRECONDITION will be returned if the state is set to COMPLETE multiple times. If the state is set to COMPLETE, all the in-progress steps within the execution will be set as COMPLETE. If the outcome of the step is not set, the outcome will be set to INCONCLUSIVE. - In response always set - In create/update request: optional
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<ExecutionState> state;

    public Input<ExecutionState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * TestExecution Matrix ID that the TestExecutionService uses. - In response: present if set by create - In create: optional - In update: never set
     * 
     */
    @InputImport(name="testExecutionMatrixId")
    private final @Nullable Input<String> testExecutionMatrixId;

    public Input<String> getTestExecutionMatrixId() {
        return this.testExecutionMatrixId == null ? Input.empty() : this.testExecutionMatrixId;
    }

    public ExecutionArgs(
        @Nullable Input<TimestampArgs> completionTime,
        @Nullable Input<TimestampArgs> creationTime,
        @Nullable Input<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions,
        @Nullable Input<String> executionId,
        Input<String> historyId,
        @Nullable Input<OutcomeArgs> outcome,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<SpecificationArgs> specification,
        @Nullable Input<ExecutionState> state,
        @Nullable Input<String> testExecutionMatrixId) {
        this.completionTime = completionTime;
        this.creationTime = creationTime;
        this.dimensionDefinitions = dimensionDefinitions;
        this.executionId = executionId;
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.outcome = outcome;
        this.project = project;
        this.requestId = requestId;
        this.specification = specification;
        this.state = state;
        this.testExecutionMatrixId = testExecutionMatrixId;
    }

    private ExecutionArgs() {
        this.completionTime = Input.empty();
        this.creationTime = Input.empty();
        this.dimensionDefinitions = Input.empty();
        this.executionId = Input.empty();
        this.historyId = Input.empty();
        this.outcome = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.specification = Input.empty();
        this.state = Input.empty();
        this.testExecutionMatrixId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TimestampArgs> completionTime;
        private @Nullable Input<TimestampArgs> creationTime;
        private @Nullable Input<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions;
        private @Nullable Input<String> executionId;
        private Input<String> historyId;
        private @Nullable Input<OutcomeArgs> outcome;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<SpecificationArgs> specification;
        private @Nullable Input<ExecutionState> state;
        private @Nullable Input<String> testExecutionMatrixId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.creationTime = defaults.creationTime;
    	      this.dimensionDefinitions = defaults.dimensionDefinitions;
    	      this.executionId = defaults.executionId;
    	      this.historyId = defaults.historyId;
    	      this.outcome = defaults.outcome;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.specification = defaults.specification;
    	      this.state = defaults.state;
    	      this.testExecutionMatrixId = defaults.testExecutionMatrixId;
        }

        public Builder setCompletionTime(@Nullable Input<TimestampArgs> completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setCompletionTime(@Nullable TimestampArgs completionTime) {
            this.completionTime = Input.ofNullable(completionTime);
            return this;
        }

        public Builder setCreationTime(@Nullable Input<TimestampArgs> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreationTime(@Nullable TimestampArgs creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder setDimensionDefinitions(@Nullable Input<List<MatrixDimensionDefinitionArgs>> dimensionDefinitions) {
            this.dimensionDefinitions = dimensionDefinitions;
            return this;
        }

        public Builder setDimensionDefinitions(@Nullable List<MatrixDimensionDefinitionArgs> dimensionDefinitions) {
            this.dimensionDefinitions = Input.ofNullable(dimensionDefinitions);
            return this;
        }

        public Builder setExecutionId(@Nullable Input<String> executionId) {
            this.executionId = executionId;
            return this;
        }

        public Builder setExecutionId(@Nullable String executionId) {
            this.executionId = Input.ofNullable(executionId);
            return this;
        }

        public Builder setHistoryId(Input<String> historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder setHistoryId(String historyId) {
            this.historyId = Input.of(Objects.requireNonNull(historyId));
            return this;
        }

        public Builder setOutcome(@Nullable Input<OutcomeArgs> outcome) {
            this.outcome = outcome;
            return this;
        }

        public Builder setOutcome(@Nullable OutcomeArgs outcome) {
            this.outcome = Input.ofNullable(outcome);
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSpecification(@Nullable Input<SpecificationArgs> specification) {
            this.specification = specification;
            return this;
        }

        public Builder setSpecification(@Nullable SpecificationArgs specification) {
            this.specification = Input.ofNullable(specification);
            return this;
        }

        public Builder setState(@Nullable Input<ExecutionState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ExecutionState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTestExecutionMatrixId(@Nullable Input<String> testExecutionMatrixId) {
            this.testExecutionMatrixId = testExecutionMatrixId;
            return this;
        }

        public Builder setTestExecutionMatrixId(@Nullable String testExecutionMatrixId) {
            this.testExecutionMatrixId = Input.ofNullable(testExecutionMatrixId);
            return this;
        }

        public ExecutionArgs build() {
            return new ExecutionArgs(completionTime, creationTime, dimensionDefinitions, executionId, historyId, outcome, project, requestId, specification, state, testExecutionMatrixId);
        }
    }
}
