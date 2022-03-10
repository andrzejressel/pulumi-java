// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerResourceRequirementsResponse {
    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double cpu;
    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double cpuLimit;
    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
     */
    private final @Nullable Integer fpga;
    /**
     * The number of GPU cores in the container.
     * 
     */
    private final @Nullable Integer gpu;
    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double memoryInGB;
    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    private final @Nullable Double memoryInGBLimit;

    @OutputCustomType.Constructor
    private ContainerResourceRequirementsResponse(
        @OutputCustomType.Parameter("cpu") @Nullable Double cpu,
        @OutputCustomType.Parameter("cpuLimit") @Nullable Double cpuLimit,
        @OutputCustomType.Parameter("fpga") @Nullable Integer fpga,
        @OutputCustomType.Parameter("gpu") @Nullable Integer gpu,
        @OutputCustomType.Parameter("memoryInGB") @Nullable Double memoryInGB,
        @OutputCustomType.Parameter("memoryInGBLimit") @Nullable Double memoryInGBLimit) {
        this.cpu = cpu;
        this.cpuLimit = cpuLimit;
        this.fpga = fpga;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
        this.memoryInGBLimit = memoryInGBLimit;
    }

    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> getCpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> getCpuLimit() {
        return Optional.ofNullable(this.cpuLimit);
    }
    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
    */
    public Optional<Integer> getFpga() {
        return Optional.ofNullable(this.fpga);
    }
    /**
     * The number of GPU cores in the container.
     * 
    */
    public Optional<Integer> getGpu() {
        return Optional.ofNullable(this.gpu);
    }
    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> getMemoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }
    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
    */
    public Optional<Double> getMemoryInGBLimit() {
        return Optional.ofNullable(this.memoryInGBLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceRequirementsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double cpu;
        private @Nullable Double cpuLimit;
        private @Nullable Integer fpga;
        private @Nullable Integer gpu;
        private @Nullable Double memoryInGB;
        private @Nullable Double memoryInGBLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceRequirementsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.fpga = defaults.fpga;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.memoryInGBLimit = defaults.memoryInGBLimit;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpuLimit(@Nullable Double cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }

        public Builder setFpga(@Nullable Integer fpga) {
            this.fpga = fpga;
            return this;
        }

        public Builder setGpu(@Nullable Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder setMemoryInGBLimit(@Nullable Double memoryInGBLimit) {
            this.memoryInGBLimit = memoryInGBLimit;
            return this;
        }
        public ContainerResourceRequirementsResponse build() {
            return new ContainerResourceRequirementsResponse(cpu, cpuLimit, fpga, gpu, memoryInGB, memoryInGBLimit);
        }
    }
}
