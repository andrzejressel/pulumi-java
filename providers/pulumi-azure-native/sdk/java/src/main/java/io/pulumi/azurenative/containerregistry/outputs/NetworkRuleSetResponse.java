// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.IPRuleResponse;
import io.pulumi.azurenative.containerregistry.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleSetResponse {
    /**
     * The default action of allow or deny when no other rules match.
     * 
     */
    private final String defaultAction;
    /**
     * The IP ACL rules.
     * 
     */
    private final @Nullable List<IPRuleResponse> ipRules;
    /**
     * The virtual network rules.
     * 
     */
    private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @OutputCustomType.Constructor
    private NetworkRuleSetResponse(
        @OutputCustomType.Parameter("defaultAction") String defaultAction,
        @OutputCustomType.Parameter("ipRules") @Nullable List<IPRuleResponse> ipRules,
        @OutputCustomType.Parameter("virtualNetworkRules") @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * The default action of allow or deny when no other rules match.
     * 
    */
    public String getDefaultAction() {
        return this.defaultAction;
    }
    /**
     * The IP ACL rules.
     * 
    */
    public List<IPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }
    /**
     * The virtual network rules.
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultAction;
        private @Nullable List<IPRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder setDefaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }

        public Builder setIpRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }

        public Builder setVirtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
