// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterWorkloadIdentityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterWorkloadIdentityConfigArgs Empty = new ClusterWorkloadIdentityConfigArgs();

    /**
     * The workload pool to attach all Kubernetes service accounts to.
     * 
     */
    @InputImport(name="workloadPool")
    private final @Nullable Input<String> workloadPool;

    public Input<String> getWorkloadPool() {
        return this.workloadPool == null ? Input.empty() : this.workloadPool;
    }

    public ClusterWorkloadIdentityConfigArgs(@Nullable Input<String> workloadPool) {
        this.workloadPool = workloadPool;
    }

    private ClusterWorkloadIdentityConfigArgs() {
        this.workloadPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterWorkloadIdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> workloadPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterWorkloadIdentityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workloadPool = defaults.workloadPool;
        }

        public Builder setWorkloadPool(@Nullable Input<String> workloadPool) {
            this.workloadPool = workloadPool;
            return this;
        }

        public Builder setWorkloadPool(@Nullable String workloadPool) {
            this.workloadPool = Input.ofNullable(workloadPool);
            return this;
        }

        public ClusterWorkloadIdentityConfigArgs build() {
            return new ClusterWorkloadIdentityConfigArgs(workloadPool);
        }
    }
}
