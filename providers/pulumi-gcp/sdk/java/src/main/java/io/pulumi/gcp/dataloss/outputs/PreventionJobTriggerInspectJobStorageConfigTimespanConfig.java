// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfigTimespanConfig {
    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid startTime to avoid
     * scanning files that have not been modified since the last time the JobTrigger executed. This will
     * be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    private final @Nullable Boolean enableAutoPopulationOfTimespanConfig;
    /**
     * Exclude files or rows newer than this value. If set to zero, no upper time limit is applied.
     * 
     */
    private final @Nullable String endTime;
    /**
     * Exclude files or rows older than this value.
     * 
     */
    private final @Nullable String startTime;
    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField;

    @OutputCustomType.Constructor({"enableAutoPopulationOfTimespanConfig","endTime","startTime","timestampField"})
    private PreventionJobTriggerInspectJobStorageConfigTimespanConfig(
        @Nullable Boolean enableAutoPopulationOfTimespanConfig,
        @Nullable String endTime,
        @Nullable String startTime,
        PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField) {
        this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
        this.endTime = endTime;
        this.startTime = startTime;
        this.timestampField = Objects.requireNonNull(timestampField);
    }

    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid startTime to avoid
     * scanning files that have not been modified since the last time the JobTrigger executed. This will
     * be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    public Optional<Boolean> getEnableAutoPopulationOfTimespanConfig() {
        return Optional.ofNullable(this.enableAutoPopulationOfTimespanConfig);
    }
    /**
     * Exclude files or rows newer than this value. If set to zero, no upper time limit is applied.
     * 
     */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Exclude files or rows older than this value.
     * 
     */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField getTimestampField() {
        return this.timestampField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAutoPopulationOfTimespanConfig;
        private @Nullable String endTime;
        private @Nullable String startTime;
        private PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        public Builder setEnableAutoPopulationOfTimespanConfig(@Nullable Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
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

        public Builder setTimestampField(PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampField timestampField) {
            this.timestampField = Objects.requireNonNull(timestampField);
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigTimespanConfig build() {
            return new PreventionJobTriggerInspectJobStorageConfigTimespanConfig(enableAutoPopulationOfTimespanConfig, endTime, startTime, timestampField);
        }
    }
}
