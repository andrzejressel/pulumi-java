// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanBillingPeriod;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanConsumptionPricingType;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanRevenueShareType;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanState;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1RateRangeArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1RevenueShareRangeArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeMoneyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RatePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final RatePlanArgs Empty = new RatePlanArgs();

    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    @InputImport(name="apiproduct")
    private final @Nullable Input<String> apiproduct;

    public Input<String> getApiproduct() {
        return this.apiproduct == null ? Input.empty() : this.apiproduct;
    }

    @InputImport(name="apiproductId", required=true)
    private final Input<String> apiproductId;

    public Input<String> getApiproductId() {
        return this.apiproductId;
    }

    /**
     * Frequency at which the customer will be billed.
     * 
     */
    @InputImport(name="billingPeriod")
    private final @Nullable Input<RatePlanBillingPeriod> billingPeriod;

    public Input<RatePlanBillingPeriod> getBillingPeriod() {
        return this.billingPeriod == null ? Input.empty() : this.billingPeriod;
    }

    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    @InputImport(name="consumptionPricingRates")
    private final @Nullable Input<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates;

    public Input<List<GoogleCloudApigeeV1RateRangeArgs>> getConsumptionPricingRates() {
        return this.consumptionPricingRates == null ? Input.empty() : this.consumptionPricingRates;
    }

    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    @InputImport(name="consumptionPricingType")
    private final @Nullable Input<RatePlanConsumptionPricingType> consumptionPricingType;

    public Input<RatePlanConsumptionPricingType> getConsumptionPricingType() {
        return this.consumptionPricingType == null ? Input.empty() : this.consumptionPricingType;
    }

    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    @InputImport(name="currencyCode")
    private final @Nullable Input<String> currencyCode;

    public Input<String> getCurrencyCode() {
        return this.currencyCode == null ? Input.empty() : this.currencyCode;
    }

    /**
     * Description of the rate plan.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Display name of the rate plan.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    @InputImport(name="fixedFeeFrequency")
    private final @Nullable Input<Integer> fixedFeeFrequency;

    public Input<Integer> getFixedFeeFrequency() {
        return this.fixedFeeFrequency == null ? Input.empty() : this.fixedFeeFrequency;
    }

    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    @InputImport(name="fixedRecurringFee")
    private final @Nullable Input<GoogleTypeMoneyArgs> fixedRecurringFee;

    public Input<GoogleTypeMoneyArgs> getFixedRecurringFee() {
        return this.fixedRecurringFee == null ? Input.empty() : this.fixedRecurringFee;
    }

    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Details of the revenue sharing model.
     * 
     */
    @InputImport(name="revenueShareRates")
    private final @Nullable Input<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates;

    public Input<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> getRevenueShareRates() {
        return this.revenueShareRates == null ? Input.empty() : this.revenueShareRates;
    }

    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    @InputImport(name="revenueShareType")
    private final @Nullable Input<RatePlanRevenueShareType> revenueShareType;

    public Input<RatePlanRevenueShareType> getRevenueShareType() {
        return this.revenueShareType == null ? Input.empty() : this.revenueShareType;
    }

    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    @InputImport(name="setupFee")
    private final @Nullable Input<GoogleTypeMoneyArgs> setupFee;

    public Input<GoogleTypeMoneyArgs> getSetupFee() {
        return this.setupFee == null ? Input.empty() : this.setupFee;
    }

    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<RatePlanState> state;

    public Input<RatePlanState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public RatePlanArgs(
        @Nullable Input<String> apiproduct,
        Input<String> apiproductId,
        @Nullable Input<RatePlanBillingPeriod> billingPeriod,
        @Nullable Input<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates,
        @Nullable Input<RatePlanConsumptionPricingType> consumptionPricingType,
        @Nullable Input<String> currencyCode,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> endTime,
        @Nullable Input<Integer> fixedFeeFrequency,
        @Nullable Input<GoogleTypeMoneyArgs> fixedRecurringFee,
        Input<String> organizationId,
        @Nullable Input<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates,
        @Nullable Input<RatePlanRevenueShareType> revenueShareType,
        @Nullable Input<GoogleTypeMoneyArgs> setupFee,
        @Nullable Input<String> startTime,
        @Nullable Input<RatePlanState> state) {
        this.apiproduct = apiproduct;
        this.apiproductId = Objects.requireNonNull(apiproductId, "expected parameter 'apiproductId' to be non-null");
        this.billingPeriod = billingPeriod;
        this.consumptionPricingRates = consumptionPricingRates;
        this.consumptionPricingType = consumptionPricingType;
        this.currencyCode = currencyCode;
        this.description = description;
        this.displayName = displayName;
        this.endTime = endTime;
        this.fixedFeeFrequency = fixedFeeFrequency;
        this.fixedRecurringFee = fixedRecurringFee;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.revenueShareRates = revenueShareRates;
        this.revenueShareType = revenueShareType;
        this.setupFee = setupFee;
        this.startTime = startTime;
        this.state = state;
    }

    private RatePlanArgs() {
        this.apiproduct = Input.empty();
        this.apiproductId = Input.empty();
        this.billingPeriod = Input.empty();
        this.consumptionPricingRates = Input.empty();
        this.consumptionPricingType = Input.empty();
        this.currencyCode = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.endTime = Input.empty();
        this.fixedFeeFrequency = Input.empty();
        this.fixedRecurringFee = Input.empty();
        this.organizationId = Input.empty();
        this.revenueShareRates = Input.empty();
        this.revenueShareType = Input.empty();
        this.setupFee = Input.empty();
        this.startTime = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RatePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiproduct;
        private Input<String> apiproductId;
        private @Nullable Input<RatePlanBillingPeriod> billingPeriod;
        private @Nullable Input<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates;
        private @Nullable Input<RatePlanConsumptionPricingType> consumptionPricingType;
        private @Nullable Input<String> currencyCode;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> endTime;
        private @Nullable Input<Integer> fixedFeeFrequency;
        private @Nullable Input<GoogleTypeMoneyArgs> fixedRecurringFee;
        private Input<String> organizationId;
        private @Nullable Input<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates;
        private @Nullable Input<RatePlanRevenueShareType> revenueShareType;
        private @Nullable Input<GoogleTypeMoneyArgs> setupFee;
        private @Nullable Input<String> startTime;
        private @Nullable Input<RatePlanState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(RatePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.apiproductId = defaults.apiproductId;
    	      this.billingPeriod = defaults.billingPeriod;
    	      this.consumptionPricingRates = defaults.consumptionPricingRates;
    	      this.consumptionPricingType = defaults.consumptionPricingType;
    	      this.currencyCode = defaults.currencyCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTime = defaults.endTime;
    	      this.fixedFeeFrequency = defaults.fixedFeeFrequency;
    	      this.fixedRecurringFee = defaults.fixedRecurringFee;
    	      this.organizationId = defaults.organizationId;
    	      this.revenueShareRates = defaults.revenueShareRates;
    	      this.revenueShareType = defaults.revenueShareType;
    	      this.setupFee = defaults.setupFee;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder setApiproduct(@Nullable Input<String> apiproduct) {
            this.apiproduct = apiproduct;
            return this;
        }

        public Builder setApiproduct(@Nullable String apiproduct) {
            this.apiproduct = Input.ofNullable(apiproduct);
            return this;
        }

        public Builder setApiproductId(Input<String> apiproductId) {
            this.apiproductId = Objects.requireNonNull(apiproductId);
            return this;
        }

        public Builder setApiproductId(String apiproductId) {
            this.apiproductId = Input.of(Objects.requireNonNull(apiproductId));
            return this;
        }

        public Builder setBillingPeriod(@Nullable Input<RatePlanBillingPeriod> billingPeriod) {
            this.billingPeriod = billingPeriod;
            return this;
        }

        public Builder setBillingPeriod(@Nullable RatePlanBillingPeriod billingPeriod) {
            this.billingPeriod = Input.ofNullable(billingPeriod);
            return this;
        }

        public Builder setConsumptionPricingRates(@Nullable Input<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates) {
            this.consumptionPricingRates = consumptionPricingRates;
            return this;
        }

        public Builder setConsumptionPricingRates(@Nullable List<GoogleCloudApigeeV1RateRangeArgs> consumptionPricingRates) {
            this.consumptionPricingRates = Input.ofNullable(consumptionPricingRates);
            return this;
        }

        public Builder setConsumptionPricingType(@Nullable Input<RatePlanConsumptionPricingType> consumptionPricingType) {
            this.consumptionPricingType = consumptionPricingType;
            return this;
        }

        public Builder setConsumptionPricingType(@Nullable RatePlanConsumptionPricingType consumptionPricingType) {
            this.consumptionPricingType = Input.ofNullable(consumptionPricingType);
            return this;
        }

        public Builder setCurrencyCode(@Nullable Input<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setCurrencyCode(@Nullable String currencyCode) {
            this.currencyCode = Input.ofNullable(currencyCode);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setFixedFeeFrequency(@Nullable Input<Integer> fixedFeeFrequency) {
            this.fixedFeeFrequency = fixedFeeFrequency;
            return this;
        }

        public Builder setFixedFeeFrequency(@Nullable Integer fixedFeeFrequency) {
            this.fixedFeeFrequency = Input.ofNullable(fixedFeeFrequency);
            return this;
        }

        public Builder setFixedRecurringFee(@Nullable Input<GoogleTypeMoneyArgs> fixedRecurringFee) {
            this.fixedRecurringFee = fixedRecurringFee;
            return this;
        }

        public Builder setFixedRecurringFee(@Nullable GoogleTypeMoneyArgs fixedRecurringFee) {
            this.fixedRecurringFee = Input.ofNullable(fixedRecurringFee);
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setRevenueShareRates(@Nullable Input<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates) {
            this.revenueShareRates = revenueShareRates;
            return this;
        }

        public Builder setRevenueShareRates(@Nullable List<GoogleCloudApigeeV1RevenueShareRangeArgs> revenueShareRates) {
            this.revenueShareRates = Input.ofNullable(revenueShareRates);
            return this;
        }

        public Builder setRevenueShareType(@Nullable Input<RatePlanRevenueShareType> revenueShareType) {
            this.revenueShareType = revenueShareType;
            return this;
        }

        public Builder setRevenueShareType(@Nullable RatePlanRevenueShareType revenueShareType) {
            this.revenueShareType = Input.ofNullable(revenueShareType);
            return this;
        }

        public Builder setSetupFee(@Nullable Input<GoogleTypeMoneyArgs> setupFee) {
            this.setupFee = setupFee;
            return this;
        }

        public Builder setSetupFee(@Nullable GoogleTypeMoneyArgs setupFee) {
            this.setupFee = Input.ofNullable(setupFee);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setState(@Nullable Input<RatePlanState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable RatePlanState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public RatePlanArgs build() {
            return new RatePlanArgs(apiproduct, apiproductId, billingPeriod, consumptionPricingRates, consumptionPricingType, currencyCode, description, displayName, endTime, fixedFeeFrequency, fixedRecurringFee, organizationId, revenueShareRates, revenueShareType, setupFee, startTime, state);
        }
    }
}
