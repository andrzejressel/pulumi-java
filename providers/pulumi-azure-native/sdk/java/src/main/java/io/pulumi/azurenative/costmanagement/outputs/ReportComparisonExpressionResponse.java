// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ReportComparisonExpressionResponse {
    /**
     * The name of the column to use in comparison.
     * 
     */
    private final String name;
    /**
     * The operator to use for comparison.
     * 
     */
    private final String operator;
    /**
     * Array of values to use for comparison
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private ReportComparisonExpressionResponse(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("operator") String operator,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.operator = operator;
        this.values = values;
    }

    /**
     * The name of the column to use in comparison.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The operator to use for comparison.
     * 
    */
    public String getOperator() {
        return this.operator;
    }
    /**
     * Array of values to use for comparison
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportComparisonExpressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportComparisonExpressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ReportComparisonExpressionResponse build() {
            return new ReportComparisonExpressionResponse(name, operator, values);
        }
    }
}
