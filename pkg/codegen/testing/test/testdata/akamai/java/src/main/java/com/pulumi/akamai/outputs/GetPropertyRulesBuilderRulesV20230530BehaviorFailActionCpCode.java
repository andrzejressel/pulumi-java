// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeCpCodeLimits;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode {
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeCpCodeLimits cpCodeLimits;
    private @Nullable Integer createdDate;
    private @Nullable String description;
    private @Nullable Integer id;
    private @Nullable String name;
    private @Nullable List<String> products;

    private GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode() {}
    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeCpCodeLimits> cpCodeLimits() {
        return Optional.ofNullable(this.cpCodeLimits);
    }
    public Optional<Integer> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> products() {
        return this.products == null ? List.of() : this.products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeCpCodeLimits cpCodeLimits;
        private @Nullable Integer createdDate;
        private @Nullable String description;
        private @Nullable Integer id;
        private @Nullable String name;
        private @Nullable List<String> products;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpCodeLimits = defaults.cpCodeLimits;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.products = defaults.products;
        }

        @CustomType.Setter
        public Builder cpCodeLimits(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeCpCodeLimits cpCodeLimits) {
            this.cpCodeLimits = cpCodeLimits;
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(@Nullable Integer createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
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
        @CustomType.Setter
        public Builder products(@Nullable List<String> products) {
            this.products = products;
            return this;
        }
        public Builder products(String... products) {
            return products(List.of(products));
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCode();
            _resultValue.cpCodeLimits = cpCodeLimits;
            _resultValue.createdDate = createdDate;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.products = products;
            return _resultValue;
        }
    }
}
