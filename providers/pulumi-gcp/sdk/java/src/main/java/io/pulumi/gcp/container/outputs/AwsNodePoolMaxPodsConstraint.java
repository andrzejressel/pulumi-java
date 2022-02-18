// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AwsNodePoolMaxPodsConstraint {
    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
     */
    private final Integer maxPodsPerNode;

    @OutputCustomType.Constructor({"maxPodsPerNode"})
    private AwsNodePoolMaxPodsConstraint(Integer maxPodsPerNode) {
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
    }

    /**
     * Required. The maximum number of pods to schedule on a single node.
     * 
     */
    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolMaxPodsConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolMaxPodsConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public AwsNodePoolMaxPodsConstraint build() {
            return new AwsNodePoolMaxPodsConstraint(maxPodsPerNode);
        }
    }
}
