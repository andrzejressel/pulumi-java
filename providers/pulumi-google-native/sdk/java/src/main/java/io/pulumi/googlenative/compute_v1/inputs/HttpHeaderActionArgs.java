// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderOptionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The request and response header transformations that take effect before the request is passed along to the selected backendService.
 * 
 */
public final class HttpHeaderActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHeaderActionArgs Empty = new HttpHeaderActionArgs();

    /**
     * Headers to add to a matching request before forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToAdd")
    private final @Nullable Input<List<HttpHeaderOptionArgs>> requestHeadersToAdd;

    public Input<List<HttpHeaderOptionArgs>> getRequestHeadersToAdd() {
        return this.requestHeadersToAdd == null ? Input.empty() : this.requestHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the request before forwarding the request to the backendService.
     * 
     */
    @InputImport(name="requestHeadersToRemove")
    private final @Nullable Input<List<String>> requestHeadersToRemove;

    public Input<List<String>> getRequestHeadersToRemove() {
        return this.requestHeadersToRemove == null ? Input.empty() : this.requestHeadersToRemove;
    }

    /**
     * Headers to add the response before sending the response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToAdd")
    private final @Nullable Input<List<HttpHeaderOptionArgs>> responseHeadersToAdd;

    public Input<List<HttpHeaderOptionArgs>> getResponseHeadersToAdd() {
        return this.responseHeadersToAdd == null ? Input.empty() : this.responseHeadersToAdd;
    }

    /**
     * A list of header names for headers that need to be removed from the response before sending the response back to the client.
     * 
     */
    @InputImport(name="responseHeadersToRemove")
    private final @Nullable Input<List<String>> responseHeadersToRemove;

    public Input<List<String>> getResponseHeadersToRemove() {
        return this.responseHeadersToRemove == null ? Input.empty() : this.responseHeadersToRemove;
    }

    public HttpHeaderActionArgs(
        @Nullable Input<List<HttpHeaderOptionArgs>> requestHeadersToAdd,
        @Nullable Input<List<String>> requestHeadersToRemove,
        @Nullable Input<List<HttpHeaderOptionArgs>> responseHeadersToAdd,
        @Nullable Input<List<String>> responseHeadersToRemove) {
        this.requestHeadersToAdd = requestHeadersToAdd;
        this.requestHeadersToRemove = requestHeadersToRemove;
        this.responseHeadersToAdd = responseHeadersToAdd;
        this.responseHeadersToRemove = responseHeadersToRemove;
    }

    private HttpHeaderActionArgs() {
        this.requestHeadersToAdd = Input.empty();
        this.requestHeadersToRemove = Input.empty();
        this.responseHeadersToAdd = Input.empty();
        this.responseHeadersToRemove = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HttpHeaderOptionArgs>> requestHeadersToAdd;
        private @Nullable Input<List<String>> requestHeadersToRemove;
        private @Nullable Input<List<HttpHeaderOptionArgs>> responseHeadersToAdd;
        private @Nullable Input<List<String>> responseHeadersToRemove;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeadersToAdd = defaults.requestHeadersToAdd;
    	      this.requestHeadersToRemove = defaults.requestHeadersToRemove;
    	      this.responseHeadersToAdd = defaults.responseHeadersToAdd;
    	      this.responseHeadersToRemove = defaults.responseHeadersToRemove;
        }

        public Builder setRequestHeadersToAdd(@Nullable Input<List<HttpHeaderOptionArgs>> requestHeadersToAdd) {
            this.requestHeadersToAdd = requestHeadersToAdd;
            return this;
        }

        public Builder setRequestHeadersToAdd(@Nullable List<HttpHeaderOptionArgs> requestHeadersToAdd) {
            this.requestHeadersToAdd = Input.ofNullable(requestHeadersToAdd);
            return this;
        }

        public Builder setRequestHeadersToRemove(@Nullable Input<List<String>> requestHeadersToRemove) {
            this.requestHeadersToRemove = requestHeadersToRemove;
            return this;
        }

        public Builder setRequestHeadersToRemove(@Nullable List<String> requestHeadersToRemove) {
            this.requestHeadersToRemove = Input.ofNullable(requestHeadersToRemove);
            return this;
        }

        public Builder setResponseHeadersToAdd(@Nullable Input<List<HttpHeaderOptionArgs>> responseHeadersToAdd) {
            this.responseHeadersToAdd = responseHeadersToAdd;
            return this;
        }

        public Builder setResponseHeadersToAdd(@Nullable List<HttpHeaderOptionArgs> responseHeadersToAdd) {
            this.responseHeadersToAdd = Input.ofNullable(responseHeadersToAdd);
            return this;
        }

        public Builder setResponseHeadersToRemove(@Nullable Input<List<String>> responseHeadersToRemove) {
            this.responseHeadersToRemove = responseHeadersToRemove;
            return this;
        }

        public Builder setResponseHeadersToRemove(@Nullable List<String> responseHeadersToRemove) {
            this.responseHeadersToRemove = Input.ofNullable(responseHeadersToRemove);
            return this;
        }

        public HttpHeaderActionArgs build() {
            return new HttpHeaderActionArgs(requestHeadersToAdd, requestHeadersToRemove, responseHeadersToAdd, responseHeadersToRemove);
        }
    }
}
