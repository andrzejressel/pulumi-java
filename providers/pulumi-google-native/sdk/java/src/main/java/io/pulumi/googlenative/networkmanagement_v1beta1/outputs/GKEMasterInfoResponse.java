// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GKEMasterInfoResponse {
    /**
     * URI of a GKE cluster network.
     * 
     */
    private final String clusterNetworkUri;
    /**
     * URI of a GKE cluster.
     * 
     */
    private final String clusterUri;
    /**
     * External IP address of a GKE cluster master.
     * 
     */
    private final String externalIp;
    /**
     * Internal IP address of a GKE cluster master.
     * 
     */
    private final String internalIp;

    @OutputCustomType.Constructor({"clusterNetworkUri","clusterUri","externalIp","internalIp"})
    private GKEMasterInfoResponse(
        String clusterNetworkUri,
        String clusterUri,
        String externalIp,
        String internalIp) {
        this.clusterNetworkUri = Objects.requireNonNull(clusterNetworkUri);
        this.clusterUri = Objects.requireNonNull(clusterUri);
        this.externalIp = Objects.requireNonNull(externalIp);
        this.internalIp = Objects.requireNonNull(internalIp);
    }

    /**
     * URI of a GKE cluster network.
     * 
     */
    public String getClusterNetworkUri() {
        return this.clusterNetworkUri;
    }
    /**
     * URI of a GKE cluster.
     * 
     */
    public String getClusterUri() {
        return this.clusterUri;
    }
    /**
     * External IP address of a GKE cluster master.
     * 
     */
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * Internal IP address of a GKE cluster master.
     * 
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GKEMasterInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterNetworkUri;
        private String clusterUri;
        private String externalIp;
        private String internalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GKEMasterInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNetworkUri = defaults.clusterNetworkUri;
    	      this.clusterUri = defaults.clusterUri;
    	      this.externalIp = defaults.externalIp;
    	      this.internalIp = defaults.internalIp;
        }

        public Builder setClusterNetworkUri(String clusterNetworkUri) {
            this.clusterNetworkUri = Objects.requireNonNull(clusterNetworkUri);
            return this;
        }

        public Builder setClusterUri(String clusterUri) {
            this.clusterUri = Objects.requireNonNull(clusterUri);
            return this;
        }

        public Builder setExternalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }

        public Builder setInternalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }

        public GKEMasterInfoResponse build() {
            return new GKEMasterInfoResponse(clusterNetworkUri, clusterUri, externalIp, internalIp);
        }
    }
}
