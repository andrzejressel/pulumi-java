// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IdentityResponse {
    /**
     * The principal id of managed service identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant of managed service identity.
     * 
     */
    private final String tenantId;
    /**
     * The type of managed service identity.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private IdentityResponse(
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The principal id of managed service identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant of managed service identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of managed service identity.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
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
        public IdentityResponse build() {
            return new IdentityResponse(principalId, tenantId, type);
        }
    }
}
