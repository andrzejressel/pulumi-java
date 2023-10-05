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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorQuality {
    private @Nullable String audienceSettings;
    private @Nullable String catalogSize;
    private @Nullable String contentSettings;
    private @Nullable String contentType;
    private @Nullable String country;
    private @Nullable String deliveryFormat;
    private @Nullable String deliveryType;
    private @Nullable String downloadType;
    private @Nullable String endUserLocation;
    private @Nullable Boolean locked;
    private @Nullable String maximumConcurrentUsers;
    private @Nullable String objectSize;
    private @Nullable String optimizeFor;
    private @Nullable String originSettings;
    private @Nullable String popularityDistribution;
    private @Nullable String refreshRate;
    private @Nullable Integer segmentDuration;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorQuality() {}
    public Optional<String> audienceSettings() {
        return Optional.ofNullable(this.audienceSettings);
    }
    public Optional<String> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }
    public Optional<String> contentSettings() {
        return Optional.ofNullable(this.contentSettings);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<String> country() {
        return Optional.ofNullable(this.country);
    }
    public Optional<String> deliveryFormat() {
        return Optional.ofNullable(this.deliveryFormat);
    }
    public Optional<String> deliveryType() {
        return Optional.ofNullable(this.deliveryType);
    }
    public Optional<String> downloadType() {
        return Optional.ofNullable(this.downloadType);
    }
    public Optional<String> endUserLocation() {
        return Optional.ofNullable(this.endUserLocation);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> maximumConcurrentUsers() {
        return Optional.ofNullable(this.maximumConcurrentUsers);
    }
    public Optional<String> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }
    public Optional<String> optimizeFor() {
        return Optional.ofNullable(this.optimizeFor);
    }
    public Optional<String> originSettings() {
        return Optional.ofNullable(this.originSettings);
    }
    public Optional<String> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
    }
    public Optional<String> refreshRate() {
        return Optional.ofNullable(this.refreshRate);
    }
    public Optional<Integer> segmentDuration() {
        return Optional.ofNullable(this.segmentDuration);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorQuality defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String audienceSettings;
        private @Nullable String catalogSize;
        private @Nullable String contentSettings;
        private @Nullable String contentType;
        private @Nullable String country;
        private @Nullable String deliveryFormat;
        private @Nullable String deliveryType;
        private @Nullable String downloadType;
        private @Nullable String endUserLocation;
        private @Nullable Boolean locked;
        private @Nullable String maximumConcurrentUsers;
        private @Nullable String objectSize;
        private @Nullable String optimizeFor;
        private @Nullable String originSettings;
        private @Nullable String popularityDistribution;
        private @Nullable String refreshRate;
        private @Nullable Integer segmentDuration;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorQuality defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audienceSettings = defaults.audienceSettings;
    	      this.catalogSize = defaults.catalogSize;
    	      this.contentSettings = defaults.contentSettings;
    	      this.contentType = defaults.contentType;
    	      this.country = defaults.country;
    	      this.deliveryFormat = defaults.deliveryFormat;
    	      this.deliveryType = defaults.deliveryType;
    	      this.downloadType = defaults.downloadType;
    	      this.endUserLocation = defaults.endUserLocation;
    	      this.locked = defaults.locked;
    	      this.maximumConcurrentUsers = defaults.maximumConcurrentUsers;
    	      this.objectSize = defaults.objectSize;
    	      this.optimizeFor = defaults.optimizeFor;
    	      this.originSettings = defaults.originSettings;
    	      this.popularityDistribution = defaults.popularityDistribution;
    	      this.refreshRate = defaults.refreshRate;
    	      this.segmentDuration = defaults.segmentDuration;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder audienceSettings(@Nullable String audienceSettings) {
            this.audienceSettings = audienceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder catalogSize(@Nullable String catalogSize) {
            this.catalogSize = catalogSize;
            return this;
        }
        @CustomType.Setter
        public Builder contentSettings(@Nullable String contentSettings) {
            this.contentSettings = contentSettings;
            return this;
        }
        @CustomType.Setter
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        @CustomType.Setter
        public Builder country(@Nullable String country) {
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryFormat(@Nullable String deliveryFormat) {
            this.deliveryFormat = deliveryFormat;
            return this;
        }
        @CustomType.Setter
        public Builder deliveryType(@Nullable String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        @CustomType.Setter
        public Builder downloadType(@Nullable String downloadType) {
            this.downloadType = downloadType;
            return this;
        }
        @CustomType.Setter
        public Builder endUserLocation(@Nullable String endUserLocation) {
            this.endUserLocation = endUserLocation;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder maximumConcurrentUsers(@Nullable String maximumConcurrentUsers) {
            this.maximumConcurrentUsers = maximumConcurrentUsers;
            return this;
        }
        @CustomType.Setter
        public Builder objectSize(@Nullable String objectSize) {
            this.objectSize = objectSize;
            return this;
        }
        @CustomType.Setter
        public Builder optimizeFor(@Nullable String optimizeFor) {
            this.optimizeFor = optimizeFor;
            return this;
        }
        @CustomType.Setter
        public Builder originSettings(@Nullable String originSettings) {
            this.originSettings = originSettings;
            return this;
        }
        @CustomType.Setter
        public Builder popularityDistribution(@Nullable String popularityDistribution) {
            this.popularityDistribution = popularityDistribution;
            return this;
        }
        @CustomType.Setter
        public Builder refreshRate(@Nullable String refreshRate) {
            this.refreshRate = refreshRate;
            return this;
        }
        @CustomType.Setter
        public Builder segmentDuration(@Nullable Integer segmentDuration) {
            this.segmentDuration = segmentDuration;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorQuality build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorQuality();
            _resultValue.audienceSettings = audienceSettings;
            _resultValue.catalogSize = catalogSize;
            _resultValue.contentSettings = contentSettings;
            _resultValue.contentType = contentType;
            _resultValue.country = country;
            _resultValue.deliveryFormat = deliveryFormat;
            _resultValue.deliveryType = deliveryType;
            _resultValue.downloadType = downloadType;
            _resultValue.endUserLocation = endUserLocation;
            _resultValue.locked = locked;
            _resultValue.maximumConcurrentUsers = maximumConcurrentUsers;
            _resultValue.objectSize = objectSize;
            _resultValue.optimizeFor = optimizeFor;
            _resultValue.originSettings = originSettings;
            _resultValue.popularityDistribution = popularityDistribution;
            _resultValue.refreshRate = refreshRate;
            _resultValue.segmentDuration = segmentDuration;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
