// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Secret provides a reference to entries in Secret Manager.
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The resource name of the secret version in the format, format as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    @InputImport(name="secretVersion")
    private final @Nullable Input<String> secretVersion;

    public Input<String> getSecretVersion() {
        return this.secretVersion == null ? Input.empty() : this.secretVersion;
    }

    public SecretArgs(@Nullable Input<String> secretVersion) {
        this.secretVersion = secretVersion;
    }

    private SecretArgs() {
        this.secretVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder setSecretVersion(@Nullable Input<String> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setSecretVersion(@Nullable String secretVersion) {
            this.secretVersion = Input.ofNullable(secretVersion);
            return this;
        }

        public SecretArgs build() {
            return new SecretArgs(secretVersion);
        }
    }
}
