// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfig;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedCluster {
    /**
     * Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    private final String clusterName;
    /**
     * Required. The cluster configuration.
     * 
     */
    private final WorkflowTemplatePlacementManagedClusterConfig config;
    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    private final @Nullable Map<String,String> labels;

    @OutputCustomType.Constructor({"clusterName","config","labels"})
    private WorkflowTemplatePlacementManagedCluster(
        String clusterName,
        WorkflowTemplatePlacementManagedClusterConfig config,
        @Nullable Map<String,String> labels) {
        this.clusterName = Objects.requireNonNull(clusterName);
        this.config = Objects.requireNonNull(config);
        this.labels = labels;
    }

    /**
     * Required. The cluster name prefix. A unique cluster name will be formed by appending a random suffix. The name must contain only lower-case letters (a-z), numbers (0-9), and hyphens (-). Must begin with a letter. Cannot begin or end with hyphen. Must consist of between 2 and 35 characters.
     * 
     */
    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * Required. The cluster configuration.
     * 
     */
    public WorkflowTemplatePlacementManagedClusterConfig getConfig() {
        return this.config;
    }
    /**
     * Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private WorkflowTemplatePlacementManagedClusterConfig config;
        private @Nullable Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setConfig(WorkflowTemplatePlacementManagedClusterConfig config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public WorkflowTemplatePlacementManagedCluster build() {
            return new WorkflowTemplatePlacementManagedCluster(clusterName, config, labels);
        }
    }
}
