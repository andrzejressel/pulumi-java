// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedServiceIdentityResponseUserAssignedIdentities {
    /**
     * The client id of user assigned identity.
     * 
     */
    private final String clientId;
    /**
     * The principal id of user assigned identity.
     * 
     */
    private final String principalId;

    @OutputCustomType.Constructor
    private ManagedServiceIdentityResponseUserAssignedIdentities(
        @OutputCustomType.Parameter("clientId") String clientId,
        @OutputCustomType.Parameter("principalId") String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * The client id of user assigned identity.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The principal id of user assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public ManagedServiceIdentityResponseUserAssignedIdentities build() {
            return new ManagedServiceIdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
