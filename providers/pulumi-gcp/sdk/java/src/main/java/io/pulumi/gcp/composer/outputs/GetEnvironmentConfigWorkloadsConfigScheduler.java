// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigWorkloadsConfigScheduler {
    private final Integer count;
    private final Double cpu;
    private final Double memoryGb;
    private final Double storageGb;

    @OutputCustomType.Constructor({"count","cpu","memoryGb","storageGb"})
    private GetEnvironmentConfigWorkloadsConfigScheduler(
        Integer count,
        Double cpu,
        Double memoryGb,
        Double storageGb) {
        this.count = Objects.requireNonNull(count);
        this.cpu = Objects.requireNonNull(cpu);
        this.memoryGb = Objects.requireNonNull(memoryGb);
        this.storageGb = Objects.requireNonNull(storageGb);
    }

    public Integer getCount() {
        return this.count;
    }
    public Double getCpu() {
        return this.cpu;
    }
    public Double getMemoryGb() {
        return this.memoryGb;
    }
    public Double getStorageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigScheduler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigScheduler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }

        public GetEnvironmentConfigWorkloadsConfigScheduler build() {
            return new GetEnvironmentConfigWorkloadsConfigScheduler(count, cpu, memoryGb, storageGb);
        }
    }
}
