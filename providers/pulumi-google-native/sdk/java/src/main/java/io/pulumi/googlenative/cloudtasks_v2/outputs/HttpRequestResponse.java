// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudtasks_v2.outputs.OAuthTokenResponse;
import io.pulumi.googlenative.cloudtasks_v2.outputs.OidcTokenResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class HttpRequestResponse {
    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod.
     * 
     */
    private final String body;
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB.
     * 
     */
    private final Map<String,String> headers;
    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    private final String httpMethod;
    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    private final OAuthTokenResponse oauthToken;
    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    private final OidcTokenResponse oidcToken;
    /**
     * The full url path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location` header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"body","headers","httpMethod","oauthToken","oidcToken","url"})
    private HttpRequestResponse(
        String body,
        Map<String,String> headers,
        String httpMethod,
        OAuthTokenResponse oauthToken,
        OidcTokenResponse oidcToken,
        String url) {
        this.body = Objects.requireNonNull(body);
        this.headers = Objects.requireNonNull(headers);
        this.httpMethod = Objects.requireNonNull(httpMethod);
        this.oauthToken = Objects.requireNonNull(oauthToken);
        this.oidcToken = Objects.requireNonNull(oidcToken);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST, PUT, or PATCH. It is an error to set body on a task with an incompatible HttpMethod.
     * 
     */
    public String getBody() {
        return this.body;
    }
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. These headers represent a subset of the headers that will accompany the task's HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `"Google-Cloud-Tasks"`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won't be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `"application/octet-stream"` or `"application/json"`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB.
     * 
     */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * The HTTP method to use for the request. The default is POST.
     * 
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    public OAuthTokenResponse getOauthToken() {
        return this.oauthToken;
    }
    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    public OidcTokenResponse getOidcToken() {
        return this.oidcToken;
    }
    /**
     * The full url path that the request will be sent to. This string must begin with either "http://" or "https://". Some examples are: `http://acme.com` and `https://acme.com/sales:8080`. Cloud Tasks will encode some characters for safety and compatibility. The maximum allowed URL length is 2083 characters after encoding. The `Location` header response from a redirect response [`300` - `399`] may be followed. The redirect is not counted as a separate attempt.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private OAuthTokenResponse oauthToken;
        private OidcTokenResponse oidcToken;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthToken = defaults.oauthToken;
    	      this.oidcToken = defaults.oidcToken;
    	      this.url = defaults.url;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOauthToken(OAuthTokenResponse oauthToken) {
            this.oauthToken = Objects.requireNonNull(oauthToken);
            return this;
        }

        public Builder setOidcToken(OidcTokenResponse oidcToken) {
            this.oidcToken = Objects.requireNonNull(oidcToken);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public HttpRequestResponse build() {
            return new HttpRequestResponse(body, headers, httpMethod, oauthToken, oidcToken, url);
        }
    }
}
