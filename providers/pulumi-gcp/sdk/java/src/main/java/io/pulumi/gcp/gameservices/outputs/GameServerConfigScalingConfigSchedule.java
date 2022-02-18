// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerConfigScalingConfigSchedule {
    /**
     * The duration for the cron job event. The duration of the event is effective
     * after the cron job's start time.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String cronJobDuration;
    /**
     * The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    private final @Nullable String cronSpec;
    /**
     * The end time of the event.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String endTime;
    /**
     * The start time of the event.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor({"cronJobDuration","cronSpec","endTime","startTime"})
    private GameServerConfigScalingConfigSchedule(
        @Nullable String cronJobDuration,
        @Nullable String cronSpec,
        @Nullable String endTime,
        @Nullable String startTime) {
        this.cronJobDuration = cronJobDuration;
        this.cronSpec = cronSpec;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * The duration for the cron job event. The duration of the event is effective
     * after the cron job's start time.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getCronJobDuration() {
        return Optional.ofNullable(this.cronJobDuration);
    }
    /**
     * The cron definition of the scheduled event. See
     * https://en.wikipedia.org/wiki/Cron. Cron spec specifies the local time as
     * defined by the realm.
     * 
     */
    public Optional<String> getCronSpec() {
        return Optional.ofNullable(this.cronSpec);
    }
    /**
     * The end time of the event.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * The start time of the event.
     * A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigScalingConfigSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cronJobDuration;
        private @Nullable String cronSpec;
        private @Nullable String endTime;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigScalingConfigSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cronJobDuration = defaults.cronJobDuration;
    	      this.cronSpec = defaults.cronSpec;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder setCronJobDuration(@Nullable String cronJobDuration) {
            this.cronJobDuration = cronJobDuration;
            return this;
        }

        public Builder setCronSpec(@Nullable String cronSpec) {
            this.cronSpec = cronSpec;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public GameServerConfigScalingConfigSchedule build() {
            return new GameServerConfigScalingConfigSchedule(cronJobDuration, cronSpec, endTime, startTime);
        }
    }
}
