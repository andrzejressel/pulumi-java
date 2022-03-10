// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthPlatformResponse {
    /**
     * The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     * 
     */
    private final @Nullable String configFilePath;
    /**
     * <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
     */
    private final @Nullable String runtimeVersion;

    @OutputCustomType.Constructor
    private AuthPlatformResponse(
        @OutputCustomType.Parameter("configFilePath") @Nullable String configFilePath,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("runtimeVersion") @Nullable String runtimeVersion) {
        this.configFilePath = configFilePath;
        this.enabled = enabled;
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * The path of the config file containing auth settings if they come from a file.
     * If the path is relative, base will the site's root directory.
     * 
    */
    public Optional<String> getConfigFilePath() {
        return Optional.ofNullable(this.configFilePath);
    }
    /**
     * <code>true</code> if the Authentication / Authorization feature is enabled for the current app; otherwise, <code>false</code>.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The RuntimeVersion of the Authentication / Authorization feature in use for the current app.
     * The setting in this value can control the behavior of certain features in the Authentication / Authorization module.
     * 
    */
    public Optional<String> getRuntimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthPlatformResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configFilePath;
        private @Nullable Boolean enabled;
        private @Nullable String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthPlatformResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configFilePath = defaults.configFilePath;
    	      this.enabled = defaults.enabled;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setConfigFilePath(@Nullable String configFilePath) {
            this.configFilePath = configFilePath;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public AuthPlatformResponse build() {
            return new AuthPlatformResponse(configFilePath, enabled, runtimeVersion);
        }
    }
}
