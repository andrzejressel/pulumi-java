// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a weekly schedule.
 * 
 */
public final class WeeklyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final WeeklyScheduleResponse Empty = new WeeklyScheduleResponse();

    /**
     * Day of the week.
     * 
     */
    @InputImport(name="dayOfWeek", required=true)
    private final String dayOfWeek;

    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public WeeklyScheduleResponse(String dayOfWeek) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
    }

    private WeeklyScheduleResponse() {
        this.dayOfWeek = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public WeeklyScheduleResponse build() {
            return new WeeklyScheduleResponse(dayOfWeek);
        }
    }
}
