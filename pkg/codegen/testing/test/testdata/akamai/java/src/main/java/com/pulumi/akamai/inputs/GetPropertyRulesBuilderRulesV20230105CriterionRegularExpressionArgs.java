// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs Empty = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs();

    @Import(name="caseSensitive")
    private @Nullable Output<Boolean> caseSensitive;

    public Optional<Output<Boolean>> caseSensitive() {
        return Optional.ofNullable(this.caseSensitive);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchString")
    private @Nullable Output<String> matchString;

    public Optional<Output<String>> matchString() {
        return Optional.ofNullable(this.matchString);
    }

    @Import(name="regex")
    private @Nullable Output<String> regex;

    public Optional<Output<String>> regex() {
        return Optional.ofNullable(this.regex);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs $) {
        this.caseSensitive = $.caseSensitive;
        this.locked = $.locked;
        this.matchString = $.matchString;
        this.regex = $.regex;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseSensitive(@Nullable Output<Boolean> caseSensitive) {
            $.caseSensitive = caseSensitive;
            return this;
        }

        public Builder caseSensitive(Boolean caseSensitive) {
            return caseSensitive(Output.of(caseSensitive));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder matchString(@Nullable Output<String> matchString) {
            $.matchString = matchString;
            return this;
        }

        public Builder matchString(String matchString) {
            return matchString(Output.of(matchString));
        }

        public Builder regex(@Nullable Output<String> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(String regex) {
            return regex(Output.of(regex));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionRegularExpressionArgs build() {
            return $;
        }
    }

}
