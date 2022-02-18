// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class WorkerResourceResponse {
    /**
     * Optional. CPU request and limit for a single Airflow worker replica.
     * 
     */
    private final Double cpu;
    /**
     * Optional. Maximum number of workers for autoscaling.
     * 
     */
    private final Integer maxCount;
    /**
     * Optional. Memory (GB) request and limit for a single Airflow worker replica.
     * 
     */
    private final Double memoryGb;
    /**
     * Optional. Minimum number of workers for autoscaling.
     * 
     */
    private final Integer minCount;
    /**
     * Optional. Storage (GB) request and limit for a single Airflow worker replica.
     * 
     */
    private final Double storageGb;

    @OutputCustomType.Constructor({"cpu","maxCount","memoryGb","minCount","storageGb"})
    private WorkerResourceResponse(
        Double cpu,
        Integer maxCount,
        Double memoryGb,
        Integer minCount,
        Double storageGb) {
        this.cpu = Objects.requireNonNull(cpu);
        this.maxCount = Objects.requireNonNull(maxCount);
        this.memoryGb = Objects.requireNonNull(memoryGb);
        this.minCount = Objects.requireNonNull(minCount);
        this.storageGb = Objects.requireNonNull(storageGb);
    }

    /**
     * Optional. CPU request and limit for a single Airflow worker replica.
     * 
     */
    public Double getCpu() {
        return this.cpu;
    }
    /**
     * Optional. Maximum number of workers for autoscaling.
     * 
     */
    public Integer getMaxCount() {
        return this.maxCount;
    }
    /**
     * Optional. Memory (GB) request and limit for a single Airflow worker replica.
     * 
     */
    public Double getMemoryGb() {
        return this.memoryGb;
    }
    /**
     * Optional. Minimum number of workers for autoscaling.
     * 
     */
    public Integer getMinCount() {
        return this.minCount;
    }
    /**
     * Optional. Storage (GB) request and limit for a single Airflow worker replica.
     * 
     */
    public Double getStorageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Integer maxCount;
        private Double memoryGb;
        private Integer minCount;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.maxCount = defaults.maxCount;
    	      this.memoryGb = defaults.memoryGb;
    	      this.minCount = defaults.minCount;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMaxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setMinCount(Integer minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }

        public WorkerResourceResponse build() {
            return new WorkerResourceResponse(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}
