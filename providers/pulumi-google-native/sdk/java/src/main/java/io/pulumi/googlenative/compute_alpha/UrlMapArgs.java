// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.HostRuleArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpHeaderActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRedirectActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpRouteActionArgs;
import io.pulumi.googlenative.compute_alpha.inputs.PathMatcherArgs;
import io.pulumi.googlenative.compute_alpha.inputs.UrlMapTestArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UrlMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapArgs Empty = new UrlMapArgs();

    /**
     * defaultRouteAction takes effect when none of the hostRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within defaultRouteAction. defaultRouteAction has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="defaultRouteAction")
    private final @Nullable Input<HttpRouteActionArgs> defaultRouteAction;

    public Input<HttpRouteActionArgs> getDefaultRouteAction() {
        return this.defaultRouteAction == null ? Input.empty() : this.defaultRouteAction;
    }

    /**
     * The full or partial URL of the defaultService resource to which traffic is directed if none of the hostRules match. If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. defaultService has no effect when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @InputImport(name="defaultService")
    private final @Nullable Input<String> defaultService;

    public Input<String> getDefaultService() {
        return this.defaultService == null ? Input.empty() : this.defaultService;
    }

    /**
     * When none of the specified hostRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="defaultUrlRedirect")
    private final @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect;

    public Input<HttpRedirectActionArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Input.empty() : this.defaultUrlRedirect;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction specified here take effect after headerAction specified under pathMatcher. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="headerAction")
    private final @Nullable Input<HttpHeaderActionArgs> headerAction;

    public Input<HttpHeaderActionArgs> getHeaderAction() {
        return this.headerAction == null ? Input.empty() : this.headerAction;
    }

    /**
     * The list of host rules to use against the URL.
     * 
     */
    @InputImport(name="hostRules")
    private final @Nullable Input<List<HostRuleArgs>> hostRules;

    public Input<List<HostRuleArgs>> getHostRules() {
        return this.hostRules == null ? Input.empty() : this.hostRules;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The list of named PathMatchers to use against the URL.
     * 
     */
    @InputImport(name="pathMatchers")
    private final @Nullable Input<List<PathMatcherArgs>> pathMatchers;

    public Input<List<PathMatcherArgs>> getPathMatchers() {
        return this.pathMatchers == null ? Input.empty() : this.pathMatchers;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The list of expected URL mapping tests. Request to update the UrlMap succeeds only if all test cases pass. You can specify a maximum of 100 tests per UrlMap. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="tests")
    private final @Nullable Input<List<UrlMapTestArgs>> tests;

    public Input<List<UrlMapTestArgs>> getTests() {
        return this.tests == null ? Input.empty() : this.tests;
    }

    public UrlMapArgs(
        @Nullable Input<HttpRouteActionArgs> defaultRouteAction,
        @Nullable Input<String> defaultService,
        @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect,
        @Nullable Input<String> description,
        @Nullable Input<HttpHeaderActionArgs> headerAction,
        @Nullable Input<List<HostRuleArgs>> hostRules,
        @Nullable Input<String> name,
        @Nullable Input<List<PathMatcherArgs>> pathMatchers,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<List<UrlMapTestArgs>> tests) {
        this.defaultRouteAction = defaultRouteAction;
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.headerAction = headerAction;
        this.hostRules = hostRules;
        this.name = name;
        this.pathMatchers = pathMatchers;
        this.project = project;
        this.requestId = requestId;
        this.tests = tests;
    }

    private UrlMapArgs() {
        this.defaultRouteAction = Input.empty();
        this.defaultService = Input.empty();
        this.defaultUrlRedirect = Input.empty();
        this.description = Input.empty();
        this.headerAction = Input.empty();
        this.hostRules = Input.empty();
        this.name = Input.empty();
        this.pathMatchers = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.tests = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<HttpRouteActionArgs> defaultRouteAction;
        private @Nullable Input<String> defaultService;
        private @Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect;
        private @Nullable Input<String> description;
        private @Nullable Input<HttpHeaderActionArgs> headerAction;
        private @Nullable Input<List<HostRuleArgs>> hostRules;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PathMatcherArgs>> pathMatchers;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<UrlMapTestArgs>> tests;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultRouteAction = defaults.defaultRouteAction;
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.hostRules = defaults.hostRules;
    	      this.name = defaults.name;
    	      this.pathMatchers = defaults.pathMatchers;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.tests = defaults.tests;
        }

        public Builder setDefaultRouteAction(@Nullable Input<HttpRouteActionArgs> defaultRouteAction) {
            this.defaultRouteAction = defaultRouteAction;
            return this;
        }

        public Builder setDefaultRouteAction(@Nullable HttpRouteActionArgs defaultRouteAction) {
            this.defaultRouteAction = Input.ofNullable(defaultRouteAction);
            return this;
        }

        public Builder setDefaultService(@Nullable Input<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder setDefaultService(@Nullable String defaultService) {
            this.defaultService = Input.ofNullable(defaultService);
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable Input<HttpRedirectActionArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable HttpRedirectActionArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Input.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHeaderAction(@Nullable Input<HttpHeaderActionArgs> headerAction) {
            this.headerAction = headerAction;
            return this;
        }

        public Builder setHeaderAction(@Nullable HttpHeaderActionArgs headerAction) {
            this.headerAction = Input.ofNullable(headerAction);
            return this;
        }

        public Builder setHostRules(@Nullable Input<List<HostRuleArgs>> hostRules) {
            this.hostRules = hostRules;
            return this;
        }

        public Builder setHostRules(@Nullable List<HostRuleArgs> hostRules) {
            this.hostRules = Input.ofNullable(hostRules);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPathMatchers(@Nullable Input<List<PathMatcherArgs>> pathMatchers) {
            this.pathMatchers = pathMatchers;
            return this;
        }

        public Builder setPathMatchers(@Nullable List<PathMatcherArgs> pathMatchers) {
            this.pathMatchers = Input.ofNullable(pathMatchers);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setTests(@Nullable Input<List<UrlMapTestArgs>> tests) {
            this.tests = tests;
            return this;
        }

        public Builder setTests(@Nullable List<UrlMapTestArgs> tests) {
            this.tests = Input.ofNullable(tests);
            return this;
        }

        public UrlMapArgs build() {
            return new UrlMapArgs(defaultRouteAction, defaultService, defaultUrlRedirect, description, headerAction, hostRules, name, pathMatchers, project, requestId, tests);
        }
    }
}
