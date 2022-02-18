// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.EnumValueResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EnumResponse {
    /**
     * Enum value definitions.
     * 
     */
    private final List<EnumValueResponse> enumvalue;
    /**
     * Enum type name.
     * 
     */
    private final String name;
    /**
     * Protocol buffer options.
     * 
     */
    private final List<OptionResponse> options;
    /**
     * The source context.
     * 
     */
    private final SourceContextResponse sourceContext;
    /**
     * The source syntax.
     * 
     */
    private final String syntax;

    @OutputCustomType.Constructor({"enumvalue","name","options","sourceContext","syntax"})
    private EnumResponse(
        List<EnumValueResponse> enumvalue,
        String name,
        List<OptionResponse> options,
        SourceContextResponse sourceContext,
        String syntax) {
        this.enumvalue = Objects.requireNonNull(enumvalue);
        this.name = Objects.requireNonNull(name);
        this.options = Objects.requireNonNull(options);
        this.sourceContext = Objects.requireNonNull(sourceContext);
        this.syntax = Objects.requireNonNull(syntax);
    }

    /**
     * Enum value definitions.
     * 
     */
    public List<EnumValueResponse> getEnumvalue() {
        return this.enumvalue;
    }
    /**
     * Enum type name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Protocol buffer options.
     * 
     */
    public List<OptionResponse> getOptions() {
        return this.options;
    }
    /**
     * The source context.
     * 
     */
    public SourceContextResponse getSourceContext() {
        return this.sourceContext;
    }
    /**
     * The source syntax.
     * 
     */
    public String getSyntax() {
        return this.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EnumValueResponse> enumvalue;
        private String name;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumvalue = defaults.enumvalue;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder setEnumvalue(List<EnumValueResponse> enumvalue) {
            this.enumvalue = Objects.requireNonNull(enumvalue);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setSourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }

        public Builder setSyntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }

        public EnumResponse build() {
            return new EnumResponse(enumvalue, name, options, sourceContext, syntax);
        }
    }
}
