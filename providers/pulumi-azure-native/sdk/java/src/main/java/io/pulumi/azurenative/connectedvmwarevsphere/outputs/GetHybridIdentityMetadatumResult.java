// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.IdentityResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHybridIdentityMetadatumResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final IdentityResponse identity;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Gets or sets the Public Key.
     * 
     */
    private final @Nullable String publicKey;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Gets or sets the Vm Id.
     * 
     */
    private final @Nullable String vmId;

    @OutputCustomType.Constructor
    private GetHybridIdentityMetadatumResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") IdentityResponse identity,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicKey") @Nullable String publicKey,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("vmId") @Nullable String vmId) {
        this.id = id;
        this.identity = identity;
        this.name = name;
        this.provisioningState = provisioningState;
        this.publicKey = publicKey;
        this.systemData = systemData;
        this.type = type;
        this.vmId = vmId;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public IdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Gets or sets the Public Key.
     * 
    */
    public Optional<String> getPublicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets the Vm Id.
     * 
    */
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridIdentityMetadatumResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private IdentityResponse identity;
        private String name;
        private String provisioningState;
        private @Nullable String publicKey;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridIdentityMetadatumResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.vmId = defaults.vmId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(IdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }
        public GetHybridIdentityMetadatumResult build() {
            return new GetHybridIdentityMetadatumResult(id, identity, name, provisioningState, publicKey, systemData, type, vmId);
        }
    }
}
