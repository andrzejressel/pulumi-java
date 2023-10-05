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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs();

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

    private GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs(GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs(Objects.requireNonNull(defaults));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs build() {
            return $;
        }
    }

}
