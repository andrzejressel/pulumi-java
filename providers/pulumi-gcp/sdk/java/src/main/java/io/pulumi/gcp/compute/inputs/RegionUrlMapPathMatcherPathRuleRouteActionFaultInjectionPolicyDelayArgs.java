// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs;
import java.lang.Double;
import java.util.Objects;


public final class RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fixedDelay", required=true)
    private final Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;

    public Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> getFixedDelay() {
        return this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) on which delay will
     * be introduced as part of fault injection. The value must be between 0.0 and
     * 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage", required=true)
    private final Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(
        Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay,
        Input<Double> percentage) {
        this.fixedDelay = Objects.requireNonNull(fixedDelay, "expected parameter 'fixedDelay' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs() {
        this.fixedDelay = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay;
        private Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(Input<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs> fixedDelay) {
            this.fixedDelay = Objects.requireNonNull(fixedDelay);
            return this;
        }

        public Builder setFixedDelay(RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs fixedDelay) {
            this.fixedDelay = Input.of(Objects.requireNonNull(fixedDelay));
            return this;
        }

        public Builder setPercentage(Input<Double> percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }

        public Builder setPercentage(Double percentage) {
            this.percentage = Input.of(Objects.requireNonNull(percentage));
            return this;
        }

        public RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyDelayArgs(fixedDelay, percentage);
        }
    }
}
