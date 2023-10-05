// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable();

    @Import(name="bitrateUnit")
    private @Nullable String bitrateUnit;

    public Optional<String> bitrateUnit() {
        return Optional.ofNullable(this.bitrateUnit);
    }

    @Import(name="bitrateValue")
    private @Nullable Double bitrateValue;

    public Optional<Double> bitrateValue() {
        return Optional.ofNullable(this.bitrateValue);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable $) {
        this.bitrateUnit = $.bitrateUnit;
        this.bitrateValue = $.bitrateValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable(Objects.requireNonNull(defaults));
        }

        public Builder bitrateUnit(@Nullable String bitrateUnit) {
            $.bitrateUnit = bitrateUnit;
            return this;
        }

        public Builder bitrateValue(@Nullable Double bitrateValue) {
            $.bitrateValue = bitrateValue;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorLimitBitRateBitrateTable build() {
            return $;
        }
    }

}
