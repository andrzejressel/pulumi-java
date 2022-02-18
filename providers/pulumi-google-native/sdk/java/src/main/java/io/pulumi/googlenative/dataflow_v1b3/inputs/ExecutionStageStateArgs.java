// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataflow_v1b3.enums.ExecutionStageStateExecutionStageState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A message describing the state of a particular execution stage.
 * 
 */
public final class ExecutionStageStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecutionStageStateArgs Empty = new ExecutionStageStateArgs();

    /**
     * The time at which the stage transitioned to this state.
     * 
     */
    @InputImport(name="currentStateTime")
    private final @Nullable Input<String> currentStateTime;

    public Input<String> getCurrentStateTime() {
        return this.currentStateTime == null ? Input.empty() : this.currentStateTime;
    }

    /**
     * The name of the execution stage.
     * 
     */
    @InputImport(name="executionStageName")
    private final @Nullable Input<String> executionStageName;

    public Input<String> getExecutionStageName() {
        return this.executionStageName == null ? Input.empty() : this.executionStageName;
    }

    /**
     * Executions stage states allow the same set of values as JobState.
     * 
     */
    @InputImport(name="executionStageState")
    private final @Nullable Input<ExecutionStageStateExecutionStageState> executionStageState;

    public Input<ExecutionStageStateExecutionStageState> getExecutionStageState() {
        return this.executionStageState == null ? Input.empty() : this.executionStageState;
    }

    public ExecutionStageStateArgs(
        @Nullable Input<String> currentStateTime,
        @Nullable Input<String> executionStageName,
        @Nullable Input<ExecutionStageStateExecutionStageState> executionStageState) {
        this.currentStateTime = currentStateTime;
        this.executionStageName = executionStageName;
        this.executionStageState = executionStageState;
    }

    private ExecutionStageStateArgs() {
        this.currentStateTime = Input.empty();
        this.executionStageName = Input.empty();
        this.executionStageState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionStageStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currentStateTime;
        private @Nullable Input<String> executionStageName;
        private @Nullable Input<ExecutionStageStateExecutionStageState> executionStageState;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionStageStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentStateTime = defaults.currentStateTime;
    	      this.executionStageName = defaults.executionStageName;
    	      this.executionStageState = defaults.executionStageState;
        }

        public Builder setCurrentStateTime(@Nullable Input<String> currentStateTime) {
            this.currentStateTime = currentStateTime;
            return this;
        }

        public Builder setCurrentStateTime(@Nullable String currentStateTime) {
            this.currentStateTime = Input.ofNullable(currentStateTime);
            return this;
        }

        public Builder setExecutionStageName(@Nullable Input<String> executionStageName) {
            this.executionStageName = executionStageName;
            return this;
        }

        public Builder setExecutionStageName(@Nullable String executionStageName) {
            this.executionStageName = Input.ofNullable(executionStageName);
            return this;
        }

        public Builder setExecutionStageState(@Nullable Input<ExecutionStageStateExecutionStageState> executionStageState) {
            this.executionStageState = executionStageState;
            return this;
        }

        public Builder setExecutionStageState(@Nullable ExecutionStageStateExecutionStageState executionStageState) {
            this.executionStageState = Input.ofNullable(executionStageState);
            return this;
        }

        public ExecutionStageStateArgs build() {
            return new ExecutionStageStateArgs(currentStateTime, executionStageName, executionStageState);
        }
    }
}
