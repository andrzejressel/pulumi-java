// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceTemplateSpecContainerPort {
    /**
     * Port number.
     * 
     */
    private final Integer containerPort;
    /**
     * Volume's name.
     * 
     */
    private final @Nullable String name;
    /**
     * Protocol used on port. Defaults to TCP.
     * 
     */
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"containerPort","name","protocol"})
    private ServiceTemplateSpecContainerPort(
        Integer containerPort,
        @Nullable String name,
        @Nullable String protocol) {
        this.containerPort = Objects.requireNonNull(containerPort);
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * Port number.
     * 
     */
    public Integer getContainerPort() {
        return this.containerPort;
    }
    /**
     * Volume's name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Protocol used on port. Defaults to TCP.
     * 
     */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private @Nullable String name;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ServiceTemplateSpecContainerPort build() {
            return new ServiceTemplateSpecContainerPort(containerPort, name, protocol);
        }
    }
}
