// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScheduleResponse {
    /**
     * The duration of time between executions in days.
     * 
     */
    private final Integer intervalDurationDays;
    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
     */
    private final String scheduleTime;

    @OutputCustomType.Constructor({"intervalDurationDays","scheduleTime"})
    private ScheduleResponse(
        Integer intervalDurationDays,
        String scheduleTime) {
        this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
        this.scheduleTime = Objects.requireNonNull(scheduleTime);
    }

    /**
     * The duration of time between executions in days.
     * 
     */
    public Integer getIntervalDurationDays() {
        return this.intervalDurationDays;
    }
    /**
     * A timestamp indicates when the next run will be scheduled. The value is refreshed by the server after each run. If unspecified, it will default to current server time, which means the scan will be scheduled to start immediately.
     * 
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer intervalDurationDays;
        private String scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalDurationDays = defaults.intervalDurationDays;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder setIntervalDurationDays(Integer intervalDurationDays) {
            this.intervalDurationDays = Objects.requireNonNull(intervalDurationDays);
            return this;
        }

        public Builder setScheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }

        public ScheduleResponse build() {
            return new ScheduleResponse(intervalDurationDays, scheduleTime);
        }
    }
}
