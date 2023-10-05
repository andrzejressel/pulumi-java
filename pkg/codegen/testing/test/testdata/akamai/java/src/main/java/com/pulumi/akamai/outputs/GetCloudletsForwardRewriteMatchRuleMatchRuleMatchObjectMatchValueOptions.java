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
public final class GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions {
    private @Nullable Boolean valueCaseSensitive;
    private @Nullable Boolean valueEscaped;
    private @Nullable Boolean valueHasWildcard;
    private @Nullable List<String> values;

    private GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions() {}
    public Optional<Boolean> valueCaseSensitive() {
        return Optional.ofNullable(this.valueCaseSensitive);
    }
    public Optional<Boolean> valueEscaped() {
        return Optional.ofNullable(this.valueEscaped);
    }
    public Optional<Boolean> valueHasWildcard() {
        return Optional.ofNullable(this.valueHasWildcard);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean valueCaseSensitive;
        private @Nullable Boolean valueEscaped;
        private @Nullable Boolean valueHasWildcard;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.valueCaseSensitive = defaults.valueCaseSensitive;
    	      this.valueEscaped = defaults.valueEscaped;
    	      this.valueHasWildcard = defaults.valueHasWildcard;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder valueCaseSensitive(@Nullable Boolean valueCaseSensitive) {
            this.valueCaseSensitive = valueCaseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder valueEscaped(@Nullable Boolean valueEscaped) {
            this.valueEscaped = valueEscaped;
            return this;
        }
        @CustomType.Setter
        public Builder valueHasWildcard(@Nullable Boolean valueHasWildcard) {
            this.valueHasWildcard = valueHasWildcard;
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
        public GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions build() {
            final var _resultValue = new GetCloudletsForwardRewriteMatchRuleMatchRuleMatchObjectMatchValueOptions();
            _resultValue.valueCaseSensitive = valueCaseSensitive;
            _resultValue.valueEscaped = valueEscaped;
            _resultValue.valueHasWildcard = valueHasWildcard;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
