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
public final class GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest {
    private @Nullable Boolean locked;
    private @Nullable String matchOn;
    private @Nullable String matchOperator;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> matchOn() {
        return Optional.ofNullable(this.matchOn);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String matchOn;
        private @Nullable String matchOperator;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.matchOn = defaults.matchOn;
    	      this.matchOperator = defaults.matchOperator;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchOn(@Nullable String matchOn) {
            this.matchOn = matchOn;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {
            this.matchOperator = matchOperator;
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
        public GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest();
            _resultValue.locked = locked;
            _resultValue.matchOn = matchOn;
            _resultValue.matchOperator = matchOperator;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
