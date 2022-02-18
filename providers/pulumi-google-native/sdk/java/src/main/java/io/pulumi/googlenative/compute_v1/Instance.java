// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.InstanceArgs;
import io.pulumi.googlenative.compute_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.AdvancedMachineFeaturesResponse;
import io.pulumi.googlenative.compute_v1.outputs.AttachedDiskResponse;
import io.pulumi.googlenative.compute_v1.outputs.ConfidentialInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_v1.outputs.DisplayDeviceResponse;
import io.pulumi.googlenative.compute_v1.outputs.MetadataResponse;
import io.pulumi.googlenative.compute_v1.outputs.NetworkInterfaceResponse;
import io.pulumi.googlenative.compute_v1.outputs.NetworkPerformanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.compute_v1.outputs.SchedulingResponse;
import io.pulumi.googlenative.compute_v1.outputs.ServiceAccountResponse;
import io.pulumi.googlenative.compute_v1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.ShieldedInstanceIntegrityPolicyResponse;
import io.pulumi.googlenative.compute_v1.outputs.TagsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates an instance resource in the specified project using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/v1:Instance")
public class Instance extends io.pulumi.resources.CustomResource {
    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @OutputExport(name="advancedMachineFeatures", type=AdvancedMachineFeaturesResponse.class, parameters={})
    private Output<AdvancedMachineFeaturesResponse> advancedMachineFeatures;

    /**
     * @return Controls for advanced machine-related behavior features.
     * 
     */
    public Output<AdvancedMachineFeaturesResponse> getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     * Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    @OutputExport(name="canIpForward", type=Boolean.class, parameters={})
    private Output<Boolean> canIpForward;

    /**
     * @return Allows this instance to send and receive packets with non-matching destination or source IPs. This is required if you plan to use this instance to forward routes. For more information, see Enabling IP Forwarding .
     * 
     */
    public Output<Boolean> getCanIpForward() {
        return this.canIpForward;
    }
    @OutputExport(name="confidentialInstanceConfig", type=ConfidentialInstanceConfigResponse.class, parameters={})
    private Output<ConfidentialInstanceConfigResponse> confidentialInstanceConfig;

    public Output<ConfidentialInstanceConfigResponse> getConfidentialInstanceConfig() {
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
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Whether the resource should be protected against deletion.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output<Boolean> deletionProtection;

    /**
     * @return Whether the resource should be protected against deletion.
     * 
     */
    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    @OutputExport(name="disks", type=List.class, parameters={AttachedDiskResponse.class})
    private Output<List<AttachedDiskResponse>> disks;

    /**
     * @return Array of disks associated with this instance. Persistent disks must be created before you can assign them.
     * 
     */
    public Output<List<AttachedDiskResponse>> getDisks() {
        return this.disks;
    }
    /**
     * Enables display device for the instance.
     * 
     */
    @OutputExport(name="displayDevice", type=DisplayDeviceResponse.class, parameters={})
    private Output<DisplayDeviceResponse> displayDevice;

    /**
     * @return Enables display device for the instance.
     * 
     */
    public Output<DisplayDeviceResponse> getDisplayDevice() {
        return this.displayDevice;
    }
    /**
     * Specifies a fingerprint for this resource, which is essentially a hash of the instance's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Specifies a fingerprint for this resource, which is essentially a hash of the instance's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance. You must always provide an up-to-date fingerprint hash in order to update the instance. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    @OutputExport(name="guestAccelerators", type=List.class, parameters={AcceleratorConfigResponse.class})
    private Output<List<AcceleratorConfigResponse>> guestAccelerators;

    /**
     * @return A list of the type and count of accelerator cards attached to the instance.
     * 
     */
    public Output<List<AcceleratorConfigResponse>> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return Specifies the hostname of the instance. The specified hostname must be RFC1035 compliant. If hostname is not specified, the default hostname is [INSTANCE_NAME].c.[PROJECT_ID].internal when using the global DNS, and [INSTANCE_NAME].[ZONE].c.[PROJECT_ID].internal when using zonal DNS.
     * 
     */
    public Output<String> getHostname() {
        return this.hostname;
    }
    /**
     * Type of the resource. Always compute#instance for instances.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#instance for instances.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for this request, which is essentially a hash of the label's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for this request, which is essentially a hash of the label's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels. To see the latest fingerprint, make get() request to the instance.
     * 
     */
    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels to apply to this instance. These can be later modified by the setLabels method.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * Last start timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="lastStartTimestamp", type=String.class, parameters={})
    private Output<String> lastStartTimestamp;

