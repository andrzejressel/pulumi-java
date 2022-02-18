// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyMaintenanceExclusionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyMaintenanceExclusionGetArgs Empty = new ClusterMaintenancePolicyMaintenanceExclusionGetArgs();

    @InputImport(name="endTime", required=true)
    private final Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime;
    }

    @InputImport(name="exclusionName", required=true)
    private final Input<String> exclusionName;

    public Input<String> getExclusionName() {
        return this.exclusionName;
    }

    @InputImport(name="startTime", required=true)
    private final Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime;
    }

    public ClusterMaintenancePolicyMaintenanceExclusionGetArgs(
        Input<String> endTime,
        Input<String> exclusionName,
        Input<String> startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.exclusionName = Objects.requireNonNull(exclusionName, "expected parameter 'exclusionName' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ClusterMaintenancePolicyMaintenanceExclusionGetArgs() {
        this.endTime = Input.empty();
        this.exclusionName = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyMaintenanceExclusionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endTime;
        private Input<String> exclusionName;
        private Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicyMaintenanceExclusionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.exclusionName = defaults.exclusionName;
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

        public Builder setExclusionName(Input<String> exclusionName) {
            this.exclusionName = Objects.requireNonNull(exclusionName);
            return this;
        }

        public Builder setExclusionName(String exclusionName) {
            this.exclusionName = Input.of(Objects.requireNonNull(exclusionName));
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

        public ClusterMaintenancePolicyMaintenanceExclusionGetArgs build() {
            return new ClusterMaintenancePolicyMaintenanceExclusionGetArgs(endTime, exclusionName, startTime);
        }
    }
}
