// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GtmPropertyLivenessTestHttpHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmPropertyLivenessTest {
    private @Nullable Boolean answersRequired;
    private @Nullable Boolean disableNonstandardPortWarning;
    private @Nullable Boolean disabled;
    private @Nullable Double errorPenalty;
    private @Nullable Boolean httpError3xx;
    private @Nullable Boolean httpError4xx;
    private @Nullable Boolean httpError5xx;
    private @Nullable List<GtmPropertyLivenessTestHttpHeader> httpHeaders;
    private String name;
    private @Nullable Boolean peerCertificateVerification;
    private @Nullable Boolean recursionRequested;
    private @Nullable String requestString;
    private @Nullable String resourceType;
    private @Nullable String responseString;
    private @Nullable String sslClientCertificate;
    private @Nullable String sslClientPrivateKey;
    private Integer testInterval;
    private @Nullable String testObject;
    private @Nullable String testObjectPassword;
    private @Nullable Integer testObjectPort;
    private String testObjectProtocol;
    private @Nullable String testObjectUsername;
    private Double testTimeout;
    private @Nullable Double timeoutPenalty;

    private GtmPropertyLivenessTest() {}
    public Optional<Boolean> answersRequired() {
        return Optional.ofNullable(this.answersRequired);
    }
    public Optional<Boolean> disableNonstandardPortWarning() {
        return Optional.ofNullable(this.disableNonstandardPortWarning);
    }
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    public Optional<Double> errorPenalty() {
        return Optional.ofNullable(this.errorPenalty);
    }
    public Optional<Boolean> httpError3xx() {
        return Optional.ofNullable(this.httpError3xx);
    }
    public Optional<Boolean> httpError4xx() {
        return Optional.ofNullable(this.httpError4xx);
    }
    public Optional<Boolean> httpError5xx() {
        return Optional.ofNullable(this.httpError5xx);
    }
    public List<GtmPropertyLivenessTestHttpHeader> httpHeaders() {
        return this.httpHeaders == null ? List.of() : this.httpHeaders;
    }
    public String name() {
        return this.name;
    }
    public Optional<Boolean> peerCertificateVerification() {
        return Optional.ofNullable(this.peerCertificateVerification);
    }
    public Optional<Boolean> recursionRequested() {
        return Optional.ofNullable(this.recursionRequested);
    }
    public Optional<String> requestString() {
        return Optional.ofNullable(this.requestString);
    }
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public Optional<String> responseString() {
        return Optional.ofNullable(this.responseString);
    }
    public Optional<String> sslClientCertificate() {
        return Optional.ofNullable(this.sslClientCertificate);
    }
    public Optional<String> sslClientPrivateKey() {
        return Optional.ofNullable(this.sslClientPrivateKey);
    }
    public Integer testInterval() {
        return this.testInterval;
    }
    public Optional<String> testObject() {
        return Optional.ofNullable(this.testObject);
    }
    public Optional<String> testObjectPassword() {
        return Optional.ofNullable(this.testObjectPassword);
    }
    public Optional<Integer> testObjectPort() {
        return Optional.ofNullable(this.testObjectPort);
    }
    public String testObjectProtocol() {
        return this.testObjectProtocol;
    }
    public Optional<String> testObjectUsername() {
        return Optional.ofNullable(this.testObjectUsername);
    }
    public Double testTimeout() {
        return this.testTimeout;
    }
    public Optional<Double> timeoutPenalty() {
        return Optional.ofNullable(this.timeoutPenalty);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmPropertyLivenessTest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean answersRequired;
        private @Nullable Boolean disableNonstandardPortWarning;
        private @Nullable Boolean disabled;
        private @Nullable Double errorPenalty;
        private @Nullable Boolean httpError3xx;
        private @Nullable Boolean httpError4xx;
        private @Nullable Boolean httpError5xx;
        private @Nullable List<GtmPropertyLivenessTestHttpHeader> httpHeaders;
        private String name;
        private @Nullable Boolean peerCertificateVerification;
        private @Nullable Boolean recursionRequested;
        private @Nullable String requestString;
        private @Nullable String resourceType;
        private @Nullable String responseString;
        private @Nullable String sslClientCertificate;
        private @Nullable String sslClientPrivateKey;
        private Integer testInterval;
        private @Nullable String testObject;
        private @Nullable String testObjectPassword;
        private @Nullable Integer testObjectPort;
        private String testObjectProtocol;
        private @Nullable String testObjectUsername;
        private Double testTimeout;
        private @Nullable Double timeoutPenalty;
        public Builder() {}
        public Builder(GtmPropertyLivenessTest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answersRequired = defaults.answersRequired;
    	      this.disableNonstandardPortWarning = defaults.disableNonstandardPortWarning;
    	      this.disabled = defaults.disabled;
    	      this.errorPenalty = defaults.errorPenalty;
    	      this.httpError3xx = defaults.httpError3xx;
    	      this.httpError4xx = defaults.httpError4xx;
    	      this.httpError5xx = defaults.httpError5xx;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.name = defaults.name;
    	      this.peerCertificateVerification = defaults.peerCertificateVerification;
    	      this.recursionRequested = defaults.recursionRequested;
    	      this.requestString = defaults.requestString;
    	      this.resourceType = defaults.resourceType;
    	      this.responseString = defaults.responseString;
    	      this.sslClientCertificate = defaults.sslClientCertificate;
    	      this.sslClientPrivateKey = defaults.sslClientPrivateKey;
    	      this.testInterval = defaults.testInterval;
    	      this.testObject = defaults.testObject;
    	      this.testObjectPassword = defaults.testObjectPassword;
    	      this.testObjectPort = defaults.testObjectPort;
    	      this.testObjectProtocol = defaults.testObjectProtocol;
    	      this.testObjectUsername = defaults.testObjectUsername;
    	      this.testTimeout = defaults.testTimeout;
    	      this.timeoutPenalty = defaults.timeoutPenalty;
        }

        @CustomType.Setter
        public Builder answersRequired(@Nullable Boolean answersRequired) {
            this.answersRequired = answersRequired;
            return this;
        }
        @CustomType.Setter
        public Builder disableNonstandardPortWarning(@Nullable Boolean disableNonstandardPortWarning) {
            this.disableNonstandardPortWarning = disableNonstandardPortWarning;
            return this;
        }
        @CustomType.Setter
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        @CustomType.Setter
        public Builder errorPenalty(@Nullable Double errorPenalty) {
            this.errorPenalty = errorPenalty;
            return this;
        }
        @CustomType.Setter
        public Builder httpError3xx(@Nullable Boolean httpError3xx) {
            this.httpError3xx = httpError3xx;
            return this;
        }
        @CustomType.Setter
        public Builder httpError4xx(@Nullable Boolean httpError4xx) {
            this.httpError4xx = httpError4xx;
            return this;
        }
        @CustomType.Setter
        public Builder httpError5xx(@Nullable Boolean httpError5xx) {
            this.httpError5xx = httpError5xx;
            return this;
        }
        @CustomType.Setter
        public Builder httpHeaders(@Nullable List<GtmPropertyLivenessTestHttpHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public Builder httpHeaders(GtmPropertyLivenessTestHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder peerCertificateVerification(@Nullable Boolean peerCertificateVerification) {
            this.peerCertificateVerification = peerCertificateVerification;
            return this;
        }
        @CustomType.Setter
        public Builder recursionRequested(@Nullable Boolean recursionRequested) {
            this.recursionRequested = recursionRequested;
            return this;
        }
        @CustomType.Setter
        public Builder requestString(@Nullable String requestString) {
            this.requestString = requestString;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        @CustomType.Setter
        public Builder responseString(@Nullable String responseString) {
            this.responseString = responseString;
            return this;
        }
        @CustomType.Setter
        public Builder sslClientCertificate(@Nullable String sslClientCertificate) {
            this.sslClientCertificate = sslClientCertificate;
            return this;
        }
        @CustomType.Setter
        public Builder sslClientPrivateKey(@Nullable String sslClientPrivateKey) {
            this.sslClientPrivateKey = sslClientPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder testInterval(Integer testInterval) {
            this.testInterval = Objects.requireNonNull(testInterval);
            return this;
        }
        @CustomType.Setter
        public Builder testObject(@Nullable String testObject) {
            this.testObject = testObject;
            return this;
        }
        @CustomType.Setter
        public Builder testObjectPassword(@Nullable String testObjectPassword) {
            this.testObjectPassword = testObjectPassword;
            return this;
        }
        @CustomType.Setter
        public Builder testObjectPort(@Nullable Integer testObjectPort) {
            this.testObjectPort = testObjectPort;
            return this;
        }
        @CustomType.Setter
        public Builder testObjectProtocol(String testObjectProtocol) {
            this.testObjectProtocol = Objects.requireNonNull(testObjectProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder testObjectUsername(@Nullable String testObjectUsername) {
            this.testObjectUsername = testObjectUsername;
            return this;
        }
        @CustomType.Setter
        public Builder testTimeout(Double testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutPenalty(@Nullable Double timeoutPenalty) {
            this.timeoutPenalty = timeoutPenalty;
            return this;
        }
        public GtmPropertyLivenessTest build() {
            final var _resultValue = new GtmPropertyLivenessTest();
            _resultValue.answersRequired = answersRequired;
            _resultValue.disableNonstandardPortWarning = disableNonstandardPortWarning;
            _resultValue.disabled = disabled;
            _resultValue.errorPenalty = errorPenalty;
            _resultValue.httpError3xx = httpError3xx;
            _resultValue.httpError4xx = httpError4xx;
            _resultValue.httpError5xx = httpError5xx;
            _resultValue.httpHeaders = httpHeaders;
            _resultValue.name = name;
            _resultValue.peerCertificateVerification = peerCertificateVerification;
            _resultValue.recursionRequested = recursionRequested;
            _resultValue.requestString = requestString;
            _resultValue.resourceType = resourceType;
            _resultValue.responseString = responseString;
            _resultValue.sslClientCertificate = sslClientCertificate;
            _resultValue.sslClientPrivateKey = sslClientPrivateKey;
            _resultValue.testInterval = testInterval;
            _resultValue.testObject = testObject;
            _resultValue.testObjectPassword = testObjectPassword;
            _resultValue.testObjectPort = testObjectPort;
            _resultValue.testObjectProtocol = testObjectProtocol;
            _resultValue.testObjectUsername = testObjectUsername;
            _resultValue.testTimeout = testTimeout;
            _resultValue.timeoutPenalty = timeoutPenalty;
            return _resultValue;
        }
    }
}
