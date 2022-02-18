// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1.inputs.ReplicaResponse;
import java.util.List;
import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload into the locations specified in Secret.replication.user_managed.replicas
 * 
 */
public final class UserManagedResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserManagedResponse Empty = new UserManagedResponse();

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    @InputImport(name="replicas", required=true)
    private final List<ReplicaResponse> replicas;

    public List<ReplicaResponse> getReplicas() {
        return this.replicas;
    }

    public UserManagedResponse(List<ReplicaResponse> replicas) {
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private UserManagedResponse() {
        this.replicas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserManagedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReplicaResponse> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(UserManagedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(List<ReplicaResponse> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public UserManagedResponse build() {
            return new UserManagedResponse(replicas);
        }
    }
}
