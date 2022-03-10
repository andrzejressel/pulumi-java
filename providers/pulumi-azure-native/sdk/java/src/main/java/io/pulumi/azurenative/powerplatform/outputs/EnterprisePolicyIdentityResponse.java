// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterprisePolicyIdentityResponse {
    /**
     * The principal id of EnterprisePolicy identity.
     * 
     */
    private final String systemAssignedIdentityPrincipalId;
    /**
     * The tenant id associated with the EnterprisePolicy.
     * 
     */
    private final String tenantId;
    /**
     * The type of identity used for the EnterprisePolicy. Currently, the only supported type is 'SystemAssigned', which implicitly creates an identity.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private EnterprisePolicyIdentityResponse(
        @OutputCustomType.Parameter("systemAssignedIdentityPrincipalId") String systemAssignedIdentityPrincipalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.systemAssignedIdentityPrincipalId = systemAssignedIdentityPrincipalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The principal id of EnterprisePolicy identity.
     * 
    */
    public String getSystemAssignedIdentityPrincipalId() {
        return this.systemAssignedIdentityPrincipalId;
    }
    /**
     * The tenant id associated with the EnterprisePolicy.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of identity used for the EnterprisePolicy. Currently, the only supported type is 'SystemAssigned', which implicitly creates an identity.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterprisePolicyIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String systemAssignedIdentityPrincipalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterprisePolicyIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemAssignedIdentityPrincipalId = defaults.systemAssignedIdentityPrincipalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setSystemAssignedIdentityPrincipalId(String systemAssignedIdentityPrincipalId) {
            this.systemAssignedIdentityPrincipalId = Objects.requireNonNull(systemAssignedIdentityPrincipalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public EnterprisePolicyIdentityResponse build() {
            return new EnterprisePolicyIdentityResponse(systemAssignedIdentityPrincipalId, tenantId, type);
        }
    }
}
