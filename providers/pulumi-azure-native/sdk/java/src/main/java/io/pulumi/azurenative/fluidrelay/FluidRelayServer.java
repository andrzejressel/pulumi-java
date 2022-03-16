// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.fluidrelay.FluidRelayServerArgs;
import io.pulumi.azurenative.fluidrelay.outputs.FluidRelayEndpointsResponse;
import io.pulumi.azurenative.fluidrelay.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A FluidRelay Server.
 * API Version: 2021-03-12-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:fluidrelay:FluidRelayServer myFluidRelayServer /subscriptions/xxxx-xxxx-xxxx-xxxx/resourceGroups/myResourceGroup/Microsoft.FluidRelay/fluidRelayServers/myFluidRelayServer 
 * ```
 * 
 */
@ResourceType(type="azure-native:fluidrelay:FluidRelayServer")
public class FluidRelayServer extends io.pulumi.resources.CustomResource {
    /**
     * The Fluid Relay Service endpoints for this server.
     * 
     */
    @Export(name="fluidRelayEndpoints", type=FluidRelayEndpointsResponse.class, parameters={})
    private Output<FluidRelayEndpointsResponse> fluidRelayEndpoints;

    /**
     * @return The Fluid Relay Service endpoints for this server.
     * 
     */
    public Output<FluidRelayEndpointsResponse> getFluidRelayEndpoints() {
        return this.fluidRelayEndpoints;
    }
    /**
     * The Fluid tenantId for this server
     * 
     */
    @Export(name="frsTenantId", type=String.class, parameters={})
    private Output<String> frsTenantId;

    /**
     * @return The Fluid tenantId for this server
     * 
     */
    public Output<String> getFrsTenantId() {
        return this.frsTenantId;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provision states for FluidRelay RP
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return Provision states for FluidRelay RP
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * System meta data for this resource, including creation and modification information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System meta data for this resource, including creation and modification information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(FluidRelayServerArgs.Builder a);
    }
    private static io.pulumi.azurenative.fluidrelay.FluidRelayServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.fluidrelay.FluidRelayServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FluidRelayServer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FluidRelayServer(String name) {
        this(name, FluidRelayServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FluidRelayServer(String name, FluidRelayServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FluidRelayServer(String name, FluidRelayServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:fluidrelay:FluidRelayServer", name, args == null ? FluidRelayServerArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FluidRelayServer(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:fluidrelay:FluidRelayServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:fluidrelay/v20210312preview:FluidRelayServer").build()),
                Output.of(Alias.builder().type("azure-native:fluidrelay/v20210615preview:FluidRelayServer").build()),
                Output.of(Alias.builder().type("azure-native:fluidrelay/v20210830preview:FluidRelayServer").build()),
                Output.of(Alias.builder().type("azure-native:fluidrelay/v20210910preview:FluidRelayServer").build())
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
    public static FluidRelayServer get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FluidRelayServer(name, id, options);
    }
}
