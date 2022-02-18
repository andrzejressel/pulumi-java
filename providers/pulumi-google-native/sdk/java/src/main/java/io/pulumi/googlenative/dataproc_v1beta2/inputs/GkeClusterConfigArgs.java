// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NamespacedGkeDeploymentTargetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The GKE config for this cluster.
 * 
 */
public final class GkeClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GkeClusterConfigArgs Empty = new GkeClusterConfigArgs();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @InputImport(name="namespacedGkeDeploymentTarget")
    private final @Nullable Input<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

    public Input<NamespacedGkeDeploymentTargetArgs> getNamespacedGkeDeploymentTarget() {
        return this.namespacedGkeDeploymentTarget == null ? Input.empty() : this.namespacedGkeDeploymentTarget;
    }

    public GkeClusterConfigArgs(@Nullable Input<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
    }

    private GkeClusterConfigArgs() {
        this.namespacedGkeDeploymentTarget = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedGkeDeploymentTarget = defaults.namespacedGkeDeploymentTarget;
        }

        public Builder setNamespacedGkeDeploymentTarget(@Nullable Input<NamespacedGkeDeploymentTargetArgs> namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
            return this;
        }

        public Builder setNamespacedGkeDeploymentTarget(@Nullable NamespacedGkeDeploymentTargetArgs namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = Input.ofNullable(namespacedGkeDeploymentTarget);
            return this;
        }

        public GkeClusterConfigArgs build() {
            return new GkeClusterConfigArgs(namespacedGkeDeploymentTarget);
        }
    }
}
