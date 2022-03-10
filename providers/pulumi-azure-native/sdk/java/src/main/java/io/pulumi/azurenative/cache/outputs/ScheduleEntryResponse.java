// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduleEntryResponse {
    /**
     * Day of the week when a cache can be patched.
     * 
     */
    private final String dayOfWeek;
    /**
     * ISO8601 timespan specifying how much time cache patching can take.
     * 
     */
    private final @Nullable String maintenanceWindow;
    /**
     * Start hour after which cache patching can start.
     * 
     */
    private final Integer startHourUtc;

    @OutputCustomType.Constructor
    private ScheduleEntryResponse(
        @OutputCustomType.Parameter("dayOfWeek") String dayOfWeek,
        @OutputCustomType.Parameter("maintenanceWindow") @Nullable String maintenanceWindow,
        @OutputCustomType.Parameter("startHourUtc") Integer startHourUtc) {
        this.dayOfWeek = dayOfWeek;
        this.maintenanceWindow = maintenanceWindow;
        this.startHourUtc = startHourUtc;
    }

    /**
     * Day of the week when a cache can be patched.
     * 
    */
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * ISO8601 timespan specifying how much time cache patching can take.
     * 
    */
    public Optional<String> getMaintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }
    /**
     * Start hour after which cache patching can start.
     * 
    */
    public Integer getStartHourUtc() {
        return this.startHourUtc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private @Nullable String maintenanceWindow;
        private Integer startHourUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.startHourUtc = defaults.startHourUtc;
        }

        public Builder setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setStartHourUtc(Integer startHourUtc) {
            this.startHourUtc = Objects.requireNonNull(startHourUtc);
            return this;
        }
        public ScheduleEntryResponse build() {
            return new ScheduleEntryResponse(dayOfWeek, maintenanceWindow, startHourUtc);
        }
    }
}
