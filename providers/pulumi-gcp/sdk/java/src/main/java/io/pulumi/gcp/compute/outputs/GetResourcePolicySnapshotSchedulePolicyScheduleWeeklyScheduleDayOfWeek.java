// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek {
    private final String day;
    private final String startTime;

    @OutputCustomType.Constructor({"day","startTime"})
    private GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(
        String day,
        String startTime) {
        this.day = Objects.requireNonNull(day);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public String getDay() {
        return this.day;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek(day, startTime);
        }
    }
}
