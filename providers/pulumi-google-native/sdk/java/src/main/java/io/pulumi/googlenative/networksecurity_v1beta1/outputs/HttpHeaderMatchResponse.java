// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HttpHeaderMatchResponse {
    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
     * 
     */
    private final String headerName;
    /**
     * The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
     * 
     */
    private final String regexMatch;

    @OutputCustomType.Constructor({"headerName","regexMatch"})
    private HttpHeaderMatchResponse(
        String headerName,
        String regexMatch) {
        this.headerName = Objects.requireNonNull(headerName);
        this.regexMatch = Objects.requireNonNull(regexMatch);
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
     * 
     */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
     * 
     */
    public String getRegexMatch() {
        return this.regexMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setRegexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }

        public HttpHeaderMatchResponse build() {
            return new HttpHeaderMatchResponse(headerName, regexMatch);
        }
    }
}
