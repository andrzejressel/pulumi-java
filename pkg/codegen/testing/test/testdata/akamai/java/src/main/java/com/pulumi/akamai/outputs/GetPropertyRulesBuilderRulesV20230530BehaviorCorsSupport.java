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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport {
    private @Nullable Boolean allowCredentials;
    private @Nullable String allowHeaders;
    private @Nullable String allowOrigins;
    private @Nullable Boolean enabled;
    private @Nullable List<String> exposeHeaders;
    private @Nullable List<String> headers;
    private @Nullable Boolean locked;
    private @Nullable List<String> methods;
    private @Nullable List<String> origins;
    private @Nullable String preflightMaxAge;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport() {}
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    public Optional<String> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }
    public Optional<String> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    public List<String> headers() {
        return this.headers == null ? List.of() : this.headers;
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public List<String> methods() {
        return this.methods == null ? List.of() : this.methods;
    }
    public List<String> origins() {
        return this.origins == null ? List.of() : this.origins;
    }
    public Optional<String> preflightMaxAge() {
        return Optional.ofNullable(this.preflightMaxAge);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable String allowHeaders;
        private @Nullable String allowOrigins;
        private @Nullable Boolean enabled;
        private @Nullable List<String> exposeHeaders;
        private @Nullable List<String> headers;
        private @Nullable Boolean locked;
        private @Nullable List<String> methods;
        private @Nullable List<String> origins;
        private @Nullable String preflightMaxAge;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.enabled = defaults.enabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.headers = defaults.headers;
    	      this.locked = defaults.locked;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
    	      this.preflightMaxAge = defaults.preflightMaxAge;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder allowHeaders(@Nullable String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder allowOrigins(@Nullable String allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        @CustomType.Setter
        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        @CustomType.Setter
        public Builder origins(@Nullable List<String> origins) {
            this.origins = origins;
            return this;
        }
        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }
        @CustomType.Setter
        public Builder preflightMaxAge(@Nullable String preflightMaxAge) {
            this.preflightMaxAge = preflightMaxAge;
            return this;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorCorsSupport();
            _resultValue.allowCredentials = allowCredentials;
            _resultValue.allowHeaders = allowHeaders;
            _resultValue.allowOrigins = allowOrigins;
            _resultValue.enabled = enabled;
            _resultValue.exposeHeaders = exposeHeaders;
            _resultValue.headers = headers;
            _resultValue.locked = locked;
            _resultValue.methods = methods;
            _resultValue.origins = origins;
            _resultValue.preflightMaxAge = preflightMaxAge;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
