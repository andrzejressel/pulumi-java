// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.VirtualNetworkArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Define the virtualNetwork.
 * API Version: 2020-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:connectedvmwarevsphere:VirtualNetwork ContosoAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.ConnectedVMwarevSphere/VirtualNetworks/ContosoAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:connectedvmwarevsphere:VirtualNetwork")
public class VirtualNetwork extends io.pulumi.resources.CustomResource {
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    @Export(name="customResourceName", type=String.class, parameters={})
    private Output<String> customResourceName;

    /**
     * @return Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    public Output<String> getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Gets or sets the inventory Item ID for the virtual network.
     * 
     */
    @Export(name="inventoryItemId", type=String.class, parameters={})
    private Output</* @Nullable */ String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual network.
     * 
     */
    public Output</* @Nullable */ String> getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the vCenter Managed Object name for the virtual network.
     * 
     */
    @Export(name="moName", type=String.class, parameters={})
    private Output<String> moName;

    /**
     * @return Gets or sets the vCenter Managed Object name for the virtual network.
     * 
     */
    public Output<String> getMoName() {
        return this.moName;
    }
    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     * 
     */
    @Export(name="moRefId", type=String.class, parameters={})
    private Output</* @Nullable */ String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual network.
     * 
     */
    public Output</* @Nullable */ String> getMoRefId() {
        return this.moRefId;
    }
    /**
     * Gets or sets the name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Gets or sets the name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
     */
    @Export(name="statuses", type=List.class, parameters={ResourceStatusResponse.class})
    private Output<List<ResourceStatusResponse>> statuses;

    /**
     * @return The resource status information.
     * 
     */
    public Output<List<ResourceStatusResponse>> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Gets or sets the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Gets or sets the type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Gets or sets a unique identifier for this resource.
     * 
     */
    public Output<String> getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    @Export(name="vCenterId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    public Output</* @Nullable */ String> getVCenterId() {
        return this.vCenterId;
    }

    public interface BuilderApplicator {
        public void apply(VirtualNetworkArgs.Builder a);
    }
    private static io.pulumi.azurenative.connectedvmwarevsphere.VirtualNetworkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.connectedvmwarevsphere.VirtualNetworkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public VirtualNetwork(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetwork(String name) {
        this(name, VirtualNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualNetwork", name, args == null ? VirtualNetworkArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private VirtualNetwork(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:connectedvmwarevsphere:VirtualNetwork", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:connectedvmwarevsphere/v20201001preview:VirtualNetwork").build())
            ))
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
    public static VirtualNetwork get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetwork(name, id, options);
    }
}
