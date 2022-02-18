// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceTemplateSpecVolumeSecret;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceTemplateSpecVolume {
    /**
     * Volume's name.
     * 
     */
    private final String name;
    /**
     * The secret's value will be presented as the content of a file whose
     * name is defined in the item path. If no items are defined, the name of
     * the file is the secret_name.
     * Structure is documented below.
     * 
     */
    private final ServiceTemplateSpecVolumeSecret secret;

    @OutputCustomType.Constructor({"name","secret"})
    private ServiceTemplateSpecVolume(
        String name,
        ServiceTemplateSpecVolumeSecret secret) {
        this.name = Objects.requireNonNull(name);
        this.secret = Objects.requireNonNull(secret);
    }

    /**
     * Volume's name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The secret's value will be presented as the content of a file whose
     * name is defined in the item path. If no items are defined, the name of
     * the file is the secret_name.
     * Structure is documented below.
     * 
     */
    public ServiceTemplateSpecVolumeSecret getSecret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private ServiceTemplateSpecVolumeSecret secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecret(ServiceTemplateSpecVolumeSecret secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public ServiceTemplateSpecVolume build() {
            return new ServiceTemplateSpecVolume(name, secret);
        }
    }
}
