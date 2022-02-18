// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecVolumeSecretGetArgs;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecVolumeGetArgs Empty = new ServiceTemplateSpecVolumeGetArgs();

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The secret's value will be presented as the content of a file whose
     * name is defined in the item path. If no items are defined, the name of
     * the file is the secret_name.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secret", required=true)
    private final Input<ServiceTemplateSpecVolumeSecretGetArgs> secret;

    public Input<ServiceTemplateSpecVolumeSecretGetArgs> getSecret() {
        return this.secret;
    }

    public ServiceTemplateSpecVolumeGetArgs(
        Input<String> name,
        Input<ServiceTemplateSpecVolumeSecretGetArgs> secret) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServiceTemplateSpecVolumeGetArgs() {
        this.name = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<ServiceTemplateSpecVolumeSecretGetArgs> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSecret(Input<ServiceTemplateSpecVolumeSecretGetArgs> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(ServiceTemplateSpecVolumeSecretGetArgs secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }

        public ServiceTemplateSpecVolumeGetArgs build() {
            return new ServiceTemplateSpecVolumeGetArgs(name, secret);
        }
    }
}
