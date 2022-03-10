// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VCenterPropertiesResponse {
    /**
     * The VCenter discovery status.
     * 
     */
    private final @Nullable String discoveryStatus;
    /**
     * The ARM resource name of the fabric containing this VCenter.
     * 
     */
    private final @Nullable String fabricArmResourceName;
    /**
     * Friendly name of the vCenter.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The health errors for this VCenter.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrors;
    /**
     * The infrastructure Id of vCenter.
     * 
     */
    private final @Nullable String infrastructureId;
    /**
     * VCenter internal ID.
     * 
     */
    private final @Nullable String internalId;
    /**
     * The IP address of the vCenter.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The time when the last heartbeat was received by vCenter.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * The port number for discovery.
     * 
     */
    private final @Nullable String port;
    /**
     * The process server Id.
     * 
     */
    private final @Nullable String processServerId;
    /**
     * The account Id which has privileges to discover the vCenter.
     * 
     */
    private final @Nullable String runAsAccountId;

    @OutputCustomType.Constructor
    private VCenterPropertiesResponse(
        @OutputCustomType.Parameter("discoveryStatus") @Nullable String discoveryStatus,
        @OutputCustomType.Parameter("fabricArmResourceName") @Nullable String fabricArmResourceName,
        @OutputCustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @OutputCustomType.Parameter("healthErrors") @Nullable List<HealthErrorResponse> healthErrors,
        @OutputCustomType.Parameter("infrastructureId") @Nullable String infrastructureId,
        @OutputCustomType.Parameter("internalId") @Nullable String internalId,
        @OutputCustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @OutputCustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @OutputCustomType.Parameter("port") @Nullable String port,
        @OutputCustomType.Parameter("processServerId") @Nullable String processServerId,
        @OutputCustomType.Parameter("runAsAccountId") @Nullable String runAsAccountId) {
        this.discoveryStatus = discoveryStatus;
        this.fabricArmResourceName = fabricArmResourceName;
        this.friendlyName = friendlyName;
        this.healthErrors = healthErrors;
        this.infrastructureId = infrastructureId;
        this.internalId = internalId;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.port = port;
        this.processServerId = processServerId;
        this.runAsAccountId = runAsAccountId;
    }

    /**
     * The VCenter discovery status.
     * 
    */
    public Optional<String> getDiscoveryStatus() {
        return Optional.ofNullable(this.discoveryStatus);
    }
    /**
     * The ARM resource name of the fabric containing this VCenter.
     * 
    */
    public Optional<String> getFabricArmResourceName() {
        return Optional.ofNullable(this.fabricArmResourceName);
    }
    /**
     * Friendly name of the vCenter.
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The health errors for this VCenter.
     * 
    */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    /**
     * The infrastructure Id of vCenter.
     * 
    */
    public Optional<String> getInfrastructureId() {
        return Optional.ofNullable(this.infrastructureId);
    }
    /**
     * VCenter internal ID.
     * 
    */
    public Optional<String> getInternalId() {
        return Optional.ofNullable(this.internalId);
    }
    /**
     * The IP address of the vCenter.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The time when the last heartbeat was received by vCenter.
     * 
    */
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * The port number for discovery.
     * 
    */
    public Optional<String> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The process server Id.
     * 
    */
    public Optional<String> getProcessServerId() {
        return Optional.ofNullable(this.processServerId);
    }
    /**
     * The account Id which has privileges to discover the vCenter.
     * 
    */
    public Optional<String> getRunAsAccountId() {
        return Optional.ofNullable(this.runAsAccountId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VCenterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String discoveryStatus;
        private @Nullable String fabricArmResourceName;
        private @Nullable String friendlyName;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String infrastructureId;
        private @Nullable String internalId;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String port;
        private @Nullable String processServerId;
        private @Nullable String runAsAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(VCenterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discoveryStatus = defaults.discoveryStatus;
    	      this.fabricArmResourceName = defaults.fabricArmResourceName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthErrors = defaults.healthErrors;
    	      this.infrastructureId = defaults.infrastructureId;
    	      this.internalId = defaults.internalId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.port = defaults.port;
    	      this.processServerId = defaults.processServerId;
    	      this.runAsAccountId = defaults.runAsAccountId;
        }

        public Builder setDiscoveryStatus(@Nullable String discoveryStatus) {
            this.discoveryStatus = discoveryStatus;
            return this;
        }

        public Builder setFabricArmResourceName(@Nullable String fabricArmResourceName) {
            this.fabricArmResourceName = fabricArmResourceName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder setInfrastructureId(@Nullable String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }

        public Builder setInternalId(@Nullable String internalId) {
            this.internalId = internalId;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setProcessServerId(@Nullable String processServerId) {
            this.processServerId = processServerId;
            return this;
        }

        public Builder setRunAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }
        public VCenterPropertiesResponse build() {
            return new VCenterPropertiesResponse(discoveryStatus, fabricArmResourceName, friendlyName, healthErrors, infrastructureId, internalId, ipAddress, lastHeartbeat, port, processServerId, runAsAccountId);
        }
    }
}
