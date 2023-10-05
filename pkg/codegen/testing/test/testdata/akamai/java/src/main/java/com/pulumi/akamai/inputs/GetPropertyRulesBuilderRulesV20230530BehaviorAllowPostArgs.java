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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs();

    @Import(name="allowWithoutContentLength")
    private @Nullable Output<Boolean> allowWithoutContentLength;

    public Optional<Output<Boolean>> allowWithoutContentLength() {
        return Optional.ofNullable(this.allowWithoutContentLength);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs(GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs $) {
        this.allowWithoutContentLength = $.allowWithoutContentLength;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowWithoutContentLength(@Nullable Output<Boolean> allowWithoutContentLength) {
            $.allowWithoutContentLength = allowWithoutContentLength;
            return this;
        }

        public Builder allowWithoutContentLength(Boolean allowWithoutContentLength) {
            return allowWithoutContentLength(Output.of(allowWithoutContentLength));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorAllowPostArgs build() {
            return $;
        }
    }

}
