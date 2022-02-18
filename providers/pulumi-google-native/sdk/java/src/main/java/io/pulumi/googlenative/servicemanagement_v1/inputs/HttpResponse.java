// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.HttpRuleResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


/**
 * Defines the HTTP configuration for an API service. It contains a list of HttpRule, each specifying the mapping of an RPC method to one or more HTTP REST API methods.
 * 
 */
public final class HttpResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpResponse Empty = new HttpResponse();

    /**
     * When set to true, URL path parameters will be fully URI-decoded except in cases of single segment matches in reserved expansion, where "%2F" will be left encoded. The default behavior is to not decode RFC 6570 reserved characters in multi segment matches.
     * 
     */
    @InputImport(name="fullyDecodeReservedExpansion", required=true)
    private final Boolean fullyDecodeReservedExpansion;

    public Boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion;
    }

    /**
     * A list of HTTP configuration rules that apply to individual API methods. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @InputImport(name="rules", required=true)
    private final List<HttpRuleResponse> rules;

    public List<HttpRuleResponse> getRules() {
        return this.rules;
    }

    public HttpResponse(
        Boolean fullyDecodeReservedExpansion,
        List<HttpRuleResponse> rules) {
        this.fullyDecodeReservedExpansion = Objects.requireNonNull(fullyDecodeReservedExpansion, "expected parameter 'fullyDecodeReservedExpansion' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private HttpResponse() {
        this.fullyDecodeReservedExpansion = null;
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean fullyDecodeReservedExpansion;
        private List<HttpRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullyDecodeReservedExpansion = defaults.fullyDecodeReservedExpansion;
    	      this.rules = defaults.rules;
        }

        public Builder setFullyDecodeReservedExpansion(Boolean fullyDecodeReservedExpansion) {
            this.fullyDecodeReservedExpansion = Objects.requireNonNull(fullyDecodeReservedExpansion);
            return this;
        }

        public Builder setRules(List<HttpRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public HttpResponse build() {
            return new HttpResponse(fullyDecodeReservedExpansion, rules);
        }
    }
}
