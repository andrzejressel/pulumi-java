// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.ClusterNodePoolAutoscaling;
import io.pulumi.gcp.container.outputs.ClusterNodePoolManagement;
import io.pulumi.gcp.container.outputs.ClusterNodePoolNetworkConfig;
import io.pulumi.gcp.container.outputs.ClusterNodePoolNodeConfig;
import io.pulumi.gcp.container.outputs.ClusterNodePoolUpgradeSettings;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNodePool {
    private final @Nullable ClusterNodePoolAutoscaling autoscaling;
    /**
     * The number of nodes to create in this
     * cluster's default node pool. In regional or multi-zonal clusters, this is the
     * number of nodes per zone. Must be set if `node_pool` is not set. If you're using
     * `gcp.container.NodePool` objects with no default node pool, you'll need to
     * set this to a value of at least `1`, alongside setting
     * `remove_default_node_pool` to `true`.
     * 
     */
    private final @Nullable Integer initialNodeCount;
    private final @Nullable List<String> instanceGroupUrls;
    private final @Nullable List<String> managedInstanceGroupUrls;
    private final @Nullable ClusterNodePoolManagement management;
    private final @Nullable Integer maxPodsPerNode;
    /**
     * The name of the cluster, unique within the project and
     * location.
     * 
     */
    private final @Nullable String name;
    private final @Nullable String namePrefix;
    /**
     * Configuration for
     * [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Structure is documented below
     * 
     */
    private final @Nullable ClusterNodePoolNetworkConfig networkConfig;
    /**
     * Parameters used in creating the default node pool.
     * Generally, this field should not be used at the same time as a
     * `gcp.container.NodePool` or a `node_pool` block; this configuration
     * manages the default node pool, which isn't recommended to be used.
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodePoolNodeConfig nodeConfig;
    private final @Nullable Integer nodeCount;
    /**
     * The list of zones in which the cluster's nodes
     * are located. Nodes must be in the region of their regional cluster or in the
     * same region as their cluster's zone for zonal clusters. If this is specified for
     * a zonal cluster, omit the cluster's zone.
     * 
     */
    private final @Nullable List<String> nodeLocations;
    private final @Nullable ClusterNodePoolUpgradeSettings upgradeSettings;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"autoscaling","initialNodeCount","instanceGroupUrls","managedInstanceGroupUrls","management","maxPodsPerNode","name","namePrefix","networkConfig","nodeConfig","nodeCount","nodeLocations","upgradeSettings","version"})
    private ClusterNodePool(
        @Nullable ClusterNodePoolAutoscaling autoscaling,
        @Nullable Integer initialNodeCount,
        @Nullable List<String> instanceGroupUrls,
        @Nullable List<String> managedInstanceGroupUrls,
        @Nullable ClusterNodePoolManagement management,
        @Nullable Integer maxPodsPerNode,
        @Nullable String name,
        @Nullable String namePrefix,
        @Nullable ClusterNodePoolNetworkConfig networkConfig,
        @Nullable ClusterNodePoolNodeConfig nodeConfig,
        @Nullable Integer nodeCount,
        @Nullable List<String> nodeLocations,
        @Nullable ClusterNodePoolUpgradeSettings upgradeSettings,
        @Nullable String version) {
        this.autoscaling = autoscaling;
        this.initialNodeCount = initialNodeCount;
        this.instanceGroupUrls = instanceGroupUrls;
        this.managedInstanceGroupUrls = managedInstanceGroupUrls;
        this.management = management;
        this.maxPodsPerNode = maxPodsPerNode;
        this.name = name;
        this.namePrefix = namePrefix;
        this.networkConfig = networkConfig;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.nodeLocations = nodeLocations;
        this.upgradeSettings = upgradeSettings;
        this.version = version;
    }

    public Optional<ClusterNodePoolAutoscaling> getAutoscaling() {
        return Optional.ofNullable(this.autoscaling);
    }
    /**
     * The number of nodes to create in this
     * cluster's default node pool. In regional or multi-zonal clusters, this is the
     * number of nodes per zone. Must be set if `node_pool` is not set. If you're using
     * `gcp.container.NodePool` objects with no default node pool, you'll need to
     * set this to a value of at least `1`, alongside setting
     * `remove_default_node_pool` to `true`.
     * 
     */
    public Optional<Integer> getInitialNodeCount() {
        return Optional.ofNullable(this.initialNodeCount);
    }
    public List<String> getInstanceGroupUrls() {
        return this.instanceGroupUrls == null ? List.of() : this.instanceGroupUrls;
    }
    public List<String> getManagedInstanceGroupUrls() {
        return this.managedInstanceGroupUrls == null ? List.of() : this.managedInstanceGroupUrls;
    }
    public Optional<ClusterNodePoolManagement> getManagement() {
        return Optional.ofNullable(this.management);
    }
    public Optional<Integer> getMaxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }
    /**
     * The name of the cluster, unique within the project and
     * location.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getNamePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    /**
     * Configuration for
     * [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Structure is documented below
     * 
     */
    public Optional<ClusterNodePoolNetworkConfig> getNetworkConfig() {
        return Optional.ofNullable(this.networkConfig);
    }
    /**
     * Parameters used in creating the default node pool.
     * Generally, this field should not be used at the same time as a
     * `gcp.container.NodePool` or a `node_pool` block; this configuration
     * manages the default node pool, which isn't recommended to be used.
     * Structure is documented below.
     * 
     */
    public Optional<ClusterNodePoolNodeConfig> getNodeConfig() {
        return Optional.ofNullable(this.nodeConfig);
    }
    public Optional<Integer> getNodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    /**
     * The list of zones in which the cluster's nodes
     * are located. Nodes must be in the region of their regional cluster or in the
     * same region as their cluster's zone for zonal clusters. If this is specified for
     * a zonal cluster, omit the cluster's zone.
     * 
     */
    public List<String> getNodeLocations() {
        return this.nodeLocations == null ? List.of() : this.nodeLocations;
    }
    public Optional<ClusterNodePoolUpgradeSettings> getUpgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterNodePoolAutoscaling autoscaling;
        private @Nullable Integer initialNodeCount;
        private @Nullable List<String> instanceGroupUrls;
        private @Nullable List<String> managedInstanceGroupUrls;
        private @Nullable ClusterNodePoolManagement management;
        private @Nullable Integer maxPodsPerNode;
        private @Nullable String name;
        private @Nullable String namePrefix;
        private @Nullable ClusterNodePoolNetworkConfig networkConfig;
        private @Nullable ClusterNodePoolNodeConfig nodeConfig;
        private @Nullable Integer nodeCount;
        private @Nullable List<String> nodeLocations;
        private @Nullable ClusterNodePoolUpgradeSettings upgradeSettings;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.instanceGroupUrls = defaults.instanceGroupUrls;
    	      this.managedInstanceGroupUrls = defaults.managedInstanceGroupUrls;
    	      this.management = defaults.management;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkConfig = defaults.networkConfig;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeLocations = defaults.nodeLocations;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscaling(@Nullable ClusterNodePoolAutoscaling autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Integer initialNodeCount) {
            this.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder setInstanceGroupUrls(@Nullable List<String> instanceGroupUrls) {
            this.instanceGroupUrls = instanceGroupUrls;
            return this;
        }

        public Builder setManagedInstanceGroupUrls(@Nullable List<String> managedInstanceGroupUrls) {
            this.managedInstanceGroupUrls = managedInstanceGroupUrls;
            return this;
        }

        public Builder setManagement(@Nullable ClusterNodePoolManagement management) {
            this.management = management;
            return this;
        }

        public Builder setMaxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNetworkConfig(@Nullable ClusterNodePoolNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNodeConfig(@Nullable ClusterNodePoolNodeConfig nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setNodeLocations(@Nullable List<String> nodeLocations) {
            this.nodeLocations = nodeLocations;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable ClusterNodePoolUpgradeSettings upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ClusterNodePool build() {
            return new ClusterNodePool(autoscaling, initialNodeCount, instanceGroupUrls, managedInstanceGroupUrls, management, maxPodsPerNode, name, namePrefix, networkConfig, nodeConfig, nodeCount, nodeLocations, upgradeSettings, version);
        }
    }
}
