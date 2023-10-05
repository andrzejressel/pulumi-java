// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppsecAdvancedSettingsAttackPayloadLoggingResult {
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;
    private String outputText;
    private @Nullable String securityPolicyId;

    private GetAppsecAdvancedSettingsAttackPayloadLoggingResult() {}
    public Integer configId() {
        return this.configId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }
    public String outputText() {
        return this.outputText;
    }
    public Optional<String> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppsecAdvancedSettingsAttackPayloadLoggingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer configId;
        private String id;
        private String json;
        private String outputText;
        private @Nullable String securityPolicyId;
        public Builder() {}
        public Builder(GetAppsecAdvancedSettingsAttackPayloadLoggingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
    	      this.outputText = defaults.outputText;
    	      this.securityPolicyId = defaults.securityPolicyId;
        }

        @CustomType.Setter
        public Builder configId(Integer configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        @CustomType.Setter
        public Builder outputText(String outputText) {
            this.outputText = Objects.requireNonNull(outputText);
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyId(@Nullable String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public GetAppsecAdvancedSettingsAttackPayloadLoggingResult build() {
            final var _resultValue = new GetAppsecAdvancedSettingsAttackPayloadLoggingResult();
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            _resultValue.outputText = outputText;
            _resultValue.securityPolicyId = securityPolicyId;
            return _resultValue;
        }
    }
}
