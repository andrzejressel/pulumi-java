// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyRecurringWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyRecurringWindowArgs Empty = new ClusterMaintenancePolicyRecurringWindowArgs();

    @InputImport(name="endTime", required=true)
    private final Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime;
    }

    @InputImport(name="recurrence", required=true)
    private final Input<String> recurrence;

    public Input<String> getRecurrence() {
        return this.recurrence;
    }

    @InputImport(name="startTime", required=true)
    private final Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime;
    }

    public ClusterMaintenancePolicyRecurringWindowArgs(
        Input<String> endTime,
        Input<String> recurrence,
        Input<String> startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ClusterMaintenancePolicyRecurringWindowArgs() {
        this.endTime = Input.empty();
        this.recurrence = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyRecurringWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endTime;
        private Input<String> recurrence;
        private Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicyRecurringWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(Input<String> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Input.of(Objects.requireNonNull(endTime));
            return this;
        }

        public Builder setRecurrence(Input<String> recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setRecurrence(String recurrence) {
            this.recurrence = Input.of(Objects.requireNonNull(recurrence));
            return this;
        }

        public Builder setStartTime(Input<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }

        public ClusterMaintenancePolicyRecurringWindowArgs build() {
            return new ClusterMaintenancePolicyRecurringWindowArgs(endTime, recurrence, startTime);
        }
    }
}
