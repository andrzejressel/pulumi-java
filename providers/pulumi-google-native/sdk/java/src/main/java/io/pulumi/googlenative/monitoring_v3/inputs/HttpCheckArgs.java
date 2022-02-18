// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.HttpCheckContentType;
import io.pulumi.googlenative.monitoring_v3.enums.HttpCheckRequestMethod;
import io.pulumi.googlenative.monitoring_v3.inputs.BasicAuthenticationArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information involved in an HTTP/HTTPS Uptime check request.
 * 
 */
public final class HttpCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpCheckArgs Empty = new HttpCheckArgs();

    /**
     * The authentication information. Optional when creating an HTTP check; defaults to empty.
     * 
     */
    @InputImport(name="authInfo")
    private final @Nullable Input<BasicAuthenticationArgs> authInfo;

    public Input<BasicAuthenticationArgs> getAuthInfo() {
        return this.authInfo == null ? Input.empty() : this.authInfo;
    }

    /**
     * The request body associated with the HTTP POST request. If content_type is URL_ENCODED, the body passed in must be URL-encoded. Users can provide a Content-Length header via the headers field or the API will do so. If the request_method is GET and body is not empty, the API will return an error. The maximum byte size is 1 megabyte.Note: If client libraries aren't used (which performs the conversion automatically) base64 encode your body data since the field is of bytes type.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<String> body;

    public Input<String> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * The content type header to use for the check. The following configurations result in errors: 1. Content type is specified in both the headers field and the content_type field. 2. Request method is GET and content_type is not TYPE_UNSPECIFIED 3. Request method is POST and content_type is TYPE_UNSPECIFIED. 4. Request method is POST and a "Content-Type" header is provided via headers field. The content_type field should be used instead.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<HttpCheckContentType> contentType;

    public Input<HttpCheckContentType> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The list of headers to send as part of the Uptime check request. If two headers have the same key and different values, they should be entered as a single header, with the value being a comma-separated list of all the desired values as described at https://www.w3.org/Protocols/rfc2616/rfc2616.txt (page 31). Entering two separate headers with the same key in a Create call will cause the first to be overwritten by the second. The maximum number of headers allowed is 100.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<Map<String,String>> headers;

    public Input<Map<String,String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Boolean specifying whether to encrypt the header information. Encryption should be specified for any headers related to authentication that you do not wish to be seen when retrieving the configuration. The server will be responsible for encrypting the headers. On Get/List calls, if mask_headers is set to true then the headers will be obscured with ******.
     * 
     */
    @InputImport(name="maskHeaders")
    private final @Nullable Input<Boolean> maskHeaders;

    public Input<Boolean> getMaskHeaders() {
        return this.maskHeaders == null ? Input.empty() : this.maskHeaders;
    }

    /**
     * Optional (defaults to "/"). The path to the page against which to run the check. Will be combined with the host (specified within the monitored_resource) and port to construct the full URL. If the provided path does not begin with "/", a "/" will be prepended automatically.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Optional (defaults to 80 when use_ssl is false, and 443 when use_ssl is true). The TCP port on the HTTP server against which to run the check. Will be combined with host (specified within the monitored_resource) and path to construct the full URL.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The HTTP request method to use for the check. If set to METHOD_UNSPECIFIED then request_method defaults to GET.
     * 
     */
    @InputImport(name="requestMethod")
    private final @Nullable Input<HttpCheckRequestMethod> requestMethod;

    public Input<HttpCheckRequestMethod> getRequestMethod() {
        return this.requestMethod == null ? Input.empty() : this.requestMethod;
    }

    /**
     * If true, use HTTPS instead of HTTP to run the check.
     * 
     */
    @InputImport(name="useSsl")
    private final @Nullable Input<Boolean> useSsl;

    public Input<Boolean> getUseSsl() {
        return this.useSsl == null ? Input.empty() : this.useSsl;
    }

    /**
     * Boolean specifying whether to include SSL certificate validation as a part of the Uptime check. Only applies to checks where monitored_resource is set to uptime_url. If use_ssl is false, setting validate_ssl to true has no effect.
     * 
     */
    @InputImport(name="validateSsl")
    private final @Nullable Input<Boolean> validateSsl;

    public Input<Boolean> getValidateSsl() {
        return this.validateSsl == null ? Input.empty() : this.validateSsl;
    }

    public HttpCheckArgs(
        @Nullable Input<BasicAuthenticationArgs> authInfo,
        @Nullable Input<String> body,
        @Nullable Input<HttpCheckContentType> contentType,
        @Nullable Input<Map<String,String>> headers,
        @Nullable Input<Boolean> maskHeaders,
        @Nullable Input<String> path,
        @Nullable Input<Integer> port,
        @Nullable Input<HttpCheckRequestMethod> requestMethod,
        @Nullable Input<Boolean> useSsl,
        @Nullable Input<Boolean> validateSsl) {
        this.authInfo = authInfo;
        this.body = body;
        this.contentType = contentType;
        this.headers = headers;
        this.maskHeaders = maskHeaders;
        this.path = path;
        this.port = port;
        this.requestMethod = requestMethod;
        this.useSsl = useSsl;
        this.validateSsl = validateSsl;
    }

    private HttpCheckArgs() {
        this.authInfo = Input.empty();
        this.body = Input.empty();
        this.contentType = Input.empty();
        this.headers = Input.empty();
        this.maskHeaders = Input.empty();
        this.path = Input.empty();
        this.port = Input.empty();
        this.requestMethod = Input.empty();
        this.useSsl = Input.empty();
        this.validateSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BasicAuthenticationArgs> authInfo;
        private @Nullable Input<String> body;
        private @Nullable Input<HttpCheckContentType> contentType;
        private @Nullable Input<Map<String,String>> headers;
        private @Nullable Input<Boolean> maskHeaders;
        private @Nullable Input<String> path;
        private @Nullable Input<Integer> port;
        private @Nullable Input<HttpCheckRequestMethod> requestMethod;
        private @Nullable Input<Boolean> useSsl;
        private @Nullable Input<Boolean> validateSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.body = defaults.body;
    	      this.contentType = defaults.contentType;
    	      this.headers = defaults.headers;
    	      this.maskHeaders = defaults.maskHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.requestMethod = defaults.requestMethod;
    	      this.useSsl = defaults.useSsl;
    	      this.validateSsl = defaults.validateSsl;
        }

        public Builder setAuthInfo(@Nullable Input<BasicAuthenticationArgs> authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder setAuthInfo(@Nullable BasicAuthenticationArgs authInfo) {
            this.authInfo = Input.ofNullable(authInfo);
            return this;
        }

        public Builder setBody(@Nullable Input<String> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable String body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setContentType(@Nullable Input<HttpCheckContentType> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable HttpCheckContentType contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setHeaders(@Nullable Input<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setMaskHeaders(@Nullable Input<Boolean> maskHeaders) {
            this.maskHeaders = maskHeaders;
            return this;
        }

        public Builder setMaskHeaders(@Nullable Boolean maskHeaders) {
            this.maskHeaders = Input.ofNullable(maskHeaders);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRequestMethod(@Nullable Input<HttpCheckRequestMethod> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setRequestMethod(@Nullable HttpCheckRequestMethod requestMethod) {
            this.requestMethod = Input.ofNullable(requestMethod);
            return this;
        }

        public Builder setUseSsl(@Nullable Input<Boolean> useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder setUseSsl(@Nullable Boolean useSsl) {
            this.useSsl = Input.ofNullable(useSsl);
            return this;
        }

        public Builder setValidateSsl(@Nullable Input<Boolean> validateSsl) {
            this.validateSsl = validateSsl;
            return this;
        }

        public Builder setValidateSsl(@Nullable Boolean validateSsl) {
            this.validateSsl = Input.ofNullable(validateSsl);
            return this;
        }

        public HttpCheckArgs build() {
            return new HttpCheckArgs(authInfo, body, contentType, headers, maskHeaders, path, port, requestMethod, useSsl, validateSsl);
        }
    }
}
