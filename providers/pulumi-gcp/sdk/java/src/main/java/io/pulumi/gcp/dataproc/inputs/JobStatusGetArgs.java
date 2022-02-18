// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobStatusGetArgs Empty = new JobStatusGetArgs();

    @InputImport(name="details")
    private final @Nullable Input<String> details;

    public Input<String> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="stateStartTime")
    private final @Nullable Input<String> stateStartTime;

    public Input<String> getStateStartTime() {
        return this.stateStartTime == null ? Input.empty() : this.stateStartTime;
    }

    @InputImport(name="substate")
    private final @Nullable Input<String> substate;

    public Input<String> getSubstate() {
        return this.substate == null ? Input.empty() : this.substate;
    }

    public JobStatusGetArgs(
        @Nullable Input<String> details,
        @Nullable Input<String> state,
        @Nullable Input<String> stateStartTime,
        @Nullable Input<String> substate) {
        this.details = details;
        this.state = state;
        this.stateStartTime = stateStartTime;
        this.substate = substate;
    }

    private JobStatusGetArgs() {
        this.details = Input.empty();
        this.state = Input.empty();
        this.stateStartTime = Input.empty();
        this.substate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> details;
        private @Nullable Input<String> state;
        private @Nullable Input<String> stateStartTime;
        private @Nullable Input<String> substate;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder setDetails(@Nullable Input<String> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable String details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setStateStartTime(@Nullable Input<String> stateStartTime) {
            this.stateStartTime = stateStartTime;
            return this;
        }

        public Builder setStateStartTime(@Nullable String stateStartTime) {
            this.stateStartTime = Input.ofNullable(stateStartTime);
            return this;
        }

        public Builder setSubstate(@Nullable Input<String> substate) {
            this.substate = substate;
            return this;
        }

        public Builder setSubstate(@Nullable String substate) {
            this.substate = Input.ofNullable(substate);
            return this;
        }

        public JobStatusGetArgs build() {
            return new JobStatusGetArgs(details, state, stateStartTime, substate);
        }
    }
}
