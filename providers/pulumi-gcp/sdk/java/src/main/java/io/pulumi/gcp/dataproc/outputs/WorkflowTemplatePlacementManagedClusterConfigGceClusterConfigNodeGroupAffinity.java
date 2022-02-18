// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity {
    /**
     * Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
     * 
     */
    private final String nodeGroup;

    @OutputCustomType.Constructor({"nodeGroup"})
    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity(String nodeGroup) {
        this.nodeGroup = Objects.requireNonNull(nodeGroup);
    }

    /**
     * Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
     * 
     */
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeGroup = defaults.nodeGroup;
        }

        public Builder setNodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity(nodeGroup);
        }
    }
}
