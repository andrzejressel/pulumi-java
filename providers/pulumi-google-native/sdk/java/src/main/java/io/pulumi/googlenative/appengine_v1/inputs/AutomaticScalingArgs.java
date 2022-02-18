// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.CpuUtilizationArgs;
import io.pulumi.googlenative.appengine_v1.inputs.DiskUtilizationArgs;
import io.pulumi.googlenative.appengine_v1.inputs.NetworkUtilizationArgs;
import io.pulumi.googlenative.appengine_v1.inputs.RequestUtilizationArgs;
import io.pulumi.googlenative.appengine_v1.inputs.StandardSchedulerSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * 
 */
public final class AutomaticScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomaticScalingArgs Empty = new AutomaticScalingArgs();

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    @InputImport(name="coolDownPeriod")
    private final @Nullable Input<String> coolDownPeriod;

    public Input<String> getCoolDownPeriod() {
        return this.coolDownPeriod == null ? Input.empty() : this.coolDownPeriod;
    }

    /**
     * Target scaling by CPU usage.
     * 
     */
    @InputImport(name="cpuUtilization")
    private final @Nullable Input<CpuUtilizationArgs> cpuUtilization;

    public Input<CpuUtilizationArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Input.empty() : this.cpuUtilization;
    }

    /**
     * Target scaling by disk usage.
     * 
     */
    @InputImport(name="diskUtilization")
    private final @Nullable Input<DiskUtilizationArgs> diskUtilization;

    public Input<DiskUtilizationArgs> getDiskUtilization() {
        return this.diskUtilization == null ? Input.empty() : this.diskUtilization;
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    @InputImport(name="maxConcurrentRequests")
    private final @Nullable Input<Integer> maxConcurrentRequests;

    public Input<Integer> getMaxConcurrentRequests() {
        return this.maxConcurrentRequests == null ? Input.empty() : this.maxConcurrentRequests;
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @InputImport(name="maxIdleInstances")
    private final @Nullable Input<Integer> maxIdleInstances;

    public Input<Integer> getMaxIdleInstances() {
        return this.maxIdleInstances == null ? Input.empty() : this.maxIdleInstances;
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="maxPendingLatency")
    private final @Nullable Input<String> maxPendingLatency;

    public Input<String> getMaxPendingLatency() {
        return this.maxPendingLatency == null ? Input.empty() : this.maxPendingLatency;
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    @InputImport(name="maxTotalInstances")
    private final @Nullable Input<Integer> maxTotalInstances;

    public Input<Integer> getMaxTotalInstances() {
        return this.maxTotalInstances == null ? Input.empty() : this.maxTotalInstances;
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @InputImport(name="minIdleInstances")
    private final @Nullable Input<Integer> minIdleInstances;

    public Input<Integer> getMinIdleInstances() {
        return this.minIdleInstances == null ? Input.empty() : this.minIdleInstances;
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="minPendingLatency")
    private final @Nullable Input<String> minPendingLatency;

    public Input<String> getMinPendingLatency() {
        return this.minPendingLatency == null ? Input.empty() : this.minPendingLatency;
    }

    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    @InputImport(name="minTotalInstances")
    private final @Nullable Input<Integer> minTotalInstances;

    public Input<Integer> getMinTotalInstances() {
        return this.minTotalInstances == null ? Input.empty() : this.minTotalInstances;
    }

    /**
     * Target scaling by network usage.
     * 
     */
    @InputImport(name="networkUtilization")
    private final @Nullable Input<NetworkUtilizationArgs> networkUtilization;

    public Input<NetworkUtilizationArgs> getNetworkUtilization() {
        return this.networkUtilization == null ? Input.empty() : this.networkUtilization;
    }

    /**
     * Target scaling by request utilization.
     * 
     */
    @InputImport(name="requestUtilization")
    private final @Nullable Input<RequestUtilizationArgs> requestUtilization;

    public Input<RequestUtilizationArgs> getRequestUtilization() {
        return this.requestUtilization == null ? Input.empty() : this.requestUtilization;
    }

    /**
     * Scheduler settings for standard environment.
     * 
     */
    @InputImport(name="standardSchedulerSettings")
    private final @Nullable Input<StandardSchedulerSettingsArgs> standardSchedulerSettings;

    public Input<StandardSchedulerSettingsArgs> getStandardSchedulerSettings() {
        return this.standardSchedulerSettings == null ? Input.empty() : this.standardSchedulerSettings;
    }

    public AutomaticScalingArgs(
        @Nullable Input<String> coolDownPeriod,
        @Nullable Input<CpuUtilizationArgs> cpuUtilization,
        @Nullable Input<DiskUtilizationArgs> diskUtilization,
        @Nullable Input<Integer> maxConcurrentRequests,
        @Nullable Input<Integer> maxIdleInstances,
        @Nullable Input<String> maxPendingLatency,
        @Nullable Input<Integer> maxTotalInstances,
        @Nullable Input<Integer> minIdleInstances,
        @Nullable Input<String> minPendingLatency,
        @Nullable Input<Integer> minTotalInstances,
        @Nullable Input<NetworkUtilizationArgs> networkUtilization,
        @Nullable Input<RequestUtilizationArgs> requestUtilization,
        @Nullable Input<StandardSchedulerSettingsArgs> standardSchedulerSettings) {
        this.coolDownPeriod = coolDownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.diskUtilization = diskUtilization;
        this.maxConcurrentRequests = maxConcurrentRequests;
        this.maxIdleInstances = maxIdleInstances;
        this.maxPendingLatency = maxPendingLatency;
        this.maxTotalInstances = maxTotalInstances;
        this.minIdleInstances = minIdleInstances;
        this.minPendingLatency = minPendingLatency;
        this.minTotalInstances = minTotalInstances;
        this.networkUtilization = networkUtilization;
        this.requestUtilization = requestUtilization;
        this.standardSchedulerSettings = standardSchedulerSettings;
    }

    private AutomaticScalingArgs() {
        this.coolDownPeriod = Input.empty();
        this.cpuUtilization = Input.empty();
        this.diskUtilization = Input.empty();
        this.maxConcurrentRequests = Input.empty();
        this.maxIdleInstances = Input.empty();
        this.maxPendingLatency = Input.empty();
        this.maxTotalInstances = Input.empty();
        this.minIdleInstances = Input.empty();
        this.minPendingLatency = Input.empty();
        this.minTotalInstances = Input.empty();
        this.networkUtilization = Input.empty();
        this.requestUtilization = Input.empty();
        this.standardSchedulerSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> coolDownPeriod;
        private @Nullable Input<CpuUtilizationArgs> cpuUtilization;
        private @Nullable Input<DiskUtilizationArgs> diskUtilization;
        private @Nullable Input<Integer> maxConcurrentRequests;
        private @Nullable Input<Integer> maxIdleInstances;
        private @Nullable Input<String> maxPendingLatency;
        private @Nullable Input<Integer> maxTotalInstances;
        private @Nullable Input<Integer> minIdleInstances;
        private @Nullable Input<String> minPendingLatency;
        private @Nullable Input<Integer> minTotalInstances;
        private @Nullable Input<NetworkUtilizationArgs> networkUtilization;
        private @Nullable Input<RequestUtilizationArgs> requestUtilization;
        private @Nullable Input<StandardSchedulerSettingsArgs> standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriod = defaults.coolDownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.diskUtilization = defaults.diskUtilization;
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.maxTotalInstances = defaults.maxTotalInstances;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.minTotalInstances = defaults.minTotalInstances;
    	      this.networkUtilization = defaults.networkUtilization;
    	      this.requestUtilization = defaults.requestUtilization;
    	      this.standardSchedulerSettings = defaults.standardSchedulerSettings;
        }

        public Builder setCoolDownPeriod(@Nullable Input<String> coolDownPeriod) {
            this.coolDownPeriod = coolDownPeriod;
            return this;
        }

        public Builder setCoolDownPeriod(@Nullable String coolDownPeriod) {
            this.coolDownPeriod = Input.ofNullable(coolDownPeriod);
            return this;
        }

        public Builder setCpuUtilization(@Nullable Input<CpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder setCpuUtilization(@Nullable CpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Input.ofNullable(cpuUtilization);
            return this;
        }

        public Builder setDiskUtilization(@Nullable Input<DiskUtilizationArgs> diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }

        public Builder setDiskUtilization(@Nullable DiskUtilizationArgs diskUtilization) {
            this.diskUtilization = Input.ofNullable(diskUtilization);
            return this;
        }

        public Builder setMaxConcurrentRequests(@Nullable Input<Integer> maxConcurrentRequests) {
            this.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        public Builder setMaxConcurrentRequests(@Nullable Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = Input.ofNullable(maxConcurrentRequests);
            return this;
        }

        public Builder setMaxIdleInstances(@Nullable Input<Integer> maxIdleInstances) {
            this.maxIdleInstances = maxIdleInstances;
            return this;
        }

        public Builder setMaxIdleInstances(@Nullable Integer maxIdleInstances) {
            this.maxIdleInstances = Input.ofNullable(maxIdleInstances);
            return this;
        }

        public Builder setMaxPendingLatency(@Nullable Input<String> maxPendingLatency) {
            this.maxPendingLatency = maxPendingLatency;
            return this;
        }

        public Builder setMaxPendingLatency(@Nullable String maxPendingLatency) {
            this.maxPendingLatency = Input.ofNullable(maxPendingLatency);
            return this;
        }

        public Builder setMaxTotalInstances(@Nullable Input<Integer> maxTotalInstances) {
            this.maxTotalInstances = maxTotalInstances;
            return this;
        }

        public Builder setMaxTotalInstances(@Nullable Integer maxTotalInstances) {
            this.maxTotalInstances = Input.ofNullable(maxTotalInstances);
            return this;
        }

        public Builder setMinIdleInstances(@Nullable Input<Integer> minIdleInstances) {
            this.minIdleInstances = minIdleInstances;
            return this;
        }

        public Builder setMinIdleInstances(@Nullable Integer minIdleInstances) {
            this.minIdleInstances = Input.ofNullable(minIdleInstances);
            return this;
        }

        public Builder setMinPendingLatency(@Nullable Input<String> minPendingLatency) {
            this.minPendingLatency = minPendingLatency;
            return this;
        }

        public Builder setMinPendingLatency(@Nullable String minPendingLatency) {
            this.minPendingLatency = Input.ofNullable(minPendingLatency);
            return this;
        }

        public Builder setMinTotalInstances(@Nullable Input<Integer> minTotalInstances) {
            this.minTotalInstances = minTotalInstances;
            return this;
        }

        public Builder setMinTotalInstances(@Nullable Integer minTotalInstances) {
            this.minTotalInstances = Input.ofNullable(minTotalInstances);
            return this;
        }

        public Builder setNetworkUtilization(@Nullable Input<NetworkUtilizationArgs> networkUtilization) {
            this.networkUtilization = networkUtilization;
            return this;
        }

        public Builder setNetworkUtilization(@Nullable NetworkUtilizationArgs networkUtilization) {
            this.networkUtilization = Input.ofNullable(networkUtilization);
            return this;
        }

        public Builder setRequestUtilization(@Nullable Input<RequestUtilizationArgs> requestUtilization) {
            this.requestUtilization = requestUtilization;
            return this;
        }

        public Builder setRequestUtilization(@Nullable RequestUtilizationArgs requestUtilization) {
            this.requestUtilization = Input.ofNullable(requestUtilization);
            return this;
        }

        public Builder setStandardSchedulerSettings(@Nullable Input<StandardSchedulerSettingsArgs> standardSchedulerSettings) {
            this.standardSchedulerSettings = standardSchedulerSettings;
            return this;
        }

        public Builder setStandardSchedulerSettings(@Nullable StandardSchedulerSettingsArgs standardSchedulerSettings) {
            this.standardSchedulerSettings = Input.ofNullable(standardSchedulerSettings);
            return this;
        }

        public AutomaticScalingArgs build() {
            return new AutomaticScalingArgs(coolDownPeriod, cpuUtilization, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization, standardSchedulerSettings);
        }
    }
}
