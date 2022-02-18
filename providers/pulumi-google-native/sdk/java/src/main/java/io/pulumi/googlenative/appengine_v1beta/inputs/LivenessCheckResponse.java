// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * 
 */
public final class LivenessCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final LivenessCheckResponse Empty = new LivenessCheckResponse();

    /**
     * Interval between health checks.
     * 
     */
    @InputImport(name="checkInterval", required=true)
    private final String checkInterval;

    public String getCheckInterval() {
        return this.checkInterval;
    }

    /**
     * Number of consecutive failed checks required before considering the VM unhealthy.
     * 
     */
    @InputImport(name="failureThreshold", required=true)
    private final Integer failureThreshold;

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
     * 
     */
    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * The initial delay before starting to execute the checks.
     * 
     */
    @InputImport(name="initialDelay", required=true)
    private final String initialDelay;

    public String getInitialDelay() {
        return this.initialDelay;
    }

    /**
     * The request path.
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy.
     * 
     */
    @InputImport(name="successThreshold", required=true)
    private final Integer successThreshold;

    public Integer getSuccessThreshold() {
        return this.successThreshold;
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @InputImport(name="timeout", required=true)
    private final String timeout;

    public String getTimeout() {
        return this.timeout;
    }

    public LivenessCheckResponse(
        String checkInterval,
        Integer failureThreshold,
        String host,
        String initialDelay,
        String path,
        Integer successThreshold,
        String timeout) {
        this.checkInterval = Objects.requireNonNull(checkInterval, "expected parameter 'checkInterval' to be non-null");
        this.failureThreshold = Objects.requireNonNull(failureThreshold, "expected parameter 'failureThreshold' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.initialDelay = Objects.requireNonNull(initialDelay, "expected parameter 'initialDelay' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.successThreshold = Objects.requireNonNull(successThreshold, "expected parameter 'successThreshold' to be non-null");
        this.timeout = Objects.requireNonNull(timeout, "expected parameter 'timeout' to be non-null");
    }

    private LivenessCheckResponse() {
        this.checkInterval = null;
        this.failureThreshold = null;
        this.host = null;
        this.initialDelay = null;
        this.path = null;
        this.successThreshold = null;
        this.timeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LivenessCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checkInterval;
        private Integer failureThreshold;
        private String host;
        private String initialDelay;
        private String path;
        private Integer successThreshold;
        private String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(LivenessCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckInterval(String checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }

        public Builder setFailureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setInitialDelay(String initialDelay) {
            this.initialDelay = Objects.requireNonNull(initialDelay);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setSuccessThreshold(Integer successThreshold) {
            this.successThreshold = Objects.requireNonNull(successThreshold);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public LivenessCheckResponse build() {
            return new LivenessCheckResponse(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
