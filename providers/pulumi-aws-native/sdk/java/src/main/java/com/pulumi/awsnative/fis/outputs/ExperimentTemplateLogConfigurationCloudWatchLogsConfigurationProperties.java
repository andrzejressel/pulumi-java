// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.fis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties {
    private final String logGroupArn;

    @CustomType.Constructor
    private ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties(@CustomType.Parameter("logGroupArn") String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    public String logGroupArn() {
        return this.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupArn = defaults.logGroupArn;
        }

        public Builder logGroupArn(String logGroupArn) {
            this.logGroupArn = Objects.requireNonNull(logGroupArn);
            return this;
        }        public ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties build() {
            return new ExperimentTemplateLogConfigurationCloudWatchLogsConfigurationProperties(logGroupArn);
        }
    }
}
