// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.quantum.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QuantumWorkspaceResponseIdentity {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final String tenantId;
    /**
     * The identity type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private QuantumWorkspaceResponseIdentity(
        @OutputCustomType.Parameter("principalId") String principalId,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The principal ID of resource identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of resource.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identity type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuantumWorkspaceResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(QuantumWorkspaceResponseIdentity defaults) {
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

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public QuantumWorkspaceResponseIdentity build() {
            return new QuantumWorkspaceResponseIdentity(principalId, tenantId, type);
        }
    }
}
