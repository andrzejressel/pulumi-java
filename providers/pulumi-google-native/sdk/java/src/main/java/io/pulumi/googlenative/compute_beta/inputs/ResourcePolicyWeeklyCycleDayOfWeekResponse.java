// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyWeeklyCycleDayOfWeekResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyWeeklyCycleDayOfWeekResponse Empty = new ResourcePolicyWeeklyCycleDayOfWeekResponse();

    /**
     * Defines a schedule that runs on specific days of the week. Specify one or more days. The following options are available: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
     * 
     */
    @InputImport(name="day", required=true)
    private final String day;

    public String getDay() {
        return this.day;
    }

    /**
     * [Output only] Duration of the time window, automatically chosen to be smallest possible in the given scenario.
     * 
     */
    @InputImport(name="duration", required=true)
    private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * Time within the window to start the operations. It must be in format "HH:MM", where HH : [00-23] and MM : [00-00] GMT.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    public ResourcePolicyWeeklyCycleDayOfWeekResponse(
        String day,
        String duration,
        String startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ResourcePolicyWeeklyCycleDayOfWeekResponse() {
        this.day = null;
        this.duration = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyWeeklyCycleDayOfWeekResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder setDay(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public ResourcePolicyWeeklyCycleDayOfWeekResponse build() {
            return new ResourcePolicyWeeklyCycleDayOfWeekResponse(day, duration, startTime);
        }
    }
}
