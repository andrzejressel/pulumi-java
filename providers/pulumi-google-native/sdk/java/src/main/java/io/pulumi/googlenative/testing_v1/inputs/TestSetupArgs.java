// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AccountArgs;
import io.pulumi.googlenative.testing_v1.inputs.ApkArgs;
import io.pulumi.googlenative.testing_v1.inputs.DeviceFileArgs;
import io.pulumi.googlenative.testing_v1.inputs.EnvironmentVariableArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A description of how to set up the Android device prior to running the test.
 * 
 */
public final class TestSetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final TestSetupArgs Empty = new TestSetupArgs();

    /**
     * The device will be logged in on this account for the duration of the test.
     * 
     */
    @InputImport(name="account")
    private final @Nullable Input<AccountArgs> account;

    public Input<AccountArgs> getAccount() {
        return this.account == null ? Input.empty() : this.account;
    }

    /**
     * APKs to install in addition to those being directly tested. Currently capped at 100.
     * 
     */
    @InputImport(name="additionalApks")
    private final @Nullable Input<List<ApkArgs>> additionalApks;

    public Input<List<ApkArgs>> getAdditionalApks() {
        return this.additionalApks == null ? Input.empty() : this.additionalApks;
    }

    /**
     * List of directories on the device to upload to GCS at the end of the test; they must be absolute paths under /sdcard, /storage or /data/local/tmp. Path names are restricted to characters a-z A-Z 0-9 _ - . + and / Note: The paths /sdcard and /data will be made available and treated as implicit path substitutions. E.g. if /sdcard on a particular device does not map to external storage, the system will replace it with the external storage path prefix for that device.
     * 
     */
    @InputImport(name="directoriesToPull")
    private final @Nullable Input<List<String>> directoriesToPull;

    public Input<List<String>> getDirectoriesToPull() {
        return this.directoriesToPull == null ? Input.empty() : this.directoriesToPull;
    }

    /**
     * Whether to prevent all runtime permissions to be granted at app install
     * 
     */
    @InputImport(name="dontAutograntPermissions")
    private final @Nullable Input<Boolean> dontAutograntPermissions;

    public Input<Boolean> getDontAutograntPermissions() {
        return this.dontAutograntPermissions == null ? Input.empty() : this.dontAutograntPermissions;
    }

    /**
     * Environment variables to set for the test (only applicable for instrumentation tests).
     * 
     */
    @InputImport(name="environmentVariables")
    private final @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;

    public Input<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * List of files to push to the device before starting the test.
     * 
     */
    @InputImport(name="filesToPush")
    private final @Nullable Input<List<DeviceFileArgs>> filesToPush;

    public Input<List<DeviceFileArgs>> getFilesToPush() {
        return this.filesToPush == null ? Input.empty() : this.filesToPush;
    }

    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    @InputImport(name="networkProfile")
    private final @Nullable Input<String> networkProfile;

    public Input<String> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    public TestSetupArgs(
        @Nullable Input<AccountArgs> account,
        @Nullable Input<List<ApkArgs>> additionalApks,
        @Nullable Input<List<String>> directoriesToPull,
        @Nullable Input<Boolean> dontAutograntPermissions,
        @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables,
        @Nullable Input<List<DeviceFileArgs>> filesToPush,
        @Nullable Input<String> networkProfile) {
        this.account = account;
        this.additionalApks = additionalApks;
        this.directoriesToPull = directoriesToPull;
        this.dontAutograntPermissions = dontAutograntPermissions;
        this.environmentVariables = environmentVariables;
        this.filesToPush = filesToPush;
        this.networkProfile = networkProfile;
    }

    private TestSetupArgs() {
        this.account = Input.empty();
        this.additionalApks = Input.empty();
        this.directoriesToPull = Input.empty();
        this.dontAutograntPermissions = Input.empty();
        this.environmentVariables = Input.empty();
        this.filesToPush = Input.empty();
        this.networkProfile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AccountArgs> account;
        private @Nullable Input<List<ApkArgs>> additionalApks;
        private @Nullable Input<List<String>> directoriesToPull;
        private @Nullable Input<Boolean> dontAutograntPermissions;
        private @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;
        private @Nullable Input<List<DeviceFileArgs>> filesToPush;
        private @Nullable Input<String> networkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(TestSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.additionalApks = defaults.additionalApks;
    	      this.directoriesToPull = defaults.directoriesToPull;
    	      this.dontAutograntPermissions = defaults.dontAutograntPermissions;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.filesToPush = defaults.filesToPush;
    	      this.networkProfile = defaults.networkProfile;
        }

        public Builder setAccount(@Nullable Input<AccountArgs> account) {
            this.account = account;
            return this;
        }

        public Builder setAccount(@Nullable AccountArgs account) {
            this.account = Input.ofNullable(account);
            return this;
        }

        public Builder setAdditionalApks(@Nullable Input<List<ApkArgs>> additionalApks) {
            this.additionalApks = additionalApks;
            return this;
        }

        public Builder setAdditionalApks(@Nullable List<ApkArgs> additionalApks) {
            this.additionalApks = Input.ofNullable(additionalApks);
            return this;
        }

        public Builder setDirectoriesToPull(@Nullable Input<List<String>> directoriesToPull) {
            this.directoriesToPull = directoriesToPull;
            return this;
        }

        public Builder setDirectoriesToPull(@Nullable List<String> directoriesToPull) {
            this.directoriesToPull = Input.ofNullable(directoriesToPull);
            return this;
        }

        public Builder setDontAutograntPermissions(@Nullable Input<Boolean> dontAutograntPermissions) {
            this.dontAutograntPermissions = dontAutograntPermissions;
            return this;
        }

        public Builder setDontAutograntPermissions(@Nullable Boolean dontAutograntPermissions) {
            this.dontAutograntPermissions = Input.ofNullable(dontAutograntPermissions);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setFilesToPush(@Nullable Input<List<DeviceFileArgs>> filesToPush) {
            this.filesToPush = filesToPush;
            return this;
        }

        public Builder setFilesToPush(@Nullable List<DeviceFileArgs> filesToPush) {
            this.filesToPush = Input.ofNullable(filesToPush);
            return this;
        }

        public Builder setNetworkProfile(@Nullable Input<String> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable String networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public TestSetupArgs build() {
            return new TestSetupArgs(account, additionalApks, directoriesToPull, dontAutograntPermissions, environmentVariables, filesToPush, networkProfile);
        }
    }
}
