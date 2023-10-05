// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection {
    private @Nullable List<String> countries;
    private @Nullable List<String> dmas;
    private @Nullable Boolean enableGeoProtection;
    private @Nullable Boolean enableGeoRedirectOnDeny;
    private @Nullable Boolean enableIpProtection;
    private @Nullable Boolean enableIpRedirectOnDeny;
    private @Nullable Boolean enableReferrerProtection;
    private @Nullable Boolean enableReferrerRedirectOnDeny;
    private @Nullable Boolean enabled;
    private @Nullable String geoProtectionMode;
    private @Nullable String geoProtectionTitle;
    private @Nullable String geoRedirectUrl;
    private @Nullable List<String> ipAddresses;
    private @Nullable String ipProtectionMode;
    private @Nullable String ipProtectionTitle;
    private @Nullable String ipRedirectUrl;
    private @Nullable Boolean locked;
    private @Nullable List<String> overrideIpAddresses;
    private @Nullable List<String> referrerDomains;
    private @Nullable String referrerProtectionMode;
    private @Nullable String referrerProtectionTitle;
    private @Nullable String referrerRedirectUrl;
    private @Nullable List<String> regions;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection() {}
    public List<String> countries() {
        return this.countries == null ? List.of() : this.countries;
    }
    public List<String> dmas() {
        return this.dmas == null ? List.of() : this.dmas;
    }
    public Optional<Boolean> enableGeoProtection() {
        return Optional.ofNullable(this.enableGeoProtection);
    }
    public Optional<Boolean> enableGeoRedirectOnDeny() {
        return Optional.ofNullable(this.enableGeoRedirectOnDeny);
    }
    public Optional<Boolean> enableIpProtection() {
        return Optional.ofNullable(this.enableIpProtection);
    }
    public Optional<Boolean> enableIpRedirectOnDeny() {
        return Optional.ofNullable(this.enableIpRedirectOnDeny);
    }
    public Optional<Boolean> enableReferrerProtection() {
        return Optional.ofNullable(this.enableReferrerProtection);
    }
    public Optional<Boolean> enableReferrerRedirectOnDeny() {
        return Optional.ofNullable(this.enableReferrerRedirectOnDeny);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> geoProtectionMode() {
        return Optional.ofNullable(this.geoProtectionMode);
    }
    public Optional<String> geoProtectionTitle() {
        return Optional.ofNullable(this.geoProtectionTitle);
    }
    public Optional<String> geoRedirectUrl() {
        return Optional.ofNullable(this.geoRedirectUrl);
    }
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    public Optional<String> ipProtectionMode() {
        return Optional.ofNullable(this.ipProtectionMode);
    }
    public Optional<String> ipProtectionTitle() {
        return Optional.ofNullable(this.ipProtectionTitle);
    }
    public Optional<String> ipRedirectUrl() {
        return Optional.ofNullable(this.ipRedirectUrl);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public List<String> overrideIpAddresses() {
        return this.overrideIpAddresses == null ? List.of() : this.overrideIpAddresses;
    }
    public List<String> referrerDomains() {
        return this.referrerDomains == null ? List.of() : this.referrerDomains;
    }
    public Optional<String> referrerProtectionMode() {
        return Optional.ofNullable(this.referrerProtectionMode);
    }
    public Optional<String> referrerProtectionTitle() {
        return Optional.ofNullable(this.referrerProtectionTitle);
    }
    public Optional<String> referrerRedirectUrl() {
        return Optional.ofNullable(this.referrerRedirectUrl);
    }
    public List<String> regions() {
        return this.regions == null ? List.of() : this.regions;
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> countries;
        private @Nullable List<String> dmas;
        private @Nullable Boolean enableGeoProtection;
        private @Nullable Boolean enableGeoRedirectOnDeny;
        private @Nullable Boolean enableIpProtection;
        private @Nullable Boolean enableIpRedirectOnDeny;
        private @Nullable Boolean enableReferrerProtection;
        private @Nullable Boolean enableReferrerRedirectOnDeny;
        private @Nullable Boolean enabled;
        private @Nullable String geoProtectionMode;
        private @Nullable String geoProtectionTitle;
        private @Nullable String geoRedirectUrl;
        private @Nullable List<String> ipAddresses;
        private @Nullable String ipProtectionMode;
        private @Nullable String ipProtectionTitle;
        private @Nullable String ipRedirectUrl;
        private @Nullable Boolean locked;
        private @Nullable List<String> overrideIpAddresses;
        private @Nullable List<String> referrerDomains;
        private @Nullable String referrerProtectionMode;
        private @Nullable String referrerProtectionTitle;
        private @Nullable String referrerRedirectUrl;
        private @Nullable List<String> regions;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countries = defaults.countries;
    	      this.dmas = defaults.dmas;
    	      this.enableGeoProtection = defaults.enableGeoProtection;
    	      this.enableGeoRedirectOnDeny = defaults.enableGeoRedirectOnDeny;
    	      this.enableIpProtection = defaults.enableIpProtection;
    	      this.enableIpRedirectOnDeny = defaults.enableIpRedirectOnDeny;
    	      this.enableReferrerProtection = defaults.enableReferrerProtection;
    	      this.enableReferrerRedirectOnDeny = defaults.enableReferrerRedirectOnDeny;
    	      this.enabled = defaults.enabled;
    	      this.geoProtectionMode = defaults.geoProtectionMode;
    	      this.geoProtectionTitle = defaults.geoProtectionTitle;
    	      this.geoRedirectUrl = defaults.geoRedirectUrl;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipProtectionMode = defaults.ipProtectionMode;
    	      this.ipProtectionTitle = defaults.ipProtectionTitle;
    	      this.ipRedirectUrl = defaults.ipRedirectUrl;
    	      this.locked = defaults.locked;
    	      this.overrideIpAddresses = defaults.overrideIpAddresses;
    	      this.referrerDomains = defaults.referrerDomains;
    	      this.referrerProtectionMode = defaults.referrerProtectionMode;
    	      this.referrerProtectionTitle = defaults.referrerProtectionTitle;
    	      this.referrerRedirectUrl = defaults.referrerRedirectUrl;
    	      this.regions = defaults.regions;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder countries(@Nullable List<String> countries) {
            this.countries = countries;
            return this;
        }
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }
        @CustomType.Setter
        public Builder dmas(@Nullable List<String> dmas) {
            this.dmas = dmas;
            return this;
        }
        public Builder dmas(String... dmas) {
            return dmas(List.of(dmas));
        }
        @CustomType.Setter
        public Builder enableGeoProtection(@Nullable Boolean enableGeoProtection) {
            this.enableGeoProtection = enableGeoProtection;
            return this;
        }
        @CustomType.Setter
        public Builder enableGeoRedirectOnDeny(@Nullable Boolean enableGeoRedirectOnDeny) {
            this.enableGeoRedirectOnDeny = enableGeoRedirectOnDeny;
            return this;
        }
        @CustomType.Setter
        public Builder enableIpProtection(@Nullable Boolean enableIpProtection) {
            this.enableIpProtection = enableIpProtection;
            return this;
        }
        @CustomType.Setter
        public Builder enableIpRedirectOnDeny(@Nullable Boolean enableIpRedirectOnDeny) {
            this.enableIpRedirectOnDeny = enableIpRedirectOnDeny;
            return this;
        }
        @CustomType.Setter
        public Builder enableReferrerProtection(@Nullable Boolean enableReferrerProtection) {
            this.enableReferrerProtection = enableReferrerProtection;
            return this;
        }
        @CustomType.Setter
        public Builder enableReferrerRedirectOnDeny(@Nullable Boolean enableReferrerRedirectOnDeny) {
            this.enableReferrerRedirectOnDeny = enableReferrerRedirectOnDeny;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder geoProtectionMode(@Nullable String geoProtectionMode) {
            this.geoProtectionMode = geoProtectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder geoProtectionTitle(@Nullable String geoProtectionTitle) {
            this.geoProtectionTitle = geoProtectionTitle;
            return this;
        }
        @CustomType.Setter
        public Builder geoRedirectUrl(@Nullable String geoRedirectUrl) {
            this.geoRedirectUrl = geoRedirectUrl;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        @CustomType.Setter
        public Builder ipProtectionMode(@Nullable String ipProtectionMode) {
            this.ipProtectionMode = ipProtectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder ipProtectionTitle(@Nullable String ipProtectionTitle) {
            this.ipProtectionTitle = ipProtectionTitle;
            return this;
        }
        @CustomType.Setter
        public Builder ipRedirectUrl(@Nullable String ipRedirectUrl) {
            this.ipRedirectUrl = ipRedirectUrl;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder overrideIpAddresses(@Nullable List<String> overrideIpAddresses) {
            this.overrideIpAddresses = overrideIpAddresses;
            return this;
        }
        public Builder overrideIpAddresses(String... overrideIpAddresses) {
            return overrideIpAddresses(List.of(overrideIpAddresses));
        }
        @CustomType.Setter
        public Builder referrerDomains(@Nullable List<String> referrerDomains) {
            this.referrerDomains = referrerDomains;
            return this;
        }
        public Builder referrerDomains(String... referrerDomains) {
            return referrerDomains(List.of(referrerDomains));
        }
        @CustomType.Setter
        public Builder referrerProtectionMode(@Nullable String referrerProtectionMode) {
            this.referrerProtectionMode = referrerProtectionMode;
            return this;
        }
        @CustomType.Setter
        public Builder referrerProtectionTitle(@Nullable String referrerProtectionTitle) {
            this.referrerProtectionTitle = referrerProtectionTitle;
            return this;
        }
        @CustomType.Setter
        public Builder referrerRedirectUrl(@Nullable String referrerRedirectUrl) {
            this.referrerRedirectUrl = referrerRedirectUrl;
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection();
            _resultValue.countries = countries;
            _resultValue.dmas = dmas;
            _resultValue.enableGeoProtection = enableGeoProtection;
            _resultValue.enableGeoRedirectOnDeny = enableGeoRedirectOnDeny;
            _resultValue.enableIpProtection = enableIpProtection;
            _resultValue.enableIpRedirectOnDeny = enableIpRedirectOnDeny;
            _resultValue.enableReferrerProtection = enableReferrerProtection;
            _resultValue.enableReferrerRedirectOnDeny = enableReferrerRedirectOnDeny;
            _resultValue.enabled = enabled;
            _resultValue.geoProtectionMode = geoProtectionMode;
            _resultValue.geoProtectionTitle = geoProtectionTitle;
            _resultValue.geoRedirectUrl = geoRedirectUrl;
            _resultValue.ipAddresses = ipAddresses;
            _resultValue.ipProtectionMode = ipProtectionMode;
            _resultValue.ipProtectionTitle = ipProtectionTitle;
            _resultValue.ipRedirectUrl = ipRedirectUrl;
            _resultValue.locked = locked;
            _resultValue.overrideIpAddresses = overrideIpAddresses;
            _resultValue.referrerDomains = referrerDomains;
            _resultValue.referrerProtectionMode = referrerProtectionMode;
            _resultValue.referrerProtectionTitle = referrerProtectionTitle;
            _resultValue.referrerRedirectUrl = referrerRedirectUrl;
            _resultValue.regions = regions;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
