// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.DiskEncryptionStatusResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.InstanceFailoverReplicaResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.IpMappingResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.OnPremisesConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.ReplicaConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.SettingsResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.SqlOutOfDiskReportResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.SqlScheduledMaintenanceResponse;
import io.pulumi.googlenative.sqladmin_v1.outputs.SslCertResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    private final String backendType;
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    private final String connectionName;
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String createTime;
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    private final String currentDiskSize;
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    private final String databaseInstalledVersion;
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    private final String databaseVersion;
    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    private final DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
    /**
     * Disk encryption status specific to an instance.
     * 
     */
    private final DiskEncryptionStatusResponse diskEncryptionStatus;
    /**
     * The name and status of the failover replica.
     * 
     */
    private final InstanceFailoverReplicaResponse failoverReplica;
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    private final String gceZone;
    /**
     * The instance type.
     * 
     */
    private final String instanceType;
    /**
     * The assigned IP addresses for the instance.
     * 
     */
    private final List<IpMappingResponse> ipAddresses;
    /**
     * This is always `sql#instance`.
     * 
     */
    private final String kind;
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    private final String masterInstanceName;
    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    private final String maxDiskSize;
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    private final String name;
    /**
     * Configuration specific to on-premises instances.
     * 
     */
    private final OnPremisesConfigurationResponse onPremisesConfiguration;
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    private final SqlOutOfDiskReportResponse outOfDiskReport;
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    private final String project;
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    private final String region;
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    private final ReplicaConfigurationResponse replicaConfiguration;
    /**
     * The replicas of the instance.
     * 
     */
    private final List<String> replicaNames;
    /**
     * Initial root password. Use only on creation.
     * 
     */
    private final String rootPassword;
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    private final SqlScheduledMaintenanceResponse scheduledMaintenance;
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    private final String secondaryGceZone;
    /**
     * The URI of this resource.
     * 
     */
    private final String selfLink;
    /**
     * SSL configuration.
     * 
     */
    private final SslCertResponse serverCaCert;
    /**
     * The service account email address assigned to the instance.\This property is read-only.
     * 
     */
    private final String serviceAccountEmailAddress;
    /**
     * The user settings.
     * 
     */
    private final SettingsResponse settings;
    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    private final String state;
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    private final List<String> suspensionReason;

    @OutputCustomType.Constructor({"backendType","connectionName","createTime","currentDiskSize","databaseInstalledVersion","databaseVersion","diskEncryptionConfiguration","diskEncryptionStatus","failoverReplica","gceZone","instanceType","ipAddresses","kind","masterInstanceName","maxDiskSize","name","onPremisesConfiguration","outOfDiskReport","project","region","replicaConfiguration","replicaNames","rootPassword","satisfiesPzs","scheduledMaintenance","secondaryGceZone","selfLink","serverCaCert","serviceAccountEmailAddress","settings","state","suspensionReason"})
    private GetInstanceResult(
        String backendType,
        String connectionName,
        String createTime,
        String currentDiskSize,
        String databaseInstalledVersion,
        String databaseVersion,
        DiskEncryptionConfigurationResponse diskEncryptionConfiguration,
        DiskEncryptionStatusResponse diskEncryptionStatus,
        InstanceFailoverReplicaResponse failoverReplica,
        String gceZone,
        String instanceType,
        List<IpMappingResponse> ipAddresses,
        String kind,
        String masterInstanceName,
        String maxDiskSize,
        String name,
        OnPremisesConfigurationResponse onPremisesConfiguration,
        SqlOutOfDiskReportResponse outOfDiskReport,
        String project,
        String region,
        ReplicaConfigurationResponse replicaConfiguration,
        List<String> replicaNames,
        String rootPassword,
        Boolean satisfiesPzs,
        SqlScheduledMaintenanceResponse scheduledMaintenance,
        String secondaryGceZone,
        String selfLink,
        SslCertResponse serverCaCert,
        String serviceAccountEmailAddress,
        SettingsResponse settings,
        String state,
        List<String> suspensionReason) {
        this.backendType = Objects.requireNonNull(backendType);
        this.connectionName = Objects.requireNonNull(connectionName);
        this.createTime = Objects.requireNonNull(createTime);
        this.currentDiskSize = Objects.requireNonNull(currentDiskSize);
        this.databaseInstalledVersion = Objects.requireNonNull(databaseInstalledVersion);
        this.databaseVersion = Objects.requireNonNull(databaseVersion);
        this.diskEncryptionConfiguration = Objects.requireNonNull(diskEncryptionConfiguration);
        this.diskEncryptionStatus = Objects.requireNonNull(diskEncryptionStatus);
        this.failoverReplica = Objects.requireNonNull(failoverReplica);
        this.gceZone = Objects.requireNonNull(gceZone);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.ipAddresses = Objects.requireNonNull(ipAddresses);
        this.kind = Objects.requireNonNull(kind);
        this.masterInstanceName = Objects.requireNonNull(masterInstanceName);
        this.maxDiskSize = Objects.requireNonNull(maxDiskSize);
        this.name = Objects.requireNonNull(name);
        this.onPremisesConfiguration = Objects.requireNonNull(onPremisesConfiguration);
        this.outOfDiskReport = Objects.requireNonNull(outOfDiskReport);
        this.project = Objects.requireNonNull(project);
        this.region = Objects.requireNonNull(region);
        this.replicaConfiguration = Objects.requireNonNull(replicaConfiguration);
        this.replicaNames = Objects.requireNonNull(replicaNames);
        this.rootPassword = Objects.requireNonNull(rootPassword);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.scheduledMaintenance = Objects.requireNonNull(scheduledMaintenance);
        this.secondaryGceZone = Objects.requireNonNull(secondaryGceZone);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serverCaCert = Objects.requireNonNull(serverCaCert);
        this.serviceAccountEmailAddress = Objects.requireNonNull(serviceAccountEmailAddress);
        this.settings = Objects.requireNonNull(settings);
        this.state = Objects.requireNonNull(state);
        this.suspensionReason = Objects.requireNonNull(suspensionReason);
    }

    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    public String getBackendType() {
        return this.backendType;
    }
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    public String getConnectionName() {
        return this.connectionName;
    }
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    public String getCurrentDiskSize() {
        return this.currentDiskSize;
    }
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    public String getDatabaseInstalledVersion() {
        return this.databaseInstalledVersion;
    }
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    public String getDatabaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    public DiskEncryptionConfigurationResponse getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Disk encryption status specific to an instance.
     * 
     */
    public DiskEncryptionStatusResponse getDiskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The name and status of the failover replica.
     * 
     */
    public InstanceFailoverReplicaResponse getFailoverReplica() {
        return this.failoverReplica;
    }
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    public String getGceZone() {
        return this.gceZone;
    }
    /**
     * The instance type.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The assigned IP addresses for the instance.
     * 
     */
    public List<IpMappingResponse> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * This is always `sql#instance`.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    public String getMasterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    public String getMaxDiskSize() {
        return this.maxDiskSize;
    }
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration specific to on-premises instances.
     * 
     */
    public OnPremisesConfigurationResponse getOnPremisesConfiguration() {
        return this.onPremisesConfiguration;
    }
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    public SqlOutOfDiskReportResponse getOutOfDiskReport() {
        return this.outOfDiskReport;
    }
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    public String getProject() {
        return this.project;
    }
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    public ReplicaConfigurationResponse getReplicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The replicas of the instance.
     * 
     */
    public List<String> getReplicaNames() {
        return this.replicaNames;
    }
    /**
     * Initial root password. Use only on creation.
     * 
     */
    public String getRootPassword() {
        return this.rootPassword;
    }
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public SqlScheduledMaintenanceResponse getScheduledMaintenance() {
        return this.scheduledMaintenance;
    }
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    public String getSecondaryGceZone() {
        return this.secondaryGceZone;
    }
    /**
     * The URI of this resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * SSL configuration.
     * 
     */
    public SslCertResponse getServerCaCert() {
        return this.serverCaCert;
    }
    /**
     * The service account email address assigned to the instance.\This property is read-only.
     * 
     */
    public String getServiceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The user settings.
     * 
     */
    public SettingsResponse getSettings() {
        return this.settings;
    }
    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    public List<String> getSuspensionReason() {
        return this.suspensionReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendType;
        private String connectionName;
        private String createTime;
        private String currentDiskSize;
        private String databaseInstalledVersion;
        private String databaseVersion;
        private DiskEncryptionConfigurationResponse diskEncryptionConfiguration;
        private DiskEncryptionStatusResponse diskEncryptionStatus;
        private InstanceFailoverReplicaResponse failoverReplica;
        private String gceZone;
        private String instanceType;
        private List<IpMappingResponse> ipAddresses;
        private String kind;
        private String masterInstanceName;
        private String maxDiskSize;
        private String name;
        private OnPremisesConfigurationResponse onPremisesConfiguration;
        private SqlOutOfDiskReportResponse outOfDiskReport;
        private String project;
        private String region;
        private ReplicaConfigurationResponse replicaConfiguration;
        private List<String> replicaNames;
        private String rootPassword;
        private Boolean satisfiesPzs;
        private SqlScheduledMaintenanceResponse scheduledMaintenance;
        private String secondaryGceZone;
        private String selfLink;
        private SslCertResponse serverCaCert;
        private String serviceAccountEmailAddress;
        private SettingsResponse settings;
        private String state;
        private List<String> suspensionReason;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendType = defaults.backendType;
    	      this.connectionName = defaults.connectionName;
    	      this.createTime = defaults.createTime;
    	      this.currentDiskSize = defaults.currentDiskSize;
    	      this.databaseInstalledVersion = defaults.databaseInstalledVersion;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.diskEncryptionConfiguration = defaults.diskEncryptionConfiguration;
    	      this.diskEncryptionStatus = defaults.diskEncryptionStatus;
    	      this.failoverReplica = defaults.failoverReplica;
    	      this.gceZone = defaults.gceZone;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.kind = defaults.kind;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.maxDiskSize = defaults.maxDiskSize;
    	      this.name = defaults.name;
    	      this.onPremisesConfiguration = defaults.onPremisesConfiguration;
    	      this.outOfDiskReport = defaults.outOfDiskReport;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaConfiguration = defaults.replicaConfiguration;
    	      this.replicaNames = defaults.replicaNames;
    	      this.rootPassword = defaults.rootPassword;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.scheduledMaintenance = defaults.scheduledMaintenance;
    	      this.secondaryGceZone = defaults.secondaryGceZone;
    	      this.selfLink = defaults.selfLink;
    	      this.serverCaCert = defaults.serverCaCert;
    	      this.serviceAccountEmailAddress = defaults.serviceAccountEmailAddress;
    	      this.settings = defaults.settings;
    	      this.state = defaults.state;
    	      this.suspensionReason = defaults.suspensionReason;
        }

        public Builder setBackendType(String backendType) {
            this.backendType = Objects.requireNonNull(backendType);
            return this;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setCurrentDiskSize(String currentDiskSize) {
            this.currentDiskSize = Objects.requireNonNull(currentDiskSize);
            return this;
        }

        public Builder setDatabaseInstalledVersion(String databaseInstalledVersion) {
            this.databaseInstalledVersion = Objects.requireNonNull(databaseInstalledVersion);
            return this;
        }

        public Builder setDatabaseVersion(String databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }

        public Builder setDiskEncryptionConfiguration(DiskEncryptionConfigurationResponse diskEncryptionConfiguration) {
            this.diskEncryptionConfiguration = Objects.requireNonNull(diskEncryptionConfiguration);
            return this;
        }

        public Builder setDiskEncryptionStatus(DiskEncryptionStatusResponse diskEncryptionStatus) {
            this.diskEncryptionStatus = Objects.requireNonNull(diskEncryptionStatus);
            return this;
        }

        public Builder setFailoverReplica(InstanceFailoverReplicaResponse failoverReplica) {
            this.failoverReplica = Objects.requireNonNull(failoverReplica);
            return this;
        }

        public Builder setGceZone(String gceZone) {
            this.gceZone = Objects.requireNonNull(gceZone);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setIpAddresses(List<IpMappingResponse> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMasterInstanceName(String masterInstanceName) {
            this.masterInstanceName = Objects.requireNonNull(masterInstanceName);
            return this;
        }

        public Builder setMaxDiskSize(String maxDiskSize) {
            this.maxDiskSize = Objects.requireNonNull(maxDiskSize);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOnPremisesConfiguration(OnPremisesConfigurationResponse onPremisesConfiguration) {
            this.onPremisesConfiguration = Objects.requireNonNull(onPremisesConfiguration);
            return this;
        }

        public Builder setOutOfDiskReport(SqlOutOfDiskReportResponse outOfDiskReport) {
            this.outOfDiskReport = Objects.requireNonNull(outOfDiskReport);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setReplicaConfiguration(ReplicaConfigurationResponse replicaConfiguration) {
            this.replicaConfiguration = Objects.requireNonNull(replicaConfiguration);
            return this;
        }

        public Builder setReplicaNames(List<String> replicaNames) {
            this.replicaNames = Objects.requireNonNull(replicaNames);
            return this;
        }

        public Builder setRootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setScheduledMaintenance(SqlScheduledMaintenanceResponse scheduledMaintenance) {
            this.scheduledMaintenance = Objects.requireNonNull(scheduledMaintenance);
            return this;
        }

        public Builder setSecondaryGceZone(String secondaryGceZone) {
            this.secondaryGceZone = Objects.requireNonNull(secondaryGceZone);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServerCaCert(SslCertResponse serverCaCert) {
            this.serverCaCert = Objects.requireNonNull(serverCaCert);
            return this;
        }

        public Builder setServiceAccountEmailAddress(String serviceAccountEmailAddress) {
            this.serviceAccountEmailAddress = Objects.requireNonNull(serviceAccountEmailAddress);
            return this;
        }

        public Builder setSettings(SettingsResponse settings) {
            this.settings = Objects.requireNonNull(settings);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSuspensionReason(List<String> suspensionReason) {
            this.suspensionReason = Objects.requireNonNull(suspensionReason);
            return this;
        }

        public GetInstanceResult build() {
            return new GetInstanceResult(backendType, connectionName, createTime, currentDiskSize, databaseInstalledVersion, databaseVersion, diskEncryptionConfiguration, diskEncryptionStatus, failoverReplica, gceZone, instanceType, ipAddresses, kind, masterInstanceName, maxDiskSize, name, onPremisesConfiguration, outOfDiskReport, project, region, replicaConfiguration, replicaNames, rootPassword, satisfiesPzs, scheduledMaintenance, secondaryGceZone, selfLink, serverCaCert, serviceAccountEmailAddress, settings, state, suspensionReason);
        }
    }
}
