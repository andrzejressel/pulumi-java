// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a location to extract JWT from an API request.
 * 
 */
public final class JwtLocationResponse extends io.pulumi.resources.InvokeArgs {

    public static final JwtLocationResponse Empty = new JwtLocationResponse();

    /**
     * Specifies HTTP header name to extract JWT token.
     * 
     */
    @InputImport(name="header", required=true)
    private final String header;

    public String getHeader() {
        return this.header;
    }

    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    @InputImport(name="query", required=true)
    private final String query;

    public String getQuery() {
        return this.query;
    }

    /**
     * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer " with a space at the end.
     * 
     */
    @InputImport(name="valuePrefix", required=true)
    private final String valuePrefix;

    public String getValuePrefix() {
        return this.valuePrefix;
    }

    public JwtLocationResponse(
        String header,
        String query,
        String valuePrefix) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.valuePrefix = Objects.requireNonNull(valuePrefix, "expected parameter 'valuePrefix' to be non-null");
    }

    private JwtLocationResponse() {
        this.header = null;
        this.query = null;
        this.valuePrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private String query;
        private String valuePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.query = defaults.query;
    	      this.valuePrefix = defaults.valuePrefix;
        }

        public Builder setHeader(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setValuePrefix(String valuePrefix) {
            this.valuePrefix = Objects.requireNonNull(valuePrefix);
            return this;
        }

        public JwtLocationResponse build() {
            return new JwtLocationResponse(header, query, valuePrefix);
        }
    }
}
