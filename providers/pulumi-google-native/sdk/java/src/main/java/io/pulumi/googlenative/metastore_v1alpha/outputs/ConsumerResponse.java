// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConsumerResponse {
    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    private final String endpointUri;
    /**
     * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service's endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet's primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    private final String subnetwork;

    @OutputCustomType.Constructor({"endpointUri","subnetwork"})
    private ConsumerResponse(
        String endpointUri,
        String subnetwork) {
        this.endpointUri = Objects.requireNonNull(endpointUri);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    public String getEndpointUri() {
        return this.endpointUri;
    }
    /**
     * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service's endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet's primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointUri;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUri = defaults.endpointUri;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setEndpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public ConsumerResponse build() {
            return new ConsumerResponse(endpointUri, subnetwork);
        }
    }
}
