// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyAdaptiveProtectionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAdaptiveProtectionConfigGetArgs Empty = new SecurityPolicyAdaptiveProtectionConfigGetArgs();

    /**
     * Configuration for [Google Cloud Armor Adaptive Protection Layer 7 DDoS Defense](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    @InputImport(name="layer7DdosDefenseConfig")
    private final @Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs> layer7DdosDefenseConfig;

    public Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs> getLayer7DdosDefenseConfig() {
        return this.layer7DdosDefenseConfig == null ? Input.empty() : this.layer7DdosDefenseConfig;
    }

    public SecurityPolicyAdaptiveProtectionConfigGetArgs(@Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs> layer7DdosDefenseConfig) {
        this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
    }

    private SecurityPolicyAdaptiveProtectionConfigGetArgs() {
        this.layer7DdosDefenseConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs> layer7DdosDefenseConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAdaptiveProtectionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.layer7DdosDefenseConfig = defaults.layer7DdosDefenseConfig;
        }

        public Builder setLayer7DdosDefenseConfig(@Nullable Input<SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs> layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = layer7DdosDefenseConfig;
            return this;
        }

        public Builder setLayer7DdosDefenseConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigGetArgs layer7DdosDefenseConfig) {
            this.layer7DdosDefenseConfig = Input.ofNullable(layer7DdosDefenseConfig);
            return this;
        }

        public SecurityPolicyAdaptiveProtectionConfigGetArgs build() {
            return new SecurityPolicyAdaptiveProtectionConfigGetArgs(layer7DdosDefenseConfig);
        }
    }
}
