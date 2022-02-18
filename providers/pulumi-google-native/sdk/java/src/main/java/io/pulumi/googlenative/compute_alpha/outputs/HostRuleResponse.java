// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HostRuleResponse {
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    private final List<String> hosts;
    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * 
     */
    private final String pathMatcher;

    @OutputCustomType.Constructor({"description","hosts","pathMatcher"})
    private HostRuleResponse(
        String description,
        List<String> hosts,
        String pathMatcher) {
        this.description = Objects.requireNonNull(description);
        this.hosts = Objects.requireNonNull(hosts);
        this.pathMatcher = Objects.requireNonNull(pathMatcher);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character and must be followed in the pattern by either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public List<String> getHosts() {
        return this.hosts;
    }
    /**
     * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
     * 
     */
    public String getPathMatcher() {
        return this.pathMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<String> hosts;
        private String pathMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(HostRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.hosts = defaults.hosts;
    	      this.pathMatcher = defaults.pathMatcher;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setHosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setPathMatcher(String pathMatcher) {
            this.pathMatcher = Objects.requireNonNull(pathMatcher);
            return this;
        }

        public HostRuleResponse build() {
            return new HostRuleResponse(description, hosts, pathMatcher);
        }
    }
}
