// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class AutoscalerAutoscalingPolicyLoadBalancingUtilization {
    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    private final Double target;

    @OutputCustomType.Constructor({"target"})
    private AutoscalerAutoscalingPolicyLoadBalancingUtilization(Double target) {
        this.target = Objects.requireNonNull(target);
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Double getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyLoadBalancingUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyLoadBalancingUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(Double target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public AutoscalerAutoscalingPolicyLoadBalancingUtilization build() {
            return new AutoscalerAutoscalingPolicyLoadBalancingUtilization(target);
        }
    }
}
