// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromConfigMapRefArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromArgs Empty = new ServiceTemplateSpecContainerEnvFromArgs();

    /**
     * The ConfigMap to select from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="configMapRef")
    private final @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef;

    public Input<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> getConfigMapRef() {
        return this.configMapRef == null ? Input.empty() : this.configMapRef;
    }

    /**
     * An optional identifier to prepend to each key in the ConfigMap.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secretRef")
    private final @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef;

    public Input<ServiceTemplateSpecContainerEnvFromSecretRefArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    public ServiceTemplateSpecContainerEnvFromArgs(
        @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef,
        @Nullable Input<String> prefix,
        @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    private ServiceTemplateSpecContainerEnvFromArgs() {
        this.configMapRef = Input.empty();
        this.prefix = Input.empty();
        this.secretRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef;
        private @Nullable Input<String> prefix;
        private @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder setConfigMapRef(@Nullable Input<ServiceTemplateSpecContainerEnvFromConfigMapRefArgs> configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }

        public Builder setConfigMapRef(@Nullable ServiceTemplateSpecContainerEnvFromConfigMapRefArgs configMapRef) {
            this.configMapRef = Input.ofNullable(configMapRef);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable ServiceTemplateSpecContainerEnvFromSecretRefArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public ServiceTemplateSpecContainerEnvFromArgs build() {
            return new ServiceTemplateSpecContainerEnvFromArgs(configMapRef, prefix, secretRef);
        }
    }
}
