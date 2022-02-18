// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity-Aware Proxy
 * 
 */
public final class BackendServiceIAPArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceIAPArgs Empty = new BackendServiceIAPArgs();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @InputImport(name="oauth2ClientId")
    private final @Nullable Input<String> oauth2ClientId;

    public Input<String> getOauth2ClientId() {
        return this.oauth2ClientId == null ? Input.empty() : this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
     * 
     */
    @InputImport(name="oauth2ClientSecret")
    private final @Nullable Input<String> oauth2ClientSecret;

    public Input<String> getOauth2ClientSecret() {
        return this.oauth2ClientSecret == null ? Input.empty() : this.oauth2ClientSecret;
    }

    public BackendServiceIAPArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> oauth2ClientId,
        @Nullable Input<String> oauth2ClientSecret) {
        this.enabled = enabled;
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientSecret = oauth2ClientSecret;
    }

    private BackendServiceIAPArgs() {
        this.enabled = Input.empty();
        this.oauth2ClientId = Input.empty();
        this.oauth2ClientSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> oauth2ClientId;
        private @Nullable Input<String> oauth2ClientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setOauth2ClientId(@Nullable Input<String> oauth2ClientId) {
            this.oauth2ClientId = oauth2ClientId;
            return this;
        }

        public Builder setOauth2ClientId(@Nullable String oauth2ClientId) {
            this.oauth2ClientId = Input.ofNullable(oauth2ClientId);
            return this;
        }

        public Builder setOauth2ClientSecret(@Nullable Input<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        public Builder setOauth2ClientSecret(@Nullable String oauth2ClientSecret) {
            this.oauth2ClientSecret = Input.ofNullable(oauth2ClientSecret);
            return this;
        }

        public BackendServiceIAPArgs build() {
            return new BackendServiceIAPArgs(enabled, oauth2ClientId, oauth2ClientSecret);
        }
    }
}
