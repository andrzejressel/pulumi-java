// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A GkeNodeConfigAcceleratorConfig represents a Hardware Accelerator request for a NodePool.
 * 
 */
public final class GkeNodePoolAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GkeNodePoolAcceleratorConfigArgs Empty = new GkeNodePoolAcceleratorConfigArgs();

    /**
     * The number of accelerator cards exposed to an instance.
     * 
     */
    @Import(name="acceleratorCount")
    private @Nullable Output<String> acceleratorCount;

    /**
     * @return The number of accelerator cards exposed to an instance.
     * 
     */
    public Optional<Output<String>> acceleratorCount() {
        return Optional.ofNullable(this.acceleratorCount);
    }

    /**
     * The accelerator type resource namename (see GPUs on Compute Engine).
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    /**
     * @return The accelerator type resource namename (see GPUs on Compute Engine).
     * 
     */
    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    @Import(name="gpuPartitionSize")
    private @Nullable Output<String> gpuPartitionSize;

    /**
     * @return Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    public Optional<Output<String>> gpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }

    private GkeNodePoolAcceleratorConfigArgs() {}

    private GkeNodePoolAcceleratorConfigArgs(GkeNodePoolAcceleratorConfigArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
        this.gpuPartitionSize = $.gpuPartitionSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GkeNodePoolAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GkeNodePoolAcceleratorConfigArgs $;

        public Builder() {
            $ = new GkeNodePoolAcceleratorConfigArgs();
        }

        public Builder(GkeNodePoolAcceleratorConfigArgs defaults) {
            $ = new GkeNodePoolAcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorCount The number of accelerator cards exposed to an instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(@Nullable Output<String> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        /**
         * @param acceleratorCount The number of accelerator cards exposed to an instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(String acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        /**
         * @param acceleratorType The accelerator type resource namename (see GPUs on Compute Engine).
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The accelerator type resource namename (see GPUs on Compute Engine).
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        /**
         * @param gpuPartitionSize Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
         * 
         * @return builder
         * 
         */
        public Builder gpuPartitionSize(@Nullable Output<String> gpuPartitionSize) {
            $.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        /**
         * @param gpuPartitionSize Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig user guide (https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
         * 
         * @return builder
         * 
         */
        public Builder gpuPartitionSize(String gpuPartitionSize) {
            return gpuPartitionSize(Output.of(gpuPartitionSize));
        }

        public GkeNodePoolAcceleratorConfigArgs build() {
            return $;
        }
    }

}