    /**
     * @return Last start timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getLastStartTimestamp() {
        return this.lastStartTimestamp;
    }
    /**
     * Last stop timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="lastStopTimestamp", type=String.class, parameters={})
    private Output<String> lastStopTimestamp;

    /**
     * @return Last stop timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getLastStopTimestamp() {
        return this.lastStopTimestamp;
    }
    /**
     * Last suspended timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="lastSuspendedTimestamp", type=String.class, parameters={})
    private Output<String> lastSuspendedTimestamp;

    /**
     * @return Last suspended timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getLastSuspendedTimestamp() {
        return this.lastSuspendedTimestamp;
    }
    /**
     * Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    @OutputExport(name="machineType", type=String.class, parameters={})
    private Output<String> machineType;

    /**
     * @return Full or partial URL of the machine type resource to use for this instance, in the format: zones/zone/machineTypes/machine-type. This is provided by the client when the instance is created. For example, the following is a valid partial url to a predefined machine type: zones/us-central1-f/machineTypes/n1-standard-1 To create a custom machine type, provide a URL to a machine type in the following format, where CPUS is 1 or an even number up to 32 (2, 4, 6, ... 24, etc), and MEMORY is the total memory for this instance. Memory must be a multiple of 256 MB and must be supplied in MB (e.g. 5 GB of memory is 5120 MB): zones/zone/machineTypes/custom-CPUS-MEMORY For example: zones/us-central1-f/machineTypes/custom-4-5120 For a full list of restrictions, read the Specifications for custom machine types.
     * 
     */
    public Output<String> getMachineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    @OutputExport(name="metadata", type=MetadataResponse.class, parameters={})
    private Output<MetadataResponse> metadata;

    /**
     * @return The metadata key/value pairs assigned to this instance. This includes custom metadata and predefined keys.
     * 
     */
    public Output<MetadataResponse> getMetadata() {
        return this.metadata;
    }
    /**
     * Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
     * 
     */
    @OutputExport(name="minCpuPlatform", type=String.class, parameters={})
    private Output<String> minCpuPlatform;

