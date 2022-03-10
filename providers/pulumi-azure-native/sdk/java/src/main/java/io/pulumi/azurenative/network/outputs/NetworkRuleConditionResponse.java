// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkRuleConditionResponse {
    /**
     * Description of the rule condition.
     * 
     */
    private final @Nullable String description;
    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * List of destination IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> destinationIpGroups;
    /**
     * List of destination ports.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    private final @Nullable List<String> ipProtocols;
    /**
     * Name of the rule condition.
     * 
     */
    private final @Nullable String name;
    /**
     * Rule Condition Type.
     * Expected value is 'NetworkRuleCondition'.
     * 
     */
    private final String ruleConditionType;
    /**
     * List of source IP addresses for this rule.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * List of source IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;

    @OutputCustomType.Constructor
    private NetworkRuleConditionResponse(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @OutputCustomType.Parameter("destinationIpGroups") @Nullable List<String> destinationIpGroups,
        @OutputCustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @OutputCustomType.Parameter("ipProtocols") @Nullable List<String> ipProtocols,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("ruleConditionType") String ruleConditionType,
        @OutputCustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @OutputCustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = ruleConditionType;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    /**
     * Description of the rule condition.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of destination IP addresses or Service Tags.
     * 
    */
    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * List of destination IpGroups for this rule.
     * 
    */
    public List<String> getDestinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }
    /**
     * List of destination ports.
     * 
    */
    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
    */
    public List<String> getIpProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }
    /**
     * Name of the rule condition.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Rule Condition Type.
     * Expected value is 'NetworkRuleCondition'.
     * 
    */
    public String getRuleConditionType() {
        return this.ruleConditionType;
    }
    /**
     * List of source IP addresses for this rule.
     * 
    */
    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * List of source IpGroups for this rule.
     * 
    */
    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleConditionType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setIpProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public NetworkRuleConditionResponse build() {
            return new NetworkRuleConditionResponse(description, destinationAddresses, destinationIpGroups, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
