// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.TrackingInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OrderStatusResponse {
    /**
     * Dictionary to hold generic information which is not stored
     * by the already existing properties
     * 
     */
    private final Map<String,String> additionalOrderDetails;
    /**
     * Comments related to this status change.
     * 
     */
    private final @Nullable String comments;
    /**
     * Status of the order as per the allowed status types.
     * 
     */
    private final String status;
    /**
     * Tracking information related to the state in the ordering flow
     * 
     */
    private final TrackingInfoResponse trackingInformation;
    /**
     * Time of status update.
     * 
     */
    private final String updateDateTime;

    @OutputCustomType.Constructor
    private OrderStatusResponse(
        @OutputCustomType.Parameter("additionalOrderDetails") Map<String,String> additionalOrderDetails,
        @OutputCustomType.Parameter("comments") @Nullable String comments,
        @OutputCustomType.Parameter("status") String status,
        @OutputCustomType.Parameter("trackingInformation") TrackingInfoResponse trackingInformation,
        @OutputCustomType.Parameter("updateDateTime") String updateDateTime) {
        this.additionalOrderDetails = additionalOrderDetails;
        this.comments = comments;
        this.status = status;
        this.trackingInformation = trackingInformation;
        this.updateDateTime = updateDateTime;
    }

    /**
     * Dictionary to hold generic information which is not stored
     * by the already existing properties
     * 
    */
    public Map<String,String> getAdditionalOrderDetails() {
        return this.additionalOrderDetails;
    }
    /**
     * Comments related to this status change.
     * 
    */
    public Optional<String> getComments() {
        return Optional.ofNullable(this.comments);
    }
    /**
     * Status of the order as per the allowed status types.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Tracking information related to the state in the ordering flow
     * 
    */
    public TrackingInfoResponse getTrackingInformation() {
        return this.trackingInformation;
    }
    /**
     * Time of status update.
     * 
    */
    public String getUpdateDateTime() {
        return this.updateDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> additionalOrderDetails;
        private @Nullable String comments;
        private String status;
        private TrackingInfoResponse trackingInformation;
        private String updateDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalOrderDetails = defaults.additionalOrderDetails;
    	      this.comments = defaults.comments;
    	      this.status = defaults.status;
    	      this.trackingInformation = defaults.trackingInformation;
    	      this.updateDateTime = defaults.updateDateTime;
        }

        public Builder setAdditionalOrderDetails(Map<String,String> additionalOrderDetails) {
            this.additionalOrderDetails = Objects.requireNonNull(additionalOrderDetails);
            return this;
        }

        public Builder setComments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTrackingInformation(TrackingInfoResponse trackingInformation) {
            this.trackingInformation = Objects.requireNonNull(trackingInformation);
            return this;
        }

        public Builder setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = Objects.requireNonNull(updateDateTime);
            return this;
        }
        public OrderStatusResponse build() {
            return new OrderStatusResponse(additionalOrderDetails, comments, status, trackingInformation, updateDateTime);
        }
    }
}
