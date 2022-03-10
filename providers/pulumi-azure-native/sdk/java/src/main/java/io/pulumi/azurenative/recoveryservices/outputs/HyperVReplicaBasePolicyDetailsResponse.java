// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HyperVReplicaBasePolicyDetailsResponse {
    /**
     * A value indicating the authentication type.
     * 
     */
    private final @Nullable Integer allowedAuthenticationType;
    /**
     * A value indicating the application consistent frequency.
     * 
     */
    private final @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
    /**
     * A value indicating whether compression has to be enabled.
     * 
     */
    private final @Nullable String compression;
    /**
     * A value indicating whether IR is online.
     * 
     */
    private final @Nullable String initialReplicationMethod;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVReplicaBasePolicyDetails'.
     * 
     */
    private final String instanceType;
    /**
     * A value indicating the offline IR export path.
     * 
     */
    private final @Nullable String offlineReplicationExportPath;
    /**
     * A value indicating the offline IR import path.
     * 
     */
    private final @Nullable String offlineReplicationImportPath;
    /**
     * A value indicating the online IR start time.
     * 
     */
    private final @Nullable String onlineReplicationStartTime;
    /**
     * A value indicating the number of recovery points.
     * 
     */
    private final @Nullable Integer recoveryPoints;
    /**
     * A value indicating whether the VM has to be auto deleted. Supported Values: String.Empty, None, OnRecoveryCloud
     * 
     */
    private final @Nullable String replicaDeletionOption;
    /**
     * A value indicating the recovery HTTPS port.
     * 
     */
    private final @Nullable Integer replicationPort;

    @OutputCustomType.Constructor
    private HyperVReplicaBasePolicyDetailsResponse(
        @OutputCustomType.Parameter("allowedAuthenticationType") @Nullable Integer allowedAuthenticationType,
        @OutputCustomType.Parameter("applicationConsistentSnapshotFrequencyInHours") @Nullable Integer applicationConsistentSnapshotFrequencyInHours,
        @OutputCustomType.Parameter("compression") @Nullable String compression,
        @OutputCustomType.Parameter("initialReplicationMethod") @Nullable String initialReplicationMethod,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("offlineReplicationExportPath") @Nullable String offlineReplicationExportPath,
        @OutputCustomType.Parameter("offlineReplicationImportPath") @Nullable String offlineReplicationImportPath,
        @OutputCustomType.Parameter("onlineReplicationStartTime") @Nullable String onlineReplicationStartTime,
        @OutputCustomType.Parameter("recoveryPoints") @Nullable Integer recoveryPoints,
        @OutputCustomType.Parameter("replicaDeletionOption") @Nullable String replicaDeletionOption,
        @OutputCustomType.Parameter("replicationPort") @Nullable Integer replicationPort) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.compression = compression;
        this.initialReplicationMethod = initialReplicationMethod;
        this.instanceType = instanceType;
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPoints = recoveryPoints;
        this.replicaDeletionOption = replicaDeletionOption;
        this.replicationPort = replicationPort;
    }

    /**
     * A value indicating the authentication type.
     * 
    */
    public Optional<Integer> getAllowedAuthenticationType() {
        return Optional.ofNullable(this.allowedAuthenticationType);
    }
    /**
     * A value indicating the application consistent frequency.
     * 
    */
    public Optional<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return Optional.ofNullable(this.applicationConsistentSnapshotFrequencyInHours);
    }
    /**
     * A value indicating whether compression has to be enabled.
     * 
    */
    public Optional<String> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * A value indicating whether IR is online.
     * 
    */
    public Optional<String> getInitialReplicationMethod() {
        return Optional.ofNullable(this.initialReplicationMethod);
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVReplicaBasePolicyDetails'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * A value indicating the offline IR export path.
     * 
    */
    public Optional<String> getOfflineReplicationExportPath() {
        return Optional.ofNullable(this.offlineReplicationExportPath);
    }
    /**
     * A value indicating the offline IR import path.
     * 
    */
    public Optional<String> getOfflineReplicationImportPath() {
        return Optional.ofNullable(this.offlineReplicationImportPath);
    }
    /**
     * A value indicating the online IR start time.
     * 
    */
    public Optional<String> getOnlineReplicationStartTime() {
        return Optional.ofNullable(this.onlineReplicationStartTime);
    }
    /**
     * A value indicating the number of recovery points.
     * 
    */
    public Optional<Integer> getRecoveryPoints() {
        return Optional.ofNullable(this.recoveryPoints);
    }
    /**
     * A value indicating whether the VM has to be auto deleted. Supported Values: String.Empty, None, OnRecoveryCloud
     * 
    */
    public Optional<String> getReplicaDeletionOption() {
        return Optional.ofNullable(this.replicaDeletionOption);
    }
    /**
     * A value indicating the recovery HTTPS port.
     * 
    */
    public Optional<Integer> getReplicationPort() {
        return Optional.ofNullable(this.replicationPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allowedAuthenticationType;
        private @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
        private @Nullable String compression;
        private @Nullable String initialReplicationMethod;
        private String instanceType;
        private @Nullable String offlineReplicationExportPath;
        private @Nullable String offlineReplicationImportPath;
        private @Nullable String onlineReplicationStartTime;
        private @Nullable Integer recoveryPoints;
        private @Nullable String replicaDeletionOption;
        private @Nullable Integer replicationPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAuthenticationType = defaults.allowedAuthenticationType;
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.compression = defaults.compression;
    	      this.initialReplicationMethod = defaults.initialReplicationMethod;
    	      this.instanceType = defaults.instanceType;
    	      this.offlineReplicationExportPath = defaults.offlineReplicationExportPath;
    	      this.offlineReplicationImportPath = defaults.offlineReplicationImportPath;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPoints = defaults.recoveryPoints;
    	      this.replicaDeletionOption = defaults.replicaDeletionOption;
    	      this.replicationPort = defaults.replicationPort;
        }

        public Builder setAllowedAuthenticationType(@Nullable Integer allowedAuthenticationType) {
            this.allowedAuthenticationType = allowedAuthenticationType;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder setInitialReplicationMethod(@Nullable String initialReplicationMethod) {
            this.initialReplicationMethod = initialReplicationMethod;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setOfflineReplicationExportPath(@Nullable String offlineReplicationExportPath) {
            this.offlineReplicationExportPath = offlineReplicationExportPath;
            return this;
        }

        public Builder setOfflineReplicationImportPath(@Nullable String offlineReplicationImportPath) {
            this.offlineReplicationImportPath = offlineReplicationImportPath;
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setRecoveryPoints(@Nullable Integer recoveryPoints) {
            this.recoveryPoints = recoveryPoints;
            return this;
        }

        public Builder setReplicaDeletionOption(@Nullable String replicaDeletionOption) {
            this.replicaDeletionOption = replicaDeletionOption;
            return this;
        }

        public Builder setReplicationPort(@Nullable Integer replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }
        public HyperVReplicaBasePolicyDetailsResponse build() {
            return new HyperVReplicaBasePolicyDetailsResponse(allowedAuthenticationType, applicationConsistentSnapshotFrequencyInHours, compression, initialReplicationMethod, instanceType, offlineReplicationExportPath, offlineReplicationImportPath, onlineReplicationStartTime, recoveryPoints, replicaDeletionOption, replicationPort);
        }
    }
}
