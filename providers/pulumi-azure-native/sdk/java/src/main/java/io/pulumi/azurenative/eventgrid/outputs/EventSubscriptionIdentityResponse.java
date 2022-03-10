// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSubscriptionIdentityResponse {
    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
     */
    private final @Nullable String type;
    /**
     * The user identity associated with the resource.
     * 
     */
    private final @Nullable String userAssignedIdentity;

    @OutputCustomType.Constructor
    private EventSubscriptionIdentityResponse(
        @OutputCustomType.Parameter("type") @Nullable String type,
        @OutputCustomType.Parameter("userAssignedIdentity") @Nullable String userAssignedIdentity) {
        this.type = type;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * The type of managed identity used. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user-assigned identities. The type 'None' will remove any identity.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The user identity associated with the resource.
     * 
    */
    public Optional<String> getUserAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }
        public EventSubscriptionIdentityResponse build() {
            return new EventSubscriptionIdentityResponse(type, userAssignedIdentity);
        }
    }
}
