// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization {
    private @Nullable String algorithm;
    private @Nullable Boolean escapeHmacInputs;
    private @Nullable Boolean failureResponse;
    private @Nullable Boolean ignoreQueryString;
    private @Nullable String key;
    private @Nullable String location;
    private @Nullable String locationId;
    private @Nullable Boolean locked;
    private @Nullable String salt;
    private @Nullable String templateUuid;
    private @Nullable String transitionKey;
    private @Nullable Boolean useAdvanced;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization() {}
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<Boolean> escapeHmacInputs() {
        return Optional.ofNullable(this.escapeHmacInputs);
    }
    public Optional<Boolean> failureResponse() {
        return Optional.ofNullable(this.failureResponse);
    }
    public Optional<Boolean> ignoreQueryString() {
        return Optional.ofNullable(this.ignoreQueryString);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public Optional<String> locationId() {
        return Optional.ofNullable(this.locationId);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> salt() {
        return Optional.ofNullable(this.salt);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> transitionKey() {
        return Optional.ofNullable(this.transitionKey);
    }
    public Optional<Boolean> useAdvanced() {
        return Optional.ofNullable(this.useAdvanced);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable Boolean escapeHmacInputs;
        private @Nullable Boolean failureResponse;
        private @Nullable Boolean ignoreQueryString;
        private @Nullable String key;
        private @Nullable String location;
        private @Nullable String locationId;
        private @Nullable Boolean locked;
        private @Nullable String salt;
        private @Nullable String templateUuid;
        private @Nullable String transitionKey;
        private @Nullable Boolean useAdvanced;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.escapeHmacInputs = defaults.escapeHmacInputs;
    	      this.failureResponse = defaults.failureResponse;
    	      this.ignoreQueryString = defaults.ignoreQueryString;
    	      this.key = defaults.key;
    	      this.location = defaults.location;
    	      this.locationId = defaults.locationId;
    	      this.locked = defaults.locked;
    	      this.salt = defaults.salt;
    	      this.templateUuid = defaults.templateUuid;
    	      this.transitionKey = defaults.transitionKey;
    	      this.useAdvanced = defaults.useAdvanced;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder escapeHmacInputs(@Nullable Boolean escapeHmacInputs) {
            this.escapeHmacInputs = escapeHmacInputs;
            return this;
        }
        @CustomType.Setter
        public Builder failureResponse(@Nullable Boolean failureResponse) {
            this.failureResponse = failureResponse;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreQueryString(@Nullable Boolean ignoreQueryString) {
            this.ignoreQueryString = ignoreQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder locationId(@Nullable String locationId) {
            this.locationId = locationId;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder salt(@Nullable String salt) {
            this.salt = salt;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder transitionKey(@Nullable String transitionKey) {
            this.transitionKey = transitionKey;
            return this;
        }
        @CustomType.Setter
        public Builder useAdvanced(@Nullable Boolean useAdvanced) {
            this.useAdvanced = useAdvanced;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyTokenAuthorization();
            _resultValue.algorithm = algorithm;
            _resultValue.escapeHmacInputs = escapeHmacInputs;
            _resultValue.failureResponse = failureResponse;
            _resultValue.ignoreQueryString = ignoreQueryString;
            _resultValue.key = key;
            _resultValue.location = location;
            _resultValue.locationId = locationId;
            _resultValue.locked = locked;
            _resultValue.salt = salt;
            _resultValue.templateUuid = templateUuid;
            _resultValue.transitionKey = transitionKey;
            _resultValue.useAdvanced = useAdvanced;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
