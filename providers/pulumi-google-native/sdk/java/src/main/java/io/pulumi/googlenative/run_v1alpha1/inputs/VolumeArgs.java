// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapVolumeSourceArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.SecretVolumeSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    @InputImport(name="configMap")
    private final @Nullable Input<ConfigMapVolumeSourceArgs> configMap;

    public Input<ConfigMapVolumeSourceArgs> getConfigMap() {
        return this.configMap == null ? Input.empty() : this.configMap;
    }

    /**
     * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="secret")
    private final @Nullable Input<SecretVolumeSourceArgs> secret;

    public Input<SecretVolumeSourceArgs> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    public VolumeArgs(
        @Nullable Input<ConfigMapVolumeSourceArgs> configMap,
        @Nullable Input<String> name,
        @Nullable Input<SecretVolumeSourceArgs> secret) {
        this.configMap = configMap;
        this.name = name;
        this.secret = secret;
    }

    private VolumeArgs() {
        this.configMap = Input.empty();
        this.name = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapVolumeSourceArgs> configMap;
        private @Nullable Input<String> name;
        private @Nullable Input<SecretVolumeSourceArgs> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setConfigMap(@Nullable Input<ConfigMapVolumeSourceArgs> configMap) {
            this.configMap = configMap;
            return this;
        }

        public Builder setConfigMap(@Nullable ConfigMapVolumeSourceArgs configMap) {
            this.configMap = Input.ofNullable(configMap);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSecret(@Nullable Input<SecretVolumeSourceArgs> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable SecretVolumeSourceArgs secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public VolumeArgs build() {
            return new VolumeArgs(configMap, name, secret);
        }
    }
}
