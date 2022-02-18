// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1beta1.outputs.DeploymentResponse;
import java.util.Objects;

@OutputCustomType
public final class GrafeasV1beta1DeploymentDetailsResponse {
    /**
     * Deployment history for the resource.
     * 
     */
    private final DeploymentResponse deployment;

    @OutputCustomType.Constructor({"deployment"})
    private GrafeasV1beta1DeploymentDetailsResponse(DeploymentResponse deployment) {
        this.deployment = Objects.requireNonNull(deployment);
    }

    /**
     * Deployment history for the resource.
     * 
     */
    public DeploymentResponse getDeployment() {
        return this.deployment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentResponse deployment;

        public Builder() {
    	      // Empty
        }

        public Builder(GrafeasV1beta1DeploymentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployment = defaults.deployment;
        }

        public Builder setDeployment(DeploymentResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }

        public GrafeasV1beta1DeploymentDetailsResponse build() {
            return new GrafeasV1beta1DeploymentDetailsResponse(deployment);
        }
    }
}
