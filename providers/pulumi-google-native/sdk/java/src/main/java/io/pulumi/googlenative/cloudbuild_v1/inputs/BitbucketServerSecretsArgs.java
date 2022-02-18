// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * BitbucketServerSecrets represents the secrets in Secret Manager for a Bitbucket Server.
 * 
 */
public final class BitbucketServerSecretsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BitbucketServerSecretsArgs Empty = new BitbucketServerSecretsArgs();

    /**
     * The resource name for the admin access token's secret version.
     * 
     */
    @InputImport(name="adminAccessTokenVersionName", required=true)
    private final Input<String> adminAccessTokenVersionName;

    public Input<String> getAdminAccessTokenVersionName() {
        return this.adminAccessTokenVersionName;
    }

    /**
     * The resource name for the read access token's secret version.
     * 
     */
    @InputImport(name="readAccessTokenVersionName", required=true)
    private final Input<String> readAccessTokenVersionName;

    public Input<String> getReadAccessTokenVersionName() {
        return this.readAccessTokenVersionName;
    }

    /**
     * Immutable. The resource name for the webhook secret's secret version. Once this field has been set, it cannot be changed. If you need to change it, please create another BitbucketServerConfig.
     * 
     */
    @InputImport(name="webhookSecretVersionName", required=true)
    private final Input<String> webhookSecretVersionName;

    public Input<String> getWebhookSecretVersionName() {
        return this.webhookSecretVersionName;
    }

    public BitbucketServerSecretsArgs(
        Input<String> adminAccessTokenVersionName,
        Input<String> readAccessTokenVersionName,
        Input<String> webhookSecretVersionName) {
        this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName, "expected parameter 'adminAccessTokenVersionName' to be non-null");
        this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName, "expected parameter 'readAccessTokenVersionName' to be non-null");
        this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName, "expected parameter 'webhookSecretVersionName' to be non-null");
    }

    private BitbucketServerSecretsArgs() {
        this.adminAccessTokenVersionName = Input.empty();
        this.readAccessTokenVersionName = Input.empty();
        this.webhookSecretVersionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BitbucketServerSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> adminAccessTokenVersionName;
        private Input<String> readAccessTokenVersionName;
        private Input<String> webhookSecretVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(BitbucketServerSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminAccessTokenVersionName = defaults.adminAccessTokenVersionName;
    	      this.readAccessTokenVersionName = defaults.readAccessTokenVersionName;
    	      this.webhookSecretVersionName = defaults.webhookSecretVersionName;
        }

        public Builder setAdminAccessTokenVersionName(Input<String> adminAccessTokenVersionName) {
            this.adminAccessTokenVersionName = Objects.requireNonNull(adminAccessTokenVersionName);
            return this;
        }

        public Builder setAdminAccessTokenVersionName(String adminAccessTokenVersionName) {
            this.adminAccessTokenVersionName = Input.of(Objects.requireNonNull(adminAccessTokenVersionName));
            return this;
        }

        public Builder setReadAccessTokenVersionName(Input<String> readAccessTokenVersionName) {
            this.readAccessTokenVersionName = Objects.requireNonNull(readAccessTokenVersionName);
            return this;
        }

        public Builder setReadAccessTokenVersionName(String readAccessTokenVersionName) {
            this.readAccessTokenVersionName = Input.of(Objects.requireNonNull(readAccessTokenVersionName));
            return this;
        }

        public Builder setWebhookSecretVersionName(Input<String> webhookSecretVersionName) {
            this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
            return this;
        }

        public Builder setWebhookSecretVersionName(String webhookSecretVersionName) {
            this.webhookSecretVersionName = Input.of(Objects.requireNonNull(webhookSecretVersionName));
            return this;
        }

        public BitbucketServerSecretsArgs build() {
            return new BitbucketServerSecretsArgs(adminAccessTokenVersionName, readAccessTokenVersionName, webhookSecretVersionName);
        }
    }
}
