// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service.
 * 
 */
public final class OutlierDetectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutlierDetectionArgs Empty = new OutlierDetectionArgs();

    /**
     * The base time that a host is ejected for. The real ejection time is equal to the base ejection time multiplied by the number of times the host has been ejected. Defaults to 30000ms or 30s.
     * 
     */
    @InputImport(name="baseEjectionTime")
    private final @Nullable Input<DurationArgs> baseEjectionTime;

    public Input<DurationArgs> getBaseEjectionTime() {
        return this.baseEjectionTime == null ? Input.empty() : this.baseEjectionTime;
    }

    /**
     * Number of errors before a host is ejected from the connection pool. When the backend host is accessed over HTTP, a 5xx return code qualifies as an error. Defaults to 5.
     * 
     */
    @InputImport(name="consecutiveErrors")
    private final @Nullable Input<Integer> consecutiveErrors;

    public Input<Integer> getConsecutiveErrors() {
        return this.consecutiveErrors == null ? Input.empty() : this.consecutiveErrors;
    }

    /**
     * The number of consecutive gateway failures (502, 503, 504 status or connection errors that are mapped to one of those status codes) before a consecutive gateway failure ejection occurs. Defaults to 3.
     * 
     */
    @InputImport(name="consecutiveGatewayFailure")
    private final @Nullable Input<Integer> consecutiveGatewayFailure;

    public Input<Integer> getConsecutiveGatewayFailure() {
        return this.consecutiveGatewayFailure == null ? Input.empty() : this.consecutiveGatewayFailure;
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive 5xx. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 0.
     * 
     */
    @InputImport(name="enforcingConsecutiveErrors")
    private final @Nullable Input<Integer> enforcingConsecutiveErrors;

    public Input<Integer> getEnforcingConsecutiveErrors() {
        return this.enforcingConsecutiveErrors == null ? Input.empty() : this.enforcingConsecutiveErrors;
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through consecutive gateway failures. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @InputImport(name="enforcingConsecutiveGatewayFailure")
    private final @Nullable Input<Integer> enforcingConsecutiveGatewayFailure;

    public Input<Integer> getEnforcingConsecutiveGatewayFailure() {
        return this.enforcingConsecutiveGatewayFailure == null ? Input.empty() : this.enforcingConsecutiveGatewayFailure;
    }

    /**
     * The percentage chance that a host will be actually ejected when an outlier status is detected through success rate statistics. This setting can be used to disable ejection or to ramp it up slowly. Defaults to 100.
     * 
     */
    @InputImport(name="enforcingSuccessRate")
    private final @Nullable Input<Integer> enforcingSuccessRate;

    public Input<Integer> getEnforcingSuccessRate() {
        return this.enforcingSuccessRate == null ? Input.empty() : this.enforcingSuccessRate;
    }

    /**
     * Time interval between ejection analysis sweeps. This can result in both new ejections as well as hosts being returned to service. Defaults to 1 second.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<DurationArgs> interval;

    public Input<DurationArgs> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * Maximum percentage of hosts in the load balancing pool for the backend service that can be ejected. Defaults to 50%.
     * 
     */
    @InputImport(name="maxEjectionPercent")
    private final @Nullable Input<Integer> maxEjectionPercent;

    public Input<Integer> getMaxEjectionPercent() {
        return this.maxEjectionPercent == null ? Input.empty() : this.maxEjectionPercent;
    }

    /**
     * The number of hosts in a cluster that must have enough request volume to detect success rate outliers. If the number of hosts is less than this setting, outlier detection via success rate statistics is not performed for any host in the cluster. Defaults to 5.
     * 
     */
    @InputImport(name="successRateMinimumHosts")
    private final @Nullable Input<Integer> successRateMinimumHosts;

    public Input<Integer> getSuccessRateMinimumHosts() {
        return this.successRateMinimumHosts == null ? Input.empty() : this.successRateMinimumHosts;
    }

    /**
     * The minimum number of total requests that must be collected in one interval (as defined by the interval duration above) to include this host in success rate based outlier detection. If the volume is lower than this setting, outlier detection via success rate statistics is not performed for that host. Defaults to 100.
     * 
     */
    @InputImport(name="successRateRequestVolume")
    private final @Nullable Input<Integer> successRateRequestVolume;

    public Input<Integer> getSuccessRateRequestVolume() {
        return this.successRateRequestVolume == null ? Input.empty() : this.successRateRequestVolume;
    }

    /**
     * This factor is used to determine the ejection threshold for success rate outlier ejection. The ejection threshold is the difference between the mean success rate, and the product of this factor and the standard deviation of the mean success rate: mean - (stdev * success_rate_stdev_factor). This factor is divided by a thousand to get a double. That is, if the desired factor is 1.9, the runtime value should be 1900. Defaults to 1900.
     * 
     */
    @InputImport(name="successRateStdevFactor")
    private final @Nullable Input<Integer> successRateStdevFactor;

    public Input<Integer> getSuccessRateStdevFactor() {
        return this.successRateStdevFactor == null ? Input.empty() : this.successRateStdevFactor;
    }

    public OutlierDetectionArgs(
        @Nullable Input<DurationArgs> baseEjectionTime,
        @Nullable Input<Integer> consecutiveErrors,
        @Nullable Input<Integer> consecutiveGatewayFailure,
        @Nullable Input<Integer> enforcingConsecutiveErrors,
        @Nullable Input<Integer> enforcingConsecutiveGatewayFailure,
        @Nullable Input<Integer> enforcingSuccessRate,
        @Nullable Input<DurationArgs> interval,
        @Nullable Input<Integer> maxEjectionPercent,
        @Nullable Input<Integer> successRateMinimumHosts,
        @Nullable Input<Integer> successRateRequestVolume,
        @Nullable Input<Integer> successRateStdevFactor) {
        this.baseEjectionTime = baseEjectionTime;
        this.consecutiveErrors = consecutiveErrors;
        this.consecutiveGatewayFailure = consecutiveGatewayFailure;
        this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
        this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
        this.enforcingSuccessRate = enforcingSuccessRate;
        this.interval = interval;
        this.maxEjectionPercent = maxEjectionPercent;
        this.successRateMinimumHosts = successRateMinimumHosts;
        this.successRateRequestVolume = successRateRequestVolume;
        this.successRateStdevFactor = successRateStdevFactor;
    }

    private OutlierDetectionArgs() {
        this.baseEjectionTime = Input.empty();
        this.consecutiveErrors = Input.empty();
        this.consecutiveGatewayFailure = Input.empty();
        this.enforcingConsecutiveErrors = Input.empty();
        this.enforcingConsecutiveGatewayFailure = Input.empty();
        this.enforcingSuccessRate = Input.empty();
        this.interval = Input.empty();
        this.maxEjectionPercent = Input.empty();
        this.successRateMinimumHosts = Input.empty();
        this.successRateRequestVolume = Input.empty();
        this.successRateStdevFactor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutlierDetectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DurationArgs> baseEjectionTime;
        private @Nullable Input<Integer> consecutiveErrors;
        private @Nullable Input<Integer> consecutiveGatewayFailure;
        private @Nullable Input<Integer> enforcingConsecutiveErrors;
        private @Nullable Input<Integer> enforcingConsecutiveGatewayFailure;
        private @Nullable Input<Integer> enforcingSuccessRate;
        private @Nullable Input<DurationArgs> interval;
        private @Nullable Input<Integer> maxEjectionPercent;
        private @Nullable Input<Integer> successRateMinimumHosts;
        private @Nullable Input<Integer> successRateRequestVolume;
        private @Nullable Input<Integer> successRateStdevFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(OutlierDetectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionTime = defaults.baseEjectionTime;
    	      this.consecutiveErrors = defaults.consecutiveErrors;
    	      this.consecutiveGatewayFailure = defaults.consecutiveGatewayFailure;
    	      this.enforcingConsecutiveErrors = defaults.enforcingConsecutiveErrors;
    	      this.enforcingConsecutiveGatewayFailure = defaults.enforcingConsecutiveGatewayFailure;
    	      this.enforcingSuccessRate = defaults.enforcingSuccessRate;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.successRateMinimumHosts = defaults.successRateMinimumHosts;
    	      this.successRateRequestVolume = defaults.successRateRequestVolume;
    	      this.successRateStdevFactor = defaults.successRateStdevFactor;
        }

        public Builder setBaseEjectionTime(@Nullable Input<DurationArgs> baseEjectionTime) {
            this.baseEjectionTime = baseEjectionTime;
            return this;
        }

        public Builder setBaseEjectionTime(@Nullable DurationArgs baseEjectionTime) {
            this.baseEjectionTime = Input.ofNullable(baseEjectionTime);
            return this;
        }

        public Builder setConsecutiveErrors(@Nullable Input<Integer> consecutiveErrors) {
            this.consecutiveErrors = consecutiveErrors;
            return this;
        }

        public Builder setConsecutiveErrors(@Nullable Integer consecutiveErrors) {
            this.consecutiveErrors = Input.ofNullable(consecutiveErrors);
            return this;
        }

        public Builder setConsecutiveGatewayFailure(@Nullable Input<Integer> consecutiveGatewayFailure) {
            this.consecutiveGatewayFailure = consecutiveGatewayFailure;
            return this;
        }

        public Builder setConsecutiveGatewayFailure(@Nullable Integer consecutiveGatewayFailure) {
            this.consecutiveGatewayFailure = Input.ofNullable(consecutiveGatewayFailure);
            return this;
        }

        public Builder setEnforcingConsecutiveErrors(@Nullable Input<Integer> enforcingConsecutiveErrors) {
            this.enforcingConsecutiveErrors = enforcingConsecutiveErrors;
            return this;
        }

        public Builder setEnforcingConsecutiveErrors(@Nullable Integer enforcingConsecutiveErrors) {
            this.enforcingConsecutiveErrors = Input.ofNullable(enforcingConsecutiveErrors);
            return this;
        }

        public Builder setEnforcingConsecutiveGatewayFailure(@Nullable Input<Integer> enforcingConsecutiveGatewayFailure) {
            this.enforcingConsecutiveGatewayFailure = enforcingConsecutiveGatewayFailure;
            return this;
        }

        public Builder setEnforcingConsecutiveGatewayFailure(@Nullable Integer enforcingConsecutiveGatewayFailure) {
            this.enforcingConsecutiveGatewayFailure = Input.ofNullable(enforcingConsecutiveGatewayFailure);
            return this;
        }

        public Builder setEnforcingSuccessRate(@Nullable Input<Integer> enforcingSuccessRate) {
            this.enforcingSuccessRate = enforcingSuccessRate;
            return this;
        }

        public Builder setEnforcingSuccessRate(@Nullable Integer enforcingSuccessRate) {
            this.enforcingSuccessRate = Input.ofNullable(enforcingSuccessRate);
            return this;
        }

        public Builder setInterval(@Nullable Input<DurationArgs> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable DurationArgs interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setMaxEjectionPercent(@Nullable Input<Integer> maxEjectionPercent) {
            this.maxEjectionPercent = maxEjectionPercent;
            return this;
        }

        public Builder setMaxEjectionPercent(@Nullable Integer maxEjectionPercent) {
            this.maxEjectionPercent = Input.ofNullable(maxEjectionPercent);
            return this;
        }

        public Builder setSuccessRateMinimumHosts(@Nullable Input<Integer> successRateMinimumHosts) {
            this.successRateMinimumHosts = successRateMinimumHosts;
            return this;
        }

        public Builder setSuccessRateMinimumHosts(@Nullable Integer successRateMinimumHosts) {
            this.successRateMinimumHosts = Input.ofNullable(successRateMinimumHosts);
            return this;
        }

        public Builder setSuccessRateRequestVolume(@Nullable Input<Integer> successRateRequestVolume) {
            this.successRateRequestVolume = successRateRequestVolume;
            return this;
        }

        public Builder setSuccessRateRequestVolume(@Nullable Integer successRateRequestVolume) {
            this.successRateRequestVolume = Input.ofNullable(successRateRequestVolume);
            return this;
        }

        public Builder setSuccessRateStdevFactor(@Nullable Input<Integer> successRateStdevFactor) {
            this.successRateStdevFactor = successRateStdevFactor;
            return this;
        }

        public Builder setSuccessRateStdevFactor(@Nullable Integer successRateStdevFactor) {
            this.successRateStdevFactor = Input.ofNullable(successRateStdevFactor);
            return this;
        }

        public OutlierDetectionArgs build() {
            return new OutlierDetectionArgs(baseEjectionTime, consecutiveErrors, consecutiveGatewayFailure, enforcingConsecutiveErrors, enforcingConsecutiveGatewayFailure, enforcingSuccessRate, interval, maxEjectionPercent, successRateMinimumHosts, successRateRequestVolume, successRateStdevFactor);
        }
    }
}
