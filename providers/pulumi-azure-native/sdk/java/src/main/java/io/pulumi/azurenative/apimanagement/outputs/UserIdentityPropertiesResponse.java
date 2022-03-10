// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserIdentityPropertiesResponse {
    /**
     * The client id of user assigned identity.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The principal id of user assigned identity.
     * 
     */
    private final @Nullable String principalId;

    @OutputCustomType.Constructor
    private UserIdentityPropertiesResponse(
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("principalId") @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    /**
     * The client id of user assigned identity.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The principal id of user assigned identity.
     * 
    */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public UserIdentityPropertiesResponse build() {
            return new UserIdentityPropertiesResponse(clientId, principalId);
        }
    }
}
