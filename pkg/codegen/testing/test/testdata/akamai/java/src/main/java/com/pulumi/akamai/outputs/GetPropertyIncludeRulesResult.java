// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPropertyIncludeRulesResult {
    private String contractId;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String includeId;
    private String name;
    private String ruleErrors;
    private String ruleFormat;
    private String ruleWarnings;
    private String rules;
    private String type;
    private Integer version;

    private GetPropertyIncludeRulesResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String includeId() {
        return this.includeId;
    }
    public String name() {
        return this.name;
    }
    public String ruleErrors() {
        return this.ruleErrors;
    }
    public String ruleFormat() {
        return this.ruleFormat;
    }
    public String ruleWarnings() {
        return this.ruleWarnings;
    }
    public String rules() {
        return this.rules;
    }
    public String type() {
        return this.type;
    }
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludeRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupId;
        private String id;
        private String includeId;
        private String name;
        private String ruleErrors;
        private String ruleFormat;
        private String ruleWarnings;
        private String rules;
        private String type;
        private Integer version;
        public Builder() {}
        public Builder(GetPropertyIncludeRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.includeId = defaults.includeId;
    	      this.name = defaults.name;
    	      this.ruleErrors = defaults.ruleErrors;
    	      this.ruleFormat = defaults.ruleFormat;
    	      this.ruleWarnings = defaults.ruleWarnings;
    	      this.rules = defaults.rules;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            this.contractId = Objects.requireNonNull(contractId);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeId(String includeId) {
            this.includeId = Objects.requireNonNull(includeId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder ruleErrors(String ruleErrors) {
            this.ruleErrors = Objects.requireNonNull(ruleErrors);
            return this;
        }
        @CustomType.Setter
        public Builder ruleFormat(String ruleFormat) {
            this.ruleFormat = Objects.requireNonNull(ruleFormat);
            return this;
        }
        @CustomType.Setter
        public Builder ruleWarnings(String ruleWarnings) {
            this.ruleWarnings = Objects.requireNonNull(ruleWarnings);
            return this;
        }
        @CustomType.Setter
        public Builder rules(String rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPropertyIncludeRulesResult build() {
            final var _resultValue = new GetPropertyIncludeRulesResult();
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.includeId = includeId;
            _resultValue.name = name;
            _resultValue.ruleErrors = ruleErrors;
            _resultValue.ruleFormat = ruleFormat;
            _resultValue.ruleWarnings = ruleWarnings;
            _resultValue.rules = rules;
            _resultValue.type = type;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
