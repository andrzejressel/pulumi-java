// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An artifact that can be deployed in some runtime.
 * 
 */
public final class DeployableArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeployableArgs Empty = new DeployableArgs();

    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    @InputImport(name="resourceUri", required=true)
    private final Input<List<String>> resourceUri;

    public Input<List<String>> getResourceUri() {
        return this.resourceUri;
    }

    public DeployableArgs(Input<List<String>> resourceUri) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DeployableArgs() {
        this.resourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeployableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setResourceUri(Input<List<String>> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setResourceUri(List<String> resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public DeployableArgs build() {
            return new DeployableArgs(resourceUri);
        }
    }
}
