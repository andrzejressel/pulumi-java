// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


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
    @InputImport(name="resourceUri")
    private final @Nullable Input<List<String>> resourceUri;

    public Input<List<String>> getResourceUri() {
        return this.resourceUri == null ? Input.empty() : this.resourceUri;
    }

    public DeployableArgs(@Nullable Input<List<String>> resourceUri) {
        this.resourceUri = resourceUri;
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
        private @Nullable Input<List<String>> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeployableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setResourceUri(@Nullable Input<List<String>> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setResourceUri(@Nullable List<String> resourceUri) {
            this.resourceUri = Input.ofNullable(resourceUri);
            return this;
        }

        public DeployableArgs build() {
            return new DeployableArgs(resourceUri);
        }
    }
}
