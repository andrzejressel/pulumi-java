// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo {
    private @Nullable Boolean advanced;
    private @Nullable String apiReferenceTitle;
    private @Nullable Boolean applyBestFileType;
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal cpCodeOriginal;
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed cpCodeTransformed;
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable String policySet;
    private @Nullable String policyToken;
    private @Nullable String policyTokenDefault;
    private @Nullable Boolean resize;
    private @Nullable String settingsTitle;
    private @Nullable String superCacheRegion;
    private @Nullable String templateUuid;
    private @Nullable String trafficTitle;
    private @Nullable Boolean useExistingPolicySet;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo() {}
    public Optional<Boolean> advanced() {
        return Optional.ofNullable(this.advanced);
    }
    public Optional<String> apiReferenceTitle() {
        return Optional.ofNullable(this.apiReferenceTitle);
    }
    public Optional<Boolean> applyBestFileType() {
        return Optional.ofNullable(this.applyBestFileType);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal> cpCodeOriginal() {
        return Optional.ofNullable(this.cpCodeOriginal);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed> cpCodeTransformed() {
        return Optional.ofNullable(this.cpCodeTransformed);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> policySet() {
        return Optional.ofNullable(this.policySet);
    }
    public Optional<String> policyToken() {
        return Optional.ofNullable(this.policyToken);
    }
    public Optional<String> policyTokenDefault() {
        return Optional.ofNullable(this.policyTokenDefault);
    }
    public Optional<Boolean> resize() {
        return Optional.ofNullable(this.resize);
    }
    public Optional<String> settingsTitle() {
        return Optional.ofNullable(this.settingsTitle);
    }
    public Optional<String> superCacheRegion() {
        return Optional.ofNullable(this.superCacheRegion);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> trafficTitle() {
        return Optional.ofNullable(this.trafficTitle);
    }
    public Optional<Boolean> useExistingPolicySet() {
        return Optional.ofNullable(this.useExistingPolicySet);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean advanced;
        private @Nullable String apiReferenceTitle;
        private @Nullable Boolean applyBestFileType;
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal cpCodeOriginal;
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed cpCodeTransformed;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable String policySet;
        private @Nullable String policyToken;
        private @Nullable String policyTokenDefault;
        private @Nullable Boolean resize;
        private @Nullable String settingsTitle;
        private @Nullable String superCacheRegion;
        private @Nullable String templateUuid;
        private @Nullable String trafficTitle;
        private @Nullable Boolean useExistingPolicySet;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advanced = defaults.advanced;
    	      this.apiReferenceTitle = defaults.apiReferenceTitle;
    	      this.applyBestFileType = defaults.applyBestFileType;
    	      this.cpCodeOriginal = defaults.cpCodeOriginal;
    	      this.cpCodeTransformed = defaults.cpCodeTransformed;
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.policySet = defaults.policySet;
    	      this.policyToken = defaults.policyToken;
    	      this.policyTokenDefault = defaults.policyTokenDefault;
    	      this.resize = defaults.resize;
    	      this.settingsTitle = defaults.settingsTitle;
    	      this.superCacheRegion = defaults.superCacheRegion;
    	      this.templateUuid = defaults.templateUuid;
    	      this.trafficTitle = defaults.trafficTitle;
    	      this.useExistingPolicySet = defaults.useExistingPolicySet;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder advanced(@Nullable Boolean advanced) {
            this.advanced = advanced;
            return this;
        }
        @CustomType.Setter
        public Builder apiReferenceTitle(@Nullable String apiReferenceTitle) {
            this.apiReferenceTitle = apiReferenceTitle;
            return this;
        }
        @CustomType.Setter
        public Builder applyBestFileType(@Nullable Boolean applyBestFileType) {
            this.applyBestFileType = applyBestFileType;
            return this;
        }
        @CustomType.Setter
        public Builder cpCodeOriginal(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal cpCodeOriginal) {
            this.cpCodeOriginal = cpCodeOriginal;
            return this;
        }
        @CustomType.Setter
        public Builder cpCodeTransformed(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeTransformed cpCodeTransformed) {
            this.cpCodeTransformed = cpCodeTransformed;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder policySet(@Nullable String policySet) {
            this.policySet = policySet;
            return this;
        }
        @CustomType.Setter
        public Builder policyToken(@Nullable String policyToken) {
            this.policyToken = policyToken;
            return this;
        }
        @CustomType.Setter
        public Builder policyTokenDefault(@Nullable String policyTokenDefault) {
            this.policyTokenDefault = policyTokenDefault;
            return this;
        }
        @CustomType.Setter
        public Builder resize(@Nullable Boolean resize) {
            this.resize = resize;
            return this;
        }
        @CustomType.Setter
        public Builder settingsTitle(@Nullable String settingsTitle) {
            this.settingsTitle = settingsTitle;
            return this;
        }
        @CustomType.Setter
        public Builder superCacheRegion(@Nullable String superCacheRegion) {
            this.superCacheRegion = superCacheRegion;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder trafficTitle(@Nullable String trafficTitle) {
            this.trafficTitle = trafficTitle;
            return this;
        }
        @CustomType.Setter
        public Builder useExistingPolicySet(@Nullable Boolean useExistingPolicySet) {
            this.useExistingPolicySet = useExistingPolicySet;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideo();
            _resultValue.advanced = advanced;
            _resultValue.apiReferenceTitle = apiReferenceTitle;
            _resultValue.applyBestFileType = applyBestFileType;
            _resultValue.cpCodeOriginal = cpCodeOriginal;
            _resultValue.cpCodeTransformed = cpCodeTransformed;
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.policySet = policySet;
            _resultValue.policyToken = policyToken;
            _resultValue.policyTokenDefault = policyTokenDefault;
            _resultValue.resize = resize;
            _resultValue.settingsTitle = settingsTitle;
            _resultValue.superCacheRegion = superCacheRegion;
            _resultValue.templateUuid = templateUuid;
            _resultValue.trafficTitle = trafficTitle;
            _resultValue.useExistingPolicySet = useExistingPolicySet;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
