// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationCloudletPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation {
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationCloudletPolicy cloudletPolicy;
    private @Nullable Integer cloudletSharedPolicy;
    private @Nullable Boolean enabled;
    private @Nullable Boolean isSharedPolicy;
    private @Nullable String label;
    private @Nullable Boolean locked;
    private @Nullable Boolean populationCookieAutomaticSalt;
    private @Nullable String populationCookieDomain;
    private @Nullable Boolean populationCookieIncludeRuleName;
    private @Nullable String populationCookieSalt;
    private @Nullable String populationCookieType;
    private @Nullable String populationDuration;
    private @Nullable Boolean populationRefresh;
    private @Nullable String populationTitle;
    private @Nullable String segmentTrackingCookieName;
    private @Nullable String segmentTrackingCustomHeader;
    private @Nullable String segmentTrackingMethod;
    private @Nullable String segmentTrackingQueryParam;
    private @Nullable String segmentTrackingTitle;
    private @Nullable Boolean specifyPopulationCookieDomain;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation() {}
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Integer> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
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
    public Optional<Boolean> populationCookieAutomaticSalt() {
        return Optional.ofNullable(this.populationCookieAutomaticSalt);
    }
    public Optional<String> populationCookieDomain() {
        return Optional.ofNullable(this.populationCookieDomain);
    }
    public Optional<Boolean> populationCookieIncludeRuleName() {
        return Optional.ofNullable(this.populationCookieIncludeRuleName);
    }
    public Optional<String> populationCookieSalt() {
        return Optional.ofNullable(this.populationCookieSalt);
    }
    public Optional<String> populationCookieType() {
        return Optional.ofNullable(this.populationCookieType);
    }
    public Optional<String> populationDuration() {
        return Optional.ofNullable(this.populationDuration);
    }
    public Optional<Boolean> populationRefresh() {
        return Optional.ofNullable(this.populationRefresh);
    }
    public Optional<String> populationTitle() {
        return Optional.ofNullable(this.populationTitle);
    }
    public Optional<String> segmentTrackingCookieName() {
        return Optional.ofNullable(this.segmentTrackingCookieName);
    }
    public Optional<String> segmentTrackingCustomHeader() {
        return Optional.ofNullable(this.segmentTrackingCustomHeader);
    }
    public Optional<String> segmentTrackingMethod() {
        return Optional.ofNullable(this.segmentTrackingMethod);
    }
    public Optional<String> segmentTrackingQueryParam() {
        return Optional.ofNullable(this.segmentTrackingQueryParam);
    }
    public Optional<String> segmentTrackingTitle() {
        return Optional.ofNullable(this.segmentTrackingTitle);
    }
    public Optional<Boolean> specifyPopulationCookieDomain() {
        return Optional.ofNullable(this.specifyPopulationCookieDomain);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationCloudletPolicy cloudletPolicy;
        private @Nullable Integer cloudletSharedPolicy;
        private @Nullable Boolean enabled;
        private @Nullable Boolean isSharedPolicy;
        private @Nullable String label;
        private @Nullable Boolean locked;
        private @Nullable Boolean populationCookieAutomaticSalt;
        private @Nullable String populationCookieDomain;
        private @Nullable Boolean populationCookieIncludeRuleName;
        private @Nullable String populationCookieSalt;
        private @Nullable String populationCookieType;
        private @Nullable String populationDuration;
        private @Nullable Boolean populationRefresh;
        private @Nullable String populationTitle;
        private @Nullable String segmentTrackingCookieName;
        private @Nullable String segmentTrackingCustomHeader;
        private @Nullable String segmentTrackingMethod;
        private @Nullable String segmentTrackingQueryParam;
        private @Nullable String segmentTrackingTitle;
        private @Nullable Boolean specifyPopulationCookieDomain;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.cloudletSharedPolicy = defaults.cloudletSharedPolicy;
    	      this.enabled = defaults.enabled;
    	      this.isSharedPolicy = defaults.isSharedPolicy;
    	      this.label = defaults.label;
    	      this.locked = defaults.locked;
    	      this.populationCookieAutomaticSalt = defaults.populationCookieAutomaticSalt;
    	      this.populationCookieDomain = defaults.populationCookieDomain;
    	      this.populationCookieIncludeRuleName = defaults.populationCookieIncludeRuleName;
    	      this.populationCookieSalt = defaults.populationCookieSalt;
    	      this.populationCookieType = defaults.populationCookieType;
    	      this.populationDuration = defaults.populationDuration;
    	      this.populationRefresh = defaults.populationRefresh;
    	      this.populationTitle = defaults.populationTitle;
    	      this.segmentTrackingCookieName = defaults.segmentTrackingCookieName;
    	      this.segmentTrackingCustomHeader = defaults.segmentTrackingCustomHeader;
    	      this.segmentTrackingMethod = defaults.segmentTrackingMethod;
    	      this.segmentTrackingQueryParam = defaults.segmentTrackingQueryParam;
    	      this.segmentTrackingTitle = defaults.segmentTrackingTitle;
    	      this.specifyPopulationCookieDomain = defaults.specifyPopulationCookieDomain;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentationCloudletPolicy cloudletPolicy) {
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
        public Builder populationCookieAutomaticSalt(@Nullable Boolean populationCookieAutomaticSalt) {
            this.populationCookieAutomaticSalt = populationCookieAutomaticSalt;
            return this;
        }
        @CustomType.Setter
        public Builder populationCookieDomain(@Nullable String populationCookieDomain) {
            this.populationCookieDomain = populationCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder populationCookieIncludeRuleName(@Nullable Boolean populationCookieIncludeRuleName) {
            this.populationCookieIncludeRuleName = populationCookieIncludeRuleName;
            return this;
        }
        @CustomType.Setter
        public Builder populationCookieSalt(@Nullable String populationCookieSalt) {
            this.populationCookieSalt = populationCookieSalt;
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
        public Builder segmentTrackingCookieName(@Nullable String segmentTrackingCookieName) {
            this.segmentTrackingCookieName = segmentTrackingCookieName;
            return this;
        }
        @CustomType.Setter
        public Builder segmentTrackingCustomHeader(@Nullable String segmentTrackingCustomHeader) {
            this.segmentTrackingCustomHeader = segmentTrackingCustomHeader;
            return this;
        }
        @CustomType.Setter
        public Builder segmentTrackingMethod(@Nullable String segmentTrackingMethod) {
            this.segmentTrackingMethod = segmentTrackingMethod;
            return this;
        }
        @CustomType.Setter
        public Builder segmentTrackingQueryParam(@Nullable String segmentTrackingQueryParam) {
            this.segmentTrackingQueryParam = segmentTrackingQueryParam;
            return this;
        }
        @CustomType.Setter
        public Builder segmentTrackingTitle(@Nullable String segmentTrackingTitle) {
            this.segmentTrackingTitle = segmentTrackingTitle;
            return this;
        }
        @CustomType.Setter
        public Builder specifyPopulationCookieDomain(@Nullable Boolean specifyPopulationCookieDomain) {
            this.specifyPopulationCookieDomain = specifyPopulationCookieDomain;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorAudienceSegmentation();
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.cloudletSharedPolicy = cloudletSharedPolicy;
            _resultValue.enabled = enabled;
            _resultValue.isSharedPolicy = isSharedPolicy;
            _resultValue.label = label;
            _resultValue.locked = locked;
            _resultValue.populationCookieAutomaticSalt = populationCookieAutomaticSalt;
            _resultValue.populationCookieDomain = populationCookieDomain;
            _resultValue.populationCookieIncludeRuleName = populationCookieIncludeRuleName;
            _resultValue.populationCookieSalt = populationCookieSalt;
            _resultValue.populationCookieType = populationCookieType;
            _resultValue.populationDuration = populationDuration;
            _resultValue.populationRefresh = populationRefresh;
            _resultValue.populationTitle = populationTitle;
            _resultValue.segmentTrackingCookieName = segmentTrackingCookieName;
            _resultValue.segmentTrackingCustomHeader = segmentTrackingCustomHeader;
            _resultValue.segmentTrackingMethod = segmentTrackingMethod;
            _resultValue.segmentTrackingQueryParam = segmentTrackingQueryParam;
            _resultValue.segmentTrackingTitle = segmentTrackingTitle;
            _resultValue.specifyPopulationCookieDomain = specifyPopulationCookieDomain;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
