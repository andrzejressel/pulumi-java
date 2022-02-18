// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.InstanceFromTemplateArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateState;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateAdvancedMachineFeatures;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateAttachedDisk;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateBootDisk;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateConfidentialInstanceConfig;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateGuestAccelerator;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateNetworkInterface;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateNetworkPerformanceConfig;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateReservationAffinity;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateScheduling;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateScratchDisk;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateServiceAccount;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a VM instance resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instances)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instances).
 * 
 * This resource is specifically to create a compute instance from a given
 * `source_instance_template`. To create an instance without a template, use the
 * `gcp.compute.Instance` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:compute/instanceFromTemplate:InstanceFromTemplate")
public class InstanceFromTemplate extends io.pulumi.resources.CustomResource {
    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @OutputExport(name="advancedMachineFeatures", type=InstanceFromTemplateAdvancedMachineFeatures.class, parameters={})
    private Output<InstanceFromTemplateAdvancedMachineFeatures> advancedMachineFeatures;

    /**
     * @return Controls for advanced machine-related behavior features.
     * 
     */
    public Output<InstanceFromTemplateAdvancedMachineFeatures> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    @OutputExport(name="allowStoppingForUpdate", type=Boolean.class, parameters={})
    private Output<Boolean> allowStoppingForUpdate;

    /**
     * @return If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    public Output<Boolean> getAllowStoppingForUpdate() {
        return this.allowStoppingForUpdate;
    }
    /**
     * List of disks attached to the instance
     * 
     */
    @OutputExport(name="attachedDisks", type=List.class, parameters={InstanceFromTemplateAttachedDisk.class})
    private Output<List<InstanceFromTemplateAttachedDisk>> attachedDisks;

    /**
     * @return List of disks attached to the instance
     * 
     */
    public Output<List<InstanceFromTemplateAttachedDisk>> getAttachedDisks() {
        return this.attachedDisks;
    }
    /**
     * The boot disk for the instance.
     * 
     */
    @OutputExport(name="bootDisk", type=InstanceFromTemplateBootDisk.class, parameters={})
    private Output<InstanceFromTemplateBootDisk> bootDisk;

    /**
     * @return The boot disk for the instance.
     * 
     */
    public Output<InstanceFromTemplateBootDisk> getBootDisk() {
        return this.bootDisk;
    }
    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @OutputExport(name="canIpForward", type=Boolean.class, parameters={})
    private Output<Boolean> canIpForward;

    /**
     * @return Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    public Output<Boolean> getCanIpForward() {
        return this.canIpForward;
    }
    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @OutputExport(name="confidentialInstanceConfig", type=InstanceFromTemplateConfidentialInstanceConfig.class, parameters={})
    private Output<InstanceFromTemplateConfidentialInstanceConfig> confidentialInstanceConfig;

    /**
     * @return The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    public Output<InstanceFromTemplateConfidentialInstanceConfig> getConfidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * The CPU platform used by this instance.
     * 
     */
    @OutputExport(name="cpuPlatform", type=String.class, parameters={})
    private Output<String> cpuPlatform;

    /**
     * @return The CPU platform used by this instance.
     * 
     */
    public Output<String> getCpuPlatform() {
        return this.cpuPlatform;
    }
    /**
     * Current status of the instance.
     * 
     */
    @OutputExport(name="currentStatus", type=String.class, parameters={})
    private Output<String> currentStatus;

    /**
     * @return Current status of the instance.
     * 
     */
    public Output<String> getCurrentStatus() {
        return this.currentStatus;
    }
    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output<Boolean> deletionProtection;

    /**
     * @return Whether deletion protection is enabled on this instance.
     * 
     */
    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * A brief description of the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A brief description of the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Desired status of the instance. Either "RUNNING" or "TERMINATED".
     * 
     */
    @OutputExport(name="desiredStatus", type=String.class, parameters={})
    private Output<String> desiredStatus;

    /**
     * @return Desired status of the instance. Either "RUNNING" or "TERMINATED".
     * 
     */
    public Output<String> getDesiredStatus() {
        return this.desiredStatus;
    }
    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @OutputExport(name="enableDisplay", type=Boolean.class, parameters={})
    private Output<Boolean> enableDisplay;

