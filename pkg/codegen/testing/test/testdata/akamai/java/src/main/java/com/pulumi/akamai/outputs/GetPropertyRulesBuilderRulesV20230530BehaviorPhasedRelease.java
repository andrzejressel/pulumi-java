// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease {
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicy cloudletPolicy;
    private @Nullable Integer cloudletSharedPolicy;
    private @Nullable Boolean enabled;
    private @Nullable Integer failoverDuration;
    private @Nullable Boolean failoverEnabled;
    private @Nullable List<String> failoverResponseCodes;
    private @Nullable String failoverTitle;
    private @Nullable Boolean isSharedPolicy;
    private @Nullable String label;
    private @Nullable Boolean locked;
    private @Nullable String populationCookieType;
    private @Nullable String populationDuration;
    private @Nullable String populationExpirationDate;
    private @Nullable Boolean populationRefresh;
    private @Nullable String populationTitle;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease() {}
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Integer> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> failoverDuration() {
        return Optional.ofNullable(this.failoverDuration);
    }
    public Optional<Boolean> failoverEnabled() {
        return Optional.ofNullable(this.failoverEnabled);
    }
    public List<String> failoverResponseCodes() {
        return this.failoverResponseCodes == null ? List.of() : this.failoverResponseCodes;
    }
    public Optional<String> failoverTitle() {
        return Optional.ofNullable(this.failoverTitle);
    }
    public Optional<Boolean> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> populationCookieType() {
        return Optional.ofNullable(this.populationCookieType);
    }
    public Optional<String> populationDuration() {
        return Optional.ofNullable(this.populationDuration);
    }
    public Optional<String> populationExpirationDate() {
        return Optional.ofNullable(this.populationExpirationDate);
    }
    public Optional<Boolean> populationRefresh() {
        return Optional.ofNullable(this.populationRefresh);
    }
    public Optional<String> populationTitle() {
        return Optional.ofNullable(this.populationTitle);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicy cloudletPolicy;
        private @Nullable Integer cloudletSharedPolicy;
        private @Nullable Boolean enabled;
        private @Nullable Integer failoverDuration;
        private @Nullable Boolean failoverEnabled;
        private @Nullable List<String> failoverResponseCodes;
        private @Nullable String failoverTitle;
        private @Nullable Boolean isSharedPolicy;
        private @Nullable String label;
        private @Nullable Boolean locked;
        private @Nullable String populationCookieType;
        private @Nullable String populationDuration;
        private @Nullable String populationExpirationDate;
        private @Nullable Boolean populationRefresh;
        private @Nullable String populationTitle;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.cloudletSharedPolicy = defaults.cloudletSharedPolicy;
    	      this.enabled = defaults.enabled;
    	      this.failoverDuration = defaults.failoverDuration;
    	      this.failoverEnabled = defaults.failoverEnabled;
    	      this.failoverResponseCodes = defaults.failoverResponseCodes;
    	      this.failoverTitle = defaults.failoverTitle;
    	      this.isSharedPolicy = defaults.isSharedPolicy;
    	      this.label = defaults.label;
    	      this.locked = defaults.locked;
    	      this.populationCookieType = defaults.populationCookieType;
    	      this.populationDuration = defaults.populationDuration;
    	      this.populationExpirationDate = defaults.populationExpirationDate;
    	      this.populationRefresh = defaults.populationRefresh;
    	      this.populationTitle = defaults.populationTitle;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorPhasedReleaseCloudletPolicy cloudletPolicy) {
            this.cloudletPolicy = cloudletPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder cloudletSharedPolicy(@Nullable Integer cloudletSharedPolicy) {
            this.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder failoverDuration(@Nullable Integer failoverDuration) {
            this.failoverDuration = failoverDuration;
            return this;
        }
        @CustomType.Setter
        public Builder failoverEnabled(@Nullable Boolean failoverEnabled) {
            this.failoverEnabled = failoverEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder failoverResponseCodes(@Nullable List<String> failoverResponseCodes) {
            this.failoverResponseCodes = failoverResponseCodes;
            return this;
        }
        public Builder failoverResponseCodes(String... failoverResponseCodes) {
            return failoverResponseCodes(List.of(failoverResponseCodes));
        }
        @CustomType.Setter
        public Builder failoverTitle(@Nullable String failoverTitle) {
            this.failoverTitle = failoverTitle;
            return this;
        }
        @CustomType.Setter
        public Builder isSharedPolicy(@Nullable Boolean isSharedPolicy) {
            this.isSharedPolicy = isSharedPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder populationCookieType(@Nullable String populationCookieType) {
            this.populationCookieType = populationCookieType;
            return this;
        }
        @CustomType.Setter
        public Builder populationDuration(@Nullable String populationDuration) {
            this.populationDuration = populationDuration;
            return this;
        }
        @CustomType.Setter
        public Builder populationExpirationDate(@Nullable String populationExpirationDate) {
            this.populationExpirationDate = populationExpirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder populationRefresh(@Nullable Boolean populationRefresh) {
            this.populationRefresh = populationRefresh;
            return this;
        }
        @CustomType.Setter
        public Builder populationTitle(@Nullable String populationTitle) {
            this.populationTitle = populationTitle;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorPhasedRelease();
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.cloudletSharedPolicy = cloudletSharedPolicy;
            _resultValue.enabled = enabled;
            _resultValue.failoverDuration = failoverDuration;
            _resultValue.failoverEnabled = failoverEnabled;
            _resultValue.failoverResponseCodes = failoverResponseCodes;
            _resultValue.failoverTitle = failoverTitle;
            _resultValue.isSharedPolicy = isSharedPolicy;
            _resultValue.label = label;
            _resultValue.locked = locked;
            _resultValue.populationCookieType = populationCookieType;
            _resultValue.populationDuration = populationDuration;
            _resultValue.populationExpirationDate = populationExpirationDate;
            _resultValue.populationRefresh = populationRefresh;
            _resultValue.populationTitle = populationTitle;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
