// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ControlResponse {
    /**
     * The service controller environment to use. If empty, no control plane feature (like quota and billing) will be enabled. The recommended value for most services is servicecontrol.googleapis.com
     * 
     */
    private final String environment;

    @OutputCustomType.Constructor({"environment"})
    private ControlResponse(String environment) {
        this.environment = Objects.requireNonNull(environment);
    }

    /**
     * The service controller environment to use. If empty, no control plane feature (like quota and billing) will be enabled. The recommended value for most services is servicecontrol.googleapis.com
     * 
     */
    public String getEnvironment() {
        return this.environment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environment;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
        }

        public Builder setEnvironment(String environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public ControlResponse build() {
            return new ControlResponse(environment);
        }
    }
}
