// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1EduDataResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Identity information for the Cloud Channel Customer.
 * 
 */
public final class GoogleCloudChannelV1CloudIdentityInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1CloudIdentityInfoResponse Empty = new GoogleCloudChannelV1CloudIdentityInfoResponse();

    /**
     * URI of Customer's Admin console dashboard.
     * 
     */
    @InputImport(name="adminConsoleUri", required=true)
    private final String adminConsoleUri;

    public String getAdminConsoleUri() {
        return this.adminConsoleUri;
    }

    /**
     * The alternate email.
     * 
     */
    @InputImport(name="alternateEmail", required=true)
    private final String alternateEmail;

    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    /**
     * CustomerType indicates verification type needed for using services.
     * 
     */
    @InputImport(name="customerType", required=true)
    private final String customerType;

    public String getCustomerType() {
        return this.customerType;
    }

    /**
     * Edu information about the customer.
     * 
     */
    @InputImport(name="eduData", required=true)
    private final GoogleCloudChannelV1EduDataResponse eduData;

    public GoogleCloudChannelV1EduDataResponse getEduData() {
        return this.eduData;
    }

    /**
     * Whether the domain is verified. This field is not returned for a Customer's cloud_identity_info resource. Partners can use the domains.get() method of the Workspace SDK's Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in to track domain verification of their resolve Workspace customers.
     * 
     */
    @InputImport(name="isDomainVerified", required=true)
    private final Boolean isDomainVerified;

    public Boolean getIsDomainVerified() {
        return this.isDomainVerified;
    }

    /**
     * Language code.
     * 
     */
    @InputImport(name="languageCode", required=true)
    private final String languageCode;

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * Phone number associated with the Cloud Identity.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * The primary domain name.
     * 
     */
    @InputImport(name="primaryDomain", required=true)
    private final String primaryDomain;

    public String getPrimaryDomain() {
        return this.primaryDomain;
    }

    public GoogleCloudChannelV1CloudIdentityInfoResponse(
        String adminConsoleUri,
        String alternateEmail,
        String customerType,
        GoogleCloudChannelV1EduDataResponse eduData,
        Boolean isDomainVerified,
        String languageCode,
        String phoneNumber,
        String primaryDomain) {
        this.adminConsoleUri = Objects.requireNonNull(adminConsoleUri, "expected parameter 'adminConsoleUri' to be non-null");
        this.alternateEmail = Objects.requireNonNull(alternateEmail, "expected parameter 'alternateEmail' to be non-null");
        this.customerType = Objects.requireNonNull(customerType, "expected parameter 'customerType' to be non-null");
        this.eduData = Objects.requireNonNull(eduData, "expected parameter 'eduData' to be non-null");
        this.isDomainVerified = Objects.requireNonNull(isDomainVerified, "expected parameter 'isDomainVerified' to be non-null");
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.primaryDomain = Objects.requireNonNull(primaryDomain, "expected parameter 'primaryDomain' to be non-null");
    }

    private GoogleCloudChannelV1CloudIdentityInfoResponse() {
        this.adminConsoleUri = null;
        this.alternateEmail = null;
        this.customerType = null;
        this.eduData = null;
        this.isDomainVerified = null;
        this.languageCode = null;
        this.phoneNumber = null;
        this.primaryDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminConsoleUri;
        private String alternateEmail;
        private String customerType;
        private GoogleCloudChannelV1EduDataResponse eduData;
        private Boolean isDomainVerified;
        private String languageCode;
        private String phoneNumber;
        private String primaryDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminConsoleUri = defaults.adminConsoleUri;
    	      this.alternateEmail = defaults.alternateEmail;
    	      this.customerType = defaults.customerType;
    	      this.eduData = defaults.eduData;
    	      this.isDomainVerified = defaults.isDomainVerified;
    	      this.languageCode = defaults.languageCode;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.primaryDomain = defaults.primaryDomain;
        }

        public Builder setAdminConsoleUri(String adminConsoleUri) {
            this.adminConsoleUri = Objects.requireNonNull(adminConsoleUri);
            return this;
        }

        public Builder setAlternateEmail(String alternateEmail) {
            this.alternateEmail = Objects.requireNonNull(alternateEmail);
            return this;
        }

        public Builder setCustomerType(String customerType) {
            this.customerType = Objects.requireNonNull(customerType);
            return this;
        }

        public Builder setEduData(GoogleCloudChannelV1EduDataResponse eduData) {
            this.eduData = Objects.requireNonNull(eduData);
            return this;
        }

        public Builder setIsDomainVerified(Boolean isDomainVerified) {
            this.isDomainVerified = Objects.requireNonNull(isDomainVerified);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPrimaryDomain(String primaryDomain) {
            this.primaryDomain = Objects.requireNonNull(primaryDomain);
            return this;
        }

        public GoogleCloudChannelV1CloudIdentityInfoResponse build() {
            return new GoogleCloudChannelV1CloudIdentityInfoResponse(adminConsoleUri, alternateEmail, customerType, eduData, isDomainVerified, languageCode, phoneNumber, primaryDomain);
        }
    }
}
