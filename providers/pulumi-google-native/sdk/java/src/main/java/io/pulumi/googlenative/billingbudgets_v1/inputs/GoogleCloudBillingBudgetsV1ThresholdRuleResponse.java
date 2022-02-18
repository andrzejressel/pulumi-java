// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * ThresholdRule contains the definition of a threshold. Threshold rules define the triggering events used to generate a budget notification email. When a threshold is crossed (spend exceeds the specified percentages of the budget), budget alert emails are sent to the email recipients you specify in the [NotificationsRule](#notificationsrule). Threshold rules also affect the fields included in the [JSON data object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format) sent to a Pub/Sub topic. Threshold rules are _required_ if using email notifications. Threshold rules are _optional_ if only setting a [`pubsubTopic` NotificationsRule](#NotificationsRule), unless you want your JSON data object to include data about the thresholds you set. For more information, see [set budget threshold rules and actions](https://cloud.google.com/billing/docs/how-to/budgets#budget-actions).
 * 
 */
public final class GoogleCloudBillingBudgetsV1ThresholdRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1ThresholdRuleResponse Empty = new GoogleCloudBillingBudgetsV1ThresholdRuleResponse();

    /**
     * Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set.
     * 
     */
    @InputImport(name="spendBasis", required=true)
    private final String spendBasis;

    public String getSpendBasis() {
        return this.spendBasis;
    }

    /**
     * Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5 = 50%. Validation: non-negative number.
     * 
     */
    @InputImport(name="thresholdPercent", required=true)
    private final Double thresholdPercent;

    public Double getThresholdPercent() {
        return this.thresholdPercent;
    }

    public GoogleCloudBillingBudgetsV1ThresholdRuleResponse(
        String spendBasis,
        Double thresholdPercent) {
        this.spendBasis = Objects.requireNonNull(spendBasis, "expected parameter 'spendBasis' to be non-null");
        this.thresholdPercent = Objects.requireNonNull(thresholdPercent, "expected parameter 'thresholdPercent' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1ThresholdRuleResponse() {
        this.spendBasis = null;
        this.thresholdPercent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1ThresholdRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String spendBasis;
        private Double thresholdPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1ThresholdRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spendBasis = defaults.spendBasis;
    	      this.thresholdPercent = defaults.thresholdPercent;
        }

        public Builder setSpendBasis(String spendBasis) {
            this.spendBasis = Objects.requireNonNull(spendBasis);
            return this;
        }

        public Builder setThresholdPercent(Double thresholdPercent) {
            this.thresholdPercent = Objects.requireNonNull(thresholdPercent);
            return this;
        }

        public GoogleCloudBillingBudgetsV1ThresholdRuleResponse build() {
            return new GoogleCloudBillingBudgetsV1ThresholdRuleResponse(spendBasis, thresholdPercent);
        }
    }
}
