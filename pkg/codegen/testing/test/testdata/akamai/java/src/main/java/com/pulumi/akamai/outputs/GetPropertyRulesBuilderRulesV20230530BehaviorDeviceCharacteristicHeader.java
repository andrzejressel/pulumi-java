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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader {
    private @Nullable List<String> elements;
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader() {}
    public List<String> elements() {
        return this.elements == null ? List.of() : this.elements;
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> elements;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elements = defaults.elements;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder elements(@Nullable List<String> elements) {
            this.elements = elements;
            return this;
        }
        public Builder elements(String... elements) {
            return elements(List.of(elements));
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
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorDeviceCharacteristicHeader();
            _resultValue.elements = elements;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
