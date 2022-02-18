// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRedirectActionResponse;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRouteActionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A path-matching rule for a URL. If matched, will use the specified BackendService to handle the traffic arriving at this URL.
 * 
 */
public final class PathRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final PathRuleResponse Empty = new PathRuleResponse();

    /**
     * The list of path patterns to match. Each must start with / and the only place a * is allowed is at the end following a /. The string fed to the path matcher does not include any text after the first ? or #, and those chars are not allowed here.
     * 
     */
    @InputImport(name="paths", required=true)
    private final List<String> paths;

    public List<String> getPaths() {
        return this.paths;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of routeAction or urlRedirect must be set. URL maps for external HTTP(S) load balancers support only the urlRewrite action within a path rule's routeAction.
     * 
     */
    @InputImport(name="routeAction", required=true)
    private final HttpRouteActionResponse routeAction;

    public HttpRouteActionResponse getRouteAction() {
        return this.routeAction;
    }

    /**
     * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
     * 
     */
    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="urlRedirect", required=true)
    private final HttpRedirectActionResponse urlRedirect;

    public HttpRedirectActionResponse getUrlRedirect() {
        return this.urlRedirect;
    }

    public PathRuleResponse(
        List<String> paths,
        HttpRouteActionResponse routeAction,
        String service,
        HttpRedirectActionResponse urlRedirect) {
        this.paths = Objects.requireNonNull(paths, "expected parameter 'paths' to be non-null");
        this.routeAction = Objects.requireNonNull(routeAction, "expected parameter 'routeAction' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
        this.urlRedirect = Objects.requireNonNull(urlRedirect, "expected parameter 'urlRedirect' to be non-null");
    }

    private PathRuleResponse() {
        this.paths = List.of();
        this.routeAction = null;
        this.service = null;
        this.urlRedirect = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PathRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> paths;
        private HttpRouteActionResponse routeAction;
        private String service;
        private HttpRedirectActionResponse urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(PathRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.paths = defaults.paths;
    	      this.routeAction = defaults.routeAction;
    	      this.service = defaults.service;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder setPaths(List<String> paths) {
            this.paths = Objects.requireNonNull(paths);
            return this;
        }

        public Builder setRouteAction(HttpRouteActionResponse routeAction) {
            this.routeAction = Objects.requireNonNull(routeAction);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setUrlRedirect(HttpRedirectActionResponse urlRedirect) {
            this.urlRedirect = Objects.requireNonNull(urlRedirect);
            return this;
        }

        public PathRuleResponse build() {
            return new PathRuleResponse(paths, routeAction, service, urlRedirect);
        }
    }
}
