// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpsThirdPartyEnrollmentCsrArgs extends com.pulumi.resources.ResourceArgs {

    public static final CpsThirdPartyEnrollmentCsrArgs Empty = new CpsThirdPartyEnrollmentCsrArgs();

    @Import(name="city", required=true)
    private Output<String> city;

    public Output<String> city() {
        return this.city;
    }

    @Import(name="countryCode", required=true)
    private Output<String> countryCode;

    public Output<String> countryCode() {
        return this.countryCode;
    }

    @Import(name="organization", required=true)
    private Output<String> organization;

    public Output<String> organization() {
        return this.organization;
    }

    @Import(name="organizationalUnit", required=true)
    private Output<String> organizationalUnit;

    public Output<String> organizationalUnit() {
        return this.organizationalUnit;
    }

    @Import(name="preferredTrustChain")
    private @Nullable Output<String> preferredTrustChain;

    public Optional<Output<String>> preferredTrustChain() {
        return Optional.ofNullable(this.preferredTrustChain);
    }

    @Import(name="state", required=true)
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    private CpsThirdPartyEnrollmentCsrArgs() {}

    private CpsThirdPartyEnrollmentCsrArgs(CpsThirdPartyEnrollmentCsrArgs $) {
        this.city = $.city;
        this.countryCode = $.countryCode;
        this.organization = $.organization;
        this.organizationalUnit = $.organizationalUnit;
        this.preferredTrustChain = $.preferredTrustChain;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpsThirdPartyEnrollmentCsrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpsThirdPartyEnrollmentCsrArgs $;

        public Builder() {
            $ = new CpsThirdPartyEnrollmentCsrArgs();
        }

        public Builder(CpsThirdPartyEnrollmentCsrArgs defaults) {
            $ = new CpsThirdPartyEnrollmentCsrArgs(Objects.requireNonNull(defaults));
        }

        public Builder city(Output<String> city) {
            $.city = city;
            return this;
        }

        public Builder city(String city) {
            return city(Output.of(city));
        }

        public Builder countryCode(Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public Builder organizationalUnit(Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        public Builder preferredTrustChain(@Nullable Output<String> preferredTrustChain) {
            $.preferredTrustChain = preferredTrustChain;
            return this;
        }

        public Builder preferredTrustChain(String preferredTrustChain) {
            return preferredTrustChain(Output.of(preferredTrustChain));
        }

        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public CpsThirdPartyEnrollmentCsrArgs build() {
            $.city = Objects.requireNonNull($.city, "expected parameter 'city' to be non-null");
            $.countryCode = Objects.requireNonNull($.countryCode, "expected parameter 'countryCode' to be non-null");
            $.organization = Objects.requireNonNull($.organization, "expected parameter 'organization' to be non-null");
            $.organizationalUnit = Objects.requireNonNull($.organizationalUnit, "expected parameter 'organizationalUnit' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