    /**
     * @return Whether the instance has virtual displays enabled.
     * 
     */
    public Output<Boolean> getEnableDisplay() {
        return this.enableDisplay;
    }
    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @OutputExport(name="guestAccelerators", type=List.class, parameters={InstanceFromTemplateGuestAccelerator.class})
    private Output<List<InstanceFromTemplateGuestAccelerator>> guestAccelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the instance.
     * 
     */
    public Output<List<InstanceFromTemplateGuestAccelerator>> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getHostname() {
        return this.hostname;
    }
    /**
     * The server-assigned unique identifier of this instance.
     * 
     */
    @OutputExport(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The server-assigned unique identifier of this instance.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * The unique fingerprint of the labels.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The unique fingerprint of the labels.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * A set of key/value label pairs assigned to the instance.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs assigned to the instance.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The machine type to create.
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return The machine type to create.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @OutputExport(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Metadata key/value pairs made available within the instance.
     * 
     */
    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    @OutputExport(name="metadataFingerprint", type=String.class, parameters={})
    private Output<String> metadataFingerprint;

    /**
     * @return The unique fingerprint of the metadata.
     * 
     */
    public Output<String> getMetadataFingerprint() {
        return this.metadataFingerprint;
    }
    /**
     * Metadata startup scripts made available within the instance.
     * 
     */
    @OutputExport(name="metadataStartupScript", type=String.class, parameters={})
    private Output<String> metadataStartupScript;

    /**
     * @return Metadata startup scripts made available within the instance.
     * 
     */
    public Output<String> getMetadataStartupScript() {
        return this.metadataStartupScript;
    }
    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @OutputExport(name="minCpuPlatform", type=String.class, parameters={})
    private Output<String> minCpuPlatform;

    /**
     * @return The minimum CPU platform specified for the VM instance.
     * 
     */
    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The networks attached to the instance.
     * 
     */
    @OutputExport(name="networkInterfaces", type=List.class, parameters={InstanceFromTemplateNetworkInterface.class})
    private Output<List<InstanceFromTemplateNetworkInterface>> networkInterfaces;

    /**
     * @return The networks attached to the instance.
     * 
     */
    public Output<List<InstanceFromTemplateNetworkInterface>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @OutputExport(name="networkPerformanceConfig", type=InstanceFromTemplateNetworkPerformanceConfig.class, parameters={})
    private Output<InstanceFromTemplateNetworkPerformanceConfig> networkPerformanceConfig;

    /**
     * @return Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    public Output<InstanceFromTemplateNetworkPerformanceConfig> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @OutputExport(name="reservationAffinity", type=InstanceFromTemplateReservationAffinity.class, parameters={})
    private Output<InstanceFromTemplateReservationAffinity> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * 
     */
    public Output<InstanceFromTemplateReservationAffinity> getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    @OutputExport(name="resourcePolicies", type=String.class, parameters={})
    private Output<String> resourcePolicies;

    /**
     * @return A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    public Output<String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @OutputExport(name="scheduling", type=InstanceFromTemplateScheduling.class, parameters={})
    private Output<InstanceFromTemplateScheduling> scheduling;

    /**
     * @return The scheduling strategy being used by the instance.
     * 
     */
    public Output<InstanceFromTemplateScheduling> getScheduling() {
        return this.scheduling;
    }
    /**
     * The scratch disks attached to the instance.
     * 
     */
    @OutputExport(name="scratchDisks", type=List.class, parameters={InstanceFromTemplateScratchDisk.class})
    private Output<List<InstanceFromTemplateScratchDisk>> scratchDisks;

    /**
     * @return The scratch disks attached to the instance.
     * 
     */
    public Output<List<InstanceFromTemplateScratchDisk>> getScratchDisks() {
        return this.scratchDisks;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The service account to attach to the instance.
     * 
     */
    @OutputExport(name="serviceAccount", type=InstanceFromTemplateServiceAccount.class, parameters={})
    private Output<InstanceFromTemplateServiceAccount> serviceAccount;

    /**
     * @return The service account to attach to the instance.
     * 
     */
    public Output<InstanceFromTemplateServiceAccount> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @OutputExport(name="shieldedInstanceConfig", type=InstanceFromTemplateShieldedInstanceConfig.class, parameters={})
    private Output<InstanceFromTemplateShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return The shielded vm config being used by the instance.
     * 
     */
    public Output<InstanceFromTemplateShieldedInstanceConfig> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Name or self link of an instance
     * template to create the instance based on.
     * 
     */
    @OutputExport(name="sourceInstanceTemplate", type=String.class, parameters={})
    private Output<String> sourceInstanceTemplate;

    /**
     * @return Name or self link of an instance
     * template to create the instance based on.
     * 
     */
    public Output<String> getSourceInstanceTemplate() {
        return this.sourceInstanceTemplate;
    }
    /**
     * The list of tags attached to the instance.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return The list of tags attached to the instance.
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * The unique fingerprint of the tags.
     * 
     */
    @OutputExport(name="tagsFingerprint", type=String.class, parameters={})
    private Output<String> tagsFingerprint;

    /**
     * @return The unique fingerprint of the tags.
     * 
     */
    public Output<String> getTagsFingerprint() {
        return this.tagsFingerprint;
    }
    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    public Output<String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceFromTemplate(String name, InstanceFromTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromTemplate:InstanceFromTemplate", name, args == null ? InstanceFromTemplateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceFromTemplate(String name, Input<String> id, @Nullable InstanceFromTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromTemplate:InstanceFromTemplate", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceFromTemplate get(String name, Input<String> id, @Nullable InstanceFromTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceFromTemplate(name, id, state, options);
    }
}
