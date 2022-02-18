// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.VertexArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A bounding polygon for the detected image annotation.
 * 
 */
public final class BoundingPolyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BoundingPolyArgs Empty = new BoundingPolyArgs();

    /**
     * A description of this polygon.
     * 
     */
    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * List of the vertices of this polygon.
     * 
     */
    @InputImport(name="vertices")
    private final @Nullable Input<List<VertexArgs>> vertices;

    public Input<List<VertexArgs>> getVertices() {
        return this.vertices == null ? Input.empty() : this.vertices;
    }

    public BoundingPolyArgs(
        @Nullable Input<String> label,
        @Nullable Input<List<VertexArgs>> vertices) {
        this.label = label;
        this.vertices = vertices;
    }

    private BoundingPolyArgs() {
        this.label = Input.empty();
        this.vertices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> label;
        private @Nullable Input<List<VertexArgs>> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.vertices = defaults.vertices;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setVertices(@Nullable Input<List<VertexArgs>> vertices) {
            this.vertices = vertices;
            return this;
        }

        public Builder setVertices(@Nullable List<VertexArgs> vertices) {
            this.vertices = Input.ofNullable(vertices);
            return this;
        }

        public BoundingPolyArgs build() {
            return new BoundingPolyArgs(label, vertices);
        }
    }
}
