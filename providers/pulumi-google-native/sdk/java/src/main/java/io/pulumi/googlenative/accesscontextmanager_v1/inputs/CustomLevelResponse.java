// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ExprResponse;
import java.util.Objects;


/**
 * `CustomLevel` is an `AccessLevel` using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request. See CEL spec at: https://github.com/google/cel-spec
 * 
 */
public final class CustomLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomLevelResponse Empty = new CustomLevelResponse();

    /**
     * A Cloud CEL expression evaluating to a boolean.
     * 
     */
    @InputImport(name="expr", required=true)
    private final ExprResponse expr;

    public ExprResponse getExpr() {
        return this.expr;
    }

    public CustomLevelResponse(ExprResponse expr) {
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
    }

    private CustomLevelResponse() {
        this.expr = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse expr;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder setExpr(ExprResponse expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public CustomLevelResponse build() {
            return new CustomLevelResponse(expr);
        }
    }
}
