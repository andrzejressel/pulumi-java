// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class V2BrowserKeyRestrictionsResponse {
    /**
     * A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    private final List<String> allowedReferrers;

    @OutputCustomType.Constructor({"allowedReferrers"})
    private V2BrowserKeyRestrictionsResponse(List<String> allowedReferrers) {
        this.allowedReferrers = Objects.requireNonNull(allowedReferrers);
    }

    /**
     * A list of regular expressions for the referrer URLs that are allowed to make API calls with this key.
     * 
     */
    public List<String> getAllowedReferrers() {
        return this.allowedReferrers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2BrowserKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedReferrers;

        public Builder() {
    	      // Empty
        }

        public Builder(V2BrowserKeyRestrictionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedReferrers = defaults.allowedReferrers;
        }

        public Builder setAllowedReferrers(List<String> allowedReferrers) {
            this.allowedReferrers = Objects.requireNonNull(allowedReferrers);
            return this;
        }

        public V2BrowserKeyRestrictionsResponse build() {
            return new V2BrowserKeyRestrictionsResponse(allowedReferrers);
        }
    }
}
