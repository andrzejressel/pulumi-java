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
public final class GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader {
    private @Nullable String headerName;
    private @Nullable Boolean locked;
    private @Nullable Boolean matchCaseSensitiveValue;
    private @Nullable String matchOperator;
    private @Nullable Boolean matchWildcardName;
    private @Nullable Boolean matchWildcardValue;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable List<String> values;

    private GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader() {}
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public Optional<Boolean> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }
    public Optional<Boolean> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String headerName;
        private @Nullable Boolean locked;
        private @Nullable Boolean matchCaseSensitiveValue;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcardName;
        private @Nullable Boolean matchWildcardValue;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.locked = defaults.locked;
    	      this.matchCaseSensitiveValue = defaults.matchCaseSensitiveValue;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcardName = defaults.matchWildcardName;
    	      this.matchWildcardValue = defaults.matchWildcardValue;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitiveValue(@Nullable Boolean matchCaseSensitiveValue) {
            this.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardName(@Nullable Boolean matchWildcardName) {
            this.matchWildcardName = matchWildcardName;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardValue(@Nullable Boolean matchWildcardValue) {
            this.matchWildcardValue = matchWildcardValue;
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
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionRequestHeader();
            _resultValue.headerName = headerName;
            _resultValue.locked = locked;
            _resultValue.matchCaseSensitiveValue = matchCaseSensitiveValue;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcardName = matchWildcardName;
            _resultValue.matchWildcardValue = matchWildcardValue;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
