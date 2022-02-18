// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Execution configuration for a workload.
 * 
 */
public final class ExecutionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecutionConfigResponse Empty = new ExecutionConfigResponse();

    /**
     * Optional. The Cloud KMS key to use for encryption.
     * 
     */
    @InputImport(name="kmsKey", required=true)
    private final String kmsKey;

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * Optional. Tags used for network traffic control.
     * 
     */
    @InputImport(name="networkTags", required=true)
    private final List<String> networkTags;

    public List<String> getNetworkTags() {
        return this.networkTags;
    }

    /**
     * Optional. Network URI to connect workload to.
     * 
     */
    @InputImport(name="networkUri", required=true)
    private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    /**
     * Optional. Service account that used to execute workload.
     * 
     */
    @InputImport(name="serviceAccount", required=true)
    private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * Optional. Subnetwork URI to connect workload to.
     * 
     */
    @InputImport(name="subnetworkUri", required=true)
    private final String subnetworkUri;

    public String getSubnetworkUri() {
        return this.subnetworkUri;
    }

    public ExecutionConfigResponse(
        String kmsKey,
        List<String> networkTags,
        String networkUri,
        String serviceAccount,
        String subnetworkUri) {
        this.kmsKey = Objects.requireNonNull(kmsKey, "expected parameter 'kmsKey' to be non-null");
        this.networkTags = Objects.requireNonNull(networkTags, "expected parameter 'networkTags' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.subnetworkUri = Objects.requireNonNull(subnetworkUri, "expected parameter 'subnetworkUri' to be non-null");
    }

    private ExecutionConfigResponse() {
        this.kmsKey = null;
        this.networkTags = List.of();
        this.networkUri = null;
        this.serviceAccount = null;
        this.subnetworkUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKey;
        private List<String> networkTags;
        private String networkUri;
        private String serviceAccount;
        private String subnetworkUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetworkUri = defaults.subnetworkUri;
        }

        public Builder setKmsKey(String kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }

        public Builder setNetworkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSubnetworkUri(String subnetworkUri) {
            this.subnetworkUri = Objects.requireNonNull(subnetworkUri);
            return this;
        }

        public ExecutionConfigResponse build() {
            return new ExecutionConfigResponse(kmsKey, networkTags, networkUri, serviceAccount, subnetworkUri);
        }
    }
}
