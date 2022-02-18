// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference {
    /**
     * The name of the Cloud Run Service.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(String name) {
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The name of the Cloud Run Service.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference build() {
            return new GetServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(name);
        }
    }
}
