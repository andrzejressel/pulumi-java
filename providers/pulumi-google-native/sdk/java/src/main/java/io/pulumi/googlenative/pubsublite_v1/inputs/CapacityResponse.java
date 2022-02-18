// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsublite_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * The throughput capacity configuration for each partition.
 * 
 */
public final class CapacityResponse extends io.pulumi.resources.InvokeArgs {

    public static final CapacityResponse Empty = new CapacityResponse();

    /**
     * Publish throughput capacity per partition in MiB/s. Must be >= 4 and <= 16.
     * 
     */
    @InputImport(name="publishMibPerSec", required=true)
    private final Integer publishMibPerSec;

    public Integer getPublishMibPerSec() {
        return this.publishMibPerSec;
    }

    /**
     * Subscribe throughput capacity per partition in MiB/s. Must be >= 4 and <= 32.
     * 
     */
    @InputImport(name="subscribeMibPerSec", required=true)
    private final Integer subscribeMibPerSec;

    public Integer getSubscribeMibPerSec() {
        return this.subscribeMibPerSec;
    }

    public CapacityResponse(
        Integer publishMibPerSec,
        Integer subscribeMibPerSec) {
        this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec, "expected parameter 'publishMibPerSec' to be non-null");
        this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec, "expected parameter 'subscribeMibPerSec' to be non-null");
    }

    private CapacityResponse() {
        this.publishMibPerSec = null;
        this.subscribeMibPerSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer publishMibPerSec;
        private Integer subscribeMibPerSec;

        public Builder() {
    	      // Empty
        }

        public Builder(CapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMibPerSec = defaults.publishMibPerSec;
    	      this.subscribeMibPerSec = defaults.subscribeMibPerSec;
        }

        public Builder setPublishMibPerSec(Integer publishMibPerSec) {
            this.publishMibPerSec = Objects.requireNonNull(publishMibPerSec);
            return this;
        }

        public Builder setSubscribeMibPerSec(Integer subscribeMibPerSec) {
            this.subscribeMibPerSec = Objects.requireNonNull(subscribeMibPerSec);
            return this;
        }

        public CapacityResponse build() {
            return new CapacityResponse(publishMibPerSec, subscribeMibPerSec);
        }
    }
}
