// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InMageRcmMobilityAgentDetailsResponse {
    /**
     * The agent version expiry date.
     * 
     */
    private final String agentVersionExpiryDate;
    /**
     * The driver version.
     * 
     */
    private final String driverVersion;
    /**
     * The driver version expiry date.
     * 
     */
    private final String driverVersionExpiryDate;
    /**
     * A value indicating whether agent is upgradeable or not.
     * 
     */
    private final String isUpgradeable;
    /**
     * The time of the last heartbeat received from the agent.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * The latest upgradeable version available without reboot.
     * 
     */
    private final String latestUpgradableVersionWithoutReboot;
    /**
     * The latest agent version available.
     * 
     */
    private final String latestVersion;
    /**
     * The whether update is possible or not.
     * 
     */
    private final List<String> reasonsBlockingUpgrade;
    /**
     * The agent version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor
    private InMageRcmMobilityAgentDetailsResponse(
        @OutputCustomType.Parameter("agentVersionExpiryDate") String agentVersionExpiryDate,
        @OutputCustomType.Parameter("driverVersion") String driverVersion,
        @OutputCustomType.Parameter("driverVersionExpiryDate") String driverVersionExpiryDate,
        @OutputCustomType.Parameter("isUpgradeable") String isUpgradeable,
        @OutputCustomType.Parameter("lastHeartbeatUtc") String lastHeartbeatUtc,
        @OutputCustomType.Parameter("latestUpgradableVersionWithoutReboot") String latestUpgradableVersionWithoutReboot,
        @OutputCustomType.Parameter("latestVersion") String latestVersion,
        @OutputCustomType.Parameter("reasonsBlockingUpgrade") List<String> reasonsBlockingUpgrade,
        @OutputCustomType.Parameter("version") String version) {
        this.agentVersionExpiryDate = agentVersionExpiryDate;
        this.driverVersion = driverVersion;
        this.driverVersionExpiryDate = driverVersionExpiryDate;
        this.isUpgradeable = isUpgradeable;
        this.lastHeartbeatUtc = lastHeartbeatUtc;
        this.latestUpgradableVersionWithoutReboot = latestUpgradableVersionWithoutReboot;
        this.latestVersion = latestVersion;
        this.reasonsBlockingUpgrade = reasonsBlockingUpgrade;
        this.version = version;
    }

    /**
     * The agent version expiry date.
     * 
    */
    public String getAgentVersionExpiryDate() {
        return this.agentVersionExpiryDate;
    }
    /**
     * The driver version.
     * 
    */
    public String getDriverVersion() {
        return this.driverVersion;
    }
    /**
     * The driver version expiry date.
     * 
    */
    public String getDriverVersionExpiryDate() {
        return this.driverVersionExpiryDate;
    }
    /**
     * A value indicating whether agent is upgradeable or not.
     * 
    */
    public String getIsUpgradeable() {
        return this.isUpgradeable;
    }
    /**
     * The time of the last heartbeat received from the agent.
     * 
    */
    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * The latest upgradeable version available without reboot.
     * 
    */
    public String getLatestUpgradableVersionWithoutReboot() {
        return this.latestUpgradableVersionWithoutReboot;
    }
    /**
     * The latest agent version available.
     * 
    */
    public String getLatestVersion() {
        return this.latestVersion;
    }
    /**
     * The whether update is possible or not.
     * 
    */
    public List<String> getReasonsBlockingUpgrade() {
        return this.reasonsBlockingUpgrade;
    }
    /**
     * The agent version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmMobilityAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentVersionExpiryDate;
        private String driverVersion;
        private String driverVersionExpiryDate;
        private String isUpgradeable;
        private String lastHeartbeatUtc;
        private String latestUpgradableVersionWithoutReboot;
        private String latestVersion;
        private List<String> reasonsBlockingUpgrade;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmMobilityAgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersionExpiryDate = defaults.agentVersionExpiryDate;
    	      this.driverVersion = defaults.driverVersion;
    	      this.driverVersionExpiryDate = defaults.driverVersionExpiryDate;
    	      this.isUpgradeable = defaults.isUpgradeable;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.latestUpgradableVersionWithoutReboot = defaults.latestUpgradableVersionWithoutReboot;
    	      this.latestVersion = defaults.latestVersion;
    	      this.reasonsBlockingUpgrade = defaults.reasonsBlockingUpgrade;
    	      this.version = defaults.version;
        }

        public Builder setAgentVersionExpiryDate(String agentVersionExpiryDate) {
            this.agentVersionExpiryDate = Objects.requireNonNull(agentVersionExpiryDate);
            return this;
        }

        public Builder setDriverVersion(String driverVersion) {
            this.driverVersion = Objects.requireNonNull(driverVersion);
            return this;
        }

        public Builder setDriverVersionExpiryDate(String driverVersionExpiryDate) {
            this.driverVersionExpiryDate = Objects.requireNonNull(driverVersionExpiryDate);
            return this;
        }

        public Builder setIsUpgradeable(String isUpgradeable) {
            this.isUpgradeable = Objects.requireNonNull(isUpgradeable);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setLatestUpgradableVersionWithoutReboot(String latestUpgradableVersionWithoutReboot) {
            this.latestUpgradableVersionWithoutReboot = Objects.requireNonNull(latestUpgradableVersionWithoutReboot);
            return this;
        }

        public Builder setLatestVersion(String latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }

        public Builder setReasonsBlockingUpgrade(List<String> reasonsBlockingUpgrade) {
            this.reasonsBlockingUpgrade = Objects.requireNonNull(reasonsBlockingUpgrade);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public InMageRcmMobilityAgentDetailsResponse build() {
            return new InMageRcmMobilityAgentDetailsResponse(agentVersionExpiryDate, driverVersion, driverVersionExpiryDate, isUpgradeable, lastHeartbeatUtc, latestUpgradableVersionWithoutReboot, latestVersion, reasonsBlockingUpgrade, version);
        }
    }
}
