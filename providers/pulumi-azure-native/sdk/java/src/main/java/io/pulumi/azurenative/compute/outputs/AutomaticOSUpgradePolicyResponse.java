// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomaticOSUpgradePolicyResponse {
    /**
     * Whether OS image rollback feature should be disabled. Default value is false.
     * 
     */
    private final @Nullable Boolean disableAutomaticRollback;
    /**
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. <br><br> If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
     * 
     */
    private final @Nullable Boolean enableAutomaticOSUpgrade;

    @OutputCustomType.Constructor
    private AutomaticOSUpgradePolicyResponse(
        @OutputCustomType.Parameter("disableAutomaticRollback") @Nullable Boolean disableAutomaticRollback,
        @OutputCustomType.Parameter("enableAutomaticOSUpgrade") @Nullable Boolean enableAutomaticOSUpgrade) {
        this.disableAutomaticRollback = disableAutomaticRollback;
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
    }

    /**
     * Whether OS image rollback feature should be disabled. Default value is false.
     * 
    */
    public Optional<Boolean> getDisableAutomaticRollback() {
        return Optional.ofNullable(this.disableAutomaticRollback);
    }
    /**
     * Indicates whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the OS image becomes available. Default value is false. <br><br> If this is set to true for Windows based scale sets, [enableAutomaticUpdates](https://docs.microsoft.com/dotnet/api/microsoft.azure.management.compute.models.windowsconfiguration.enableautomaticupdates?view=azure-dotnet) is automatically set to false and cannot be set to true.
     * 
    */
    public Optional<Boolean> getEnableAutomaticOSUpgrade() {
        return Optional.ofNullable(this.enableAutomaticOSUpgrade);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticOSUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableAutomaticRollback;
        private @Nullable Boolean enableAutomaticOSUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticOSUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutomaticRollback = defaults.disableAutomaticRollback;
    	      this.enableAutomaticOSUpgrade = defaults.enableAutomaticOSUpgrade;
        }

        public Builder setDisableAutomaticRollback(@Nullable Boolean disableAutomaticRollback) {
            this.disableAutomaticRollback = disableAutomaticRollback;
            return this;
        }

        public Builder setEnableAutomaticOSUpgrade(@Nullable Boolean enableAutomaticOSUpgrade) {
            this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
            return this;
        }
        public AutomaticOSUpgradePolicyResponse build() {
            return new AutomaticOSUpgradePolicyResponse(disableAutomaticRollback, enableAutomaticOSUpgrade);
        }
    }
}
