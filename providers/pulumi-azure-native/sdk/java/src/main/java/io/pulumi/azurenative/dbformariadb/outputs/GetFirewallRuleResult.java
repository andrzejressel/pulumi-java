// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetFirewallRuleResult {
    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    private final String endIpAddress;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    private final String startIpAddress;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetFirewallRuleResult(
        @OutputCustomType.Parameter("endIpAddress") String endIpAddress,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("startIpAddress") String startIpAddress,
        @OutputCustomType.Parameter("type") String type) {
        this.endIpAddress = endIpAddress;
        this.id = id;
        this.name = name;
        this.startIpAddress = startIpAddress;
        this.type = type;
    }

    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     * 
    */
    public String getEndIpAddress() {
        return this.endIpAddress;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The start IP address of the server firewall rule. Must be IPv4 format.
     * 
    */
    public String getStartIpAddress() {
        return this.startIpAddress;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endIpAddress;
        private String id;
        private String name;
        private String startIpAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.type = defaults.type;
        }

        public Builder setEndIpAddress(String endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStartIpAddress(String startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFirewallRuleResult build() {
            return new GetFirewallRuleResult(endIpAddress, id, name, startIpAddress, type);
        }
    }
}
