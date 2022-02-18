// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * SecretEnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class GoogleCloudRunOpV2SecretKeySelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2SecretKeySelectorResponse Empty = new GoogleCloudRunOpV2SecretKeySelectorResponse();

    /**
     * The name of the secret in Cloud Secret Manager. Format: {secret_name} if the secret is in the same project. projects/{project}/secrets/{secret_name} if the secret is in a different project.
     * 
     */
    @InputImport(name="secret", required=true)
    private final String secret;

    public String getSecret() {
        return this.secret;
    }

    /**
     * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public GoogleCloudRunOpV2SecretKeySelectorResponse(
        String secret,
        String version) {
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GoogleCloudRunOpV2SecretKeySelectorResponse() {
        this.secret = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2SecretKeySelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secret;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2SecretKeySelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GoogleCloudRunOpV2SecretKeySelectorResponse build() {
            return new GoogleCloudRunOpV2SecretKeySelectorResponse(secret, version);
        }
    }
}
