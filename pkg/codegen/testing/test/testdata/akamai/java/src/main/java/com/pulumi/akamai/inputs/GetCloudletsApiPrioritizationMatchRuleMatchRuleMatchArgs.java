// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs Empty = new GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs();

    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="checkIps")
    private @Nullable Output<String> checkIps;

    public Optional<Output<String>> checkIps() {
        return Optional.ofNullable(this.checkIps);
    }

    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchType")
    private @Nullable Output<String> matchType;

    public Optional<Output<String>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="matchValue")
    private @Nullable Output<String> matchValue;

    public Optional<Output<String>> matchValue() {
        return Optional.ofNullable(this.matchValue);
    }

    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    @Import(name="objectMatchValues")
    private @Nullable Output<List<GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs>> objectMatchValues;

    public Optional<Output<List<GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs>>> objectMatchValues() {
        return Optional.ofNullable(this.objectMatchValues);
    }

    private GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs() {}

    private GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs(GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.checkIps = $.checkIps;
        this.matchOperator = $.matchOperator;
        this.matchType = $.matchType;
        this.matchValue = $.matchValue;
        this.negate = $.negate;
        this.objectMatchValues = $.objectMatchValues;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs $;

        public Builder() {
            $ = new GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs();
        }

        public Builder(GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs defaults) {
            $ = new GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder checkIps(@Nullable Output<String> checkIps) {
            $.checkIps = checkIps;
            return this;
        }

        public Builder checkIps(String checkIps) {
            return checkIps(Output.of(checkIps));
        }

        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        public Builder matchType(@Nullable Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder matchValue(@Nullable Output<String> matchValue) {
            $.matchValue = matchValue;
            return this;
        }

        public Builder matchValue(String matchValue) {
            return matchValue(Output.of(matchValue));
        }

        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        public Builder objectMatchValues(@Nullable Output<List<GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs>> objectMatchValues) {
            $.objectMatchValues = objectMatchValues;
            return this;
        }

        public Builder objectMatchValues(List<GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs> objectMatchValues) {
            return objectMatchValues(Output.of(objectMatchValues));
        }

        public Builder objectMatchValues(GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchObjectMatchValueArgs... objectMatchValues) {
            return objectMatchValues(List.of(objectMatchValues));
        }

        public GetCloudletsApiPrioritizationMatchRuleMatchRuleMatchArgs build() {
            return $;
        }
    }

}
