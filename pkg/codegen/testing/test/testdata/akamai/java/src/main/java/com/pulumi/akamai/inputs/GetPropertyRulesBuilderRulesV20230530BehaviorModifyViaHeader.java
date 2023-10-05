// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader();

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

    @Import(name="modificationOption")
    private @Nullable String modificationOption;

    public Optional<String> modificationOption() {
        return Optional.ofNullable(this.modificationOption);
    }

    @Import(name="renameHeaderTo")
    private @Nullable String renameHeaderTo;

    public Optional<String> renameHeaderTo() {
        return Optional.ofNullable(this.renameHeaderTo);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader(GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader $) {
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.modificationOption = $.modificationOption;
        this.renameHeaderTo = $.renameHeaderTo;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder modificationOption(@Nullable String modificationOption) {
            $.modificationOption = modificationOption;
            return this;
        }

        public Builder renameHeaderTo(@Nullable String renameHeaderTo) {
            $.renameHeaderTo = renameHeaderTo;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorModifyViaHeader build() {
            return $;
        }
    }

}
