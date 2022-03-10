// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.azurenative.costmanagement.outputs.ReportDeliveryDestinationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ReportDeliveryInfoResponse {
    /**
     * Has destination for the report being delivered.
     * 
     */
    private final ReportDeliveryDestinationResponse destination;

    @OutputCustomType.Constructor
    private ReportDeliveryInfoResponse(@OutputCustomType.Parameter("destination") ReportDeliveryDestinationResponse destination) {
        this.destination = destination;
    }

    /**
     * Has destination for the report being delivered.
     * 
    */
    public ReportDeliveryDestinationResponse getDestination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportDeliveryDestinationResponse destination;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(ReportDeliveryDestinationResponse destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public ReportDeliveryInfoResponse build() {
            return new ReportDeliveryInfoResponse(destination);
        }
    }
}
