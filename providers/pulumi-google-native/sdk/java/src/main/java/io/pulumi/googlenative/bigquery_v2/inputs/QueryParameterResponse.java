// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterTypeResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.QueryParameterValueResponse;
import java.lang.String;
import java.util.Objects;


public final class QueryParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryParameterResponse Empty = new QueryParameterResponse();

    /**
     * [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * [Required] The type of this parameter.
     * 
     */
    @InputImport(name="parameterType", required=true)
    private final QueryParameterTypeResponse parameterType;

    public QueryParameterTypeResponse getParameterType() {
        return this.parameterType;
    }

    /**
     * [Required] The value of this parameter.
     * 
     */
    @InputImport(name="parameterValue", required=true)
    private final QueryParameterValueResponse parameterValue;

    public QueryParameterValueResponse getParameterValue() {
        return this.parameterValue;
    }

    public QueryParameterResponse(
        String name,
        QueryParameterTypeResponse parameterType,
        QueryParameterValueResponse parameterValue) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameterType = Objects.requireNonNull(parameterType, "expected parameter 'parameterType' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private QueryParameterResponse() {
        this.name = null;
        this.parameterType = null;
        this.parameterValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private QueryParameterTypeResponse parameterType;
        private QueryParameterValueResponse parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameterType = defaults.parameterType;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameterType(QueryParameterTypeResponse parameterType) {
            this.parameterType = Objects.requireNonNull(parameterType);
            return this;
        }

        public Builder setParameterValue(QueryParameterValueResponse parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public QueryParameterResponse build() {
            return new QueryParameterResponse(name, parameterType, parameterValue);
        }
    }
}
