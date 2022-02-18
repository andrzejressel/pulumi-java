// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudchannel_v1.enums.GoogleCloudChannelV1RenewalSettingsPaymentPlan;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1PeriodArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Renewal settings for renewable Offers.
 * 
 */
public final class GoogleCloudChannelV1RenewalSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1RenewalSettingsArgs Empty = new GoogleCloudChannelV1RenewalSettingsArgs();

    /**
     * If false, the plan will be completed at the end date.
     * 
     */
    @InputImport(name="enableRenewal")
    private final @Nullable Input<Boolean> enableRenewal;

    public Input<Boolean> getEnableRenewal() {
        return this.enableRenewal == null ? Input.empty() : this.enableRenewal;
    }

    /**
     * Describes how frequently the reseller will be billed, such as once per month.
     * 
     */
    @InputImport(name="paymentCycle")
    private final @Nullable Input<GoogleCloudChannelV1PeriodArgs> paymentCycle;

    public Input<GoogleCloudChannelV1PeriodArgs> getPaymentCycle() {
        return this.paymentCycle == null ? Input.empty() : this.paymentCycle;
    }

    /**
     * Describes how a reseller will be billed.
     * 
     */
    @InputImport(name="paymentPlan")
    private final @Nullable Input<GoogleCloudChannelV1RenewalSettingsPaymentPlan> paymentPlan;

    public Input<GoogleCloudChannelV1RenewalSettingsPaymentPlan> getPaymentPlan() {
        return this.paymentPlan == null ? Input.empty() : this.paymentPlan;
    }

    /**
     * If true and enable_renewal = true, the unit (for example seats or licenses) will be set to the number of active units at renewal time.
     * 
     */
    @InputImport(name="resizeUnitCount")
    private final @Nullable Input<Boolean> resizeUnitCount;

    public Input<Boolean> getResizeUnitCount() {
        return this.resizeUnitCount == null ? Input.empty() : this.resizeUnitCount;
    }

    public GoogleCloudChannelV1RenewalSettingsArgs(
        @Nullable Input<Boolean> enableRenewal,
        @Nullable Input<GoogleCloudChannelV1PeriodArgs> paymentCycle,
        @Nullable Input<GoogleCloudChannelV1RenewalSettingsPaymentPlan> paymentPlan,
        @Nullable Input<Boolean> resizeUnitCount) {
        this.enableRenewal = enableRenewal;
        this.paymentCycle = paymentCycle;
        this.paymentPlan = paymentPlan;
        this.resizeUnitCount = resizeUnitCount;
    }

    private GoogleCloudChannelV1RenewalSettingsArgs() {
        this.enableRenewal = Input.empty();
        this.paymentCycle = Input.empty();
        this.paymentPlan = Input.empty();
        this.resizeUnitCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1RenewalSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableRenewal;
        private @Nullable Input<GoogleCloudChannelV1PeriodArgs> paymentCycle;
        private @Nullable Input<GoogleCloudChannelV1RenewalSettingsPaymentPlan> paymentPlan;
        private @Nullable Input<Boolean> resizeUnitCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1RenewalSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRenewal = defaults.enableRenewal;
    	      this.paymentCycle = defaults.paymentCycle;
    	      this.paymentPlan = defaults.paymentPlan;
    	      this.resizeUnitCount = defaults.resizeUnitCount;
        }

        public Builder setEnableRenewal(@Nullable Input<Boolean> enableRenewal) {
            this.enableRenewal = enableRenewal;
            return this;
        }

        public Builder setEnableRenewal(@Nullable Boolean enableRenewal) {
            this.enableRenewal = Input.ofNullable(enableRenewal);
            return this;
        }

        public Builder setPaymentCycle(@Nullable Input<GoogleCloudChannelV1PeriodArgs> paymentCycle) {
            this.paymentCycle = paymentCycle;
            return this;
        }

        public Builder setPaymentCycle(@Nullable GoogleCloudChannelV1PeriodArgs paymentCycle) {
            this.paymentCycle = Input.ofNullable(paymentCycle);
            return this;
        }

        public Builder setPaymentPlan(@Nullable Input<GoogleCloudChannelV1RenewalSettingsPaymentPlan> paymentPlan) {
            this.paymentPlan = paymentPlan;
            return this;
        }

        public Builder setPaymentPlan(@Nullable GoogleCloudChannelV1RenewalSettingsPaymentPlan paymentPlan) {
            this.paymentPlan = Input.ofNullable(paymentPlan);
            return this;
        }

        public Builder setResizeUnitCount(@Nullable Input<Boolean> resizeUnitCount) {
            this.resizeUnitCount = resizeUnitCount;
            return this;
        }

        public Builder setResizeUnitCount(@Nullable Boolean resizeUnitCount) {
            this.resizeUnitCount = Input.ofNullable(resizeUnitCount);
            return this;
        }

        public GoogleCloudChannelV1RenewalSettingsArgs build() {
            return new GoogleCloudChannelV1RenewalSettingsArgs(enableRenewal, paymentCycle, paymentPlan, resizeUnitCount);
        }
    }
}
