// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OwaspCrsExclusionEntryResponse {
    /**
     * The variable to be excluded.
     * 
     */
    private final String matchVariable;
    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
     */
    private final String selector;
    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
     */
    private final String selectorMatchOperator;

    @OutputCustomType.Constructor
    private OwaspCrsExclusionEntryResponse(
        @OutputCustomType.Parameter("matchVariable") String matchVariable,
        @OutputCustomType.Parameter("selector") String selector,
        @OutputCustomType.Parameter("selectorMatchOperator") String selectorMatchOperator) {
        this.matchVariable = matchVariable;
        this.selector = selector;
        this.selectorMatchOperator = selectorMatchOperator;
    }

    /**
     * The variable to be excluded.
     * 
    */
    public String getMatchVariable() {
        return this.matchVariable;
    }
    /**
     * When matchVariable is a collection, operator used to specify which elements in the collection this exclusion applies to.
     * 
    */
    public String getSelector() {
        return this.selector;
    }
    /**
     * When matchVariable is a collection, operate on the selector to specify which elements in the collection this exclusion applies to.
     * 
    */
    public String getSelectorMatchOperator() {
        return this.selectorMatchOperator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwaspCrsExclusionEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String matchVariable;
        private String selector;
        private String selectorMatchOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(OwaspCrsExclusionEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchVariable = defaults.matchVariable;
    	      this.selector = defaults.selector;
    	      this.selectorMatchOperator = defaults.selectorMatchOperator;
        }

        public Builder setMatchVariable(String matchVariable) {
            this.matchVariable = Objects.requireNonNull(matchVariable);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setSelectorMatchOperator(String selectorMatchOperator) {
            this.selectorMatchOperator = Objects.requireNonNull(selectorMatchOperator);
            return this;
        }
        public OwaspCrsExclusionEntryResponse build() {
            return new OwaspCrsExclusionEntryResponse(matchVariable, selector, selectorMatchOperator);
        }
    }
}
