// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.WeekDayOfMonthResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a monthly schedule. An example of a valid monthly schedule is "on the third Tuesday of the month" or "on the 15th of the month".
 * 
 */
public final class MonthlyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonthlyScheduleResponse Empty = new MonthlyScheduleResponse();

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a schedule to run "every month on the 31st" will not run in February, April, June, etc.
     * 
     */
    @InputImport(name="monthDay", required=true)
    private final Integer monthDay;

    public Integer getMonthDay() {
        return this.monthDay;
    }

    /**
     * Week day in a month.
     * 
     */
    @InputImport(name="weekDayOfMonth", required=true)
    private final WeekDayOfMonthResponse weekDayOfMonth;

    public WeekDayOfMonthResponse getWeekDayOfMonth() {
        return this.weekDayOfMonth;
    }

    public MonthlyScheduleResponse(
        Integer monthDay,
        WeekDayOfMonthResponse weekDayOfMonth) {
        this.monthDay = Objects.requireNonNull(monthDay, "expected parameter 'monthDay' to be non-null");
        this.weekDayOfMonth = Objects.requireNonNull(weekDayOfMonth, "expected parameter 'weekDayOfMonth' to be non-null");
    }

    private MonthlyScheduleResponse() {
        this.monthDay = null;
        this.weekDayOfMonth = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer monthDay;
        private WeekDayOfMonthResponse weekDayOfMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDay = defaults.monthDay;
    	      this.weekDayOfMonth = defaults.weekDayOfMonth;
        }

        public Builder setMonthDay(Integer monthDay) {
            this.monthDay = Objects.requireNonNull(monthDay);
            return this;
        }

        public Builder setWeekDayOfMonth(WeekDayOfMonthResponse weekDayOfMonth) {
            this.weekDayOfMonth = Objects.requireNonNull(weekDayOfMonth);
            return this;
        }

        public MonthlyScheduleResponse build() {
            return new MonthlyScheduleResponse(monthDay, weekDayOfMonth);
        }
    }
}
