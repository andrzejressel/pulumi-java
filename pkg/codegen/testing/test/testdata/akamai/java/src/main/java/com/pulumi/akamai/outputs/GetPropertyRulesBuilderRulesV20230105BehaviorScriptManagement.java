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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement {
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable String serviceworker;
    private @Nullable String templateUuid;
    private @Nullable Integer timestamp;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement() {}
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> serviceworker() {
        return Optional.ofNullable(this.serviceworker);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Integer> timestamp() {
        return Optional.ofNullable(this.timestamp);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable String serviceworker;
        private @Nullable String templateUuid;
        private @Nullable Integer timestamp;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.serviceworker = defaults.serviceworker;
    	      this.templateUuid = defaults.templateUuid;
    	      this.timestamp = defaults.timestamp;
    	      this.uuid = defaults.uuid;
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
        public Builder serviceworker(@Nullable String serviceworker) {
            this.serviceworker = serviceworker;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder timestamp(@Nullable Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorScriptManagement();
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.serviceworker = serviceworker;
            _resultValue.templateUuid = templateUuid;
            _resultValue.timestamp = timestamp;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
