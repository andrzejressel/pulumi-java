// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionTimeout;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionUrlRewrite;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleRouteAction {
    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy;
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionTimeout timeout;
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;
    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices;

    @OutputCustomType.Constructor({"corsPolicy","faultInjectionPolicy","requestMirrorPolicy","retryPolicy","timeout","urlRewrite","weightedBackendServices"})
    private URLMapPathMatcherRouteRuleRouteAction(
        @Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy,
        @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy,
        @Nullable URLMapPathMatcherRouteRuleRouteActionTimeout timeout,
        @Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite,
        @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionCorsPolicy> getCorsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy> getFaultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy> getRequestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleRouteActionUrlRewrite> getUrlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    public List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendService> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionTimeout timeout;
        private @Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;
        private @Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable URLMapPathMatcherRouteRuleRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUrlRewrite(@Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public URLMapPathMatcherRouteRuleRouteAction build() {
            return new URLMapPathMatcherRouteRuleRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
