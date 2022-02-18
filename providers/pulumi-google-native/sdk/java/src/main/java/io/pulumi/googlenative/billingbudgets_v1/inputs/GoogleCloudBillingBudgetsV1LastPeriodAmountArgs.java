// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import java.util.Objects;


/**
 * Describes a budget amount targeted to the last Filter.calendar_period spend. At this time, the amount is automatically 100% of the last calendar period's spend; that is, there are no other options yet. LastPeriodAmount cannot be set for a budget configured with a Filter.custom_period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1LastPeriodAmountArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1LastPeriodAmountArgs Empty = new GoogleCloudBillingBudgetsV1LastPeriodAmountArgs();

    public GoogleCloudBillingBudgetsV1LastPeriodAmountArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1LastPeriodAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1LastPeriodAmountArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleCloudBillingBudgetsV1LastPeriodAmountArgs build() {
            return new GoogleCloudBillingBudgetsV1LastPeriodAmountArgs();
        }
    }
}
