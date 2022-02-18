// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


/**
 * A 2D coordinate in an image. The origin is the top-left.
 * 
 */
public final class VertexResponse extends io.pulumi.resources.InvokeArgs {

    public static final VertexResponse Empty = new VertexResponse();

    /**
     * X coordinate.
     * 
     */
    @InputImport(name="x", required=true)
    private final Double x;

    public Double getX() {
        return this.x;
    }

    /**
     * Y coordinate.
     * 
     */
    @InputImport(name="y", required=true)
    private final Double y;

    public Double getY() {
        return this.y;
    }

    public VertexResponse(
        Double x,
        Double y) {
        this.x = Objects.requireNonNull(x, "expected parameter 'x' to be non-null");
        this.y = Objects.requireNonNull(y, "expected parameter 'y' to be non-null");
    }

    private VertexResponse() {
        this.x = null;
        this.y = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double x;
        private Double y;

        public Builder() {
    	      // Empty
        }

        public Builder(VertexResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setX(Double x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setY(Double y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }

        public VertexResponse build() {
            return new VertexResponse(x, y);
        }
    }
}
