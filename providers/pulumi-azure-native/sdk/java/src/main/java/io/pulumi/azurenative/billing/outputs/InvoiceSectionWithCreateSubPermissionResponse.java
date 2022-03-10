// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.billing.outputs;

import io.pulumi.azurenative.billing.outputs.AzurePlanResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class InvoiceSectionWithCreateSubPermissionResponse {
    /**
     * The name of the billing profile for the invoice section.
     * 
     */
    private final String billingProfileDisplayName;
    /**
     * The ID of the billing profile for the invoice section.
     * 
     */
    private final String billingProfileId;
    /**
     * The billing profile spending limit.
     * 
     */
    private final String billingProfileSpendingLimit;
    /**
     * The status of the billing profile.
     * 
     */
    private final String billingProfileStatus;
    /**
     * Reason for the specified billing profile status.
     * 
     */
    private final String billingProfileStatusReasonCode;
    /**
     * The system generated unique identifier for a billing profile.
     * 
     */
    private final String billingProfileSystemId;
    /**
     * Enabled azure plans for the associated billing profile.
     * 
     */
    private final @Nullable List<AzurePlanResponse> enabledAzurePlans;
    /**
     * The name of the invoice section.
     * 
     */
    private final String invoiceSectionDisplayName;
    /**
     * The ID of the invoice section.
     * 
     */
    private final String invoiceSectionId;
    /**
     * The system generated unique identifier for an invoice section.
     * 
     */
    private final String invoiceSectionSystemId;

    @OutputCustomType.Constructor
    private InvoiceSectionWithCreateSubPermissionResponse(
        @OutputCustomType.Parameter("billingProfileDisplayName") String billingProfileDisplayName,
        @OutputCustomType.Parameter("billingProfileId") String billingProfileId,
        @OutputCustomType.Parameter("billingProfileSpendingLimit") String billingProfileSpendingLimit,
        @OutputCustomType.Parameter("billingProfileStatus") String billingProfileStatus,
        @OutputCustomType.Parameter("billingProfileStatusReasonCode") String billingProfileStatusReasonCode,
        @OutputCustomType.Parameter("billingProfileSystemId") String billingProfileSystemId,
        @OutputCustomType.Parameter("enabledAzurePlans") @Nullable List<AzurePlanResponse> enabledAzurePlans,
        @OutputCustomType.Parameter("invoiceSectionDisplayName") String invoiceSectionDisplayName,
        @OutputCustomType.Parameter("invoiceSectionId") String invoiceSectionId,
        @OutputCustomType.Parameter("invoiceSectionSystemId") String invoiceSectionSystemId) {
        this.billingProfileDisplayName = billingProfileDisplayName;
        this.billingProfileId = billingProfileId;
        this.billingProfileSpendingLimit = billingProfileSpendingLimit;
        this.billingProfileStatus = billingProfileStatus;
        this.billingProfileStatusReasonCode = billingProfileStatusReasonCode;
        this.billingProfileSystemId = billingProfileSystemId;
        this.enabledAzurePlans = enabledAzurePlans;
        this.invoiceSectionDisplayName = invoiceSectionDisplayName;
        this.invoiceSectionId = invoiceSectionId;
        this.invoiceSectionSystemId = invoiceSectionSystemId;
    }

    /**
     * The name of the billing profile for the invoice section.
     * 
    */
    public String getBillingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }
    /**
     * The ID of the billing profile for the invoice section.
     * 
    */
    public String getBillingProfileId() {
        return this.billingProfileId;
    }
    /**
     * The billing profile spending limit.
     * 
    */
    public String getBillingProfileSpendingLimit() {
        return this.billingProfileSpendingLimit;
    }
    /**
     * The status of the billing profile.
     * 
    */
    public String getBillingProfileStatus() {
        return this.billingProfileStatus;
    }
    /**
     * Reason for the specified billing profile status.
     * 
    */
    public String getBillingProfileStatusReasonCode() {
        return this.billingProfileStatusReasonCode;
    }
    /**
     * The system generated unique identifier for a billing profile.
     * 
    */
    public String getBillingProfileSystemId() {
        return this.billingProfileSystemId;
    }
    /**
     * Enabled azure plans for the associated billing profile.
     * 
    */
    public List<AzurePlanResponse> getEnabledAzurePlans() {
        return this.enabledAzurePlans == null ? List.of() : this.enabledAzurePlans;
    }
    /**
     * The name of the invoice section.
     * 
    */
    public String getInvoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }
    /**
     * The ID of the invoice section.
     * 
    */
    public String getInvoiceSectionId() {
        return this.invoiceSectionId;
    }
    /**
     * The system generated unique identifier for an invoice section.
     * 
    */
    public String getInvoiceSectionSystemId() {
        return this.invoiceSectionSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvoiceSectionWithCreateSubPermissionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String billingProfileDisplayName;
        private String billingProfileId;
        private String billingProfileSpendingLimit;
        private String billingProfileStatus;
        private String billingProfileStatusReasonCode;
        private String billingProfileSystemId;
        private @Nullable List<AzurePlanResponse> enabledAzurePlans;
        private String invoiceSectionDisplayName;
        private String invoiceSectionId;
        private String invoiceSectionSystemId;

        public Builder() {
    	      // Empty
        }

        public Builder(InvoiceSectionWithCreateSubPermissionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingProfileDisplayName = defaults.billingProfileDisplayName;
    	      this.billingProfileId = defaults.billingProfileId;
    	      this.billingProfileSpendingLimit = defaults.billingProfileSpendingLimit;
    	      this.billingProfileStatus = defaults.billingProfileStatus;
    	      this.billingProfileStatusReasonCode = defaults.billingProfileStatusReasonCode;
    	      this.billingProfileSystemId = defaults.billingProfileSystemId;
    	      this.enabledAzurePlans = defaults.enabledAzurePlans;
    	      this.invoiceSectionDisplayName = defaults.invoiceSectionDisplayName;
    	      this.invoiceSectionId = defaults.invoiceSectionId;
    	      this.invoiceSectionSystemId = defaults.invoiceSectionSystemId;
        }

        public Builder setBillingProfileDisplayName(String billingProfileDisplayName) {
            this.billingProfileDisplayName = Objects.requireNonNull(billingProfileDisplayName);
            return this;
        }

        public Builder setBillingProfileId(String billingProfileId) {
            this.billingProfileId = Objects.requireNonNull(billingProfileId);
            return this;
        }

        public Builder setBillingProfileSpendingLimit(String billingProfileSpendingLimit) {
            this.billingProfileSpendingLimit = Objects.requireNonNull(billingProfileSpendingLimit);
            return this;
        }

        public Builder setBillingProfileStatus(String billingProfileStatus) {
            this.billingProfileStatus = Objects.requireNonNull(billingProfileStatus);
            return this;
        }

        public Builder setBillingProfileStatusReasonCode(String billingProfileStatusReasonCode) {
            this.billingProfileStatusReasonCode = Objects.requireNonNull(billingProfileStatusReasonCode);
            return this;
        }

        public Builder setBillingProfileSystemId(String billingProfileSystemId) {
            this.billingProfileSystemId = Objects.requireNonNull(billingProfileSystemId);
            return this;
        }

        public Builder setEnabledAzurePlans(@Nullable List<AzurePlanResponse> enabledAzurePlans) {
            this.enabledAzurePlans = enabledAzurePlans;
            return this;
        }

        public Builder setInvoiceSectionDisplayName(String invoiceSectionDisplayName) {
            this.invoiceSectionDisplayName = Objects.requireNonNull(invoiceSectionDisplayName);
            return this;
        }

        public Builder setInvoiceSectionId(String invoiceSectionId) {
            this.invoiceSectionId = Objects.requireNonNull(invoiceSectionId);
            return this;
        }

        public Builder setInvoiceSectionSystemId(String invoiceSectionSystemId) {
            this.invoiceSectionSystemId = Objects.requireNonNull(invoiceSectionSystemId);
            return this;
        }
        public InvoiceSectionWithCreateSubPermissionResponse build() {
            return new InvoiceSectionWithCreateSubPermissionResponse(billingProfileDisplayName, billingProfileId, billingProfileSpendingLimit, billingProfileStatus, billingProfileStatusReasonCode, billingProfileSystemId, enabledAzurePlans, invoiceSectionDisplayName, invoiceSectionId, invoiceSectionSystemId);
        }
    }
}
