// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced();

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
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

    @Import(name="xml")
    private @Nullable String xml;

    public Optional<String> xml() {
        return Optional.ofNullable(this.xml);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced(GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced $) {
        this.description = $.description;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.xml = $.xml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
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

        public Builder xml(@Nullable String xml) {
            $.xml = xml;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorHdDataAdvanced build() {
            return $;
        }
    }

}
