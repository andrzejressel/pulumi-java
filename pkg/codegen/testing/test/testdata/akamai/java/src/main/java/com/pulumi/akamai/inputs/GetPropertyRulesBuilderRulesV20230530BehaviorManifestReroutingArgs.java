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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="partner")
    private @Nullable Output<String> partner;

    public Optional<Output<String>> partner() {
        return Optional.ofNullable(this.partner);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs(GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs $) {
        this.locked = $.locked;
        this.partner = $.partner;
        this.templateUuid = $.templateUuid;
        this.username = $.username;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder partner(@Nullable Output<String> partner) {
            $.partner = partner;
            return this;
        }

        public Builder partner(String partner) {
            return partner(Output.of(partner));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorManifestReroutingArgs build() {
            return $;
        }
    }

}
