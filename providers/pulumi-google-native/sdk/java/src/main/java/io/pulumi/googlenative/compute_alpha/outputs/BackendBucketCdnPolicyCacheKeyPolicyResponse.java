// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BackendBucketCdnPolicyCacheKeyPolicyResponse {
    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    private final List<String> includeHttpHeaders;
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    private final List<String> queryStringWhitelist;

    @OutputCustomType.Constructor({"includeHttpHeaders","queryStringWhitelist"})
    private BackendBucketCdnPolicyCacheKeyPolicyResponse(
        List<String> includeHttpHeaders,
        List<String> queryStringWhitelist) {
        this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
        this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    public List<String> getIncludeHttpHeaders() {
        return this.includeHttpHeaders;
    }
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    public List<String> getQueryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> includeHttpHeaders;
        private List<String> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder setIncludeHttpHeaders(List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
            return this;
        }

        public Builder setQueryStringWhitelist(List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
            return this;
        }

        public BackendBucketCdnPolicyCacheKeyPolicyResponse build() {
            return new BackendBucketCdnPolicyCacheKeyPolicyResponse(includeHttpHeaders, queryStringWhitelist);
        }
    }
}
