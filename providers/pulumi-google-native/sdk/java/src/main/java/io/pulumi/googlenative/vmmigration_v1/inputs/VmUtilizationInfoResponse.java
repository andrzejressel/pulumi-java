// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.vmmigration_v1.inputs.VmUtilizationMetricsResponse;
import io.pulumi.googlenative.vmmigration_v1.inputs.VmwareVmDetailsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Utilization information of a single VM.
 * 
 */
public final class VmUtilizationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmUtilizationInfoResponse Empty = new VmUtilizationInfoResponse();

    /**
     * Utilization metrics for this VM.
     * 
     */
    @InputImport(name="utilization", required=true)
    private final VmUtilizationMetricsResponse utilization;

    public VmUtilizationMetricsResponse getUtilization() {
        return this.utilization;
    }

    /**
     * The VM's ID in the source.
     * 
     */
    @InputImport(name="vmId", required=true)
    private final String vmId;

    public String getVmId() {
        return this.vmId;
    }

    /**
     * The description of the VM in a Source of type Vmware.
     * 
     */
    @InputImport(name="vmwareVmDetails", required=true)
    private final VmwareVmDetailsResponse vmwareVmDetails;

    public VmwareVmDetailsResponse getVmwareVmDetails() {
        return this.vmwareVmDetails;
    }

    public VmUtilizationInfoResponse(
        VmUtilizationMetricsResponse utilization,
        String vmId,
        VmwareVmDetailsResponse vmwareVmDetails) {
        this.utilization = Objects.requireNonNull(utilization, "expected parameter 'utilization' to be non-null");
        this.vmId = Objects.requireNonNull(vmId, "expected parameter 'vmId' to be non-null");
        this.vmwareVmDetails = Objects.requireNonNull(vmwareVmDetails, "expected parameter 'vmwareVmDetails' to be non-null");
    }

    private VmUtilizationInfoResponse() {
        this.utilization = null;
        this.vmId = null;
        this.vmwareVmDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmUtilizationMetricsResponse utilization;
        private String vmId;
        private VmwareVmDetailsResponse vmwareVmDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilization = defaults.utilization;
    	      this.vmId = defaults.vmId;
    	      this.vmwareVmDetails = defaults.vmwareVmDetails;
        }

        public Builder setUtilization(VmUtilizationMetricsResponse utilization) {
            this.utilization = Objects.requireNonNull(utilization);
            return this;
        }

        public Builder setVmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }

        public Builder setVmwareVmDetails(VmwareVmDetailsResponse vmwareVmDetails) {
            this.vmwareVmDetails = Objects.requireNonNull(vmwareVmDetails);
            return this;
        }

        public VmUtilizationInfoResponse build() {
            return new VmUtilizationInfoResponse(utilization, vmId, vmwareVmDetails);
        }
    }
}
