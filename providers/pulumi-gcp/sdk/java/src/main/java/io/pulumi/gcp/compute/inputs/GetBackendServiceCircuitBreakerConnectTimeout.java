// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GetBackendServiceCircuitBreakerConnectTimeout extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceCircuitBreakerConnectTimeout Empty = new GetBackendServiceCircuitBreakerConnectTimeout();

    @InputImport(name="nanos", required=true)
    private final Integer nanos;

    public Integer getNanos() {
        return this.nanos;
    }

    @InputImport(name="seconds", required=true)
    private final Integer seconds;

    public Integer getSeconds() {
        return this.seconds;
    }

    public GetBackendServiceCircuitBreakerConnectTimeout(
        Integer nanos,
        Integer seconds) {
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private GetBackendServiceCircuitBreakerConnectTimeout() {
        this.nanos = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCircuitBreakerConnectTimeout defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceCircuitBreakerConnectTimeout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setSeconds(Integer seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public GetBackendServiceCircuitBreakerConnectTimeout build() {
            return new GetBackendServiceCircuitBreakerConnectTimeout(nanos, seconds);
        }
    }
}
