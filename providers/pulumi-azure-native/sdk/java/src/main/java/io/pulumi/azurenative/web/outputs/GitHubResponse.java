// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ClientRegistrationResponse;
import io.pulumi.azurenative.web.outputs.LoginScopesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GitHubResponse {
    /**
     * <code>false</code> if the GitHub provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the login flow.
     * 
     */
    private final @Nullable LoginScopesResponse login;
    /**
     * The configuration settings of the app registration for the GitHub provider.
     * 
     */
    private final @Nullable ClientRegistrationResponse registration;

    @OutputCustomType.Constructor
    private GitHubResponse(
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("login") @Nullable LoginScopesResponse login,
        @OutputCustomType.Parameter("registration") @Nullable ClientRegistrationResponse registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    /**
     * <code>false</code> if the GitHub provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the login flow.
     * 
    */
    public Optional<LoginScopesResponse> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The configuration settings of the app registration for the GitHub provider.
     * 
    */
    public Optional<ClientRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable LoginScopesResponse login;
        private @Nullable ClientRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogin(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }

        public Builder setRegistration(@Nullable ClientRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        public GitHubResponse build() {
            return new GitHubResponse(enabled, login, registration);
        }
    }
}
