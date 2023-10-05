// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCodeValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode {
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCodeValue value;

    private GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCodeValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCodeValue value;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.value = defaults.value;
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
        @CustomType.Setter
        public Builder value(@Nullable GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCodeValue value) {
            this.value = value;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionMatchCpCode();
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
