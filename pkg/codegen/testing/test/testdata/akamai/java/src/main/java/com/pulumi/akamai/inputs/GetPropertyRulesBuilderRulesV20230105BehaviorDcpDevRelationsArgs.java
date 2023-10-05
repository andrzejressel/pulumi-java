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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs();

    @Import(name="customValues")
    private @Nullable Output<Boolean> customValues;

    public Optional<Output<Boolean>> customValues() {
        return Optional.ofNullable(this.customValues);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs(GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs $) {
        this.customValues = $.customValues;
        this.enabled = $.enabled;
        this.hostname = $.hostname;
        this.locked = $.locked;
        this.path = $.path;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customValues(@Nullable Output<Boolean> customValues) {
            $.customValues = customValues;
            return this;
        }

        public Builder customValues(Boolean customValues) {
            return customValues(Output.of(customValues));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpDevRelationsArgs build() {
            return $;
        }
    }

}
