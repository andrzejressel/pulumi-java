// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor();

    @Import(name="certificateField")
    private @Nullable String certificateField;

    public Optional<String> certificateField() {
        return Optional.ofNullable(this.certificateField);
    }

    @Import(name="dcpMutualAuthProcessingVariableId")
    private @Nullable String dcpMutualAuthProcessingVariableId;

    public Optional<String> dcpMutualAuthProcessingVariableId() {
        return Optional.ofNullable(this.dcpMutualAuthProcessingVariableId);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor $) {
        this.certificateField = $.certificateField;
        this.dcpMutualAuthProcessingVariableId = $.dcpMutualAuthProcessingVariableId;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor(Objects.requireNonNull(defaults));
        }

        public Builder certificateField(@Nullable String certificateField) {
            $.certificateField = certificateField;
            return this;
        }

        public Builder dcpMutualAuthProcessingVariableId(@Nullable String dcpMutualAuthProcessingVariableId) {
            $.dcpMutualAuthProcessingVariableId = dcpMutualAuthProcessingVariableId;
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorDcpAuthVariableExtractor build() {
            return $;
        }
    }

}
