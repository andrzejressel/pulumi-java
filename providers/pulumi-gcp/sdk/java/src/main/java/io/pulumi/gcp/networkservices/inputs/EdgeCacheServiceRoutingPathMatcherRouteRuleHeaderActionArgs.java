// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs();

    /**
     * Describes a header to add.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestHeaderToAdds")
    private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>> requestHeaderToAdds;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>> getRequestHeaderToAdds() {
        return this.requestHeaderToAdds == null ? Input.empty() : this.requestHeaderToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestHeaderToRemoves")
    private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>> requestHeaderToRemoves;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>> getRequestHeaderToRemoves() {
        return this.requestHeaderToRemoves == null ? Input.empty() : this.requestHeaderToRemoves;
    }

    /**
     * Headers to add to the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * Structure is documented below.
     * 
     */
    @InputImport(name="responseHeaderToAdds")
    private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>> responseHeaderToAdds;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>> getResponseHeaderToAdds() {
        return this.responseHeaderToAdds == null ? Input.empty() : this.responseHeaderToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to forwarding the request to the origin.
     * Structure is documented below.
     * 
     */
    @InputImport(name="responseHeaderToRemoves")
    private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>> responseHeaderToRemoves;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>> getResponseHeaderToRemoves() {
        return this.responseHeaderToRemoves == null ? Input.empty() : this.responseHeaderToRemoves;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs(
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>> requestHeaderToAdds,
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>> requestHeaderToRemoves,
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>> responseHeaderToAdds,
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>> responseHeaderToRemoves) {
        this.requestHeaderToAdds = requestHeaderToAdds;
        this.requestHeaderToRemoves = requestHeaderToRemoves;
        this.responseHeaderToAdds = responseHeaderToAdds;
        this.responseHeaderToRemoves = responseHeaderToRemoves;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs() {
        this.requestHeaderToAdds = Input.empty();
        this.requestHeaderToRemoves = Input.empty();
        this.responseHeaderToAdds = Input.empty();
        this.responseHeaderToRemoves = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>> requestHeaderToAdds;
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>> requestHeaderToRemoves;
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>> responseHeaderToAdds;
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>> responseHeaderToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderToAdds = defaults.requestHeaderToAdds;
    	      this.requestHeaderToRemoves = defaults.requestHeaderToRemoves;
    	      this.responseHeaderToAdds = defaults.responseHeaderToAdds;
    	      this.responseHeaderToRemoves = defaults.responseHeaderToRemoves;
        }

        public Builder setRequestHeaderToAdds(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs>> requestHeaderToAdds) {
            this.requestHeaderToAdds = requestHeaderToAdds;
            return this;
        }

        public Builder setRequestHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs> requestHeaderToAdds) {
            this.requestHeaderToAdds = Input.ofNullable(requestHeaderToAdds);
            return this;
        }

        public Builder setRequestHeaderToRemoves(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs>> requestHeaderToRemoves) {
            this.requestHeaderToRemoves = requestHeaderToRemoves;
            return this;
        }

        public Builder setRequestHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToRemoveArgs> requestHeaderToRemoves) {
            this.requestHeaderToRemoves = Input.ofNullable(requestHeaderToRemoves);
            return this;
        }

        public Builder setResponseHeaderToAdds(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs>> responseHeaderToAdds) {
            this.responseHeaderToAdds = responseHeaderToAdds;
            return this;
        }

        public Builder setResponseHeaderToAdds(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToAddArgs> responseHeaderToAdds) {
            this.responseHeaderToAdds = Input.ofNullable(responseHeaderToAdds);
            return this;
        }

        public Builder setResponseHeaderToRemoves(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs>> responseHeaderToRemoves) {
            this.responseHeaderToRemoves = responseHeaderToRemoves;
            return this;
        }

        public Builder setResponseHeaderToRemoves(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveArgs> responseHeaderToRemoves) {
            this.responseHeaderToRemoves = Input.ofNullable(responseHeaderToRemoves);
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionArgs(requestHeaderToAdds, requestHeaderToRemoves, responseHeaderToAdds, responseHeaderToRemoves);
        }
    }
}
