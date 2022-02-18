// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.CpuUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.inputs.DiskUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.inputs.NetworkUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.inputs.RequestUtilizationResponse;
import io.pulumi.googlenative.appengine_v1.inputs.StandardSchedulerSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * 
 */
public final class AutomaticScalingResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomaticScalingResponse Empty = new AutomaticScalingResponse();

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    @InputImport(name="coolDownPeriod", required=true)
    private final String coolDownPeriod;

    public String getCoolDownPeriod() {
        return this.coolDownPeriod;
    }

    /**
     * Target scaling by CPU usage.
     * 
     */
    @InputImport(name="cpuUtilization", required=true)
    private final CpuUtilizationResponse cpuUtilization;

    public CpuUtilizationResponse getCpuUtilization() {
        return this.cpuUtilization;
    }

    /**
     * Target scaling by disk usage.
     * 
     */
    @InputImport(name="diskUtilization", required=true)
    private final DiskUtilizationResponse diskUtilization;

    public DiskUtilizationResponse getDiskUtilization() {
        return this.diskUtilization;
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    @InputImport(name="maxConcurrentRequests", required=true)
    private final Integer maxConcurrentRequests;

    public Integer getMaxConcurrentRequests() {
        return this.maxConcurrentRequests;
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @InputImport(name="maxIdleInstances", required=true)
    private final Integer maxIdleInstances;

    public Integer getMaxIdleInstances() {
        return this.maxIdleInstances;
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="maxPendingLatency", required=true)
    private final String maxPendingLatency;

    public String getMaxPendingLatency() {
        return this.maxPendingLatency;
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    @InputImport(name="maxTotalInstances", required=true)
    private final Integer maxTotalInstances;

    public Integer getMaxTotalInstances() {
        return this.maxTotalInstances;
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @InputImport(name="minIdleInstances", required=true)
    private final Integer minIdleInstances;

    public Integer getMinIdleInstances() {
        return this.minIdleInstances;
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @InputImport(name="minPendingLatency", required=true)
    private final String minPendingLatency;

    public String getMinPendingLatency() {
        return this.minPendingLatency;
    }

    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    @InputImport(name="minTotalInstances", required=true)
    private final Integer minTotalInstances;

    public Integer getMinTotalInstances() {
        return this.minTotalInstances;
    }

    /**
     * Target scaling by network usage.
     * 
     */
    @InputImport(name="networkUtilization", required=true)
    private final NetworkUtilizationResponse networkUtilization;

    public NetworkUtilizationResponse getNetworkUtilization() {
        return this.networkUtilization;
    }

    /**
     * Target scaling by request utilization.
     * 
     */
    @InputImport(name="requestUtilization", required=true)
    private final RequestUtilizationResponse requestUtilization;

    public RequestUtilizationResponse getRequestUtilization() {
        return this.requestUtilization;
    }

    /**
     * Scheduler settings for standard environment.
     * 
     */
    @InputImport(name="standardSchedulerSettings", required=true)
    private final StandardSchedulerSettingsResponse standardSchedulerSettings;

    public StandardSchedulerSettingsResponse getStandardSchedulerSettings() {
        return this.standardSchedulerSettings;
    }

    public AutomaticScalingResponse(
        String coolDownPeriod,
        CpuUtilizationResponse cpuUtilization,
        DiskUtilizationResponse diskUtilization,
        Integer maxConcurrentRequests,
        Integer maxIdleInstances,
        String maxPendingLatency,
        Integer maxTotalInstances,
        Integer minIdleInstances,
        String minPendingLatency,
        Integer minTotalInstances,
        NetworkUtilizationResponse networkUtilization,
        RequestUtilizationResponse requestUtilization,
        StandardSchedulerSettingsResponse standardSchedulerSettings) {
        this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod, "expected parameter 'coolDownPeriod' to be non-null");
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization, "expected parameter 'cpuUtilization' to be non-null");
        this.diskUtilization = Objects.requireNonNull(diskUtilization, "expected parameter 'diskUtilization' to be non-null");
        this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests, "expected parameter 'maxConcurrentRequests' to be non-null");
        this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances, "expected parameter 'maxIdleInstances' to be non-null");
        this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency, "expected parameter 'maxPendingLatency' to be non-null");
        this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances, "expected parameter 'maxTotalInstances' to be non-null");
        this.minIdleInstances = Objects.requireNonNull(minIdleInstances, "expected parameter 'minIdleInstances' to be non-null");
        this.minPendingLatency = Objects.requireNonNull(minPendingLatency, "expected parameter 'minPendingLatency' to be non-null");
        this.minTotalInstances = Objects.requireNonNull(minTotalInstances, "expected parameter 'minTotalInstances' to be non-null");
        this.networkUtilization = Objects.requireNonNull(networkUtilization, "expected parameter 'networkUtilization' to be non-null");
        this.requestUtilization = Objects.requireNonNull(requestUtilization, "expected parameter 'requestUtilization' to be non-null");
        this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings, "expected parameter 'standardSchedulerSettings' to be non-null");
    }

    private AutomaticScalingResponse() {
        this.coolDownPeriod = null;
        this.cpuUtilization = null;
        this.diskUtilization = null;
        this.maxConcurrentRequests = null;
        this.maxIdleInstances = null;
        this.maxPendingLatency = null;
        this.maxTotalInstances = null;
        this.minIdleInstances = null;
        this.minPendingLatency = null;
        this.minTotalInstances = null;
        this.networkUtilization = null;
        this.requestUtilization = null;
        this.standardSchedulerSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coolDownPeriod;
        private CpuUtilizationResponse cpuUtilization;
        private DiskUtilizationResponse diskUtilization;
        private Integer maxConcurrentRequests;
        private Integer maxIdleInstances;
        private String maxPendingLatency;
        private Integer maxTotalInstances;
        private Integer minIdleInstances;
        private String minPendingLatency;
        private Integer minTotalInstances;
        private NetworkUtilizationResponse networkUtilization;
        private RequestUtilizationResponse requestUtilization;
        private StandardSchedulerSettingsResponse standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticScalingResponse defaults) {
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

        public Builder setCoolDownPeriod(String coolDownPeriod) {
            this.coolDownPeriod = Objects.requireNonNull(coolDownPeriod);
            return this;
        }

        public Builder setCpuUtilization(CpuUtilizationResponse cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setDiskUtilization(DiskUtilizationResponse diskUtilization) {
            this.diskUtilization = Objects.requireNonNull(diskUtilization);
            return this;
        }

        public Builder setMaxConcurrentRequests(Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = Objects.requireNonNull(maxConcurrentRequests);
            return this;
        }

        public Builder setMaxIdleInstances(Integer maxIdleInstances) {
            this.maxIdleInstances = Objects.requireNonNull(maxIdleInstances);
            return this;
        }

        public Builder setMaxPendingLatency(String maxPendingLatency) {
            this.maxPendingLatency = Objects.requireNonNull(maxPendingLatency);
            return this;
        }

        public Builder setMaxTotalInstances(Integer maxTotalInstances) {
            this.maxTotalInstances = Objects.requireNonNull(maxTotalInstances);
            return this;
        }

        public Builder setMinIdleInstances(Integer minIdleInstances) {
            this.minIdleInstances = Objects.requireNonNull(minIdleInstances);
            return this;
        }

        public Builder setMinPendingLatency(String minPendingLatency) {
            this.minPendingLatency = Objects.requireNonNull(minPendingLatency);
            return this;
        }

        public Builder setMinTotalInstances(Integer minTotalInstances) {
            this.minTotalInstances = Objects.requireNonNull(minTotalInstances);
            return this;
        }

        public Builder setNetworkUtilization(NetworkUtilizationResponse networkUtilization) {
            this.networkUtilization = Objects.requireNonNull(networkUtilization);
            return this;
        }

        public Builder setRequestUtilization(RequestUtilizationResponse requestUtilization) {
            this.requestUtilization = Objects.requireNonNull(requestUtilization);
            return this;
        }

        public Builder setStandardSchedulerSettings(StandardSchedulerSettingsResponse standardSchedulerSettings) {
            this.standardSchedulerSettings = Objects.requireNonNull(standardSchedulerSettings);
            return this;
        }

        public AutomaticScalingResponse build() {
            return new AutomaticScalingResponse(coolDownPeriod, cpuUtilization, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization, standardSchedulerSettings);
        }
    }
}
