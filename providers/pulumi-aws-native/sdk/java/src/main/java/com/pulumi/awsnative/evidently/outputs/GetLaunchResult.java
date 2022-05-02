// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.outputs;

import com.pulumi.awsnative.evidently.outputs.LaunchExecutionStatusObject;
import com.pulumi.awsnative.evidently.outputs.LaunchGroupObject;
import com.pulumi.awsnative.evidently.outputs.LaunchMetricDefinitionObject;
import com.pulumi.awsnative.evidently.outputs.LaunchStepConfig;
import com.pulumi.awsnative.evidently.outputs.LaunchTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLaunchResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    /**
     * @return Start or Stop Launch Launch. Default is not started.
     * 
     */
    private final @Nullable LaunchExecutionStatusObject executionStatus;
    private final @Nullable List<LaunchGroupObject> groups;
    private final @Nullable List<LaunchMetricDefinitionObject> metricMonitors;
    private final @Nullable String randomizationSalt;
    private final @Nullable List<LaunchStepConfig> scheduledSplitsConfig;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LaunchTag> tags;

    @CustomType.Constructor
    private GetLaunchResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("executionStatus") @Nullable LaunchExecutionStatusObject executionStatus,
        @CustomType.Parameter("groups") @Nullable List<LaunchGroupObject> groups,
        @CustomType.Parameter("metricMonitors") @Nullable List<LaunchMetricDefinitionObject> metricMonitors,
        @CustomType.Parameter("randomizationSalt") @Nullable String randomizationSalt,
        @CustomType.Parameter("scheduledSplitsConfig") @Nullable List<LaunchStepConfig> scheduledSplitsConfig,
        @CustomType.Parameter("tags") @Nullable List<LaunchTag> tags) {
        this.arn = arn;
        this.description = description;
        this.executionStatus = executionStatus;
        this.groups = groups;
        this.metricMonitors = metricMonitors;
        this.randomizationSalt = randomizationSalt;
        this.scheduledSplitsConfig = scheduledSplitsConfig;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Start or Stop Launch Launch. Default is not started.
     * 
     */
    public Optional<LaunchExecutionStatusObject> executionStatus() {
        return Optional.ofNullable(this.executionStatus);
    }
    public List<LaunchGroupObject> groups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public List<LaunchMetricDefinitionObject> metricMonitors() {
        return this.metricMonitors == null ? List.of() : this.metricMonitors;
    }
    public Optional<String> randomizationSalt() {
        return Optional.ofNullable(this.randomizationSalt);
    }
    public List<LaunchStepConfig> scheduledSplitsConfig() {
        return this.scheduledSplitsConfig == null ? List.of() : this.scheduledSplitsConfig;
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<LaunchTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable LaunchExecutionStatusObject executionStatus;
        private @Nullable List<LaunchGroupObject> groups;
        private @Nullable List<LaunchMetricDefinitionObject> metricMonitors;
        private @Nullable String randomizationSalt;
        private @Nullable List<LaunchStepConfig> scheduledSplitsConfig;
        private @Nullable List<LaunchTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.executionStatus = defaults.executionStatus;
    	      this.groups = defaults.groups;
    	      this.metricMonitors = defaults.metricMonitors;
    	      this.randomizationSalt = defaults.randomizationSalt;
    	      this.scheduledSplitsConfig = defaults.scheduledSplitsConfig;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder executionStatus(@Nullable LaunchExecutionStatusObject executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public Builder groups(@Nullable List<LaunchGroupObject> groups) {
            this.groups = groups;
            return this;
        }
        public Builder groups(LaunchGroupObject... groups) {
            return groups(List.of(groups));
        }
        public Builder metricMonitors(@Nullable List<LaunchMetricDefinitionObject> metricMonitors) {
            this.metricMonitors = metricMonitors;
            return this;
        }
        public Builder metricMonitors(LaunchMetricDefinitionObject... metricMonitors) {
            return metricMonitors(List.of(metricMonitors));
        }
        public Builder randomizationSalt(@Nullable String randomizationSalt) {
            this.randomizationSalt = randomizationSalt;
            return this;
        }
        public Builder scheduledSplitsConfig(@Nullable List<LaunchStepConfig> scheduledSplitsConfig) {
            this.scheduledSplitsConfig = scheduledSplitsConfig;
            return this;
        }
        public Builder scheduledSplitsConfig(LaunchStepConfig... scheduledSplitsConfig) {
            return scheduledSplitsConfig(List.of(scheduledSplitsConfig));
        }
        public Builder tags(@Nullable List<LaunchTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(LaunchTag... tags) {
            return tags(List.of(tags));
        }        public GetLaunchResult build() {
            return new GetLaunchResult(arn, description, executionStatus, groups, metricMonitors, randomizationSalt, scheduledSplitsConfig, tags);
        }
    }
}
