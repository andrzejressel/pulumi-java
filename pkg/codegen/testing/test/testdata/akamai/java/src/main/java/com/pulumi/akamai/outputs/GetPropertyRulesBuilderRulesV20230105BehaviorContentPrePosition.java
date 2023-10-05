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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition {
    private @Nullable Boolean enabled;
    private @Nullable String firstLocation;
    private @Nullable Boolean locked;
    private @Nullable String secondLocation;
    private @Nullable String sourceType;
    private @Nullable String targets;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> firstLocation() {
        return Optional.ofNullable(this.firstLocation);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> secondLocation() {
        return Optional.ofNullable(this.secondLocation);
    }
    public Optional<String> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    public Optional<String> targets() {
        return Optional.ofNullable(this.targets);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String firstLocation;
        private @Nullable Boolean locked;
        private @Nullable String secondLocation;
        private @Nullable String sourceType;
        private @Nullable String targets;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.firstLocation = defaults.firstLocation;
    	      this.locked = defaults.locked;
    	      this.secondLocation = defaults.secondLocation;
    	      this.sourceType = defaults.sourceType;
    	      this.targets = defaults.targets;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder firstLocation(@Nullable String firstLocation) {
            this.firstLocation = firstLocation;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder secondLocation(@Nullable String secondLocation) {
            this.secondLocation = secondLocation;
            return this;
        }
        @CustomType.Setter
        public Builder sourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        @CustomType.Setter
        public Builder targets(@Nullable String targets) {
            this.targets = targets;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorContentPrePosition();
            _resultValue.enabled = enabled;
            _resultValue.firstLocation = firstLocation;
            _resultValue.locked = locked;
            _resultValue.secondLocation = secondLocation;
            _resultValue.sourceType = sourceType;
            _resultValue.targets = targets;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
