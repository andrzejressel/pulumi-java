// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeCpCodeLimitsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs();

    @Import(name="cpCodeLimits")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeCpCodeLimitsArgs> cpCodeLimits;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeCpCodeLimitsArgs>> cpCodeLimits() {
        return Optional.ofNullable(this.cpCodeLimits);
    }

    @Import(name="createdDate")
    private @Nullable Output<Integer> createdDate;

    public Optional<Output<Integer>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable Output<Integer> id;

    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="products")
    private @Nullable Output<List<String>> products;

    public Optional<Output<List<String>>> products() {
        return Optional.ofNullable(this.products);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs(GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs $) {
        this.cpCodeLimits = $.cpCodeLimits;
        this.createdDate = $.createdDate;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.products = $.products;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpCodeLimits(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeCpCodeLimitsArgs> cpCodeLimits) {
            $.cpCodeLimits = cpCodeLimits;
            return this;
        }

        public Builder cpCodeLimits(GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeCpCodeLimitsArgs cpCodeLimits) {
            return cpCodeLimits(Output.of(cpCodeLimits));
        }

        public Builder createdDate(@Nullable Output<Integer> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        public Builder createdDate(Integer createdDate) {
            return createdDate(Output.of(createdDate));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder products(@Nullable Output<List<String>> products) {
            $.products = products;
            return this;
        }

        public Builder products(List<String> products) {
            return products(Output.of(products));
        }

        public Builder products(String... products) {
            return products(List.of(products));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs build() {
            return $;
        }
    }

}
