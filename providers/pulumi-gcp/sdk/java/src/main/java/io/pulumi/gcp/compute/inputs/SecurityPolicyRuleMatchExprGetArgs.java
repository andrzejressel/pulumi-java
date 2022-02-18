// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SecurityPolicyRuleMatchExprGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleMatchExprGetArgs Empty = new SecurityPolicyRuleMatchExprGetArgs();

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * The application context of the containing message determines which well-known feature set of CEL is supported.
     * 
     */
    @InputImport(name="expression", required=true)
    private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    public SecurityPolicyRuleMatchExprGetArgs(Input<String> expression) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private SecurityPolicyRuleMatchExprGetArgs() {
        this.expression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatchExprGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatchExprGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public SecurityPolicyRuleMatchExprGetArgs build() {
            return new SecurityPolicyRuleMatchExprGetArgs(expression);
        }
    }
}
