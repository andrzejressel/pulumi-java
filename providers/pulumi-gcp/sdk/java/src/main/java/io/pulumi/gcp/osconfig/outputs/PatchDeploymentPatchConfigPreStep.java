// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfig;
import io.pulumi.gcp.osconfig.outputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentPatchConfigPreStep {
    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    private final @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig;
    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    private final @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig;

    @OutputCustomType.Constructor({"linuxExecStepConfig","windowsExecStepConfig"})
    private PatchDeploymentPatchConfigPreStep(
        @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig,
        @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    public Optional<PatchDeploymentPatchConfigPreStepLinuxExecStepConfig> getLinuxExecStepConfig() {
        return Optional.ofNullable(this.linuxExecStepConfig);
    }
    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    public Optional<PatchDeploymentPatchConfigPreStepWindowsExecStepConfig> getWindowsExecStepConfig() {
        return Optional.ofNullable(this.windowsExecStepConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig;
        private @Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder setLinuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfig linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }

        public Builder setWindowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfig windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }

        public PatchDeploymentPatchConfigPreStep build() {
            return new PatchDeploymentPatchConfigPreStep(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
