// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyAlertStrategyNotificationRateLimitGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyAlertStrategyNotificationRateLimitGetArgs Empty = new AlertPolicyAlertStrategyNotificationRateLimitGetArgs();

    /**
     * Not more than one notification per period.
     * 
     */
    @InputImport(name="period")
    private final @Nullable Input<String> period;

    public Input<String> getPeriod() {
        return this.period == null ? Input.empty() : this.period;
    }

    public AlertPolicyAlertStrategyNotificationRateLimitGetArgs(@Nullable Input<String> period) {
        this.period = period;
    }

    private AlertPolicyAlertStrategyNotificationRateLimitGetArgs() {
        this.period = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategyNotificationRateLimitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategyNotificationRateLimitGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.period = defaults.period;
        }

        public Builder setPeriod(@Nullable Input<String> period) {
            this.period = period;
            return this;
        }

        public Builder setPeriod(@Nullable String period) {
            this.period = Input.ofNullable(period);
            return this;
        }

        public AlertPolicyAlertStrategyNotificationRateLimitGetArgs build() {
            return new AlertPolicyAlertStrategyNotificationRateLimitGetArgs(period);
        }
    }
}
