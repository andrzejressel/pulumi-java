// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.GetSecretReplicationUserManagedReplica;
import java.util.List;
import java.util.Objects;


public final class GetSecretReplicationUserManaged extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretReplicationUserManaged Empty = new GetSecretReplicationUserManaged();

    @InputImport(name="replicas", required=true)
    private final List<GetSecretReplicationUserManagedReplica> replicas;

    public List<GetSecretReplicationUserManagedReplica> getReplicas() {
        return this.replicas;
    }

    public GetSecretReplicationUserManaged(List<GetSecretReplicationUserManagedReplica> replicas) {
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private GetSecretReplicationUserManaged() {
        this.replicas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSecretReplicationUserManagedReplica> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(List<GetSecretReplicationUserManagedReplica> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public GetSecretReplicationUserManaged build() {
            return new GetSecretReplicationUserManaged(replicas);
        }
    }
}
