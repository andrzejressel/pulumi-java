// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs();

    @Import(name="behavior")
    private @Nullable Output<String> behavior;

    public Optional<Output<String>> behavior() {
        return Optional.ofNullable(this.behavior);
    }

    @Import(name="exactMatch")
    private @Nullable Output<Boolean> exactMatch;

    public Optional<Output<Boolean>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs(GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs $) {
        this.behavior = $.behavior;
        this.exactMatch = $.exactMatch;
        this.locked = $.locked;
        this.parameters = $.parameters;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder behavior(@Nullable Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        public Builder exactMatch(@Nullable Output<Boolean> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(Boolean exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParamsArgs build() {
            return $;
        }
    }

}
