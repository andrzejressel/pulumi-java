// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction {
    /**
     * Describes a header to add.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds;
    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves;
    /**
     * Headers to add to the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds;
    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves;

    @OutputCustomType.Constructor({"requestHeaderToAdds","requestHeaderToRemoves","responseHeaderToAdds","responseHeaderToRemoves"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction(
        @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds,
        @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves,
        @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds,
        @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves) {
        this.requestHeaderToAdds = requestHeaderToAdds;
        this.requestHeaderToRemoves = requestHeaderToRemoves;
        this.responseHeaderToAdds = responseHeaderToAdds;
        this.responseHeaderToRemoves = responseHeaderToRemoves;
    }

    /**
     * Describes a header to add.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> getRequestHeaderToAdds() {
        return this.requestHeaderToAdds == null ? List.of() : this.requestHeaderToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> getRequestHeaderToRemoves() {
        return this.requestHeaderToRemoves == null ? List.of() : this.requestHeaderToRemoves;
    }
    /**
     * Headers to add to the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> getResponseHeaderToAdds() {
        return this.responseHeaderToAdds == null ? List.of() : this.responseHeaderToAdds;
    }
    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> getResponseHeaderToRemoves() {
        return this.responseHeaderToRemoves == null ? List.of() : this.responseHeaderToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds;
        private @Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderToAdds = defaults.requestHeaderToAdds;
    	      this.requestHeaderToRemoves = defaults.requestHeaderToRemoves;
    	      this.responseHeaderToAdds = defaults.responseHeaderToAdds;
    	      this.responseHeaderToRemoves = defaults.responseHeaderToRemoves;
        }

        public Builder setRequestHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAdd> requestHeaderToAdds) {
            this.requestHeaderToAdds = requestHeaderToAdds;
            return this;
        }

        public Builder setRequestHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemove> requestHeaderToRemoves) {
            this.requestHeaderToRemoves = requestHeaderToRemoves;
            return this;
        }

        public Builder setResponseHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAdd> responseHeaderToAdds) {
            this.responseHeaderToAdds = responseHeaderToAdds;
            return this;
        }

        public Builder setResponseHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemove> responseHeaderToRemoves) {
            this.responseHeaderToRemoves = responseHeaderToRemoves;
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction(requestHeaderToAdds, requestHeaderToRemoves, responseHeaderToAdds, responseHeaderToRemoves);
        }
    }
}
