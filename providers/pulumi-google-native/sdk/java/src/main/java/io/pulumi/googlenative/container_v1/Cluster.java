// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.container_v1.ClusterArgs;
import io.pulumi.googlenative.container_v1.outputs.AddonsConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.AuthenticatorGroupsConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.AutopilotResponse;
import io.pulumi.googlenative.container_v1.outputs.BinaryAuthorizationResponse;
import io.pulumi.googlenative.container_v1.outputs.ClusterAutoscalingResponse;
import io.pulumi.googlenative.container_v1.outputs.ConfidentialNodesResponse;
import io.pulumi.googlenative.container_v1.outputs.DatabaseEncryptionResponse;
import io.pulumi.googlenative.container_v1.outputs.IPAllocationPolicyResponse;
import io.pulumi.googlenative.container_v1.outputs.LegacyAbacResponse;
import io.pulumi.googlenative.container_v1.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.MaintenancePolicyResponse;
import io.pulumi.googlenative.container_v1.outputs.MasterAuthResponse;
import io.pulumi.googlenative.container_v1.outputs.MasterAuthorizedNetworksConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.MaxPodsConstraintResponse;
import io.pulumi.googlenative.container_v1.outputs.MeshCertificatesResponse;
import io.pulumi.googlenative.container_v1.outputs.MonitoringConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.NetworkPolicyResponse;
import io.pulumi.googlenative.container_v1.outputs.NodePoolDefaultsResponse;
import io.pulumi.googlenative.container_v1.outputs.NodePoolResponse;
import io.pulumi.googlenative.container_v1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.PrivateClusterConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.ReleaseChannelResponse;
import io.pulumi.googlenative.container_v1.outputs.ResourceUsageExportConfigResponse;
import io.pulumi.googlenative.container_v1.outputs.ShieldedNodesResponse;
import io.pulumi.googlenative.container_v1.outputs.StatusConditionResponse;
import io.pulumi.googlenative.container_v1.outputs.VerticalPodAutoscalingResponse;
import io.pulumi.googlenative.container_v1.outputs.WorkloadIdentityConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a cluster, consisting of the specified number and type of Google Compute Engine instances. By default, the cluster is created in the project's [default network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks). One firewall is added for the cluster. After cluster creation, the Kubelet creates routes for each node to allow the containers on that node to communicate with all other instances in the cluster. Finally, an entry is added to the project's global metadata indicating which CIDR range the cluster is using.
 * 
 */
