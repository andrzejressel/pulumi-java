// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceSettingsMaintenanceWindow {
    /**
     * Day of week (`1-7`), starting on Monday
     * 
     */
    private final @Nullable Integer day;
    /**
     * Hour of day (`0-23`), ignored if `day` not set
     * 
     */
    private final @Nullable Integer hour;
    /**
     * Receive updates earlier (`canary`) or later
     * (`stable`)
     * 
     */
    private final @Nullable String updateTrack;

    @OutputCustomType.Constructor({"day","hour","updateTrack"})
    private DatabaseInstanceSettingsMaintenanceWindow(
        @Nullable Integer day,
        @Nullable Integer hour,
        @Nullable String updateTrack) {
        this.day = day;
        this.hour = hour;
        this.updateTrack = updateTrack;
    }

    /**
     * Day of week (`1-7`), starting on Monday
     * 
     */
    public Optional<Integer> getDay() {
        return Optional.ofNullable(this.day);
    }
    /**
     * Hour of day (`0-23`), ignored if `day` not set
     * 
     */
    public Optional<Integer> getHour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * Receive updates earlier (`canary`) or later
     * (`stable`)
     * 
     */
    public Optional<String> getUpdateTrack() {
        return Optional.ofNullable(this.updateTrack);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer day;
        private @Nullable Integer hour;
        private @Nullable String updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder setDay(@Nullable Integer day) {
            this.day = day;
            return this;
        }

        public Builder setHour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }

        public Builder setUpdateTrack(@Nullable String updateTrack) {
            this.updateTrack = updateTrack;
            return this;
        }

        public DatabaseInstanceSettingsMaintenanceWindow build() {
            return new DatabaseInstanceSettingsMaintenanceWindow(day, hour, updateTrack);
        }
    }
}
