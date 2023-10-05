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


public final class GetPropertyRulesBuilderRulesV20230105CriterionContentType extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionContentType Empty = new GetPropertyRulesBuilderRulesV20230105CriterionContentType();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchCaseSensitive")
    private @Nullable Boolean matchCaseSensitive;

    public Optional<Boolean> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="matchWildcard")
    private @Nullable Boolean matchWildcard;

    public Optional<Boolean> matchWildcard() {
        return Optional.ofNullable(this.matchWildcard);
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

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionContentType() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionContentType(GetPropertyRulesBuilderRulesV20230105CriterionContentType $) {
        this.locked = $.locked;
        this.matchCaseSensitive = $.matchCaseSensitive;
        this.matchOperator = $.matchOperator;
        this.matchWildcard = $.matchWildcard;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionContentType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionContentType $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionContentType();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionContentType defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionContentType(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchCaseSensitive(@Nullable Boolean matchCaseSensitive) {
            $.matchCaseSensitive = matchCaseSensitive;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchWildcard(@Nullable Boolean matchWildcard) {
            $.matchWildcard = matchWildcard;
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

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionContentType build() {
            return $;
        }
    }

}
