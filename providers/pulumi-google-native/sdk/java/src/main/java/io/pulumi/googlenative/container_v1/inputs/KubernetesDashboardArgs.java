// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Kubernetes Dashboard.
 * 
 */
public final class KubernetesDashboardArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubernetesDashboardArgs Empty = new KubernetesDashboardArgs();

    /**
     * Whether the Kubernetes Dashboard is enabled for this cluster.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    public KubernetesDashboardArgs(@Nullable Input<Boolean> disabled) {
        this.disabled = disabled;
    }

    private KubernetesDashboardArgs() {
        this.disabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesDashboardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public KubernetesDashboardArgs build() {
            return new KubernetesDashboardArgs(disabled);
        }
    }
}
