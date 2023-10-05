// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding {
    private @Nullable Boolean customExtractedSerial;
    private @Nullable Boolean enabled;
    private @Nullable Integer hashMaxValue;
    private @Nullable Integer hashMinValue;
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable String tier;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding() {}
    public Optional<Boolean> customExtractedSerial() {
        return Optional.ofNullable(this.customExtractedSerial);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> hashMaxValue() {
        return Optional.ofNullable(this.hashMaxValue);
    }
    public Optional<Integer> hashMinValue() {
        return Optional.ofNullable(this.hashMinValue);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> tier() {
        return Optional.ofNullable(this.tier);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean customExtractedSerial;
        private @Nullable Boolean enabled;
        private @Nullable Integer hashMaxValue;
        private @Nullable Integer hashMinValue;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String tier;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customExtractedSerial = defaults.customExtractedSerial;
    	      this.enabled = defaults.enabled;
    	      this.hashMaxValue = defaults.hashMaxValue;
    	      this.hashMinValue = defaults.hashMinValue;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.tier = defaults.tier;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder customExtractedSerial(@Nullable Boolean customExtractedSerial) {
            this.customExtractedSerial = customExtractedSerial;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder hashMaxValue(@Nullable Integer hashMaxValue) {
            this.hashMaxValue = hashMaxValue;
            return this;
        }
        @CustomType.Setter
        public Builder hashMinValue(@Nullable Integer hashMinValue) {
            this.hashMinValue = hashMinValue;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorHsafEipBinding();
            _resultValue.customExtractedSerial = customExtractedSerial;
            _resultValue.enabled = enabled;
            _resultValue.hashMaxValue = hashMaxValue;
            _resultValue.hashMinValue = hashMinValue;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.tier = tier;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
