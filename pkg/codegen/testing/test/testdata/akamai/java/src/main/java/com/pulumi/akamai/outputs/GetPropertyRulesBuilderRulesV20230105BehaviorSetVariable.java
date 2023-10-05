// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable {
    private @Nullable String algorithm;
    private @Nullable Boolean caseSensitive;
    private @Nullable String certificateFieldName;
    private @Nullable String cookieName;
    private @Nullable String deviceProfile;
    private @Nullable String encryptionKey;
    private @Nullable String encryptionMode;
    private @Nullable String endIndex;
    private @Nullable String exceptChars;
    private @Nullable String extractLocation;
    private @Nullable String forceChars;
    private @Nullable String formatString;
    private @Nullable String generator;
    private @Nullable Boolean globalSubstitution;
    private @Nullable String headerName;
    private @Nullable String hmacAlgorithm;
    private @Nullable String hmacKey;
    private @Nullable String initializationVector;
    private @Nullable String ipVersion;
    private @Nullable Integer ipv4Prefix;
    private @Nullable Integer ipv6Prefix;
    private @Nullable String locationId;
    private @Nullable Boolean locked;
    private @Nullable Integer max;
    private @Nullable String maxRandomNumber;
    private @Nullable Integer min;
    private @Nullable String minRandomNumber;
    private @Nullable String nonce;
    private @Nullable Integer numberOfBytes;
    private @Nullable String operandOne;
    private @Nullable String paramName;
    private @Nullable String pathComponentOffset;
    private @Nullable Boolean prependBytes;
    private @Nullable String queryParameterName;
    private @Nullable String regex;
    private @Nullable String replacement;
    private @Nullable String responseHeaderName;
    private @Nullable String separator;
    private @Nullable String setCookieName;
    private @Nullable String startIndex;
    private @Nullable String subString;
    private @Nullable String templateUuid;
    private @Nullable String transform;
    private @Nullable String uuid;
    private @Nullable String valueSource;
    private @Nullable String variableName;
    private @Nullable String variableValue;

    private GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable() {}
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<Boolean> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }
    public Optional<String> certificateFieldName() {
        return Optional.ofNullable(this.certificateFieldName);
    }
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    public Optional<String> deviceProfile() {
        return Optional.ofNullable(this.deviceProfile);
    }
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    public Optional<String> encryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }
    public Optional<String> endIndex() {
        return Optional.ofNullable(this.endIndex);
    }
    public Optional<String> exceptChars() {
        return Optional.ofNullable(this.exceptChars);
    }
    public Optional<String> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }
    public Optional<String> forceChars() {
        return Optional.ofNullable(this.forceChars);
    }
    public Optional<String> formatString() {
        return Optional.ofNullable(this.formatString);
    }
    public Optional<String> generator() {
        return Optional.ofNullable(this.generator);
    }
    public Optional<Boolean> globalSubstitution() {
        return Optional.ofNullable(this.globalSubstitution);
    }
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    public Optional<String> hmacAlgorithm() {
        return Optional.ofNullable(this.hmacAlgorithm);
    }
    public Optional<String> hmacKey() {
        return Optional.ofNullable(this.hmacKey);
    }
    public Optional<String> initializationVector() {
        return Optional.ofNullable(this.initializationVector);
    }
    public Optional<String> ipVersion() {
        return Optional.ofNullable(this.ipVersion);
    }
    public Optional<Integer> ipv4Prefix() {
        return Optional.ofNullable(this.ipv4Prefix);
    }
    public Optional<Integer> ipv6Prefix() {
        return Optional.ofNullable(this.ipv6Prefix);
    }
    public Optional<String> locationId() {
        return Optional.ofNullable(this.locationId);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Integer> max() {
        return Optional.ofNullable(this.max);
    }
    public Optional<String> maxRandomNumber() {
        return Optional.ofNullable(this.maxRandomNumber);
    }
    public Optional<Integer> min() {
        return Optional.ofNullable(this.min);
    }
    public Optional<String> minRandomNumber() {
        return Optional.ofNullable(this.minRandomNumber);
    }
    public Optional<String> nonce() {
        return Optional.ofNullable(this.nonce);
    }
    public Optional<Integer> numberOfBytes() {
        return Optional.ofNullable(this.numberOfBytes);
    }
    public Optional<String> operandOne() {
        return Optional.ofNullable(this.operandOne);
    }
    public Optional<String> paramName() {
        return Optional.ofNullable(this.paramName);
    }
    public Optional<String> pathComponentOffset() {
        return Optional.ofNullable(this.pathComponentOffset);
    }
    public Optional<Boolean> prependBytes() {
        return Optional.ofNullable(this.prependBytes);
    }
    public Optional<String> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    public Optional<String> replacement() {
        return Optional.ofNullable(this.replacement);
    }
    public Optional<String> responseHeaderName() {
        return Optional.ofNullable(this.responseHeaderName);
    }
    public Optional<String> separator() {
        return Optional.ofNullable(this.separator);
    }
    public Optional<String> setCookieName() {
        return Optional.ofNullable(this.setCookieName);
    }
    public Optional<String> startIndex() {
        return Optional.ofNullable(this.startIndex);
    }
    public Optional<String> subString() {
        return Optional.ofNullable(this.subString);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> transform() {
        return Optional.ofNullable(this.transform);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> valueSource() {
        return Optional.ofNullable(this.valueSource);
    }
    public Optional<String> variableName() {
        return Optional.ofNullable(this.variableName);
    }
    public Optional<String> variableValue() {
        return Optional.ofNullable(this.variableValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable Boolean caseSensitive;
        private @Nullable String certificateFieldName;
        private @Nullable String cookieName;
        private @Nullable String deviceProfile;
        private @Nullable String encryptionKey;
        private @Nullable String encryptionMode;
        private @Nullable String endIndex;
        private @Nullable String exceptChars;
        private @Nullable String extractLocation;
        private @Nullable String forceChars;
        private @Nullable String formatString;
        private @Nullable String generator;
        private @Nullable Boolean globalSubstitution;
        private @Nullable String headerName;
        private @Nullable String hmacAlgorithm;
        private @Nullable String hmacKey;
        private @Nullable String initializationVector;
        private @Nullable String ipVersion;
        private @Nullable Integer ipv4Prefix;
        private @Nullable Integer ipv6Prefix;
        private @Nullable String locationId;
        private @Nullable Boolean locked;
        private @Nullable Integer max;
        private @Nullable String maxRandomNumber;
        private @Nullable Integer min;
        private @Nullable String minRandomNumber;
        private @Nullable String nonce;
        private @Nullable Integer numberOfBytes;
        private @Nullable String operandOne;
        private @Nullable String paramName;
        private @Nullable String pathComponentOffset;
        private @Nullable Boolean prependBytes;
        private @Nullable String queryParameterName;
        private @Nullable String regex;
        private @Nullable String replacement;
        private @Nullable String responseHeaderName;
        private @Nullable String separator;
        private @Nullable String setCookieName;
        private @Nullable String startIndex;
        private @Nullable String subString;
        private @Nullable String templateUuid;
        private @Nullable String transform;
        private @Nullable String uuid;
        private @Nullable String valueSource;
        private @Nullable String variableName;
        private @Nullable String variableValue;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.caseSensitive = defaults.caseSensitive;
    	      this.certificateFieldName = defaults.certificateFieldName;
    	      this.cookieName = defaults.cookieName;
    	      this.deviceProfile = defaults.deviceProfile;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionMode = defaults.encryptionMode;
    	      this.endIndex = defaults.endIndex;
    	      this.exceptChars = defaults.exceptChars;
    	      this.extractLocation = defaults.extractLocation;
    	      this.forceChars = defaults.forceChars;
    	      this.formatString = defaults.formatString;
    	      this.generator = defaults.generator;
    	      this.globalSubstitution = defaults.globalSubstitution;
    	      this.headerName = defaults.headerName;
    	      this.hmacAlgorithm = defaults.hmacAlgorithm;
    	      this.hmacKey = defaults.hmacKey;
    	      this.initializationVector = defaults.initializationVector;
    	      this.ipVersion = defaults.ipVersion;
    	      this.ipv4Prefix = defaults.ipv4Prefix;
    	      this.ipv6Prefix = defaults.ipv6Prefix;
    	      this.locationId = defaults.locationId;
    	      this.locked = defaults.locked;
    	      this.max = defaults.max;
    	      this.maxRandomNumber = defaults.maxRandomNumber;
    	      this.min = defaults.min;
    	      this.minRandomNumber = defaults.minRandomNumber;
    	      this.nonce = defaults.nonce;
    	      this.numberOfBytes = defaults.numberOfBytes;
    	      this.operandOne = defaults.operandOne;
    	      this.paramName = defaults.paramName;
    	      this.pathComponentOffset = defaults.pathComponentOffset;
    	      this.prependBytes = defaults.prependBytes;
    	      this.queryParameterName = defaults.queryParameterName;
    	      this.regex = defaults.regex;
    	      this.replacement = defaults.replacement;
    	      this.responseHeaderName = defaults.responseHeaderName;
    	      this.separator = defaults.separator;
    	      this.setCookieName = defaults.setCookieName;
    	      this.startIndex = defaults.startIndex;
    	      this.subString = defaults.subString;
    	      this.templateUuid = defaults.templateUuid;
    	      this.transform = defaults.transform;
    	      this.uuid = defaults.uuid;
    	      this.valueSource = defaults.valueSource;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder caseSensitive(@Nullable Boolean caseSensitive) {
            this.caseSensitive = caseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder certificateFieldName(@Nullable String certificateFieldName) {
            this.certificateFieldName = certificateFieldName;
            return this;
        }
        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder deviceProfile(@Nullable String deviceProfile) {
            this.deviceProfile = deviceProfile;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionMode(@Nullable String encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }
        @CustomType.Setter
        public Builder endIndex(@Nullable String endIndex) {
            this.endIndex = endIndex;
            return this;
        }
        @CustomType.Setter
        public Builder exceptChars(@Nullable String exceptChars) {
            this.exceptChars = exceptChars;
            return this;
        }
        @CustomType.Setter
        public Builder extractLocation(@Nullable String extractLocation) {
            this.extractLocation = extractLocation;
            return this;
        }
        @CustomType.Setter
        public Builder forceChars(@Nullable String forceChars) {
            this.forceChars = forceChars;
            return this;
        }
        @CustomType.Setter
        public Builder formatString(@Nullable String formatString) {
            this.formatString = formatString;
            return this;
        }
        @CustomType.Setter
        public Builder generator(@Nullable String generator) {
            this.generator = generator;
            return this;
        }
        @CustomType.Setter
        public Builder globalSubstitution(@Nullable Boolean globalSubstitution) {
            this.globalSubstitution = globalSubstitution;
            return this;
        }
        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder hmacAlgorithm(@Nullable String hmacAlgorithm) {
            this.hmacAlgorithm = hmacAlgorithm;
            return this;
        }
        @CustomType.Setter
        public Builder hmacKey(@Nullable String hmacKey) {
            this.hmacKey = hmacKey;
            return this;
        }
        @CustomType.Setter
        public Builder initializationVector(@Nullable String initializationVector) {
            this.initializationVector = initializationVector;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(@Nullable String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Prefix(@Nullable Integer ipv4Prefix) {
            this.ipv4Prefix = ipv4Prefix;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6Prefix(@Nullable Integer ipv6Prefix) {
            this.ipv6Prefix = ipv6Prefix;
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
        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        @CustomType.Setter
        public Builder maxRandomNumber(@Nullable String maxRandomNumber) {
            this.maxRandomNumber = maxRandomNumber;
            return this;
        }
        @CustomType.Setter
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        @CustomType.Setter
        public Builder minRandomNumber(@Nullable String minRandomNumber) {
            this.minRandomNumber = minRandomNumber;
            return this;
        }
        @CustomType.Setter
        public Builder nonce(@Nullable String nonce) {
            this.nonce = nonce;
            return this;
        }
        @CustomType.Setter
        public Builder numberOfBytes(@Nullable Integer numberOfBytes) {
            this.numberOfBytes = numberOfBytes;
            return this;
        }
        @CustomType.Setter
        public Builder operandOne(@Nullable String operandOne) {
            this.operandOne = operandOne;
            return this;
        }
        @CustomType.Setter
        public Builder paramName(@Nullable String paramName) {
            this.paramName = paramName;
            return this;
        }
        @CustomType.Setter
        public Builder pathComponentOffset(@Nullable String pathComponentOffset) {
            this.pathComponentOffset = pathComponentOffset;
            return this;
        }
        @CustomType.Setter
        public Builder prependBytes(@Nullable Boolean prependBytes) {
            this.prependBytes = prependBytes;
            return this;
        }
        @CustomType.Setter
        public Builder queryParameterName(@Nullable String queryParameterName) {
            this.queryParameterName = queryParameterName;
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder replacement(@Nullable String replacement) {
            this.replacement = replacement;
            return this;
        }
        @CustomType.Setter
        public Builder responseHeaderName(@Nullable String responseHeaderName) {
            this.responseHeaderName = responseHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder separator(@Nullable String separator) {
            this.separator = separator;
            return this;
        }
        @CustomType.Setter
        public Builder setCookieName(@Nullable String setCookieName) {
            this.setCookieName = setCookieName;
            return this;
        }
        @CustomType.Setter
        public Builder startIndex(@Nullable String startIndex) {
            this.startIndex = startIndex;
            return this;
        }
        @CustomType.Setter
        public Builder subString(@Nullable String subString) {
            this.subString = subString;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder transform(@Nullable String transform) {
            this.transform = transform;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder valueSource(@Nullable String valueSource) {
            this.valueSource = valueSource;
            return this;
        }
        @CustomType.Setter
        public Builder variableName(@Nullable String variableName) {
            this.variableName = variableName;
            return this;
        }
        @CustomType.Setter
        public Builder variableValue(@Nullable String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorSetVariable();
            _resultValue.algorithm = algorithm;
            _resultValue.caseSensitive = caseSensitive;
            _resultValue.certificateFieldName = certificateFieldName;
            _resultValue.cookieName = cookieName;
            _resultValue.deviceProfile = deviceProfile;
            _resultValue.encryptionKey = encryptionKey;
            _resultValue.encryptionMode = encryptionMode;
            _resultValue.endIndex = endIndex;
            _resultValue.exceptChars = exceptChars;
            _resultValue.extractLocation = extractLocation;
            _resultValue.forceChars = forceChars;
            _resultValue.formatString = formatString;
            _resultValue.generator = generator;
            _resultValue.globalSubstitution = globalSubstitution;
            _resultValue.headerName = headerName;
            _resultValue.hmacAlgorithm = hmacAlgorithm;
            _resultValue.hmacKey = hmacKey;
            _resultValue.initializationVector = initializationVector;
            _resultValue.ipVersion = ipVersion;
            _resultValue.ipv4Prefix = ipv4Prefix;
            _resultValue.ipv6Prefix = ipv6Prefix;
            _resultValue.locationId = locationId;
            _resultValue.locked = locked;
            _resultValue.max = max;
            _resultValue.maxRandomNumber = maxRandomNumber;
            _resultValue.min = min;
            _resultValue.minRandomNumber = minRandomNumber;
            _resultValue.nonce = nonce;
            _resultValue.numberOfBytes = numberOfBytes;
            _resultValue.operandOne = operandOne;
            _resultValue.paramName = paramName;
            _resultValue.pathComponentOffset = pathComponentOffset;
            _resultValue.prependBytes = prependBytes;
            _resultValue.queryParameterName = queryParameterName;
            _resultValue.regex = regex;
            _resultValue.replacement = replacement;
            _resultValue.responseHeaderName = responseHeaderName;
            _resultValue.separator = separator;
            _resultValue.setCookieName = setCookieName;
            _resultValue.startIndex = startIndex;
            _resultValue.subString = subString;
            _resultValue.templateUuid = templateUuid;
            _resultValue.transform = transform;
            _resultValue.uuid = uuid;
            _resultValue.valueSource = valueSource;
            _resultValue.variableName = variableName;
            _resultValue.variableValue = variableValue;
            return _resultValue;
        }
    }
}
