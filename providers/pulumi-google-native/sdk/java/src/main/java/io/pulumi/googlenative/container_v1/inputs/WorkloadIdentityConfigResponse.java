// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
 * 
 */
public final class WorkloadIdentityConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkloadIdentityConfigResponse Empty = new WorkloadIdentityConfigResponse();

    /**
     * The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    @InputImport(name="workloadPool", required=true)
    private final String workloadPool;

    public String getWorkloadPool() {
        return this.workloadPool;
    }

    public WorkloadIdentityConfigResponse(String workloadPool) {
        this.workloadPool = Objects.requireNonNull(workloadPool, "expected parameter 'workloadPool' to be non-null");
    }

    private WorkloadIdentityConfigResponse() {
        this.workloadPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadIdentityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadIdentityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder setWorkloadPool(String workloadPool) {
            this.workloadPool = Objects.requireNonNull(workloadPool);
            return this;
        }

        public WorkloadIdentityConfigResponse build() {
            return new WorkloadIdentityConfigResponse(workloadPool);
        }
    }
}
