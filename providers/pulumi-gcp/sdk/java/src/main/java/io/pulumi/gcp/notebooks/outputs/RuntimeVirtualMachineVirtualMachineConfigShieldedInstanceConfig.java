// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig {
    /**
     * Defines whether the instance has integrity monitoring enabled.
     * Enables monitoring and attestation of the boot integrity of
     * the instance. The attestation is performed against the
     * integrity policy baseline. This baseline is initially derived
     * from the implicitly trusted boot image when the instance is
     * created. Enabled by default.
     * 
     */
    private final @Nullable Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled.Secure
     * Boot helps ensure that the system only runs authentic software
     * by verifying the digital signature of all boot components, and
     * halting the boot process if signature verification fails.
     * Disabled by default.
     * 
     */
    private final @Nullable Boolean enableSecureBoot;
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by
     * default.
     * 
     */
    private final @Nullable Boolean enableVtpm;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot","enableVtpm"})
    private RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig(
        @Nullable Boolean enableIntegrityMonitoring,
        @Nullable Boolean enableSecureBoot,
        @Nullable Boolean enableVtpm) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
        this.enableVtpm = enableVtpm;
    }

    /**
     * Defines whether the instance has integrity monitoring enabled.
     * Enables monitoring and attestation of the boot integrity of
     * the instance. The attestation is performed against the
     * integrity policy baseline. This baseline is initially derived
     * from the implicitly trusted boot image when the instance is
     * created. Enabled by default.
     * 
     */
    public Optional<Boolean> getEnableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * Defines whether the instance has Secure Boot enabled.Secure
     * Boot helps ensure that the system only runs authentic software
     * by verifying the digital signature of all boot components, and
     * halting the boot process if signature verification fails.
     * Disabled by default.
     * 
     */
    public Optional<Boolean> getEnableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by
     * default.
     * 
     */
    public Optional<Boolean> getEnableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder setEnableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }

        public RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig build() {
            return new RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
