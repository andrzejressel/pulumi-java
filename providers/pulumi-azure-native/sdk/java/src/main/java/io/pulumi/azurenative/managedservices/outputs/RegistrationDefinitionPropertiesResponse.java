// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices.outputs;

import io.pulumi.azurenative.managedservices.outputs.AuthorizationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegistrationDefinitionPropertiesResponse {
    /**
     * Authorization tuple containing principal id of the user/security group or service principal and id of the build-in role.
     * 
     */
    private final List<AuthorizationResponse> authorizations;
    /**
     * Description of the registration definition.
     * 
     */
    private final @Nullable String description;
    /**
     * Id of the managedBy tenant.
     * 
     */
    private final String managedByTenantId;
    /**
     * Name of the managedBy tenant.
     * 
     */
    private final String managedByTenantName;
    /**
     * Current state of the registration definition.
     * 
     */
    private final String provisioningState;
    /**
     * Name of the registration definition.
     * 
     */
    private final @Nullable String registrationDefinitionName;

    @OutputCustomType.Constructor
    private RegistrationDefinitionPropertiesResponse(
        @OutputCustomType.Parameter("authorizations") List<AuthorizationResponse> authorizations,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("managedByTenantId") String managedByTenantId,
        @OutputCustomType.Parameter("managedByTenantName") String managedByTenantName,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("registrationDefinitionName") @Nullable String registrationDefinitionName) {
        this.authorizations = authorizations;
        this.description = description;
        this.managedByTenantId = managedByTenantId;
        this.managedByTenantName = managedByTenantName;
        this.provisioningState = provisioningState;
        this.registrationDefinitionName = registrationDefinitionName;
    }

    /**
     * Authorization tuple containing principal id of the user/security group or service principal and id of the build-in role.
     * 
    */
    public List<AuthorizationResponse> getAuthorizations() {
        return this.authorizations;
    }
    /**
     * Description of the registration definition.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Id of the managedBy tenant.
     * 
    */
    public String getManagedByTenantId() {
        return this.managedByTenantId;
    }
    /**
     * Name of the managedBy tenant.
     * 
    */
    public String getManagedByTenantName() {
        return this.managedByTenantName;
    }
    /**
     * Current state of the registration definition.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Name of the registration definition.
     * 
    */
    public Optional<String> getRegistrationDefinitionName() {
        return Optional.ofNullable(this.registrationDefinitionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistrationDefinitionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuthorizationResponse> authorizations;
        private @Nullable String description;
        private String managedByTenantId;
        private String managedByTenantName;
        private String provisioningState;
        private @Nullable String registrationDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationDefinitionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.description = defaults.description;
    	      this.managedByTenantId = defaults.managedByTenantId;
    	      this.managedByTenantName = defaults.managedByTenantName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationDefinitionName = defaults.registrationDefinitionName;
        }

        public Builder setAuthorizations(List<AuthorizationResponse> authorizations) {
            this.authorizations = Objects.requireNonNull(authorizations);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setManagedByTenantId(String managedByTenantId) {
            this.managedByTenantId = Objects.requireNonNull(managedByTenantId);
            return this;
        }

        public Builder setManagedByTenantName(String managedByTenantName) {
            this.managedByTenantName = Objects.requireNonNull(managedByTenantName);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegistrationDefinitionName(@Nullable String registrationDefinitionName) {
            this.registrationDefinitionName = registrationDefinitionName;
            return this;
        }
        public RegistrationDefinitionPropertiesResponse build() {
            return new RegistrationDefinitionPropertiesResponse(authorizations, description, managedByTenantId, managedByTenantName, provisioningState, registrationDefinitionName);
        }
    }
}
