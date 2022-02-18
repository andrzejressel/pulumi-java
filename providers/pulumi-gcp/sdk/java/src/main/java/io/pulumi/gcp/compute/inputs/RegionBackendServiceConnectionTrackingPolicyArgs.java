// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceConnectionTrackingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConnectionTrackingPolicyArgs Empty = new RegionBackendServiceConnectionTrackingPolicyArgs();

    /**
     * Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
     */
    @InputImport(name="connectionPersistenceOnUnhealthyBackends")
    private final @Nullable Input<String> connectionPersistenceOnUnhealthyBackends;

    public Input<String> getConnectionPersistenceOnUnhealthyBackends() {
        return this.connectionPersistenceOnUnhealthyBackends == null ? Input.empty() : this.connectionPersistenceOnUnhealthyBackends;
    }

    /**
     * Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
     */
    @InputImport(name="idleTimeoutSec")
    private final @Nullable Input<Integer> idleTimeoutSec;

    public Input<Integer> getIdleTimeoutSec() {
        return this.idleTimeoutSec == null ? Input.empty() : this.idleTimeoutSec;
    }

    /**
     * Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
     */
    @InputImport(name="trackingMode")
    private final @Nullable Input<String> trackingMode;

    public Input<String> getTrackingMode() {
        return this.trackingMode == null ? Input.empty() : this.trackingMode;
    }

    public RegionBackendServiceConnectionTrackingPolicyArgs(
        @Nullable Input<String> connectionPersistenceOnUnhealthyBackends,
        @Nullable Input<Integer> idleTimeoutSec,
        @Nullable Input<String> trackingMode) {
        this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
        this.idleTimeoutSec = idleTimeoutSec;
        this.trackingMode = trackingMode;
    }

    private RegionBackendServiceConnectionTrackingPolicyArgs() {
        this.connectionPersistenceOnUnhealthyBackends = Input.empty();
        this.idleTimeoutSec = Input.empty();
        this.trackingMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConnectionTrackingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionPersistenceOnUnhealthyBackends;
        private @Nullable Input<Integer> idleTimeoutSec;
        private @Nullable Input<String> trackingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConnectionTrackingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPersistenceOnUnhealthyBackends = defaults.connectionPersistenceOnUnhealthyBackends;
    	      this.idleTimeoutSec = defaults.idleTimeoutSec;
    	      this.trackingMode = defaults.trackingMode;
        }

        public Builder setConnectionPersistenceOnUnhealthyBackends(@Nullable Input<String> connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }

        public Builder setConnectionPersistenceOnUnhealthyBackends(@Nullable String connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = Input.ofNullable(connectionPersistenceOnUnhealthyBackends);
            return this;
        }

        public Builder setIdleTimeoutSec(@Nullable Input<Integer> idleTimeoutSec) {
            this.idleTimeoutSec = idleTimeoutSec;
            return this;
        }

        public Builder setIdleTimeoutSec(@Nullable Integer idleTimeoutSec) {
            this.idleTimeoutSec = Input.ofNullable(idleTimeoutSec);
            return this;
        }

        public Builder setTrackingMode(@Nullable Input<String> trackingMode) {
            this.trackingMode = trackingMode;
            return this;
        }

        public Builder setTrackingMode(@Nullable String trackingMode) {
            this.trackingMode = Input.ofNullable(trackingMode);
            return this;
        }

        public RegionBackendServiceConnectionTrackingPolicyArgs build() {
            return new RegionBackendServiceConnectionTrackingPolicyArgs(connectionPersistenceOnUnhealthyBackends, idleTimeoutSec, trackingMode);
        }
    }
}
