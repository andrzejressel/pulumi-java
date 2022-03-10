// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.ExpressionRootResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWorkflowRunActionExpressionTracesResult {
    private final @Nullable List<ExpressionRootResponse> inputs;

    @OutputCustomType.Constructor
    private ListWorkflowRunActionExpressionTracesResult(@OutputCustomType.Parameter("inputs") @Nullable List<ExpressionRootResponse> inputs) {
        this.inputs = inputs;
    }

    public List<ExpressionRootResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowRunActionExpressionTracesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ExpressionRootResponse> inputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowRunActionExpressionTracesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
        }

        public Builder setInputs(@Nullable List<ExpressionRootResponse> inputs) {
            this.inputs = inputs;
            return this;
        }
        public ListWorkflowRunActionExpressionTracesResult build() {
            return new ListWorkflowRunActionExpressionTracesResult(inputs);
        }
    }
}
