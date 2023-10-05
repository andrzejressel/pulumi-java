// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance();

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

    @Import(name="secondaryMultipathToOrigin")
    private @Nullable Boolean secondaryMultipathToOrigin;

    public Optional<Boolean> secondaryMultipathToOrigin() {
        return Optional.ofNullable(this.secondaryMultipathToOrigin);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance(GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance $) {
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.secondaryMultipathToOrigin = $.secondaryMultipathToOrigin;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder secondaryMultipathToOrigin(@Nullable Boolean secondaryMultipathToOrigin) {
            $.secondaryMultipathToOrigin = secondaryMultipathToOrigin;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorMobileSdkPerformance build() {
            return $;
        }
    }

}
