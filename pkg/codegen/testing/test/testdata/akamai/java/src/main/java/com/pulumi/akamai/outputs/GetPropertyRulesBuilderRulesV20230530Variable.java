// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530Variable {
    private String description;
    private Boolean hidden;
    private String name;
    private Boolean sensitive;
    private String value;

    private GetPropertyRulesBuilderRulesV20230530Variable() {}
    public String description() {
        return this.description;
    }
    public Boolean hidden() {
        return this.hidden;
    }
    public String name() {
        return this.name;
    }
    public Boolean sensitive() {
        return this.sensitive;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530Variable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private Boolean hidden;
        private String name;
        private Boolean sensitive;
        private String value;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530Variable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hidden = defaults.hidden;
    	      this.name = defaults.name;
    	      this.sensitive = defaults.sensitive;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder hidden(Boolean hidden) {
            this.hidden = Objects.requireNonNull(hidden);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = Objects.requireNonNull(sensitive);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530Variable build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530Variable();
            _resultValue.description = description;
            _resultValue.hidden = hidden;
            _resultValue.name = name;
            _resultValue.sensitive = sensitive;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
