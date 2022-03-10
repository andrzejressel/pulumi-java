// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.outputs;

import io.pulumi.azurenative.deviceupdate.outputs.DiagnosticStoragePropertiesResponse;
import io.pulumi.azurenative.deviceupdate.outputs.IotHubSettingsResponse;
import io.pulumi.azurenative.deviceupdate.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * Parent Device Update Account name which Instance belongs to.
     * 
     */
    private final String accountName;
    /**
     * Customer-initiated diagnostic log collection storage properties
     * 
     */
    private final @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties;
    /**
     * Enables or Disables the diagnostic logs collection
     * 
     */
    private final @Nullable Boolean enableDiagnostics;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * List of IoT Hubs associated with the account.
     * 
     */
    private final @Nullable List<IotHubSettingsResponse> iotHubs;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetInstanceResult(
        @OutputCustomType.Parameter("accountName") String accountName,
        @OutputCustomType.Parameter("diagnosticStorageProperties") @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties,
        @OutputCustomType.Parameter("enableDiagnostics") @Nullable Boolean enableDiagnostics,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("iotHubs") @Nullable List<IotHubSettingsResponse> iotHubs,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.accountName = accountName;
        this.diagnosticStorageProperties = diagnosticStorageProperties;
        this.enableDiagnostics = enableDiagnostics;
        this.id = id;
        this.iotHubs = iotHubs;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Parent Device Update Account name which Instance belongs to.
     * 
    */
    public String getAccountName() {
        return this.accountName;
    }
    /**
     * Customer-initiated diagnostic log collection storage properties
     * 
    */
    public Optional<DiagnosticStoragePropertiesResponse> getDiagnosticStorageProperties() {
        return Optional.ofNullable(this.diagnosticStorageProperties);
    }
    /**
     * Enables or Disables the diagnostic logs collection
     * 
    */
    public Optional<Boolean> getEnableDiagnostics() {
        return Optional.ofNullable(this.enableDiagnostics);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of IoT Hubs associated with the account.
     * 
    */
    public List<IotHubSettingsResponse> getIotHubs() {
        return this.iotHubs == null ? List.of() : this.iotHubs;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private @Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties;
        private @Nullable Boolean enableDiagnostics;
        private String id;
        private @Nullable List<IotHubSettingsResponse> iotHubs;
        private String location;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.diagnosticStorageProperties = defaults.diagnosticStorageProperties;
    	      this.enableDiagnostics = defaults.enableDiagnostics;
    	      this.id = defaults.id;
    	      this.iotHubs = defaults.iotHubs;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setDiagnosticStorageProperties(@Nullable DiagnosticStoragePropertiesResponse diagnosticStorageProperties) {
            this.diagnosticStorageProperties = diagnosticStorageProperties;
            return this;
        }

        public Builder setEnableDiagnostics(@Nullable Boolean enableDiagnostics) {
            this.enableDiagnostics = enableDiagnostics;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIotHubs(@Nullable List<IotHubSettingsResponse> iotHubs) {
            this.iotHubs = iotHubs;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(accountName, diagnosticStorageProperties, enableDiagnostics, id, iotHubs, location, name, provisioningState, systemData, tags, type);
        }
    }
}
