// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionLivenessCheck {
    /**
     * Interval between health checks.
     * 
     */
    private final @Nullable String checkInterval;
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    private final @Nullable Double failureThreshold;
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    private final @Nullable String host;
    /**
     * The initial delay before starting to execute the checks. Default: "300s"
     * 
     */
    private final @Nullable String initialDelay;
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    private final @Nullable Double successThreshold;
    /**
     * Time before the check is considered failed. Default: "4s"
     * 
     */
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"checkInterval","failureThreshold","host","initialDelay","path","successThreshold","timeout"})
    private FlexibleAppVersionLivenessCheck(
        @Nullable String checkInterval,
        @Nullable Double failureThreshold,
        @Nullable String host,
        @Nullable String initialDelay,
        String path,
        @Nullable Double successThreshold,
        @Nullable String timeout) {
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.initialDelay = initialDelay;
        this.path = Objects.requireNonNull(path);
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * Interval between health checks.
     * 
     */
    public Optional<String> getCheckInterval() {
        return Optional.ofNullable(this.checkInterval);
    }
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    public Optional<Double> getFailureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
     * 
     */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    /**
     * The initial delay before starting to execute the checks. Default: "300s"
     * 
     */
    public Optional<String> getInitialDelay() {
        return Optional.ofNullable(this.initialDelay);
    }
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    public Optional<Double> getSuccessThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * Time before the check is considered failed. Default: "4s"
     * 
     */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionLivenessCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String checkInterval;
        private @Nullable Double failureThreshold;
        private @Nullable String host;
        private @Nullable String initialDelay;
        private String path;
        private @Nullable Double successThreshold;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionLivenessCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder setCheckInterval(@Nullable String checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }

        public Builder setFailureThreshold(@Nullable Double failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setInitialDelay(@Nullable String initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Double successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public FlexibleAppVersionLivenessCheck build() {
            return new FlexibleAppVersionLivenessCheck(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
