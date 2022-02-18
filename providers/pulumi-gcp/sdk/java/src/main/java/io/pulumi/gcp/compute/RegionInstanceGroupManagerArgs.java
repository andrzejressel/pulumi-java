// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerAutoHealingPoliciesArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerNamedPortArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatefulDiskArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerUpdatePolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerVersionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerArgs Empty = new RegionInstanceGroupManagerArgs();

    /**
     * The autohealing policies for this managed instance
     * group. You can specify only one value. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/creating-groups-of-managed-instances#monitoring_groups).
     * 
     */
    @InputImport(name="autoHealingPolicies")
    private final @Nullable Input<RegionInstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;

    public Input<RegionInstanceGroupManagerAutoHealingPoliciesArgs> getAutoHealingPolicies() {
        return this.autoHealingPolicies == null ? Input.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for
     * instances in this group. The value must be a valid
     * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt) name. Supported characters
     * are lowercase letters, numbers, and hyphens (-). Instances are named by
     * appending a hyphen and a random four-character string to the base instance
     * name.
     * 
     */
    @InputImport(name="baseInstanceName", required=true)
    private final Input<String> baseInstanceName;

    public Input<String> getBaseInstanceName() {
        return this.baseInstanceName;
    }

    /**
     * An optional textual description of the instance
     * group manager.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The shape to which the group converges either proactively or on resize events (depending on the value set in update_policy.0.instance_redistribution_type). For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/regional-mig-distribution-shape).
     * 
     */
    @InputImport(name="distributionPolicyTargetShape")
    private final @Nullable Input<String> distributionPolicyTargetShape;

    public Input<String> getDistributionPolicyTargetShape() {
        return this.distributionPolicyTargetShape == null ? Input.empty() : this.distributionPolicyTargetShape;
    }

    /**
     * The distribution policy for this managed instance
     * group. You can specify one or more values. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/distributing-instances-with-regional-instance-groups#selectingzones).
     * 
     */
    @InputImport(name="distributionPolicyZones")
    private final @Nullable Input<List<String>> distributionPolicyZones;

    public Input<List<String>> getDistributionPolicyZones() {
        return this.distributionPolicyZones == null ? Input.empty() : this.distributionPolicyZones;
    }

    /**
     * - Version name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The named port configuration. See the section below
     * for details on configuration.
     * 
     */
    @InputImport(name="namedPorts")
    private final @Nullable Input<List<RegionInstanceGroupManagerNamedPortArgs>> namedPorts;

    public Input<List<RegionInstanceGroupManagerNamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Input.empty() : this.namedPorts;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region where the managed instance group resides. If not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. Structure is documented below. For more information see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/configuring-stateful-disks-in-migs). Proactive cross zone instance redistribution must be disabled before you can update stateful disks on existing instance group managers. This can be controlled via the `update_policy`.
     * 
     */
    @InputImport(name="statefulDisks")
    private final @Nullable Input<List<RegionInstanceGroupManagerStatefulDiskArgs>> statefulDisks;

    public Input<List<RegionInstanceGroupManagerStatefulDiskArgs>> getStatefulDisks() {
        return this.statefulDisks == null ? Input.empty() : this.statefulDisks;
    }

    /**
     * The full URL of all target pools to which new
     * instances in the group are added. Updating the target pools attribute does
     * not affect existing instances.
     * 
     */
    @InputImport(name="targetPools")
    private final @Nullable Input<List<String>> targetPools;

    public Input<List<String>> getTargetPools() {
        return this.targetPools == null ? Input.empty() : this.targetPools;
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @InputImport(name="targetSize")
    private final @Nullable Input<Integer> targetSize;

    public Input<Integer> getTargetSize() {
        return this.targetSize == null ? Input.empty() : this.targetSize;
    }

    /**
     * The update policy for this managed instance group. Structure is documented below. For more information, see the [official documentation](https://cloud.google.com/compute/docs/instance-groups/updating-managed-instance-groups) and [API](https://cloud.google.com/compute/docs/reference/rest/beta/regionInstanceGroupManagers/patch)
     * 
     */
    @InputImport(name="updatePolicy")
    private final @Nullable Input<RegionInstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Input<RegionInstanceGroupManagerUpdatePolicyArgs> getUpdatePolicy() {
        return this.updatePolicy == null ? Input.empty() : this.updatePolicy;
    }

    /**
     * Application versions managed by this instance group. Each
     * version deals with a specific instance template, allowing canary release scenarios.
     * Structure is documented below.
     * 
     */
    @InputImport(name="versions", required=true)
    private final Input<List<RegionInstanceGroupManagerVersionArgs>> versions;

    public Input<List<RegionInstanceGroupManagerVersionArgs>> getVersions() {
        return this.versions;
    }

    /**
     * Whether to wait for all instances to be created/updated before
     * returning. Note that if this is set to true and the operation does not succeed, the provider will
     * continue trying until it times out.
     * 
     */
    @InputImport(name="waitForInstances")
    private final @Nullable Input<Boolean> waitForInstances;

    public Input<Boolean> getWaitForInstances() {
        return this.waitForInstances == null ? Input.empty() : this.waitForInstances;
    }

    /**
     * When used with `wait_for_instances` it specifies the status to wait for.
     * When `STABLE` is specified this resource will wait until the instances are stable before returning. When `UPDATED` is
     * set, it will wait for the version target to be reached and any per instance configs to be effective as well as all
     * instances to be stable before returning. The possible values are `STABLE` and `UPDATED`
     * 
     */
    @InputImport(name="waitForInstancesStatus")
    private final @Nullable Input<String> waitForInstancesStatus;

    public Input<String> getWaitForInstancesStatus() {
        return this.waitForInstancesStatus == null ? Input.empty() : this.waitForInstancesStatus;
    }

    public RegionInstanceGroupManagerArgs(
        @Nullable Input<RegionInstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies,
        Input<String> baseInstanceName,
        @Nullable Input<String> description,
        @Nullable Input<String> distributionPolicyTargetShape,
        @Nullable Input<List<String>> distributionPolicyZones,
        @Nullable Input<String> name,
        @Nullable Input<List<RegionInstanceGroupManagerNamedPortArgs>> namedPorts,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<List<RegionInstanceGroupManagerStatefulDiskArgs>> statefulDisks,
        @Nullable Input<List<String>> targetPools,
        @Nullable Input<Integer> targetSize,
        @Nullable Input<RegionInstanceGroupManagerUpdatePolicyArgs> updatePolicy,
        Input<List<RegionInstanceGroupManagerVersionArgs>> versions,
        @Nullable Input<Boolean> waitForInstances,
        @Nullable Input<String> waitForInstancesStatus) {
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = Objects.requireNonNull(baseInstanceName, "expected parameter 'baseInstanceName' to be non-null");
        this.description = description;
        this.distributionPolicyTargetShape = distributionPolicyTargetShape;
        this.distributionPolicyZones = distributionPolicyZones;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.region = region;
        this.statefulDisks = statefulDisks;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.updatePolicy = updatePolicy;
        this.versions = Objects.requireNonNull(versions, "expected parameter 'versions' to be non-null");
        this.waitForInstances = waitForInstances;
        this.waitForInstancesStatus = waitForInstancesStatus;
    }

    private RegionInstanceGroupManagerArgs() {
        this.autoHealingPolicies = Input.empty();
        this.baseInstanceName = Input.empty();
        this.description = Input.empty();
        this.distributionPolicyTargetShape = Input.empty();
        this.distributionPolicyZones = Input.empty();
        this.name = Input.empty();
        this.namedPorts = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.statefulDisks = Input.empty();
        this.targetPools = Input.empty();
        this.targetSize = Input.empty();
        this.updatePolicy = Input.empty();
        this.versions = Input.empty();
        this.waitForInstances = Input.empty();
        this.waitForInstancesStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionInstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies;
        private Input<String> baseInstanceName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> distributionPolicyTargetShape;
        private @Nullable Input<List<String>> distributionPolicyZones;
        private @Nullable Input<String> name;
        private @Nullable Input<List<RegionInstanceGroupManagerNamedPortArgs>> namedPorts;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<List<RegionInstanceGroupManagerStatefulDiskArgs>> statefulDisks;
        private @Nullable Input<List<String>> targetPools;
        private @Nullable Input<Integer> targetSize;
        private @Nullable Input<RegionInstanceGroupManagerUpdatePolicyArgs> updatePolicy;
        private Input<List<RegionInstanceGroupManagerVersionArgs>> versions;
        private @Nullable Input<Boolean> waitForInstances;
        private @Nullable Input<String> waitForInstancesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.distributionPolicyTargetShape = defaults.distributionPolicyTargetShape;
    	      this.distributionPolicyZones = defaults.distributionPolicyZones;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.statefulDisks = defaults.statefulDisks;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.waitForInstances = defaults.waitForInstances;
    	      this.waitForInstancesStatus = defaults.waitForInstancesStatus;
        }

        public Builder setAutoHealingPolicies(@Nullable Input<RegionInstanceGroupManagerAutoHealingPoliciesArgs> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        public Builder setAutoHealingPolicies(@Nullable RegionInstanceGroupManagerAutoHealingPoliciesArgs autoHealingPolicies) {
            this.autoHealingPolicies = Input.ofNullable(autoHealingPolicies);
            return this;
        }

        public Builder setBaseInstanceName(Input<String> baseInstanceName) {
            this.baseInstanceName = Objects.requireNonNull(baseInstanceName);
            return this;
        }

        public Builder setBaseInstanceName(String baseInstanceName) {
            this.baseInstanceName = Input.of(Objects.requireNonNull(baseInstanceName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDistributionPolicyTargetShape(@Nullable Input<String> distributionPolicyTargetShape) {
            this.distributionPolicyTargetShape = distributionPolicyTargetShape;
            return this;
        }

        public Builder setDistributionPolicyTargetShape(@Nullable String distributionPolicyTargetShape) {
            this.distributionPolicyTargetShape = Input.ofNullable(distributionPolicyTargetShape);
            return this;
        }

        public Builder setDistributionPolicyZones(@Nullable Input<List<String>> distributionPolicyZones) {
            this.distributionPolicyZones = distributionPolicyZones;
            return this;
        }

        public Builder setDistributionPolicyZones(@Nullable List<String> distributionPolicyZones) {
            this.distributionPolicyZones = Input.ofNullable(distributionPolicyZones);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamedPorts(@Nullable Input<List<RegionInstanceGroupManagerNamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder setNamedPorts(@Nullable List<RegionInstanceGroupManagerNamedPortArgs> namedPorts) {
            this.namedPorts = Input.ofNullable(namedPorts);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setStatefulDisks(@Nullable Input<List<RegionInstanceGroupManagerStatefulDiskArgs>> statefulDisks) {
            this.statefulDisks = statefulDisks;
            return this;
        }

        public Builder setStatefulDisks(@Nullable List<RegionInstanceGroupManagerStatefulDiskArgs> statefulDisks) {
            this.statefulDisks = Input.ofNullable(statefulDisks);
            return this;
        }

        public Builder setTargetPools(@Nullable Input<List<String>> targetPools) {
            this.targetPools = targetPools;
            return this;
        }

        public Builder setTargetPools(@Nullable List<String> targetPools) {
            this.targetPools = Input.ofNullable(targetPools);
            return this;
        }

        public Builder setTargetSize(@Nullable Input<Integer> targetSize) {
            this.targetSize = targetSize;
            return this;
        }

        public Builder setTargetSize(@Nullable Integer targetSize) {
            this.targetSize = Input.ofNullable(targetSize);
            return this;
        }

        public Builder setUpdatePolicy(@Nullable Input<RegionInstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            this.updatePolicy = updatePolicy;
            return this;
        }

        public Builder setUpdatePolicy(@Nullable RegionInstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            this.updatePolicy = Input.ofNullable(updatePolicy);
            return this;
        }

        public Builder setVersions(Input<List<RegionInstanceGroupManagerVersionArgs>> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }

        public Builder setVersions(List<RegionInstanceGroupManagerVersionArgs> versions) {
            this.versions = Input.of(Objects.requireNonNull(versions));
            return this;
        }

        public Builder setWaitForInstances(@Nullable Input<Boolean> waitForInstances) {
            this.waitForInstances = waitForInstances;
            return this;
        }

        public Builder setWaitForInstances(@Nullable Boolean waitForInstances) {
            this.waitForInstances = Input.ofNullable(waitForInstances);
            return this;
        }

        public Builder setWaitForInstancesStatus(@Nullable Input<String> waitForInstancesStatus) {
            this.waitForInstancesStatus = waitForInstancesStatus;
            return this;
        }

        public Builder setWaitForInstancesStatus(@Nullable String waitForInstancesStatus) {
            this.waitForInstancesStatus = Input.ofNullable(waitForInstancesStatus);
            return this;
        }

        public RegionInstanceGroupManagerArgs build() {
            return new RegionInstanceGroupManagerArgs(autoHealingPolicies, baseInstanceName, description, distributionPolicyTargetShape, distributionPolicyZones, name, namedPorts, project, region, statefulDisks, targetPools, targetSize, updatePolicy, versions, waitForInstances, waitForInstancesStatus);
        }
    }
}
