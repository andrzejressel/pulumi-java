// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FactoryIdentityResponse {
    /**
     * The principal id of the identity.
     * 
     */
    private final String principalId;
    /**
     * The client tenant id of the identity.
     * 
     */
    private final String tenantId;
    /**
     * The identity type.
     * 
     */
    private final String type;
    /**
     * List of user assigned identities for the factory.
     * 
     */
    private final @Nullable Map<String,Object> userAssignedIdentities;

    @OutputCustomType.Constructor
    private FactoryIdentityResponse(
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("userAssignedIdentities") @Nullable Map<String,Object> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal id of the identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The client tenant id of the identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identity type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * List of user assigned identities for the factory.
     * 
    */
    public Map<String,Object> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,Object> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,Object> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public FactoryIdentityResponse build() {
            return new FactoryIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
