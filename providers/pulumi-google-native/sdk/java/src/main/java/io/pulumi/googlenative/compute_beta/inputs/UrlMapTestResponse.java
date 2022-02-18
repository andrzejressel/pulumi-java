// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.UrlMapTestHeaderResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message for the expected URL mappings.
 * 
 */
public final class UrlMapTestResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlMapTestResponse Empty = new UrlMapTestResponse();

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    @InputImport(name="expectedOutputUrl", required=true)
    private final String expectedOutputUrl;

    public String getExpectedOutputUrl() {
        return this.expectedOutputUrl;
    }

    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    @InputImport(name="expectedRedirectResponseCode", required=true)
    private final Integer expectedRedirectResponseCode;

    public Integer getExpectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode;
    }

    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    @InputImport(name="headers", required=true)
    private final List<UrlMapTestHeaderResponse> headers;

    public List<UrlMapTestHeaderResponse> getHeaders() {
        return this.headers;
    }

    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    public UrlMapTestResponse(
        String description,
        String expectedOutputUrl,
        Integer expectedRedirectResponseCode,
        List<UrlMapTestHeaderResponse> headers,
        String host,
        String path,
        String service) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl, "expected parameter 'expectedOutputUrl' to be non-null");
        this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode, "expected parameter 'expectedRedirectResponseCode' to be non-null");
        this.headers = Objects.requireNonNull(headers, "expected parameter 'headers' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private UrlMapTestResponse() {
        this.description = null;
        this.expectedOutputUrl = null;
        this.expectedRedirectResponseCode = null;
        this.headers = List.of();
        this.host = null;
        this.path = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String expectedOutputUrl;
        private Integer expectedRedirectResponseCode;
        private List<UrlMapTestHeaderResponse> headers;
        private String host;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpectedOutputUrl(String expectedOutputUrl) {
            this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl);
            return this;
        }

        public Builder setExpectedRedirectResponseCode(Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode);
            return this;
        }

        public Builder setHeaders(List<UrlMapTestHeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public UrlMapTestResponse build() {
            return new UrlMapTestResponse(description, expectedOutputUrl, expectedRedirectResponseCode, headers, host, path, service);
        }
    }
}
