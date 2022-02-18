// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingHostRule;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcher;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EdgeCacheServiceRouting {
    /**
     * The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    private final List<EdgeCacheServiceRoutingHostRule> hostRules;
    /**
     * The name of the pathMatcher associated with this hostRule.
     * 
     */
    private final List<EdgeCacheServiceRoutingPathMatcher> pathMatchers;

    @OutputCustomType.Constructor({"hostRules","pathMatchers"})
    private EdgeCacheServiceRouting(
        List<EdgeCacheServiceRoutingHostRule> hostRules,
        List<EdgeCacheServiceRoutingPathMatcher> pathMatchers) {
        this.hostRules = Objects.requireNonNull(hostRules);
        this.pathMatchers = Objects.requireNonNull(pathMatchers);
    }

    /**
     * The list of hostRules to match against. These rules define which hostnames the EdgeCacheService will match against, and which route configurations apply.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingHostRule> getHostRules() {
        return this.hostRules;
    }
    /**
     * The name of the pathMatcher associated with this hostRule.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcher> getPathMatchers() {
        return this.pathMatchers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRouting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EdgeCacheServiceRoutingHostRule> hostRules;
        private List<EdgeCacheServiceRoutingPathMatcher> pathMatchers;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRules = defaults.hostRules;
    	      this.pathMatchers = defaults.pathMatchers;
        }

        public Builder setHostRules(List<EdgeCacheServiceRoutingHostRule> hostRules) {
            this.hostRules = Objects.requireNonNull(hostRules);
            return this;
        }

        public Builder setPathMatchers(List<EdgeCacheServiceRoutingPathMatcher> pathMatchers) {
            this.pathMatchers = Objects.requireNonNull(pathMatchers);
            return this;
        }

        public EdgeCacheServiceRouting build() {
            return new EdgeCacheServiceRouting(hostRules, pathMatchers);
        }
    }
}