@ResourceType(type="google-native:container/v1:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Configurations for the various addons available to run in the cluster.
     * 
     */
    @OutputExport(name="addonsConfig", type=AddonsConfigResponse.class, parameters={})
    private Output<AddonsConfigResponse> addonsConfig;

    /**
     * @return Configurations for the various addons available to run in the cluster.
     * 
     */
    public Output<AddonsConfigResponse> getAddonsConfig() {
        return this.addonsConfig;
    }
    /**
     * Configuration controlling RBAC group membership information.
     * 
     */
    @OutputExport(name="authenticatorGroupsConfig", type=AuthenticatorGroupsConfigResponse.class, parameters={})
    private Output<AuthenticatorGroupsConfigResponse> authenticatorGroupsConfig;

    /**
     * @return Configuration controlling RBAC group membership information.
     * 
     */
    public Output<AuthenticatorGroupsConfigResponse> getAuthenticatorGroupsConfig() {
        return this.authenticatorGroupsConfig;
    }
    /**
     * Autopilot configuration for the cluster.
     * 
     */
    @OutputExport(name="autopilot", type=AutopilotResponse.class, parameters={})
    private Output<AutopilotResponse> autopilot;

    /**
     * @return Autopilot configuration for the cluster.
     * 
     */
    public Output<AutopilotResponse> getAutopilot() {
        return this.autopilot;
    }
    /**
     * Cluster-level autoscaling configuration.
     * 
     */
    @OutputExport(name="autoscaling", type=ClusterAutoscalingResponse.class, parameters={})
    private Output<ClusterAutoscalingResponse> autoscaling;

    /**
     * @return Cluster-level autoscaling configuration.
     * 
     */
    public Output<ClusterAutoscalingResponse> getAutoscaling() {
        return this.autoscaling;
    }
    /**
     * Configuration for Binary Authorization.
     * 
     */
    @OutputExport(name="binaryAuthorization", type=BinaryAuthorizationResponse.class, parameters={})
    private Output<BinaryAuthorizationResponse> binaryAuthorization;

    /**
     * @return Configuration for Binary Authorization.
     * 
     */
    public Output<BinaryAuthorizationResponse> getBinaryAuthorization() {
        return this.binaryAuthorization;
    }
    /**
     * The IP address range of the container pods in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`). Leave blank to have one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
     * 
     */
    @OutputExport(name="clusterIpv4Cidr", type=String.class, parameters={})
    private Output<String> clusterIpv4Cidr;

    /**
     * @return The IP address range of the container pods in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`). Leave blank to have one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
     * 
     */
    public Output<String> getClusterIpv4Cidr() {
        return this.clusterIpv4Cidr;
    }
    /**
     * Which conditions caused the current cluster state.
     * 
     */
    @OutputExport(name="conditions", type=List.class, parameters={StatusConditionResponse.class})
    private Output<List<StatusConditionResponse>> conditions;

    /**
     * @return Which conditions caused the current cluster state.
     * 
     */
    public Output<List<StatusConditionResponse>> getConditions() {
        return this.conditions;
    }
    /**
     * Configuration of Confidential Nodes
     * 
     */
    @OutputExport(name="confidentialNodes", type=ConfidentialNodesResponse.class, parameters={})
    private Output<ConfidentialNodesResponse> confidentialNodes;

    /**
     * @return Configuration of Confidential Nodes
     * 
     */
    public Output<ConfidentialNodesResponse> getConfidentialNodes() {
        return this.confidentialNodes;
    }
    /**
     * [Output only] The time the cluster was created, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return [Output only] The time the cluster was created, in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * [Output only] The current software version of the master endpoint.
     * 
     */
    @OutputExport(name="currentMasterVersion", type=String.class, parameters={})
    private Output<String> currentMasterVersion;

    /**
     * @return [Output only] The current software version of the master endpoint.
     * 
     */
    public Output<String> getCurrentMasterVersion() {
        return this.currentMasterVersion;
    }
    /**
     * [Output only] Deprecated, use [NodePools.version](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools) instead. The current version of the node software components. If they are currently at multiple versions because they're in the process of being upgraded, this reflects the minimum version of all nodes.
     * 
     */
    @OutputExport(name="currentNodeVersion", type=String.class, parameters={})
    private Output<String> currentNodeVersion;

    /**
     * @return [Output only] Deprecated, use [NodePools.version](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools) instead. The current version of the node software components. If they are currently at multiple versions because they're in the process of being upgraded, this reflects the minimum version of all nodes.
     * 
     */
    public Output<String> getCurrentNodeVersion() {
        return this.currentNodeVersion;
    }
    /**
     * Configuration of etcd encryption.
     * 
     */
    @OutputExport(name="databaseEncryption", type=DatabaseEncryptionResponse.class, parameters={})
    private Output<DatabaseEncryptionResponse> databaseEncryption;

    /**
     * @return Configuration of etcd encryption.
     * 
     */
    public Output<DatabaseEncryptionResponse> getDatabaseEncryption() {
        return this.databaseEncryption;
    }
    /**
     * The default constraint on the maximum number of pods that can be run simultaneously on a node in the node pool of this cluster. Only honored if cluster created with IP Alias support.
     * 
     */
    @OutputExport(name="defaultMaxPodsConstraint", type=MaxPodsConstraintResponse.class, parameters={})
    private Output<MaxPodsConstraintResponse> defaultMaxPodsConstraint;

    /**
     * @return The default constraint on the maximum number of pods that can be run simultaneously on a node in the node pool of this cluster. Only honored if cluster created with IP Alias support.
     * 
     */
    public Output<MaxPodsConstraintResponse> getDefaultMaxPodsConstraint() {
        return this.defaultMaxPodsConstraint;
    }
    /**
     * An optional description of this cluster.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this cluster.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Kubernetes alpha features are enabled on this cluster. This includes alpha API groups (e.g. v1alpha1) and features that may not be production ready in the kubernetes version of the master and nodes. The cluster has no SLA for uptime and master/node upgrades are disabled. Alpha enabled clusters are automatically deleted thirty days after creation.
     * 
     */
    @OutputExport(name="enableKubernetesAlpha", type=Boolean.class, parameters={})
    private Output<Boolean> enableKubernetesAlpha;

    /**
     * @return Kubernetes alpha features are enabled on this cluster. This includes alpha API groups (e.g. v1alpha1) and features that may not be production ready in the kubernetes version of the master and nodes. The cluster has no SLA for uptime and master/node upgrades are disabled. Alpha enabled clusters are automatically deleted thirty days after creation.
     * 
     */
    public Output<Boolean> getEnableKubernetesAlpha() {
        return this.enableKubernetesAlpha;
    }
    /**
     * Enable the ability to use Cloud TPUs in this cluster.
     * 
     */
    @OutputExport(name="enableTpu", type=Boolean.class, parameters={})
    private Output<Boolean> enableTpu;

    /**
     * @return Enable the ability to use Cloud TPUs in this cluster.
     * 
     */
    public Output<Boolean> getEnableTpu() {
        return this.enableTpu;
    }
    /**
     * [Output only] The IP address of this cluster's master endpoint. The endpoint can be accessed from the internet at `https://username:password@endpoint/`. See the `masterAuth` property of this resource for username and password information.
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return [Output only] The IP address of this cluster's master endpoint. The endpoint can be accessed from the internet at `https://username:password@endpoint/`. See the `masterAuth` property of this resource for username and password information.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * [Output only] The time the cluster will be automatically deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    @OutputExport(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return [Output only] The time the cluster will be automatically deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
     * 
     */
    public Output<String> getExpireTime() {
        return this.expireTime;
    }
    /**
     * The initial Kubernetes version for this cluster. Valid versions are those found in validMasterVersions returned by getServerConfig. The version can be upgraded over time; such upgrades are reflected in currentMasterVersion and currentNodeVersion. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "","-": picks the default Kubernetes version
     * 
     */
    @OutputExport(name="initialClusterVersion", type=String.class, parameters={})
    private Output<String> initialClusterVersion;

    /**
     * @return The initial Kubernetes version for this cluster. Valid versions are those found in validMasterVersions returned by getServerConfig. The version can be upgraded over time; such upgrades are reflected in currentMasterVersion and currentNodeVersion. Users may specify either explicit versions offered by Kubernetes Engine or version aliases, which have the following behavior: - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "","-": picks the default Kubernetes version
     * 
     */
    public Output<String> getInitialClusterVersion() {
        return this.initialClusterVersion;
    }
    /**
     * Configuration for cluster IP allocation.
     * 
     */
    @OutputExport(name="ipAllocationPolicy", type=IPAllocationPolicyResponse.class, parameters={})
    private Output<IPAllocationPolicyResponse> ipAllocationPolicy;

    /**
     * @return Configuration for cluster IP allocation.
     * 
     */
    public Output<IPAllocationPolicyResponse> getIpAllocationPolicy() {
        return this.ipAllocationPolicy;
    }
    /**
     * The fingerprint of the set of labels for this cluster.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint of the set of labels for this cluster.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Configuration for the legacy ABAC authorization mode.
     * 
     */
    @OutputExport(name="legacyAbac", type=LegacyAbacResponse.class, parameters={})
    private Output<LegacyAbacResponse> legacyAbac;

    /**
     * @return Configuration for the legacy ABAC authorization mode.
     * 
     */
    public Output<LegacyAbacResponse> getLegacyAbac() {
        return this.legacyAbac;
    }
    /**
     * [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return [Output only] The name of the Google Compute Engine [zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) or [region](https://cloud.google.com/compute/docs/regions-zones/regions-zones#available) in which the cluster resides.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This field provides a default value if [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) are not specified during node pool creation. Warning: changing cluster locations will update the [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) of all node pools and will result in nodes being added and/or removed.
     * 
     */
    @OutputExport(name="locations", type=List.class, parameters={String.class})
    private Output<List<String>> locations;

    /**
     * @return The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the cluster's nodes should be located. This field provides a default value if [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) are not specified during node pool creation. Warning: changing cluster locations will update the [NodePool.Locations](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters.nodePools#NodePool.FIELDS.locations) of all node pools and will result in nodes being added and/or removed.
     * 
     */
    public Output<List<String>> getLocations() {
        return this.locations;
    }
    /**
     * Logging configuration for the cluster.
     * 
     */
    @OutputExport(name="loggingConfig", type=LoggingConfigResponse.class, parameters={})
    private Output<LoggingConfigResponse> loggingConfig;

    /**
     * @return Logging configuration for the cluster.
     * 
     */
    public Output<LoggingConfigResponse> getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
     * 
     */
    @OutputExport(name="loggingService", type=String.class, parameters={})
    private Output<String> loggingService;

    /**
     * @return The logging service the cluster should use to write logs. Currently available options: * `logging.googleapis.com/kubernetes` - The Cloud Logging service with a Kubernetes-native resource model * `logging.googleapis.com` - The legacy Cloud Logging service (no longer available as of GKE 1.15). * `none` - no logs will be exported from the cluster. If left as an empty string,`logging.googleapis.com/kubernetes` will be used for GKE 1.14+ or `logging.googleapis.com` for earlier versions.
     * 
     */
    public Output<String> getLoggingService() {
        return this.loggingService;
    }
    /**
     * Configure the maintenance policy for this cluster.
     * 
     */
    @OutputExport(name="maintenancePolicy", type=MaintenancePolicyResponse.class, parameters={})
    private Output<MaintenancePolicyResponse> maintenancePolicy;

    /**
     * @return Configure the maintenance policy for this cluster.
     * 
     */
    public Output<MaintenancePolicyResponse> getMaintenancePolicy() {
        return this.maintenancePolicy;
    }
    /**
     * The authentication information for accessing the master endpoint. If unspecified, the defaults are used: For clusters before v1.12, if master_auth is unspecified, `username` will be set to "admin", a random password will be generated, and a client certificate will be issued.
     * 
     */
    @OutputExport(name="masterAuth", type=MasterAuthResponse.class, parameters={})
    private Output<MasterAuthResponse> masterAuth;

    /**
     * @return The authentication information for accessing the master endpoint. If unspecified, the defaults are used: For clusters before v1.12, if master_auth is unspecified, `username` will be set to "admin", a random password will be generated, and a client certificate will be issued.
     * 
     */
    public Output<MasterAuthResponse> getMasterAuth() {
        return this.masterAuth;
    }
    /**
     * The configuration options for master authorized networks feature.
     * 
     */
    @OutputExport(name="masterAuthorizedNetworksConfig", type=MasterAuthorizedNetworksConfigResponse.class, parameters={})
    private Output<MasterAuthorizedNetworksConfigResponse> masterAuthorizedNetworksConfig;

    /**
     * @return The configuration options for master authorized networks feature.
     * 
     */
    public Output<MasterAuthorizedNetworksConfigResponse> getMasterAuthorizedNetworksConfig() {
        return this.masterAuthorizedNetworksConfig;
    }
    /**
     * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
     * 
     */
    @OutputExport(name="meshCertificates", type=MeshCertificatesResponse.class, parameters={})
    private Output<MeshCertificatesResponse> meshCertificates;

    /**
     * @return Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
     * 
     */
    public Output<MeshCertificatesResponse> getMeshCertificates() {
        return this.meshCertificates;
    }
    /**
     * Monitoring configuration for the cluster.
     * 
     */
    @OutputExport(name="monitoringConfig", type=MonitoringConfigResponse.class, parameters={})
    private Output<MonitoringConfigResponse> monitoringConfig;

    /**
     * @return Monitoring configuration for the cluster.
     * 
     */
    public Output<MonitoringConfigResponse> getMonitoringConfig() {
        return this.monitoringConfig;
    }
    /**
     * The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
     * 
     */
    @OutputExport(name="monitoringService", type=String.class, parameters={})
    private Output<String> monitoringService;

    /**
     * @return The monitoring service the cluster should use to write metrics. Currently available options: * "monitoring.googleapis.com/kubernetes" - The Cloud Monitoring service with a Kubernetes-native resource model * `monitoring.googleapis.com` - The legacy Cloud Monitoring service (no longer available as of GKE 1.15). * `none` - No metrics will be exported from the cluster. If left as an empty string,`monitoring.googleapis.com/kubernetes` will be used for GKE 1.14+ or `monitoring.googleapis.com` for earlier versions.
     * 
     */
    public Output<String> getMonitoringService() {
        return this.monitoringService;
    }
    /**
     * The name of this cluster. The name must be unique within this project and location (e.g. zone or region), and can be up to 40 characters with the following restrictions: * Lowercase letters, numbers, and hyphens only. * Must start with a letter. * Must end with a number or a letter.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this cluster. The name must be unique within this project and location (e.g. zone or region), and can be up to 40 characters with the following restrictions: * Lowercase letters, numbers, and hyphens only. * Must start with a letter. * Must end with a number or a letter.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The name of the Google Compute Engine [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The name of the Google Compute Engine [network](https://cloud.google.com/compute/docs/networks-and-firewalls#networks) to which the cluster is connected. If left unspecified, the `default` network will be used.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Configuration for cluster networking.
     * 
     */
    @OutputExport(name="networkConfig", type=NetworkConfigResponse.class, parameters={})
    private Output<NetworkConfigResponse> networkConfig;

    /**
     * @return Configuration for cluster networking.
     * 
     */
    public Output<NetworkConfigResponse> getNetworkConfig() {
        return this.networkConfig;
    }
    /**
     * Configuration options for the NetworkPolicy feature.
     * 
     */
    @OutputExport(name="networkPolicy", type=NetworkPolicyResponse.class, parameters={})
    private Output<NetworkPolicyResponse> networkPolicy;

    /**
     * @return Configuration options for the NetworkPolicy feature.
     * 
     */
    public Output<NetworkPolicyResponse> getNetworkPolicy() {
        return this.networkPolicy;
    }
    /**
     * [Output only] The size of the address space on each node for hosting containers. This is provisioned from within the `container_ipv4_cidr` range. This field will only be set when cluster is in route-based network mode.
     * 
     */
    @OutputExport(name="nodeIpv4CidrSize", type=Integer.class, parameters={})
    private Output<Integer> nodeIpv4CidrSize;

    /**
     * @return [Output only] The size of the address space on each node for hosting containers. This is provisioned from within the `container_ipv4_cidr` range. This field will only be set when cluster is in route-based network mode.
     * 
     */
    public Output<Integer> getNodeIpv4CidrSize() {
        return this.nodeIpv4CidrSize;
    }
    /**
     * Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object.
     * 
     */
    @OutputExport(name="nodePoolDefaults", type=NodePoolDefaultsResponse.class, parameters={})
    private Output<NodePoolDefaultsResponse> nodePoolDefaults;

    /**
     * @return Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object.
     * 
     */
    public Output<NodePoolDefaultsResponse> getNodePoolDefaults() {
        return this.nodePoolDefaults;
    }
    /**
     * The node pools associated with this cluster. This field should not be set if "node_config" or "initial_node_count" are specified.
     * 
     */
    @OutputExport(name="nodePools", type=List.class, parameters={NodePoolResponse.class})
    private Output<List<NodePoolResponse>> nodePools;

    /**
     * @return The node pools associated with this cluster. This field should not be set if "node_config" or "initial_node_count" are specified.
     * 
     */
    public Output<List<NodePoolResponse>> getNodePools() {
        return this.nodePools;
    }
    /**
     * Notification configuration of the cluster.
     * 
     */
    @OutputExport(name="notificationConfig", type=NotificationConfigResponse.class, parameters={})
    private Output<NotificationConfigResponse> notificationConfig;

    /**
     * @return Notification configuration of the cluster.
     * 
     */
    public Output<NotificationConfigResponse> getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * Configuration for private cluster.
     * 
     */
    @OutputExport(name="privateClusterConfig", type=PrivateClusterConfigResponse.class, parameters={})
    private Output<PrivateClusterConfigResponse> privateClusterConfig;

    /**
     * @return Configuration for private cluster.
     * 
     */
    public Output<PrivateClusterConfigResponse> getPrivateClusterConfig() {
        return this.privateClusterConfig;
    }
    /**
     * Release channel configuration.
     * 
     */
    @OutputExport(name="releaseChannel", type=ReleaseChannelResponse.class, parameters={})
    private Output<ReleaseChannelResponse> releaseChannel;

    /**
     * @return Release channel configuration.
     * 
     */
    public Output<ReleaseChannelResponse> getReleaseChannel() {
        return this.releaseChannel;
    }
    /**
     * The resource labels for the cluster to use to annotate any related Google Compute Engine resources.
     * 
     */
    @OutputExport(name="resourceLabels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> resourceLabels;

    /**
     * @return The resource labels for the cluster to use to annotate any related Google Compute Engine resources.
     * 
     */
    public Output<Map<String,String>> getResourceLabels() {
        return this.resourceLabels;
    }
    /**
     * Configuration for exporting resource usages. Resource usage export is disabled when this config is unspecified.
     * 
     */
    @OutputExport(name="resourceUsageExportConfig", type=ResourceUsageExportConfigResponse.class, parameters={})
    private Output<ResourceUsageExportConfigResponse> resourceUsageExportConfig;

    /**
     * @return Configuration for exporting resource usages. Resource usage export is disabled when this config is unspecified.
     * 
     */
    public Output<ResourceUsageExportConfigResponse> getResourceUsageExportConfig() {
        return this.resourceUsageExportConfig;
    }
    /**
     * [Output only] Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return [Output only] Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * [Output only] The IP address range of the Kubernetes services in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`). Service addresses are typically put in the last `/16` from the container CIDR.
     * 
     */
    @OutputExport(name="servicesIpv4Cidr", type=String.class, parameters={})
    private Output<String> servicesIpv4Cidr;

    /**
     * @return [Output only] The IP address range of the Kubernetes services in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`). Service addresses are typically put in the last `/16` from the container CIDR.
     * 
     */
    public Output<String> getServicesIpv4Cidr() {
        return this.servicesIpv4Cidr;
    }
    /**
     * Shielded Nodes configuration.
     * 
     */
    @OutputExport(name="shieldedNodes", type=ShieldedNodesResponse.class, parameters={})
    private Output<ShieldedNodesResponse> shieldedNodes;

    /**
     * @return Shielded Nodes configuration.
     * 
     */
    public Output<ShieldedNodesResponse> getShieldedNodes() {
        return this.shieldedNodes;
    }
    /**
     * [Output only] The current status of this cluster.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return [Output only] The current status of this cluster.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * The name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/subnetworks) to which the cluster is connected.
     * 
     */
    @OutputExport(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    /**
     * @return The name of the Google Compute Engine [subnetwork](https://cloud.google.com/compute/docs/subnetworks) to which the cluster is connected.
     * 
     */
    public Output<String> getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * [Output only] The IP address range of the Cloud TPUs in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`).
     * 
     */
    @OutputExport(name="tpuIpv4CidrBlock", type=String.class, parameters={})
    private Output<String> tpuIpv4CidrBlock;

    /**
     * @return [Output only] The IP address range of the Cloud TPUs in this cluster, in [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `1.2.3.4/29`).
     * 
     */
    public Output<String> getTpuIpv4CidrBlock() {
        return this.tpuIpv4CidrBlock;
    }
    /**
     * Cluster-level Vertical Pod Autoscaling configuration.
     * 
     */
    @OutputExport(name="verticalPodAutoscaling", type=VerticalPodAutoscalingResponse.class, parameters={})
    private Output<VerticalPodAutoscalingResponse> verticalPodAutoscaling;

    /**
     * @return Cluster-level Vertical Pod Autoscaling configuration.
     * 
     */
    public Output<VerticalPodAutoscalingResponse> getVerticalPodAutoscaling() {
        return this.verticalPodAutoscaling;
    }
    /**
     * Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
     * 
     */
    @OutputExport(name="workloadIdentityConfig", type=WorkloadIdentityConfigResponse.class, parameters={})
    private Output<WorkloadIdentityConfigResponse> workloadIdentityConfig;

    /**
     * @return Configuration for the use of Kubernetes Service Accounts in GCP IAM policies.
     * 
     */
    public Output<WorkloadIdentityConfigResponse> getWorkloadIdentityConfig() {
        return this.workloadIdentityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:container/v1:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:container/v1:Cluster", name, null, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
