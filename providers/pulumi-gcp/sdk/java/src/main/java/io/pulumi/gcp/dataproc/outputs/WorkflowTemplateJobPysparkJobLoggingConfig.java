// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplateJobPysparkJobLoggingConfig {
    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    private final @Nullable Map<String,String> driverLogLevels;

    @OutputCustomType.Constructor({"driverLogLevels"})
    private WorkflowTemplateJobPysparkJobLoggingConfig(@Nullable Map<String,String> driverLogLevels) {
        this.driverLogLevels = driverLogLevels;
    }

    /**
     * The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG'
     * 
     */
    public Map<String,String> getDriverLogLevels() {
        return this.driverLogLevels == null ? Map.of() : this.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPysparkJobLoggingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPysparkJobLoggingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder setDriverLogLevels(@Nullable Map<String,String> driverLogLevels) {
            this.driverLogLevels = driverLogLevels;
            return this;
        }

        public WorkflowTemplateJobPysparkJobLoggingConfig build() {
            return new WorkflowTemplateJobPysparkJobLoggingConfig(driverLogLevels);
        }
    }
}
