// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CpsDvEnrollmentAdminContact {
    private String addressLineOne;
    private @Nullable String addressLineTwo;
    private String city;
    private String countryCode;
    private String email;
    private String firstName;
    private String lastName;
    private String organization;
    private String phone;
    private String postalCode;
    private String region;
    private @Nullable String title;

    private CpsDvEnrollmentAdminContact() {}
    public String addressLineOne() {
        return this.addressLineOne;
    }
    public Optional<String> addressLineTwo() {
        return Optional.ofNullable(this.addressLineTwo);
    }
    public String city() {
        return this.city;
    }
    public String countryCode() {
        return this.countryCode;
    }
    public String email() {
        return this.email;
    }
    public String firstName() {
        return this.firstName;
    }
    public String lastName() {
        return this.lastName;
    }
    public String organization() {
        return this.organization;
    }
    public String phone() {
        return this.phone;
    }
    public String postalCode() {
        return this.postalCode;
    }
    public String region() {
        return this.region;
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpsDvEnrollmentAdminContact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressLineOne;
        private @Nullable String addressLineTwo;
        private String city;
        private String countryCode;
        private String email;
        private String firstName;
        private String lastName;
        private String organization;
        private String phone;
        private String postalCode;
        private String region;
        private @Nullable String title;
        public Builder() {}
        public Builder(CpsDvEnrollmentAdminContact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLineOne = defaults.addressLineOne;
    	      this.addressLineTwo = defaults.addressLineTwo;
    	      this.city = defaults.city;
    	      this.countryCode = defaults.countryCode;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.organization = defaults.organization;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.region = defaults.region;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder addressLineOne(String addressLineOne) {
            this.addressLineOne = Objects.requireNonNull(addressLineOne);
            return this;
        }
        @CustomType.Setter
        public Builder addressLineTwo(@Nullable String addressLineTwo) {
            this.addressLineTwo = addressLineTwo;
            return this;
        }
        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        @CustomType.Setter
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        @CustomType.Setter
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public CpsDvEnrollmentAdminContact build() {
            final var _resultValue = new CpsDvEnrollmentAdminContact();
            _resultValue.addressLineOne = addressLineOne;
            _resultValue.addressLineTwo = addressLineTwo;
            _resultValue.city = city;
            _resultValue.countryCode = countryCode;
            _resultValue.email = email;
            _resultValue.firstName = firstName;
            _resultValue.lastName = lastName;
            _resultValue.organization = organization;
            _resultValue.phone = phone;
            _resultValue.postalCode = postalCode;
            _resultValue.region = region;
            _resultValue.title = title;
            return _resultValue;
        }
    }
}
