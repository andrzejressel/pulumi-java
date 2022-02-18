// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs();

    /**
     * Specifies the value of the fixed delay interval.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fixedDelay")
    private final @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;

    public Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> getFixedDelay() {
        return this.fixedDelay == null ? Input.empty() : this.fixedDelay;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
    private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(
        @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay,
        @Nullable Input<Double> percentage) {
        this.fixedDelay = fixedDelay;
        this.percentage = percentage;
    }

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs() {
        this.fixedDelay = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedDelay = defaults.fixedDelay;
    	      this.percentage = defaults.percentage;
        }

        public Builder setFixedDelay(@Nullable Input<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs> fixedDelay) {
            this.fixedDelay = fixedDelay;
            return this;
        }

        public Builder setFixedDelay(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayGetArgs fixedDelay) {
            this.fixedDelay = Input.ofNullable(fixedDelay);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }

        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayGetArgs(fixedDelay, percentage);
        }
    }
}
