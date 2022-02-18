// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specify CDN TTLs for response error codes.
 * 
 */
public final class BackendBucketCdnPolicyNegativeCachingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendBucketCdnPolicyNegativeCachingPolicyResponse Empty = new BackendBucketCdnPolicyNegativeCachingPolicyResponse();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @InputImport(name="code", required=true)
    private final Integer code;

    public Integer getCode() {
        return this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @InputImport(name="ttl", required=true)
    private final Integer ttl;

    public Integer getTtl() {
        return this.ttl;
    }

    public BackendBucketCdnPolicyNegativeCachingPolicyResponse(
        Integer code,
        Integer ttl) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
    }

    private BackendBucketCdnPolicyNegativeCachingPolicyResponse() {
        this.code = null;
        this.ttl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyNegativeCachingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyNegativeCachingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder setCode(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setTtl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public BackendBucketCdnPolicyNegativeCachingPolicyResponse build() {
            return new BackendBucketCdnPolicyNegativeCachingPolicyResponse(code, ttl);
        }
    }
}
