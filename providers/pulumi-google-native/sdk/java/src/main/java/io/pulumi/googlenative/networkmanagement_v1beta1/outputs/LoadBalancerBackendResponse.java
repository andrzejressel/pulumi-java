// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LoadBalancerBackendResponse {
    /**
     * Name of a Compute Engine instance or network endpoint.
     * 
     */
    private final String displayName;
    /**
     * A list of firewall rule URIs allowing probes from health check IP ranges.
     * 
     */
    private final List<String> healthCheckAllowingFirewallRules;
    /**
     * A list of firewall rule URIs blocking probes from health check IP ranges.
     * 
     */
    private final List<String> healthCheckBlockingFirewallRules;
    /**
     * State of the health check firewall configuration.
     * 
     */
    private final String healthCheckFirewallState;
    /**
     * URI of a Compute Engine instance or network endpoint.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"displayName","healthCheckAllowingFirewallRules","healthCheckBlockingFirewallRules","healthCheckFirewallState","uri"})
    private LoadBalancerBackendResponse(
        String displayName,
        List<String> healthCheckAllowingFirewallRules,
        List<String> healthCheckBlockingFirewallRules,
        String healthCheckFirewallState,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName);
        this.healthCheckAllowingFirewallRules = Objects.requireNonNull(healthCheckAllowingFirewallRules);
        this.healthCheckBlockingFirewallRules = Objects.requireNonNull(healthCheckBlockingFirewallRules);
        this.healthCheckFirewallState = Objects.requireNonNull(healthCheckFirewallState);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Name of a Compute Engine instance or network endpoint.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A list of firewall rule URIs allowing probes from health check IP ranges.
     * 
     */
    public List<String> getHealthCheckAllowingFirewallRules() {
        return this.healthCheckAllowingFirewallRules;
    }
    /**
     * A list of firewall rule URIs blocking probes from health check IP ranges.
     * 
     */
    public List<String> getHealthCheckBlockingFirewallRules() {
        return this.healthCheckBlockingFirewallRules;
    }
    /**
     * State of the health check firewall configuration.
     * 
     */
    public String getHealthCheckFirewallState() {
        return this.healthCheckFirewallState;
    }
    /**
     * URI of a Compute Engine instance or network endpoint.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private List<String> healthCheckAllowingFirewallRules;
        private List<String> healthCheckBlockingFirewallRules;
        private String healthCheckFirewallState;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.healthCheckAllowingFirewallRules = defaults.healthCheckAllowingFirewallRules;
    	      this.healthCheckBlockingFirewallRules = defaults.healthCheckBlockingFirewallRules;
    	      this.healthCheckFirewallState = defaults.healthCheckFirewallState;
    	      this.uri = defaults.uri;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setHealthCheckAllowingFirewallRules(List<String> healthCheckAllowingFirewallRules) {
            this.healthCheckAllowingFirewallRules = Objects.requireNonNull(healthCheckAllowingFirewallRules);
            return this;
        }

        public Builder setHealthCheckBlockingFirewallRules(List<String> healthCheckBlockingFirewallRules) {
            this.healthCheckBlockingFirewallRules = Objects.requireNonNull(healthCheckBlockingFirewallRules);
            return this;
        }

        public Builder setHealthCheckFirewallState(String healthCheckFirewallState) {
            this.healthCheckFirewallState = Objects.requireNonNull(healthCheckFirewallState);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public LoadBalancerBackendResponse build() {
            return new LoadBalancerBackendResponse(displayName, healthCheckAllowingFirewallRules, healthCheckBlockingFirewallRules, healthCheckFirewallState, uri);
        }
    }
}
