// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * 
 */
public final class LivenessCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final LivenessCheckArgs Empty = new LivenessCheckArgs();

    /**
     * Interval between health checks.
     * 
     */
    @InputImport(name="checkInterval")
    private final @Nullable Input<String> checkInterval;

    public Input<String> getCheckInterval() {
        return this.checkInterval == null ? Input.empty() : this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    @InputImport(name="failureThreshold")
    private final @Nullable Input<Integer> failureThreshold;

    public Input<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Input.empty() : this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    @InputImport(name="initialDelay")
    private final @Nullable Input<String> initialDelay;

    public Input<String> getInitialDelay() {
        return this.initialDelay == null ? Input.empty() : this.initialDelay;
    }

    /**
     * The request path.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    @InputImport(name="successThreshold")
    private final @Nullable Input<Integer> successThreshold;

    public Input<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Input.empty() : this.successThreshold;
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public LivenessCheckArgs(
        @Nullable Input<String> checkInterval,
        @Nullable Input<Integer> failureThreshold,
        @Nullable Input<String> host,
        @Nullable Input<String> initialDelay,
        @Nullable Input<String> path,
        @Nullable Input<Integer> successThreshold,
        @Nullable Input<String> timeout) {
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.initialDelay = initialDelay;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    private LivenessCheckArgs() {
        this.checkInterval = Input.empty();
        this.failureThreshold = Input.empty();
        this.host = Input.empty();
        this.initialDelay = Input.empty();
        this.path = Input.empty();
        this.successThreshold = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LivenessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> checkInterval;
        private @Nullable Input<Integer> failureThreshold;
        private @Nullable Input<String> host;
        private @Nullable Input<String> initialDelay;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> successThreshold;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LivenessCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckInterval(@Nullable Input<String> checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder setCheckInterval(@Nullable String checkInterval) {
            this.checkInterval = Input.ofNullable(checkInterval);
            return this;
        }

        public Builder setFailureThreshold(@Nullable Input<Integer> failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = Input.ofNullable(failureThreshold);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setInitialDelay(@Nullable Input<String> initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }

        public Builder setInitialDelay(@Nullable String initialDelay) {
            this.initialDelay = Input.ofNullable(initialDelay);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Input<Integer> successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = Input.ofNullable(successThreshold);
            return this;
        }

        public Builder setTimeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public LivenessCheckArgs build() {
            return new LivenessCheckArgs(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
