// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CpsDvEnrollmentHttpChallenge {
    private @Nullable String domain;
    private @Nullable String fullPath;
    private @Nullable String responseBody;

    private CpsDvEnrollmentHttpChallenge() {}
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<String> fullPath() {
        return Optional.ofNullable(this.fullPath);
    }
    public Optional<String> responseBody() {
        return Optional.ofNullable(this.responseBody);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpsDvEnrollmentHttpChallenge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String fullPath;
        private @Nullable String responseBody;
        public Builder() {}
        public Builder(CpsDvEnrollmentHttpChallenge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.fullPath = defaults.fullPath;
    	      this.responseBody = defaults.responseBody;
        }

        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder fullPath(@Nullable String fullPath) {
            this.fullPath = fullPath;
            return this;
        }
        @CustomType.Setter
        public Builder responseBody(@Nullable String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        public CpsDvEnrollmentHttpChallenge build() {
            final var _resultValue = new CpsDvEnrollmentHttpChallenge();
            _resultValue.domain = domain;
            _resultValue.fullPath = fullPath;
            _resultValue.responseBody = responseBody;
            return _resultValue;
        }
    }
}
