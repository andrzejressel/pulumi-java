// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.HttpRedirectActionRedirectResponseCode;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies settings for an HTTP redirect.
 * 
 */
public final class HttpRedirectActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRedirectActionArgs Empty = new HttpRedirectActionArgs();

    /**
     * The host that is used in the redirect response instead of the one that was supplied in the request. The value must be from 1 to 255 characters.
     * 
     */
    @InputImport(name="hostRedirect")
    private final @Nullable Input<String> hostRedirect;

    public Input<String> getHostRedirect() {
        return this.hostRedirect == null ? Input.empty() : this.hostRedirect;
    }

    /**
     * If set to true, the URL scheme in the redirected request is set to HTTPS. If set to false, the URL scheme of the redirected request remains the same as that of the request. This must only be set for URL maps used in TargetHttpProxys. Setting this true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
     */
    @InputImport(name="httpsRedirect")
    private final @Nullable Input<Boolean> httpsRedirect;

    public Input<Boolean> getHttpsRedirect() {
        return this.httpsRedirect == null ? Input.empty() : this.httpsRedirect;
    }

    /**
     * The path that is used in the redirect response instead of the one that was supplied in the request. pathRedirect cannot be supplied together with prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    @InputImport(name="pathRedirect")
    private final @Nullable Input<String> pathRedirect;

    public Input<String> getPathRedirect() {
        return this.pathRedirect == null ? Input.empty() : this.pathRedirect;
    }

    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch, retaining the remaining portion of the URL before redirecting the request. prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or neither. If neither is supplied, the path of the original request is used for the redirect. The value must be from 1 to 1024 characters.
     * 
     */
    @InputImport(name="prefixRedirect")
    private final @Nullable Input<String> prefixRedirect;

    public Input<String> getPrefixRedirect() {
        return this.prefixRedirect == null ? Input.empty() : this.prefixRedirect;
    }

    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
     * 
     */
    @InputImport(name="redirectResponseCode")
    private final @Nullable Input<HttpRedirectActionRedirectResponseCode> redirectResponseCode;

    public Input<HttpRedirectActionRedirectResponseCode> getRedirectResponseCode() {
        return this.redirectResponseCode == null ? Input.empty() : this.redirectResponseCode;
    }

    /**
     * If set to true, any accompanying query portion of the original URL is removed before redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    @InputImport(name="stripQuery")
    private final @Nullable Input<Boolean> stripQuery;

    public Input<Boolean> getStripQuery() {
        return this.stripQuery == null ? Input.empty() : this.stripQuery;
    }

    public HttpRedirectActionArgs(
        @Nullable Input<String> hostRedirect,
        @Nullable Input<Boolean> httpsRedirect,
        @Nullable Input<String> pathRedirect,
        @Nullable Input<String> prefixRedirect,
        @Nullable Input<HttpRedirectActionRedirectResponseCode> redirectResponseCode,
        @Nullable Input<Boolean> stripQuery) {
        this.hostRedirect = hostRedirect;
        this.httpsRedirect = httpsRedirect;
        this.pathRedirect = pathRedirect;
        this.prefixRedirect = prefixRedirect;
        this.redirectResponseCode = redirectResponseCode;
        this.stripQuery = stripQuery;
    }

    private HttpRedirectActionArgs() {
        this.hostRedirect = Input.empty();
        this.httpsRedirect = Input.empty();
        this.pathRedirect = Input.empty();
        this.prefixRedirect = Input.empty();
        this.redirectResponseCode = Input.empty();
        this.stripQuery = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRedirectActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostRedirect;
        private @Nullable Input<Boolean> httpsRedirect;
        private @Nullable Input<String> pathRedirect;
        private @Nullable Input<String> prefixRedirect;
        private @Nullable Input<HttpRedirectActionRedirectResponseCode> redirectResponseCode;
        private @Nullable Input<Boolean> stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRedirectActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder setHostRedirect(@Nullable Input<String> hostRedirect) {
            this.hostRedirect = hostRedirect;
            return this;
        }

        public Builder setHostRedirect(@Nullable String hostRedirect) {
            this.hostRedirect = Input.ofNullable(hostRedirect);
            return this;
        }

        public Builder setHttpsRedirect(@Nullable Input<Boolean> httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        public Builder setHttpsRedirect(@Nullable Boolean httpsRedirect) {
            this.httpsRedirect = Input.ofNullable(httpsRedirect);
            return this;
        }

        public Builder setPathRedirect(@Nullable Input<String> pathRedirect) {
            this.pathRedirect = pathRedirect;
            return this;
        }

        public Builder setPathRedirect(@Nullable String pathRedirect) {
            this.pathRedirect = Input.ofNullable(pathRedirect);
            return this;
        }

        public Builder setPrefixRedirect(@Nullable Input<String> prefixRedirect) {
            this.prefixRedirect = prefixRedirect;
            return this;
        }

        public Builder setPrefixRedirect(@Nullable String prefixRedirect) {
            this.prefixRedirect = Input.ofNullable(prefixRedirect);
            return this;
        }

        public Builder setRedirectResponseCode(@Nullable Input<HttpRedirectActionRedirectResponseCode> redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            return this;
        }

        public Builder setRedirectResponseCode(@Nullable HttpRedirectActionRedirectResponseCode redirectResponseCode) {
            this.redirectResponseCode = Input.ofNullable(redirectResponseCode);
            return this;
        }

        public Builder setStripQuery(@Nullable Input<Boolean> stripQuery) {
            this.stripQuery = stripQuery;
            return this;
        }

        public Builder setStripQuery(@Nullable Boolean stripQuery) {
            this.stripQuery = Input.ofNullable(stripQuery);
            return this;
        }

        public HttpRedirectActionArgs build() {
            return new HttpRedirectActionArgs(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}
