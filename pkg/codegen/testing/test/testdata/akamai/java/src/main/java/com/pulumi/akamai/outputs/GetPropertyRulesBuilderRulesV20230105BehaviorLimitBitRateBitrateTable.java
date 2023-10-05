// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable {
    private @Nullable String bitrateUnit;
    private @Nullable Double bitrateValue;

    private GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable() {}
    public Optional<String> bitrateUnit() {
        return Optional.ofNullable(this.bitrateUnit);
    }
    public Optional<Double> bitrateValue() {
        return Optional.ofNullable(this.bitrateValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bitrateUnit;
        private @Nullable Double bitrateValue;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateUnit = defaults.bitrateUnit;
    	      this.bitrateValue = defaults.bitrateValue;
        }

        @CustomType.Setter
        public Builder bitrateUnit(@Nullable String bitrateUnit) {
            this.bitrateUnit = bitrateUnit;
            return this;
        }
        @CustomType.Setter
        public Builder bitrateValue(@Nullable Double bitrateValue) {
            this.bitrateValue = bitrateValue;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorLimitBitRateBitrateTable();
            _resultValue.bitrateUnit = bitrateUnit;
            _resultValue.bitrateValue = bitrateValue;
            return _resultValue;
        }
    }
}
