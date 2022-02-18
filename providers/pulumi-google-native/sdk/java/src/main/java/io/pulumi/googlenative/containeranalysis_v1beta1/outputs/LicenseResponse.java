// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LicenseResponse {
    /**
     * Comments
     * 
     */
    private final String comments;
    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    private final String expression;

    @OutputCustomType.Constructor({"comments","expression"})
    private LicenseResponse(
        String comments,
        String expression) {
        this.comments = Objects.requireNonNull(comments);
        this.expression = Objects.requireNonNull(expression);
    }

    /**
     * Comments
     * 
     */
    public String getComments() {
        return this.comments;
    }
    /**
     * Expression: https://spdx.github.io/spdx-spec/appendix-IV-SPDX-license-expressions/
     * 
     */
    public String getExpression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comments;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.expression = defaults.expression;
        }

        public Builder setComments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public LicenseResponse build() {
            return new LicenseResponse(comments, expression);
        }
    }
}
