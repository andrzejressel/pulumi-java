// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationIapArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationIapArgs Empty = new ApplicationIapArgs();

    /**
     * (Optional) Whether the serving infrastructure will authenticate and authorize all incoming requests.
     * (default is false)
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
    @InputImport(name="oauth2ClientId", required=true)
    private final Input<String> oauth2ClientId;

    public Input<String> getOauth2ClientId() {
        return this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow.
     * The SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field.
     * 
     */
    @InputImport(name="oauth2ClientSecret", required=true)
    private final Input<String> oauth2ClientSecret;

    public Input<String> getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }

    /**
     * Hex-encoded SHA-256 hash of the client secret.
     * 
     */
    @InputImport(name="oauth2ClientSecretSha256")
    private final @Nullable Input<String> oauth2ClientSecretSha256;

    public Input<String> getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256 == null ? Input.empty() : this.oauth2ClientSecretSha256;
    }

    public ApplicationIapArgs(
        @Nullable Input<Boolean> enabled,
        Input<String> oauth2ClientId,
        Input<String> oauth2ClientSecret,
        @Nullable Input<String> oauth2ClientSecretSha256) {
        this.enabled = enabled;
        this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId, "expected parameter 'oauth2ClientId' to be non-null");
        this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret, "expected parameter 'oauth2ClientSecret' to be non-null");
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    private ApplicationIapArgs() {
        this.enabled = Input.empty();
        this.oauth2ClientId = Input.empty();
        this.oauth2ClientSecret = Input.empty();
        this.oauth2ClientSecretSha256 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationIapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private Input<String> oauth2ClientId;
        private Input<String> oauth2ClientSecret;
        private @Nullable Input<String> oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationIapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setOauth2ClientId(Input<String> oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder setOauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Input.of(Objects.requireNonNull(oauth2ClientId));
            return this;
        }

        public Builder setOauth2ClientSecret(Input<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }

        public Builder setOauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Input.of(Objects.requireNonNull(oauth2ClientSecret));
            return this;
        }

        public Builder setOauth2ClientSecretSha256(@Nullable Input<String> oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
            return this;
        }

        public Builder setOauth2ClientSecretSha256(@Nullable String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Input.ofNullable(oauth2ClientSecretSha256);
            return this;
        }

        public ApplicationIapArgs build() {
            return new ApplicationIapArgs(enabled, oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
