// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc_v1.outputs.AuxiliaryServicesConfigResponse;
import com.pulumi.googlenative.dataproc_v1.outputs.KubernetesClusterConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualClusterConfigResponse {
    /**
     * @return Optional. Configuration of auxiliary services used by this cluster.
     * 
     */
    private final AuxiliaryServicesConfigResponse auxiliaryServicesConfig;
    /**
     * @return The configuration for running the Dataproc cluster on Kubernetes.
     * 
     */
    private final KubernetesClusterConfigResponse kubernetesClusterConfig;
    /**
     * @return Optional. A Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    private final String stagingBucket;

    @CustomType.Constructor
    private VirtualClusterConfigResponse(
        @CustomType.Parameter("auxiliaryServicesConfig") AuxiliaryServicesConfigResponse auxiliaryServicesConfig,
        @CustomType.Parameter("kubernetesClusterConfig") KubernetesClusterConfigResponse kubernetesClusterConfig,
        @CustomType.Parameter("stagingBucket") String stagingBucket) {
        this.auxiliaryServicesConfig = auxiliaryServicesConfig;
        this.kubernetesClusterConfig = kubernetesClusterConfig;
        this.stagingBucket = stagingBucket;
    }

    /**
     * @return Optional. Configuration of auxiliary services used by this cluster.
     * 
     */
    public AuxiliaryServicesConfigResponse auxiliaryServicesConfig() {
        return this.auxiliaryServicesConfig;
    }
    /**
     * @return The configuration for running the Dataproc cluster on Kubernetes.
     * 
     */
    public KubernetesClusterConfigResponse kubernetesClusterConfig() {
        return this.kubernetesClusterConfig;
    }
    /**
     * @return Optional. A Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging and temp buckets (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
     * 
     */
    public String stagingBucket() {
        return this.stagingBucket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuxiliaryServicesConfigResponse auxiliaryServicesConfig;
        private KubernetesClusterConfigResponse kubernetesClusterConfig;
        private String stagingBucket;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryServicesConfig = defaults.auxiliaryServicesConfig;
    	      this.kubernetesClusterConfig = defaults.kubernetesClusterConfig;
    	      this.stagingBucket = defaults.stagingBucket;
        }

        public Builder auxiliaryServicesConfig(AuxiliaryServicesConfigResponse auxiliaryServicesConfig) {
            this.auxiliaryServicesConfig = Objects.requireNonNull(auxiliaryServicesConfig);
            return this;
        }
        public Builder kubernetesClusterConfig(KubernetesClusterConfigResponse kubernetesClusterConfig) {
            this.kubernetesClusterConfig = Objects.requireNonNull(kubernetesClusterConfig);
            return this;
        }
        public Builder stagingBucket(String stagingBucket) {
            this.stagingBucket = Objects.requireNonNull(stagingBucket);
            return this;
        }        public VirtualClusterConfigResponse build() {
            return new VirtualClusterConfigResponse(auxiliaryServicesConfig, kubernetesClusterConfig, stagingBucket);
        }
    }
}
