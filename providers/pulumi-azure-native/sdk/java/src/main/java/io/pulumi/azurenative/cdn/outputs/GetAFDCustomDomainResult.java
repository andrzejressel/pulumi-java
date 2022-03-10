// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.AFDDomainHttpsParametersResponse;
import io.pulumi.azurenative.cdn.outputs.DomainValidationPropertiesResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAFDCustomDomainResult {
    /**
     * Resource reference to the Azure DNS zone
     * 
     */
    private final @Nullable ResourceReferenceResponse azureDnsZone;
    private final String deploymentStatus;
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
     */
    private final String domainValidationState;
    /**
     * The host name of the domain. Must be a domain name.
     * 
     */
    private final String hostName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning status
     * 
     */
    private final String provisioningState;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
     */
    private final @Nullable AFDDomainHttpsParametersResponse tlsSettings;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Values the customer needs to validate domain ownership
     * 
     */
    private final DomainValidationPropertiesResponse validationProperties;

    @OutputCustomType.Constructor
    private GetAFDCustomDomainResult(
        @OutputCustomType.Parameter("azureDnsZone") @Nullable ResourceReferenceResponse azureDnsZone,
        @OutputCustomType.Parameter("deploymentStatus") String deploymentStatus,
        @OutputCustomType.Parameter("domainValidationState") String domainValidationState,
        @OutputCustomType.Parameter("hostName") String hostName,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tlsSettings") @Nullable AFDDomainHttpsParametersResponse tlsSettings,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("validationProperties") DomainValidationPropertiesResponse validationProperties) {
        this.azureDnsZone = azureDnsZone;
        this.deploymentStatus = deploymentStatus;
        this.domainValidationState = domainValidationState;
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tlsSettings = tlsSettings;
        this.type = type;
        this.validationProperties = validationProperties;
    }

    /**
     * Resource reference to the Azure DNS zone
     * 
    */
    public Optional<ResourceReferenceResponse> getAzureDnsZone() {
        return Optional.ofNullable(this.azureDnsZone);
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Provisioning substate shows the progress of custom HTTPS enabling/disabling process step by step. DCV stands for DomainControlValidation.
     * 
    */
    public String getDomainValidationState() {
        return this.domainValidationState;
    }
    /**
     * The host name of the domain. Must be a domain name.
     * 
    */
    public String getHostName() {
        return this.hostName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning status
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     * 
    */
    public Optional<AFDDomainHttpsParametersResponse> getTlsSettings() {
        return Optional.ofNullable(this.tlsSettings);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Values the customer needs to validate domain ownership
     * 
    */
    public DomainValidationPropertiesResponse getValidationProperties() {
        return this.validationProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDCustomDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceReferenceResponse azureDnsZone;
        private String deploymentStatus;
        private String domainValidationState;
        private String hostName;
        private String id;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable AFDDomainHttpsParametersResponse tlsSettings;
        private String type;
        private DomainValidationPropertiesResponse validationProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDCustomDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDnsZone = defaults.azureDnsZone;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.domainValidationState = defaults.domainValidationState;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tlsSettings = defaults.tlsSettings;
    	      this.type = defaults.type;
    	      this.validationProperties = defaults.validationProperties;
        }

        public Builder setAzureDnsZone(@Nullable ResourceReferenceResponse azureDnsZone) {
            this.azureDnsZone = azureDnsZone;
            return this;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setDomainValidationState(String domainValidationState) {
            this.domainValidationState = Objects.requireNonNull(domainValidationState);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTlsSettings(@Nullable AFDDomainHttpsParametersResponse tlsSettings) {
            this.tlsSettings = tlsSettings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValidationProperties(DomainValidationPropertiesResponse validationProperties) {
            this.validationProperties = Objects.requireNonNull(validationProperties);
            return this;
        }
        public GetAFDCustomDomainResult build() {
            return new GetAFDCustomDomainResult(azureDnsZone, deploymentStatus, domainValidationState, hostName, id, name, provisioningState, systemData, tlsSettings, type, validationProperties);
        }
    }
}
