// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced {
    private @Nullable String closeXml;
    private @Nullable String description;
    private @Nullable Boolean locked;
    private @Nullable String openXml;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced() {}
    public Optional<String> closeXml() {
        return Optional.ofNullable(this.closeXml);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> openXml() {
        return Optional.ofNullable(this.openXml);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String closeXml;
        private @Nullable String description;
        private @Nullable Boolean locked;
        private @Nullable String openXml;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.closeXml = defaults.closeXml;
    	      this.description = defaults.description;
    	      this.locked = defaults.locked;
    	      this.openXml = defaults.openXml;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder closeXml(@Nullable String closeXml) {
            this.closeXml = closeXml;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder openXml(@Nullable String openXml) {
            this.openXml = openXml;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530CriterionMatchAdvanced();
            _resultValue.closeXml = closeXml;
            _resultValue.description = description;
            _resultValue.locked = locked;
            _resultValue.openXml = openXml;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
