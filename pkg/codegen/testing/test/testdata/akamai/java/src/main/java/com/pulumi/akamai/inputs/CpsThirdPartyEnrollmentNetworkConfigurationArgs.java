// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpsThirdPartyEnrollmentNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CpsThirdPartyEnrollmentNetworkConfigurationArgs Empty = new CpsThirdPartyEnrollmentNetworkConfigurationArgs();

    @Import(name="clientMutualAuthentication")
    private @Nullable Output<CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthenticationArgs> clientMutualAuthentication;

    public Optional<Output<CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthenticationArgs>> clientMutualAuthentication() {
        return Optional.ofNullable(this.clientMutualAuthentication);
    }

    @Import(name="cloneDnsNames")
    private @Nullable Output<Boolean> cloneDnsNames;

    public Optional<Output<Boolean>> cloneDnsNames() {
        return Optional.ofNullable(this.cloneDnsNames);
    }

    @Import(name="disallowedTlsVersions")
    private @Nullable Output<List<String>> disallowedTlsVersions;

    public Optional<Output<List<String>>> disallowedTlsVersions() {
        return Optional.ofNullable(this.disallowedTlsVersions);
    }

    @Import(name="geography", required=true)
    private Output<String> geography;

    public Output<String> geography() {
        return this.geography;
    }

    @Import(name="mustHaveCiphers")
    private @Nullable Output<String> mustHaveCiphers;

    public Optional<Output<String>> mustHaveCiphers() {
        return Optional.ofNullable(this.mustHaveCiphers);
    }

    @Import(name="ocspStapling")
    private @Nullable Output<String> ocspStapling;

    public Optional<Output<String>> ocspStapling() {
        return Optional.ofNullable(this.ocspStapling);
    }

    @Import(name="preferredCiphers")
    private @Nullable Output<String> preferredCiphers;

    public Optional<Output<String>> preferredCiphers() {
        return Optional.ofNullable(this.preferredCiphers);
    }

    @Import(name="quicEnabled")
    private @Nullable Output<Boolean> quicEnabled;

    public Optional<Output<Boolean>> quicEnabled() {
        return Optional.ofNullable(this.quicEnabled);
    }

    private CpsThirdPartyEnrollmentNetworkConfigurationArgs() {}

    private CpsThirdPartyEnrollmentNetworkConfigurationArgs(CpsThirdPartyEnrollmentNetworkConfigurationArgs $) {
        this.clientMutualAuthentication = $.clientMutualAuthentication;
        this.cloneDnsNames = $.cloneDnsNames;
        this.disallowedTlsVersions = $.disallowedTlsVersions;
        this.geography = $.geography;
        this.mustHaveCiphers = $.mustHaveCiphers;
        this.ocspStapling = $.ocspStapling;
        this.preferredCiphers = $.preferredCiphers;
        this.quicEnabled = $.quicEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpsThirdPartyEnrollmentNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpsThirdPartyEnrollmentNetworkConfigurationArgs $;

        public Builder() {
            $ = new CpsThirdPartyEnrollmentNetworkConfigurationArgs();
        }

        public Builder(CpsThirdPartyEnrollmentNetworkConfigurationArgs defaults) {
            $ = new CpsThirdPartyEnrollmentNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientMutualAuthentication(@Nullable Output<CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthenticationArgs> clientMutualAuthentication) {
            $.clientMutualAuthentication = clientMutualAuthentication;
            return this;
        }

        public Builder clientMutualAuthentication(CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthenticationArgs clientMutualAuthentication) {
            return clientMutualAuthentication(Output.of(clientMutualAuthentication));
        }

        public Builder cloneDnsNames(@Nullable Output<Boolean> cloneDnsNames) {
            $.cloneDnsNames = cloneDnsNames;
            return this;
        }

        public Builder cloneDnsNames(Boolean cloneDnsNames) {
            return cloneDnsNames(Output.of(cloneDnsNames));
        }

        public Builder disallowedTlsVersions(@Nullable Output<List<String>> disallowedTlsVersions) {
            $.disallowedTlsVersions = disallowedTlsVersions;
            return this;
        }

        public Builder disallowedTlsVersions(List<String> disallowedTlsVersions) {
            return disallowedTlsVersions(Output.of(disallowedTlsVersions));
        }

        public Builder disallowedTlsVersions(String... disallowedTlsVersions) {
            return disallowedTlsVersions(List.of(disallowedTlsVersions));
        }

        public Builder geography(Output<String> geography) {
            $.geography = geography;
            return this;
        }

        public Builder geography(String geography) {
            return geography(Output.of(geography));
        }

        public Builder mustHaveCiphers(@Nullable Output<String> mustHaveCiphers) {
            $.mustHaveCiphers = mustHaveCiphers;
            return this;
        }

        public Builder mustHaveCiphers(String mustHaveCiphers) {
            return mustHaveCiphers(Output.of(mustHaveCiphers));
        }

        public Builder ocspStapling(@Nullable Output<String> ocspStapling) {
            $.ocspStapling = ocspStapling;
            return this;
        }

        public Builder ocspStapling(String ocspStapling) {
            return ocspStapling(Output.of(ocspStapling));
        }

        public Builder preferredCiphers(@Nullable Output<String> preferredCiphers) {
            $.preferredCiphers = preferredCiphers;
            return this;
        }

        public Builder preferredCiphers(String preferredCiphers) {
            return preferredCiphers(Output.of(preferredCiphers));
        }

        public Builder quicEnabled(@Nullable Output<Boolean> quicEnabled) {
            $.quicEnabled = quicEnabled;
            return this;
        }

        public Builder quicEnabled(Boolean quicEnabled) {
            return quicEnabled(Output.of(quicEnabled));
        }

        public CpsThirdPartyEnrollmentNetworkConfigurationArgs build() {
            $.geography = Objects.requireNonNull($.geography, "expected parameter 'geography' to be non-null");
            return $;
        }
    }

}
