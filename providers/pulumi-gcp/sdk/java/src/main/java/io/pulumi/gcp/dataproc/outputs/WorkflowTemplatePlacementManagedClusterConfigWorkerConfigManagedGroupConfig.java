// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig {
    private final @Nullable String instanceGroupManagerName;
    private final @Nullable String instanceTemplateName;

    @OutputCustomType.Constructor({"instanceGroupManagerName","instanceTemplateName"})
    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig(
        @Nullable String instanceGroupManagerName,
        @Nullable String instanceTemplateName) {
        this.instanceGroupManagerName = instanceGroupManagerName;
        this.instanceTemplateName = instanceTemplateName;
    }

    public Optional<String> getInstanceGroupManagerName() {
        return Optional.ofNullable(this.instanceGroupManagerName);
    }
    public Optional<String> getInstanceTemplateName() {
        return Optional.ofNullable(this.instanceTemplateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceGroupManagerName;
        private @Nullable String instanceTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        public Builder setInstanceGroupManagerName(@Nullable String instanceGroupManagerName) {
            this.instanceGroupManagerName = instanceGroupManagerName;
            return this;
        }

        public Builder setInstanceTemplateName(@Nullable String instanceTemplateName) {
            this.instanceTemplateName = instanceTemplateName;
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfig(instanceGroupManagerName, instanceTemplateName);
        }
    }
}
