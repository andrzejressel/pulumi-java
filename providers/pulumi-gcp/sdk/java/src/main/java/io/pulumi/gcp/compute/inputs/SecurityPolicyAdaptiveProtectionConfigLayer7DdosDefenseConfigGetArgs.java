// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs Empty = new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs();

    /**
     * If set to true, enables CAAP for L7 DDoS detection.
     * 
     */
    @InputImport(name="enable")
    private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
     * 
     */
    @InputImport(name="ruleVisibility")
    private final @Nullable Input<String> ruleVisibility;

    public Input<String> getRuleVisibility() {
        return this.ruleVisibility == null ? Input.empty() : this.ruleVisibility;
    }

    public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs(
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> ruleVisibility) {
        this.enable = enable;
        this.ruleVisibility = ruleVisibility;
    }

    private SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs() {
        this.enable = Input.empty();
        this.ruleVisibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> ruleVisibility;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.ruleVisibility = defaults.ruleVisibility;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setRuleVisibility(@Nullable Input<String> ruleVisibility) {
            this.ruleVisibility = ruleVisibility;
            return this;
        }

        public Builder setRuleVisibility(@Nullable String ruleVisibility) {
            this.ruleVisibility = Input.ofNullable(ruleVisibility);
            return this;
        }

        public SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs(enable, ruleVisibility);
        }
    }
}
