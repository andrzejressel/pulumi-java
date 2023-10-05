// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamUserArgs Empty = new IamUserArgs();

    /**
     * The user&#39;s street address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The user&#39;s street address
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * A user&#39;s per-group role assignments, in JSON form
     * 
     */
    @Import(name="authGrantsJson", required=true)
    private Output<String> authGrantsJson;

    /**
     * @return A user&#39;s per-group role assignments, in JSON form
     * 
     */
    public Output<String> authGrantsJson() {
        return this.authGrantsJson;
    }

    /**
     * The user&#39;s city
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    /**
     * @return The user&#39;s city
     * 
     */
    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * To help characterize the user, the value can be any that are available from the view-contact-types operation
     * 
     */
    @Import(name="contactType")
    private @Nullable Output<String> contactType;

    /**
     * @return To help characterize the user, the value can be any that are available from the view-contact-types operation
     * 
     */
    public Optional<Output<String>> contactType() {
        return Optional.ofNullable(this.contactType);
    }

    /**
     * As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation
     * 
     */
    @Import(name="country", required=true)
    private Output<String> country;

    /**
     * @return As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation
     * 
     */
    public Output<String> country() {
        return this.country;
    }

    /**
     * The user&#39;s email address
     * 
     */
    @Import(name="email", required=true)
    private Output<String> email;

    /**
     * @return The user&#39;s email address
     * 
     */
    public Output<String> email() {
        return this.email;
    }

    /**
     * Indicates whether two-factor authentication is allowed
     * 
     */
    @Import(name="enableTfa", required=true)
    private Output<Boolean> enableTfa;

    /**
     * @return Indicates whether two-factor authentication is allowed
     * 
     */
    public Output<Boolean> enableTfa() {
        return this.enableTfa;
    }

    /**
     * The user&#39;s first name
     * 
     */
    @Import(name="firstName", required=true)
    private Output<String> firstName;

    /**
     * @return The user&#39;s first name
     * 
     */
    public Output<String> firstName() {
        return this.firstName;
    }

    /**
     * The user&#39;s position at your company
     * 
     */
    @Import(name="jobTitle")
    private @Nullable Output<String> jobTitle;

    /**
     * @return The user&#39;s position at your company
     * 
     */
    public Optional<Output<String>> jobTitle() {
        return Optional.ofNullable(this.jobTitle);
    }

    /**
     * The user&#39;s surname
     * 
     */
    @Import(name="lastName", required=true)
    private Output<String> lastName;

    /**
     * @return The user&#39;s surname
     * 
     */
    public Output<String> lastName() {
        return this.lastName;
    }

    /**
     * Flag to block a user account
     * 
     */
    @Import(name="lock")
    private @Nullable Output<Boolean> lock;

    /**
     * @return Flag to block a user account
     * 
     */
    public Optional<Output<Boolean>> lock() {
        return Optional.ofNullable(this.lock);
    }

    /**
     * The user&#39;s mobile phone number
     * 
     */
    @Import(name="mobilePhone")
    private @Nullable Output<String> mobilePhone;

    /**
     * @return The user&#39;s mobile phone number
     * 
     */
    public Optional<Output<String>> mobilePhone() {
        return Optional.ofNullable(this.mobilePhone);
    }

    /**
     * The user&#39;s main phone number
     * 
     */
    @Import(name="phone", required=true)
    private Output<String> phone;

    /**
     * @return The user&#39;s main phone number
     * 
     */
    public Output<String> phone() {
        return this.phone;
    }

    /**
     * The value can be any that are available from the view-languages operation
     * 
     */
    @Import(name="preferredLanguage")
    private @Nullable Output<String> preferredLanguage;

    /**
     * @return The value can be any that are available from the view-languages operation
     * 
     */
    public Optional<Output<String>> preferredLanguage() {
        return Optional.ofNullable(this.preferredLanguage);
    }

    /**
     * The user&#39;s secondary email address
     * 
     */
    @Import(name="secondaryEmail")
    private @Nullable Output<String> secondaryEmail;

    /**
     * @return The user&#39;s secondary email address
     * 
     */
    public Optional<Output<String>> secondaryEmail() {
        return Optional.ofNullable(this.secondaryEmail);
    }

    /**
     * The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity
     * 
     */
    @Import(name="sessionTimeout")
    private @Nullable Output<Integer> sessionTimeout;

    /**
     * @return The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity
     * 
     */
    public Optional<Output<Integer>> sessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }

    /**
     * The user&#39;s state
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The user&#39;s state
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The user&#39;s time zone. The value can be any that are available from the view-time-zones operation
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The user&#39;s time zone. The value can be any that are available from the view-time-zones operation
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * The user&#39;s five-digit ZIP code
     * 
     */
    @Import(name="zipCode")
    private @Nullable Output<String> zipCode;

    /**
     * @return The user&#39;s five-digit ZIP code
     * 
     */
    public Optional<Output<String>> zipCode() {
        return Optional.ofNullable(this.zipCode);
    }

    private IamUserArgs() {}

    private IamUserArgs(IamUserArgs $) {
        this.address = $.address;
        this.authGrantsJson = $.authGrantsJson;
        this.city = $.city;
        this.contactType = $.contactType;
        this.country = $.country;
        this.email = $.email;
        this.enableTfa = $.enableTfa;
        this.firstName = $.firstName;
        this.jobTitle = $.jobTitle;
        this.lastName = $.lastName;
        this.lock = $.lock;
        this.mobilePhone = $.mobilePhone;
        this.phone = $.phone;
        this.preferredLanguage = $.preferredLanguage;
        this.secondaryEmail = $.secondaryEmail;
        this.sessionTimeout = $.sessionTimeout;
        this.state = $.state;
        this.timeZone = $.timeZone;
        this.zipCode = $.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamUserArgs $;

        public Builder() {
            $ = new IamUserArgs();
        }

        public Builder(IamUserArgs defaults) {
            $ = new IamUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The user&#39;s street address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The user&#39;s street address
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param authGrantsJson A user&#39;s per-group role assignments, in JSON form
         * 
         * @return builder
         * 
         */
        public Builder authGrantsJson(Output<String> authGrantsJson) {
            $.authGrantsJson = authGrantsJson;
            return this;
        }

        /**
         * @param authGrantsJson A user&#39;s per-group role assignments, in JSON form
         * 
         * @return builder
         * 
         */
        public Builder authGrantsJson(String authGrantsJson) {
            return authGrantsJson(Output.of(authGrantsJson));
        }

        /**
         * @param city The user&#39;s city
         * 
         * @return builder
         * 
         */
        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city The user&#39;s city
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param contactType To help characterize the user, the value can be any that are available from the view-contact-types operation
         * 
         * @return builder
         * 
         */
        public Builder contactType(@Nullable Output<String> contactType) {
            $.contactType = contactType;
            return this;
        }

        /**
         * @param contactType To help characterize the user, the value can be any that are available from the view-contact-types operation
         * 
         * @return builder
         * 
         */
        public Builder contactType(String contactType) {
            return contactType(Output.of(contactType));
        }

        /**
         * @param country As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation
         * 
         * @return builder
         * 
         */
        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country As part of the user&#39;s location, the value can be any that are available from the view-supported-countries operation
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param email The user&#39;s email address
         * 
         * @return builder
         * 
         */
        public Builder email(Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The user&#39;s email address
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param enableTfa Indicates whether two-factor authentication is allowed
         * 
         * @return builder
         * 
         */
        public Builder enableTfa(Output<Boolean> enableTfa) {
            $.enableTfa = enableTfa;
            return this;
        }

        /**
         * @param enableTfa Indicates whether two-factor authentication is allowed
         * 
         * @return builder
         * 
         */
        public Builder enableTfa(Boolean enableTfa) {
            return enableTfa(Output.of(enableTfa));
        }

        /**
         * @param firstName The user&#39;s first name
         * 
         * @return builder
         * 
         */
        public Builder firstName(Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName The user&#39;s first name
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param jobTitle The user&#39;s position at your company
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(@Nullable Output<String> jobTitle) {
            $.jobTitle = jobTitle;
            return this;
        }

        /**
         * @param jobTitle The user&#39;s position at your company
         * 
         * @return builder
         * 
         */
        public Builder jobTitle(String jobTitle) {
            return jobTitle(Output.of(jobTitle));
        }

        /**
         * @param lastName The user&#39;s surname
         * 
         * @return builder
         * 
         */
        public Builder lastName(Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName The user&#39;s surname
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param lock Flag to block a user account
         * 
         * @return builder
         * 
         */
        public Builder lock(@Nullable Output<Boolean> lock) {
            $.lock = lock;
            return this;
        }

        /**
         * @param lock Flag to block a user account
         * 
         * @return builder
         * 
         */
        public Builder lock(Boolean lock) {
            return lock(Output.of(lock));
        }

        /**
         * @param mobilePhone The user&#39;s mobile phone number
         * 
         * @return builder
         * 
         */
        public Builder mobilePhone(@Nullable Output<String> mobilePhone) {
            $.mobilePhone = mobilePhone;
            return this;
        }

        /**
         * @param mobilePhone The user&#39;s mobile phone number
         * 
         * @return builder
         * 
         */
        public Builder mobilePhone(String mobilePhone) {
            return mobilePhone(Output.of(mobilePhone));
        }

        /**
         * @param phone The user&#39;s main phone number
         * 
         * @return builder
         * 
         */
        public Builder phone(Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone The user&#39;s main phone number
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        /**
         * @param preferredLanguage The value can be any that are available from the view-languages operation
         * 
         * @return builder
         * 
         */
        public Builder preferredLanguage(@Nullable Output<String> preferredLanguage) {
            $.preferredLanguage = preferredLanguage;
            return this;
        }

        /**
         * @param preferredLanguage The value can be any that are available from the view-languages operation
         * 
         * @return builder
         * 
         */
        public Builder preferredLanguage(String preferredLanguage) {
            return preferredLanguage(Output.of(preferredLanguage));
        }

        /**
         * @param secondaryEmail The user&#39;s secondary email address
         * 
         * @return builder
         * 
         */
        public Builder secondaryEmail(@Nullable Output<String> secondaryEmail) {
            $.secondaryEmail = secondaryEmail;
            return this;
        }

        /**
         * @param secondaryEmail The user&#39;s secondary email address
         * 
         * @return builder
         * 
         */
        public Builder secondaryEmail(String secondaryEmail) {
            return secondaryEmail(Output.of(secondaryEmail));
        }

        /**
         * @param sessionTimeout The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            $.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * @param sessionTimeout The number of seconds it takes for the user&#39;s Control Center session to time out if there hasn&#39;t been any activity
         * 
         * @return builder
         * 
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            return sessionTimeout(Output.of(sessionTimeout));
        }

        /**
         * @param state The user&#39;s state
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The user&#39;s state
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeZone The user&#39;s time zone. The value can be any that are available from the view-time-zones operation
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The user&#39;s time zone. The value can be any that are available from the view-time-zones operation
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param zipCode The user&#39;s five-digit ZIP code
         * 
         * @return builder
         * 
         */
        public Builder zipCode(@Nullable Output<String> zipCode) {
            $.zipCode = zipCode;
            return this;
        }

        /**
         * @param zipCode The user&#39;s five-digit ZIP code
         * 
         * @return builder
         * 
         */
        public Builder zipCode(String zipCode) {
            return zipCode(Output.of(zipCode));
        }

        public IamUserArgs build() {
            $.authGrantsJson = Objects.requireNonNull($.authGrantsJson, "expected parameter 'authGrantsJson' to be non-null");
            $.country = Objects.requireNonNull($.country, "expected parameter 'country' to be non-null");
            $.email = Objects.requireNonNull($.email, "expected parameter 'email' to be non-null");
            $.enableTfa = Objects.requireNonNull($.enableTfa, "expected parameter 'enableTfa' to be non-null");
            $.firstName = Objects.requireNonNull($.firstName, "expected parameter 'firstName' to be non-null");
            $.lastName = Objects.requireNonNull($.lastName, "expected parameter 'lastName' to be non-null");
            $.phone = Objects.requireNonNull($.phone, "expected parameter 'phone' to be non-null");
            return $;
        }
    }

}
