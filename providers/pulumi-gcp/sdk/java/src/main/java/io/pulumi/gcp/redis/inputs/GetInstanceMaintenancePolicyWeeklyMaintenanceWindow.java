// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.redis.inputs.GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceMaintenancePolicyWeeklyMaintenanceWindow extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceMaintenancePolicyWeeklyMaintenanceWindow Empty = new GetInstanceMaintenancePolicyWeeklyMaintenanceWindow();

    @InputImport(name="day", required=true)
    private final String day;

    public String getDay() {
        return this.day;
    }

    @InputImport(name="duration", required=true)
    private final String duration;

    public String getDuration() {
        return this.duration;
    }

    @InputImport(name="startTimes", required=true)
    private final List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes;

    public List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> getStartTimes() {
        return this.startTimes;
    }

    public GetInstanceMaintenancePolicyWeeklyMaintenanceWindow(
        String day,
        String duration,
        List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTimes = Objects.requireNonNull(startTimes, "expected parameter 'startTimes' to be non-null");
    }

    private GetInstanceMaintenancePolicyWeeklyMaintenanceWindow() {
        this.day = null;
        this.duration = null;
        this.startTimes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTimes = defaults.startTimes;
        }

        public Builder setDay(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTimes(List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes) {
            this.startTimes = Objects.requireNonNull(startTimes);
            return this;
        }

        public GetInstanceMaintenancePolicyWeeklyMaintenanceWindow build() {
            return new GetInstanceMaintenancePolicyWeeklyMaintenanceWindow(day, duration, startTimes);
        }
    }
}
