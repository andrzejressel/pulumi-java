// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs();

    /**
     * Optional. The Cloud KMS key name to use for PD disk encryption for all instances in the cluster.
     * 
     */
    @InputImport(name="gcePdKmsKeyName")
    private final @Nullable Input<String> gcePdKmsKeyName;

    public Input<String> getGcePdKmsKeyName() {
        return this.gcePdKmsKeyName == null ? Input.empty() : this.gcePdKmsKeyName;
    }

    public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs(@Nullable Input<String> gcePdKmsKeyName) {
        this.gcePdKmsKeyName = gcePdKmsKeyName;
    }

    private WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs() {
        this.gcePdKmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gcePdKmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcePdKmsKeyName = defaults.gcePdKmsKeyName;
        }

        public Builder setGcePdKmsKeyName(@Nullable Input<String> gcePdKmsKeyName) {
            this.gcePdKmsKeyName = gcePdKmsKeyName;
            return this;
        }

        public Builder setGcePdKmsKeyName(@Nullable String gcePdKmsKeyName) {
            this.gcePdKmsKeyName = Input.ofNullable(gcePdKmsKeyName);
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigEncryptionConfigArgs(gcePdKmsKeyName);
        }
    }
}
