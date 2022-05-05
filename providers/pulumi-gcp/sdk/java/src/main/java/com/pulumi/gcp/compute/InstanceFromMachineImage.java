// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.InstanceFromMachineImageArgs;
import com.pulumi.gcp.compute.inputs.InstanceFromMachineImageState;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageAdvancedMachineFeatures;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageAttachedDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageBootDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageConfidentialInstanceConfig;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageGuestAccelerator;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageNetworkInterface;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageNetworkPerformanceConfig;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageReservationAffinity;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageScheduling;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageScratchDisk;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageServiceAccount;
import com.pulumi.gcp.compute.outputs.InstanceFromMachineImageShieldedInstanceConfig;
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
 * `source_machine_image`. To create an instance without a machine image, use the
 * `gcp.compute.Instance` resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tpl = new InstanceFromMachineImage(&#34;tpl&#34;, InstanceFromMachineImageArgs.builder()        
 *             .zone(&#34;us-central1-a&#34;)
 *             .sourceMachineImage(&#34;projects/PROJECT-ID/global/machineImages/NAME&#34;)
 *             .canIpForward(false)
 *             .labels(Map.of(&#34;my_key&#34;, &#34;my_value&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="gcp:compute/instanceFromMachineImage:InstanceFromMachineImage")
public class InstanceFromMachineImage extends com.pulumi.resources.CustomResource {
    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Export(name="advancedMachineFeatures", type=InstanceFromMachineImageAdvancedMachineFeatures.class, parameters={})
    private Output<InstanceFromMachineImageAdvancedMachineFeatures> advancedMachineFeatures;

    /**
     * @return Controls for advanced machine-related behavior features.
     * 
     */
    public Output<InstanceFromMachineImageAdvancedMachineFeatures> advancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    @Export(name="allowStoppingForUpdate", type=Boolean.class, parameters={})
    private Output<Boolean> allowStoppingForUpdate;

    /**
     * @return If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    public Output<Boolean> allowStoppingForUpdate() {
        return this.allowStoppingForUpdate;
    }
    /**
     * List of disks attached to the instance
     * 
     */
    @Export(name="attachedDisks", type=List.class, parameters={InstanceFromMachineImageAttachedDisk.class})
    private Output<List<InstanceFromMachineImageAttachedDisk>> attachedDisks;

    /**
     * @return List of disks attached to the instance
     * 
     */
    public Output<List<InstanceFromMachineImageAttachedDisk>> attachedDisks() {
        return this.attachedDisks;
    }
    /**
     * The boot disk for the instance.
     * 
     */
    @Export(name="bootDisks", type=List.class, parameters={InstanceFromMachineImageBootDisk.class})
    private Output<List<InstanceFromMachineImageBootDisk>> bootDisks;

    /**
     * @return The boot disk for the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageBootDisk>> bootDisks() {
        return this.bootDisks;
    }
    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @Export(name="canIpForward", type=Boolean.class, parameters={})
    private Output<Boolean> canIpForward;

    /**
     * @return Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    public Output<Boolean> canIpForward() {
        return this.canIpForward;
    }
    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @Export(name="confidentialInstanceConfig", type=InstanceFromMachineImageConfidentialInstanceConfig.class, parameters={})
    private Output<InstanceFromMachineImageConfidentialInstanceConfig> confidentialInstanceConfig;

    /**
     * @return The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    public Output<InstanceFromMachineImageConfidentialInstanceConfig> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig;
    }
    /**
     * The CPU platform used by this instance.
     * 
     */
    @Export(name="cpuPlatform", type=String.class, parameters={})
    private Output<String> cpuPlatform;

    /**
     * @return The CPU platform used by this instance.
     * 
     */
    public Output<String> cpuPlatform() {
        return this.cpuPlatform;
    }
    /**
     * Current status of the instance.
     * 
     */
    @Export(name="currentStatus", type=String.class, parameters={})
    private Output<String> currentStatus;

    /**
     * @return Current status of the instance.
     * 
     */
    public Output<String> currentStatus() {
        return this.currentStatus;
    }
    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output<Boolean> deletionProtection;

    /**
     * @return Whether deletion protection is enabled on this instance.
     * 
     */
    public Output<Boolean> deletionProtection() {
        return this.deletionProtection;
    }
    /**
     * A brief description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A brief description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Desired status of the instance. Either &#34;RUNNING&#34; or &#34;TERMINATED&#34;.
     * 
     */
    @Export(name="desiredStatus", type=String.class, parameters={})
    private Output<String> desiredStatus;

    /**
     * @return Desired status of the instance. Either &#34;RUNNING&#34; or &#34;TERMINATED&#34;.
     * 
     */
    public Output<String> desiredStatus() {
        return this.desiredStatus;
    }
    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @Export(name="enableDisplay", type=Boolean.class, parameters={})
    private Output<Boolean> enableDisplay;

    /**
     * @return Whether the instance has virtual displays enabled.
     * 
     */
    public Output<Boolean> enableDisplay() {
        return this.enableDisplay;
    }
    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Export(name="guestAccelerators", type=List.class, parameters={InstanceFromMachineImageGuestAccelerator.class})
    private Output<List<InstanceFromMachineImageGuestAccelerator>> guestAccelerators;

    /**
     * @return List of the type and count of accelerator cards attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageGuestAccelerator>> guestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The server-assigned unique identifier of this instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The server-assigned unique identifier of this instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The unique fingerprint of the labels.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The unique fingerprint of the labels.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * A set of key/value label pairs assigned to the instance.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return A set of key/value label pairs assigned to the instance.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The machine type to create.
     * 
     */
    @Export(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return The machine type to create.
     * 
     */
    public Output<String> machineType() {
        return this.machineType;
    }
    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> metadata;

    /**
     * @return Metadata key/value pairs made available within the instance.
     * 
     */
    public Output<Map<String,String>> metadata() {
        return this.metadata;
    }
    /**
     * The unique fingerprint of the metadata.
     * 
     */
    @Export(name="metadataFingerprint", type=String.class, parameters={})
    private Output<String> metadataFingerprint;

    /**
     * @return The unique fingerprint of the metadata.
     * 
     */
    public Output<String> metadataFingerprint() {
        return this.metadataFingerprint;
    }
    /**
     * Metadata startup scripts made available within the instance.
     * 
     */
    @Export(name="metadataStartupScript", type=String.class, parameters={})
    private Output<String> metadataStartupScript;

    /**
     * @return Metadata startup scripts made available within the instance.
     * 
     */
    public Output<String> metadataStartupScript() {
        return this.metadataStartupScript;
    }
    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @Export(name="minCpuPlatform", type=String.class, parameters={})
    private Output<String> minCpuPlatform;

    /**
     * @return The minimum CPU platform specified for the VM instance.
     * 
     */
    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The networks attached to the instance.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={InstanceFromMachineImageNetworkInterface.class})
    private Output<List<InstanceFromMachineImageNetworkInterface>> networkInterfaces;

    /**
     * @return The networks attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageNetworkInterface>> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @Export(name="networkPerformanceConfig", type=InstanceFromMachineImageNetworkPerformanceConfig.class, parameters={})
    private Output<InstanceFromMachineImageNetworkPerformanceConfig> networkPerformanceConfig;

    /**
     * @return Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    public Output<InstanceFromMachineImageNetworkPerformanceConfig> networkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Export(name="reservationAffinity", type=InstanceFromMachineImageReservationAffinity.class, parameters={})
    private Output<InstanceFromMachineImageReservationAffinity> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * 
     */
    public Output<InstanceFromMachineImageReservationAffinity> reservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    @Export(name="resourcePolicies", type=String.class, parameters={})
    private Output<String> resourcePolicies;

    /**
     * @return A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    public Output<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @Export(name="scheduling", type=InstanceFromMachineImageScheduling.class, parameters={})
    private Output<InstanceFromMachineImageScheduling> scheduling;

    /**
     * @return The scheduling strategy being used by the instance.
     * 
     */
    public Output<InstanceFromMachineImageScheduling> scheduling() {
        return this.scheduling;
    }
    /**
     * The scratch disks attached to the instance.
     * 
     */
    @Export(name="scratchDisks", type=List.class, parameters={InstanceFromMachineImageScratchDisk.class})
    private Output<List<InstanceFromMachineImageScratchDisk>> scratchDisks;

    /**
     * @return The scratch disks attached to the instance.
     * 
     */
    public Output<List<InstanceFromMachineImageScratchDisk>> scratchDisks() {
        return this.scratchDisks;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The service account to attach to the instance.
     * 
     */
    @Export(name="serviceAccount", type=InstanceFromMachineImageServiceAccount.class, parameters={})
    private Output<InstanceFromMachineImageServiceAccount> serviceAccount;

    /**
     * @return The service account to attach to the instance.
     * 
     */
    public Output<InstanceFromMachineImageServiceAccount> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @Export(name="shieldedInstanceConfig", type=InstanceFromMachineImageShieldedInstanceConfig.class, parameters={})
    private Output<InstanceFromMachineImageShieldedInstanceConfig> shieldedInstanceConfig;

    /**
     * @return The shielded vm config being used by the instance.
     * 
     */
    public Output<InstanceFromMachineImageShieldedInstanceConfig> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Name or self link of a machine
     * image to create the instance based on.
     * 
     */
    @Export(name="sourceMachineImage", type=String.class, parameters={})
    private Output<String> sourceMachineImage;

    /**
     * @return Name or self link of a machine
     * image to create the instance based on.
     * 
     */
    public Output<String> sourceMachineImage() {
        return this.sourceMachineImage;
    }
    /**
     * The list of tags attached to the instance.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return The list of tags attached to the instance.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * The unique fingerprint of the tags.
     * 
     */
    @Export(name="tagsFingerprint", type=String.class, parameters={})
    private Output<String> tagsFingerprint;

    /**
     * @return The unique fingerprint of the tags.
     * 
     */
    public Output<String> tagsFingerprint() {
        return this.tagsFingerprint;
    }
    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    @Export(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceFromMachineImage(String name) {
        this(name, InstanceFromMachineImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceFromMachineImage(String name, InstanceFromMachineImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceFromMachineImage(String name, InstanceFromMachineImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromMachineImage:InstanceFromMachineImage", name, args == null ? InstanceFromMachineImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceFromMachineImage(String name, Output<String> id, @Nullable InstanceFromMachineImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/instanceFromMachineImage:InstanceFromMachineImage", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static InstanceFromMachineImage get(String name, Output<String> id, @Nullable InstanceFromMachineImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceFromMachineImage(name, id, state, options);
    }
}
