// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.BasicYarnAutoscalingConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.SparkStandaloneAutoscalingConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BasicAutoscalingAlgorithmResponse {
    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    private final String cooldownPeriod;
    /**
     * Optional. Spark Standalone autoscaling configuration
     * 
     */
    private final SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig;
    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    private final BasicYarnAutoscalingConfigResponse yarnConfig;

    @OutputCustomType.Constructor({"cooldownPeriod","sparkStandaloneConfig","yarnConfig"})
    private BasicAutoscalingAlgorithmResponse(
        String cooldownPeriod,
        SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig,
        BasicYarnAutoscalingConfigResponse yarnConfig) {
        this.cooldownPeriod = Objects.requireNonNull(cooldownPeriod);
        this.sparkStandaloneConfig = Objects.requireNonNull(sparkStandaloneConfig);
        this.yarnConfig = Objects.requireNonNull(yarnConfig);
    }

    /**
     * Optional. Duration between scaling events. A scaling period starts after the update operation from the previous event has completed.Bounds: 2m, 1d. Default: 2m.
     * 
     */
    public String getCooldownPeriod() {
        return this.cooldownPeriod;
    }
    /**
     * Optional. Spark Standalone autoscaling configuration
     * 
     */
    public SparkStandaloneAutoscalingConfigResponse getSparkStandaloneConfig() {
        return this.sparkStandaloneConfig;
    }
    /**
     * Optional. YARN autoscaling configuration.
     * 
     */
    public BasicYarnAutoscalingConfigResponse getYarnConfig() {
        return this.yarnConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAutoscalingAlgorithmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cooldownPeriod;
        private SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig;
        private BasicYarnAutoscalingConfigResponse yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAutoscalingAlgorithmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.sparkStandaloneConfig = defaults.sparkStandaloneConfig;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder setCooldownPeriod(String cooldownPeriod) {
            this.cooldownPeriod = Objects.requireNonNull(cooldownPeriod);
            return this;
        }

        public Builder setSparkStandaloneConfig(SparkStandaloneAutoscalingConfigResponse sparkStandaloneConfig) {
            this.sparkStandaloneConfig = Objects.requireNonNull(sparkStandaloneConfig);
            return this;
        }

        public Builder setYarnConfig(BasicYarnAutoscalingConfigResponse yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }

        public BasicAutoscalingAlgorithmResponse build() {
            return new BasicAutoscalingAlgorithmResponse(cooldownPeriod, sparkStandaloneConfig, yarnConfig);
        }
    }
}
