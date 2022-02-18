// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ExplainQueryStepResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExplainQueryStepResponse Empty = new ExplainQueryStepResponse();

    /**
     * Machine-readable operation type.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Human-readable stage descriptions.
     * 
     */
    @InputImport(name="substeps", required=true)
    private final List<String> substeps;

    public List<String> getSubsteps() {
        return this.substeps;
    }

    public ExplainQueryStepResponse(
        String kind,
        List<String> substeps) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.substeps = Objects.requireNonNull(substeps, "expected parameter 'substeps' to be non-null");
    }

    private ExplainQueryStepResponse() {
        this.kind = null;
        this.substeps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExplainQueryStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<String> substeps;

        public Builder() {
    	      // Empty
        }

        public Builder(ExplainQueryStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.substeps = defaults.substeps;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setSubsteps(List<String> substeps) {
            this.substeps = Objects.requireNonNull(substeps);
            return this;
        }

        public ExplainQueryStepResponse build() {
            return new ExplainQueryStepResponse(kind, substeps);
        }
    }
}
