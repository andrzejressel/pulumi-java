// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkerConfigResponse {
    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    private final String diskSizeGb;
    /**
     * Machine type of a worker, such as `n1-standard-1`. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    private final String machineType;
    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    private final Boolean noExternalIp;

    @OutputCustomType.Constructor({"diskSizeGb","machineType","noExternalIp"})
    private WorkerConfigResponse(
        String diskSizeGb,
        String machineType,
        Boolean noExternalIp) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.machineType = Objects.requireNonNull(machineType);
        this.noExternalIp = Objects.requireNonNull(noExternalIp);
    }

    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Machine type of a worker, such as `n1-standard-1`. See [Worker pool config file](https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    public Boolean getNoExternalIp() {
        return this.noExternalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskSizeGb;
        private String machineType;
        private Boolean noExternalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.noExternalIp = defaults.noExternalIp;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setNoExternalIp(Boolean noExternalIp) {
            this.noExternalIp = Objects.requireNonNull(noExternalIp);
            return this;
        }

        public WorkerConfigResponse build() {
            return new WorkerConfigResponse(diskSizeGb, machineType, noExternalIp);
        }
    }
}
