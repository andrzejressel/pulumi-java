// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs Empty = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs();

    /**
     * Span of time that's a fraction of a second at nanosecond resolution. Durations less than one second are
     * represented with a 0 seconds field and a positive nanos field. Must be from 0 to 999,999,999 inclusive.
     * 
     */
    @InputImport(name="nanos")
    private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * Span of time at a resolution of a second. Must be from 0 to 315,576,000,000 inclusive.
     * Note: these bounds are computed from: 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
     * 
     */
    @InputImport(name="seconds", required=true)
    private final Input<String> seconds;

    public Input<String> getSeconds() {
        return this.seconds;
    }

    public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs(
        @Nullable Input<Integer> nanos,
        Input<String> seconds) {
        this.nanos = nanos;
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs() {
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> nanos;
        private Input<String> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setSeconds(Input<String> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public Builder setSeconds(String seconds) {
            this.seconds = Input.of(Objects.requireNonNull(seconds));
            return this;
        }

        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyDelayFixedDelayArgs(nanos, seconds);
        }
    }
}
