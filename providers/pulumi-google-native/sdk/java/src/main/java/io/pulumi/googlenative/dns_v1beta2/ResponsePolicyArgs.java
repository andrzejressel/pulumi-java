// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.ResponsePolicyGKEClusterArgs;
import io.pulumi.googlenative.dns_v1beta2.inputs.ResponsePolicyNetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponsePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePolicyArgs Empty = new ResponsePolicyArgs();

    @InputImport(name="clientOperationId")
    private final @Nullable Input<String> clientOperationId;

    public Input<String> getClientOperationId() {
        return this.clientOperationId == null ? Input.empty() : this.clientOperationId;
    }

    /**
     * User-provided description for this Response Policy.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The list of Google Kubernetes Engine clusters to which this response policy is applied.
     * 
     */
    @InputImport(name="gkeClusters")
    private final @Nullable Input<List<ResponsePolicyGKEClusterArgs>> gkeClusters;

    public Input<List<ResponsePolicyGKEClusterArgs>> getGkeClusters() {
        return this.gkeClusters == null ? Input.empty() : this.gkeClusters;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * List of network names specifying networks to which this policy is applied.
     * 
     */
    @InputImport(name="networks")
    private final @Nullable Input<List<ResponsePolicyNetworkArgs>> networks;

    public Input<List<ResponsePolicyNetworkArgs>> getNetworks() {
        return this.networks == null ? Input.empty() : this.networks;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * User assigned name for this Response Policy.
     * 
     */
    @InputImport(name="responsePolicyName")
    private final @Nullable Input<String> responsePolicyName;

    public Input<String> getResponsePolicyName() {
        return this.responsePolicyName == null ? Input.empty() : this.responsePolicyName;
    }

    public ResponsePolicyArgs(
        @Nullable Input<String> clientOperationId,
        @Nullable Input<String> description,
        @Nullable Input<List<ResponsePolicyGKEClusterArgs>> gkeClusters,
        @Nullable Input<String> id,
        @Nullable Input<String> kind,
        @Nullable Input<List<ResponsePolicyNetworkArgs>> networks,
        @Nullable Input<String> project,
        @Nullable Input<String> responsePolicyName) {
        this.clientOperationId = clientOperationId;
        this.description = description;
        this.gkeClusters = gkeClusters;
        this.id = id;
        this.kind = kind;
        this.networks = networks;
        this.project = project;
        this.responsePolicyName = responsePolicyName;
    }

    private ResponsePolicyArgs() {
        this.clientOperationId = Input.empty();
        this.description = Input.empty();
        this.gkeClusters = Input.empty();
        this.id = Input.empty();
        this.kind = Input.empty();
        this.networks = Input.empty();
        this.project = Input.empty();
        this.responsePolicyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientOperationId;
        private @Nullable Input<String> description;
        private @Nullable Input<List<ResponsePolicyGKEClusterArgs>> gkeClusters;
        private @Nullable Input<String> id;
        private @Nullable Input<String> kind;
        private @Nullable Input<List<ResponsePolicyNetworkArgs>> networks;
        private @Nullable Input<String> project;
        private @Nullable Input<String> responsePolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.gkeClusters = defaults.gkeClusters;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
    	      this.project = defaults.project;
    	      this.responsePolicyName = defaults.responsePolicyName;
        }

        public Builder setClientOperationId(@Nullable Input<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }

        public Builder setClientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Input.ofNullable(clientOperationId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGkeClusters(@Nullable Input<List<ResponsePolicyGKEClusterArgs>> gkeClusters) {
            this.gkeClusters = gkeClusters;
            return this;
        }

        public Builder setGkeClusters(@Nullable List<ResponsePolicyGKEClusterArgs> gkeClusters) {
            this.gkeClusters = Input.ofNullable(gkeClusters);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setNetworks(@Nullable Input<List<ResponsePolicyNetworkArgs>> networks) {
            this.networks = networks;
            return this;
        }

        public Builder setNetworks(@Nullable List<ResponsePolicyNetworkArgs> networks) {
            this.networks = Input.ofNullable(networks);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setResponsePolicyName(@Nullable Input<String> responsePolicyName) {
            this.responsePolicyName = responsePolicyName;
            return this;
        }

        public Builder setResponsePolicyName(@Nullable String responsePolicyName) {
            this.responsePolicyName = Input.ofNullable(responsePolicyName);
            return this;
        }

        public ResponsePolicyArgs build() {
            return new ResponsePolicyArgs(clientOperationId, description, gkeClusters, id, kind, networks, project, responsePolicyName);
        }
    }
}
