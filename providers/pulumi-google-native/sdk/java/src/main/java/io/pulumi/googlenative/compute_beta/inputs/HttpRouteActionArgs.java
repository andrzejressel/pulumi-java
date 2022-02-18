// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.CorsPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.DurationArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpFaultInjectionArgs;
import io.pulumi.googlenative.compute_beta.inputs.HttpRetryPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.RequestMirrorPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.UrlRewriteArgs;
import io.pulumi.googlenative.compute_beta.inputs.WeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteActionArgs Empty = new HttpRouteActionArgs();

    /**
     * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="corsPolicy")
    private final @Nullable Input<CorsPolicyArgs> corsPolicy;

    public Input<CorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Input.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
     * 
     */
    @InputImport(name="faultInjectionPolicy")
    private final @Nullable Input<HttpFaultInjectionArgs> faultInjectionPolicy;

    public Input<HttpFaultInjectionArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Input.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="maxStreamDuration")
    private final @Nullable Input<DurationArgs> maxStreamDuration;

    public Input<DurationArgs> getMaxStreamDuration() {
        return this.maxStreamDuration == null ? Input.empty() : this.maxStreamDuration;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="requestMirrorPolicy")
    private final @Nullable Input<RequestMirrorPolicyArgs> requestMirrorPolicy;

    public Input<RequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Input.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * 
     */
    @InputImport(name="retryPolicy")
    private final @Nullable Input<HttpRetryPolicyArgs> retryPolicy;

    public Input<HttpRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Input.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="timeout")
    private final @Nullable Input<DurationArgs> timeout;

    public Input<DurationArgs> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="urlRewrite")
    private final @Nullable Input<UrlRewriteArgs> urlRewrite;

    public Input<UrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Input.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * 
     */
    @InputImport(name="weightedBackendServices")
    private final @Nullable Input<List<WeightedBackendServiceArgs>> weightedBackendServices;

    public Input<List<WeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Input.empty() : this.weightedBackendServices;
    }

    public HttpRouteActionArgs(
        @Nullable Input<CorsPolicyArgs> corsPolicy,
        @Nullable Input<HttpFaultInjectionArgs> faultInjectionPolicy,
        @Nullable Input<DurationArgs> maxStreamDuration,
        @Nullable Input<RequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Input<HttpRetryPolicyArgs> retryPolicy,
        @Nullable Input<DurationArgs> timeout,
        @Nullable Input<UrlRewriteArgs> urlRewrite,
        @Nullable Input<List<WeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.maxStreamDuration = maxStreamDuration;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private HttpRouteActionArgs() {
        this.corsPolicy = Input.empty();
        this.faultInjectionPolicy = Input.empty();
        this.maxStreamDuration = Input.empty();
        this.requestMirrorPolicy = Input.empty();
        this.retryPolicy = Input.empty();
        this.timeout = Input.empty();
        this.urlRewrite = Input.empty();
        this.weightedBackendServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CorsPolicyArgs> corsPolicy;
        private @Nullable Input<HttpFaultInjectionArgs> faultInjectionPolicy;
        private @Nullable Input<DurationArgs> maxStreamDuration;
        private @Nullable Input<RequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Input<HttpRetryPolicyArgs> retryPolicy;
        private @Nullable Input<DurationArgs> timeout;
        private @Nullable Input<UrlRewriteArgs> urlRewrite;
        private @Nullable Input<List<WeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.maxStreamDuration = defaults.maxStreamDuration;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable Input<CorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setCorsPolicy(@Nullable CorsPolicyArgs corsPolicy) {
            this.corsPolicy = Input.ofNullable(corsPolicy);
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable Input<HttpFaultInjectionArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable HttpFaultInjectionArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Input.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder setMaxStreamDuration(@Nullable Input<DurationArgs> maxStreamDuration) {
            this.maxStreamDuration = maxStreamDuration;
            return this;
        }

        public Builder setMaxStreamDuration(@Nullable DurationArgs maxStreamDuration) {
            this.maxStreamDuration = Input.ofNullable(maxStreamDuration);
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable Input<RequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable RequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Input.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder setRetryPolicy(@Nullable Input<HttpRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable HttpRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Input.ofNullable(retryPolicy);
            return this;
        }

        public Builder setTimeout(@Nullable Input<DurationArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable DurationArgs timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setUrlRewrite(@Nullable Input<UrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setUrlRewrite(@Nullable UrlRewriteArgs urlRewrite) {
            this.urlRewrite = Input.ofNullable(urlRewrite);
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable Input<List<WeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<WeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Input.ofNullable(weightedBackendServices);
            return this;
        }

        public HttpRouteActionArgs build() {
            return new HttpRouteActionArgs(corsPolicy, faultInjectionPolicy, maxStreamDuration, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
