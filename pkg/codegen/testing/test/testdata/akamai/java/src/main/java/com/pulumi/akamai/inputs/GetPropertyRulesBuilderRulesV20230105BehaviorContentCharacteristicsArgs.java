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


public final class GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs();

    @Import(name="catalogSize")
    private @Nullable Output<String> catalogSize;

    public Optional<Output<String>> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }

    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="objectSize")
    private @Nullable Output<String> objectSize;

    public Optional<Output<String>> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }

    @Import(name="popularityDistribution")
    private @Nullable Output<String> popularityDistribution;

    public Optional<Output<String>> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs $) {
        this.catalogSize = $.catalogSize;
        this.contentType = $.contentType;
        this.locked = $.locked;
        this.objectSize = $.objectSize;
        this.popularityDistribution = $.popularityDistribution;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogSize(@Nullable Output<String> catalogSize) {
            $.catalogSize = catalogSize;
            return this;
        }

        public Builder catalogSize(String catalogSize) {
            return catalogSize(Output.of(catalogSize));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder objectSize(@Nullable Output<String> objectSize) {
            $.objectSize = objectSize;
            return this;
        }

        public Builder objectSize(String objectSize) {
            return objectSize(Output.of(objectSize));
        }

        public Builder popularityDistribution(@Nullable Output<String> popularityDistribution) {
            $.popularityDistribution = popularityDistribution;
            return this;
        }

        public Builder popularityDistribution(String popularityDistribution) {
            return popularityDistribution(Output.of(popularityDistribution));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsArgs build() {
            return $;
        }
    }

}
