// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration options for L7 DDoS detection.
 * 
 */
public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @InputImport(name="enable", required=true)
    private final Boolean enable;

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @InputImport(name="ruleVisibility", required=true)
    private final String ruleVisibility;

    public String getRuleVisibility() {
        return this.ruleVisibility;
    }

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(
        Boolean enable,
        String ruleVisibility) {
        this.enable = Objects.requireNonNull(enable, "expected parameter 'enable' to be non-null");
        this.ruleVisibility = Objects.requireNonNull(ruleVisibility, "expected parameter 'ruleVisibility' to be non-null");
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse() {
        this.enable = null;
        this.ruleVisibility = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setRuleVisibility(String ruleVisibility) {
            this.ruleVisibility = Objects.requireNonNull(ruleVisibility);
            return this;
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigResponse(enable, ruleVisibility);
        }
    }
}
