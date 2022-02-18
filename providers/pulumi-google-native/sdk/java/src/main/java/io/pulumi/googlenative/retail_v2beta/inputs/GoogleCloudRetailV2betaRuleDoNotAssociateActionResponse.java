// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Prevents `query_term` from being associated with specified terms during search. Example: Don't associate "gShoe" and "cheap".
 * 
 */
public final class GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse Empty = new GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse();

    /**
     * Cannot contain duplicates or the query term. Can specify up to 100 terms.
     * 
     */
    @InputImport(name="doNotAssociateTerms", required=true)
    private final List<String> doNotAssociateTerms;

    public List<String> getDoNotAssociateTerms() {
        return this.doNotAssociateTerms;
    }

    /**
     * Terms from the search query. Will not consider do_not_associate_terms for search if in search query. Can specify up to 100 terms.
     * 
     */
    @InputImport(name="queryTerms", required=true)
    private final List<String> queryTerms;

    public List<String> getQueryTerms() {
        return this.queryTerms;
    }

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @InputImport(name="terms", required=true)
    private final List<String> terms;

    public List<String> getTerms() {
        return this.terms;
    }

    public GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse(
        List<String> doNotAssociateTerms,
        List<String> queryTerms,
        List<String> terms) {
        this.doNotAssociateTerms = Objects.requireNonNull(doNotAssociateTerms, "expected parameter 'doNotAssociateTerms' to be non-null");
        this.queryTerms = Objects.requireNonNull(queryTerms, "expected parameter 'queryTerms' to be non-null");
        this.terms = Objects.requireNonNull(terms, "expected parameter 'terms' to be non-null");
    }

    private GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse() {
        this.doNotAssociateTerms = List.of();
        this.queryTerms = List.of();
        this.terms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> doNotAssociateTerms;
        private List<String> queryTerms;
        private List<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doNotAssociateTerms = defaults.doNotAssociateTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.terms = defaults.terms;
        }

        public Builder setDoNotAssociateTerms(List<String> doNotAssociateTerms) {
            this.doNotAssociateTerms = Objects.requireNonNull(doNotAssociateTerms);
            return this;
        }

        public Builder setQueryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }

        public Builder setTerms(List<String> terms) {
            this.terms = Objects.requireNonNull(terms);
            return this;
        }

        public GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse build() {
            return new GoogleCloudRetailV2betaRuleDoNotAssociateActionResponse(doNotAssociateTerms, queryTerms, terms);
        }
    }
}
