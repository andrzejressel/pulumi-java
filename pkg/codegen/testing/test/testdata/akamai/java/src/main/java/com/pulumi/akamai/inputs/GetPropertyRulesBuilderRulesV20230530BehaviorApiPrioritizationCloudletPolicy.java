// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy();

    @Import(name="id")
    private @Nullable Integer id;

    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy(GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicy build() {
            return $;
        }
    }

}
