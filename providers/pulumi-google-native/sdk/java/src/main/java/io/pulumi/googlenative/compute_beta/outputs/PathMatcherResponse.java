// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.HttpHeaderActionResponse;
import io.pulumi.googlenative.compute_beta.outputs.HttpRedirectActionResponse;
import io.pulumi.googlenative.compute_beta.outputs.HttpRouteActionResponse;
import io.pulumi.googlenative.compute_beta.outputs.HttpRouteRuleResponse;
import io.pulumi.googlenative.compute_beta.outputs.PathRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PathMatcherResponse {
    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
     */
    private final HttpRouteActionResponse defaultRouteAction;
    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    private final String defaultService;
    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    private final HttpRedirectActionResponse defaultUrlRedirect;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    private final HttpHeaderActionResponse headerAction;
    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    private final String name;
    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    private final List<PathRuleResponse> pathRules;
    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    private final List<HttpRouteRuleResponse> routeRules;

    @OutputCustomType.Constructor({"defaultRouteAction","defaultService","defaultUrlRedirect","description","headerAction","name","pathRules","routeRules"})
    private PathMatcherResponse(
        HttpRouteActionResponse defaultRouteAction,
        String defaultService,
        HttpRedirectActionResponse defaultUrlRedirect,
        String description,
        HttpHeaderActionResponse headerAction,
        String name,
        List<PathRuleResponse> pathRules,
        List<HttpRouteRuleResponse> routeRules) {
        this.defaultRouteAction = Objects.requireNonNull(defaultRouteAction);
        this.defaultService = Objects.requireNonNull(defaultService);
        this.defaultUrlRedirect = Objects.requireNonNull(defaultUrlRedirect);
        this.description = Objects.requireNonNull(description);
        this.headerAction = Objects.requireNonNull(headerAction);
        this.name = Objects.requireNonNull(name);
        this.pathRules = Objects.requireNonNull(pathRules);
        this.routeRules = Objects.requireNonNull(routeRules);
    }

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
     * 
     */
    public HttpRouteActionResponse getDefaultRouteAction() {
        return this.defaultRouteAction;
    }
    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    public String getDefaultService() {
        return this.defaultService;
    }
    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public HttpRedirectActionResponse getDefaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public HttpHeaderActionResponse getHeaderAction() {
        return this.headerAction;
    }
    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    public List<PathRuleResponse> getPathRules() {
        return this.pathRules;
    }
    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    public List<HttpRouteRuleResponse> getRouteRules() {
        return this.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteActionResponse defaultRouteAction;
        private String defaultService;
        private HttpRedirectActionResponse defaultUrlRedirect;
        private String description;
        private HttpHeaderActionResponse headerAction;
        private String name;
        private List<PathRuleResponse> pathRules;
        private List<HttpRouteRuleResponse> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(PathMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDefaultRouteAction(HttpRouteActionResponse defaultRouteAction) {
            this.defaultRouteAction = Objects.requireNonNull(defaultRouteAction);
            return this;
        }

        public Builder setDefaultService(String defaultService) {
            this.defaultService = Objects.requireNonNull(defaultService);
            return this;
        }

        public Builder setDefaultUrlRedirect(HttpRedirectActionResponse defaultUrlRedirect) {
            this.defaultUrlRedirect = Objects.requireNonNull(defaultUrlRedirect);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHeaderAction(HttpHeaderActionResponse headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPathRules(List<PathRuleResponse> pathRules) {
            this.pathRules = Objects.requireNonNull(pathRules);
            return this;
        }

        public Builder setRouteRules(List<HttpRouteRuleResponse> routeRules) {
            this.routeRules = Objects.requireNonNull(routeRules);
            return this;
        }

        public PathMatcherResponse build() {
            return new PathMatcherResponse(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, name, pathRules, routeRules);
        }
    }
}
