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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive {
    private @Nullable String catalogSize;
    private @Nullable String contentType;
    private @Nullable Boolean dash;
    private @Nullable Boolean hds;
    private @Nullable Boolean hls;
    private @Nullable Boolean locked;
    private @Nullable String popularityDistribution;
    private @Nullable String segmentDurationDash;
    private @Nullable String segmentDurationHds;
    private @Nullable String segmentDurationHls;
    private @Nullable String segmentDurationSmooth;
    private @Nullable String segmentSizeDash;
    private @Nullable String segmentSizeHds;
    private @Nullable String segmentSizeHls;
    private @Nullable String segmentSizeSmooth;
    private @Nullable Boolean smooth;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive() {}
    public Optional<String> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<Boolean> dash() {
        return Optional.ofNullable(this.dash);
    }
    public Optional<Boolean> hds() {
        return Optional.ofNullable(this.hds);
    }
    public Optional<Boolean> hls() {
        return Optional.ofNullable(this.hls);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
    }
    public Optional<String> segmentDurationDash() {
        return Optional.ofNullable(this.segmentDurationDash);
    }
    public Optional<String> segmentDurationHds() {
        return Optional.ofNullable(this.segmentDurationHds);
    }
    public Optional<String> segmentDurationHls() {
        return Optional.ofNullable(this.segmentDurationHls);
    }
    public Optional<String> segmentDurationSmooth() {
        return Optional.ofNullable(this.segmentDurationSmooth);
    }
    public Optional<String> segmentSizeDash() {
        return Optional.ofNullable(this.segmentSizeDash);
    }
    public Optional<String> segmentSizeHds() {
        return Optional.ofNullable(this.segmentSizeHds);
    }
    public Optional<String> segmentSizeHls() {
        return Optional.ofNullable(this.segmentSizeHls);
    }
    public Optional<String> segmentSizeSmooth() {
        return Optional.ofNullable(this.segmentSizeSmooth);
    }
    public Optional<Boolean> smooth() {
        return Optional.ofNullable(this.smooth);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogSize;
        private @Nullable String contentType;
        private @Nullable Boolean dash;
        private @Nullable Boolean hds;
        private @Nullable Boolean hls;
        private @Nullable Boolean locked;
        private @Nullable String popularityDistribution;
        private @Nullable String segmentDurationDash;
        private @Nullable String segmentDurationHds;
        private @Nullable String segmentDurationHls;
        private @Nullable String segmentDurationSmooth;
        private @Nullable String segmentSizeDash;
        private @Nullable String segmentSizeHds;
        private @Nullable String segmentSizeHls;
        private @Nullable String segmentSizeSmooth;
        private @Nullable Boolean smooth;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogSize = defaults.catalogSize;
    	      this.contentType = defaults.contentType;
    	      this.dash = defaults.dash;
    	      this.hds = defaults.hds;
    	      this.hls = defaults.hls;
    	      this.locked = defaults.locked;
    	      this.popularityDistribution = defaults.popularityDistribution;
    	      this.segmentDurationDash = defaults.segmentDurationDash;
    	      this.segmentDurationHds = defaults.segmentDurationHds;
    	      this.segmentDurationHls = defaults.segmentDurationHls;
    	      this.segmentDurationSmooth = defaults.segmentDurationSmooth;
    	      this.segmentSizeDash = defaults.segmentSizeDash;
    	      this.segmentSizeHds = defaults.segmentSizeHds;
    	      this.segmentSizeHls = defaults.segmentSizeHls;
    	      this.segmentSizeSmooth = defaults.segmentSizeSmooth;
    	      this.smooth = defaults.smooth;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder catalogSize(@Nullable String catalogSize) {
            this.catalogSize = catalogSize;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder dash(@Nullable Boolean dash) {
            this.dash = dash;
            return this;
        }
        @CustomType.Setter
        public Builder hds(@Nullable Boolean hds) {
            this.hds = hds;
            return this;
        }
        @CustomType.Setter
        public Builder hls(@Nullable Boolean hls) {
            this.hls = hls;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder popularityDistribution(@Nullable String popularityDistribution) {
            this.popularityDistribution = popularityDistribution;
            return this;
        }
        @CustomType.Setter
        public Builder segmentDurationDash(@Nullable String segmentDurationDash) {
            this.segmentDurationDash = segmentDurationDash;
            return this;
        }
        @CustomType.Setter
        public Builder segmentDurationHds(@Nullable String segmentDurationHds) {
            this.segmentDurationHds = segmentDurationHds;
            return this;
        }
        @CustomType.Setter
        public Builder segmentDurationHls(@Nullable String segmentDurationHls) {
            this.segmentDurationHls = segmentDurationHls;
            return this;
        }
        @CustomType.Setter
        public Builder segmentDurationSmooth(@Nullable String segmentDurationSmooth) {
            this.segmentDurationSmooth = segmentDurationSmooth;
            return this;
        }
        @CustomType.Setter
        public Builder segmentSizeDash(@Nullable String segmentSizeDash) {
            this.segmentSizeDash = segmentSizeDash;
            return this;
        }
        @CustomType.Setter
        public Builder segmentSizeHds(@Nullable String segmentSizeHds) {
            this.segmentSizeHds = segmentSizeHds;
            return this;
        }
        @CustomType.Setter
        public Builder segmentSizeHls(@Nullable String segmentSizeHls) {
            this.segmentSizeHls = segmentSizeHls;
            return this;
        }
        @CustomType.Setter
        public Builder segmentSizeSmooth(@Nullable String segmentSizeSmooth) {
            this.segmentSizeSmooth = segmentSizeSmooth;
            return this;
        }
        @CustomType.Setter
        public Builder smooth(@Nullable Boolean smooth) {
            this.smooth = smooth;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorContentCharacteristicsWsdLive();
            _resultValue.catalogSize = catalogSize;
            _resultValue.contentType = contentType;
            _resultValue.dash = dash;
            _resultValue.hds = hds;
            _resultValue.hls = hls;
            _resultValue.locked = locked;
            _resultValue.popularityDistribution = popularityDistribution;
            _resultValue.segmentDurationDash = segmentDurationDash;
            _resultValue.segmentDurationHds = segmentDurationHds;
            _resultValue.segmentDurationHls = segmentDurationHls;
            _resultValue.segmentDurationSmooth = segmentDurationSmooth;
            _resultValue.segmentSizeDash = segmentSizeDash;
            _resultValue.segmentSizeHds = segmentSizeHds;
            _resultValue.segmentSizeHls = segmentSizeHls;
            _resultValue.segmentSizeSmooth = segmentSizeSmooth;
            _resultValue.smooth = smooth;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
