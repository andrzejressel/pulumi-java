// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.RatePlanArgs;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RateRangeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1RevenueShareRangeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleTypeMoneyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create a rate plan that is associated with an API product in an organization. Using rate plans, API product owners can monetize their API products by configuring one or more of the following: - Billing frequency - Initial setup fees for using an API product - Payment funding model (postpaid only) - Fixed recurring or consumption-based charges for using an API product - Revenue sharing with developer partners An API product can have multiple rate plans associated with it but *only one* rate plan can be active at any point of time. **Note: From the developer's perspective, they purchase API products not rate plans.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:apigee/v1:RatePlan")
public class RatePlan extends io.pulumi.resources.CustomResource {
    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    @OutputExport(name="apiproduct", type=String.class, parameters={})
    private Output<String> apiproduct;

    /**
     * @return Name of the API product that the rate plan is associated with.
     * 
     */
    public Output<String> getApiproduct() {
        return this.apiproduct;
    }
    /**
     * Frequency at which the customer will be billed.
     * 
     */
    @OutputExport(name="billingPeriod", type=String.class, parameters={})
    private Output<String> billingPeriod;

    /**
     * @return Frequency at which the customer will be billed.
     * 
     */
    public Output<String> getBillingPeriod() {
        return this.billingPeriod;
    }
    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    @OutputExport(name="consumptionPricingRates", type=List.class, parameters={GoogleCloudApigeeV1RateRangeResponse.class})
    private Output<List<GoogleCloudApigeeV1RateRangeResponse>> consumptionPricingRates;

    /**
     * @return API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    public Output<List<GoogleCloudApigeeV1RateRangeResponse>> getConsumptionPricingRates() {
        return this.consumptionPricingRates;
    }
    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    @OutputExport(name="consumptionPricingType", type=String.class, parameters={})
    private Output<String> consumptionPricingType;

    /**
     * @return Pricing model used for consumption-based charges.
     * 
     */
    public Output<String> getConsumptionPricingType() {
        return this.consumptionPricingType;
    }
    /**
     * Time that the rate plan was created in milliseconds since epoch.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time that the rate plan was created in milliseconds since epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    @OutputExport(name="currencyCode", type=String.class, parameters={})
    private Output<String> currencyCode;

    /**
     * @return Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    public Output<String> getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Description of the rate plan.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the rate plan.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Display name of the rate plan.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Display name of the rate plan.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    @OutputExport(name="fixedFeeFrequency", type=Integer.class, parameters={})
    private Output<Integer> fixedFeeFrequency;

    /**
     * @return Frequency at which the fixed fee is charged.
     * 
     */
    public Output<Integer> getFixedFeeFrequency() {
        return this.fixedFeeFrequency;
    }
    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    @OutputExport(name="fixedRecurringFee", type=GoogleTypeMoneyResponse.class, parameters={})
    private Output<GoogleTypeMoneyResponse> fixedRecurringFee;

    /**
     * @return Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    public Output<GoogleTypeMoneyResponse> getFixedRecurringFee() {
        return this.fixedRecurringFee;
    }
    /**
     * Time the rate plan was last modified in milliseconds since epoch.
     * 
     */
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Time the rate plan was last modified in milliseconds since epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the rate plan.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the rate plan.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Details of the revenue sharing model.
     * 
     */
    @OutputExport(name="revenueShareRates", type=List.class, parameters={GoogleCloudApigeeV1RevenueShareRangeResponse.class})
    private Output<List<GoogleCloudApigeeV1RevenueShareRangeResponse>> revenueShareRates;

    /**
     * @return Details of the revenue sharing model.
     * 
     */
    public Output<List<GoogleCloudApigeeV1RevenueShareRangeResponse>> getRevenueShareRates() {
        return this.revenueShareRates;
    }
    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    @OutputExport(name="revenueShareType", type=String.class, parameters={})
    private Output<String> revenueShareType;

    /**
     * @return Method used to calculate the revenue that is shared with developers.
     * 
     */
    public Output<String> getRevenueShareType() {
        return this.revenueShareType;
    }
    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    @OutputExport(name="setupFee", type=GoogleTypeMoneyResponse.class, parameters={})
    private Output<GoogleTypeMoneyResponse> setupFee;

    /**
     * @return Initial, one-time fee paid when purchasing the API product.
     * 
     */
    public Output<GoogleTypeMoneyResponse> getSetupFee() {
        return this.setupFee;
    }
    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the rate plan (draft or published).
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RatePlan(String name, RatePlanArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:RatePlan", name, args == null ? RatePlanArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RatePlan(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:RatePlan", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RatePlan get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RatePlan(name, id, options);
    }
}
