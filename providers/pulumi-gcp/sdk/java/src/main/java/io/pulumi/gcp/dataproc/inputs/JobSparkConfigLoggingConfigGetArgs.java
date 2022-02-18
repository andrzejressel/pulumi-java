// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class JobSparkConfigLoggingConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSparkConfigLoggingConfigGetArgs Empty = new JobSparkConfigLoggingConfigGetArgs();

    @InputImport(name="driverLogLevels", required=true)
    private final Input<Map<String,String>> driverLogLevels;

    public Input<Map<String,String>> getDriverLogLevels() {
        return this.driverLogLevels;
    }

    public JobSparkConfigLoggingConfigGetArgs(Input<Map<String,String>> driverLogLevels) {
        this.driverLogLevels = Objects.requireNonNull(driverLogLevels, "expected parameter 'driverLogLevels' to be non-null");
    }

    private JobSparkConfigLoggingConfigGetArgs() {
        this.driverLogLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparkConfigLoggingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> driverLogLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparkConfigLoggingConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        public Builder setDriverLogLevels(Input<Map<String,String>> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }

        public Builder setDriverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Input.of(Objects.requireNonNull(driverLogLevels));
            return this;
        }

        public JobSparkConfigLoggingConfigGetArgs build() {
            return new JobSparkConfigLoggingConfigGetArgs(driverLogLevels);
        }
    }
}
