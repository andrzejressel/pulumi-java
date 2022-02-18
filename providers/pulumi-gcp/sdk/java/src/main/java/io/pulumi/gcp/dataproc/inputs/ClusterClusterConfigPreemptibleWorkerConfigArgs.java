// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigPreemptibleWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigPreemptibleWorkerConfigArgs Empty = new ClusterClusterConfigPreemptibleWorkerConfigArgs();

    /**
     * Disk Config
     * 
     */
    @InputImport(name="diskConfig")
    private final @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig;

    public Input<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> getDiskConfig() {
        return this.diskConfig == null ? Input.empty() : this.diskConfig;
    }

    @InputImport(name="instanceNames")
    private final @Nullable Input<List<String>> instanceNames;

    public Input<List<String>> getInstanceNames() {
        return this.instanceNames == null ? Input.empty() : this.instanceNames;
    }

    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    @InputImport(name="numInstances")
    private final @Nullable Input<Integer> numInstances;

    public Input<Integer> getNumInstances() {
        return this.numInstances == null ? Input.empty() : this.numInstances;
    }

    public ClusterClusterConfigPreemptibleWorkerConfigArgs(
        @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig,
        @Nullable Input<List<String>> instanceNames,
        @Nullable Input<Integer> numInstances) {
        this.diskConfig = diskConfig;
        this.instanceNames = instanceNames;
        this.numInstances = numInstances;
    }

    private ClusterClusterConfigPreemptibleWorkerConfigArgs() {
        this.diskConfig = Input.empty();
        this.instanceNames = Input.empty();
        this.numInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigPreemptibleWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig;
        private @Nullable Input<List<String>> instanceNames;
        private @Nullable Input<Integer> numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigPreemptibleWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskConfig = defaults.diskConfig;
    	      this.instanceNames = defaults.instanceNames;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder setDiskConfig(@Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }

        public Builder setDiskConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigDiskConfigArgs diskConfig) {
            this.diskConfig = Input.ofNullable(diskConfig);
            return this;
        }

        public Builder setInstanceNames(@Nullable Input<List<String>> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }

        public Builder setInstanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = Input.ofNullable(instanceNames);
            return this;
        }

        public Builder setNumInstances(@Nullable Input<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }

        public Builder setNumInstances(@Nullable Integer numInstances) {
            this.numInstances = Input.ofNullable(numInstances);
            return this;
        }

        public ClusterClusterConfigPreemptibleWorkerConfigArgs build() {
            return new ClusterClusterConfigPreemptibleWorkerConfigArgs(diskConfig, instanceNames, numInstances);
        }
    }
}
