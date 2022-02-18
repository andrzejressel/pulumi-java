// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.InstanceGroupManagerFailoverAction;
import io.pulumi.googlenative.compute_beta.inputs.DistributionPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerAutoHealingPolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerUpdatePolicyArgs;
import io.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerVersionArgs;
import io.pulumi.googlenative.compute_beta.inputs.NamedPortArgs;
import io.pulumi.googlenative.compute_beta.inputs.StatefulPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerArgs Empty = new InstanceGroupManagerArgs();

    /**
     * The autohealing policy for this managed instance group. You can specify only one value.
     * 
     */
    @InputImport(name="autoHealingPolicies")
    private final @Nullable Input<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;

    public Input<List<InstanceGroupManagerAutoHealingPolicyArgs>> getAutoHealingPolicies() {
        return this.autoHealingPolicies == null ? Input.empty() : this.autoHealingPolicies;
    }

    /**
     * The base instance name to use for instances in this group. The value must be 1-58 characters long. Instances are named by appending a hyphen and a random four-character string to the base instance name. The base instance name must comply with RFC1035.
     * 
     */
    @InputImport(name="baseInstanceName")
    private final @Nullable Input<String> baseInstanceName;

    public Input<String> getBaseInstanceName() {
        return this.baseInstanceName == null ? Input.empty() : this.baseInstanceName;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Policy specifying the intended distribution of managed instances across zones in a regional managed instance group.
     * 
     */
    @InputImport(name="distributionPolicy")
    private final @Nullable Input<DistributionPolicyArgs> distributionPolicy;

    public Input<DistributionPolicyArgs> getDistributionPolicy() {
        return this.distributionPolicy == null ? Input.empty() : this.distributionPolicy;
    }

    /**
     * The action to perform in case of zone failure. Only one value is supported, NO_FAILOVER. The default is NO_FAILOVER.
     * 
     */
    @InputImport(name="failoverAction")
    private final @Nullable Input<InstanceGroupManagerFailoverAction> failoverAction;

    public Input<InstanceGroupManagerFailoverAction> getFailoverAction() {
        return this.failoverAction == null ? Input.empty() : this.failoverAction;
    }

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create all new instances in the managed instance group. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE.
     * 
     */
    @InputImport(name="instanceTemplate")
    private final @Nullable Input<String> instanceTemplate;

    public Input<String> getInstanceTemplate() {
        return this.instanceTemplate == null ? Input.empty() : this.instanceTemplate;
    }

    /**
     * The name of the managed instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Named ports configured for the Instance Groups complementary to this Instance Group Manager.
     * 
     */
    @InputImport(name="namedPorts")
    private final @Nullable Input<List<NamedPortArgs>> namedPorts;

    public Input<List<NamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Input.empty() : this.namedPorts;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The service account to be used as credentials for all operations performed by the managed instance group on instances. The service accounts needs all permissions required to create and delete instances. By default, the service account {projectNumber}@cloudservices.gserviceaccount.com is used.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Stateful configuration for this Instanced Group Manager
     * 
     */
    @InputImport(name="statefulPolicy")
    private final @Nullable Input<StatefulPolicyArgs> statefulPolicy;

    public Input<StatefulPolicyArgs> getStatefulPolicy() {
        return this.statefulPolicy == null ? Input.empty() : this.statefulPolicy;
    }

    /**
     * The URLs for all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the instances in the managed instance group.
     * 
     */
    @InputImport(name="targetPools")
    private final @Nullable Input<List<String>> targetPools;

    public Input<List<String>> getTargetPools() {
        return this.targetPools == null ? Input.empty() : this.targetPools;
    }

    /**
     * The target number of running instances for this managed instance group. You can reduce this number by using the instanceGroupManager deleteInstances or abandonInstances methods. Resizing the group also changes this number.
     * 
     */
    @InputImport(name="targetSize")
    private final @Nullable Input<Integer> targetSize;

    public Input<Integer> getTargetSize() {
        return this.targetSize == null ? Input.empty() : this.targetSize;
    }

    /**
     * The update policy for this managed instance group.
     * 
     */
    @InputImport(name="updatePolicy")
    private final @Nullable Input<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;

    public Input<InstanceGroupManagerUpdatePolicyArgs> getUpdatePolicy() {
        return this.updatePolicy == null ? Input.empty() : this.updatePolicy;
    }

    /**
     * Specifies the instance templates used by this managed instance group to create instances. Each version is defined by an instanceTemplate and a name. Every version can appear at most once per instance group. This field overrides the top-level instanceTemplate field. Read more about the relationships between these fields. Exactly one version must leave the targetSize field unset. That version will be applied to all remaining instances. For more information, read about canary updates.
     * 
     */
    @InputImport(name="versions")
    private final @Nullable Input<List<InstanceGroupManagerVersionArgs>> versions;

    public Input<List<InstanceGroupManagerVersionArgs>> getVersions() {
        return this.versions == null ? Input.empty() : this.versions;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceGroupManagerArgs(
        @Nullable Input<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies,
        @Nullable Input<String> baseInstanceName,
        @Nullable Input<String> description,
        @Nullable Input<DistributionPolicyArgs> distributionPolicy,
        @Nullable Input<InstanceGroupManagerFailoverAction> failoverAction,
        @Nullable Input<String> instanceTemplate,
        @Nullable Input<String> name,
        @Nullable Input<List<NamedPortArgs>> namedPorts,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<StatefulPolicyArgs> statefulPolicy,
        @Nullable Input<List<String>> targetPools,
        @Nullable Input<Integer> targetSize,
        @Nullable Input<InstanceGroupManagerUpdatePolicyArgs> updatePolicy,
        @Nullable Input<List<InstanceGroupManagerVersionArgs>> versions,
        @Nullable Input<String> zone) {
        this.autoHealingPolicies = autoHealingPolicies;
        this.baseInstanceName = baseInstanceName;
        this.description = description;
        this.distributionPolicy = distributionPolicy;
        this.failoverAction = failoverAction;
        this.instanceTemplate = instanceTemplate;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.requestId = requestId;
        this.serviceAccount = serviceAccount;
        this.statefulPolicy = statefulPolicy;
        this.targetPools = targetPools;
        this.targetSize = targetSize;
        this.updatePolicy = updatePolicy;
        this.versions = versions;
        this.zone = zone;
    }

    private InstanceGroupManagerArgs() {
        this.autoHealingPolicies = Input.empty();
        this.baseInstanceName = Input.empty();
        this.description = Input.empty();
        this.distributionPolicy = Input.empty();
        this.failoverAction = Input.empty();
        this.instanceTemplate = Input.empty();
        this.name = Input.empty();
        this.namedPorts = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.serviceAccount = Input.empty();
        this.statefulPolicy = Input.empty();
        this.targetPools = Input.empty();
        this.targetSize = Input.empty();
        this.updatePolicy = Input.empty();
        this.versions = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies;
        private @Nullable Input<String> baseInstanceName;
        private @Nullable Input<String> description;
        private @Nullable Input<DistributionPolicyArgs> distributionPolicy;
        private @Nullable Input<InstanceGroupManagerFailoverAction> failoverAction;
        private @Nullable Input<String> instanceTemplate;
        private @Nullable Input<String> name;
        private @Nullable Input<List<NamedPortArgs>> namedPorts;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<StatefulPolicyArgs> statefulPolicy;
        private @Nullable Input<List<String>> targetPools;
        private @Nullable Input<Integer> targetSize;
        private @Nullable Input<InstanceGroupManagerUpdatePolicyArgs> updatePolicy;
        private @Nullable Input<List<InstanceGroupManagerVersionArgs>> versions;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.description = defaults.description;
    	      this.distributionPolicy = defaults.distributionPolicy;
    	      this.failoverAction = defaults.failoverAction;
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.statefulPolicy = defaults.statefulPolicy;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.zone = defaults.zone;
        }

        public Builder setAutoHealingPolicies(@Nullable Input<List<InstanceGroupManagerAutoHealingPolicyArgs>> autoHealingPolicies) {
            this.autoHealingPolicies = autoHealingPolicies;
            return this;
        }

        public Builder setAutoHealingPolicies(@Nullable List<InstanceGroupManagerAutoHealingPolicyArgs> autoHealingPolicies) {
            this.autoHealingPolicies = Input.ofNullable(autoHealingPolicies);
            return this;
        }

        public Builder setBaseInstanceName(@Nullable Input<String> baseInstanceName) {
            this.baseInstanceName = baseInstanceName;
            return this;
        }

        public Builder setBaseInstanceName(@Nullable String baseInstanceName) {
            this.baseInstanceName = Input.ofNullable(baseInstanceName);
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

        public Builder setDistributionPolicy(@Nullable Input<DistributionPolicyArgs> distributionPolicy) {
            this.distributionPolicy = distributionPolicy;
            return this;
        }

        public Builder setDistributionPolicy(@Nullable DistributionPolicyArgs distributionPolicy) {
            this.distributionPolicy = Input.ofNullable(distributionPolicy);
            return this;
        }

        public Builder setFailoverAction(@Nullable Input<InstanceGroupManagerFailoverAction> failoverAction) {
            this.failoverAction = failoverAction;
            return this;
        }

        public Builder setFailoverAction(@Nullable InstanceGroupManagerFailoverAction failoverAction) {
            this.failoverAction = Input.ofNullable(failoverAction);
            return this;
        }

        public Builder setInstanceTemplate(@Nullable Input<String> instanceTemplate) {
            this.instanceTemplate = instanceTemplate;
            return this;
        }

        public Builder setInstanceTemplate(@Nullable String instanceTemplate) {
            this.instanceTemplate = Input.ofNullable(instanceTemplate);
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

        public Builder setNamedPorts(@Nullable Input<List<NamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder setNamedPorts(@Nullable List<NamedPortArgs> namedPorts) {
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setStatefulPolicy(@Nullable Input<StatefulPolicyArgs> statefulPolicy) {
            this.statefulPolicy = statefulPolicy;
            return this;
        }

        public Builder setStatefulPolicy(@Nullable StatefulPolicyArgs statefulPolicy) {
            this.statefulPolicy = Input.ofNullable(statefulPolicy);
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

        public Builder setUpdatePolicy(@Nullable Input<InstanceGroupManagerUpdatePolicyArgs> updatePolicy) {
            this.updatePolicy = updatePolicy;
            return this;
        }

        public Builder setUpdatePolicy(@Nullable InstanceGroupManagerUpdatePolicyArgs updatePolicy) {
            this.updatePolicy = Input.ofNullable(updatePolicy);
            return this;
        }

        public Builder setVersions(@Nullable Input<List<InstanceGroupManagerVersionArgs>> versions) {
            this.versions = versions;
            return this;
        }

        public Builder setVersions(@Nullable List<InstanceGroupManagerVersionArgs> versions) {
            this.versions = Input.ofNullable(versions);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public InstanceGroupManagerArgs build() {
            return new InstanceGroupManagerArgs(autoHealingPolicies, baseInstanceName, description, distributionPolicy, failoverAction, instanceTemplate, name, namedPorts, project, requestId, serviceAccount, statefulPolicy, targetPools, targetSize, updatePolicy, versions, zone);
        }
    }
}
