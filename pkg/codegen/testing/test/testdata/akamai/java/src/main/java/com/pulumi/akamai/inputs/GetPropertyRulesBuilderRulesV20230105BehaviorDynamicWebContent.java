// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent();

    @Import(name="imageCompression")
    private @Nullable Boolean imageCompression;

    public Optional<Boolean> imageCompression() {
        return Optional.ofNullable(this.imageCompression);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="prefetch")
    private @Nullable Boolean prefetch;

    public Optional<Boolean> prefetch() {
        return Optional.ofNullable(this.prefetch);
    }

    @Import(name="realUserMonitoring")
    private @Nullable Boolean realUserMonitoring;

    public Optional<Boolean> realUserMonitoring() {
        return Optional.ofNullable(this.realUserMonitoring);
    }

    @Import(name="sureRoute")
    private @Nullable Boolean sureRoute;

    public Optional<Boolean> sureRoute() {
        return Optional.ofNullable(this.sureRoute);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent(GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent $) {
        this.imageCompression = $.imageCompression;
        this.locked = $.locked;
        this.prefetch = $.prefetch;
        this.realUserMonitoring = $.realUserMonitoring;
        this.sureRoute = $.sureRoute;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent(Objects.requireNonNull(defaults));
        }

        public Builder imageCompression(@Nullable Boolean imageCompression) {
            $.imageCompression = imageCompression;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder prefetch(@Nullable Boolean prefetch) {
            $.prefetch = prefetch;
            return this;
        }

        public Builder realUserMonitoring(@Nullable Boolean realUserMonitoring) {
            $.realUserMonitoring = realUserMonitoring;
            return this;
        }

        public Builder sureRoute(@Nullable Boolean sureRoute) {
            $.sureRoute = sureRoute;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorDynamicWebContent build() {
            return $;
        }
    }

}
