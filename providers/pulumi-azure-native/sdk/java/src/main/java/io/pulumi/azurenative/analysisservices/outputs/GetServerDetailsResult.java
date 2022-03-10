// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.azurenative.analysisservices.outputs.GatewayDetailsResponse;
import io.pulumi.azurenative.analysisservices.outputs.IPv4FirewallSettingsResponse;
import io.pulumi.azurenative.analysisservices.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.analysisservices.outputs.ServerAdministratorsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerDetailsResult {
    /**
     * A collection of AS server administrators
     * 
     */
    private final @Nullable ServerAdministratorsResponse asAdministrators;
    /**
     * The SAS container URI to the backup container.
     * 
     */
    private final @Nullable String backupBlobContainerUri;
    /**
     * The gateway details configured for the AS server.
     * 
     */
    private final @Nullable GatewayDetailsResponse gatewayDetails;
    /**
     * An identifier that represents the Analysis Services resource.
     * 
     */
    private final String id;
    /**
     * The firewall settings for the AS server.
     * 
     */
    private final @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
    /**
     * Location of the Analysis Services resource.
     * 
     */
    private final String location;
    /**
     * The managed mode of the server (0 = not managed, 1 = managed).
     * 
     */
    private final @Nullable Integer managedMode;
    /**
     * The name of the Analysis Services resource.
     * 
     */
    private final String name;
    /**
     * The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * How the read-write server's participation in the query pool is controlled.<br/>It can have the following values: <ul><li>readOnly - indicates that the read-write server is intended not to participate in query operations</li><li>all - indicates that the read-write server can participate in query operations</li></ul>Specifying readOnly when capacity is 1 results in error.
     * 
     */
    private final @Nullable String querypoolConnectionMode;
    /**
     * The full name of the Analysis Services resource.
     * 
     */
    private final String serverFullName;
    /**
     * The server monitor mode for AS server
     * 
     */
    private final @Nullable Integer serverMonitorMode;
    /**
     * The SKU of the Analysis Services resource.
     * 
     */
    private final ResourceSkuResponse sku;
    /**
     * The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
     */
    private final String state;
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the Analysis Services resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetServerDetailsResult(
        @OutputCustomType.Parameter("asAdministrators") @Nullable ServerAdministratorsResponse asAdministrators,
        @OutputCustomType.Parameter("backupBlobContainerUri") @Nullable String backupBlobContainerUri,
        @OutputCustomType.Parameter("gatewayDetails") @Nullable GatewayDetailsResponse gatewayDetails,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ipV4FirewallSettings") @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("managedMode") @Nullable Integer managedMode,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("querypoolConnectionMode") @Nullable String querypoolConnectionMode,
        @OutputCustomType.Parameter("serverFullName") String serverFullName,
        @OutputCustomType.Parameter("serverMonitorMode") @Nullable Integer serverMonitorMode,
        @OutputCustomType.Parameter("sku") ResourceSkuResponse sku,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.asAdministrators = asAdministrators;
        this.backupBlobContainerUri = backupBlobContainerUri;
        this.gatewayDetails = gatewayDetails;
        this.id = id;
        this.ipV4FirewallSettings = ipV4FirewallSettings;
        this.location = location;
        this.managedMode = managedMode;
        this.name = name;
        this.provisioningState = provisioningState;
        this.querypoolConnectionMode = querypoolConnectionMode;
        this.serverFullName = serverFullName;
        this.serverMonitorMode = serverMonitorMode;
        this.sku = sku;
        this.state = state;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A collection of AS server administrators
     * 
    */
    public Optional<ServerAdministratorsResponse> getAsAdministrators() {
        return Optional.ofNullable(this.asAdministrators);
    }
    /**
     * The SAS container URI to the backup container.
     * 
    */
    public Optional<String> getBackupBlobContainerUri() {
        return Optional.ofNullable(this.backupBlobContainerUri);
    }
    /**
     * The gateway details configured for the AS server.
     * 
    */
    public Optional<GatewayDetailsResponse> getGatewayDetails() {
        return Optional.ofNullable(this.gatewayDetails);
    }
    /**
     * An identifier that represents the Analysis Services resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The firewall settings for the AS server.
     * 
    */
    public Optional<IPv4FirewallSettingsResponse> getIpV4FirewallSettings() {
        return Optional.ofNullable(this.ipV4FirewallSettings);
    }
    /**
     * Location of the Analysis Services resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The managed mode of the server (0 = not managed, 1 = managed).
     * 
    */
    public Optional<Integer> getManagedMode() {
        return Optional.ofNullable(this.managedMode);
    }
    /**
     * The name of the Analysis Services resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current deployment state of Analysis Services resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * How the read-write server's participation in the query pool is controlled.<br/>It can have the following values: <ul><li>readOnly - indicates that the read-write server is intended not to participate in query operations</li><li>all - indicates that the read-write server can participate in query operations</li></ul>Specifying readOnly when capacity is 1 results in error.
     * 
    */
    public Optional<String> getQuerypoolConnectionMode() {
        return Optional.ofNullable(this.querypoolConnectionMode);
    }
    /**
     * The full name of the Analysis Services resource.
     * 
    */
    public String getServerFullName() {
        return this.serverFullName;
    }
    /**
     * The server monitor mode for AS server
     * 
    */
    public Optional<Integer> getServerMonitorMode() {
        return Optional.ofNullable(this.serverMonitorMode);
    }
    /**
     * The SKU of the Analysis Services resource.
     * 
    */
    public ResourceSkuResponse getSku() {
        return this.sku;
    }
    /**
     * The current state of Analysis Services resource. The state is to indicate more states outside of resource provisioning.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Key-value pairs of additional resource provisioning properties.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the Analysis Services resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDetailsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServerAdministratorsResponse asAdministrators;
        private @Nullable String backupBlobContainerUri;
        private @Nullable GatewayDetailsResponse gatewayDetails;
        private String id;
        private @Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings;
        private String location;
        private @Nullable Integer managedMode;
        private String name;
        private String provisioningState;
        private @Nullable String querypoolConnectionMode;
        private String serverFullName;
        private @Nullable Integer serverMonitorMode;
        private ResourceSkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerDetailsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asAdministrators = defaults.asAdministrators;
    	      this.backupBlobContainerUri = defaults.backupBlobContainerUri;
    	      this.gatewayDetails = defaults.gatewayDetails;
    	      this.id = defaults.id;
    	      this.ipV4FirewallSettings = defaults.ipV4FirewallSettings;
    	      this.location = defaults.location;
    	      this.managedMode = defaults.managedMode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.querypoolConnectionMode = defaults.querypoolConnectionMode;
    	      this.serverFullName = defaults.serverFullName;
    	      this.serverMonitorMode = defaults.serverMonitorMode;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAsAdministrators(@Nullable ServerAdministratorsResponse asAdministrators) {
            this.asAdministrators = asAdministrators;
            return this;
        }

        public Builder setBackupBlobContainerUri(@Nullable String backupBlobContainerUri) {
            this.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }

        public Builder setGatewayDetails(@Nullable GatewayDetailsResponse gatewayDetails) {
            this.gatewayDetails = gatewayDetails;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpV4FirewallSettings(@Nullable IPv4FirewallSettingsResponse ipV4FirewallSettings) {
            this.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedMode(@Nullable Integer managedMode) {
            this.managedMode = managedMode;
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

        public Builder setQuerypoolConnectionMode(@Nullable String querypoolConnectionMode) {
            this.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }

        public Builder setServerFullName(String serverFullName) {
            this.serverFullName = Objects.requireNonNull(serverFullName);
            return this;
        }

        public Builder setServerMonitorMode(@Nullable Integer serverMonitorMode) {
            this.serverMonitorMode = serverMonitorMode;
            return this;
        }

        public Builder setSku(ResourceSkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
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
        public GetServerDetailsResult build() {
            return new GetServerDetailsResult(asAdministrators, backupBlobContainerUri, gatewayDetails, id, ipV4FirewallSettings, location, managedMode, name, provisioningState, querypoolConnectionMode, serverFullName, serverMonitorMode, sku, state, tags, type);
        }
    }
}
