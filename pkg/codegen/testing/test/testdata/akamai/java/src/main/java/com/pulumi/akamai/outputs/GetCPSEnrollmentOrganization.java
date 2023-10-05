// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCPSEnrollmentOrganization {
    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String countryCode;
    private String name;
    private String phone;
    private String postalCode;
    private String region;

    private GetCPSEnrollmentOrganization() {}
    public String addressLineOne() {
        return this.addressLineOne;
    }
    public String addressLineTwo() {
        return this.addressLineTwo;
    }
    public String city() {
        return this.city;
    }
    public String countryCode() {
        return this.countryCode;
    }
    public String name() {
        return this.name;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCPSEnrollmentOrganization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String addressLineOne;
        private String addressLineTwo;
        private String city;
        private String countryCode;
        private String name;
        private String phone;
        private String postalCode;
        private String region;
        public Builder() {}
        public Builder(GetCPSEnrollmentOrganization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLineOne = defaults.addressLineOne;
    	      this.addressLineTwo = defaults.addressLineTwo;
    	      this.city = defaults.city;
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder addressLineOne(String addressLineOne) {
            this.addressLineOne = Objects.requireNonNull(addressLineOne);
            return this;
        }
        @CustomType.Setter
        public Builder addressLineTwo(String addressLineTwo) {
            this.addressLineTwo = Objects.requireNonNull(addressLineTwo);
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public GetCPSEnrollmentOrganization build() {
            final var _resultValue = new GetCPSEnrollmentOrganization();
            _resultValue.addressLineOne = addressLineOne;
            _resultValue.addressLineTwo = addressLineTwo;
            _resultValue.city = city;
            _resultValue.countryCode = countryCode;
            _resultValue.name = name;
            _resultValue.phone = phone;
            _resultValue.postalCode = postalCode;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
