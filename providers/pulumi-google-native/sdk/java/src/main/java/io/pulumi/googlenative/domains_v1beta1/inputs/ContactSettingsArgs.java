// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.domains_v1beta1.enums.ContactSettingsPrivacy;
import io.pulumi.googlenative.domains_v1beta1.inputs.ContactArgs;
import java.util.Objects;


/**
 * Defines the contact information associated with a `Registration`. [ICANN](https://icann.org/) requires all domain names to have associated contact information. The `registrant_contact` is considered the domain's legal owner, and often the other contacts are identical.
 * 
 */
public final class ContactSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactSettingsArgs Empty = new ContactSettingsArgs();

    /**
     * The administrative contact for the `Registration`.
     * 
     */
    @InputImport(name="adminContact", required=true)
    private final Input<ContactArgs> adminContact;

    public Input<ContactArgs> getAdminContact() {
        return this.adminContact;
    }

    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    @InputImport(name="privacy", required=true)
    private final Input<ContactSettingsPrivacy> privacy;

    public Input<ContactSettingsPrivacy> getPrivacy() {
        return this.privacy;
    }

    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    @InputImport(name="registrantContact", required=true)
    private final Input<ContactArgs> registrantContact;

    public Input<ContactArgs> getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * The technical contact for the `Registration`.
     * 
     */
    @InputImport(name="technicalContact", required=true)
    private final Input<ContactArgs> technicalContact;

    public Input<ContactArgs> getTechnicalContact() {
        return this.technicalContact;
    }

    public ContactSettingsArgs(
        Input<ContactArgs> adminContact,
        Input<ContactSettingsPrivacy> privacy,
        Input<ContactArgs> registrantContact,
        Input<ContactArgs> technicalContact) {
        this.adminContact = Objects.requireNonNull(adminContact, "expected parameter 'adminContact' to be non-null");
        this.privacy = Objects.requireNonNull(privacy, "expected parameter 'privacy' to be non-null");
        this.registrantContact = Objects.requireNonNull(registrantContact, "expected parameter 'registrantContact' to be non-null");
        this.technicalContact = Objects.requireNonNull(technicalContact, "expected parameter 'technicalContact' to be non-null");
    }

    private ContactSettingsArgs() {
        this.adminContact = Input.empty();
        this.privacy = Input.empty();
        this.registrantContact = Input.empty();
        this.technicalContact = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ContactArgs> adminContact;
        private Input<ContactSettingsPrivacy> privacy;
        private Input<ContactArgs> registrantContact;
        private Input<ContactArgs> technicalContact;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContact = defaults.adminContact;
    	      this.privacy = defaults.privacy;
    	      this.registrantContact = defaults.registrantContact;
    	      this.technicalContact = defaults.technicalContact;
        }

        public Builder setAdminContact(Input<ContactArgs> adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }

        public Builder setAdminContact(ContactArgs adminContact) {
            this.adminContact = Input.of(Objects.requireNonNull(adminContact));
            return this;
        }

        public Builder setPrivacy(Input<ContactSettingsPrivacy> privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }

        public Builder setPrivacy(ContactSettingsPrivacy privacy) {
            this.privacy = Input.of(Objects.requireNonNull(privacy));
            return this;
        }

        public Builder setRegistrantContact(Input<ContactArgs> registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }

        public Builder setRegistrantContact(ContactArgs registrantContact) {
            this.registrantContact = Input.of(Objects.requireNonNull(registrantContact));
            return this;
        }

        public Builder setTechnicalContact(Input<ContactArgs> technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }

        public Builder setTechnicalContact(ContactArgs technicalContact) {
            this.technicalContact = Input.of(Objects.requireNonNull(technicalContact));
            return this;
        }

        public ContactSettingsArgs build() {
            return new ContactSettingsArgs(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}
