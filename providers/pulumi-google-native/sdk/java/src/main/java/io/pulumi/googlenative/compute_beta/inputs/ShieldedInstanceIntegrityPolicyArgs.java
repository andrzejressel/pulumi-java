// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The policy describes the baseline against which Instance boot integrity is measured.
 * 
 */
public final class ShieldedInstanceIntegrityPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShieldedInstanceIntegrityPolicyArgs Empty = new ShieldedInstanceIntegrityPolicyArgs();

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
     */
    @InputImport(name="updateAutoLearnPolicy")
    private final @Nullable Input<Boolean> updateAutoLearnPolicy;

    public Input<Boolean> getUpdateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy == null ? Input.empty() : this.updateAutoLearnPolicy;
    }

    public ShieldedInstanceIntegrityPolicyArgs(@Nullable Input<Boolean> updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = updateAutoLearnPolicy;
    }

    private ShieldedInstanceIntegrityPolicyArgs() {
        this.updateAutoLearnPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceIntegrityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> updateAutoLearnPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceIntegrityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateAutoLearnPolicy = defaults.updateAutoLearnPolicy;
        }

        public Builder setUpdateAutoLearnPolicy(@Nullable Input<Boolean> updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = updateAutoLearnPolicy;
            return this;
        }

        public Builder setUpdateAutoLearnPolicy(@Nullable Boolean updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = Input.ofNullable(updateAutoLearnPolicy);
            return this;
        }

        public ShieldedInstanceIntegrityPolicyArgs build() {
            return new ShieldedInstanceIntegrityPolicyArgs(updateAutoLearnPolicy);
        }
    }
}
