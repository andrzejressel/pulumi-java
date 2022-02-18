// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JwtLocationResponse {
    /**
     * Specifies HTTP header name to extract JWT token.
     * 
     */
    private final String header;
    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    private final String query;
    /**
     * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer " with a space at the end.
     * 
     */
    private final String valuePrefix;

    @OutputCustomType.Constructor({"header","query","valuePrefix"})
    private JwtLocationResponse(
        String header,
        String query,
        String valuePrefix) {
        this.header = Objects.requireNonNull(header);
        this.query = Objects.requireNonNull(query);
        this.valuePrefix = Objects.requireNonNull(valuePrefix);
    }

    /**
     * Specifies HTTP header name to extract JWT token.
     * 
     */
    public String getHeader() {
        return this.header;
    }
    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    public String getQuery() {
        return this.query;
    }
    /**
     * The value prefix. The value format is "value_prefix{token}" Only applies to "in" header type. Must be empty for "in" query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for "Authorization: Bearer {JWT}", value_prefix="Bearer " with a space at the end.
     * 
     */
    public String getValuePrefix() {
        return this.valuePrefix;
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
