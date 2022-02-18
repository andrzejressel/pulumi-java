// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Forward SSH Tunnel connectivity.
 * 
 */
public final class ForwardSshTunnelConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ForwardSshTunnelConnectivityArgs Empty = new ForwardSshTunnelConnectivityArgs();

    /**
     * Hostname for the SSH tunnel.
     * 
     */
    @InputImport(name="hostname", required=true)
    private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    /**
     * Input only. SSH password.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * Port for the SSH tunnel, default value is 22.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Input only. SSH private key.
     * 
     */
    @InputImport(name="privateKey")
    private final @Nullable Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey == null ? Input.empty() : this.privateKey;
    }

    /**
     * Username for the SSH tunnel.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public ForwardSshTunnelConnectivityArgs(
        Input<String> hostname,
        @Nullable Input<String> password,
        @Nullable Input<Integer> port,
        @Nullable Input<String> privateKey,
        Input<String> username) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = password;
        this.port = port;
        this.privateKey = privateKey;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ForwardSshTunnelConnectivityArgs() {
        this.hostname = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.privateKey = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardSshTunnelConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostname;
        private @Nullable Input<String> password;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> privateKey;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardSshTunnelConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.privateKey = defaults.privateKey;
    	      this.username = defaults.username;
        }

        public Builder setHostname(Input<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Input.of(Objects.requireNonNull(hostname));
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setPrivateKey(@Nullable Input<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setPrivateKey(@Nullable String privateKey) {
            this.privateKey = Input.ofNullable(privateKey);
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public ForwardSshTunnelConnectivityArgs build() {
            return new ForwardSshTunnelConnectivityArgs(hostname, password, port, privateKey, username);
        }
    }
}
