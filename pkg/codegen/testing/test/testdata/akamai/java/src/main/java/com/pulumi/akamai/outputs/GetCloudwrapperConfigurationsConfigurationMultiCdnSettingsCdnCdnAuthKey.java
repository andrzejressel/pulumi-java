// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey {
    private String authKeyName;
    private String expiryDate;
    private String headerName;
    private String secret;

    private GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey() {}
    public String authKeyName() {
        return this.authKeyName;
    }
    public String expiryDate() {
        return this.expiryDate;
    }
    public String headerName() {
        return this.headerName;
    }
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authKeyName;
        private String expiryDate;
        private String headerName;
        private String secret;
        public Builder() {}
        public Builder(GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authKeyName = defaults.authKeyName;
    	      this.expiryDate = defaults.expiryDate;
    	      this.headerName = defaults.headerName;
    	      this.secret = defaults.secret;
        }

        @CustomType.Setter
        public Builder authKeyName(String authKeyName) {
            this.authKeyName = Objects.requireNonNull(authKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder expiryDate(String expiryDate) {
            this.expiryDate = Objects.requireNonNull(expiryDate);
            return this;
        }
        @CustomType.Setter
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey build() {
            final var _resultValue = new GetCloudwrapperConfigurationsConfigurationMultiCdnSettingsCdnCdnAuthKey();
            _resultValue.authKeyName = authKeyName;
            _resultValue.expiryDate = expiryDate;
            _resultValue.headerName = headerName;
            _resultValue.secret = secret;
            return _resultValue;
        }
    }
}