    /**
     * @return Specifies a minimum CPU platform for the VM instance. Applicable values are the friendly names of CPU platforms, such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge".
     * 
     */
    public Output<String> getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    @OutputExport(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return An array of network configurations for this instance. These specify how interfaces are configured to interact with other network services, such as connecting to the internet. Multiple interfaces are supported per instance.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    @OutputExport(name="networkPerformanceConfig", type=NetworkPerformanceConfigResponse.class, parameters={})
    private Output<NetworkPerformanceConfigResponse> networkPerformanceConfig;

    public Output<NetworkPerformanceConfigResponse> getNetworkPerformanceConfig() {
        return this.networkPerformanceConfig;
    }
    /**
     * The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    @OutputExport(name="privateIpv6GoogleAccess", type=String.class, parameters={})
    private Output<String> privateIpv6GoogleAccess;

    /**
     * @return The private IPv6 google access type for the VM. If not specified, use INHERIT_FROM_SUBNETWORK as default.
     * 
     */
    public Output<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @OutputExport(name="reservationAffinity", type=ReservationAffinityResponse.class, parameters={})
    private Output<ReservationAffinityResponse> reservationAffinity;

    /**
     * @return Specifies the reservations that this instance can consume from.
     * 
     */
    public Output<ReservationAffinityResponse> getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Resource policies applied to this instance.
     * 
     */
    @OutputExport(name="resourcePolicies", type=List.class, parameters={String.class})
    private Output<List<String>> resourcePolicies;

    /**
     * @return Resource policies applied to this instance.
     * 
     */
    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * Reserved for future use.
     * 
     */
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Sets the scheduling options for this instance.
     * 
     */
    @OutputExport(name="scheduling", type=SchedulingResponse.class, parameters={})
    private Output<SchedulingResponse> scheduling;

    /**
     * @return Sets the scheduling options for this instance.
     * 
     */
    public Output<SchedulingResponse> getScheduling() {
        return this.scheduling;
    }
    /**
     * Server-defined URL for this resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for this resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    @OutputExport(name="serviceAccounts", type=List.class, parameters={ServiceAccountResponse.class})
    private Output<List<ServiceAccountResponse>> serviceAccounts;

    /**
     * @return A list of service accounts, with their specified scopes, authorized for this instance. Only one service account per VM instance is supported. Service accounts generate access tokens that can be accessed through the metadata server and used to authenticate applications on the instance. See Service Accounts for more information.
     * 
     */
    public Output<List<ServiceAccountResponse>> getServiceAccounts() {
        return this.serviceAccounts;
    }
    @OutputExport(name="shieldedInstanceConfig", type=ShieldedInstanceConfigResponse.class, parameters={})
    private Output<ShieldedInstanceConfigResponse> shieldedInstanceConfig;

    public Output<ShieldedInstanceConfigResponse> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    @OutputExport(name="shieldedInstanceIntegrityPolicy", type=ShieldedInstanceIntegrityPolicyResponse.class, parameters={})
    private Output<ShieldedInstanceIntegrityPolicyResponse> shieldedInstanceIntegrityPolicy;

    public Output<ShieldedInstanceIntegrityPolicyResponse> getShieldedInstanceIntegrityPolicy() {
        return this.shieldedInstanceIntegrityPolicy;
    }
    /**
     * Source machine image
     * 
     */
    @OutputExport(name="sourceMachineImage", type=String.class, parameters={})
    private Output<String> sourceMachineImage;

    /**
     * @return Source machine image
     * 
     */
    public Output<String> getSourceMachineImage() {
        return this.sourceMachineImage;
    }
    /**
     * Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    @OutputExport(name="sourceMachineImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceMachineImageEncryptionKey;

    /**
     * @return Source machine image encryption key when creating an instance from a machine image.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> getSourceMachineImageEncryptionKey() {
        return this.sourceMachineImageEncryptionKey;
    }
    /**
     * Whether a VM has been restricted for start because Compute Engine has detected suspicious activity.
     * 
     */
    @OutputExport(name="startRestricted", type=Boolean.class, parameters={})
    private Output<Boolean> startRestricted;

    /**
     * @return Whether a VM has been restricted for start because Compute Engine has detected suspicious activity.
     * 
     */
    public Output<Boolean> getStartRestricted() {
        return this.startRestricted;
    }
    /**
     * The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see Instance life cycle.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the instance. One of the following values: PROVISIONING, STAGING, RUNNING, STOPPING, SUSPENDING, SUSPENDED, REPAIRING, and TERMINATED. For more information about the status of the instance, see Instance life cycle.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    @OutputExport(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return An optional, human-readable explanation of the status.
     * 
     */
    public Output<String> getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
     * 
     */
    @OutputExport(name="tags", type=TagsResponse.class, parameters={})
    private Output<TagsResponse> tags;

    /**
     * @return Tags to apply to this instance. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during instance creation. The tags can be later modified by the setTags method. Each tag within the list must comply with RFC1035. Multiple tags can be specified via the 'tags.items' field.
     * 
     */
    public Output<TagsResponse> getTags() {
        return this.tags;
    }
    /**
     * URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    /**
     * @return URL of the zone where the instance resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
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
    public Instance(String name, @Nullable InstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Instance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Instance", name, null, makeResourceOptions(options, id));
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
