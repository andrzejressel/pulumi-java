// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlScheduledMaintenanceResponse {
    private final Boolean canDefer;
    /**
     * If the scheduled maintenance can be rescheduled.
     * 
     */
    private final Boolean canReschedule;
    /**
     * Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    private final String scheduleDeadlineTime;
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final String startTime;

    @OutputCustomType.Constructor({"canDefer","canReschedule","scheduleDeadlineTime","startTime"})
    private SqlScheduledMaintenanceResponse(
        Boolean canDefer,
        Boolean canReschedule,
        String scheduleDeadlineTime,
        String startTime) {
        this.canDefer = Objects.requireNonNull(canDefer);
        this.canReschedule = Objects.requireNonNull(canReschedule);
        this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public Boolean getCanDefer() {
        return this.canDefer;
    }
    /**
     * If the scheduled maintenance can be rescheduled.
     * 
     */
    public Boolean getCanReschedule() {
        return this.canReschedule;
    }
    /**
     * Maintenance cannot be rescheduled to start beyond this deadline.
     * 
     */
    public String getScheduleDeadlineTime() {
        return this.scheduleDeadlineTime;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlScheduledMaintenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canDefer;
        private Boolean canReschedule;
        private String scheduleDeadlineTime;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlScheduledMaintenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canDefer = defaults.canDefer;
    	      this.canReschedule = defaults.canReschedule;
    	      this.scheduleDeadlineTime = defaults.scheduleDeadlineTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCanDefer(Boolean canDefer) {
            this.canDefer = Objects.requireNonNull(canDefer);
            return this;
        }

        public Builder setCanReschedule(Boolean canReschedule) {
            this.canReschedule = Objects.requireNonNull(canReschedule);
            return this;
        }

        public Builder setScheduleDeadlineTime(String scheduleDeadlineTime) {
            this.scheduleDeadlineTime = Objects.requireNonNull(scheduleDeadlineTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public SqlScheduledMaintenanceResponse build() {
            return new SqlScheduledMaintenanceResponse(canDefer, canReschedule, scheduleDeadlineTime, startTime);
        }
    }
}
