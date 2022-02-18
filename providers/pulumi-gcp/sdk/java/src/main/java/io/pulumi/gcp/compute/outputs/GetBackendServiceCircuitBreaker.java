// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetBackendServiceCircuitBreakerConnectTimeout;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetBackendServiceCircuitBreaker {
    private final List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;
    private final Integer maxConnections;
    private final Integer maxPendingRequests;
    private final Integer maxRequests;
    private final Integer maxRequestsPerConnection;
    private final Integer maxRetries;

    @OutputCustomType.Constructor({"connectTimeouts","maxConnections","maxPendingRequests","maxRequests","maxRequestsPerConnection","maxRetries"})
    private GetBackendServiceCircuitBreaker(
        List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts,
        Integer maxConnections,
        Integer maxPendingRequests,
        Integer maxRequests,
        Integer maxRequestsPerConnection,
        Integer maxRetries) {
        this.connectTimeouts = Objects.requireNonNull(connectTimeouts);
        this.maxConnections = Objects.requireNonNull(maxConnections);
        this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
        this.maxRequests = Objects.requireNonNull(maxRequests);
        this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
        this.maxRetries = Objects.requireNonNull(maxRetries);
    }

    public List<GetBackendServiceCircuitBreakerConnectTimeout> getConnectTimeouts() {
        return this.connectTimeouts;
    }
    public Integer getMaxConnections() {
        return this.maxConnections;
    }
    public Integer getMaxPendingRequests() {
        return this.maxPendingRequests;
    }
    public Integer getMaxRequests() {
        return this.maxRequests;
    }
    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }
    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeouts = defaults.connectTimeouts;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder setConnectTimeouts(List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts) {
            this.connectTimeouts = Objects.requireNonNull(connectTimeouts);
            return this;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }

        public Builder setMaxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }

        public Builder setMaxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }

        public GetBackendServiceCircuitBreaker build() {
            return new GetBackendServiceCircuitBreaker(connectTimeouts, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
