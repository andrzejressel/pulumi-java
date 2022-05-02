// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.fis.outputs;

import com.pulumi.awsnative.fis.outputs.ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties;
import com.pulumi.awsnative.fis.outputs.ExperimentTemplateLogConfigurationS3ConfigurationProperties;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExperimentTemplateLogConfiguration {
    private final @Nullable ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties cloudWatchLogsConfiguration;
    private final Integer logSchemaVersion;
    private final @Nullable ExperimentTemplateLogConfigurationS3ConfigurationProperties s3Configuration;

    @CustomType.Constructor
    private ExperimentTemplateLogConfiguration(
        @CustomType.Parameter("cloudWatchLogsConfiguration") @Nullable ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties cloudWatchLogsConfiguration,
        @CustomType.Parameter("logSchemaVersion") Integer logSchemaVersion,
        @CustomType.Parameter("s3Configuration") @Nullable ExperimentTemplateLogConfigurationS3ConfigurationProperties s3Configuration) {
        this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
        this.logSchemaVersion = logSchemaVersion;
        this.s3Configuration = s3Configuration;
    }

    public Optional<ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties> cloudWatchLogsConfiguration() {
        return Optional.ofNullable(this.cloudWatchLogsConfiguration);
    }
    public Integer logSchemaVersion() {
        return this.logSchemaVersion;
    }
    public Optional<ExperimentTemplateLogConfigurationS3ConfigurationProperties> s3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties cloudWatchLogsConfiguration;
        private Integer logSchemaVersion;
        private @Nullable ExperimentTemplateLogConfigurationS3ConfigurationProperties s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTemplateLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogsConfiguration = defaults.cloudWatchLogsConfiguration;
    	      this.logSchemaVersion = defaults.logSchemaVersion;
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder cloudWatchLogsConfiguration(@Nullable ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties cloudWatchLogsConfiguration) {
            this.cloudWatchLogsConfiguration = cloudWatchLogsConfiguration;
            return this;
        }
        public Builder logSchemaVersion(Integer logSchemaVersion) {
            this.logSchemaVersion = Objects.requireNonNull(logSchemaVersion);
            return this;
        }
        public Builder s3Configuration(@Nullable ExperimentTemplateLogConfigurationS3ConfigurationProperties s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }        public ExperimentTemplateLogConfiguration build() {
            return new ExperimentTemplateLogConfiguration(cloudWatchLogsConfiguration, logSchemaVersion, s3Configuration);
        }
    }
}
