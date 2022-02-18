// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryParameterTypeResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.QueryParameterValueResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class QueryParameterResponse {
    /**
     * [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
     * 
     */
    private final String name;
    /**
     * [Required] The type of this parameter.
     * 
     */
    private final QueryParameterTypeResponse parameterType;
    /**
     * [Required] The value of this parameter.
     * 
     */
    private final QueryParameterValueResponse parameterValue;

    @OutputCustomType.Constructor({"name","parameterType","parameterValue"})
    private QueryParameterResponse(
        String name,
        QueryParameterTypeResponse parameterType,
        QueryParameterValueResponse parameterValue) {
        this.name = Objects.requireNonNull(name);
        this.parameterType = Objects.requireNonNull(parameterType);
        this.parameterValue = Objects.requireNonNull(parameterValue);
    }

    /**
     * [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * [Required] The type of this parameter.
     * 
     */
    public QueryParameterTypeResponse getParameterType() {
        return this.parameterType;
    }
    /**
     * [Required] The value of this parameter.
     * 
     */
    public QueryParameterValueResponse getParameterValue() {
        return this.parameterValue;
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
