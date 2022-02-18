// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.LogConfigCounterOptionsCustomFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigCounterOptionsResponse Empty = new LogConfigCounterOptionsResponse();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="customFields", required=true)
    private final List<LogConfigCounterOptionsCustomFieldResponse> customFields;

    public List<LogConfigCounterOptionsCustomFieldResponse> getCustomFields() {
        return this.customFields;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="field", required=true)
    private final String field;

    public String getField() {
        return this.field;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @InputImport(name="metric", required=true)
    private final String metric;

    public String getMetric() {
        return this.metric;
    }

    public LogConfigCounterOptionsResponse(
        List<LogConfigCounterOptionsCustomFieldResponse> customFields,
        String field,
        String metric) {
        this.customFields = Objects.requireNonNull(customFields, "expected parameter 'customFields' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private LogConfigCounterOptionsResponse() {
        this.customFields = List.of();
        this.field = null;
        this.metric = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LogConfigCounterOptionsCustomFieldResponse> customFields;
        private String field;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder setCustomFields(List<LogConfigCounterOptionsCustomFieldResponse> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public LogConfigCounterOptionsResponse build() {
            return new LogConfigCounterOptionsResponse(customFields, field, metric);
        }
    }
}
