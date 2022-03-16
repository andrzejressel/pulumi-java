// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dynamics365fraudprotection;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dynamics365fraudprotection.InstanceDetailsArgs;
import io.pulumi.azurenative.dynamics365fraudprotection.outputs.DFPInstanceAdministratorsResponse;
import io.pulumi.azurenative.dynamics365fraudprotection.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents an instance of a DFP instance resource.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dynamics365fraudprotection:InstanceDetails azsdktest /subscriptions/613192d7-503f-477a-9cfe-4efc3ee2bd60/resourceGroups/TestRG/providers/Microsoft.Dynamics365Fraudprotection/instances/azsdktest 
 * ```
 * 
 */
@ResourceType(type="azure-native:dynamics365fraudprotection:InstanceDetails")
public class InstanceDetails extends io.pulumi.resources.CustomResource {
    /**
     * A collection of DFP instance administrators
     * 
     */
    @Export(name="administration", type=DFPInstanceAdministratorsResponse.class, parameters={})
    private Output</* @Nullable */ DFPInstanceAdministratorsResponse> administration;

    /**
     * @return A collection of DFP instance administrators
     * 
     */
    public Output</* @Nullable */ DFPInstanceAdministratorsResponse> getAdministration() {
        return this.administration;
    }
    /**
     * Location of the DFP resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the DFP resource.
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
     * The current deployment state of DFP resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment state of DFP resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
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
     * Key-value pairs of additional resource provisioning properties.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of additional resource provisioning properties.
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
        public void apply(InstanceDetailsArgs.Builder a);
    }
    private static io.pulumi.azurenative.dynamics365fraudprotection.InstanceDetailsArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.dynamics365fraudprotection.InstanceDetailsArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstanceDetails(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceDetails(String name) {
        this(name, InstanceDetailsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceDetails(String name, InstanceDetailsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceDetails(String name, InstanceDetailsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dynamics365fraudprotection:InstanceDetails", name, args == null ? InstanceDetailsArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InstanceDetails(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dynamics365fraudprotection:InstanceDetails", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dynamics365fraudprotection/v20210201preview:InstanceDetails").build())
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
    public static InstanceDetails get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceDetails(name, id, options);
    }
}
