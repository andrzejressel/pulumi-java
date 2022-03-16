// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.ManagedPrivateEndpointArgs;
import io.pulumi.azurenative.kusto.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Class representing a managed private endpoint.
 * API Version: 2021-08-27.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:kusto:ManagedPrivateEndpoint KustoClusterRPTest4/KustoDatabase8/kustomanagedPrivateEndpoint1 /subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Kusto/Clusters/KustoClusterRPTest4/ManagedPrivateEndpoints/kustoManagedPrivateEndpoint1 
 * ```
 * 
 */
@ResourceType(type="azure-native:kusto:ManagedPrivateEndpoint")
public class ManagedPrivateEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * The groupId in which the managed private endpoint is created.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The groupId in which the managed private endpoint is created.
     * 
     */
    public Output<String> getGroupId() {
        return this.groupId;
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
     * The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    @Export(name="privateLinkResourceId", type=String.class, parameters={})
    private Output<String> privateLinkResourceId;

    /**
     * @return The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    public Output<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }
    /**
     * The region of the resource to which the managed private endpoint is created.
     * 
     */
    @Export(name="privateLinkResourceRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateLinkResourceRegion;

    /**
     * @return The region of the resource to which the managed private endpoint is created.
     * 
     */
    public Output</* @Nullable */ String> getPrivateLinkResourceRegion() {
        return this.privateLinkResourceRegion;
    }
    /**
     * The provisioned state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioned state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The user request message.
     * 
     */
    @Export(name="requestMessage", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestMessage;

    /**
     * @return The user request message.
     * 
     */
    public Output</* @Nullable */ String> getRequestMessage() {
        return this.requestMessage;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
        public void apply(ManagedPrivateEndpointArgs.Builder a);
    }
    private static io.pulumi.azurenative.kusto.ManagedPrivateEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.kusto.ManagedPrivateEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedPrivateEndpoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedPrivateEndpoint(String name) {
        this(name, ManagedPrivateEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedPrivateEndpoint(String name, ManagedPrivateEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ManagedPrivateEndpoint", name, args == null ? ManagedPrivateEndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedPrivateEndpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:kusto:ManagedPrivateEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:kusto/v20210827:ManagedPrivateEndpoint").build())
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
    public static ManagedPrivateEndpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedPrivateEndpoint(name, id, options);
    }
}
