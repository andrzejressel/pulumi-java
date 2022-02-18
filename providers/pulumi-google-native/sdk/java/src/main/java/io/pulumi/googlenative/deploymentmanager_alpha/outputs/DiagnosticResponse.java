// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiagnosticResponse {
    /**
     * JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    private final String field;
    /**
     * Level to record this diagnostic.
     * 
     */
    private final String level;

    @OutputCustomType.Constructor({"field","level"})
    private DiagnosticResponse(
        String field,
        String level) {
        this.field = Objects.requireNonNull(field);
        this.level = Objects.requireNonNull(level);
    }

    /**
     * JsonPath expression on the resource that if non empty, indicates that this field needs to be extracted as a diagnostic.
     * 
     */
    public String getField() {
        return this.field;
    }
    /**
     * Level to record this diagnostic.
     * 
     */
    public String getLevel() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String field;
        private String level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.level = defaults.level;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public DiagnosticResponse build() {
            return new DiagnosticResponse(field, level);
        }
    }
}
