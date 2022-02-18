// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1.inputs.RegexValidationArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.ValueValidationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for parameter validation.
 * 
 */
public final class ParameterValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValidationArgs Empty = new ParameterValidationArgs();

    /**
     * Validation based on regular expressions.
     * 
     */
    @InputImport(name="regex")
    private final @Nullable Input<RegexValidationArgs> regex;

    public Input<RegexValidationArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    /**
     * Validation based on a list of allowed values.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<ValueValidationArgs> values;

    public Input<ValueValidationArgs> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ParameterValidationArgs(
        @Nullable Input<RegexValidationArgs> regex,
        @Nullable Input<ValueValidationArgs> values) {
        this.regex = regex;
        this.values = values;
    }

    private ParameterValidationArgs() {
        this.regex = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegexValidationArgs> regex;
        private @Nullable Input<ValueValidationArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder setRegex(@Nullable Input<RegexValidationArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable RegexValidationArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setValues(@Nullable Input<ValueValidationArgs> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable ValueValidationArgs values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ParameterValidationArgs build() {
            return new ParameterValidationArgs(regex, values);
        }
    }
}
