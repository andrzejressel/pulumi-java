// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetBackendServiceOutlierDetectionBaseEjectionTime {
    private final Integer nanos;
    private final Integer seconds;

    @OutputCustomType.Constructor({"nanos","seconds"})
    private GetBackendServiceOutlierDetectionBaseEjectionTime(
        Integer nanos,
        Integer seconds) {
        this.nanos = Objects.requireNonNull(nanos);
        this.seconds = Objects.requireNonNull(seconds);
    }

    public Integer getNanos() {
        return this.nanos;
    }
    public Integer getSeconds() {
        return this.seconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceOutlierDetectionBaseEjectionTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private Integer seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceOutlierDetectionBaseEjectionTime defaults) {
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

        public GetBackendServiceOutlierDetectionBaseEjectionTime build() {
            return new GetBackendServiceOutlierDetectionBaseEjectionTime(nanos, seconds);
        }
    }
}
