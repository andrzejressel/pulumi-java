// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LayerResponse {
    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    private final String arguments;
    /**
     * The recovered Dockerfile directive used to construct this layer. See https://docs.docker.com/engine/reference/builder/ for more information.
     * 
     */
    private final String directive;

    @OutputCustomType.Constructor({"arguments","directive"})
    private LayerResponse(
        String arguments,
        String directive) {
        this.arguments = Objects.requireNonNull(arguments);
        this.directive = Objects.requireNonNull(directive);
    }

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    public String getArguments() {
        return this.arguments;
    }
    /**
     * The recovered Dockerfile directive used to construct this layer. See https://docs.docker.com/engine/reference/builder/ for more information.
     * 
     */
    public String getDirective() {
        return this.directive;
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
