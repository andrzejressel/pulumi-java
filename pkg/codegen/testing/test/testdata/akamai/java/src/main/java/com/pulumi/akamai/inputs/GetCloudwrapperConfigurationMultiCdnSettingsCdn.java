// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudwrapperConfigurationMultiCdnSettingsCdn extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudwrapperConfigurationMultiCdnSettingsCdn Empty = new GetCloudwrapperConfigurationMultiCdnSettingsCdn();

    @Import(name="cdnAuthKeys")
    private @Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys;

    public Optional<List<GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey>> cdnAuthKeys() {
        return Optional.ofNullable(this.cdnAuthKeys);
    }

    @Import(name="cdnCode", required=true)
    private String cdnCode;

    public String cdnCode() {
        return this.cdnCode;
    }

    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="httpsOnly", required=true)
    private Boolean httpsOnly;

    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    @Import(name="ipAclCidrs", required=true)
    private List<String> ipAclCidrs;

    public List<String> ipAclCidrs() {
        return this.ipAclCidrs;
    }

    private GetCloudwrapperConfigurationMultiCdnSettingsCdn() {}

    private GetCloudwrapperConfigurationMultiCdnSettingsCdn(GetCloudwrapperConfigurationMultiCdnSettingsCdn $) {
        this.cdnAuthKeys = $.cdnAuthKeys;
        this.cdnCode = $.cdnCode;
        this.enabled = $.enabled;
        this.httpsOnly = $.httpsOnly;
        this.ipAclCidrs = $.ipAclCidrs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationMultiCdnSettingsCdn defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationMultiCdnSettingsCdn $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsCdn();
        }

        public Builder(GetCloudwrapperConfigurationMultiCdnSettingsCdn defaults) {
            $ = new GetCloudwrapperConfigurationMultiCdnSettingsCdn(Objects.requireNonNull(defaults));
        }

        public Builder cdnAuthKeys(@Nullable List<GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey> cdnAuthKeys) {
            $.cdnAuthKeys = cdnAuthKeys;
            return this;
        }

        public Builder cdnAuthKeys(GetCloudwrapperConfigurationMultiCdnSettingsCdnCdnAuthKey... cdnAuthKeys) {
            return cdnAuthKeys(List.of(cdnAuthKeys));
        }

        public Builder cdnCode(String cdnCode) {
            $.cdnCode = cdnCode;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder httpsOnly(Boolean httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        public Builder ipAclCidrs(List<String> ipAclCidrs) {
            $.ipAclCidrs = ipAclCidrs;
            return this;
        }

        public Builder ipAclCidrs(String... ipAclCidrs) {
            return ipAclCidrs(List.of(ipAclCidrs));
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsCdn build() {
            $.cdnCode = Objects.requireNonNull($.cdnCode, "expected parameter 'cdnCode' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.httpsOnly = Objects.requireNonNull($.httpsOnly, "expected parameter 'httpsOnly' to be non-null");
            $.ipAclCidrs = Objects.requireNonNull($.ipAclCidrs, "expected parameter 'ipAclCidrs' to be non-null");
            return $;
        }
    }

}
