// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.outputs;

import io.pulumi.azurenative.saas.outputs.SaasPropertiesResponseTerm;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SaasResourceResponseProperties {
    /**
     * Whether the SaaS subscription will auto renew upon term end.
     * 
     */
    private final @Nullable Boolean autoRenew;
    /**
     * The created date of this resource.
     * 
     */
    private final String created;
    /**
     * Whether the current term is a Free Trial term
     * 
     */
    private final @Nullable Boolean isFreeTrial;
    /**
     * The last modifier date if this resource.
     * 
     */
    private final @Nullable String lastModified;
    /**
     * The offer id.
     * 
     */
    private final @Nullable String offerId;
    /**
     * The metadata about the SaaS subscription such as the AzureSubscriptionId and ResourceUri.
     * 
     */
    private final @Nullable Map<String,String> paymentChannelMetadata;
    /**
     * The Payment channel for the SaasSubscription.
     * 
     */
    private final @Nullable String paymentChannelType;
    /**
     * The publisher id.
     * 
     */
    private final @Nullable String publisherId;
    /**
     * The environment in the publisher side for this resource.
     * 
     */
    private final @Nullable String publisherTestEnvironment;
    /**
     * The seat count.
     * 
     */
    private final @Nullable Double quantity;
    /**
     * The SaaS resource name.
     * 
     */
    private final @Nullable String saasResourceName;
    /**
     * The saas session id used for dev service migration request.
     * 
     */
    private final @Nullable String saasSessionId;
    /**
     * The saas subscription id used for tenant to subscription level migration request.
     * 
     */
    private final @Nullable String saasSubscriptionId;
    /**
     * The plan id.
     * 
     */
    private final @Nullable String skuId;
    /**
     * The SaaS Subscription Status.
     * 
     */
    private final @Nullable String status;
    /**
     * The current Term object.
     * 
     */
    private final @Nullable SaasPropertiesResponseTerm term;
    /**
     * The current Term id.
     * 
     */
    private final @Nullable String termId;

    @OutputCustomType.Constructor
    private SaasResourceResponseProperties(
        @OutputCustomType.Parameter("autoRenew") @Nullable Boolean autoRenew,
        @OutputCustomType.Parameter("created") String created,
        @OutputCustomType.Parameter("isFreeTrial") @Nullable Boolean isFreeTrial,
        @OutputCustomType.Parameter("lastModified") @Nullable String lastModified,
        @OutputCustomType.Parameter("offerId") @Nullable String offerId,
        @OutputCustomType.Parameter("paymentChannelMetadata") @Nullable Map<String,String> paymentChannelMetadata,
        @OutputCustomType.Parameter("paymentChannelType") @Nullable String paymentChannelType,
        @OutputCustomType.Parameter("publisherId") @Nullable String publisherId,
        @OutputCustomType.Parameter("publisherTestEnvironment") @Nullable String publisherTestEnvironment,
        @OutputCustomType.Parameter("quantity") @Nullable Double quantity,
        @OutputCustomType.Parameter("saasResourceName") @Nullable String saasResourceName,
        @OutputCustomType.Parameter("saasSessionId") @Nullable String saasSessionId,
        @OutputCustomType.Parameter("saasSubscriptionId") @Nullable String saasSubscriptionId,
        @OutputCustomType.Parameter("skuId") @Nullable String skuId,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("term") @Nullable SaasPropertiesResponseTerm term,
        @OutputCustomType.Parameter("termId") @Nullable String termId) {
        this.autoRenew = autoRenew;
        this.created = created;
        this.isFreeTrial = isFreeTrial;
        this.lastModified = lastModified;
        this.offerId = offerId;
        this.paymentChannelMetadata = paymentChannelMetadata;
        this.paymentChannelType = paymentChannelType;
        this.publisherId = publisherId;
        this.publisherTestEnvironment = publisherTestEnvironment;
        this.quantity = quantity;
        this.saasResourceName = saasResourceName;
        this.saasSessionId = saasSessionId;
        this.saasSubscriptionId = saasSubscriptionId;
        this.skuId = skuId;
        this.status = status;
        this.term = term;
        this.termId = termId;
    }

    /**
     * Whether the SaaS subscription will auto renew upon term end.
     * 
    */
    public Optional<Boolean> getAutoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }
    /**
     * The created date of this resource.
     * 
    */
    public String getCreated() {
        return this.created;
    }
    /**
     * Whether the current term is a Free Trial term
     * 
    */
    public Optional<Boolean> getIsFreeTrial() {
        return Optional.ofNullable(this.isFreeTrial);
    }
    /**
     * The last modifier date if this resource.
     * 
    */
    public Optional<String> getLastModified() {
        return Optional.ofNullable(this.lastModified);
    }
    /**
     * The offer id.
     * 
    */
    public Optional<String> getOfferId() {
        return Optional.ofNullable(this.offerId);
    }
    /**
     * The metadata about the SaaS subscription such as the AzureSubscriptionId and ResourceUri.
     * 
    */
    public Map<String,String> getPaymentChannelMetadata() {
        return this.paymentChannelMetadata == null ? Map.of() : this.paymentChannelMetadata;
    }
    /**
     * The Payment channel for the SaasSubscription.
     * 
    */
    public Optional<String> getPaymentChannelType() {
        return Optional.ofNullable(this.paymentChannelType);
    }
    /**
     * The publisher id.
     * 
    */
    public Optional<String> getPublisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    /**
     * The environment in the publisher side for this resource.
     * 
    */
    public Optional<String> getPublisherTestEnvironment() {
        return Optional.ofNullable(this.publisherTestEnvironment);
    }
    /**
     * The seat count.
     * 
    */
    public Optional<Double> getQuantity() {
        return Optional.ofNullable(this.quantity);
    }
    /**
     * The SaaS resource name.
     * 
    */
    public Optional<String> getSaasResourceName() {
        return Optional.ofNullable(this.saasResourceName);
    }
    /**
     * The saas session id used for dev service migration request.
     * 
    */
    public Optional<String> getSaasSessionId() {
        return Optional.ofNullable(this.saasSessionId);
    }
    /**
     * The saas subscription id used for tenant to subscription level migration request.
     * 
    */
    public Optional<String> getSaasSubscriptionId() {
        return Optional.ofNullable(this.saasSubscriptionId);
    }
    /**
     * The plan id.
     * 
    */
    public Optional<String> getSkuId() {
        return Optional.ofNullable(this.skuId);
    }
    /**
     * The SaaS Subscription Status.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The current Term object.
     * 
    */
    public Optional<SaasPropertiesResponseTerm> getTerm() {
        return Optional.ofNullable(this.term);
    }
    /**
     * The current Term id.
     * 
    */
    public Optional<String> getTermId() {
        return Optional.ofNullable(this.termId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SaasResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoRenew;
        private String created;
        private @Nullable Boolean isFreeTrial;
        private @Nullable String lastModified;
        private @Nullable String offerId;
        private @Nullable Map<String,String> paymentChannelMetadata;
        private @Nullable String paymentChannelType;
        private @Nullable String publisherId;
        private @Nullable String publisherTestEnvironment;
        private @Nullable Double quantity;
        private @Nullable String saasResourceName;
        private @Nullable String saasSessionId;
        private @Nullable String saasSubscriptionId;
        private @Nullable String skuId;
        private @Nullable String status;
        private @Nullable SaasPropertiesResponseTerm term;
        private @Nullable String termId;

        public Builder() {
    	      // Empty
        }

        public Builder(SaasResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.created = defaults.created;
    	      this.isFreeTrial = defaults.isFreeTrial;
    	      this.lastModified = defaults.lastModified;
    	      this.offerId = defaults.offerId;
    	      this.paymentChannelMetadata = defaults.paymentChannelMetadata;
    	      this.paymentChannelType = defaults.paymentChannelType;
    	      this.publisherId = defaults.publisherId;
    	      this.publisherTestEnvironment = defaults.publisherTestEnvironment;
    	      this.quantity = defaults.quantity;
    	      this.saasResourceName = defaults.saasResourceName;
    	      this.saasSessionId = defaults.saasSessionId;
    	      this.saasSubscriptionId = defaults.saasSubscriptionId;
    	      this.skuId = defaults.skuId;
    	      this.status = defaults.status;
    	      this.term = defaults.term;
    	      this.termId = defaults.termId;
        }

        public Builder setAutoRenew(@Nullable Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setIsFreeTrial(@Nullable Boolean isFreeTrial) {
            this.isFreeTrial = isFreeTrial;
            return this;
        }

        public Builder setLastModified(@Nullable String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public Builder setOfferId(@Nullable String offerId) {
            this.offerId = offerId;
            return this;
        }

        public Builder setPaymentChannelMetadata(@Nullable Map<String,String> paymentChannelMetadata) {
            this.paymentChannelMetadata = paymentChannelMetadata;
            return this;
        }

        public Builder setPaymentChannelType(@Nullable String paymentChannelType) {
            this.paymentChannelType = paymentChannelType;
            return this;
        }

        public Builder setPublisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }

        public Builder setPublisherTestEnvironment(@Nullable String publisherTestEnvironment) {
            this.publisherTestEnvironment = publisherTestEnvironment;
            return this;
        }

        public Builder setQuantity(@Nullable Double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setSaasResourceName(@Nullable String saasResourceName) {
            this.saasResourceName = saasResourceName;
            return this;
        }

        public Builder setSaasSessionId(@Nullable String saasSessionId) {
            this.saasSessionId = saasSessionId;
            return this;
        }

        public Builder setSaasSubscriptionId(@Nullable String saasSubscriptionId) {
            this.saasSubscriptionId = saasSubscriptionId;
            return this;
        }

        public Builder setSkuId(@Nullable String skuId) {
            this.skuId = skuId;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTerm(@Nullable SaasPropertiesResponseTerm term) {
            this.term = term;
            return this;
        }

        public Builder setTermId(@Nullable String termId) {
            this.termId = termId;
            return this;
        }
        public SaasResourceResponseProperties build() {
            return new SaasResourceResponseProperties(autoRenew, created, isFreeTrial, lastModified, offerId, paymentChannelMetadata, paymentChannelType, publisherId, publisherTestEnvironment, quantity, saasResourceName, saasSessionId, saasSubscriptionId, skuId, status, term, termId);
        }
    }
}
