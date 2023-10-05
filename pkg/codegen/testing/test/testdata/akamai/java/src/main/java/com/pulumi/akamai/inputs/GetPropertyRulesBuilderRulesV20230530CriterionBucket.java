// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionBucket extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionBucket Empty = new GetPropertyRulesBuilderRulesV20230530CriterionBucket();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="percentage")
    private @Nullable Integer percentage;

    public Optional<Integer> percentage() {
        return Optional.ofNullable(this.percentage);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530CriterionBucket() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionBucket(GetPropertyRulesBuilderRulesV20230530CriterionBucket $) {
        this.locked = $.locked;
        this.percentage = $.percentage;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionBucket defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionBucket $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionBucket();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionBucket defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionBucket(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder percentage(@Nullable Integer percentage) {
            $.percentage = percentage;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionBucket build() {
            return $;
        }
    }

}
