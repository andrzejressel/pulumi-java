// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Layer holds metadata specific to a layer of a Docker image.
 * 
 */
public final class LayerResponse extends io.pulumi.resources.InvokeArgs {

    public static final LayerResponse Empty = new LayerResponse();

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    @InputImport(name="arguments", required=true)
    private final String arguments;

    public String getArguments() {
        return this.arguments;
    }

    /**
     * The recovered Dockerfile directive used to construct this layer.
     * 
     */
    @InputImport(name="directive", required=true)
    private final String directive;

    public String getDirective() {
        return this.directive;
    }

    public LayerResponse(
        String arguments,
        String directive) {
        this.arguments = Objects.requireNonNull(arguments, "expected parameter 'arguments' to be non-null");
        this.directive = Objects.requireNonNull(directive, "expected parameter 'directive' to be non-null");
    }

    private LayerResponse() {
        this.arguments = null;
        this.directive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arguments;
        private String directive;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.directive = defaults.directive;
        }

        public Builder setArguments(String arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder setDirective(String directive) {
            this.directive = Objects.requireNonNull(directive);
            return this;
        }

        public LayerResponse build() {
            return new LayerResponse(arguments, directive);
        }
    }
}
