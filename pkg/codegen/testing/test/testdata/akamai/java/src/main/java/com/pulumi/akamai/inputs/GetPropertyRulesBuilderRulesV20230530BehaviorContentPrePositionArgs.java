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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="firstLocation")
    private @Nullable Output<String> firstLocation;

    public Optional<Output<String>> firstLocation() {
        return Optional.ofNullable(this.firstLocation);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="secondLocation")
    private @Nullable Output<String> secondLocation;

    public Optional<Output<String>> secondLocation() {
        return Optional.ofNullable(this.secondLocation);
    }

    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    @Import(name="targets")
    private @Nullable Output<String> targets;

    public Optional<Output<String>> targets() {
        return Optional.ofNullable(this.targets);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs(GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs $) {
        this.enabled = $.enabled;
        this.firstLocation = $.firstLocation;
        this.locked = $.locked;
        this.secondLocation = $.secondLocation;
        this.sourceType = $.sourceType;
        this.targets = $.targets;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder firstLocation(@Nullable Output<String> firstLocation) {
            $.firstLocation = firstLocation;
            return this;
        }

        public Builder firstLocation(String firstLocation) {
            return firstLocation(Output.of(firstLocation));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder secondLocation(@Nullable Output<String> secondLocation) {
            $.secondLocation = secondLocation;
            return this;
        }

        public Builder secondLocation(String secondLocation) {
            return secondLocation(Output.of(secondLocation));
        }

        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public Builder targets(@Nullable Output<String> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(String targets) {
            return targets(Output.of(targets));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorContentPrePositionArgs build() {
            return $;
        }
    }

}
