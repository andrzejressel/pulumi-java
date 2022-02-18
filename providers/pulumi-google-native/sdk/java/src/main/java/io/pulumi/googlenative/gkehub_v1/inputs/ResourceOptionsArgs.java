// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceOptions represent options for Kubernetes resource generation.
 * 
 */
public final class ResourceOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceOptionsArgs Empty = new ResourceOptionsArgs();

    /**
     * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    @InputImport(name="connectVersion")
    private final @Nullable Input<String> connectVersion;

    public Input<String> getConnectVersion() {
        return this.connectVersion == null ? Input.empty() : this.connectVersion;
    }

    /**
     * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    @InputImport(name="k8sVersion")
    private final @Nullable Input<String> k8sVersion;

    public Input<String> getK8sVersion() {
        return this.k8sVersion == null ? Input.empty() : this.k8sVersion;
    }

    /**
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions <1.16.
     * 
     */
    @InputImport(name="v1beta1Crd")
    private final @Nullable Input<Boolean> v1beta1Crd;

    public Input<Boolean> getV1beta1Crd() {
        return this.v1beta1Crd == null ? Input.empty() : this.v1beta1Crd;
    }

    public ResourceOptionsArgs(
        @Nullable Input<String> connectVersion,
        @Nullable Input<String> k8sVersion,
        @Nullable Input<Boolean> v1beta1Crd) {
        this.connectVersion = connectVersion;
        this.k8sVersion = k8sVersion;
        this.v1beta1Crd = v1beta1Crd;
    }

    private ResourceOptionsArgs() {
        this.connectVersion = Input.empty();
        this.k8sVersion = Input.empty();
        this.v1beta1Crd = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectVersion;
        private @Nullable Input<String> k8sVersion;
        private @Nullable Input<Boolean> v1beta1Crd;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVersion = defaults.connectVersion;
    	      this.k8sVersion = defaults.k8sVersion;
    	      this.v1beta1Crd = defaults.v1beta1Crd;
        }

        public Builder setConnectVersion(@Nullable Input<String> connectVersion) {
            this.connectVersion = connectVersion;
            return this;
        }

        public Builder setConnectVersion(@Nullable String connectVersion) {
            this.connectVersion = Input.ofNullable(connectVersion);
            return this;
        }

        public Builder setK8sVersion(@Nullable Input<String> k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }

        public Builder setK8sVersion(@Nullable String k8sVersion) {
            this.k8sVersion = Input.ofNullable(k8sVersion);
            return this;
        }

        public Builder setV1beta1Crd(@Nullable Input<Boolean> v1beta1Crd) {
            this.v1beta1Crd = v1beta1Crd;
            return this;
        }

        public Builder setV1beta1Crd(@Nullable Boolean v1beta1Crd) {
            this.v1beta1Crd = Input.ofNullable(v1beta1Crd);
            return this;
        }

        public ResourceOptionsArgs build() {
            return new ResourceOptionsArgs(connectVersion, k8sVersion, v1beta1Crd);
        }
    }
}
