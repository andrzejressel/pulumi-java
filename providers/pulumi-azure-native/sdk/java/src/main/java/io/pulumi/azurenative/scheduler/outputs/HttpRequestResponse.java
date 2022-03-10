// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.BasicAuthenticationResponse;
import io.pulumi.azurenative.scheduler.outputs.ClientCertAuthenticationResponse;
import io.pulumi.azurenative.scheduler.outputs.OAuthAuthenticationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HttpRequestResponse {
    /**
     * Gets or sets the authentication method of the request.
     * 
     */
    private final @Nullable Object authentication;
    /**
     * Gets or sets the request body.
     * 
     */
    private final @Nullable String body;
    /**
     * Gets or sets the headers.
     * 
     */
    private final @Nullable Map<String,String> headers;
    /**
     * Gets or sets the method of the request.
     * 
     */
    private final @Nullable String method;
    /**
     * Gets or sets the URI of the request.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor
    private HttpRequestResponse(
        @OutputCustomType.Parameter("authentication") @Nullable Object authentication,
        @OutputCustomType.Parameter("body") @Nullable String body,
        @OutputCustomType.Parameter("headers") @Nullable Map<String,String> headers,
        @OutputCustomType.Parameter("method") @Nullable String method,
        @OutputCustomType.Parameter("uri") @Nullable String uri) {
        this.authentication = authentication;
        this.body = body;
        this.headers = headers;
        this.method = method;
        this.uri = uri;
    }

    /**
     * Gets or sets the authentication method of the request.
     * 
    */
    public Optional<Object> getAuthentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Gets or sets the request body.
     * 
    */
    public Optional<String> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Gets or sets the headers.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * Gets or sets the method of the request.
     * 
    */
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Gets or sets the URI of the request.
     * 
    */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authentication;
        private @Nullable String body;
        private @Nullable Map<String,String> headers;
        private @Nullable String method;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.uri = defaults.uri;
        }

        public Builder setAuthentication(@Nullable Object authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = body;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public HttpRequestResponse build() {
            return new HttpRequestResponse(authentication, body, headers, method, uri);
        }
    }
}
