// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ManagedRuleGroupOverrideResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedRuleSetResponse {
    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
     */
    private final @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;
    /**
     * Defines the rule set type to use.
     * 
     */
    private final String ruleSetType;
    /**
     * Defines the version of the rule set to use.
     * 
     */
    private final String ruleSetVersion;

    @OutputCustomType.Constructor
    private ManagedRuleSetResponse(
        @OutputCustomType.Parameter("ruleGroupOverrides") @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides,
        @OutputCustomType.Parameter("ruleSetType") String ruleSetType,
        @OutputCustomType.Parameter("ruleSetVersion") String ruleSetVersion) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        this.ruleSetType = ruleSetType;
        this.ruleSetVersion = ruleSetVersion;
    }

    /**
     * Defines the rule group overrides to apply to the rule set.
     * 
    */
    public List<ManagedRuleGroupOverrideResponse> getRuleGroupOverrides() {
        return this.ruleGroupOverrides == null ? List.of() : this.ruleGroupOverrides;
    }
    /**
     * Defines the rule set type to use.
     * 
    */
    public String getRuleSetType() {
        return this.ruleSetType;
    }
    /**
     * Defines the version of the rule set to use.
     * 
    */
    public String getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleGroupOverrides = defaults.ruleGroupOverrides;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setRuleGroupOverrides(@Nullable List<ManagedRuleGroupOverrideResponse> ruleGroupOverrides) {
            this.ruleGroupOverrides = ruleGroupOverrides;
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }
        public ManagedRuleSetResponse build() {
            return new ManagedRuleSetResponse(ruleGroupOverrides, ruleSetType, ruleSetVersion);
        }
    }
}
