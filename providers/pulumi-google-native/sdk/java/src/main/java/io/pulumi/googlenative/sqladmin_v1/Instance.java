// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.sqladmin_v1.InstanceArgs;
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
import javax.annotation.Nullable;

/**
 * Creates a new Cloud SQL instance.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    @OutputExport(name="backendType", type=String.class, parameters={})
    private Output<String> backendType;

    /**
     * @return The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by Google. This property is read-only; use the `tier` property in the `settings` object to determine the database type.
     * 
     */
    public Output<String> getBackendType() {
        return this.backendType;
    }
    /**
     * Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    @OutputExport(name="connectionName", type=String.class, parameters={})
    private Output<String> connectionName;

    /**
     * @return Connection name of the Cloud SQL instance used in connection strings.
     * 
     */
    public Output<String> getConnectionName() {
        return this.connectionName;
    }
    /**
     * The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the instance was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    @OutputExport(name="currentDiskSize", type=String.class, parameters={})
    private Output<String> currentDiskSize;

    /**
     * @return The current disk usage of the instance in bytes. This property has been deprecated. Use the "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead. Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
     * 
     */
    public Output<String> getCurrentDiskSize() {
        return this.currentDiskSize;
    }
    /**
     * Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    @OutputExport(name="databaseInstalledVersion", type=String.class, parameters={})
    private Output<String> databaseInstalledVersion;

    /**
     * @return Stores the current database version running on the instance including minor version such as `MYSQL_8_0_18`.
     * 
     */
    public Output<String> getDatabaseInstalledVersion() {
        return this.databaseInstalledVersion;
    }
    /**
     * The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    @OutputExport(name="databaseVersion", type=String.class, parameters={})
    private Output<String> databaseVersion;

    /**
     * @return The database engine type and version. The `databaseVersion` field cannot be changed after instance creation.
     * 
     */
    public Output<String> getDatabaseVersion() {
        return this.databaseVersion;
    }
    /**
     * Disk encryption configuration specific to an instance.
     * 
     */
    @OutputExport(name="diskEncryptionConfiguration", type=DiskEncryptionConfigurationResponse.class, parameters={})
    private Output<DiskEncryptionConfigurationResponse> diskEncryptionConfiguration;

    /**
     * @return Disk encryption configuration specific to an instance.
     * 
     */
    public Output<DiskEncryptionConfigurationResponse> getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }
    /**
     * Disk encryption status specific to an instance.
     * 
     */
    @OutputExport(name="diskEncryptionStatus", type=DiskEncryptionStatusResponse.class, parameters={})
    private Output<DiskEncryptionStatusResponse> diskEncryptionStatus;

    /**
     * @return Disk encryption status specific to an instance.
     * 
     */
    public Output<DiskEncryptionStatusResponse> getDiskEncryptionStatus() {
        return this.diskEncryptionStatus;
    }
    /**
     * The name and status of the failover replica.
     * 
     */
    @OutputExport(name="failoverReplica", type=InstanceFailoverReplicaResponse.class, parameters={})
    private Output<InstanceFailoverReplicaResponse> failoverReplica;

    /**
     * @return The name and status of the failover replica.
     * 
     */
    public Output<InstanceFailoverReplicaResponse> getFailoverReplica() {
        return this.failoverReplica;
    }
    /**
     * The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    @OutputExport(name="gceZone", type=String.class, parameters={})
    private Output<String> gceZone;

    /**
     * @return The Compute Engine zone that the instance is currently serving from. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary zone. WARNING: Changing this might restart the instance.
     * 
     */
    public Output<String> getGceZone() {
        return this.gceZone;
    }
    /**
     * The instance type.
     * 
     */
    @OutputExport(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The instance type.
     * 
     */
    public Output<String> getInstanceType() {
        return this.instanceType;
    }
    /**
     * The assigned IP addresses for the instance.
     * 
     */
    @OutputExport(name="ipAddresses", type=List.class, parameters={IpMappingResponse.class})
    private Output<List<IpMappingResponse>> ipAddresses;

    /**
     * @return The assigned IP addresses for the instance.
     * 
     */
    public Output<List<IpMappingResponse>> getIpAddresses() {
        return this.ipAddresses;
    }
    /**
     * This is always `sql#instance`.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#instance`.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The name of the instance which will act as primary in the replication setup.
     * 
     */
    @OutputExport(name="masterInstanceName", type=String.class, parameters={})
    private Output<String> masterInstanceName;

    /**
     * @return The name of the instance which will act as primary in the replication setup.
     * 
     */
    public Output<String> getMasterInstanceName() {
        return this.masterInstanceName;
    }
    /**
     * The maximum disk size of the instance in bytes.
     * 
     */
    @OutputExport(name="maxDiskSize", type=String.class, parameters={})
    private Output<String> maxDiskSize;

    /**
     * @return The maximum disk size of the instance in bytes.
     * 
     */
    public Output<String> getMaxDiskSize() {
        return this.maxDiskSize;
    }
    /**
     * Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Cloud SQL instance. This does not include the project ID.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration specific to on-premises instances.
     * 
     */
    @OutputExport(name="onPremisesConfiguration", type=OnPremisesConfigurationResponse.class, parameters={})
    private Output<OnPremisesConfigurationResponse> onPremisesConfiguration;

    /**
     * @return Configuration specific to on-premises instances.
     * 
     */
    public Output<OnPremisesConfigurationResponse> getOnPremisesConfiguration() {
        return this.onPremisesConfiguration;
    }
    /**
     * This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @OutputExport(name="outOfDiskReport", type=SqlOutOfDiskReportResponse.class, parameters={})
    private Output<SqlOutOfDiskReportResponse> outOfDiskReport;

    /**
     * @return This field represents the report generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    public Output<SqlOutOfDiskReportResponse> getOutOfDiskReport() {
        return this.outOfDiskReport;
    }
    /**
     * The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project ID of the project containing the Cloud SQL instance. The Google apps domain is prefixed if applicable.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1` (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or `us-central1` depending on the instance type. The region cannot be changed after instance creation.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * Configuration specific to failover replicas and read replicas.
     * 
     */
    @OutputExport(name="replicaConfiguration", type=ReplicaConfigurationResponse.class, parameters={})
    private Output<ReplicaConfigurationResponse> replicaConfiguration;

    /**
     * @return Configuration specific to failover replicas and read replicas.
     * 
     */
    public Output<ReplicaConfigurationResponse> getReplicaConfiguration() {
        return this.replicaConfiguration;
    }
    /**
     * The replicas of the instance.
     * 
     */
    @OutputExport(name="replicaNames", type=List.class, parameters={String.class})
    private Output<List<String>> replicaNames;

    /**
     * @return The replicas of the instance.
     * 
     */
    public Output<List<String>> getReplicaNames() {
        return this.replicaNames;
    }
    /**
     * Initial root password. Use only on creation.
     * 
     */
    @OutputExport(name="rootPassword", type=String.class, parameters={})
    private Output<String> rootPassword;

    /**
     * @return Initial root password. Use only on creation.
     * 
     */
    public Output<String> getRootPassword() {
        return this.rootPassword;
    }
    /**
     * The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return The status indicating if instance satisfiesPzs. Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    @OutputExport(name="scheduledMaintenance", type=SqlScheduledMaintenanceResponse.class, parameters={})
    private Output<SqlScheduledMaintenanceResponse> scheduledMaintenance;

    /**
     * @return The start time of any upcoming scheduled maintenance for this instance.
     * 
     */
    public Output<SqlScheduledMaintenanceResponse> getScheduledMaintenance() {
        return this.scheduledMaintenance;
    }
    /**
     * The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    @OutputExport(name="secondaryGceZone", type=String.class, parameters={})
    private Output<String> secondaryGceZone;

    /**
     * @return The Compute Engine zone that the failover instance is currently serving from for a regional instance. This value could be different from the zone that was specified when the instance was created if the instance has failed over to its secondary/failover zone. Reserved for future use.
     * 
     */
    public Output<String> getSecondaryGceZone() {
        return this.secondaryGceZone;
    }
    /**
     * The URI of this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * SSL configuration.
     * 
     */
    @OutputExport(name="serverCaCert", type=SslCertResponse.class, parameters={})
    private Output<SslCertResponse> serverCaCert;

    /**
     * @return SSL configuration.
     * 
     */
    public Output<SslCertResponse> getServerCaCert() {
        return this.serverCaCert;
    }
    /**
     * The service account email address assigned to the instance.\This property is read-only.
     * 
     */
    @OutputExport(name="serviceAccountEmailAddress", type=String.class, parameters={})
    private Output<String> serviceAccountEmailAddress;

    /**
     * @return The service account email address assigned to the instance.\This property is read-only.
     * 
     */
    public Output<String> getServiceAccountEmailAddress() {
        return this.serviceAccountEmailAddress;
    }
    /**
     * The user settings.
     * 
     */
    @OutputExport(name="settings", type=SettingsResponse.class, parameters={})
    private Output<SettingsResponse> settings;

    /**
     * @return The user settings.
     * 
     */
    public Output<SettingsResponse> getSettings() {
        return this.settings;
    }
    /**
     * The current serving state of the Cloud SQL instance.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current serving state of the Cloud SQL instance.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    @OutputExport(name="suspensionReason", type=List.class, parameters={String.class})
    private Output<List<String>> suspensionReason;

    /**
     * @return If the instance state is SUSPENDED, the reason for the suspension.
     * 
     */
    public Output<List<String>> getSuspensionReason() {
        return this.suspensionReason;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, @Nullable InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1:Instance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, options);
    }
}
