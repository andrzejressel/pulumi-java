// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRegistryCredentialResponse {
    /**
     * The password for the private registry.
     * 
     */
    private final @Nullable String password;
    /**
     * The Docker image registry server without a protocol such as "http" and "https".
     * 
     */
    private final String server;
    /**
     * The username for the private registry.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor
    private ImageRegistryCredentialResponse(
        @OutputCustomType.Parameter("password") @Nullable String password,
        @OutputCustomType.Parameter("server") String server,
        @OutputCustomType.Parameter("username") String username) {
        this.password = password;
        this.server = server;
        this.username = username;
    }

    /**
     * The password for the private registry.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The Docker image registry server without a protocol such as "http" and "https".
     * 
    */
    public String getServer() {
        return this.server;
    }
    /**
     * The username for the private registry.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRegistryCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String server;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRegistryCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.server = defaults.server;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setServer(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ImageRegistryCredentialResponse build() {
            return new ImageRegistryCredentialResponse(password, server, username);
        }
    }
}
