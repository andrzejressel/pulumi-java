// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule {
    /**
     * May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    private final List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

    @OutputCustomType.Constructor({"dayOfWeeks"})
    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
    }

    /**
     * May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    public List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> getDayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder setDayOfWeeks(List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(dayOfWeeks);
        }
    }
}
