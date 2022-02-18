// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationRegexGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationValuesGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateParameterValidationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterValidationGetArgs Empty = new WorkflowTemplateParameterValidationGetArgs();

    /**
     * Validation based on regular expressions.
     * 
     */
    @InputImport(name="regex")
    private final @Nullable Input<WorkflowTemplateParameterValidationRegexGetArgs> regex;

    public Input<WorkflowTemplateParameterValidationRegexGetArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<WorkflowTemplateParameterValidationValuesGetArgs> values;

    public Input<WorkflowTemplateParameterValidationValuesGetArgs> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public WorkflowTemplateParameterValidationGetArgs(
        @Nullable Input<WorkflowTemplateParameterValidationRegexGetArgs> regex,
        @Nullable Input<WorkflowTemplateParameterValidationValuesGetArgs> values) {
        this.regex = regex;
        this.values = values;
    }

    private WorkflowTemplateParameterValidationGetArgs() {
        this.regex = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowTemplateParameterValidationRegexGetArgs> regex;
        private @Nullable Input<WorkflowTemplateParameterValidationValuesGetArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder setRegex(@Nullable Input<WorkflowTemplateParameterValidationRegexGetArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable WorkflowTemplateParameterValidationRegexGetArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setValues(@Nullable Input<WorkflowTemplateParameterValidationValuesGetArgs> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable WorkflowTemplateParameterValidationValuesGetArgs values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public WorkflowTemplateParameterValidationGetArgs build() {
            return new WorkflowTemplateParameterValidationGetArgs(regex, values);
        }
    }
}
