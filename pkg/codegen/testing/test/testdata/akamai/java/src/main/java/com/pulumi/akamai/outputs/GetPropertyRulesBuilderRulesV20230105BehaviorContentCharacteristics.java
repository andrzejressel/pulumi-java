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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics {
    private @Nullable String catalogSize;
    private @Nullable String contentType;
    private @Nullable Boolean locked;
    private @Nullable String objectSize;
    private @Nullable String popularityDistribution;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics() {}
    public Optional<String> catalogSize() {
        return Optional.ofNullable(this.catalogSize);
    }
    public Optional<String> contentType() {
        return Optional.ofNullable(this.contentType);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> objectSize() {
        return Optional.ofNullable(this.objectSize);
    }
    public Optional<String> popularityDistribution() {
        return Optional.ofNullable(this.popularityDistribution);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String catalogSize;
        private @Nullable String contentType;
        private @Nullable Boolean locked;
        private @Nullable String objectSize;
        private @Nullable String popularityDistribution;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogSize = defaults.catalogSize;
    	      this.contentType = defaults.contentType;
    	      this.locked = defaults.locked;
    	      this.objectSize = defaults.objectSize;
    	      this.popularityDistribution = defaults.popularityDistribution;
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
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder objectSize(@Nullable String objectSize) {
            this.objectSize = objectSize;
            return this;
        }
        @CustomType.Setter
        public Builder popularityDistribution(@Nullable String popularityDistribution) {
            this.popularityDistribution = popularityDistribution;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristics();
            _resultValue.catalogSize = catalogSize;
            _resultValue.contentType = contentType;
            _resultValue.locked = locked;
            _resultValue.objectSize = objectSize;
            _resultValue.popularityDistribution = popularityDistribution;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
