// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on a list of allowed values.
 * 
 */
public final class ValueValidationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValueValidationResponse Empty = new ValueValidationResponse();

    /**
     * List of allowed values for the parameter.
     * 
     */
    @InputImport(name="values", required=true)
    private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public ValueValidationResponse(List<String> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ValueValidationResponse() {
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public ValueValidationResponse build() {
            return new ValueValidationResponse(values);
        }
    }
}
