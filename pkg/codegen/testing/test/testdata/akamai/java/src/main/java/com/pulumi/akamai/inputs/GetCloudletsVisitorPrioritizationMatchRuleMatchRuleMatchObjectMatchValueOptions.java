// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions Empty = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions();

    @Import(name="valueCaseSensitive")
    private @Nullable Boolean valueCaseSensitive;

    public Optional<Boolean> valueCaseSensitive() {
        return Optional.ofNullable(this.valueCaseSensitive);
    }

    @Import(name="valueEscaped")
    private @Nullable Boolean valueEscaped;

    public Optional<Boolean> valueEscaped() {
        return Optional.ofNullable(this.valueEscaped);
    }

    @Import(name="valueHasWildcard")
    private @Nullable Boolean valueHasWildcard;

    public Optional<Boolean> valueHasWildcard() {
        return Optional.ofNullable(this.valueHasWildcard);
    }

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions() {}

    private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions $) {
        this.valueCaseSensitive = $.valueCaseSensitive;
        this.valueEscaped = $.valueEscaped;
        this.valueHasWildcard = $.valueHasWildcard;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions $;

        public Builder() {
            $ = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions();
        }

        public Builder(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions defaults) {
            $ = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions(Objects.requireNonNull(defaults));
        }

        public Builder valueCaseSensitive(@Nullable Boolean valueCaseSensitive) {
            $.valueCaseSensitive = valueCaseSensitive;
            return this;
        }

        public Builder valueEscaped(@Nullable Boolean valueEscaped) {
            $.valueEscaped = valueEscaped;
            return this;
        }

        public Builder valueHasWildcard(@Nullable Boolean valueHasWildcard) {
            $.valueHasWildcard = valueHasWildcard;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions build() {
            return $;
        }
    }

}
