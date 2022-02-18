// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1.inputs.AppDevExperienceFeatureSpecArgs;
import io.pulumi.googlenative.gkehub_v1.inputs.MultiClusterIngressFeatureSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CommonFeatureSpec contains Hub-wide configuration information
 * 
 */
public final class CommonFeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommonFeatureSpecArgs Empty = new CommonFeatureSpecArgs();

    /**
     * Appdevexperience specific spec.
     * 
     */
    @InputImport(name="appdevexperience")
    private final @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience;

    public Input<AppDevExperienceFeatureSpecArgs> getAppdevexperience() {
        return this.appdevexperience == null ? Input.empty() : this.appdevexperience;
    }

    /**
     * Multicluster Ingress-specific spec.
     * 
     */
    @InputImport(name="multiclusteringress")
    private final @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

    public Input<MultiClusterIngressFeatureSpecArgs> getMulticlusteringress() {
        return this.multiclusteringress == null ? Input.empty() : this.multiclusteringress;
    }

    public CommonFeatureSpecArgs(
        @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience,
        @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
        this.appdevexperience = appdevexperience;
        this.multiclusteringress = multiclusteringress;
    }

    private CommonFeatureSpecArgs() {
        this.appdevexperience = Input.empty();
        this.multiclusteringress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience;
        private @Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder setAppdevexperience(@Nullable Input<AppDevExperienceFeatureSpecArgs> appdevexperience) {
            this.appdevexperience = appdevexperience;
            return this;
        }

        public Builder setAppdevexperience(@Nullable AppDevExperienceFeatureSpecArgs appdevexperience) {
            this.appdevexperience = Input.ofNullable(appdevexperience);
            return this;
        }

        public Builder setMulticlusteringress(@Nullable Input<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }

        public Builder setMulticlusteringress(@Nullable MultiClusterIngressFeatureSpecArgs multiclusteringress) {
            this.multiclusteringress = Input.ofNullable(multiclusteringress);
            return this;
        }

        public CommonFeatureSpecArgs build() {
            return new CommonFeatureSpecArgs(appdevexperience, multiclusteringress);
        }
    }
}
