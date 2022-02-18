// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs Empty = new InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs();

    /**
     * Required. The day of week that maintenance updates occur.
     * - DAY_OF_WEEK_UNSPECIFIED: The day of the week is unspecified.
     * - MONDAY: Monday
     * - TUESDAY: Tuesday
     * - WEDNESDAY: Wednesday
     * - THURSDAY: Thursday
     * - FRIDAY: Friday
     * - SATURDAY: Saturday
     * - SUNDAY: Sunday
     *   Possible values are `DAY_OF_WEEK_UNSPECIFIED`, `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @InputImport(name="day", required=true)
    private final Input<String> day;

    public Input<String> getDay() {
        return this.day;
    }

    /**
     * - 
     * Output only. Duration of the maintenance window.
     * The current window is fixed at 1 hour.
     * A duration in seconds with up to nine fractional digits,
     * terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="duration")
    private final @Nullable Input<String> duration;

    public Input<String> getDuration() {
        return this.duration == null ? Input.empty() : this.duration;
    }

    /**
     * - 
     * Output only. The start time of any upcoming scheduled maintenance for this instance.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final Input<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime;

    public Input<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> getStartTime() {
        return this.startTime;
    }

    public InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs(
        Input<String> day,
        @Nullable Input<String> duration,
        Input<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.duration = duration;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs() {
        this.day = Input.empty();
        this.duration = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> day;
        private @Nullable Input<String> duration;
        private Input<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(Input<String> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDay(String day) {
            this.day = Input.of(Objects.requireNonNull(day));
            return this;
        }

        public Builder setDuration(@Nullable Input<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder setDuration(@Nullable String duration) {
            this.duration = Input.ofNullable(duration);
            return this;
        }

        public Builder setStartTime(Input<InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStartTime(InstanceMaintenancePolicyWeeklyMaintenanceWindowStartTimeGetArgs startTime) {
            this.startTime = Input.of(Objects.requireNonNull(startTime));
            return this;
        }

        public InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs build() {
            return new InstanceMaintenancePolicyWeeklyMaintenanceWindowGetArgs(day, duration, startTime);
        }
    }
}
