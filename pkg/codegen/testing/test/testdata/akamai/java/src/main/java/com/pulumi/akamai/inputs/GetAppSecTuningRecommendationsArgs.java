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


public final class GetAppSecTuningRecommendationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecTuningRecommendationsArgs Empty = new GetAppSecTuningRecommendationsArgs();

    @Import(name="attackGroup")
    private @Nullable Output<String> attackGroup;

    public Optional<Output<String>> attackGroup() {
        return Optional.ofNullable(this.attackGroup);
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="ruleId")
    private @Nullable Output<Integer> ruleId;

    public Optional<Output<Integer>> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    @Import(name="rulesetType")
    private @Nullable Output<String> rulesetType;

    public Optional<Output<String>> rulesetType() {
        return Optional.ofNullable(this.rulesetType);
    }

    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private GetAppSecTuningRecommendationsArgs() {}

    private GetAppSecTuningRecommendationsArgs(GetAppSecTuningRecommendationsArgs $) {
        this.attackGroup = $.attackGroup;
        this.configId = $.configId;
        this.ruleId = $.ruleId;
        this.rulesetType = $.rulesetType;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecTuningRecommendationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecTuningRecommendationsArgs $;

        public Builder() {
            $ = new GetAppSecTuningRecommendationsArgs();
        }

        public Builder(GetAppSecTuningRecommendationsArgs defaults) {
            $ = new GetAppSecTuningRecommendationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder attackGroup(@Nullable Output<String> attackGroup) {
            $.attackGroup = attackGroup;
            return this;
        }

        public Builder attackGroup(String attackGroup) {
            return attackGroup(Output.of(attackGroup));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder ruleId(@Nullable Output<Integer> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder ruleId(Integer ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public Builder rulesetType(@Nullable Output<String> rulesetType) {
            $.rulesetType = rulesetType;
            return this;
        }

        public Builder rulesetType(String rulesetType) {
            return rulesetType(Output.of(rulesetType));
        }

        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecTuningRecommendationsArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
