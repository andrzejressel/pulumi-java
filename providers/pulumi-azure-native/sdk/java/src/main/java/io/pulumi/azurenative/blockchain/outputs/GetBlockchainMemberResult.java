// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.azurenative.blockchain.outputs.BlockchainMemberNodesSkuResponse;
import io.pulumi.azurenative.blockchain.outputs.FirewallRuleResponse;
import io.pulumi.azurenative.blockchain.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetBlockchainMemberResult {
    /**
     * Gets or sets the consortium for the blockchain member.
     * 
     */
    private final @Nullable String consortium;
    /**
     * Gets the managed consortium management account address.
     * 
     */
    private final String consortiumManagementAccountAddress;
    /**
     * Sets the managed consortium management account password.
     * 
     */
    private final @Nullable String consortiumManagementAccountPassword;
    /**
     * Gets the display name of the member in the consortium.
     * 
     */
    private final @Nullable String consortiumMemberDisplayName;
    /**
     * Gets the role of the member in the consortium.
     * 
     */
    private final @Nullable String consortiumRole;
    /**
     * Gets the dns endpoint of the blockchain member.
     * 
     */
    private final String dns;
    /**
     * Gets or sets firewall rules
     * 
     */
    private final @Nullable List<FirewallRuleResponse> firewallRules;
    /**
     * Fully qualified resource Id of the resource.
     * 
     */
    private final String id;
    /**
     * The GEO location of the blockchain service.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Sets the basic auth password of the blockchain member.
     * 
     */
    private final @Nullable String password;
    /**
     * Gets or sets the blockchain protocol.
     * 
     */
    private final @Nullable String protocol;
    /**
     * Gets or sets the blockchain member provision state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets the public key of the blockchain member (default transaction node).
     * 
     */
    private final String publicKey;
    /**
     * Gets the Ethereum root contract address of the blockchain.
     * 
     */
    private final String rootContractAddress;
    /**
     * Gets or sets the blockchain member Sku.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Tags of the service which is a list of key value pairs that describes the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
     */
    private final String type;
    /**
     * Gets the auth user name of the blockchain member.
     * 
     */
    private final String userName;
    /**
     * Gets or sets the blockchain validator nodes Sku.
     * 
     */
    private final @Nullable BlockchainMemberNodesSkuResponse validatorNodesSku;

    @OutputCustomType.Constructor
    private GetBlockchainMemberResult(
        @OutputCustomType.Parameter("consortium") @Nullable String consortium,
        @OutputCustomType.Parameter("consortiumManagementAccountAddress") String consortiumManagementAccountAddress,
        @OutputCustomType.Parameter("consortiumManagementAccountPassword") @Nullable String consortiumManagementAccountPassword,
        @OutputCustomType.Parameter("consortiumMemberDisplayName") @Nullable String consortiumMemberDisplayName,
        @OutputCustomType.Parameter("consortiumRole") @Nullable String consortiumRole,
        @OutputCustomType.Parameter("dns") String dns,
        @OutputCustomType.Parameter("firewallRules") @Nullable List<FirewallRuleResponse> firewallRules,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("password") @Nullable String password,
        @OutputCustomType.Parameter("protocol") @Nullable String protocol,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicKey") String publicKey,
        @OutputCustomType.Parameter("rootContractAddress") String rootContractAddress,
        @OutputCustomType.Parameter("sku") @Nullable SkuResponse sku,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userName") String userName,
        @OutputCustomType.Parameter("validatorNodesSku") @Nullable BlockchainMemberNodesSkuResponse validatorNodesSku) {
        this.consortium = consortium;
        this.consortiumManagementAccountAddress = consortiumManagementAccountAddress;
        this.consortiumManagementAccountPassword = consortiumManagementAccountPassword;
        this.consortiumMemberDisplayName = consortiumMemberDisplayName;
        this.consortiumRole = consortiumRole;
        this.dns = dns;
        this.firewallRules = firewallRules;
        this.id = id;
        this.location = location;
        this.name = name;
        this.password = password;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.rootContractAddress = rootContractAddress;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.userName = userName;
        this.validatorNodesSku = validatorNodesSku;
    }

    /**
     * Gets or sets the consortium for the blockchain member.
     * 
    */
    public Optional<String> getConsortium() {
        return Optional.ofNullable(this.consortium);
    }
    /**
     * Gets the managed consortium management account address.
     * 
    */
    public String getConsortiumManagementAccountAddress() {
        return this.consortiumManagementAccountAddress;
    }
    /**
     * Sets the managed consortium management account password.
     * 
    */
    public Optional<String> getConsortiumManagementAccountPassword() {
        return Optional.ofNullable(this.consortiumManagementAccountPassword);
    }
    /**
     * Gets the display name of the member in the consortium.
     * 
    */
    public Optional<String> getConsortiumMemberDisplayName() {
        return Optional.ofNullable(this.consortiumMemberDisplayName);
    }
    /**
     * Gets the role of the member in the consortium.
     * 
    */
    public Optional<String> getConsortiumRole() {
        return Optional.ofNullable(this.consortiumRole);
    }
    /**
     * Gets the dns endpoint of the blockchain member.
     * 
    */
    public String getDns() {
        return this.dns;
    }
    /**
     * Gets or sets firewall rules
     * 
    */
    public List<FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }
    /**
     * Fully qualified resource Id of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The GEO location of the blockchain service.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Sets the basic auth password of the blockchain member.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Gets or sets the blockchain protocol.
     * 
    */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Gets or sets the blockchain member provision state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets the public key of the blockchain member (default transaction node).
     * 
    */
    public String getPublicKey() {
        return this.publicKey;
    }
    /**
     * Gets the Ethereum root contract address of the blockchain.
     * 
    */
    public String getRootContractAddress() {
        return this.rootContractAddress;
    }
    /**
     * Gets or sets the blockchain member Sku.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Tags of the service which is a list of key value pairs that describes the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the service - e.g. "Microsoft.Blockchain"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets the auth user name of the blockchain member.
     * 
    */
    public String getUserName() {
        return this.userName;
    }
    /**
     * Gets or sets the blockchain validator nodes Sku.
     * 
    */
    public Optional<BlockchainMemberNodesSkuResponse> getValidatorNodesSku() {
        return Optional.ofNullable(this.validatorNodesSku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlockchainMemberResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consortium;
        private String consortiumManagementAccountAddress;
        private @Nullable String consortiumManagementAccountPassword;
        private @Nullable String consortiumMemberDisplayName;
        private @Nullable String consortiumRole;
        private String dns;
        private @Nullable List<FirewallRuleResponse> firewallRules;
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable String password;
        private @Nullable String protocol;
        private String provisioningState;
        private String publicKey;
        private String rootContractAddress;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String userName;
        private @Nullable BlockchainMemberNodesSkuResponse validatorNodesSku;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlockchainMemberResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consortium = defaults.consortium;
    	      this.consortiumManagementAccountAddress = defaults.consortiumManagementAccountAddress;
    	      this.consortiumManagementAccountPassword = defaults.consortiumManagementAccountPassword;
    	      this.consortiumMemberDisplayName = defaults.consortiumMemberDisplayName;
    	      this.consortiumRole = defaults.consortiumRole;
    	      this.dns = defaults.dns;
    	      this.firewallRules = defaults.firewallRules;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.rootContractAddress = defaults.rootContractAddress;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
    	      this.validatorNodesSku = defaults.validatorNodesSku;
        }

        public Builder setConsortium(@Nullable String consortium) {
            this.consortium = consortium;
            return this;
        }

        public Builder setConsortiumManagementAccountAddress(String consortiumManagementAccountAddress) {
            this.consortiumManagementAccountAddress = Objects.requireNonNull(consortiumManagementAccountAddress);
            return this;
        }

        public Builder setConsortiumManagementAccountPassword(@Nullable String consortiumManagementAccountPassword) {
            this.consortiumManagementAccountPassword = consortiumManagementAccountPassword;
            return this;
        }

        public Builder setConsortiumMemberDisplayName(@Nullable String consortiumMemberDisplayName) {
            this.consortiumMemberDisplayName = consortiumMemberDisplayName;
            return this;
        }

        public Builder setConsortiumRole(@Nullable String consortiumRole) {
            this.consortiumRole = consortiumRole;
            return this;
        }

        public Builder setDns(String dns) {
            this.dns = Objects.requireNonNull(dns);
            return this;
        }

        public Builder setFirewallRules(@Nullable List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setRootContractAddress(String rootContractAddress) {
            this.rootContractAddress = Objects.requireNonNull(rootContractAddress);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setValidatorNodesSku(@Nullable BlockchainMemberNodesSkuResponse validatorNodesSku) {
            this.validatorNodesSku = validatorNodesSku;
            return this;
        }
        public GetBlockchainMemberResult build() {
            return new GetBlockchainMemberResult(consortium, consortiumManagementAccountAddress, consortiumManagementAccountPassword, consortiumMemberDisplayName, consortiumRole, dns, firewallRules, id, location, name, password, protocol, provisioningState, publicKey, rootContractAddress, sku, tags, type, userName, validatorNodesSku);
        }
    }
}
