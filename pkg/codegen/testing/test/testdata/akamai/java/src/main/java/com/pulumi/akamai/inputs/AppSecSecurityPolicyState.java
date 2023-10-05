// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSecSecurityPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final AppSecSecurityPolicyState Empty = new AppSecSecurityPolicyState();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Unique identifier of the existing security policy being cloned
     * 
     */
    @Import(name="createFromSecurityPolicyId")
    private @Nullable Output<String> createFromSecurityPolicyId;

    /**
     * @return Unique identifier of the existing security policy being cloned
     * 
     */
    public Optional<Output<String>> createFromSecurityPolicyId() {
        return Optional.ofNullable(this.createFromSecurityPolicyId);
    }

    /**
     * Whether to assign default settings to the new security policy
     * 
     */
    @Import(name="defaultSettings")
    private @Nullable Output<Boolean> defaultSettings;

    /**
     * @return Whether to assign default settings to the new security policy
     * 
     */
    public Optional<Output<Boolean>> defaultSettings() {
        return Optional.ofNullable(this.defaultSettings);
    }

    /**
     * Unique identifier of the new security policy
     * 
     */
    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the new security policy
     * 
     */
    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    /**
     * Name of the new security policy
     * 
     */
    @Import(name="securityPolicyName")
    private @Nullable Output<String> securityPolicyName;

    /**
     * @return Name of the new security policy
     * 
     */
    public Optional<Output<String>> securityPolicyName() {
        return Optional.ofNullable(this.securityPolicyName);
    }

    /**
     * Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    @Import(name="securityPolicyPrefix")
    private @Nullable Output<String> securityPolicyPrefix;

    /**
     * @return Four-character alphanumeric string prefix used in creating the security policy ID
     * 
     */
    public Optional<Output<String>> securityPolicyPrefix() {
        return Optional.ofNullable(this.securityPolicyPrefix);
    }

    private AppSecSecurityPolicyState() {}

    private AppSecSecurityPolicyState(AppSecSecurityPolicyState $) {
        this.configId = $.configId;
        this.createFromSecurityPolicyId = $.createFromSecurityPolicyId;
        this.defaultSettings = $.defaultSettings;
        this.securityPolicyId = $.securityPolicyId;
        this.securityPolicyName = $.securityPolicyName;
        this.securityPolicyPrefix = $.securityPolicyPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecSecurityPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecSecurityPolicyState $;

        public Builder() {
            $ = new AppSecSecurityPolicyState();
        }

        public Builder(AppSecSecurityPolicyState defaults) {
            $ = new AppSecSecurityPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param createFromSecurityPolicyId Unique identifier of the existing security policy being cloned
         * 
         * @return builder
         * 
         */
        public Builder createFromSecurityPolicyId(@Nullable Output<String> createFromSecurityPolicyId) {
            $.createFromSecurityPolicyId = createFromSecurityPolicyId;
            return this;
        }

        /**
         * @param createFromSecurityPolicyId Unique identifier of the existing security policy being cloned
         * 
         * @return builder
         * 
         */
        public Builder createFromSecurityPolicyId(String createFromSecurityPolicyId) {
            return createFromSecurityPolicyId(Output.of(createFromSecurityPolicyId));
        }

        /**
         * @param defaultSettings Whether to assign default settings to the new security policy
         * 
         * @return builder
         * 
         */
        public Builder defaultSettings(@Nullable Output<Boolean> defaultSettings) {
            $.defaultSettings = defaultSettings;
            return this;
        }

        /**
         * @param defaultSettings Whether to assign default settings to the new security policy
         * 
         * @return builder
         * 
         */
        public Builder defaultSettings(Boolean defaultSettings) {
            return defaultSettings(Output.of(defaultSettings));
        }

        /**
         * @param securityPolicyId Unique identifier of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId Unique identifier of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        /**
         * @param securityPolicyName Name of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyName(@Nullable Output<String> securityPolicyName) {
            $.securityPolicyName = securityPolicyName;
            return this;
        }

        /**
         * @param securityPolicyName Name of the new security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyName(String securityPolicyName) {
            return securityPolicyName(Output.of(securityPolicyName));
        }

        /**
         * @param securityPolicyPrefix Four-character alphanumeric string prefix used in creating the security policy ID
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyPrefix(@Nullable Output<String> securityPolicyPrefix) {
            $.securityPolicyPrefix = securityPolicyPrefix;
            return this;
        }

        /**
         * @param securityPolicyPrefix Four-character alphanumeric string prefix used in creating the security policy ID
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyPrefix(String securityPolicyPrefix) {
            return securityPolicyPrefix(Output.of(securityPolicyPrefix));
        }

        public AppSecSecurityPolicyState build() {
            return $;
        }
    }

}
