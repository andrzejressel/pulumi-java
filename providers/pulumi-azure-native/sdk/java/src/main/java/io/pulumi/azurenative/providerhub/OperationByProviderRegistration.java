// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.providerhub.OperationByProviderRegistrationArgs;
import io.pulumi.azurenative.providerhub.outputs.OperationsDefinitionResponseDisplay;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2020-11-20.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:providerhub:OperationByProviderRegistration myresource1 /subscriptions/{subscriptionId}/providers/Microsoft.ProviderHub/providerRegistrations/{providerNamespace}/operations/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:providerhub:OperationByProviderRegistration")
public class OperationByProviderRegistration extends io.pulumi.resources.CustomResource {
    @Export(name="actionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> actionType;

    public Output</* @Nullable */ String> getActionType() {
        return this.actionType;
    }
    /**
     * Display information of the operation.
     * 
     */
    @Export(name="display", type=OperationsDefinitionResponseDisplay.class, parameters={})
    private Output<OperationsDefinitionResponseDisplay> display;

    /**
     * @return Display information of the operation.
     * 
     */
    public Output<OperationsDefinitionResponseDisplay> getDisplay() {
        return this.display;
    }
    /**
     * Indicates whether the operation applies to data-plane.
     * 
     */
    @Export(name="isDataAction", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDataAction;

    /**
     * @return Indicates whether the operation applies to data-plane.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsDataAction() {
        return this.isDataAction;
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
    @Export(name="origin", type=String.class, parameters={})
    private Output</* @Nullable */ String> origin;

    public Output</* @Nullable */ String> getOrigin() {
        return this.origin;
    }
    @Export(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    public Output<Object> getProperties() {
        return this.properties;
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
        public void apply(OperationByProviderRegistrationArgs.Builder a);
    }
    private static io.pulumi.azurenative.providerhub.OperationByProviderRegistrationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.providerhub.OperationByProviderRegistrationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public OperationByProviderRegistration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OperationByProviderRegistration(String name) {
        this(name, OperationByProviderRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OperationByProviderRegistration(String name, OperationByProviderRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OperationByProviderRegistration(String name, OperationByProviderRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:OperationByProviderRegistration", name, args == null ? OperationByProviderRegistrationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private OperationByProviderRegistration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:providerhub:OperationByProviderRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:providerhub/v20201120:OperationByProviderRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210501preview:OperationByProviderRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210601preview:OperationByProviderRegistration").build()),
                Output.of(Alias.builder().type("azure-native:providerhub/v20210901preview:OperationByProviderRegistration").build())
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
    public static OperationByProviderRegistration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OperationByProviderRegistration(name, id, options);
    }
}
