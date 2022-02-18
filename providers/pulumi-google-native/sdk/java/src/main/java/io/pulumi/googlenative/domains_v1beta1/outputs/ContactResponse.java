// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1beta1.outputs.PostalAddressResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContactResponse {
    /**
     * Email address of the contact.
     * 
     */
    private final String email;
    /**
     * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    private final String faxNumber;
    /**
     * Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    private final String phoneNumber;
    /**
     * Postal address of the contact.
     * 
     */
    private final PostalAddressResponse postalAddress;

    @OutputCustomType.Constructor({"email","faxNumber","phoneNumber","postalAddress"})
    private ContactResponse(
        String email,
        String faxNumber,
        String phoneNumber,
        PostalAddressResponse postalAddress) {
        this.email = Objects.requireNonNull(email);
        this.faxNumber = Objects.requireNonNull(faxNumber);
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
        this.postalAddress = Objects.requireNonNull(postalAddress);
    }

    /**
     * Email address of the contact.
     * 
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }
    /**
     * Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Postal address of the contact.
     * 
     */
    public PostalAddressResponse getPostalAddress() {
        return this.postalAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String faxNumber;
        private String phoneNumber;
        private PostalAddressResponse postalAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.faxNumber = defaults.faxNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.postalAddress = defaults.postalAddress;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = Objects.requireNonNull(faxNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPostalAddress(PostalAddressResponse postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }

        public ContactResponse build() {
            return new ContactResponse(email, faxNumber, phoneNumber, postalAddress);
        }
    }
}
