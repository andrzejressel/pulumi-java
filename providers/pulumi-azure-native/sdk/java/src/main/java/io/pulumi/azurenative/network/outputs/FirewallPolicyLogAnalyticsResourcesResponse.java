// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyLogAnalyticsWorkspaceResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyLogAnalyticsResourcesResponse {
    /**
     * The default workspace Id for Firewall Policy Insights.
     * 
     */
    private final @Nullable SubResourceResponse defaultWorkspaceId;
    /**
     * List of workspaces for Firewall Policy Insights.
     * 
     */
    private final @Nullable List<FirewallPolicyLogAnalyticsWorkspaceResponse> workspaces;

    @OutputCustomType.Constructor
    private FirewallPolicyLogAnalyticsResourcesResponse(
        @OutputCustomType.Parameter("defaultWorkspaceId") @Nullable SubResourceResponse defaultWorkspaceId,
        @OutputCustomType.Parameter("workspaces") @Nullable List<FirewallPolicyLogAnalyticsWorkspaceResponse> workspaces) {
        this.defaultWorkspaceId = defaultWorkspaceId;
        this.workspaces = workspaces;
    }

    /**
     * The default workspace Id for Firewall Policy Insights.
     * 
    */
    public Optional<SubResourceResponse> getDefaultWorkspaceId() {
        return Optional.ofNullable(this.defaultWorkspaceId);
    }
    /**
     * List of workspaces for Firewall Policy Insights.
     * 
    */
    public List<FirewallPolicyLogAnalyticsWorkspaceResponse> getWorkspaces() {
        return this.workspaces == null ? List.of() : this.workspaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyLogAnalyticsResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse defaultWorkspaceId;
        private @Nullable List<FirewallPolicyLogAnalyticsWorkspaceResponse> workspaces;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyLogAnalyticsResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultWorkspaceId = defaults.defaultWorkspaceId;
    	      this.workspaces = defaults.workspaces;
        }

        public Builder setDefaultWorkspaceId(@Nullable SubResourceResponse defaultWorkspaceId) {
            this.defaultWorkspaceId = defaultWorkspaceId;
            return this;
        }

        public Builder setWorkspaces(@Nullable List<FirewallPolicyLogAnalyticsWorkspaceResponse> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public FirewallPolicyLogAnalyticsResourcesResponse build() {
            return new FirewallPolicyLogAnalyticsResourcesResponse(defaultWorkspaceId, workspaces);
        }
    }
}
