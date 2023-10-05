// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    private String contractId;
    private String groupName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetGroupResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupName;
        private String id;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            this.contractId = Objects.requireNonNull(contractId);
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetGroupResult build() {
            final var _resultValue = new GetGroupResult();
            _resultValue.contractId = contractId;
            _resultValue.groupName = groupName;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
