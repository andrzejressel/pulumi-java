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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs();

    @Import(name="includeTagsAttribute")
    private @Nullable Output<Boolean> includeTagsAttribute;

    public Optional<Output<Boolean>> includeTagsAttribute() {
        return Optional.ofNullable(this.includeTagsAttribute);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchHostname")
    private @Nullable Output<String> matchHostname;

    public Optional<Output<String>> matchHostname() {
        return Optional.ofNullable(this.matchHostname);
    }

    @Import(name="replaceAll")
    private @Nullable Output<Boolean> replaceAll;

    public Optional<Output<Boolean>> replaceAll() {
        return Optional.ofNullable(this.replaceAll);
    }

    @Import(name="replacementHostname")
    private @Nullable Output<String> replacementHostname;

    public Optional<Output<String>> replacementHostname() {
        return Optional.ofNullable(this.replacementHostname);
    }

    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    @Import(name="tagsAttribute")
    private @Nullable Output<String> tagsAttribute;

    public Optional<Output<String>> tagsAttribute() {
        return Optional.ofNullable(this.tagsAttribute);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs $) {
        this.includeTagsAttribute = $.includeTagsAttribute;
        this.locked = $.locked;
        this.matchHostname = $.matchHostname;
        this.replaceAll = $.replaceAll;
        this.replacementHostname = $.replacementHostname;
        this.scope = $.scope;
        this.tagsAttribute = $.tagsAttribute;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder includeTagsAttribute(@Nullable Output<Boolean> includeTagsAttribute) {
            $.includeTagsAttribute = includeTagsAttribute;
            return this;
        }

        public Builder includeTagsAttribute(Boolean includeTagsAttribute) {
            return includeTagsAttribute(Output.of(includeTagsAttribute));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder matchHostname(@Nullable Output<String> matchHostname) {
            $.matchHostname = matchHostname;
            return this;
        }

        public Builder matchHostname(String matchHostname) {
            return matchHostname(Output.of(matchHostname));
        }

        public Builder replaceAll(@Nullable Output<Boolean> replaceAll) {
            $.replaceAll = replaceAll;
            return this;
        }

        public Builder replaceAll(Boolean replaceAll) {
            return replaceAll(Output.of(replaceAll));
        }

        public Builder replacementHostname(@Nullable Output<String> replacementHostname) {
            $.replacementHostname = replacementHostname;
            return this;
        }

        public Builder replacementHostname(String replacementHostname) {
            return replacementHostname(Output.of(replacementHostname));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder tagsAttribute(@Nullable Output<String> tagsAttribute) {
            $.tagsAttribute = tagsAttribute;
            return this;
        }

        public Builder tagsAttribute(String tagsAttribute) {
            return tagsAttribute(Output.of(tagsAttribute));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTagArgs build() {
            return $;
        }
    }

}
