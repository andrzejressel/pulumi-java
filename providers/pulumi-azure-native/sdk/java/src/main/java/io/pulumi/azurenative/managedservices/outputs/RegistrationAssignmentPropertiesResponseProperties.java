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
public final class RegistrationAssignmentPropertiesResponseProperties {
    /**
     * Authorization tuple containing principal id of the user/security group or service principal and id of the build-in role.
     * 
     */
    private final @Nullable List<AuthorizationResponse> authorizations;
    /**
     * Description of the registration definition.
     * 
     */
    private final @Nullable String description;
    /**
     * Id of the managedBy tenant.
     * 
     */
    private final @Nullable String managedByTenantId;
    /**
     * Name of the managedBy tenant.
     * 
     */
    private final @Nullable String managedByTenantName;
    /**
     * Id of the home tenant.
     * 
     */
    private final @Nullable String manageeTenantId;
    /**
     * Name of the home tenant.
     * 
     */
    private final @Nullable String manageeTenantName;
    /**
     * Current state of the registration definition.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Name of the registration definition.
     * 
     */
    private final @Nullable String registrationDefinitionName;

    @OutputCustomType.Constructor
    private RegistrationAssignmentPropertiesResponseProperties(
        @OutputCustomType.Parameter("authorizations") @Nullable List<AuthorizationResponse> authorizations,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("managedByTenantId") @Nullable String managedByTenantId,
        @OutputCustomType.Parameter("managedByTenantName") @Nullable String managedByTenantName,
        @OutputCustomType.Parameter("manageeTenantId") @Nullable String manageeTenantId,
        @OutputCustomType.Parameter("manageeTenantName") @Nullable String manageeTenantName,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("registrationDefinitionName") @Nullable String registrationDefinitionName) {
        this.authorizations = authorizations;
        this.description = description;
        this.managedByTenantId = managedByTenantId;
        this.managedByTenantName = managedByTenantName;
        this.manageeTenantId = manageeTenantId;
        this.manageeTenantName = manageeTenantName;
        this.provisioningState = provisioningState;
        this.registrationDefinitionName = registrationDefinitionName;
    }

    /**
     * Authorization tuple containing principal id of the user/security group or service principal and id of the build-in role.
     * 
    */
    public List<AuthorizationResponse> getAuthorizations() {
        return this.authorizations == null ? List.of() : this.authorizations;
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
    public Optional<String> getManagedByTenantId() {
        return Optional.ofNullable(this.managedByTenantId);
    }
    /**
     * Name of the managedBy tenant.
     * 
    */
    public Optional<String> getManagedByTenantName() {
        return Optional.ofNullable(this.managedByTenantName);
    }
    /**
     * Id of the home tenant.
     * 
    */
    public Optional<String> getManageeTenantId() {
        return Optional.ofNullable(this.manageeTenantId);
    }
    /**
     * Name of the home tenant.
     * 
    */
    public Optional<String> getManageeTenantName() {
        return Optional.ofNullable(this.manageeTenantName);
    }
    /**
     * Current state of the registration definition.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
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

    public static Builder builder(RegistrationAssignmentPropertiesResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AuthorizationResponse> authorizations;
        private @Nullable String description;
        private @Nullable String managedByTenantId;
        private @Nullable String managedByTenantName;
        private @Nullable String manageeTenantId;
        private @Nullable String manageeTenantName;
        private @Nullable String provisioningState;
        private @Nullable String registrationDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistrationAssignmentPropertiesResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.description = defaults.description;
    	      this.managedByTenantId = defaults.managedByTenantId;
    	      this.managedByTenantName = defaults.managedByTenantName;
    	      this.manageeTenantId = defaults.manageeTenantId;
    	      this.manageeTenantName = defaults.manageeTenantName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationDefinitionName = defaults.registrationDefinitionName;
        }

        public Builder setAuthorizations(@Nullable List<AuthorizationResponse> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setManagedByTenantId(@Nullable String managedByTenantId) {
            this.managedByTenantId = managedByTenantId;
            return this;
        }

        public Builder setManagedByTenantName(@Nullable String managedByTenantName) {
            this.managedByTenantName = managedByTenantName;
            return this;
        }

        public Builder setManageeTenantId(@Nullable String manageeTenantId) {
            this.manageeTenantId = manageeTenantId;
            return this;
        }

        public Builder setManageeTenantName(@Nullable String manageeTenantName) {
            this.manageeTenantName = manageeTenantName;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setRegistrationDefinitionName(@Nullable String registrationDefinitionName) {
            this.registrationDefinitionName = registrationDefinitionName;
            return this;
        }
        public RegistrationAssignmentPropertiesResponseProperties build() {
            return new RegistrationAssignmentPropertiesResponseProperties(authorizations, description, managedByTenantId, managedByTenantName, manageeTenantId, manageeTenantName, provisioningState, registrationDefinitionName);
        }
    }
}
