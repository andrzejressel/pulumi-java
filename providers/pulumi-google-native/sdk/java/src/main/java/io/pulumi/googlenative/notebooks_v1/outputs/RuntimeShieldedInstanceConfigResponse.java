// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class RuntimeShieldedInstanceConfigResponse {
    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created. Enabled by default.
     * 
     */
    private final Boolean enableIntegrityMonitoring;
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails. Disabled by default.
     * 
     */
    private final Boolean enableSecureBoot;
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    private final Boolean enableVtpm;

    @OutputCustomType.Constructor({"enableIntegrityMonitoring","enableSecureBoot","enableVtpm"})
    private RuntimeShieldedInstanceConfigResponse(
        Boolean enableIntegrityMonitoring,
        Boolean enableSecureBoot,
        Boolean enableVtpm) {
        this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
        this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
        this.enableVtpm = Objects.requireNonNull(enableVtpm);
    }

    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created. Enabled by default.
     * 
     */
    public Boolean getEnableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }
    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails. Disabled by default.
     * 
     */
    public Boolean getEnableSecureBoot() {
        return this.enableSecureBoot;
    }
    /**
     * Defines whether the instance has the vTPM enabled. Enabled by default.
     * 
     */
    public Boolean getEnableVtpm() {
        return this.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeShieldedInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableIntegrityMonitoring;
        private Boolean enableSecureBoot;
        private Boolean enableVtpm;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeShieldedInstanceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        public Builder setEnableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = Objects.requireNonNull(enableIntegrityMonitoring);
            return this;
        }

        public Builder setEnableSecureBoot(Boolean enableSecureBoot) {
            this.enableSecureBoot = Objects.requireNonNull(enableSecureBoot);
            return this;
        }

        public Builder setEnableVtpm(Boolean enableVtpm) {
            this.enableVtpm = Objects.requireNonNull(enableVtpm);
            return this;
        }

        public RuntimeShieldedInstanceConfigResponse build() {
            return new RuntimeShieldedInstanceConfigResponse(enableIntegrityMonitoring, enableSecureBoot, enableVtpm);
        }
    }
}
