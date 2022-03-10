// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationDeploymentPolicyResponse {
    /**
     * The managed application deployment mode.
     * 
     */
    private final String deploymentMode;

    @OutputCustomType.Constructor
    private ApplicationDeploymentPolicyResponse(@OutputCustomType.Parameter("deploymentMode") String deploymentMode) {
        this.deploymentMode = deploymentMode;
    }

    /**
     * The managed application deployment mode.
     * 
    */
    public String getDeploymentMode() {
        return this.deploymentMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationDeploymentPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationDeploymentPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentMode = defaults.deploymentMode;
        }

        public Builder setDeploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }
        public ApplicationDeploymentPolicyResponse build() {
            return new ApplicationDeploymentPolicyResponse(deploymentMode);
        }
    }
}
