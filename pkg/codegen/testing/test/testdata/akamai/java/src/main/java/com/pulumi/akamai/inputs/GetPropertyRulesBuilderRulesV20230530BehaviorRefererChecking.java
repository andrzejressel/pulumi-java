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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking();

    @Import(name="allowChildren")
    private @Nullable Boolean allowChildren;

    public Optional<Boolean> allowChildren() {
        return Optional.ofNullable(this.allowChildren);
    }

    @Import(name="domains")
    private @Nullable List<String> domains;

    public Optional<List<String>> domains() {
        return Optional.ofNullable(this.domains);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="strict")
    private @Nullable Boolean strict;

    public Optional<Boolean> strict() {
        return Optional.ofNullable(this.strict);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking(GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking $) {
        this.allowChildren = $.allowChildren;
        this.domains = $.domains;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.strict = $.strict;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking(Objects.requireNonNull(defaults));
        }

        public Builder allowChildren(@Nullable Boolean allowChildren) {
            $.allowChildren = allowChildren;
            return this;
        }

        public Builder domains(@Nullable List<String> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder strict(@Nullable Boolean strict) {
            $.strict = strict;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorRefererChecking build() {
            return $;
        }
    }

}
