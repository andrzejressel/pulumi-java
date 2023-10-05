// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins();

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="honorBaseDirectory")
    private @Nullable Boolean honorBaseDirectory;

    public Optional<Boolean> honorBaseDirectory() {
        return Optional.ofNullable(this.honorBaseDirectory);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="purgeOriginQueryParameter")
    private @Nullable String purgeOriginQueryParameter;

    public Optional<String> purgeOriginQueryParameter() {
        return Optional.ofNullable(this.purgeOriginQueryParameter);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins(GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins $) {
        this.enabled = $.enabled;
        this.honorBaseDirectory = $.honorBaseDirectory;
        this.locked = $.locked;
        this.purgeOriginQueryParameter = $.purgeOriginQueryParameter;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder honorBaseDirectory(@Nullable Boolean honorBaseDirectory) {
            $.honorBaseDirectory = honorBaseDirectory;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder purgeOriginQueryParameter(@Nullable String purgeOriginQueryParameter) {
            $.purgeOriginQueryParameter = purgeOriginQueryParameter;
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorAllowCloudletsOrigins build() {
            return $;
        }
    }

}
