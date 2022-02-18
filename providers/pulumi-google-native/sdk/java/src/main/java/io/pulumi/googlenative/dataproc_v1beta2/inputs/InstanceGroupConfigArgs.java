// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.enums.InstanceGroupConfigPreemptibility;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.DiskConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The config settings for Compute Engine resources in an instance group, such as a master or worker group.
 * 
 */
public final class InstanceGroupConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupConfigArgs Empty = new InstanceGroupConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @InputImport(name="accelerators")
    private final @Nullable Input<List<AcceleratorConfigArgs>> accelerators;

    public Input<List<AcceleratorConfigArgs>> getAccelerators() {
        return this.accelerators == null ? Input.empty() : this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @InputImport(name="diskConfig")
    private final @Nullable Input<DiskConfigArgs> diskConfig;

    public Input<DiskConfigArgs> getDiskConfig() {
        return this.diskConfig == null ? Input.empty() : this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    @InputImport(name="imageUri")
    private final @Nullable Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri == null ? Input.empty() : this.imageUri;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    @InputImport(name="machineTypeUri")
    private final @Nullable Input<String> machineTypeUri;

    public Input<String> getMachineTypeUri() {
        return this.machineTypeUri == null ? Input.empty() : this.machineTypeUri;
    }

    /**
     * Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @InputImport(name="minCpuPlatform")
    private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    @InputImport(name="numInstances")
    private final @Nullable Input<Integer> numInstances;

    public Input<Integer> getNumInstances() {
        return this.numInstances == null ? Input.empty() : this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    @InputImport(name="preemptibility")
    private final @Nullable Input<InstanceGroupConfigPreemptibility> preemptibility;

    public Input<InstanceGroupConfigPreemptibility> getPreemptibility() {
        return this.preemptibility == null ? Input.empty() : this.preemptibility;
    }

    public InstanceGroupConfigArgs(
        @Nullable Input<List<AcceleratorConfigArgs>> accelerators,
        @Nullable Input<DiskConfigArgs> diskConfig,
        @Nullable Input<String> imageUri,
        @Nullable Input<String> machineTypeUri,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<Integer> numInstances,
        @Nullable Input<InstanceGroupConfigPreemptibility> preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.machineTypeUri = machineTypeUri;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    private InstanceGroupConfigArgs() {
        this.accelerators = Input.empty();
        this.diskConfig = Input.empty();
        this.imageUri = Input.empty();
        this.machineTypeUri = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.numInstances = Input.empty();
        this.preemptibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AcceleratorConfigArgs>> accelerators;
        private @Nullable Input<DiskConfigArgs> diskConfig;
        private @Nullable Input<String> imageUri;
        private @Nullable Input<String> machineTypeUri;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<Integer> numInstances;
        private @Nullable Input<InstanceGroupConfigPreemptibility> preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.machineTypeUri = defaults.machineTypeUri;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder setAccelerators(@Nullable Input<List<AcceleratorConfigArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder setAccelerators(@Nullable List<AcceleratorConfigArgs> accelerators) {
            this.accelerators = Input.ofNullable(accelerators);
            return this;
        }

        public Builder setDiskConfig(@Nullable Input<DiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }

        public Builder setDiskConfig(@Nullable DiskConfigArgs diskConfig) {
            this.diskConfig = Input.ofNullable(diskConfig);
            return this;
        }

        public Builder setImageUri(@Nullable Input<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = Input.ofNullable(imageUri);
            return this;
        }

        public Builder setMachineTypeUri(@Nullable Input<String> machineTypeUri) {
            this.machineTypeUri = machineTypeUri;
            return this;
        }

        public Builder setMachineTypeUri(@Nullable String machineTypeUri) {
            this.machineTypeUri = Input.ofNullable(machineTypeUri);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
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

        public Builder setPreemptibility(@Nullable Input<InstanceGroupConfigPreemptibility> preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }

        public Builder setPreemptibility(@Nullable InstanceGroupConfigPreemptibility preemptibility) {
            this.preemptibility = Input.ofNullable(preemptibility);
            return this;
        }

        public InstanceGroupConfigArgs build() {
            return new InstanceGroupConfigArgs(accelerators, diskConfig, imageUri, machineTypeUri, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
