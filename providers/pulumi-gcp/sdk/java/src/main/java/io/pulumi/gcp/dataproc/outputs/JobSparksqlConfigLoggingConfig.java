// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class JobSparksqlConfigLoggingConfig {
    private final Map<String,String> driverLogLevels;

    @OutputCustomType.Constructor({"driverLogLevels"})
    private JobSparksqlConfigLoggingConfig(Map<String,String> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
    }

    public Map<String,String> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparksqlConfigLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparksqlConfigLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder setDriverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }

        public JobSparksqlConfigLoggingConfig build() {
            return new JobSparksqlConfigLoggingConfig(driverLogLevels);
        }
    }
}
