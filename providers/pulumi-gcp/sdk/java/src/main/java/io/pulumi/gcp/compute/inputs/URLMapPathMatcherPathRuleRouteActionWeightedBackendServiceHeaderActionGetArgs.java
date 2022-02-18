// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs Empty = new URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the backendService.
     * Structure is documented below.
     * 
     */
    @InputImport(name="requestHeadersToAdds")
    private final @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;

    public Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> getRequestHeadersToAdds() {
        return this.requestHeadersToAdds == null ? Input.empty() : this.requestHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the request prior to
     * forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToRemoves")
    private final @Nullable Input<List<String>> requestHeadersToRemoves;

    public Input<List<String>> getRequestHeadersToRemoves() {
        return this.requestHeadersToRemoves == null ? Input.empty() : this.requestHeadersToRemoves;
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @InputImport(name="responseHeadersToAdds")
    private final @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;

    public Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> getResponseHeadersToAdds() {
        return this.responseHeadersToAdds == null ? Input.empty() : this.responseHeadersToAdds;
    }

    /**
     * A list of header names for headers that need to be removed from the response prior to sending the
     * response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToRemoves")
    private final @Nullable Input<List<String>> responseHeadersToRemoves;

    public Input<List<String>> getResponseHeadersToRemoves() {
        return this.responseHeadersToRemoves == null ? Input.empty() : this.responseHeadersToRemoves;
    }

    public URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs(
        @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds,
        @Nullable Input<List<String>> requestHeadersToRemoves,
        @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds,
        @Nullable Input<List<String>> responseHeadersToRemoves) {
        this.requestHeadersToAdds = requestHeadersToAdds;
        this.requestHeadersToRemoves = requestHeadersToRemoves;
        this.responseHeadersToAdds = responseHeadersToAdds;
        this.responseHeadersToRemoves = responseHeadersToRemoves;
    }

    private URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs() {
        this.requestHeadersToAdds = Input.empty();
        this.requestHeadersToRemoves = Input.empty();
        this.responseHeadersToAdds = Input.empty();
        this.responseHeadersToRemoves = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds;
        private @Nullable Input<List<String>> requestHeadersToRemoves;
        private @Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds;
        private @Nullable Input<List<String>> responseHeadersToRemoves;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdds = defaults.requestHeadersToAdds;
    	      this.requestHeadersToRemoves = defaults.requestHeadersToRemoves;
    	      this.responseHeadersToAdds = defaults.responseHeadersToAdds;
    	      this.responseHeadersToRemoves = defaults.responseHeadersToRemoves;
        }

        public Builder setRequestHeadersToAdds(@Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs>> requestHeadersToAdds) {
            this.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        public Builder setRequestHeadersToAdds(@Nullable List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddGetArgs> requestHeadersToAdds) {
            this.requestHeadersToAdds = Input.ofNullable(requestHeadersToAdds);
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable Input<List<String>> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        public Builder setRequestHeadersToRemoves(@Nullable List<String> requestHeadersToRemoves) {
            this.requestHeadersToRemoves = Input.ofNullable(requestHeadersToRemoves);
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable Input<List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs>> responseHeadersToAdds) {
            this.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        public Builder setResponseHeadersToAdds(@Nullable List<URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddGetArgs> responseHeadersToAdds) {
            this.responseHeadersToAdds = Input.ofNullable(responseHeadersToAdds);
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable Input<List<String>> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        public Builder setResponseHeadersToRemoves(@Nullable List<String> responseHeadersToRemoves) {
            this.responseHeadersToRemoves = Input.ofNullable(responseHeadersToRemoves);
            return this;
        }

        public URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionGetArgs(requestHeadersToAdds, requestHeadersToRemoves, responseHeadersToAdds, responseHeadersToRemoves);
        }
    }
}
