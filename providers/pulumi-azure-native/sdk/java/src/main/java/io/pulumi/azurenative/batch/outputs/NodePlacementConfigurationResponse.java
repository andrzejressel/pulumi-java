// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodePlacementConfigurationResponse {
    /**
     * Allocation policy used by Batch Service to provision the nodes. If not specified, Batch will use the regional policy.
     * 
     */
    private final @Nullable String policy;

    @OutputCustomType.Constructor
    private NodePlacementConfigurationResponse(@OutputCustomType.Parameter("policy") @Nullable String policy) {
        this.policy = policy;
    }

    /**
     * Allocation policy used by Batch Service to provision the nodes. If not specified, Batch will use the regional policy.
     * 
    */
    public Optional<String> getPolicy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePlacementConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePlacementConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public NodePlacementConfigurationResponse build() {
            return new NodePlacementConfigurationResponse(policy);
        }
    }
}
