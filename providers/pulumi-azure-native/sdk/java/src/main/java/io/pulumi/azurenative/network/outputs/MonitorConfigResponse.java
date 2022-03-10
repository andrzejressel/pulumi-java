// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.MonitorConfigResponseCustomHeaders;
import io.pulumi.azurenative.network.outputs.MonitorConfigResponseExpectedStatusCodeRanges;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MonitorConfigResponse {
    /**
     * List of custom headers.
     * 
     */
    private final @Nullable List<MonitorConfigResponseCustomHeaders> customHeaders;
    /**
     * List of expected status code ranges.
     * 
     */
    private final @Nullable List<MonitorConfigResponseExpectedStatusCodeRanges> expectedStatusCodeRanges;
    /**
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
     */
    private final @Nullable Double intervalInSeconds;
    /**
     * The path relative to the endpoint domain name used to probe for endpoint health.
     * 
     */
    private final @Nullable String path;
    /**
     * The TCP port used to probe for endpoint health.
     * 
     */
    private final @Nullable Double port;
    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * 
     */
    private final @Nullable String profileMonitorStatus;
    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
     */
    private final @Nullable String protocol;
    /**
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
     */
    private final @Nullable Double timeoutInSeconds;
    /**
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
     */
    private final @Nullable Double toleratedNumberOfFailures;

    @OutputCustomType.Constructor
    private MonitorConfigResponse(
        @OutputCustomType.Parameter("customHeaders") @Nullable List<MonitorConfigResponseCustomHeaders> customHeaders,
        @OutputCustomType.Parameter("expectedStatusCodeRanges") @Nullable List<MonitorConfigResponseExpectedStatusCodeRanges> expectedStatusCodeRanges,
        @OutputCustomType.Parameter("intervalInSeconds") @Nullable Double intervalInSeconds,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("port") @Nullable Double port,
        @OutputCustomType.Parameter("profileMonitorStatus") @Nullable String profileMonitorStatus,
        @OutputCustomType.Parameter("protocol") @Nullable String protocol,
        @OutputCustomType.Parameter("timeoutInSeconds") @Nullable Double timeoutInSeconds,
        @OutputCustomType.Parameter("toleratedNumberOfFailures") @Nullable Double toleratedNumberOfFailures) {
        this.customHeaders = customHeaders;
        this.expectedStatusCodeRanges = expectedStatusCodeRanges;
        this.intervalInSeconds = intervalInSeconds;
        this.path = path;
        this.port = port;
        this.profileMonitorStatus = profileMonitorStatus;
        this.protocol = protocol;
        this.timeoutInSeconds = timeoutInSeconds;
        this.toleratedNumberOfFailures = toleratedNumberOfFailures;
    }

    /**
     * List of custom headers.
     * 
    */
    public List<MonitorConfigResponseCustomHeaders> getCustomHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }
    /**
     * List of expected status code ranges.
     * 
    */
    public List<MonitorConfigResponseExpectedStatusCodeRanges> getExpectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges == null ? List.of() : this.expectedStatusCodeRanges;
    }
    /**
     * The monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     * 
    */
    public Optional<Double> getIntervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    /**
     * The path relative to the endpoint domain name used to probe for endpoint health.
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * The TCP port used to probe for endpoint health.
     * 
    */
    public Optional<Double> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * 
    */
    public Optional<String> getProfileMonitorStatus() {
        return Optional.ofNullable(this.profileMonitorStatus);
    }
    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     * 
    */
    public Optional<Double> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }
    /**
     * The number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     * 
    */
    public Optional<Double> getToleratedNumberOfFailures() {
        return Optional.ofNullable(this.toleratedNumberOfFailures);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MonitorConfigResponseCustomHeaders> customHeaders;
        private @Nullable List<MonitorConfigResponseExpectedStatusCodeRanges> expectedStatusCodeRanges;
        private @Nullable Double intervalInSeconds;
        private @Nullable String path;
        private @Nullable Double port;
        private @Nullable String profileMonitorStatus;
        private @Nullable String protocol;
        private @Nullable Double timeoutInSeconds;
        private @Nullable Double toleratedNumberOfFailures;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.expectedStatusCodeRanges = defaults.expectedStatusCodeRanges;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.profileMonitorStatus = defaults.profileMonitorStatus;
    	      this.protocol = defaults.protocol;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.toleratedNumberOfFailures = defaults.toleratedNumberOfFailures;
        }

        public Builder setCustomHeaders(@Nullable List<MonitorConfigResponseCustomHeaders> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setExpectedStatusCodeRanges(@Nullable List<MonitorConfigResponseExpectedStatusCodeRanges> expectedStatusCodeRanges) {
            this.expectedStatusCodeRanges = expectedStatusCodeRanges;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Double intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPort(@Nullable Double port) {
            this.port = port;
            return this;
        }

        public Builder setProfileMonitorStatus(@Nullable String profileMonitorStatus) {
            this.profileMonitorStatus = profileMonitorStatus;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Double timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder setToleratedNumberOfFailures(@Nullable Double toleratedNumberOfFailures) {
            this.toleratedNumberOfFailures = toleratedNumberOfFailures;
            return this;
        }
        public MonitorConfigResponse build() {
            return new MonitorConfigResponse(customHeaders, expectedStatusCodeRanges, intervalInSeconds, path, port, profileMonitorStatus, protocol, timeoutInSeconds, toleratedNumberOfFailures);
        }
    }
}
