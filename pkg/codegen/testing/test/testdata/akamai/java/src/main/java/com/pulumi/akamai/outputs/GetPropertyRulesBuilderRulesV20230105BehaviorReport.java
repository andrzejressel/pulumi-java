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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorReport {
    private @Nullable List<String> cookies;
    private @Nullable String customLogField;
    private @Nullable Boolean locked;
    private @Nullable Boolean logAcceptLanguage;
    private @Nullable String logCookies;
    private @Nullable Boolean logCustomLogField;
    private @Nullable Boolean logEdgeIp;
    private @Nullable Boolean logHost;
    private @Nullable Boolean logReferer;
    private @Nullable Boolean logUserAgent;
    private @Nullable Boolean logXForwardedFor;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorReport() {}
    public List<String> cookies() {
        return this.cookies == null ? List.of() : this.cookies;
    }
    public Optional<String> customLogField() {
        return Optional.ofNullable(this.customLogField);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> logAcceptLanguage() {
        return Optional.ofNullable(this.logAcceptLanguage);
    }
    public Optional<String> logCookies() {
        return Optional.ofNullable(this.logCookies);
    }
    public Optional<Boolean> logCustomLogField() {
        return Optional.ofNullable(this.logCustomLogField);
    }
    public Optional<Boolean> logEdgeIp() {
        return Optional.ofNullable(this.logEdgeIp);
    }
    public Optional<Boolean> logHost() {
        return Optional.ofNullable(this.logHost);
    }
    public Optional<Boolean> logReferer() {
        return Optional.ofNullable(this.logReferer);
    }
    public Optional<Boolean> logUserAgent() {
        return Optional.ofNullable(this.logUserAgent);
    }
    public Optional<Boolean> logXForwardedFor() {
        return Optional.ofNullable(this.logXForwardedFor);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorReport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> cookies;
        private @Nullable String customLogField;
        private @Nullable Boolean locked;
        private @Nullable Boolean logAcceptLanguage;
        private @Nullable String logCookies;
        private @Nullable Boolean logCustomLogField;
        private @Nullable Boolean logEdgeIp;
        private @Nullable Boolean logHost;
        private @Nullable Boolean logReferer;
        private @Nullable Boolean logUserAgent;
        private @Nullable Boolean logXForwardedFor;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorReport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.customLogField = defaults.customLogField;
    	      this.locked = defaults.locked;
    	      this.logAcceptLanguage = defaults.logAcceptLanguage;
    	      this.logCookies = defaults.logCookies;
    	      this.logCustomLogField = defaults.logCustomLogField;
    	      this.logEdgeIp = defaults.logEdgeIp;
    	      this.logHost = defaults.logHost;
    	      this.logReferer = defaults.logReferer;
    	      this.logUserAgent = defaults.logUserAgent;
    	      this.logXForwardedFor = defaults.logXForwardedFor;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cookies(@Nullable List<String> cookies) {
            this.cookies = cookies;
            return this;
        }
        public Builder cookies(String... cookies) {
            return cookies(List.of(cookies));
        }
        @CustomType.Setter
        public Builder customLogField(@Nullable String customLogField) {
            this.customLogField = customLogField;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder logAcceptLanguage(@Nullable Boolean logAcceptLanguage) {
            this.logAcceptLanguage = logAcceptLanguage;
            return this;
        }
        @CustomType.Setter
        public Builder logCookies(@Nullable String logCookies) {
            this.logCookies = logCookies;
            return this;
        }
        @CustomType.Setter
        public Builder logCustomLogField(@Nullable Boolean logCustomLogField) {
            this.logCustomLogField = logCustomLogField;
            return this;
        }
        @CustomType.Setter
        public Builder logEdgeIp(@Nullable Boolean logEdgeIp) {
            this.logEdgeIp = logEdgeIp;
            return this;
        }
        @CustomType.Setter
        public Builder logHost(@Nullable Boolean logHost) {
            this.logHost = logHost;
            return this;
        }
        @CustomType.Setter
        public Builder logReferer(@Nullable Boolean logReferer) {
            this.logReferer = logReferer;
            return this;
        }
        @CustomType.Setter
        public Builder logUserAgent(@Nullable Boolean logUserAgent) {
            this.logUserAgent = logUserAgent;
            return this;
        }
        @CustomType.Setter
        public Builder logXForwardedFor(@Nullable Boolean logXForwardedFor) {
            this.logXForwardedFor = logXForwardedFor;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorReport build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorReport();
            _resultValue.cookies = cookies;
            _resultValue.customLogField = customLogField;
            _resultValue.locked = locked;
            _resultValue.logAcceptLanguage = logAcceptLanguage;
            _resultValue.logCookies = logCookies;
            _resultValue.logCustomLogField = logCustomLogField;
            _resultValue.logEdgeIp = logEdgeIp;
            _resultValue.logHost = logHost;
            _resultValue.logReferer = logReferer;
            _resultValue.logUserAgent = logUserAgent;
            _resultValue.logXForwardedFor = logXForwardedFor;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
