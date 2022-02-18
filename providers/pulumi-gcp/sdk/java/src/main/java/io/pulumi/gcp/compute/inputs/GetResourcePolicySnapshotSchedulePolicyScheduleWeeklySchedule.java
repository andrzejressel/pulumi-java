// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek;
import java.util.List;
import java.util.Objects;


public final class GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule Empty = new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule();

    @InputImport(name="dayOfWeeks", required=true)
    private final List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> getDayOfWeeks() {
        return this.dayOfWeeks;
    }

    public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks, "expected parameter 'dayOfWeeks' to be non-null");
    }

    private GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule() {
        this.dayOfWeeks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder setDayOfWeeks(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }

        public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(dayOfWeeks);
        }
    }
}
