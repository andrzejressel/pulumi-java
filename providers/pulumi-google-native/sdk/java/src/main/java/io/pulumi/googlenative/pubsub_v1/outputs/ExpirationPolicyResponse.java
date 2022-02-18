// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ExpirationPolicyResponse {
    /**
     * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
     * 
     */
    private final String ttl;

    @OutputCustomType.Constructor({"ttl"})
    private ExpirationPolicyResponse(String ttl) {
        this.ttl = Objects.requireNonNull(ttl);
    }

    /**
     * Specifies the "time-to-live" duration for an associated resource. The resource expires if it is not active for a period of `ttl`. The definition of "activity" depends on the type of the associated resource. The minimum and maximum allowed values for `ttl` depend on the type of the associated resource, as well. If `ttl` is not set, the associated resource never expires.
     * 
     */
    public String getTtl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpirationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpirationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ttl = defaults.ttl;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public ExpirationPolicyResponse build() {
            return new ExpirationPolicyResponse(ttl);
        }
    }
}
