// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentRecurringScheduleMonthlyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleMonthlyGetArgs Empty = new PatchDeploymentRecurringScheduleMonthlyGetArgs();

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month.
     * Months without the target day will be skipped. For example, a schedule to run "every month on the 31st"
     * will not run in February, April, June, etc.
     * 
     */
    @InputImport(name="monthDay")
    private final @Nullable Input<Integer> monthDay;

    public Input<Integer> getMonthDay() {
        return this.monthDay == null ? Input.empty() : this.monthDay;
    }

    /**
     * Week day in a month.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weekDayOfMonth")
    private final @Nullable Input<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth;

    public Input<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> getWeekDayOfMonth() {
        return this.weekDayOfMonth == null ? Input.empty() : this.weekDayOfMonth;
    }

    public PatchDeploymentRecurringScheduleMonthlyGetArgs(
        @Nullable Input<Integer> monthDay,
        @Nullable Input<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth) {
        this.monthDay = monthDay;
        this.weekDayOfMonth = weekDayOfMonth;
    }

    private PatchDeploymentRecurringScheduleMonthlyGetArgs() {
        this.monthDay = Input.empty();
        this.weekDayOfMonth = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> monthDay;
        private @Nullable Input<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleMonthlyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDay = defaults.monthDay;
    	      this.weekDayOfMonth = defaults.weekDayOfMonth;
        }

        public Builder setMonthDay(@Nullable Input<Integer> monthDay) {
            this.monthDay = monthDay;
            return this;
        }

        public Builder setMonthDay(@Nullable Integer monthDay) {
            this.monthDay = Input.ofNullable(monthDay);
            return this;
        }

        public Builder setWeekDayOfMonth(@Nullable Input<PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs> weekDayOfMonth) {
            this.weekDayOfMonth = weekDayOfMonth;
            return this;
        }

        public Builder setWeekDayOfMonth(@Nullable PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonthGetArgs weekDayOfMonth) {
            this.weekDayOfMonth = Input.ofNullable(weekDayOfMonth);
            return this;
        }

        public PatchDeploymentRecurringScheduleMonthlyGetArgs build() {
            return new PatchDeploymentRecurringScheduleMonthlyGetArgs(monthDay, weekDayOfMonth);
        }
    }
}
