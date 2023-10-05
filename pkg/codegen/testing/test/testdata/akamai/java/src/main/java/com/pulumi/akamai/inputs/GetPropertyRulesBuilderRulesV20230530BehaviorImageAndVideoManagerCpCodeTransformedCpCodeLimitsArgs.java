// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs();

    @Import(name="currentCapacity")
    private @Nullable Output<Integer> currentCapacity;

    public Optional<Output<Integer>> currentCapacity() {
        return Optional.ofNullable(this.currentCapacity);
    }

    @Import(name="limit")
    private @Nullable Output<Integer> limit;

    public Optional<Output<Integer>> limit() {
        return Optional.ofNullable(this.limit);
    }

    @Import(name="limitType")
    private @Nullable Output<String> limitType;

    public Optional<Output<String>> limitType() {
        return Optional.ofNullable(this.limitType);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs $) {
        this.currentCapacity = $.currentCapacity;
        this.limit = $.limit;
        this.limitType = $.limitType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs(Objects.requireNonNull(defaults));
        }

        public Builder currentCapacity(@Nullable Output<Integer> currentCapacity) {
            $.currentCapacity = currentCapacity;
            return this;
        }

        public Builder currentCapacity(Integer currentCapacity) {
            return currentCapacity(Output.of(currentCapacity));
        }

        public Builder limit(@Nullable Output<Integer> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            return limit(Output.of(limit));
        }

        public Builder limitType(@Nullable Output<String> limitType) {
            $.limitType = limitType;
            return this;
        }

        public Builder limitType(String limitType) {
            return limitType(Output.of(limitType));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImageAndVideoManagerCpCodeTransformedCpCodeLimitsArgs build() {
            return $;
        }
    }

}
