// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy {
    private @Nullable Integer id;
    private @Nullable String name;

    private GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy() {}
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer id;
        private @Nullable String name;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorRequestControlCloudletPolicy();
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
