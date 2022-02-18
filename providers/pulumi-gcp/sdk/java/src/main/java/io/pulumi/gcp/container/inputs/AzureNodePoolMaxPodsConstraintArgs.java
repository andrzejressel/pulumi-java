// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class AzureNodePoolMaxPodsConstraintArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolMaxPodsConstraintArgs Empty = new AzureNodePoolMaxPodsConstraintArgs();

    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
     */
    @InputImport(name="maxPodsPerNode", required=true)
    private final Input<Integer> maxPodsPerNode;

    public Input<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public AzureNodePoolMaxPodsConstraintArgs(Input<Integer> maxPodsPerNode) {
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
    }

    private AzureNodePoolMaxPodsConstraintArgs() {
        this.maxPodsPerNode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolMaxPodsConstraintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolMaxPodsConstraintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder setMaxPodsPerNode(Input<Integer> maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Input.of(Objects.requireNonNull(maxPodsPerNode));
            return this;
        }

        public AzureNodePoolMaxPodsConstraintArgs build() {
            return new AzureNodePoolMaxPodsConstraintArgs(maxPodsPerNode);
        }
    }
}
