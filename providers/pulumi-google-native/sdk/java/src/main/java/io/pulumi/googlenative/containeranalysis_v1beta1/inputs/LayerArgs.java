// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.enums.LayerDirective;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Layer holds metadata specific to a layer of a Docker image.
 * 
 */
public final class LayerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LayerArgs Empty = new LayerArgs();

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    @InputImport(name="arguments")
    private final @Nullable Input<String> arguments;

    public Input<String> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * The recovered Dockerfile directive used to construct this layer.
     * 
     */
    @InputImport(name="directive", required=true)
    private final Input<LayerDirective> directive;

    public Input<LayerDirective> getDirective() {
        return this.directive;
    }

    public LayerArgs(
        @Nullable Input<String> arguments,
        Input<LayerDirective> directive) {
        this.arguments = arguments;
        this.directive = Objects.requireNonNull(directive, "expected parameter 'directive' to be non-null");
    }

    private LayerArgs() {
        this.arguments = Input.empty();
        this.directive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arguments;
        private Input<LayerDirective> directive;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.directive = defaults.directive;
        }

        public Builder setArguments(@Nullable Input<String> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder setArguments(@Nullable String arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder setDirective(Input<LayerDirective> directive) {
            this.directive = Objects.requireNonNull(directive);
            return this;
        }

        public Builder setDirective(LayerDirective directive) {
            this.directive = Input.of(Objects.requireNonNull(directive));
            return this;
        }

        public LayerArgs build() {
            return new LayerArgs(arguments, directive);
        }
    }
}
