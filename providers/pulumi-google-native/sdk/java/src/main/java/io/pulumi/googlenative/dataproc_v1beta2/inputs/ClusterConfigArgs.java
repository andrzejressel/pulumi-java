// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.AutoscalingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EncryptionConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.EndpointConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GceClusterConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.GkeClusterConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.InstanceGroupConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LifecycleConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.MetastoreConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NodeInitializationActionArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SecurityConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SoftwareConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The cluster config.
 * 
 */
public final class ClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterConfigArgs Empty = new ClusterConfigArgs();

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    @InputImport(name="autoscalingConfig")
    private final @Nullable Input<AutoscalingConfigArgs> autoscalingConfig;

    public Input<AutoscalingConfigArgs> getAutoscalingConfig() {
        return this.autoscalingConfig == null ? Input.empty() : this.autoscalingConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @InputImport(name="configBucket")
    private final @Nullable Input<String> configBucket;

    public Input<String> getConfigBucket() {
        return this.configBucket == null ? Input.empty() : this.configBucket;
    }

    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    @InputImport(name="encryptionConfig")
    private final @Nullable Input<EncryptionConfigArgs> encryptionConfig;

    public Input<EncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    @InputImport(name="endpointConfig")
    private final @Nullable Input<EndpointConfigArgs> endpointConfig;

    public Input<EndpointConfigArgs> getEndpointConfig() {
        return this.endpointConfig == null ? Input.empty() : this.endpointConfig;
    }

    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    @InputImport(name="gceClusterConfig")
    private final @Nullable Input<GceClusterConfigArgs> gceClusterConfig;

    public Input<GceClusterConfigArgs> getGceClusterConfig() {
        return this.gceClusterConfig == null ? Input.empty() : this.gceClusterConfig;
    }

    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    @InputImport(name="gkeClusterConfig")
    private final @Nullable Input<GkeClusterConfigArgs> gkeClusterConfig;

    public Input<GkeClusterConfigArgs> getGkeClusterConfig() {
        return this.gkeClusterConfig == null ? Input.empty() : this.gkeClusterConfig;
    }

    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ "${ROLE}" == 'Master' ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    @InputImport(name="initializationActions")
    private final @Nullable Input<List<NodeInitializationActionArgs>> initializationActions;

    public Input<List<NodeInitializationActionArgs>> getInitializationActions() {
        return this.initializationActions == null ? Input.empty() : this.initializationActions;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     * 
     */
    @InputImport(name="lifecycleConfig")
    private final @Nullable Input<LifecycleConfigArgs> lifecycleConfig;

    public Input<LifecycleConfigArgs> getLifecycleConfig() {
        return this.lifecycleConfig == null ? Input.empty() : this.lifecycleConfig;
    }

    /**
     * Optional. The Compute Engine config settings for the master instance in a cluster.
     * 
     */
    @InputImport(name="masterConfig")
    private final @Nullable Input<InstanceGroupConfigArgs> masterConfig;

    public Input<InstanceGroupConfigArgs> getMasterConfig() {
        return this.masterConfig == null ? Input.empty() : this.masterConfig;
    }

    /**
     * Optional. Metastore configuration.
     * 
     */
    @InputImport(name="metastoreConfig")
    private final @Nullable Input<MetastoreConfigArgs> metastoreConfig;

    public Input<MetastoreConfigArgs> getMetastoreConfig() {
        return this.metastoreConfig == null ? Input.empty() : this.metastoreConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @InputImport(name="secondaryWorkerConfig")
    private final @Nullable Input<InstanceGroupConfigArgs> secondaryWorkerConfig;

    public Input<InstanceGroupConfigArgs> getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig == null ? Input.empty() : this.secondaryWorkerConfig;
    }

    /**
     * Optional. Security related configuration.
     * 
     */
    @InputImport(name="securityConfig")
    private final @Nullable Input<SecurityConfigArgs> securityConfig;

    public Input<SecurityConfigArgs> getSecurityConfig() {
        return this.securityConfig == null ? Input.empty() : this.securityConfig;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    @InputImport(name="softwareConfig")
    private final @Nullable Input<SoftwareConfigArgs> softwareConfig;

    public Input<SoftwareConfigArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Input.empty() : this.softwareConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster's temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @InputImport(name="tempBucket")
    private final @Nullable Input<String> tempBucket;

    public Input<String> getTempBucket() {
        return this.tempBucket == null ? Input.empty() : this.tempBucket;
    }

    /**
     * Optional. The Compute Engine config settings for worker instances in a cluster.
     * 
     */
    @InputImport(name="workerConfig")
    private final @Nullable Input<InstanceGroupConfigArgs> workerConfig;

    public Input<InstanceGroupConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    public ClusterConfigArgs(
        @Nullable Input<AutoscalingConfigArgs> autoscalingConfig,
        @Nullable Input<String> configBucket,
        @Nullable Input<EncryptionConfigArgs> encryptionConfig,
        @Nullable Input<EndpointConfigArgs> endpointConfig,
        @Nullable Input<GceClusterConfigArgs> gceClusterConfig,
        @Nullable Input<GkeClusterConfigArgs> gkeClusterConfig,
        @Nullable Input<List<NodeInitializationActionArgs>> initializationActions,
        @Nullable Input<LifecycleConfigArgs> lifecycleConfig,
        @Nullable Input<InstanceGroupConfigArgs> masterConfig,
        @Nullable Input<MetastoreConfigArgs> metastoreConfig,
        @Nullable Input<InstanceGroupConfigArgs> secondaryWorkerConfig,
        @Nullable Input<SecurityConfigArgs> securityConfig,
        @Nullable Input<SoftwareConfigArgs> softwareConfig,
        @Nullable Input<String> tempBucket,
        @Nullable Input<InstanceGroupConfigArgs> workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.configBucket = configBucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.gkeClusterConfig = gkeClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.secondaryWorkerConfig = secondaryWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    private ClusterConfigArgs() {
        this.autoscalingConfig = Input.empty();
        this.configBucket = Input.empty();
        this.encryptionConfig = Input.empty();
        this.endpointConfig = Input.empty();
        this.gceClusterConfig = Input.empty();
        this.gkeClusterConfig = Input.empty();
        this.initializationActions = Input.empty();
        this.lifecycleConfig = Input.empty();
        this.masterConfig = Input.empty();
        this.metastoreConfig = Input.empty();
        this.secondaryWorkerConfig = Input.empty();
        this.securityConfig = Input.empty();
        this.softwareConfig = Input.empty();
        this.tempBucket = Input.empty();
        this.workerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalingConfigArgs> autoscalingConfig;
        private @Nullable Input<String> configBucket;
        private @Nullable Input<EncryptionConfigArgs> encryptionConfig;
        private @Nullable Input<EndpointConfigArgs> endpointConfig;
        private @Nullable Input<GceClusterConfigArgs> gceClusterConfig;
        private @Nullable Input<GkeClusterConfigArgs> gkeClusterConfig;
        private @Nullable Input<List<NodeInitializationActionArgs>> initializationActions;
        private @Nullable Input<LifecycleConfigArgs> lifecycleConfig;
        private @Nullable Input<InstanceGroupConfigArgs> masterConfig;
        private @Nullable Input<MetastoreConfigArgs> metastoreConfig;
        private @Nullable Input<InstanceGroupConfigArgs> secondaryWorkerConfig;
        private @Nullable Input<SecurityConfigArgs> securityConfig;
        private @Nullable Input<SoftwareConfigArgs> softwareConfig;
        private @Nullable Input<String> tempBucket;
        private @Nullable Input<InstanceGroupConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.configBucket = defaults.configBucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.gkeClusterConfig = defaults.gkeClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.secondaryWorkerConfig = defaults.secondaryWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setAutoscalingConfig(@Nullable Input<AutoscalingConfigArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }

        public Builder setAutoscalingConfig(@Nullable AutoscalingConfigArgs autoscalingConfig) {
            this.autoscalingConfig = Input.ofNullable(autoscalingConfig);
            return this;
        }

        public Builder setConfigBucket(@Nullable Input<String> configBucket) {
            this.configBucket = configBucket;
            return this;
        }

        public Builder setConfigBucket(@Nullable String configBucket) {
            this.configBucket = Input.ofNullable(configBucket);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<EncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable EncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setEndpointConfig(@Nullable Input<EndpointConfigArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }

        public Builder setEndpointConfig(@Nullable EndpointConfigArgs endpointConfig) {
            this.endpointConfig = Input.ofNullable(endpointConfig);
            return this;
        }

        public Builder setGceClusterConfig(@Nullable Input<GceClusterConfigArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }

        public Builder setGceClusterConfig(@Nullable GceClusterConfigArgs gceClusterConfig) {
            this.gceClusterConfig = Input.ofNullable(gceClusterConfig);
            return this;
        }

        public Builder setGkeClusterConfig(@Nullable Input<GkeClusterConfigArgs> gkeClusterConfig) {
            this.gkeClusterConfig = gkeClusterConfig;
            return this;
        }

        public Builder setGkeClusterConfig(@Nullable GkeClusterConfigArgs gkeClusterConfig) {
            this.gkeClusterConfig = Input.ofNullable(gkeClusterConfig);
            return this;
        }

        public Builder setInitializationActions(@Nullable Input<List<NodeInitializationActionArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }

        public Builder setInitializationActions(@Nullable List<NodeInitializationActionArgs> initializationActions) {
            this.initializationActions = Input.ofNullable(initializationActions);
            return this;
        }

        public Builder setLifecycleConfig(@Nullable Input<LifecycleConfigArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }

        public Builder setLifecycleConfig(@Nullable LifecycleConfigArgs lifecycleConfig) {
            this.lifecycleConfig = Input.ofNullable(lifecycleConfig);
            return this;
        }

        public Builder setMasterConfig(@Nullable Input<InstanceGroupConfigArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder setMasterConfig(@Nullable InstanceGroupConfigArgs masterConfig) {
            this.masterConfig = Input.ofNullable(masterConfig);
            return this;
        }

        public Builder setMetastoreConfig(@Nullable Input<MetastoreConfigArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }

        public Builder setMetastoreConfig(@Nullable MetastoreConfigArgs metastoreConfig) {
            this.metastoreConfig = Input.ofNullable(metastoreConfig);
            return this;
        }

        public Builder setSecondaryWorkerConfig(@Nullable Input<InstanceGroupConfigArgs> secondaryWorkerConfig) {
            this.secondaryWorkerConfig = secondaryWorkerConfig;
            return this;
        }

        public Builder setSecondaryWorkerConfig(@Nullable InstanceGroupConfigArgs secondaryWorkerConfig) {
            this.secondaryWorkerConfig = Input.ofNullable(secondaryWorkerConfig);
            return this;
        }

        public Builder setSecurityConfig(@Nullable Input<SecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder setSecurityConfig(@Nullable SecurityConfigArgs securityConfig) {
            this.securityConfig = Input.ofNullable(securityConfig);
            return this;
        }

        public Builder setSoftwareConfig(@Nullable Input<SoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder setSoftwareConfig(@Nullable SoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Input.ofNullable(softwareConfig);
            return this;
        }

        public Builder setTempBucket(@Nullable Input<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }

        public Builder setTempBucket(@Nullable String tempBucket) {
            this.tempBucket = Input.ofNullable(tempBucket);
            return this;
        }

        public Builder setWorkerConfig(@Nullable Input<InstanceGroupConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable InstanceGroupConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }

        public ClusterConfigArgs build() {
            return new ClusterConfigArgs(autoscalingConfig, configBucket, encryptionConfig, endpointConfig, gceClusterConfig, gkeClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, secondaryWorkerConfig, securityConfig, softwareConfig, tempBucket, workerConfig);
        }
    }
}
