// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceAttemptResultArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instance represents the status of an instance of a Job.
 * 
 */
public final class InstanceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceStatusArgs Empty = new InstanceStatusArgs();

    /**
     * Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @InputImport(name="completionTime")
    private final @Nullable Input<String> completionTime;

    public Input<String> getCompletionTime() {
        return this.completionTime == null ? Input.empty() : this.completionTime;
    }

    /**
     * Optional. The number of times this instance exited with code > 0; +optional
     * 
     */
    @InputImport(name="failed")
    private final @Nullable Input<Integer> failed;

    public Input<Integer> getFailed() {
        return this.failed == null ? Input.empty() : this.failed;
    }

    /**
     * Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    @InputImport(name="index", required=true)
    private final Input<Integer> index;

    public Input<Integer> getIndex() {
        return this.index;
    }

    /**
     * Optional. Result of the last attempt of this instance. +optional
     * 
     */
    @InputImport(name="lastAttemptResult")
    private final @Nullable Input<InstanceAttemptResultArgs> lastAttemptResult;

    public Input<InstanceAttemptResultArgs> getLastAttemptResult() {
        return this.lastAttemptResult == null ? Input.empty() : this.lastAttemptResult;
    }

    /**
     * Optional. Last exit code seen for this instance. +optional
     * 
     */
    @InputImport(name="lastExitCode")
    private final @Nullable Input<Integer> lastExitCode;

    public Input<Integer> getLastExitCode() {
        return this.lastExitCode == null ? Input.empty() : this.lastExitCode;
    }

    /**
     * Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    @InputImport(name="restarted")
    private final @Nullable Input<Integer> restarted;

    public Input<Integer> getRestarted() {
        return this.restarted == null ? Input.empty() : this.restarted;
    }

    /**
     * Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    @InputImport(name="succeeded")
    private final @Nullable Input<Integer> succeeded;

    public Input<Integer> getSucceeded() {
        return this.succeeded == null ? Input.empty() : this.succeeded;
    }

    public InstanceStatusArgs(
        @Nullable Input<String> completionTime,
        @Nullable Input<Integer> failed,
        Input<Integer> index,
        @Nullable Input<InstanceAttemptResultArgs> lastAttemptResult,
        @Nullable Input<Integer> lastExitCode,
        @Nullable Input<Integer> restarted,
        @Nullable Input<String> startTime,
        @Nullable Input<Integer> succeeded) {
        this.completionTime = completionTime;
        this.failed = failed;
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.lastAttemptResult = lastAttemptResult;
        this.lastExitCode = lastExitCode;
        this.restarted = restarted;
        this.startTime = startTime;
        this.succeeded = succeeded;
    }

    private InstanceStatusArgs() {
        this.completionTime = Input.empty();
        this.failed = Input.empty();
        this.index = Input.empty();
        this.lastAttemptResult = Input.empty();
        this.lastExitCode = Input.empty();
        this.restarted = Input.empty();
        this.startTime = Input.empty();
        this.succeeded = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> completionTime;
        private @Nullable Input<Integer> failed;
        private Input<Integer> index;
        private @Nullable Input<InstanceAttemptResultArgs> lastAttemptResult;
        private @Nullable Input<Integer> lastExitCode;
        private @Nullable Input<Integer> restarted;
        private @Nullable Input<String> startTime;
        private @Nullable Input<Integer> succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.failed = defaults.failed;
    	      this.index = defaults.index;
    	      this.lastAttemptResult = defaults.lastAttemptResult;
    	      this.lastExitCode = defaults.lastExitCode;
    	      this.restarted = defaults.restarted;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder setCompletionTime(@Nullable Input<String> completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setCompletionTime(@Nullable String completionTime) {
            this.completionTime = Input.ofNullable(completionTime);
            return this;
        }

        public Builder setFailed(@Nullable Input<Integer> failed) {
            this.failed = failed;
            return this;
        }

        public Builder setFailed(@Nullable Integer failed) {
            this.failed = Input.ofNullable(failed);
            return this;
        }

        public Builder setIndex(Input<Integer> index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = Input.of(Objects.requireNonNull(index));
            return this;
        }

        public Builder setLastAttemptResult(@Nullable Input<InstanceAttemptResultArgs> lastAttemptResult) {
            this.lastAttemptResult = lastAttemptResult;
            return this;
        }

        public Builder setLastAttemptResult(@Nullable InstanceAttemptResultArgs lastAttemptResult) {
            this.lastAttemptResult = Input.ofNullable(lastAttemptResult);
            return this;
        }

        public Builder setLastExitCode(@Nullable Input<Integer> lastExitCode) {
            this.lastExitCode = lastExitCode;
            return this;
        }

        public Builder setLastExitCode(@Nullable Integer lastExitCode) {
            this.lastExitCode = Input.ofNullable(lastExitCode);
            return this;
        }

        public Builder setRestarted(@Nullable Input<Integer> restarted) {
            this.restarted = restarted;
            return this;
        }

        public Builder setRestarted(@Nullable Integer restarted) {
            this.restarted = Input.ofNullable(restarted);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setSucceeded(@Nullable Input<Integer> succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public Builder setSucceeded(@Nullable Integer succeeded) {
            this.succeeded = Input.ofNullable(succeeded);
            return this;
        }

        public InstanceStatusArgs build() {
            return new InstanceStatusArgs(completionTime, failed, index, lastAttemptResult, lastExitCode, restarted, startTime, succeeded);
        }
    }
}
