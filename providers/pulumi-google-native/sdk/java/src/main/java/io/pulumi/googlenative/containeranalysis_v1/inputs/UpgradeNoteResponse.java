// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeDistributionResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionResponse;
import io.pulumi.googlenative.containeranalysis_v1.inputs.WindowsUpdateResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An Upgrade Note represents a potential upgrade of a package to a given version. For each package version combination (i.e. bash 4.0, bash 4.1, bash 4.1.2), there will be an Upgrade Note. For Windows, windows_update field represents the information related to the update.
 * 
 */
public final class UpgradeNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradeNoteResponse Empty = new UpgradeNoteResponse();

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    @InputImport(name="distributions", required=true)
    private final List<UpgradeDistributionResponse> distributions;

    public List<UpgradeDistributionResponse> getDistributions() {
        return this.distributions;
    }

    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    @InputImport(name="package", required=true)
    private final String $package;

    public String get$package() {
        return this.$package;
    }

    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
     */
    @InputImport(name="version", required=true)
    private final VersionResponse version;

    public VersionResponse getVersion() {
        return this.version;
    }

    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    @InputImport(name="windowsUpdate", required=true)
    private final WindowsUpdateResponse windowsUpdate;

    public WindowsUpdateResponse getWindowsUpdate() {
        return this.windowsUpdate;
    }

    public UpgradeNoteResponse(
        List<UpgradeDistributionResponse> distributions,
        String $package,
        VersionResponse version,
        WindowsUpdateResponse windowsUpdate) {
        this.distributions = Objects.requireNonNull(distributions, "expected parameter 'distributions' to be non-null");
        this.$package = Objects.requireNonNull($package, "expected parameter '$package' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.windowsUpdate = Objects.requireNonNull(windowsUpdate, "expected parameter 'windowsUpdate' to be non-null");
    }

    private UpgradeNoteResponse() {
        this.distributions = List.of();
        this.$package = null;
        this.version = null;
        this.windowsUpdate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<UpgradeDistributionResponse> distributions;
        private String $package;
        private VersionResponse version;
        private WindowsUpdateResponse windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributions = defaults.distributions;
    	      this.$package = defaults.$package;
    	      this.version = defaults.version;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder setDistributions(List<UpgradeDistributionResponse> distributions) {
            this.distributions = Objects.requireNonNull(distributions);
            return this;
        }

        public Builder set$package(String $package) {
            this.$package = Objects.requireNonNull($package);
            return this;
        }

        public Builder setVersion(VersionResponse version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setWindowsUpdate(WindowsUpdateResponse windowsUpdate) {
            this.windowsUpdate = Objects.requireNonNull(windowsUpdate);
            return this;
        }

        public UpgradeNoteResponse build() {
            return new UpgradeNoteResponse(distributions, $package, version, windowsUpdate);
        }
    }
}
