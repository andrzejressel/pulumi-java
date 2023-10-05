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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs();

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="extractLocation")
    private @Nullable Output<String> extractLocation;

    public Optional<Output<String>> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="legalText")
    private @Nullable Output<String> legalText;

    public Optional<Output<String>> legalText() {
        return Optional.ofNullable(this.legalText);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="queryParameterName")
    private @Nullable Output<String> queryParameterName;

    public Optional<Output<String>> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
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

    @Import(name="variableName")
    private @Nullable Output<String> variableName;

    public Optional<Output<String>> variableName() {
        return Optional.ofNullable(this.variableName);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs(GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs $) {
        this.enabled = $.enabled;
        this.extractLocation = $.extractLocation;
        this.headerName = $.headerName;
        this.legalText = $.legalText;
        this.locked = $.locked;
        this.queryParameterName = $.queryParameterName;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variableName = $.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder extractLocation(@Nullable Output<String> extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        public Builder extractLocation(String extractLocation) {
            return extractLocation(Output.of(extractLocation));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder legalText(@Nullable Output<String> legalText) {
            $.legalText = legalText;
            return this;
        }

        public Builder legalText(String legalText) {
            return legalText(Output.of(legalText));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder queryParameterName(@Nullable Output<String> queryParameterName) {
            $.queryParameterName = queryParameterName;
            return this;
        }

        public Builder queryParameterName(String queryParameterName) {
            return queryParameterName(Output.of(queryParameterName));
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

        public Builder variableName(@Nullable Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorUidConfigurationArgs build() {
            return $;
        }
    }

}
