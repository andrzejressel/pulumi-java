// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.JobRecurrenceScheduleMonthlyOccurrenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobRecurrenceScheduleResponse {
    /**
     * Gets or sets the hours of the day that the job should execute at.
     * 
     */
    private final @Nullable List<Integer> hours;
    /**
     * Gets or sets the minutes of the hour that the job should execute at.
     * 
     */
    private final @Nullable List<Integer> minutes;
    /**
     * Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    private final @Nullable List<Integer> monthDays;
    /**
     * Gets or sets the occurrences of days within a month.
     * 
     */
    private final @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
    /**
     * Gets or sets the days of the week that the job should execute on.
     * 
     */
    private final @Nullable List<String> weekDays;

    @OutputCustomType.Constructor
    private JobRecurrenceScheduleResponse(
        @OutputCustomType.Parameter("hours") @Nullable List<Integer> hours,
        @OutputCustomType.Parameter("minutes") @Nullable List<Integer> minutes,
        @OutputCustomType.Parameter("monthDays") @Nullable List<Integer> monthDays,
        @OutputCustomType.Parameter("monthlyOccurrences") @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences,
        @OutputCustomType.Parameter("weekDays") @Nullable List<String> weekDays) {
        this.hours = hours;
        this.minutes = minutes;
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    /**
     * Gets or sets the hours of the day that the job should execute at.
     * 
    */
    public List<Integer> getHours() {
        return this.hours == null ? List.of() : this.hours;
    }
    /**
     * Gets or sets the minutes of the hour that the job should execute at.
     * 
    */
    public List<Integer> getMinutes() {
        return this.minutes == null ? List.of() : this.minutes;
    }
    /**
     * Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
    */
    public List<Integer> getMonthDays() {
        return this.monthDays == null ? List.of() : this.monthDays;
    }
    /**
     * Gets or sets the occurrences of days within a month.
     * 
    */
    public List<JobRecurrenceScheduleMonthlyOccurrenceResponse> getMonthlyOccurrences() {
        return this.monthlyOccurrences == null ? List.of() : this.monthlyOccurrences;
    }
    /**
     * Gets or sets the days of the week that the job should execute on.
     * 
    */
    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> hours;
        private @Nullable List<Integer> minutes;
        private @Nullable List<Integer> monthDays;
        private @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder setHours(@Nullable List<Integer> hours) {
            this.hours = hours;
            return this;
        }

        public Builder setMinutes(@Nullable List<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }

        public Builder setMonthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }

        public Builder setMonthlyOccurrences(@Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }
        public JobRecurrenceScheduleResponse build() {
            return new JobRecurrenceScheduleResponse(hours, minutes, monthDays, monthlyOccurrences, weekDays);
        }
    }
}
