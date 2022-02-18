// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for Cloud Armor.
 * 
 */
public final class SecurityPolicyCloudArmorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyCloudArmorConfigArgs Empty = new SecurityPolicyCloudArmorConfigArgs();

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    @InputImport(name="enableMl")
    private final @Nullable Input<Boolean> enableMl;

    public Input<Boolean> getEnableMl() {
        return this.enableMl == null ? Input.empty() : this.enableMl;
    }

    public SecurityPolicyCloudArmorConfigArgs(@Nullable Input<Boolean> enableMl) {
        this.enableMl = enableMl;
    }

    private SecurityPolicyCloudArmorConfigArgs() {
        this.enableMl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyCloudArmorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableMl;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyCloudArmorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMl = defaults.enableMl;
        }

        public Builder setEnableMl(@Nullable Input<Boolean> enableMl) {
            this.enableMl = enableMl;
            return this;
        }

        public Builder setEnableMl(@Nullable Boolean enableMl) {
            this.enableMl = Input.ofNullable(enableMl);
            return this;
        }

        public SecurityPolicyCloudArmorConfigArgs build() {
            return new SecurityPolicyCloudArmorConfigArgs(enableMl);
        }
    }
}
