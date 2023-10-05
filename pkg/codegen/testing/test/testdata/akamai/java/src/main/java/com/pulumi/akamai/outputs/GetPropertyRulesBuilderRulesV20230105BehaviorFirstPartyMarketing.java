// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingCloudletPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing {
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingCloudletPolicy cloudletPolicy;
    private @Nullable Boolean enabled;
    private @Nullable String javaScriptInsertionRule;
    private @Nullable Boolean locked;
    private @Nullable String mediaMathPrefix;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing() {}
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> javaScriptInsertionRule() {
        return Optional.ofNullable(this.javaScriptInsertionRule);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> mediaMathPrefix() {
        return Optional.ofNullable(this.mediaMathPrefix);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingCloudletPolicy cloudletPolicy;
        private @Nullable Boolean enabled;
        private @Nullable String javaScriptInsertionRule;
        private @Nullable Boolean locked;
        private @Nullable String mediaMathPrefix;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.enabled = defaults.enabled;
    	      this.javaScriptInsertionRule = defaults.javaScriptInsertionRule;
    	      this.locked = defaults.locked;
    	      this.mediaMathPrefix = defaults.mediaMathPrefix;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketingCloudletPolicy cloudletPolicy) {
            this.cloudletPolicy = cloudletPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder javaScriptInsertionRule(@Nullable String javaScriptInsertionRule) {
            this.javaScriptInsertionRule = javaScriptInsertionRule;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder mediaMathPrefix(@Nullable String mediaMathPrefix) {
            this.mediaMathPrefix = mediaMathPrefix;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorFirstPartyMarketing();
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.enabled = enabled;
            _resultValue.javaScriptInsertionRule = javaScriptInsertionRule;
            _resultValue.locked = locked;
            _resultValue.mediaMathPrefix = mediaMathPrefix;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
