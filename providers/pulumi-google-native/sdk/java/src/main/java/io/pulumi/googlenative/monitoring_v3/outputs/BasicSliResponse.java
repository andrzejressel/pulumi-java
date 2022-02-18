// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.AvailabilityCriteriaResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.LatencyCriteriaResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BasicSliResponse {
    /**
     * Good service is defined to be the count of requests made to this service that return successfully.
     * 
     */
    private final AvailabilityCriteriaResponse availability;
    /**
     * Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold.
     * 
     */
    private final LatencyCriteriaResponse latency;
    /**
     * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
     * 
     */
    private final List<String> location;
    /**
     * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
     * 
     */
    private final List<String> method;
    /**
     * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
     * 
     */
    private final List<String> version;

    @OutputCustomType.Constructor({"availability","latency","location","method","version"})
    private BasicSliResponse(
        AvailabilityCriteriaResponse availability,
        LatencyCriteriaResponse latency,
        List<String> location,
        List<String> method,
        List<String> version) {
        this.availability = Objects.requireNonNull(availability);
        this.latency = Objects.requireNonNull(latency);
        this.location = Objects.requireNonNull(location);
        this.method = Objects.requireNonNull(method);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Good service is defined to be the count of requests made to this service that return successfully.
     * 
     */
    public AvailabilityCriteriaResponse getAvailability() {
        return this.availability;
    }
    /**
     * Good service is defined to be the count of requests made to this service that are fast enough with respect to latency.threshold.
     * 
     */
    public LatencyCriteriaResponse getLatency() {
        return this.latency;
    }
    /**
     * OPTIONAL: The set of locations to which this SLI is relevant. Telemetry from other locations will not be used to calculate performance for this SLI. If omitted, this SLI applies to all locations in which the Service has activity. For service types that don't support breaking down by location, setting this field will result in an error.
     * 
     */
    public List<String> getLocation() {
        return this.location;
    }
    /**
     * OPTIONAL: The set of RPCs to which this SLI is relevant. Telemetry from other methods will not be used to calculate performance for this SLI. If omitted, this SLI applies to all the Service's methods. For service types that don't support breaking down by method, setting this field will result in an error.
     * 
     */
    public List<String> getMethod() {
        return this.method;
    }
    /**
     * OPTIONAL: The set of API versions to which this SLI is relevant. Telemetry from other API versions will not be used to calculate performance for this SLI. If omitted, this SLI applies to all API versions. For service types that don't support breaking down by version, setting this field will result in an error.
     * 
     */
    public List<String> getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicSliResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityCriteriaResponse availability;
        private LatencyCriteriaResponse latency;
        private List<String> location;
        private List<String> method;
        private List<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicSliResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.latency = defaults.latency;
    	      this.location = defaults.location;
    	      this.method = defaults.method;
    	      this.version = defaults.version;
        }

        public Builder setAvailability(AvailabilityCriteriaResponse availability) {
            this.availability = Objects.requireNonNull(availability);
            return this;
        }

        public Builder setLatency(LatencyCriteriaResponse latency) {
            this.latency = Objects.requireNonNull(latency);
            return this;
        }

        public Builder setLocation(List<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMethod(List<String> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder setVersion(List<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public BasicSliResponse build() {
            return new BasicSliResponse(availability, latency, location, method, version);
        }
    }
}
