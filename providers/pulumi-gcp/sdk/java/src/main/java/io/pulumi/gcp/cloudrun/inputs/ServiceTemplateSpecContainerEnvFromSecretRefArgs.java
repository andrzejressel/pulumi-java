// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerEnvFromSecretRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvFromSecretRefArgs Empty = new ServiceTemplateSpecContainerEnvFromSecretRefArgs();

    /**
     * The Secret to select from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="localObjectReference")
    private final @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference;

    public Input<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> getLocalObjectReference() {
        return this.localObjectReference == null ? Input.empty() : this.localObjectReference;
    }

    /**
     * Specify whether the Secret must be defined
     * 
     */
    @InputImport(name="optional")
    private final @Nullable Input<Boolean> optional;

    public Input<Boolean> getOptional() {
        return this.optional == null ? Input.empty() : this.optional;
    }

    public ServiceTemplateSpecContainerEnvFromSecretRefArgs(
        @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference,
        @Nullable Input<Boolean> optional) {
        this.localObjectReference = localObjectReference;
        this.optional = optional;
    }

    private ServiceTemplateSpecContainerEnvFromSecretRefArgs() {
        this.localObjectReference = Input.empty();
        this.optional = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference;
        private @Nullable Input<Boolean> optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromSecretRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.optional = defaults.optional;
        }

        public Builder setLocalObjectReference(@Nullable Input<ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs> localObjectReference) {
            this.localObjectReference = localObjectReference;
            return this;
        }

        public Builder setLocalObjectReference(@Nullable ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReferenceArgs localObjectReference) {
            this.localObjectReference = Input.ofNullable(localObjectReference);
            return this;
        }

        public Builder setOptional(@Nullable Input<Boolean> optional) {
            this.optional = optional;
            return this;
        }

        public Builder setOptional(@Nullable Boolean optional) {
            this.optional = Input.ofNullable(optional);
            return this;
        }

        public ServiceTemplateSpecContainerEnvFromSecretRefArgs build() {
            return new ServiceTemplateSpecContainerEnvFromSecretRefArgs(localObjectReference, optional);
        }
    }
}
