// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Optional. The type of basis used to determine if spend has passed the threshold. Behavior defaults to CURRENT_SPEND if not set.
     * 
     */
    @EnumType
    public enum GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis {
        /**
         * Unspecified threshold basis.
         * 
         */
        BasisUnspecified("BASIS_UNSPECIFIED"),
        /**
         * Use current spend as the basis for comparison against the threshold.
         * 
         */
        CurrentSpend("CURRENT_SPEND"),
        /**
         * Use forecasted spend for the period as the basis for comparison against the threshold. FORECASTED_SPEND can only be set when the budget's time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
         * 
         */
        ForecastedSpend("FORECASTED_SPEND");

        private final String value;

        GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudBillingBudgetsV1beta1ThresholdRuleSpendBasis[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
