// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.UrlMapTestHeaderArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message for the expected URL mappings.
 * 
 */
public final class UrlMapTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapTestArgs Empty = new UrlMapTestArgs();

    /**
     * Description of this test case.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer's redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    @InputImport(name="expectedOutputUrl")
    private final @Nullable Input<String> expectedOutputUrl;

    public Input<String> getExpectedOutputUrl() {
        return this.expectedOutputUrl == null ? Input.empty() : this.expectedOutputUrl;
    }

    /**
     * For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer's redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    @InputImport(name="expectedRedirectResponseCode")
    private final @Nullable Input<Integer> expectedRedirectResponseCode;

    public Input<Integer> getExpectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode == null ? Input.empty() : this.expectedRedirectResponseCode;
    }

    /**
     * HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    @InputImport(name="headers")
    private final @Nullable Input<List<UrlMapTestHeaderArgs>> headers;

    public Input<List<UrlMapTestHeaderArgs>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    /**
     * Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Path portion of the URL.
     * 
     */
    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public UrlMapTestArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> expectedOutputUrl,
        @Nullable Input<Integer> expectedRedirectResponseCode,
        @Nullable Input<List<UrlMapTestHeaderArgs>> headers,
        @Nullable Input<String> host,
        @Nullable Input<String> path,
        @Nullable Input<String> service) {
        this.description = description;
        this.expectedOutputUrl = expectedOutputUrl;
        this.expectedRedirectResponseCode = expectedRedirectResponseCode;
        this.headers = headers;
        this.host = host;
        this.path = path;
        this.service = service;
    }

    private UrlMapTestArgs() {
        this.description = Input.empty();
        this.expectedOutputUrl = Input.empty();
        this.expectedRedirectResponseCode = Input.empty();
        this.headers = Input.empty();
        this.host = Input.empty();
        this.path = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> expectedOutputUrl;
        private @Nullable Input<Integer> expectedRedirectResponseCode;
        private @Nullable Input<List<UrlMapTestHeaderArgs>> headers;
        private @Nullable Input<String> host;
        private @Nullable Input<String> path;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpectedOutputUrl(@Nullable Input<String> expectedOutputUrl) {
            this.expectedOutputUrl = expectedOutputUrl;
            return this;
        }

        public Builder setExpectedOutputUrl(@Nullable String expectedOutputUrl) {
            this.expectedOutputUrl = Input.ofNullable(expectedOutputUrl);
            return this;
        }

        public Builder setExpectedRedirectResponseCode(@Nullable Input<Integer> expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = expectedRedirectResponseCode;
            return this;
        }

        public Builder setExpectedRedirectResponseCode(@Nullable Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Input.ofNullable(expectedRedirectResponseCode);
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<UrlMapTestHeaderArgs>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<UrlMapTestHeaderArgs> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
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

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public UrlMapTestArgs build() {
            return new UrlMapTestArgs(description, expectedOutputUrl, expectedRedirectResponseCode, headers, host, path, service);
        }
    }
}
