// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutoShutdownProfileResponse {
    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
     */
    private final @Nullable String disconnectDelay;
    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
     */
    private final @Nullable String idleDelay;
    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
     */
    private final @Nullable String noConnectDelay;
    /**
     * Whether shutdown on disconnect is enabled
     * 
     */
    private final @Nullable String shutdownOnDisconnect;
    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
     */
    private final @Nullable String shutdownOnIdle;
    /**
     * Whether a VM will get shutdown when it hasn't been connected to after a period of time.
     * 
     */
    private final @Nullable String shutdownWhenNotConnected;

    @OutputCustomType.Constructor
    private AutoShutdownProfileResponse(
        @OutputCustomType.Parameter("disconnectDelay") @Nullable String disconnectDelay,
        @OutputCustomType.Parameter("idleDelay") @Nullable String idleDelay,
        @OutputCustomType.Parameter("noConnectDelay") @Nullable String noConnectDelay,
        @OutputCustomType.Parameter("shutdownOnDisconnect") @Nullable String shutdownOnDisconnect,
        @OutputCustomType.Parameter("shutdownOnIdle") @Nullable String shutdownOnIdle,
        @OutputCustomType.Parameter("shutdownWhenNotConnected") @Nullable String shutdownWhenNotConnected) {
        this.disconnectDelay = disconnectDelay;
        this.idleDelay = idleDelay;
        this.noConnectDelay = noConnectDelay;
        this.shutdownOnDisconnect = shutdownOnDisconnect;
        this.shutdownOnIdle = shutdownOnIdle;
        this.shutdownWhenNotConnected = shutdownWhenNotConnected;
    }

    /**
     * The amount of time a VM will stay running after a user disconnects if this behavior is enabled.
     * 
    */
    public Optional<String> getDisconnectDelay() {
        return Optional.ofNullable(this.disconnectDelay);
    }
    /**
     * The amount of time a VM will idle before it is shutdown if this behavior is enabled.
     * 
    */
    public Optional<String> getIdleDelay() {
        return Optional.ofNullable(this.idleDelay);
    }
    /**
     * The amount of time a VM will stay running before it is shutdown if no connection is made and this behavior is enabled.
     * 
    */
    public Optional<String> getNoConnectDelay() {
        return Optional.ofNullable(this.noConnectDelay);
    }
    /**
     * Whether shutdown on disconnect is enabled
     * 
    */
    public Optional<String> getShutdownOnDisconnect() {
        return Optional.ofNullable(this.shutdownOnDisconnect);
    }
    /**
     * Whether a VM will get shutdown when it has idled for a period of time.
     * 
    */
    public Optional<String> getShutdownOnIdle() {
        return Optional.ofNullable(this.shutdownOnIdle);
    }
    /**
     * Whether a VM will get shutdown when it hasn't been connected to after a period of time.
     * 
    */
    public Optional<String> getShutdownWhenNotConnected() {
        return Optional.ofNullable(this.shutdownWhenNotConnected);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoShutdownProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String disconnectDelay;
        private @Nullable String idleDelay;
        private @Nullable String noConnectDelay;
        private @Nullable String shutdownOnDisconnect;
        private @Nullable String shutdownOnIdle;
        private @Nullable String shutdownWhenNotConnected;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoShutdownProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disconnectDelay = defaults.disconnectDelay;
    	      this.idleDelay = defaults.idleDelay;
    	      this.noConnectDelay = defaults.noConnectDelay;
    	      this.shutdownOnDisconnect = defaults.shutdownOnDisconnect;
    	      this.shutdownOnIdle = defaults.shutdownOnIdle;
    	      this.shutdownWhenNotConnected = defaults.shutdownWhenNotConnected;
        }

        public Builder setDisconnectDelay(@Nullable String disconnectDelay) {
            this.disconnectDelay = disconnectDelay;
            return this;
        }

        public Builder setIdleDelay(@Nullable String idleDelay) {
            this.idleDelay = idleDelay;
            return this;
        }

        public Builder setNoConnectDelay(@Nullable String noConnectDelay) {
            this.noConnectDelay = noConnectDelay;
            return this;
        }

        public Builder setShutdownOnDisconnect(@Nullable String shutdownOnDisconnect) {
            this.shutdownOnDisconnect = shutdownOnDisconnect;
            return this;
        }

        public Builder setShutdownOnIdle(@Nullable String shutdownOnIdle) {
            this.shutdownOnIdle = shutdownOnIdle;
            return this;
        }

        public Builder setShutdownWhenNotConnected(@Nullable String shutdownWhenNotConnected) {
            this.shutdownWhenNotConnected = shutdownWhenNotConnected;
            return this;
        }
        public AutoShutdownProfileResponse build() {
            return new AutoShutdownProfileResponse(disconnectDelay, idleDelay, noConnectDelay, shutdownOnDisconnect, shutdownOnIdle, shutdownWhenNotConnected);
        }
    }
}
