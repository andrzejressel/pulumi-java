// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing {
    private @Nullable String conditionalErrorPattern;
    private @Nullable List<String> conditionalHttpStatuses;
    private @Nullable String conditionalSamplingFrequency;
    private @Nullable String cpcodes;
    private @Nullable Boolean enabled;
    private @Nullable String forwardType;
    private @Nullable Boolean locked;
    private @Nullable String requestType;
    private @Nullable String samplingFrequency;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing() {}
    public Optional<String> conditionalErrorPattern() {
        return Optional.ofNullable(this.conditionalErrorPattern);
    }
    public List<String> conditionalHttpStatuses() {
        return this.conditionalHttpStatuses == null ? List.of() : this.conditionalHttpStatuses;
    }
    public Optional<String> conditionalSamplingFrequency() {
        return Optional.ofNullable(this.conditionalSamplingFrequency);
    }
    public Optional<String> cpcodes() {
        return Optional.ofNullable(this.cpcodes);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> forwardType() {
        return Optional.ofNullable(this.forwardType);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> requestType() {
        return Optional.ofNullable(this.requestType);
    }
    public Optional<String> samplingFrequency() {
        return Optional.ofNullable(this.samplingFrequency);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String conditionalErrorPattern;
        private @Nullable List<String> conditionalHttpStatuses;
        private @Nullable String conditionalSamplingFrequency;
        private @Nullable String cpcodes;
        private @Nullable Boolean enabled;
        private @Nullable String forwardType;
        private @Nullable Boolean locked;
        private @Nullable String requestType;
        private @Nullable String samplingFrequency;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalErrorPattern = defaults.conditionalErrorPattern;
    	      this.conditionalHttpStatuses = defaults.conditionalHttpStatuses;
    	      this.conditionalSamplingFrequency = defaults.conditionalSamplingFrequency;
    	      this.cpcodes = defaults.cpcodes;
    	      this.enabled = defaults.enabled;
    	      this.forwardType = defaults.forwardType;
    	      this.locked = defaults.locked;
    	      this.requestType = defaults.requestType;
    	      this.samplingFrequency = defaults.samplingFrequency;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder conditionalErrorPattern(@Nullable String conditionalErrorPattern) {
            this.conditionalErrorPattern = conditionalErrorPattern;
            return this;
        }
        @CustomType.Setter
        public Builder conditionalHttpStatuses(@Nullable List<String> conditionalHttpStatuses) {
            this.conditionalHttpStatuses = conditionalHttpStatuses;
            return this;
        }
        public Builder conditionalHttpStatuses(String... conditionalHttpStatuses) {
            return conditionalHttpStatuses(List.of(conditionalHttpStatuses));
        }
        @CustomType.Setter
        public Builder conditionalSamplingFrequency(@Nullable String conditionalSamplingFrequency) {
            this.conditionalSamplingFrequency = conditionalSamplingFrequency;
            return this;
        }
        @CustomType.Setter
        public Builder cpcodes(@Nullable String cpcodes) {
            this.cpcodes = cpcodes;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder forwardType(@Nullable String forwardType) {
            this.forwardType = forwardType;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder requestType(@Nullable String requestType) {
            this.requestType = requestType;
            return this;
        }
        @CustomType.Setter
        public Builder samplingFrequency(@Nullable String samplingFrequency) {
            this.samplingFrequency = samplingFrequency;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorBossBeaconing();
            _resultValue.conditionalErrorPattern = conditionalErrorPattern;
            _resultValue.conditionalHttpStatuses = conditionalHttpStatuses;
            _resultValue.conditionalSamplingFrequency = conditionalSamplingFrequency;
            _resultValue.cpcodes = cpcodes;
            _resultValue.enabled = enabled;
            _resultValue.forwardType = forwardType;
            _resultValue.locked = locked;
            _resultValue.requestType = requestType;
            _resultValue.samplingFrequency = samplingFrequency;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
